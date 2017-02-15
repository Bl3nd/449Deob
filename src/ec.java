import java.awt.Frame;

final class ec {
	static int int_a;
	static int int_b;
	static int int_c;
	static int int_d;
	static int int_e;
	static int int_f;
	static dd dd_g = new dd(64);
	static int int_h;
	static int int_i = 0;
	static dd dd_j = new dd(500);
	static long long_k;
	static rd backleft1 = md.a((String) "backleft1", (byte) 116);
	static Frame frame_m;
	static int int_n;
	static long[] longs_o = new long[32];
	static ff ff_p;
	static int q = -1;
	static int[] ints_r = new int[]{0, -1, 0, 1};
	static rd rd_s = md.a((String) "Update)2Liste geladen)3", (byte) 114);

	public static void a (byte unused) {
		try {
			longs_o = null;
			dd_j = null;
			frame_m = null;
			ints_r = null;
			rd_s = null;
			ff_p = null;
			backleft1 = null;
			dd_g = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "ec.F(" + unused + ')');
		}
	}

	static void a (pb archiveFile8, pb archiveFile7, int unused, pb archiveFile3) {
		try {
			++int_f;
			ra.archiveFile8 = archiveFile8;
			ta.archiveFile7 = archiveFile7;
			eb.archiveFile3 = archiveFile3;
			ld.c = new nd[eb.archiveFile3.getLength((byte) -51)][];
			l.Z = new boolean[eb.archiveFile3.getLength((byte) -51)];
		} catch (RuntimeException var5) {
			throw id.a(var5, "ec.A(" + (archiveFile8 != null ? "{...}" : "null") + ',' + (archiveFile7 != null ? "{...}" : "null") + ',' + unused + ',' + (archiveFile3 != null ? "{...}" : "null") + ')');
		}
	}

	static byte[] a (byte unused, pb archiveFile6, int cacheId, int fileId, int i2) {
		try {
			++int_a;
			long fileRequest = (long) (cacheId * 37 + fileId) + (long) (cacheId << 16) + ((long) i2 << 32);
			if (gd.dd_c != null) {
				qb class_qb = (qb) gd.dd_c.a((byte) -77, fileRequest);
				if (class_qb != null) {
					return class_qb.ib;
				}
			}

			byte[] data = archiveFile6.a(cacheId, fileId, (byte) 66);
			if (data == null) {
				return null;
			} else {
				if (gd.dd_c != null) {
					gd.dd_c.a(-64, new qb(data), fileRequest);
				}

				return data;
			}
		} catch (RuntimeException var8) {
			throw id.a(var8, "ec.D(" + unused + ',' + (archiveFile6 != null ? "{...}" : "null") + ',' + cacheId + ',' + fileId + ',' + i2 + ')');
		}
	}

	static boolean a (int unused, int i, byte[] data, int i1) {
		try {
			++int_h;
			boolean flag = true;
			int fileRequest = -1;
			id class_id = new id(data);
			do {
				int i3 = class_id.readUnsignedSmart((byte) -61);
				if (i3 == 0) {
					break;
				}

				fileRequest += i3;
				int i4 = 0;
				boolean flag2 = false;
				while (true) {
					if (flag2) {
						int i5 = class_id.readUnsignedSmart((byte) -123);
						if (i5 == 0) {
							break;
						}

						class_id.readUnsignedByte((byte) 116);
						continue;
					}

					int i5 = class_id.readUnsignedSmart((byte) -85);
					if (i5 == 0) {
						break;
					}

					i4 += -1 + i5;
					int i6 = i4 & 63;
					int i7 = i4 >> 6 & 63;
					int i8 = class_id.readUnsignedByte((byte) 116) >> 2;
					int i9 = i7 + i;
					int i10 = i1 + i6;
					if (i9 > 0 && i10 > 0 && i9 < 103 && i10 < 103) {
						bd class_bd = ub.a(-110, fileRequest);
						if (i8 != 22 || !jb.L || class_bd.Mb != 0 || class_bd.Gb) {
							flag2 = true;
							if (class_bd.f(28385)) {
								continue;
							}

							++hc.kb;
							flag = false;
						}
					}
				}
			} while (true);

			return flag;
		} catch (RuntimeException var19) {
			throw id.a(var19, "ec.E(" + unused + ',' + i + ',' + (data != null ? "{...}" : "null") + ',' + i1 + ')');
		}
	}

	static void a (int unused) {
		try {
			++int_e;
			p class_p = (p) kd.j.c((byte) 120);
			if (class_p != null) {
				do {
					if (class_p.O > 0) {
						--class_p.O;
					}

					if (class_p.O != 0) {
						if (class_p.B > 0) {
							--class_p.B;
						}

						if (class_p.B == 0 && class_p.X >= 1 && class_p.J >= 1 && class_p.X <= 102 && class_p.J <= 102 && (class_p.W < 0 || mb.a(class_p.Y, -11090, class_p.W))) {
							od.a(class_p.E, class_p.M, class_p.X, class_p.Y, class_p.W, class_p.T, 0, class_p.J);
							class_p.B = -1;
							if (class_p.W == class_p.Z && class_p.Z == -1) {
								class_p.d(-26669);
							} else {
								if (class_p.Z == class_p.W && class_p.M == class_p.G && ~class_p.Q == ~class_p.Y) {
									class_p.d(-26669);
								}
							}
						}
					} else {
						if (class_p.Z < 0 || mb.a(class_p.Q, -11090, class_p.Z)) {
							od.a(class_p.E, class_p.G, class_p.X, class_p.Q, class_p.Z, class_p.T, 0, class_p.J);
							class_p.d(-26669);
						}
					}

					class_p = (p) kd.j.a((byte) -68);
				} while (class_p != null);
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "ec.B(" + unused + ')');
		}
	}

	static void a (int x, int unused, int y) {
		try {
			++int_d;
			md class_md = lc.s[ce.plane][x][y];
			if (class_md == null) {
				pc.o.d(ce.plane, x, y);
			} else {
				int i = -99999999;
				od class_od = null;
				for (od class_od2 = (od) class_md.c((byte) 94); class_od2 != null ; class_od2 = (od) class_md.a((byte) -68)) {
					hc class_hc = u.a(class_od2.xb, false);
					int i1 = class_hc.Yb;
					if (class_hc.gb == 1) {
						i1 *= 1 + class_od2.Gb;
					}

					if (i1 > i) {
						class_od = class_od2;
						i = i1;
					}
				}

				if (class_od == null) {
					pc.o.d(ce.plane, x, y);
				} else {
					class_md.a(0, class_od);
					od class_od2 = null;
					od class_od3 = (od) class_md.c((byte) 56);
					od class_od4 = null;
					int i1;
					for (i1 = 1610612736 + (y << 7) + x; class_od3 != null ; class_od3 = (od) class_md.a((byte) -68)) {
						if (class_od.xb != class_od3.xb) {
							if (class_od4 == null) {
								class_od4 = class_od3;
							}

							if (class_od4.xb != class_od3.xb && class_od2 == null) {
								class_od2 = class_od3;
							}
						}
					}

					pc.o.a(ce.plane, x, y, vc.a(ce.plane, x * 128 + 64, 128 * y + 64, (byte) 37), class_od, i1, class_od4, class_od2);
				}
			}
		} catch (RuntimeException var11) {
			throw id.a(var11, "ec.C(" + x + ',' + unused + ',' + y + ')');
		}
	}
}
