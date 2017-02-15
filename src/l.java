import java.awt.Component;

final class l {
	static int int_e = 0;
	static rd i;
	static int int_j;
	static rd checkingForUpdates2;
	static rd m = md.a((String) "Mitteilung", (byte) 114);
	static jd o;
	static int int_s;
	static jd v;
	static int int_w;
	static rd y = md.a((String) "blinken2:", (byte) 121);
	static rd pleaseTryAgain2;
	static int C;
	static int E;
	static rd H;
	static rd I;
	static int incomingPacketSize;
	static int O;
	static rd welcomeToRunescape2;
	static int[] U;
	static rd X;
	static boolean[] Z;
	static rd gb;
	private static rd t = md.a((String) "Connecting to server)3)3)3", (byte) 127);
	private static rd welcomeToRunescape = md.a((String) "Welcome to RuneScape", (byte) 114);
	private static rd pleaseTryAgain = md.a((String) "Please try again)3", (byte) 125);
	private static rd Q;
	private static rd checkingForUpdates;
	private static rd bb;

	static {
		H = t;
		welcomeToRunescape2 = welcomeToRunescape;
		incomingPacketSize = 0;
		Q = md.a(" more options", (byte) 116);
		X = md.a(")3", (byte) 116);
		I = Q;
		O = 0;
		pleaseTryAgain2 = pleaseTryAgain;
		gb = md.a(" (X", (byte) 120);
		bb = md.a("slide:", (byte) 124);
		checkingForUpdates = md.a("Checking for updates )2 ", (byte) 115);
		checkingForUpdates2 = checkingForUpdates;
		i = bb;
	}

	int int_a;
	int b;
	byte[] c;
	int d;
	int[][] ints_f = new int[6][258];
	int int_g;
	int[] h = new int[6];
	int k;
	int n;
	int p;
	int q;
	int r;
	int u;
	byte x;
	byte[] z = new byte[256];
	int A;
	int[] D = new int[256];
	byte[] F = new byte[18002];
	int[] L = new int[257];
	boolean[] M = new boolean[16];
	int N = 0;
	byte[] P = new byte[18002];
	byte[] S = new byte[4096];
	boolean[] T = new boolean[256];
	int[][] V = new int[6][258];
	int[] W = new int[16];
	byte[][] Y = new byte[6][258];
	int cb = 0;
	int db;
	byte[] eb;
	int[][] fb = new int[6][258];
	int int_hb;

	static void a (int unused, f class_f) {
		try {
			++int_s;
			if (class_f.Xb != 0) {
				if (class_f.Kb != -1 && class_f.Kb < '耀') {
					b class_b = ta.Nb[class_f.Kb];
					if (class_b != null) {
						int i = class_f.x_ + -class_b.x_;
						int i1 = class_f.y_ + -class_b.y_;
						if (i != 0 || i1 != 0) {
							class_f.int_ac = (int) (325.949D * Math.atan2((double) i, (double) i1)) & 2047;
						}
					}
				}

				if (class_f.Kb >= 32768) {
					int i = -32768 + class_f.Kb;
					if (lc.n == i) {
						i = 2047;
					}

					td class_td = f.Lc[i];
					if (class_td != null) {
						int i1 = -class_td.x_ + class_f.x_;
						int i2 = class_f.y_ + -class_td.y_;
						if (i1 != 0 || i2 != 0) {
							class_f.int_ac = 2047 & (int) (Math.atan2((double) i1, (double) i2) * 325.949D);
						}
					}
				}

				if ((class_f.Cb != 0 || ~class_f.Lb != -1) && (class_f.Dc == 0 || class_f.Jb > 0)) {
					int i = class_f.y_ - (class_f.Lb - (jc.X + jc.X)) * 64;
					int i1 = class_f.x_ + -((-kd.int_w + class_f.Cb + -kd.int_w) * 64);
					if (i1 != 0 || i != 0) {
						class_f.int_ac = (int) (325.949D * Math.atan2((double) i1, (double) i)) & 2047;
					}

					class_f.Cb = 0;
					class_f.Lb = 0;
				}

				int i = 2047 & class_f.int_ac + -class_f.Bb;
				if (i == 0) {
					class_f.int_ic = 0;
				} else {
					++class_f.int_ic;
					if (i > 1024) {
						class_f.Bb -= class_f.Xb;
						boolean flag = true;
						if (class_f.Xb > i || 2048 + -class_f.Xb < i) {
							flag = false;
							class_f.Bb = class_f.int_ac;
						}

						if (class_f.int_lc == class_f.yb && (class_f.int_ic > 25 || flag)) {
							if (class_f.Gc != -1) {
								class_f.int_lc = class_f.Gc;
							} else {
								class_f.int_lc = class_f.xb;
							}
						}
					} else {
						class_f.Bb += class_f.Xb;
						boolean flag = true;
						if (class_f.Xb > i || i > -class_f.Xb + 2048) {
							class_f.Bb = class_f.int_ac;
							flag = false;
						}

						if (class_f.yb == class_f.int_lc && (class_f.int_ic > 25 || flag)) {
							if (class_f.int_sc != -1) {
								class_f.int_lc = class_f.int_sc;
							} else {
								class_f.int_lc = class_f.xb;
							}
						}
					}

					class_f.Bb &= 2047;
				}
			}
		} catch (RuntimeException var7) {
			throw id.a(var7, "l.D(" + unused + ',' + "{...}" + ')');
		}
	}

	static boolean a (byte var0, nd var1) {
		try {
			++int_j;
			int var2 = var1.Sb;
			if (ke.int_mb == 2) {
				if (var2 == 201) {
					kd.z = cf.enterNameOfFriendToAddToList2;
					wb.int_db = 0;
					kd.E = kd.rd_v;
					hb.int_d = 1;
					ad.boolean_v = true;
					w.h = true;
				}

				if (var2 == 202) {
					wb.int_db = 0;
					ad.boolean_v = true;
					w.h = true;
					hb.int_d = 2;
					kd.E = kd.rd_v;
					kd.z = ud.J;
				}
			}

			if (~var2 == -206) {
				e.int_mb = 250;
				return true;
			} else {
				if (var2 == 501) {
					ad.boolean_v = true;
					kd.z = ce.enterNameOfPlayerToAddToList2;
					hb.int_d = 4;
					w.h = true;
					wb.int_db = 0;
					kd.E = kd.rd_v;
				}

				if (~var2 == -503) {
					kd.z = td.td;
					ad.boolean_v = true;
					kd.E = kd.rd_v;
					hb.int_d = 5;
					wb.int_db = 0;
					w.h = true;
				}

				int var3;
				int var4;
				if (var2 >= 300 && var2 <= 313) {
					var3 = (var2 - 300) / 2;
					var4 = 1 & var2;
					s.ob.a(var4 == 1, var3, (byte) -85);
				}

				if (var2 >= 314 && ~var2 >= -324) {
					var3 = (-314 + var2) / 2;
					var4 = 1 & var2;
					s.ob.a(~var4 == -2, 112, var3);
				}

				if (var0 != -39) {
					return false;
				} else {
					if (~var2 == -325) {
						s.ob.a(false, -1);
					}

					if (var2 == 325) {
						s.ob.a(true, -1);
					}

					if (var2 == 326) {
						ie.writeStream.writeOpcode(var0 ^ -47, 5);
						s.ob.a(ie.writeStream, (byte) 109);
						++ec.int_b;
						return true;
					} else {
						if (~var2 == -621) {
							ce.boolean_s = !ce.boolean_s;
						}

						if (~var2 <= -602 && ~var2 >= -614) {
							te.d((byte) 99);
							if (~kd.C.b(-29348) < -1) {
								ie.writeStream.writeOpcode(var0 + 47, 235);
								ie.writeStream.writeLong(kd.C.i(var0 ^ -29449), 2);
								ie.writeStream.writeByte((byte) 98, var2 + -601);
								ie.writeStream.writeByte((byte) 99, !ce.boolean_s ? 0 : 1);
								++pd.F;
							}
						}

						return false;
					}
				}
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "l.C(" + var0 + ',' + "{...}" + ')');
		}
	}

	static void a (byte unused, Component component, boolean unused2, int unused3, g class_g) {
		try {
			++C;
			qb.mb = false;
			hc.sampleRate = 22050;
			ib.long_q = pa.c(0);
			try {
				fa class_fa = (fa) Class.forName("ve").newInstance();
				class_fa.a(component, 22050, false);
				class_fa.a(class_g, 2048);
				bc.t = class_fa;
			} catch (Throwable throwable) {
				try {
					oe class_oe = new oe(class_g);
					class_oe.a(component, 22050, false);
					class_oe.a(class_g, 16384);
					bc.t = class_oe;
				} catch (Throwable throwable1) {
					if (g.javaVendorProperty_a.toLowerCase().contains("microsoft")) {
						try {
							bc.t = new vb();
							hc.sampleRate = 8000;
							qb.mb = false;
							return;
						} catch (Throwable throwable2) {
							throwable2.printStackTrace();
						}
					}

					bc.t = new eb();
				}
			}
		} catch (RuntimeException var9) {
			throw id.a(var9, "l.A(" + unused + ',' + (component != null ? "{...}" : "null") + ',' + unused2 + ',' + unused3 + ',' + (class_g != null ? "{...}" : "null") + ')');
		}
	}

	static void a (int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		try {
			if (var4 == 2331) {
				++int_w;
				if (a.a(0, var7)) {
					td.a(122, ld.c[var7], 0, var0, var2, var5, var6, var1, 0, var3, -1, var8);
				}
			}
		} catch (RuntimeException var10) {
			throw id.a(var10, "l.F(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ')');
		}
	}

	static j a (boolean var0, int fileRequest) {
		try {
			++E;
			if (!var0) {
				return null;
			} else {
				j var2 = (j) j.Z.a((byte) -101, (long) fileRequest);
				if (var2 != null) {
					return var2;
				} else {
					byte[] var3 = tb.archiveFile2.a(13, fileRequest, (byte) 66);
					var2 = new j();
					var2.nb = fileRequest;
					if (var3 != null) {
						var2.a(2530, new id(var3));
					}

					j.Z.a(-74, var2, (long) fileRequest);
					return var2;
				}
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "l.E(" + var0 + ',' + fileRequest + ')');
		}
	}

	public static void a (boolean var0) {
		try {
			v = null;
			checkingForUpdates = null;
			pleaseTryAgain = null;
			o = null;
			bb = null;
			I = null;
			X = null;
			checkingForUpdates2 = null;
			i = null;
			if (!var0) {
				welcomeToRunescape2 = null;
				H = null;
				Z = null;
				t = null;
				U = null;
				gb = null;
				pleaseTryAgain2 = null;
				m = null;
				y = null;
				Q = null;
				welcomeToRunescape = null;
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "l.B(" + var0 + ')');
		}
	}
}
