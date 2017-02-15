import java.io.UnsupportedEncodingException;

final class wd implements cd {
	static int int_a = 0;
	static int int_b;
	static int c;
	static int d;
	static rd rd_e = md.a((String) "@or1@", (byte) 126);
	static int f;
	static int h;
	static rd[] j = new rd[100];
	static int k;
	static int l;
	static rd m;
	static rd youAreStandingInAMembersOnlyArea2;
	static int o;
	static int p;
	static int q;
	static int r;
	static rd s;
	static int u;
	static rd w;
	static int x;
	static int y;
	static int z;
	private static rd youAreStandingInAMembersOnlyArea = md.a((String) "You are standing in a members)2only area)3", (byte) 116);
	private static rd t;

	static {
		youAreStandingInAMembersOnlyArea2 = youAreStandingInAMembersOnlyArea;
		s = md.a("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", (byte) 114);
		t = md.a("Hide", (byte) 114);
		w = md.a("Passwort: ", (byte) 118);
		m = t;
		y = 1;
	}

	private md i;
	private qd[] v;
	private int A;
	private int B;
	private pb archiveFile8;
	private int D;
	private double E;

	wd (pb archiveFile9, pb archiveFile8, int unused, double unused2, int i) {
		this.i = new md();
		this.D = 0;
		this.A = 128;
		this.E = 1.0D;
		try {
			this.B = 20;
			this.D = this.B;
			this.E = 0.8D;
			this.A = i;
			this.archiveFile8 = archiveFile8;
			int[] data = archiveFile9.a(0, false);
			int length = data.length;
			this.v = new qd[archiveFile9.getLengthForIndex(0, false)];
			int i1 = 0;
			if (length > i1) {
				do {
					id class_id = new id(archiveFile9.a(0, data[i1], (byte) 66));
					this.v[data[i1]] = new qd(class_id);
					++i1;
				} while (length > i1);

			}
		} catch (RuntimeException var12) {
			throw id.a(var12, "wd.<init>(" + (archiveFile9 != null ? "{...}" : "null") + ',' + (archiveFile8 != null ? "{...}" : "null") + ',' + unused + ',' + unused2 + ',' + i + ')');
		}
	}

	public static void a (byte var0) {
		try {
			rd_e = null;
			j = null;
			youAreStandingInAMembersOnlyArea = null;
			youAreStandingInAMembersOnlyArea2 = null;
			s = null;
			m = null;
			w = null;
			if (var0 > -93) {
				youAreStandingInAMembersOnlyArea = null;
			}

			t = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "wd.D(" + var0 + ')');
		}
	}

	static void a (int unused) {
		try {
			int i = 0;
			if (lc.q <= i) {
				++q;
				return;
			}

			do {
				int i1 = ca.ints_b[i];
				b class_b = ta.Nb[i1];
				if (class_b != null) {
					qb.a(class_b.tb_md.Mb, (byte) -74, class_b);
				}

				++i;
			} while (lc.q > i);

			++q;
		} catch (RuntimeException var5) {
			throw id.a(var5, "wd.E(" + unused + ')');
		}
	}

	static rd a (rd var0, int var1, nd var2) {
		int var6 = client.int_tb;

		try {
			if (var1 != var0.a((byte) 108, tb.percentageSymbol)) {
				int var3;
				do {
					var3 = var0.a((byte) 99, td.rd_pd);
					if (~var3 == 0) {
						break;
					}

					var0 = pc.a((byte) 127, new rd[]{
							var0.b(var3, -23745, 0),
							bd.b(hf.a(var2, 0, (byte) -78), 8425),
							var0.a(false, var3 + 2)
					});
				} while (var6 == 0);

				do {
					var3 = var0.a((byte) 39, wa.ob);
					if (~var3 == 0) {
						break;
					}

					var0 = pc.a((byte) 126, new rd[]{
							var0.b(var3, -23745, 0),
							bd.b(hf.a(var2, 1, (byte) -124), 8425),
							var0.a(false, 2 + var3)
					});
				} while (var6 == 0);

				do {
					var3 = var0.a((byte) 60, bd.xb);
					if (var3 == -1) {
						break;
					}

					var0 = pc.a((byte) 126, new rd[]{
							var0.b(var3, var1 + -23744, 0),
							bd.b(hf.a(var2, 2, (byte) -65), 8425),
							var0.a(false, var3 + 2)
					});
				} while (var6 == 0);

				do {
					var3 = var0.a((byte) 108, e.rd_kb);
					if (~var3 == 0) {
						break;
					}

					var0 = pc.a((byte) 126, new rd[]{
							var0.b(var3, -23745, 0),
							bd.b(hf.a(var2, 3, (byte) -82), 8425),
							var0.a(false, 2 + var3)
					});
				} while (var6 == 0);

				do {
					var3 = var0.a((byte) 33, te.Ib);
					if (~var3 == 0) {
						break;
					}

					var0 = pc.a((byte) 127, new rd[]{
							var0.b(var3, -23745, 0),
							bd.b(hf.a(var2, 4, (byte) -91), 8425),
							var0.a(false, var3 - -2)
					});
				} while (var6 == 0);

				do {
					var3 = var0.a((byte) 44, jc.D);
					if (var3 == -1) {
						break;
					}

					rd var4 = kd.rd_v;
					if (gd.ma_e != null) {
						var4 = id.d((byte) -92, gd.ma_e.e);

						try {
							if (gd.ma_e.c != null) {
								byte[] var5 = ((String) gd.ma_e.c).getBytes("ISO-8859-1");
								var4 = df.getRSString(var5, var5.length, 0, 0);
							}
						} catch (UnsupportedEncodingException var7) {
							var7.printStackTrace();
						}
					}

					var0 = pc.a((byte) 126, new rd[]{var0.b(var3, -23745, 0), var4, var0.a(false, var3 + 4)});
				} while (var6 == 0);
			}

			++d;
			return var0;
		} catch (RuntimeException var8) {
			throw id.a(var8, "wd.F(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	static boolean a (int var0, int var1, int var2, int var3, boolean var4, int var5, int var6) {
		try {
			++k;
			if (!a.a(0, var6)) {
				return false;
			} else {
				bf.nds_k = null;
				boolean var7 = pc.a(ld.c[var6], 0, var1, -1, var5, var0, (byte) 71, var2, var3, 0);
				if (var4) {
					rd_e = null;
				}

				if (bf.nds_k != null) {
					pc.a(bf.nds_k, kd.F, var1, -1412584499, var5, var0, (byte) 71, var2, var3, b.int_cd);
				}

				return var7;
			}
		} catch (RuntimeException var8) {
			throw id.a(var8, "wd.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
		}
	}

	public final int[] b (int cacheFile9Length, int unused) {
		try {
			++int_b;
			qd class_qd = this.v[cacheFile9Length];
			if (class_qd != null) {
				if (class_qd.D != null) {
					this.i.a(0, class_qd);
					class_qd.A = true;
					return class_qd.D;
				}

				boolean flag = class_qd.a(this.E, this.A, this.archiveFile8);
				if (flag) {
					if (this.D != 0) {
						--this.D;
					} else {
						qd class_qd2 = (qd) this.i.a(false);
						if (class_qd2 != null) {
							class_qd2.a();
						}
					}

					this.i.a(0, class_qd);
					class_qd.A = true;
					return class_qd.D;
				}
			}

			return null;
		} catch (RuntimeException var6) {
			throw id.a(var6, "wd.H(" + cacheFile9Length + ',' + unused + ')');
		}
	}

	public final boolean a (int unused2, boolean unused) {
		try {
			++x;
			return this.A == 64;
		} catch (RuntimeException var4) {
			throw id.a(var4, "wd.J(" + unused2 + ',' + unused + ')');
		}
	}

	final void b (byte unused) {
		try {
			for (int index = 0 ; ~index > ~this.v.length ; ++index) {
				if (this.v[index] != null) {
					this.v[index].a();
				}
			}

			this.i = new md();
			this.D = this.B;
			++o;
		} catch (RuntimeException var5) {
			throw id.a(var5, "wd.C(" + unused + ')');
		}
	}

	public final int a (int unused, int cacheFile9Length) {
		try {
			++l;
			return this.v[cacheFile9Length] != null ? this.v[cacheFile9Length].G : 0;
		} catch (RuntimeException var4) {
			throw id.a(var4, "wd.K(" + unused + ',' + cacheFile9Length + ')');
		}
	}

	final void a (double var1, int var3) {
		try {
			if (var3 == -28996) {
				++r;
				this.E = var1;
				this.b((byte) 122);
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "wd.I(" + var1 + ',' + var3 + ')');
		}
	}

	final void c (int var1, int var2) {
		int var5 = client.int_tb;

		try {
			++p;
			int var3 = var2;
			if (var5 != 0 || var2 < this.v.length) {
				do {
					qd var4 = this.v[var3];
					if (var4 != null && ~var4.F != -1 && var4.A) {
						var4.e(var1);
						var4.A = false;
					}

					++var3;
				} while (var3 < this.v.length);

			}
		} catch (RuntimeException var6) {
			throw id.a(var6, "wd.G(" + var1 + ',' + var2 + ')');
		}
	}

	public final boolean a (byte unused, int cache9Length) {
		try {
			++h;
			return this.v[cache9Length].H;
		} catch (RuntimeException var4) {
			throw id.a(var4, "wd.A(" + unused + ',' + cache9Length + ')');
		}
	}
}
