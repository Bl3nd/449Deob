final class s extends jb {
	static int Z;
	static rd bb;
	static jd db;
	static boolean eb = false;
	static ke cacheFile7;
	static int hb;
	static int ib;
	static pb archiveFile7;
	static rd kb = md.a((String) "bevor Sie den Vorgang wiederholen)3", (byte) 122);
	static boolean lb;
	static int int_nb;
	static o ob;
	static int pb;
	static long long_qb = 0L;
	static rd mem_;
	static int sb;
	static int tb;
	static boolean ub;
	static dd vb;
	static rd[] wb;
	static int[] xb;
	static int[] yb;
	static int zb;
	static dd Ab;
	private static rd rd_ab = md.a((String) "glow3:", (byte) 120);

	static {
		bb = rd_ab;
		mem_ = md.a("Mem:", (byte) 121);
		ob = new o();
		ub = false;
		wb = new rd[5];
		vb = new dd(100);
		yb = new int[128];
		zb = 0;
		Ab = new dd(200);
	}

	int cb;
	int gb;
	int int_mb;

	public static void f (int var0) {
		try {
			if (var0 > -6) {
				db = null;
			}

			xb = null;
			db = null;
			kb = null;
			cacheFile7 = null;
			ob = null;
			archiveFile7 = null;
			bb = null;
			rd_ab = null;
			wb = null;
			Ab = null;
			vb = null;
			yb = null;
			mem_ = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "s.D(" + var0 + ')');
		}
	}

	static void c (byte var0) {
		try {
			++pb;
			if (p.z != null) {
				if (var0 > -52) {
					c((byte) -27);
				}

				ce.b(127);
				if (r.T > 0) {
					p.z.a('\uffff', 256);
					r.T = 0;
				}

				p.z.e(125);
				p.z = null;
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "s.E(" + var0 + ')');
		}
	}

	static boolean a (nd var0, byte var1) {
		int var3 = client.int_tb;

		try {
			++int_nb;
			int var2 = var0.Sb;
			if (var1 != 118) {
				return false;
			} else if ((~var2 > -2 || var2 > 200) && (var2 < 701 || var2 > 900)) {
				if (var2 >= 401 && var2 <= 500) {
					ab.a(0, pc.a((byte) 126, new rd[]{u.whiteText, var0.rd_ub}), 0, (byte) 126, 21, nb.b, 0);
					++ke.fb;
					return true;
				} else {
					return false;
				}
			} else {
				label65:
				{
					++qb.cb;
					++mb.int_a;
					if (~var2 <= -802) {
						var2 -= 701;
						if (var3 == 0) {
							break label65;
						}
					}

					if (var2 >= 701) {
						var2 -= 601;
						if (var3 == 0) {
							break label65;
						}
					}

					if (var2 < 101) {
						--var2;
						if (var3 == 0) {
							break label65;
						}
					}

					var2 -= 101;
				}

				ab.a(0, pc.a((byte) 127, new rd[]{u.whiteText, ad.rds_k[var2]}), 0, (byte) 122, 9, nb.b, 0);
				ab.a(0, pc.a((byte) 125, new rd[]{u.whiteText, ad.rds_k[var2]}), 0, (byte) 123, 40, sa.Z, 0);
				return true;
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "s.C(" + "{...}" + ',' + var1 + ')');
		}
	}

	static boolean a (byte var0, int var1) {
		try {
			if (var0 != 116) {
				c((byte) -55);
			}

			++hb;
			return (var1 & 1) != 0;
		} catch (RuntimeException var3) {
			throw id.a(var3, "s.F(" + var0 + ',' + var1 + ')');
		}
	}

	private void a (int var1, int var2, id var3) {
		try {
			if (var1 != 21) {
				a((byte) -27, 112);
			}

			++ib;
			if (~var2 == -2) {
				this.int_mb = var3.readUnsignedLEShort(255);
				this.cb = var3.readUnsignedByte((byte) 116);
				this.gb = var3.readUnsignedByte((byte) 116);
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "s.B(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	final void a (id var1, int var2) {
		int var5 = client.int_tb;

		try {
			int var3 = -38 % ((-57 - var2) / 38);
			++tb;

			do {
				int var4 = var1.readUnsignedByte((byte) 116);
				if (~var4 == -1) {
					break;
				}

				this.a(21, var4, var1);
			} while (var5 == 0);

		} catch (RuntimeException var6) {
			throw id.a(var6, "s.A(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}
}
