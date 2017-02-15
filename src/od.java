import java.awt.Graphics;

final class od extends ha {
	static jd jd_sb;
	static int tb;
	static int int_ub;
	static int vb;
	static int wb;
	static int yb = 0;
	static int zb;
	static boolean Ab = false;
	static boolean Bb = false;
	static int Cb;
	static rd loadingGameScreen2;
	static int Eb;
	static int Fb;
	private static rd loadingGameScreen = md.a((String) "Loading game screen )2 ", (byte) 117);

	static {
		loadingGameScreen2 = loadingGameScreen;
	}

	int xb;
	int Gb;

	static gb a (int unused, int index, pb cacheFile, int i) {
		try {
			++Eb;
			return !t.a(index, (byte) -122, i, cacheFile) ? null : ca.a(-22);
		} catch (RuntimeException var5) {
			throw id.a(var5, "od.D(" + unused + ',' + index + ',' + (cacheFile != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static void f (int var0) {
		try {
			++vb;

			try {
				if (var0 <= 13) {
					Ab = true;
				}

				Graphics graphics = rd.canvas.getGraphics();
				sb.jd_q.a(0, 550, 4, graphics);
			} catch (Exception var2) {
				rd.canvas.repaint();
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "od.C(" + var0 + ')');
		}
	}

	static void a (int unused, kb class_kb) {
		try {
			++Cb;
			bd.xc = class_kb;
		} catch (RuntimeException var3) {
			throw id.a(var3, "od.B(" + unused + ',' + (class_kb != null ? "{...}" : "null") + ')');
		}
	}

	public static void d (boolean var0) {
		try {
			loadingGameScreen2 = null;
			jd_sb = null;
			loadingGameScreen = null;
			if (!var0) {
				jd_sb = null;
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "od.E(" + var0 + ')');
		}
	}

	static void d (byte var0) {
		try {
			++tb;
			if (tc.K) {
				nd var1 = o.a((byte) -61, vc.C, lc.j);
				if (var1 != null && var1.Kc != null) {
					m.a(var1.Kc, 0, 0, 0, 37, null, var1);
				}

				if (var0 != -124) {
					loadingGameScreen = null;
				}

				tc.K = false;
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "od.A(" + var0 + ')');
		}
	}

	static void a (int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		try {
			++int_ub;
			if (var6 != 0) {
				a(-96, -31, null, -90);
			}

			if (var2 >= 1 && ~var7 <= -2 && var2 <= 102 && ~var7 >= -103) {
				if (jb.L && var5 != ce.plane) {
					return;
				}

				boolean var9 = true;
				int var8 = 0;
				boolean var10 = false;
				boolean var11 = false;
				if (~var0 == -1) {
					var8 = pc.o.p(var5, var2, var7);
				}

				if (~var0 == -2) {
					var8 = pc.o.c(var5, var2, var7);
				}

				if (var0 == 2) {
					var8 = pc.o.o(var5, var2, var7);
				}

				if (~var0 == -4) {
					var8 = pc.o.q(var5, var2, var7);
				}

				int var12;
				if (~var8 != -1) {
					int var15 = (var8 & 536866454) >> 14;
					var12 = pc.o.b(var5, var2, var7, var8);
					int var16 = var12 & 31;
					int var17 = 3 & var12 >> 6;
					bd var13;
					if (var0 == 0) {
						pc.o.f(var5, var2, var7);
						var13 = ub.a(-105, var15);
						if (var13.boolean_ib) {
							nd.xd[var5].b(var17, var16, var13.impenetrable, (byte) 111, var7, var2);
						}
					}

					if (~var0 == -2) {
						pc.o.m(var5, var2, var7);
					}

					if (~var0 == -3) {
						pc.o.e(var5, var2, var7);
						var13 = ub.a(var6 ^ -108, var15);
						if (~(var2 + var13.w) < -104 || var13.w + var7 > 103 || ~(var2 - -var13.h) < -104 || ~(var7 - -var13.h) < -104) {
							return;
						}

						if (var13.boolean_ib) {
							nd.xd[var5].a(var13.h, 0, var13.impenetrable, var17, var7, var13.w, var2);
						}
					}

					if (~var0 == -4) {
						pc.o.j(var5, var2, var7);
						var13 = ub.a(-114, var15);
						if (var13.boolean_ib && var13.Mb == 1) {
							nd.xd[var5].a(-4877, var2, var7);
						}
					}
				}

				if (var4 >= 0) {
					var12 = var5;
					if (~var5 > -4 && (2 & d.bytes_j[1][var2][var7]) == 2) {
						var12 = var5 + 1;
					}

					wa.a(var7, nd.xd[var5], var1, var4, var3, var2, var5, -57, var12, pc.o);
				}
			}

		} catch (RuntimeException var14) {
			throw id.a(var14, "od.G(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
		}
	}

	static int a (int val1, int val2) {
		try {
			return val1 & val2;
		} catch (RuntimeException var3) {
			throw id.a(var3, "od.H(" + val1 + ',' + val2 + ')');
		}
	}

	final ue c (byte var1) {
		try {
			if (var1 > -9) {
				loadingGameScreen2 = null;
			}

			++wb;
			return u.a(this.xb, false).a(this.Gb, -93);
		} catch (RuntimeException var3) {
			throw id.a(var3, "od.F(" + var1 + ')');
		}
	}
}
