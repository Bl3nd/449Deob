final class n extends jb {
	static int Z;
	static dd ab = new dd(64);
	static int bb;
	static int db;
	static int eb;
	static int fb;
	static int gb;
	static jd hb;
	static int jb;
	static int lb;
	static uc buffer = new uc(5000);
	static pc nb;
	static rd cb = md.a((String) "Classic", (byte) 126);
	static rd ib = md.a((String) "Name eingeben:", (byte) 115);
	static int ob = -1;
	static int qb = 0;
	static rd rb = md.a((String) "Begeben Sie sich in ein freies Gebiet)1 um", (byte) 119);
	static rd couldNotCompleteLogin2;
	static rd tb = md.a((String) "auf der Hautpseite)3", (byte) 123);
	private static rd couldNotCompleteLogin = md.a((String) "Could not complete login)3", (byte) 127);

	static {
		couldNotCompleteLogin2 = couldNotCompleteLogin;
	}

	int kb = 0;

	static void a (rd var0, rd var1, boolean var2, int var3) {
		int var5 = client.int_tb;

		try {
			if (~ta.Sb == 0) {
				w.h = true;
			}

			if (var2) {
				if (~var3 == -1 && ~b.int_ld != 0) {
					client.int_qb = 0;
					id.eb = var1;
				}

				int var4 = 99;
				if (var5 == 0 && var4 <= 0) {
					df.ints_i[0] = var3;
					df.rds_o[0] = var0;
					wd.j[0] = var1;
					++bb;
				} else {
					do {
						df.ints_i[var4] = df.ints_i[var4 + -1];
						df.rds_o[var4] = df.rds_o[var4 - 1];
						wd.j[var4] = wd.j[-1 + var4];
						--var4;
					} while (var4 > 0);

					df.ints_i[0] = var3;
					df.rds_o[0] = var0;
					wd.j[0] = var1;
					++bb;
				}
			}
		} catch (RuntimeException var6) {
			throw id.a(var6, "n.D(" + (var0 != null ? "{...}" : "null") + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
		}
	}

	public static void f (int var0) {
		try {
			rb = null;
			tb = null;
			cb = null;
			ab = null;
			if (var0 != -15421) {
				a(null, null, false, 17);
			}

			ib = null;
			nb = null;
			buffer = null;
			hb = null;
			couldNotCompleteLogin = null;
			couldNotCompleteLogin2 = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "n.B(" + var0 + ')');
		}
	}

	static void g (int unused) {
		try {
			++Z;
			if (e.int_mb > 0) {
				cc.c((byte) -61);
			} else {
				bd.a(false, 40);
				sa.hb = cc.ff_k;
				cc.ff_k = null;
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "n.A(" + unused + ')');
		}
	}

	final void a (id var1, byte var2) {
		int var4 = client.int_tb;

		try {
			if (var2 != -107) {
				ob = 32;
			}

			do {
				int var3 = var1.readUnsignedByte((byte) 116);
				if (var3 == 0) {
					break;
				}

				this.a(var2 + 107, var3, var1);
			} while (var4 == 0);

			++fb;
		} catch (RuntimeException var5) {
			throw id.a(var5, "n.C(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}

	private void a (int var1, int var2, id var3) {
		try {
			++gb;
			if (~var2 == -6) {
				this.kb = var3.readUnsignedLEShort(255);
			}

			if (var1 != 0) {
				buffer = null;
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "n.E(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
}
