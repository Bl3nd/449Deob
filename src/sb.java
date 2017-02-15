import java.awt.Graphics;

abstract class sb {
	static int int_a = 0;
	static int int_b = 0;
	static int int_c;
	static rd rd_d = md.a((String) "leuchten1:", (byte) 120);
	static md md_e = new md();
	static rd rd_f = md.a((String) " x", (byte) 126);
	static rd rd_g = md.a((String) "Abbrechen", (byte) 114);
	static rd rd_h = md.a((String) "Wir vermuten)1 dass jemand Ihr Passwort kennt)3", (byte) 121);
	static rd rd_i = md.a((String) "Untersuchen", (byte) 116);
	static int int_j;
	static int[] ints_k = new int[500];
	static int int_l;
	static int[] ints_m;
	static rd rd_n = md.a((String) "Lade Spiel)2Fenster )2 ", (byte) 124);
	static int[] ints_o = new int[2048];
	static int int_p;
	static jd jd_q;
	static rd gelb_;
	static va va_s;
	static rd rd_u;
	private static rd rd_t = md.a((String) "flash2:", (byte) 119);

	static {
		rd_u = rd_t;
		gelb_ = md.a("gelb:", (byte) 117);
	}

	static void a (int var0) {
		try {
			if (var0 != -1) {
				md_e = null;
			}

			++int_l;
			ud.P = new pc(32);
		} catch (RuntimeException var2) {
			throw id.a(var2, "sb.C(" + var0 + ')');
		}
	}

	static boolean a (boolean var0, int var1, int var2) {
		try {
			if (var0) {
				rd_n = null;
			}

			++int_p;
			return ~(1 & var1 >> var2 + 1) != -1;
		} catch (RuntimeException var4) {
			throw id.a(var4, "sb.D(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}

	public static void b (int var0) {
		try {
			rd_h = null;
			md_e = null;
			ints_m = null;
			jd_q = null;
			gelb_ = null;
			rd_t = null;
			rd_n = null;
			ints_k = null;
			rd_i = null;
			rd_u = null;
			rd_d = null;
			if (var0 == -8635) {
				ints_o = null;
				va_s = null;
				rd_g = null;
				rd_f = null;
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "sb.K(" + var0 + ')');
		}
	}

	static void a (boolean var0) {
		try {
			client.b(ee.int_h, 0);
			++int_c;
			if (i.R != -1) {
				client.b(i.R, 0);
			}

			va.g = 0;
			if (!var0) {
				b(87);
			}

			wc.b.a(-1926);
			dd.ints_l = v.c(dd.ints_l);
			ic.a();
			wd.a(0, 503, 765, 0, false, 0, ee.int_h);
			if (~i.R != 0) {
				wd.a(0, 503, 765, 0, false, 0, i.R);
			}

			label26:
			{
				if (!s.ub) {
					je.a(var0);
					sa.h(-24413);
					if (client.int_tb == 0) {
						break label26;
					}
				}

				db.f(-7);
			}

			try {
				Graphics graphics = rd.canvas.getGraphics();
				wc.b.a(0, 0, 0, graphics);
			} catch (Exception var2) {
				rd.canvas.repaint();
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "sb.A(" + var0 + ')');
		}
	}

	static void d (int var0) {
		try {
			++int_j;
			if (~dd.int_q != -1) {
				gb var1 = ad.gb_a;
				int var2 = 0;
				if (le.updateTime != 0) {
					var2 = 1;
				}

				int var3 = 0;
				do {
					if (wd.j[var3] != null) {
						int var4 = df.ints_i[var3];
						rd var5 = df.rds_o[var3];
						byte var6 = 0;
						if (var5 != null && var5.b(27, ha.Z)) {
							var5 = var5.a(false, 5);
							var6 = 1;
						}

						if (var5 != null && var5.b(27, le.rd_ab)) {
							var5 = var5.a(false, 5);
							var6 = 2;
						}

						int var7;
						if ((var4 == 3 || var4 == 7) && (~var4 == -8 || ub.privateChatStatus == 0 || ub.privateChatStatus == 1 && db
								.a((byte) 32, var5))) {
							var7 = -(13 * var2) + 329;
							++var2;
							byte var8 = 4;
							var1.b(kb.h, var8, var7, 0);
							var1.b(kb.h, var8, var7 - 1, '\uffff');
							int var11 = var8 + var1.b(kb.h);
							var11 += var1.f(32);
							if (var6 == 1) {
								qe.mod_icons[0].a(var11, var7 + -12);
								var11 += 14;
							}

							if (var6 == 2) {
								qe.mod_icons[1].a(var11, -12 + var7);
								var11 += 14;
							}

							var1.b(pc.a((byte) 127, new rd[]{var5, vc.colon_, wd.j[var3]}), var11, var7, 0);
							var1.b(pc.a((byte) 125, new rd[]{
									var5,
									vc.colon_,
									wd.j[var3]
							}), var11, -1 + var7, '\uffff');
							if (~var2 <= -6) {
								return;
							}
						}

						if (~var4 == -6 && ub.privateChatStatus < 2) {
							var7 = -(var2 * 13) + 329;
							++var2;
							var1.b(wd.j[var3], 4, var7, 0);
							var1.b(wd.j[var3], 4, -1 + var7, '\uffff');
							if (~var2 <= -6) {
								return;
							}
						}

						if (~var4 == -7 && ub.privateChatStatus < 2) {
							var7 = -(13 * var2) + 329;
							var1.b(pc.a((byte) 127, new rd[]{
									ce.to2,
									wa.lb,
									var5,
									vc.colon_,
									wd.j[var3]
							}), 4, var7, 0);
							++var2;
							var1.b(pc.a((byte) 125, new rd[]{
									ce.to2,
									wa.lb,
									var5,
									vc.colon_,
									wd.j[var3]
							}), 4, -1 + var7, '\uffff');
							if (~var2 <= -6) {
								return;
							}
						}
					}

					++var3;
				} while (var3 < 100);

				if (var0 != -12) {
					d(9);
				}
			}
		} catch (RuntimeException var10) {
			throw id.a(var10, "sb.I(" + var0 + ')');
		}
	}

	abstract void a (int var1, int var2, int unused);

	abstract void silence (byte unused);

	abstract void c (int unused);

	abstract void a (boolean loopInfinite, int var2, byte var3, byte[] var4);

	abstract void e (int unused);

	abstract void a (int unused, int var2);
}
