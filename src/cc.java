final class cc {
	static id id_a;
	static int int_b;
	static int int_c;
	static rd offline2;
	static int int_e;
	static long[] longs_f = new long[200];
	static int int_g;
	static rd[] rds_h;
	static rd redstone1;
	static ff ff_k;
	static rd rd_l;
	static he[] headicons_pk;
	private static rd offline = md.a((String) "Offline", (byte) 127);

	static {
		offline2 = offline;
		rds_h = new rd[1000];
		redstone1 = md.a("redstone1", (byte) 126);
		rd_l = md.a(" zuerst von Ihrer Ignorieren)2Liste(Q", (byte) 119);
		id_a = new id(new byte[5000]);
	}

	static void a (byte unused) {
		try {
			tb.Hb.c(-123);
			++int_c;
		} catch (RuntimeException var2) {
			throw id.a(var2, "cc.A(" + unused + ')');
		}
	}

	public static void a (int unused) {
		try {
			ff_k = null;
			offline2 = null;
			longs_f = null;
			offline = null;
			rds_h = null;
			id_a = null;
			rd_l = null;
			headicons_pk = null;
			redstone1 = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "cc.D(" + unused + ')');
		}
	}

	static void b (byte unused) {
		try {
			++int_g;
			int i = -1;
			if (b.int_hd > i) {
				do {
					int size;
					if (i != -1) {
						size = r.R[i];
					} else {
						size = 2047;
					}

					td class_td = f.Lc[size];
					if (class_td != null) {
						qb.a(1, (byte) -74, class_td);
					}

					++i;
				} while (b.int_hd > i);
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "cc.B(" + unused + ')');
		}
	}

	static void c (byte unused) {
		try {
			if (ff_k != null) {
				ff_k.a(25830);
				ff_k = null;
			}

			u.g(-1);
			pc.o.c();
			++int_e;
			int plane = 0;
			while (plane < 4) {
				nd.xd[plane].a(-3390);
				++plane;
			}

			System.gc();
			ld.a(10, (byte) 13);
			mb.b = 0;
			b.dd = -1;
			r.e(-77);
			bd.a(false, 10);
		} catch (RuntimeException var3) {
			throw id.a(var3, "cc.C(" + unused + ')');
		}
	}
}
