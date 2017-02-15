final class te extends ha {
	static int tb = 0;
	static rd ub;
	static int xb;
	static byte[][] yb = new byte[250][];
	static int[] zb = new int[128];
	static int Cb = -1;
	static pb archiveFile2;
	static int Gb;
	static rd Ib = md.a((String) "(U5", (byte) 114);
	static int Jb;
	static int Kb;
	static int Mb;
	static int Nb;
	static int Ob;
	static int Pb;
	static id Qb;
	static rd Rb;
	static mc Ub;
	static jd Vb;
	static rd thisWorldIsFull2;
	private static rd thisWorldIsFull = md.a((String) "This world is full)3", (byte) 116);
	private static rd Sb = md.a((String) "Login", (byte) 127);

	static {
		ub = Sb;
		thisWorldIsFull2 = thisWorldIsFull;
		Rb = md.a("und loggen sich dann erneut ein)3", (byte) 122);
	}

	int sb;
	int vb;
	int wb;
	int Bb;
	boolean Db = false;
	int Fb;
	private int rb = 0;
	private int Hb = 0;
	private e Lb;
	private int Tb;

	te (int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		try {
			this.vb = var4;
			this.Bb = var2;
			this.Tb = var1;
			this.sb = var5;
			this.Fb = var3;
			this.wb = var6 + var7;
			int var8 = l.a(true, this.Tb).xb;
			if (~var8 == 0) {
				this.Db = true;
			} else {
				this.Db = false;
				this.Lb = bd.a(var8, false);
			}
		} catch (RuntimeException var9) {
			throw id.a(var9, "te.<init>(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
		}
	}

	static void d (byte var0) {
		try {
			ie.writeStream.writeOpcode(8, 240);
			if (~ta.Yb != 0) {
				q.a(ta.Yb, (byte) -90);
				db.F = true;
				ce.int_l = -1;
				pe.l = true;
				ta.Yb = -1;
			}

			if (~ta.Sb != 0) {
				q.a(ta.Sb, (byte) -90);
				w.h = true;
				ce.int_l = -1;
				ta.Sb = -1;
			}

			++Jb;
			++bc.d;
			if (ee.int_h != -1) {
				q.a(ee.int_h, (byte) -90);
				ee.int_h = -1;
				bd.a(false, 30);
			}

			if (i.R != -1) {
				q.a(i.R, (byte) -90);
				i.R = -1;
			}

			if (~sa.zb != 0) {
				q.a(sa.zb, (byte) -90);
				ce.int_l = -1;
				sa.zb = -1;
			}

			if (var0 != 99) {
				e((byte) 60);
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "te.E(" + var0 + ')');
		}
	}

	static void e (byte unused) {
		try {
			ta.Kb.c(-115);
			++Mb;
		} catch (RuntimeException var2) {
			throw id.a(var2, "te.B(" + unused + ')');
		}
	}

	static void a (int var0, boolean var1) {
		int var7 = client.int_tb;

		try {
			if (var0 == 12698) {
				int var2 = 0;
				if (var7 == 0 && var2 >= lc.q) {
					++Pb;
				} else {
					do {
						b var3 = ta.Nb[ca.ints_b[var2]];
						int var4 = 536870912 - -(ca.ints_b[var2] << 14);
						if (var3 != null && var3.d((byte) -122) && !var3.tb_md.Kb == !var1 && var3.tb_md.i(3061)) {
							int var6 = var3.y_ >> 7;
							int var5 = var3.x_ >> 7;
							if (var5 >= 0 && var5 < 104 && ~var6 <= -1 && var6 < 104) {
								label78:
								{
									if (~var3.int_kc == -2 && ~(var3.x_ & 127) == -65 && ~(var3.y_ & 127) == -65) {
										if (~ha.ints_nb[var5][var6] == ~qe.F) {
											break label78;
										}

										ha.ints_nb[var5][var6] = qe.F;
									}

									if (!var3.tb_md.Eb) {
										var4 += Integer.MIN_VALUE;
									}

									pc.o.a(ce.plane, var3.x_, var3.y_, vc
											.a(ce.plane, 64 * var3.int_kc + -64 + var3.x_, 64 * (var3.int_kc - 1) + var3.y_, (byte) 37), -64 + 64 * var3.int_kc + 60, var3, var3.Bb, var4, var3.zb);
								}
							}
						}

						++var2;
					} while (var2 < lc.q);

					++Pb;
				}
			}
		} catch (RuntimeException var8) {
			throw id.a(var8, "te.D(" + var0 + ',' + var1 + ')');
		}
	}

	static he a (pb cacheFile8, rd sprite, rd class_rd2, boolean unused) {
		try {
			++Nb;
			int index = cacheFile8.a(sprite, (byte) -111);
			int i1 = cacheFile8.a(class_rd2, -31757, index);
			return ib.a(cacheFile8, i1, index, -218);
		} catch (RuntimeException var6) {
			throw id.a(var6, "te.C(" + (cacheFile8 != null ? "{...}" : "null") + ',' + (sprite != null ? "{...}" : "null") + ',' + (class_rd2 != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}

	public static void f (int var0) {
		try {
			zb = null;
			if (var0 > 12) {
				thisWorldIsFull2 = null;
				Rb = null;
				Sb = null;
				Vb = null;
				thisWorldIsFull = null;
				archiveFile2 = null;
				Qb = null;
				yb = null;
				Ib = null;
				Ub = null;
				ub = null;
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "te.G(" + var0 + ')');
		}
	}

	final void a (byte var1, int var2) {
		int var4 = client.int_tb;

		try {
			++xb;
			if (!this.Db) {
				this.rb += var2;
				if (var1 < 62) {
					f(-39);
					if (var4 == 0 && this.rb <= this.Lb.Eb[this.Hb]) {
						return;
					}
				} else if (this.rb <= this.Lb.Eb[this.Hb]) {
					return;
				}

				do {
					this.rb -= this.Lb.Eb[this.Hb];
					++this.Hb;
					if (this.Hb >= this.Lb.Gb.length) {
						this.Db = true;
						return;
					}
				} while (this.rb > this.Lb.Eb[this.Hb]);

			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "te.A(" + var1 + ',' + var2 + ')');
		}
	}

	final ue c (byte var1) {
		try {
			if (var1 >= -9) {
				Ib = null;
			}

			++Gb;
			j var2 = l.a(true, this.Tb);
			ue var3;
			if (this.Db) {
				var3 = var2.b(-1565796086, -1);
				if (client.int_tb == 0) {
					return var3 == null ? null : var3;
				}
			}

			var3 = var2.b(-1565796086, this.Hb);
			return var3 == null ? null : var3;
		} catch (RuntimeException var4) {
			throw id.a(var4, "te.F(" + var1 + ')');
		}
	}
}
