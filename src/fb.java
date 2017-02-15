import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

final class fb extends Canvas {
	static rd doubleColon = md.a((String) "::", (byte) 117);
	static int int_b;
	static rd rd_c = md.a((String) "oder benutzen Sie eine andere Welt)3", (byte) 126);
	static int int_d;
	static int int_e;
	static int int_f;
	static int int_h;
	static rd rd_i = md.a((String) "Aus", (byte) 118);
	static rd rd_j = md.a((String) "Fertigkeit)2", (byte) 125);
	static int int_k;
	static int int_l;
	static int int_m = 0;
	static int int_o = -1;
	static rd ok2;
	static int int_q;
	private static rd ok = md.a((String) "Ok", (byte) 114);

	static {
		ok2 = ok;
	}

	private Component component_n;

	fb (Component component) {
		try {
			this.component_n = component;
		} catch (RuntimeException var3) {
			throw id.a(var3, "fb.<init>(" + (component != null ? "{...}" : "null") + ')');
		}
	}

	static le a (int fileId, int unused) {
		try {
			++int_k;
			le class_le = (le) tc.z.a((byte) -77, (long) fileId);
			if (class_le != null) {
				return class_le;
			} else {
				byte[] buffer = pe.archiveFile2.a(5, fileId, (byte) 66);
				class_le = new le();
				if (buffer != null) {
					class_le.a(new id(buffer), (byte) 81);
				}

				tc.z.a(-97, class_le, (long) fileId);
				return class_le;
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "fb.B(" + fileId + ',' + unused + ')');
		}
	}

	static int b (int val1, int val2) {
		try {
			return val1 | val2;
		} catch (RuntimeException var3) {
			throw id.a(var3, "fb.E(" + val1 + ',' + val2 + ')');
		}
	}

	static boolean a (int unused, g class_g, boolean flag, boolean unused2) {
		try {
			++int_e;
			return qc.a(class_g, true, flag);
		} catch (RuntimeException var5) {
			throw id.a(var5, "fb.F(" + unused + ',' + (class_g != null ? "{...}" : "null") + ',' + flag + ',' + unused2 + ')');
		}
	}

	static void a (int unused) {
		try {
			ie.a = new md();
			++int_b;
		} catch (RuntimeException var2) {
			throw id.a(var2, "fb.D(" + unused + ')');
		}
	}

	static int a (boolean unused, int i) {
		try {
			++int_h;
			return (i & 936946) >> 17;
		} catch (RuntimeException var3) {
			throw id.a(var3, "fb.G(" + unused + ',' + i + ')');
		}
	}

	static void a (boolean unused) {
		try {
			++int_l;
			if (p.z != null) {
				if (f.Ab >= 0) {
					if (r.T > 0) {
						tc.I += te.tb;
						p.z.a(tc.I, f.Ab, 14);
						--r.T;
						if (r.T == 0) {
							p.z.silence((byte) -12);
							f.Ab = -1;
							r.T = 20;
						}
					}
				} else {
					if (r.T > 0) {
						--r.T;
						if (r.T == 0) {
							if (jc.K == null) {
								p.z.a('\uffff', 256);
							} else {
								p.z.a('\uffff', ce.z);
								f.Ab = ce.z;
								p.z.a(client.loopInfinite, ce.z, (byte) -28, jc.K);
								jc.K = null;
							}

							tc.I = 0;
						}
					}
				}

				p.z.c(15299);
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "fb.C(" + unused + ')');
		}
	}

	public static void a (byte unused) {
		try {
			doubleColon = null;
			rd_j = null;
			ok2 = null;
			rd_i = null;
			rd_c = null;
			ok = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "fb.A(" + unused + ')');
		}
	}

	public final void update (Graphics graphics) {
		try {
			++int_q;
			this.component_n.update(graphics);
		} catch (RuntimeException var3) {
			throw id.a(var3, "fb.update(" + (graphics != null ? "{...}" : "null") + ')');
		}
	}

	public final void paint (Graphics graphics) {
		try {
			++int_d;
			this.component_n.paint(graphics);
		} catch (RuntimeException var3) {
			throw id.a(var3, "fb.paint(" + (graphics != null ? "{...}" : "null") + ')');
		}
	}
}
