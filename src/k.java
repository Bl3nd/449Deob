import java.util.Random;

final class k {
	private static int[] b;
	private static int[] g = new int['耀'];
	private static int[] i;
	private static int[] t;
	private static int[] v;
	private static int[] w;
	private static int[] x;
	private static int[] y;

	static {
		Random random = new Random(0L);

		for (int var1 = 0 ; var1 < '耀' ; ++var1) {
			g[var1] = (random.nextInt() & 2) - 1;
		}

		i = new int['耀'];

		for (int var2 = 0 ; var2 < '耀' ; ++var2) {
			i[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
		}

		b = new int[220500];
		w = new int[5];
		t = new int[5];
		y = new int[5];
		x = new int[5];
		v = new int[5];
	}

	int a = 0;
	int u = 500;
	private ga c;
	private int[] d = new int[5];
	private ga e;
	private int f = 0;
	private ga h;
	private ga j;
	private int[] k = new int[5];
	private ga l;
	private ga m;
	private ae n;
	private ga o;
	private ga p;
	private int q = 100;
	private ga r;
	private int[] s = new int[5];

	public static void a () {
		b = null;
		g = null;
		i = null;
		v = null;
		y = null;
		t = null;
		w = null;
		x = null;
	}

	final void a (id var1) {
		this.j = new ga();
		this.j.a(var1);
		this.h = new ga();
		this.h.a(var1);
		int var2 = var1.readUnsignedByte((byte) 116);
		if (var2 != 0) {
			--var1.pointer;
			this.c = new ga();
			this.c.a(var1);
			this.p = new ga();
			this.p.a(var1);
		}

		var2 = var1.readUnsignedByte((byte) 116);
		if (var2 != 0) {
			--var1.pointer;
			this.e = new ga();
			this.e.a(var1);
			this.m = new ga();
			this.m.a(var1);
		}

		var2 = var1.readUnsignedByte((byte) 116);
		if (var2 != 0) {
			--var1.pointer;
			this.r = new ga();
			this.r.a(var1);
			this.l = new ga();
			this.l.a(var1);
		}

		for (int var3 = 0 ; var3 < 10 ; ++var3) {
			int var4 = var1.readUnsignedSmart((byte) -106);
			if (var4 == 0) {
				break;
			}

			this.k[var3] = var4;
			this.s[var3] = var1.readSmartA(false);
			this.d[var3] = var1.readUnsignedSmart((byte) -126);
		}

		this.f = var1.readUnsignedSmart((byte) -101);
		this.q = var1.readUnsignedSmart((byte) -84);
		this.u = var1.readUnsignedLEShort(255);
		this.a = var1.readUnsignedLEShort(255);
		this.n = new ae();
		this.o = new ga();
		this.n.a(var1, this.o);
	}

	final int[] a (int var1, int var2) {
		for (int var3 = 0 ; var3 < var1 ; ++var3) {
			b[var3] = 0;
		}

		if (var2 < 10) {
			return b;
		} else {
			double var4 = (double) var1 / ((double) var2 + 0.0D);
			this.j.a();
			this.h.a();
			int var6 = 0;
			int var7 = 0;
			int var8 = 0;
			if (this.c != null) {
				this.c.a();
				this.p.a();
				var6 = (int) ((double) (this.c.int_a - this.c.int_b) * 32.768D / var4);
				var7 = (int) ((double) this.c.int_b * 32.768D / var4);
			}

			int var9 = 0;
			int var10 = 0;
			int var11 = 0;
			if (this.e != null) {
				this.e.a();
				this.m.a();
				var9 = (int) ((double) (this.e.int_a - this.e.int_b) * 32.768D / var4);
				var10 = (int) ((double) this.e.int_b * 32.768D / var4);
			}

			for (int var12 = 0 ; var12 < 5 ; ++var12) {
				if (this.k[var12] != 0) {
					v[var12] = 0;
					y[var12] = (int) ((double) this.d[var12] * var4);
					t[var12] = (this.k[var12] << 14) / 100;
					w[var12] = (int) ((double) (this.j.int_a - this.j.int_b) * 32.768D * Math
							.pow(1.0057929410678534D, (double) this.s[var12]) / var4);
					x[var12] = (int) ((double) this.j.int_b * 32.768D / var4);
				}
			}

			int var14;
			int var15;
			int var16;
			int var17;
			for (int var13 = 0 ; var13 < var1 ; ++var13) {
				var14 = this.j.a(var1);
				var15 = this.h.a(var1);
				if (this.c != null) {
					var16 = this.c.a(var1);
					var17 = this.p.a(var1);
					var14 += this.a(var8, var17, this.c.int_e) >> 1;
					var8 += (var16 * var6 >> 16) + var7;
				}

				if (this.e != null) {
					var16 = this.e.a(var1);
					var17 = this.m.a(var1);
					var15 = var15 * ((this.a(var11, var17, this.e.int_e) >> 1) + '耀') >> 15;
					var11 += (var16 * var9 >> 16) + var10;
				}

				for (var16 = 0; var16 < 5 ; ++var16) {
					if (this.k[var16] != 0) {
						var17 = var13 + y[var16];
						if (var17 < var1) {
							b[var17] += this.a(v[var16], var15 * t[var16] >> 15, this.j.int_e);
							v[var16] += (var14 * w[var16] >> 16) + x[var16];
						}
					}
				}
			}

			int var18;
			int var19;
			if (this.r != null) {
				this.r.a();
				this.l.a();
				var14 = 0;
				boolean var22 = false;
				boolean var23 = true;

				for (var17 = 0; var17 < var1 ; ++var17) {
					var18 = this.r.a(var1);
					var19 = this.l.a(var1);
					if (var23) {
						var15 = this.r.int_b + ((this.r.int_a - this.r.int_b) * var18 >> 8);
					} else {
						var15 = this.r.int_b + ((this.r.int_a - this.r.int_b) * var19 >> 8);
					}

					var14 += 256;
					if (var14 >= var15) {
						var14 = 0;
						var23 = !var23;
					}

					if (var23) {
						b[var17] = 0;
					}
				}
			}

			if (this.f > 0 && this.q > 0) {
				var14 = (int) ((double) this.f * var4);

				for (var15 = var14; var15 < var1 ; ++var15) {
					b[var15] += b[var15 - var14] * this.q / 100;
				}
			}

			if (this.n.b[0] > 0 || this.n.b[1] > 0) {
				this.o.a();
				var14 = this.o.a(var1 + 1);
				var15 = this.n.a(0, (float) var14 / 65536.0F);
				var16 = this.n.a(1, (float) var14 / 65536.0F);
				if (var1 >= var15 + var16) {
					var17 = 0;
					var18 = var16;
					if (var16 > var1 - var15) {
						var18 = var1 - var15;
					}

					int var20;
					int var21;
					while (var17 < var18) {
						var19 = (int) ((long) b[var17 + var15] * (long) ae.h >> 16);

						for (var20 = 0; var20 < var15 ; ++var20) {
							var19 += (int) ((long) b[var17 + var15 - 1 - var20] * (long) ae.c[0][var20] >> 16);
						}

						for (var21 = 0; var21 < var17 ; ++var21) {
							var19 -= (int) ((long) b[var17 - 1 - var21] * (long) ae.c[1][var21] >> 16);
						}

						b[var17] = var19;
						var14 = this.o.a(var1 + 1);
						++var17;
					}

					var18 = 128;

					while (true) {
						if (var18 > var1 - var15) {
							var18 = var1 - var15;
						}

						while (var17 < var18) {
							var19 = (int) ((long) b[var17 + var15] * (long) ae.h >> 16);

							for (var20 = 0; var20 < var15 ; ++var20) {
								var19 += (int) ((long) b[var17 + var15 - 1 - var20] * (long) ae.c[0][var20] >> 16);
							}

							for (var21 = 0; var21 < var16 ; ++var21) {
								var19 -= (int) ((long) b[var17 - 1 - var21] * (long) ae.c[1][var21] >> 16);
							}

							b[var17] = var19;
							var14 = this.o.a(var1 + 1);
							++var17;
						}

						if (var17 >= var1 - var15) {
							while (var17 < var1) {
								var19 = 0;

								for (var20 = var17 + var15 - var1; var20 < var15 ; ++var20) {
									var19 += (int) ((long) b[var17 + var15 - 1 - var20] * (long) ae.c[0][var20] >> 16);
								}

								for (var21 = 0; var21 < var16 ; ++var21) {
									var19 -= (int) ((long) b[var17 - 1 - var21] * (long) ae.c[1][var21] >> 16);
								}

								b[var17] = var19;
								this.o.a(var1 + 1);
								++var17;
							}
							break;
						}

						var15 = this.n.a(0, (float) var14 / 65536.0F);
						var16 = this.n.a(1, (float) var14 / 65536.0F);
						var18 += 128;
					}
				}
			}

			for (var14 = 0; var14 < var1 ; ++var14) {
				if (b[var14] < -32768) {
					b[var14] = -32768;
				}

				if (b[var14] > 32767) {
					b[var14] = 32767;
				}
			}

			return b;
		}
	}

	private int a (int var1, int var2, int var3) {
		return var3 == 1 ? ((var1 & 32767) < 16384 ? var2 : -var2) : (var3 == 2 ? i[var1 & 32767] * var2 >> 14 : (var3 == 3 ? ((var1 & 32767) * var2 >> 14) - var2 : (var3 == 4 ? g[var1 / 2607 & 32767] * var2 : 0)));
	}
}
