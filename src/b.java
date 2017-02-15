@SuppressWarnings("Duplicates")
final class b extends f {
	static bb cacheDat2;
	static int Yc;
	static int Zc;
	static rd rd_ad = md.a((String) "Handel akzeptieren", (byte) 127);
	static rd rd_bd = md.a((String) "Bitte entfernen Sie ", (byte) 116);
	static int int_cd;
	static int dd = -1;
	static int int_ed = 0;
	static long long_fd;
	static rd[] rds_gd = new rd[100];
	static int int_hd = 0;
	static volatile int int_id = 0;
	static int int_jd;
	static rd rd_kd = md.a((String) "Regeln versto-8en hat)3", (byte) 124);
	static int int_ld = -1;
	static rd rd_nd = md.a((String) "auf einer freien Welt zu spielen)3", (byte) 116);
	static int[] ints_od;
	tb tb_md;

	public static void g (byte unused) {
		try {
			rd_ad = null;
			rd_nd = null;
			rds_gd = null;
			ints_od = null;
			rd_kd = null;
			rd_bd = null;
			cacheDat2 = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "b.C(" + unused + ')');
		}
	}

	static boolean a (int unused, int i) {
		try {
			++Yc;
			return (i >> 30 & 1) != 0;
		} catch (RuntimeException var3) {
			throw id.a(var3, "b.B(" + unused + ',' + i + ')');
		}
	}

	final boolean d (byte unused) {
		try {
			++Zc;
			return this.tb_md != null;
		} catch (RuntimeException var3) {
			throw id.a(var3, "b.A(" + unused + ')');
		}
	}

	@SuppressWarnings("ConstantConditions")
	final ue c (byte unused) {
		try {
			++int_jd;
			if (this.tb_md == null) {
				return null;
			} else {
				e class_e = super.zc != -1 && super.Gb == 0 ? bd.a(super.zc, false) : null;
				e class_e2 = super.int_lc != -1 && (super.int_lc != super.yb || class_e == null) ? bd.a(super.int_lc, false) : null;
				ue class_ue = this.tb_md.a(super.Fb, class_e, super.int_tb, (byte) 24, class_e2);
				if (class_ue == null) {
					return null;
				} else {
					class_ue.d();
					super.int_vc = class_ue.int_qb;
					if (super.Wb != -1 && super.int_tc != -1) {
						ue class_ue2 = l.a(true, super.Wb).b(-1565796086, super.int_tc);
						if (class_ue2 != null) {
							class_ue2.b(0, -super.int_gc, 0);
							ue[] var6 = new ue[]{class_ue, class_ue2};
							class_ue = new ue(var6, 2);
						}
					}

					if (this.tb_md.Mb == 1) {
						class_ue.Db = true;
					}

					return class_ue;
				}
			}
		} catch (RuntimeException var7) {
			throw id.a(var7, "b.F(" + unused + ')');
		}
	}
}
