import java.applet.Applet;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Random;

public class g implements Runnable {
	public static String javaVendorProperty_a;
	public static String javaVersionProperty_g;
	public static int int_i = 3;
	public static Method setFocusTraversalKeysEnabled_p;
	public static Method setFocusCycleRoot_t;
	private static String user_home_m;
	public Applet applet_b = null;
	public int uid = 0;
	public File file_e = null;
	public ne cacheDat2_f = null;
	public ne[] cacheIDXIndices_j;
	public ne cacheIDX255 = null;
	private ma ma_d = null;
	private File file_h = null;
	private hd hd_k;
	private InetAddress inetAddress_n;
	private ma ma_o = null;
	private Thread thread_q;
	private ed ed_r;
	private boolean boolean_s = false;

	public g (boolean loadCache, Applet applet, InetAddress inetAddress, int fileStore, String s, int loadIdxCount) {
		this.applet_b = applet;
		javaVersionProperty_g = "1.1";
		this.inetAddress_n = inetAddress;
		javaVendorProperty_a = "Unknown";

		try {
			javaVendorProperty_a = System.getProperty("java.vendor");
			javaVersionProperty_g = System.getProperty("java.version");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			user_home_m = System.getProperty("user.home");
			if (user_home_m != null) {
				user_home_m = user_home_m + "/";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (user_home_m == null) {
			user_home_m = "~/";
		}

		try {
			if (applet == null) {
				setFocusTraversalKeysEnabled_p = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				setFocusTraversalKeysEnabled_p = applet.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			if (applet != null) {
				setFocusCycleRoot_t = applet.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				setFocusCycleRoot_t = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (loadCache) {
			this.a(fileStore, loadIdxCount, s, (byte) -86);
		}

		this.boolean_s = false;
		this.thread_q = new Thread(this);
		this.thread_q.setPriority(10);
		this.thread_q.setDaemon(true);
		this.thread_q.start();
	}

	@SuppressWarnings("unused")
	public final void a (int unused) {
		synchronized (this) {
			this.boolean_s = true;
			this.notifyAll();
		}

		try {
			this.thread_q.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if (this.hd_k != null) {
			this.hd_k.a(false);
		}

		if (this.cacheDat2_f != null) {
			try {
				this.cacheDat2_f.close(124);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		if (this.cacheIDX255 != null) {
			try {
				this.cacheIDX255.close(117);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		int idx;
		if (this.cacheIDXIndices_j != null) {
			for (idx = 0; this.cacheIDXIndices_j.length > idx ; ++idx) {
				if (this.cacheIDXIndices_j[idx] != null) {
					try {
						this.cacheIDXIndices_j[idx].close(77);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	@SuppressWarnings("unused")
	public final ma a (int unused, int i) {
		return this.a(i, null, 99, 0, 3);
	}

	@SuppressWarnings("unused")
	public final ma a (Class[] clazz, String s, int unused, Class clazz2) {
		return this.a(0, new Object[]{clazz2, s, clazz}, 76, 0, 9);
	}

	@SuppressWarnings({"unused", "SameParameterValue"})
	private ma a (int port, Object o, int unused, int unused2, int priority) {
		ma class_ma = new ma();
		class_ma.d = priority;
		class_ma.a = o;
		class_ma.e = port;
		synchronized (this) {
			if (this.ma_d == null) {
				this.ma_d = this.ma_o = class_ma;
			} else {
				this.ma_d.b = class_ma;
				this.ma_d = class_ma;
			}

			this.notify();
		}

		return class_ma;
	}

	@SuppressWarnings("unused")
	public final hd b (int unused) {
		return this.hd_k;
	}

	@SuppressWarnings("unused")
	public final ma b (int unused, int i) {
		return this.a(i, null, -112, 0, 1);
	}

	@SuppressWarnings("unused")
	private void a (int fileStore, int idxCount, String s, byte unused) {
		if (fileStore < 32 || fileStore > 34) {
			fileStore = 32;
		}

		String[] parentDir = new String[]{"./data/cache/", /*"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", "/tmp/", user_home_m,*/ ""};
		String[] childDir = new String[]{".jagex_cache_" + fileStore, ".file_store_" + fileStore};
		boolean fileExists = false;
		for (int childDirCount = 0 ; childDirCount < 2 ; ++childDirCount) {
			for (String aChildDir : childDir) {
				for (String parent : parentDir) {
					try {
						if (parent.length() > 0 && !(new File(parent)).exists()) {
							continue;
						}

						File parentFile = new File(parent + aChildDir);
						boolean createdDir;
						if (childDirCount == 1 && !parentFile.exists()) {
							createdDir = parentFile.mkdir();
							if (!createdDir) {
								continue;
							}
						}

						int idx;
						if (!fileExists) {
							try {
								File uidFile = new File(parentFile, "uid.dat");
								if (childDirCount == 1 && (!uidFile.exists() || uidFile.length() < 4L)) {
									Random random = new Random();

									int uidValue;

									for (uidValue = -1; uidValue == -1 ; uidValue = random.nextInt()) {}

									System.out.println("Creating UID - uid value: " + uidValue);

									DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(uidFile));
									dataOutputStream.writeInt(uidValue);
									dataOutputStream.close();
								}

								if (uidFile.exists()) {
									fileExists = true;
									DataInputStream dataInputStream = new DataInputStream(new FileInputStream(uidFile));
									this.uid = 1 + dataInputStream.readInt();
									System.out.println("Current UID - uid value: " + this.uid);
									dataInputStream.close();
								}
							} catch (Exception e) {
								e.printStackTrace();
							}
						}

						if (this.file_h == null) {
							try {
								parentFile = new File(parentFile, s);
								if (childDirCount == 1 && !parentFile.exists()) {
									createdDir = parentFile.mkdir();
									if (!createdDir) {
										continue;
									}
								}

								File datFile = new File(parentFile, "main_file_cache.dat2");
								if (childDirCount == 0 && !datFile.exists()) {
									continue;
								}

								this.cacheDat2_f = new ne(datFile, "rw", 52428800L);
								this.cacheIDXIndices_j = new ne[idxCount];

								for (idx = 0; idx < idxCount ; ++idx) {
									this.cacheIDXIndices_j[idx] = new ne(new File(parentFile, "main_file_cache.idx" + idx), "rw", 1048576L);
								}

								this.cacheIDX255 = new ne(new File(parentFile, "main_file_cache.idx255"), "rw", 1048576L);
								this.file_e = this.file_h = parentFile;
							} catch (Exception e) {
								try {
									this.cacheDat2_f.close(16);

									for (int id = 0 ; idxCount > id ; ++id) {
										this.cacheIDXIndices_j[id].close(64);
									}

									this.cacheIDX255.close(52);
								} catch (Exception e1) {
									e1.printStackTrace();
								}

								this.cacheIDXIndices_j = null;
								this.file_e = this.file_h = null;
								this.cacheDat2_f = this.cacheIDX255 = null;
							}
						}
					} catch (Exception e2) {
						e2.printStackTrace();
					}

					if (fileExists && this.file_h != null) {
						return;
					}
				}
			}
		}

		if (this.file_h == null) {
			throw new RuntimeException();
		}
	}

	@SuppressWarnings("unused")
	public final ma a (Class clazz, byte unused, String s) {
		return this.a(0, new Object[]{clazz, s}, 73, 0, 10);
	}

	@SuppressWarnings("unused")
	public final ma c (int unused) {
		return null;
	}

	@SuppressWarnings("unused")
	public final ma a (int unused, URL url) {
		return this.a(0, url, -125, 0, 4);
	}

	public final void run () {
		while (true) {
			ma class_ma;
			synchronized (this) {
				label114:
				{
					while (!this.boolean_s) {
						if (this.ma_o != null) {
							class_ma = this.ma_o;
							this.ma_o = this.ma_o.b;
							if (this.ma_o == null) {
								this.ma_d = null;
							}
							break label114;
						}

						try {
							this.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}

					return;
				}
			}

			try {
				int i = class_ma.d;
				if (i != 1) {
					if (i != 2) {
						if (i != 4) {
							Object[] objects;
							if (i != 9) {
								if (i == 10) {
									objects = (Object[]) class_ma.a;
									class_ma.c = ((Class) objects[0]).getDeclaredField((String) objects[1]);
								} else {
									throw new Exception();
								}
							} else {
								objects = (Object[]) class_ma.a;
								//noinspection unchecked
								class_ma.c = ((Class) objects[0]).getDeclaredMethod((String) objects[1], (Class[]) objects[2]);
							}
						} else {
							class_ma.c = new DataInputStream(((URL) class_ma.a).openStream());
						}
					} else {
						Thread thread = new Thread((Runnable) class_ma.a);
						thread.setDaemon(true);
						thread.start();
						thread.setPriority(class_ma.e);
						class_ma.c = thread;
					}
				} else {
					class_ma.c = new Socket(this.inetAddress_n, class_ma.e);
				}

				class_ma.f = 1;
			} catch (Exception e) {
				class_ma.f = 2;
				e.printStackTrace();
			}
		}
	}

	@SuppressWarnings("unused")
	public final ma a (int port, byte unused, Runnable runnable) {
		return this.a(port, runnable, -95, 0, 2);
	}

	@SuppressWarnings("unused")
	public final ed a (byte unused) {
		return this.ed_r;
	}
}
