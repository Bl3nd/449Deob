final class ld {
	static int modeWhat_a = 0;
	static int b;
	static nd[][] c;
	static int d;
	static int e;
	static int int_f;
	static int g;
	static rd h;
	static int i;
	static rd sideicons = md.a((String) "sideicons", (byte) 127);
	static int k;
	static int l;
	static int m;
	static int n;
	static int[] ints_o = new int[5];
	static int q;
	private static rd p = md.a((String) "World", (byte) 122);

	static {
		h = p;
	}

	public static void a (byte var0) {
		try {
			ints_o = null;
			p = null;
			if (var0 != 4) {
				a(106, null, 108, true, 35, 42, null, null);
			}

			sideicons = null;
			c = null;
			h = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "ld.H(" + var0 + ')');
		}
	}

	static synchronized void a (int var0, int var1, boolean var2, pb var3, int var4, int var5, byte var6) {
		try {
			++q;
			if (uc.n(-71)) {
				f.boolean_bc = true;
				hb.int_e = var4;
				dd.archiveFile6 = var3;
				be.int_j = var5;
				if (var6 != 124) {
					a(19, false, -12, 89, 72, -109, null, -73);
				}

				hb.int_i = -1;
				ib.j = var1;
				f.cc = -1;
				pc.int_p = var0;
				s.lb = var2;
			}
		} catch (RuntimeException var8) {
			throw id.a(var8, "ld.J(" + var0 + ',' + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + var4 + ',' + var5 + ',' + var6 + ')');
		}
	}

	static synchronized void a (int unused, pb archiveFile6, int i, boolean unused2, int unused3, int unused4, rd scape_main, rd class_rd) {
		try {
			++d;
			if (uc.n(-56)) {
				int index = archiveFile6.a(scape_main, (byte) -115);
				int i1 = archiveFile6.a(class_rd, -31757, index);
				a(i, false, 0, -5, 10, i1, archiveFile6, index);
			}
		} catch (RuntimeException var10) {
			throw id.a(var10, "ld.E(" + unused + ',' + (archiveFile6 != null ? "{...}" : "null") + ',' + i + ',' + unused2 + ',' + unused3 + ',' + unused4 + ',' + (scape_main != null ? "{...}" : "null") + ',' + (class_rd != null ? "{...}" : "null") + ')');
		}
	}

	static synchronized void a (int i, boolean unused, int unused2, int unused3, int unused4, int i1, pb archiveFile6, int index) {
		try {
			++n;
			if (uc.n(-66)) {
				s.lb = false;
				hb.int_i = 10;
				be.int_j = i;
				ib.j = index;
				f.cc = -1;
				pc.int_p = i1;
				f.boolean_bc = true;
				dd.archiveFile6 = archiveFile6;
				hb.int_e = 0;
			}
		} catch (RuntimeException var9) {
			throw id.a(var9, "ld.G(" + i + ',' + unused + ',' + unused2 + ',' + unused3 + ',' + unused4 + ',' + i1 + ',' + (archiveFile6 != null ? "{...}" : "null") + ',' + index + ')');
		}
	}

	static synchronized void a (int var0) {
		try {
			++e;
			if (uc.n(-127)) {
				ce.b(87);
				f.boolean_bc = false;
				if (var0 >= -113) {
					a(-33, (byte) -1);
				}

				dd.archiveFile6 = null;
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "ld.A(" + var0 + ')');
		}
	}

	static synchronized void a (int i, byte unused) {
		try {
			++b;
			if (uc.n(-112)) {
				sd.a(i, 17923);//?
				dd.archiveFile6 = null;
				f.boolean_bc = false;
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "ld.C(" + i + ',' + unused + ')');
		}
	}

	static synchronized void b (byte var0) {
		try {
			s.c((byte) -87);
			if (var0 == -104) {
				++m;
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "ld.I(" + var0 + ')');
		}
	}

	static void a (int unused, ke class_ke, int pointer) {
		try {
			++l;
			if (nb.s != null) {
				nb.s.pointer = 4 * pointer + 5;
				int i = nb.s.readInt((byte) -80);
				class_ke.e(-30004, i);
			} else {
				u.a(null, 255, 0, (byte) -16, 255, (byte) 0, true);
				td.Id[pointer] = class_ke;
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "ld.B(" + unused + ',' + (class_ke != null ? "{...}" : "null") + ',' + pointer + ')');
		}
	}

	static void a (byte var0, int var1, he var2, int var3) {
		try {
			++int_f;
			if (var2 != null) {
				int var4 = ka.Kb + o.w & 2047;
				int var5 = var3 * var3 + var1 * var1;
				if (var5 <= 6400) {
					if (var0 < 94) {
						a(-84, null, 61);
					}

					int var6 = v.pb[var4];
					var6 = 256 * var6 / (256 + gf.int_j);
					int var7 = v.wb[var4];
					var7 = var7 * 256 / (256 + gf.int_j);
					int var8 = var6 * var1 + var3 * var7 >> 16;
					int var9 = var1 * var7 + -(var6 * var3) >> 16;
					if (~var5 >= -2501) {
						var2.a(4 + -(var2.lb / 2) + 94 - -var8, -var9 + 83 + (-(var2.kb / 2) - 4));
					} else {
						var2.a(h.l, 4 + -(var2.lb / 2) + var8 + 94, -4 + (83 - (var9 + var2.kb / 2)));
					}
				}
			}
		} catch (RuntimeException var10) {
			throw id.a(var10, "ld.F(" + var0 + ',' + var1 + ',' + "{...}" + ',' + var3 + ')');
		}
	}

	static synchronized void c (byte unused) {
		try {
			++k;
			if (uc.n(-114)) {
				if (f.boolean_bc) {
					byte[] var1 = ec.a((byte) -115, dd.archiveFile6, ib.j, pc.int_p, hb.int_e);
					if (var1 != null) {
						if (hb.int_i < 0) {
							if (f.cc < 0) {
								ja.a((byte) -105, be.int_j, var1, s.lb);
							} else {
								lc.a(-35, be.int_j, var1, s.lb, f.cc);
							}
						} else {
							wb.a(be.int_j, 1, var1, hb.int_i, s.lb);
						}

						dd.archiveFile6 = null;
						f.boolean_bc = false;
					}
				}

				fb.a(true);
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "ld.D(" + unused + ')');
		}
	}
}
