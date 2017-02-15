final class ua {
	static int o = -1;
	static int r = -1;
	static boolean w;
	private static la[] b = new la[100];
	private static int d;
	private static int f = 0;
	private static boolean g = false;
	private static int h;
	private static int[] i;
	private static int j;
	private static int k = 0;
	private static int[] l = new int[]{-53, -53, 53, 53};
	private static qe[][] m;
	private static int[] t = new int[]{53, -53, -53, 53};
	private static md md_u;
	private static int int_v = 4;
	private static int x = 0;
	private static int y;
	private static int z;
	private static int A;
	private static int B;
	private static int C;
	private static qe[] D = new qe[500];
	private static int E;
	private static int G;
	private static int H;
	private static int[] I = new int[]{45, 45, -45, -45};
	private static int K = 0;
	private static int M;
	private static int N;
	private static int P;
	private static int[] Q;
	private static int R;
	private static int S;
	private static int T;
	private static int[] U;
	private static int[] V;
	private static int[] W;
	private static int X;
	private static int Y;
	private static int[] Z;
	private static int[] ab;
	private static boolean[][] bb;
	private static int[] cb;
	private static int[] db;
	private static int eb;
	private static boolean[][][][] fb;
	private static int gb;
	private static int hb;

	static {
		m = new qe[int_v][500];
		w = true;
		Q = new int[]{-45, 45, 45, -45};
		R = 0;
		M = 0;
		i = new int[int_v];
		md_u = new md();
		U = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
		Z = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
		W = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
		V = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
		db = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
		ab = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
		fb = new boolean[8][32][51][51];
		cb = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
	}

	private me[][][] a;
	private la[] c = new la[5000];
	private int e = 0;
	private int n;
	private int[][][] p;
	private int q = 0;
	private int s;
	private int F;
	private int[][][] J;
	private int[][] L = new int[][]{
			new int[16],
			{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
			{1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1},
			{1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
			{0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1},
			{0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
			{1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1},
			{1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0},
			{1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1},
			{1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}
	};
	private int[][] O = new int[][]{
			{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15},
			{12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3},
			{15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0},
			{3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}
	};

	ua (int var1, int var2, int var3, int[][][] var4) {
		this.F = var1;
		this.n = var2;
		this.s = var3;
		this.a = new me[var1][var2][var3];
		this.p = new int[var1][var2 + 1][var3 + 1];
		this.J = var4;
		this.c();
	}

	static void a (int[] var0, int var1, int var2, int var3, int var4) {
		gb = 0;
		Y = 0;
		eb = var3;
		X = var4;
		T = var3 / 2;
		hb = var4 / 2;
		boolean[][][][] var5 = new boolean[9][32][53][53];
		int var7;
		int var8;
		int var9;
		int var10;
		int var12;
		int var13;
		for (int var6 = 128 ; var6 <= 384 ; var6 += 32) {
			for (var7 = 0; var7 < 2048 ; var7 += 64) {
				h = v.pb[var6];
				A = v.wb[var6];
				d = v.pb[var7];
				N = v.wb[var7];
				var8 = (var6 - 128) / 32;
				var9 = var7 / 64;

				for (var10 = -26; var10 <= 26 ; ++var10) {
					for (int var11 = -26 ; var11 <= 26 ; ++var11) {
						var12 = var10 * 128;
						var13 = var11 * 128;
						boolean var14 = false;

						for (int var15 = -var1 ; var15 <= var2 ; var15 += 128) {
							if (i(var12, var0[var8] + var15, var13)) {
								var14 = true;
								break;
							}
						}

						var5[var8][var9][var10 + 25 + 1][var11 + 25 + 1] = var14;
					}
				}
			}
		}

		for (var7 = 0; var7 < 8 ; ++var7) {
			for (var8 = 0; var8 < 32 ; ++var8) {
				for (var9 = -25; var9 < 25 ; ++var9) {
					for (var10 = -25; var10 < 25 ; ++var10) {
						boolean var16 = false;

						label73:
						for (var12 = -1; var12 <= 1 ; ++var12) {
							for (var13 = -1; var13 <= 1 ; ++var13) {
								if (var5[var7][var8][var9 + var12 + 25 + 1][var10 + var13 + 25 + 1]) {
									var16 = true;
									break label73;
								}

								if (var5[var7][(var8 + 1) % 31][var9 + var12 + 25 + 1][var10 + var13 + 25 + 1]) {
									var16 = true;
									break label73;
								}

								if (var5[var7 + 1][var8][var9 + var12 + 25 + 1][var10 + var13 + 25 + 1]) {
									var16 = true;
									break label73;
								}

								if (var5[var7 + 1][(var8 + 1) % 31][var9 + var12 + 25 + 1][var10 + var13 + 25 + 1]) {
									var16 = true;
									break label73;
								}
							}
						}

						fb[var7][var8][var9 + 25][var10 + 25] = var16;
					}
				}
			}
		}

	}

	public static void b () {
		b = null;
		t = null;
		l = null;
		Q = null;
		I = null;
		i = null;
		m = null;
		D = null;
		md_u = null;
		U = null;
		ab = null;
		V = null;
		W = null;
		Z = null;
		cb = null;
		db = null;
		fb = null;
		bb = null;
	}

	private static boolean i (int var0, int var1, int var2) {
		int var3 = var2 * d + var0 * N >> 16;
		int var4 = var2 * N - var0 * d >> 16;
		int var5 = var1 * h + var4 * A >> 16;
		int var6 = var1 * A - var4 * h >> 16;
		if (var5 >= 50 && var5 <= 3500) {
			int var7 = T + (var3 << 9) / var5;
			int var8 = hb + (var6 << 9) / var5;
			return var7 >= gb && var7 <= eb && var8 >= Y && var8 <= X;
		} else {
			return false;
		}
	}

	static void b (int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		qe var8 = new qe();
		var8.e = var2 / 128;
		var8.int_n = var3 / 128;
		var8.int_s = var4 / 128;
		var8.u = var5 / 128;
		var8.int_v = var1;
		var8.c = var2;
		var8.b = var3;
		var8.w = var4;
		var8.f = var5;
		var8.m = var6;
		var8.a = var7;
		m[var0][i[var0]++] = var8;
	}

	private static int b (int var0, int var1) {
		var1 = (127 - var1) * (var0 & 127) >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 'ﾀ') + var1;
	}

	final void a (int var1, int var2, int var3, int var4, ha var5, int var6, int var7, int var8, int var9, int var10,
				  int var11) {
		if (var5 != null) {
			bc var12 = new bc();
			var12.int_b = var10;
			var12.n = var11;
			var12.F = var2 * 128 + 64 + var8;
			var12.B = var3 * 128 + 64 + var9;
			var12.h = var4;
			var12.m = var5;
			var12.C = var6;
			var12.f = var7;

			for (int var13 = var1 ; var13 >= 0 ; --var13) {
				if (this.a[var13][var2][var3] == null) {
					this.a[var13][var2][var3] = new me(var13, var2, var3);
				}
			}

			this.a[var1][var2][var3].fb = var12;
		}
	}

	final bc a (int var1, int var2, int var3) {
		me var4 = this.a[var1][var2][var3];
		return var4 == null ? null : var4.fb;
	}

	private void a (la var1) {
		for (int var2 = var1.f ; var2 <= var1.int_e ; ++var2) {
			for (int var3 = var1.z ; var3 <= var1.p ; ++var3) {
				me var4 = this.a[var1.g][var2][var3];
				if (var4 != null) {
					int var6;
					for (int var5 = 0 ; var5 < var4.ab ; ++var5) {
						if (var4.gb[var5] == var1) {
							--var4.ab;

							for (var6 = var5; var6 < var4.ab ; ++var6) {
								var4.gb[var6] = var4.gb[var6 + 1];
								var4.M[var6] = var4.M[var6 + 1];
							}

							var4.gb[var4.ab] = null;
							break;
						}
					}

					var4.bb = 0;

					for (var6 = 0; var6 < var4.ab ; ++var6) {
						var4.bb |= var4.M[var6];
					}
				}
			}
		}

	}

	private void a (kc var1, int var2, int var3, int var4) {
		me var5;
		kc var6;
		if (var3 < this.n) {
			var5 = this.a[var2][var3 + 1][var4];
			if (var5 != null && var5.U != null && var5.U.n instanceof kc) {
				var6 = (kc) var5.U.n;
				kc.a(var1, var6, 128, 0, 0, true);
			}
		}

		if (var4 < this.n) {
			var5 = this.a[var2][var3][var4 + 1];
			if (var5 != null && var5.U != null && var5.U.n instanceof kc) {
				var6 = (kc) var5.U.n;
				kc.a(var1, var6, 0, 0, 128, true);
			}
		}

		if (var3 < this.n && var4 < this.s) {
			var5 = this.a[var2][var3 + 1][var4 + 1];
			if (var5 != null && var5.U != null && var5.U.n instanceof kc) {
				var6 = (kc) var5.U.n;
				kc.a(var1, var6, 128, 0, 128, true);
			}
		}

		if (var3 < this.n && var4 > 0) {
			var5 = this.a[var2][var3 + 1][var4 - 1];
			if (var5 != null && var5.U != null && var5.U.n instanceof kc) {
				var6 = (kc) var5.U.n;
				kc.a(var1, var6, 128, 0, -128, true);
			}
		}

	}

	final boolean a (int var1, int var2, int var3, int var4, int var5, ha var6, int var7, int var8, int var9, int var10,
					 int var11, int var12) {
		return var6 == null ? true : this
				.a(var1, var9, var10, var11 - var9 + 1, var12 - var10 + 1, var2, var3, var4, var6, var7, true, var8, 0);
	}

	final void a (int x, int y) {
		me var3 = this.a[0][x][y];
		for (int plane = 0 ; plane < 3 ; ++plane) {
			me var5 = this.a[plane][x][y] = this.a[plane + 1][x][y];
			if (var5 != null) {
				--var5.O;

				for (int var6 = 0 ; var6 < var5.ab ; ++var6) {
					la var7 = var5.gb[var6];
					if ((var7.k >> 29 & 3) == 2 && var7.f == x && var7.z == y) {
						--var7.g;
					}
				}
			}
		}

		if (this.a[0][x][y] == null) {
			this.a[0][x][y] = new me(0, x, y);
		}

		this.a[0][x][y].P = var3;
		this.a[3][x][y] = null;
	}

	private void a (ob var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = var1.r.length;

		int var10;
		int var11;
		int var12;
		int var13;
		for (int var9 = 0 ; var9 < var8 ; ++var9) {
			var10 = var1.r[var9] - B;
			var11 = var1.b[var9] - E;
			var12 = var1.t[var9] - P;
			var13 = var12 * var4 + var10 * var5 >> 16;
			var12 = var12 * var5 - var10 * var4 >> 16;
			var10 = var13;
			var13 = var11 * var3 - var12 * var2 >> 16;
			var12 = var11 * var2 + var12 * var3 >> 16;
			if (var12 < 50) {
				return;
			}

			if (var1.q != null) {
				ob.k[var9] = var10;
				ob.j[var9] = var13;
				ob.s[var9] = var12;
			}

			ob.p[var9] = v.kb + (var10 << 9) / var12;
			ob.o[var9] = v.zb + (var13 << 9) / var12;
		}

		v.lb = 0;
		var8 = var1.d.length;

		for (var10 = 0; var10 < var8 ; ++var10) {
			var11 = var1.d[var10];
			var12 = var1.u[var10];
			var13 = var1.l[var10];
			int var14 = ob.p[var11];
			int var15 = ob.p[var12];
			int var16 = ob.p[var13];
			int var17 = ob.o[var11];
			int var18 = ob.o[var12];
			int var19 = ob.o[var13];
			if ((var14 - var15) * (var19 - var18) - (var17 - var18) * (var16 - var15) > 0) {
				v.gb = false;
				if (var14 < 0 || var15 < 0 || var16 < 0 || var14 > v.vb || var15 > v.vb || var16 > v.vb) {
					v.gb = true;
				}

				if (g && this.a(k, f, var17, var18, var19, var14, var15, var16)) {
					o = var6;
					r = var7;
				}

				if (var1.q != null && var1.q[var10] != -1) {
					if (!w) {
						if (var1.a) {
							v.a(var17, var18, var19, var14, var15, var16, var1.f[var10], var1.c[var10], var1.i[var10], ob.k[0], ob.k[1], ob.k[3], ob.j[0], ob.j[1], ob.j[3], ob.s[0], ob.s[1], ob.s[3], var1.q[var10]);
						} else {
							v.a(var17, var18, var19, var14, var15, var16, var1.f[var10], var1.c[var10], var1.i[var10], ob.k[var11], ob.k[var12], ob.k[var13], ob.j[var11], ob.j[var12], ob.j[var13], ob.s[var11], ob.s[var12], ob.s[var13], var1.q[var10]);
						}
					} else {
						int var20 = v.cd_ub.a(-22953, var1.q[var10]);
						v.a(var17, var18, var19, var14, var15, var16, b(var20, var1.f[var10]), b(var20, var1.c[var10]), b(var20, var1.i[var10]));
					}
				} else if (var1.f[var10] != 12345678) {
					v.a(var17, var18, var19, var14, var15, var16, var1.f[var10], var1.c[var10], var1.i[var10]);
				}
			}
		}
	}

	final ra b (int var1, int var2, int var3) {
		me var4 = this.a[var1][var2][var3];
		return var4 != null && var4.U != null ? var4.U : null;
	}

	final int c (int var1, int var2, int var3) {
		me var4 = this.a[var1][var2][var3];
		return var4 != null && var4.fb != null ? var4.fb.int_b : 0;
	}

	final void d (int plane, int x, int y) {
		me class_me = this.a[plane][x][y];
		if (class_me != null) {
			class_me.Y = null;
		}
	}

	final boolean a (int var1, int var2, int var3, int var4, int var5, int var6, ha var7, int var8, int var9,
					 int var10) {
		if (var7 == null) {
			return true;
		} else {
			int var11 = var2 * 128 + 64 * var5;
			int var12 = var3 * 128 + 64 * var6;
			return this.a(var1, var2, var3, var5, var6, var11, var12, var4, var7, var8, false, var9, var10);
		}
	}

	private boolean a (int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		int var8;
		if (var2 == var3 && var4 == var5) {
			if (!this.k(var1, var2, var4)) {
				return false;
			} else {
				var7 = var2 << 7;
				var8 = var4 << 7;
				return this.h(var7 + 1, this.J[var1][var2][var4] - var6, var8 + 1) && this
						.h(var7 + 128 - 1, this.J[var1][var2 + 1][var4] - var6, var8 + 1) && this
						.h(var7 + 128 - 1, this.J[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this
						.h(var7 + 1, this.J[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
			}
		} else {
			for (var7 = var2; var7 <= var3 ; ++var7) {
				for (var8 = var4; var8 <= var5 ; ++var8) {
					if (this.p[var1][var7][var8] == -j) {
						return false;
					}
				}
			}

			var8 = (var2 << 7) + 1;
			int var9 = (var4 << 7) + 2;
			int var10 = this.J[var1][var2][var4] - var6;
			if (!this.h(var8, var10, var9)) {
				return false;
			} else {
				int var11 = (var3 << 7) - 1;
				if (!this.h(var11, var10, var9)) {
					return false;
				} else {
					int var12 = (var5 << 7) - 1;
					if (!this.h(var8, var10, var12)) {
						return false;
					} else if (!this.h(var11, var10, var12)) {
						return false;
					} else {
						return true;
					}
				}
			}
		}
	}

	final void e (int var1, int var2, int var3) {
		me var4 = this.a[var1][var2][var3];
		if (var4 != null) {
			for (int var5 = 0 ; var5 < var4.ab ; ++var5) {
				la var6 = var4.gb[var5];
				if ((var6.k >> 29 & 3) == 2 && var6.f == var2 && var6.z == var3) {
					this.a(var6);
					return;
				}
			}

		}
	}

	private boolean a (int var1, int var2, int var3, int var4) {
		if (!this.k(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			int var7 = this.J[var1][var2][var3] - 1;
			int var8 = var7 - 120;
			int var9 = var7 - 230;
			int var10 = var7 - 238;
			if (var4 < 16) {
				if (var4 == 1) {
					if (var5 > B) {
						if (!this.h(var5, var7, var6)) {
							return false;
						}

						if (!this.h(var5, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.h(var5, var8, var6)) {
							return false;
						}

						if (!this.h(var5, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.h(var5, var9, var6)) {
						return false;
					}

					if (!this.h(var5, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 2) {
					if (var6 < P) {
						if (!this.h(var5, var7, var6 + 128)) {
							return false;
						}

						if (!this.h(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.h(var5, var8, var6 + 128)) {
							return false;
						}

						if (!this.h(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.h(var5, var9, var6 + 128)) {
						return false;
					}

					if (!this.h(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 4) {
					if (var5 < B) {
						if (!this.h(var5 + 128, var7, var6)) {
							return false;
						}

						if (!this.h(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.h(var5 + 128, var8, var6)) {
							return false;
						}

						if (!this.h(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.h(var5 + 128, var9, var6)) {
						return false;
					}

					if (!this.h(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 8) {
					if (var6 > P) {
						if (!this.h(var5, var7, var6)) {
							return false;
						}

						if (!this.h(var5 + 128, var7, var6)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.h(var5, var8, var6)) {
							return false;
						}

						if (!this.h(var5 + 128, var8, var6)) {
							return false;
						}
					}

					if (!this.h(var5, var9, var6)) {
						return false;
					}

					if (!this.h(var5 + 128, var9, var6)) {
						return false;
					}

					return true;
				}
			}

			return !this.h(var5 + 64, var10, var6 + 64) ? false : (var4 == 16 ? this
					.h(var5, var9, var6 + 128) : (var4 == 32 ? this.h(var5 + 128, var9, var6 + 128) : (var4 == 64 ? this
					.h(var5 + 128, var9, var6) : (var4 == 128 ? this.h(var5, var9, var6) : true))));
		}
	}

	final void f (int var1, int var2, int var3) {
		me var4 = this.a[var1][var2][var3];
		if (var4 != null) {
			var4.R = null;
		}
	}

	private void a (nb var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9;
		int var10 = var9 = (var7 << 7) - B;
		int var11;
		int var12 = var11 = (var8 << 7) - P;
		int var13;
		int var14 = var13 = var10 + 128;
		int var15;
		int var16 = var15 = var12 + 128;
		int var17 = this.J[var2][var7][var8] - E;
		int var18 = this.J[var2][var7 + 1][var8] - E;
		int var19 = this.J[var2][var7 + 1][var8 + 1] - E;
		int var20 = this.J[var2][var7][var8 + 1] - E;
		int var21 = var12 * var5 + var10 * var6 >> 16;
		var12 = var12 * var6 - var10 * var5 >> 16;
		var10 = var21;
		var21 = var17 * var4 - var12 * var3 >> 16;
		var12 = var17 * var3 + var12 * var4 >> 16;
		var17 = var21;
		if (var12 >= 50) {
			var21 = var11 * var5 + var14 * var6 >> 16;
			var11 = var11 * var6 - var14 * var5 >> 16;
			var14 = var21;
			var21 = var18 * var4 - var11 * var3 >> 16;
			var11 = var18 * var3 + var11 * var4 >> 16;
			var18 = var21;
			if (var11 >= 50) {
				var21 = var16 * var5 + var13 * var6 >> 16;
				var16 = var16 * var6 - var13 * var5 >> 16;
				var13 = var21;
				var21 = var19 * var4 - var16 * var3 >> 16;
				var16 = var19 * var3 + var16 * var4 >> 16;
				var19 = var21;
				if (var16 >= 50) {
					var21 = var15 * var5 + var9 * var6 >> 16;
					var15 = var15 * var6 - var9 * var5 >> 16;
					var9 = var21;
					var21 = var20 * var4 - var15 * var3 >> 16;
					var15 = var20 * var3 + var15 * var4 >> 16;
					if (var15 >= 50) {
						int var22 = v.kb + (var10 << 9) / var12;
						int var23 = v.zb + (var17 << 9) / var12;
						int var24 = v.kb + (var14 << 9) / var11;
						int var25 = v.zb + (var18 << 9) / var11;
						int var26 = v.kb + (var13 << 9) / var16;
						int var27 = v.zb + (var19 << 9) / var16;
						int var28 = v.kb + (var9 << 9) / var15;
						int var29 = v.zb + (var21 << 9) / var15;
						v.lb = 0;
						int var30;
						if ((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) {
							v.gb = false;
							if (var26 < 0 || var28 < 0 || var24 < 0 || var26 > v.vb || var28 > v.vb || var24 > v.vb) {
								v.gb = true;
							}

							if (g && this.a(k, f, var27, var29, var25, var26, var28, var24)) {
								o = var7;
								r = var8;
							}

							if (var1.e == -1) {
								if (var1.i != 12345678) {
									v.a(var27, var29, var25, var26, var28, var24, var1.i, var1.k, var1.t);
								}
							} else if (!w) {
								if (var1.r) {
									v.a(var27, var29, var25, var26, var28, var24, var1.i, var1.k, var1.t, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.e);
								} else {
									v.a(var27, var29, var25, var26, var28, var24, var1.i, var1.k, var1.t, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.e);
								}
							} else {
								var30 = v.cd_ub.a(-22953, var1.e);
								v.a(var27, var29, var25, var26, var28, var24, b(var30, var1.i), b(var30, var1.k), b(var30, var1.t));
							}
						}

						if ((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) {
							v.gb = false;
							if (var22 < 0 || var24 < 0 || var28 < 0 || var22 > v.vb || var24 > v.vb || var28 > v.vb) {
								v.gb = true;
							}

							if (g && this.a(k, f, var23, var25, var29, var22, var24, var28)) {
								o = var7;
								r = var8;
							}

							if (var1.e == -1) {
								if (var1.int_j != 12345678) {
									v.a(var23, var25, var29, var22, var24, var28, var1.int_j, var1.t, var1.k);
								}
							} else {
								if (!w) {
									v.a(var23, var25, var29, var22, var24, var28, var1.int_j, var1.t, var1.k, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.e);
									return;
								}

								var30 = v.cd_ub.a(-22953, var1.e);
								v.a(var23, var25, var29, var22, var24, var28, b(var30, var1.int_j), b(var30, var1.t), b(var30, var1.k));
							}
						}
					}
				}
			}
		}
	}

	final int b (int plane, int x, int y, int value) {
		me class_me = this.a[plane][x][y];
		if (class_me == null) {
			return -1;
		} else if (class_me.R != null && class_me.R.w == value) {
			return class_me.R.p & 255;
		} else if (class_me.fb != null && class_me.fb.int_b == value) {
			return class_me.fb.n & 255;
		} else if (class_me.U != null && class_me.U.p == value) {
			return class_me.U.d & 255;
		} else {
			for (int index = 0 ; index < class_me.ab ; ++index) {
				if (class_me.gb[index].k == value) {
					return class_me.gb[index].o & 255;
				}
			}

			return -1;
		}
	}

	final void g (int i, int i1, int i2) {
		for (int plane = 0 ; plane < this.F ; ++plane) {
			for (int x = 0 ; x < this.n ; ++x) {
				for (int y = 0 ; y < this.s ; ++y) {
					me class_me = this.a[plane][x][y];
					if (class_me != null) {
						t class_t = class_me.R;
						if (class_t != null && class_t.c instanceof kc) {
							kc class_kc = (kc) class_t.c;
							this.a(class_kc, plane, x, y, 1, 1);
							if (class_t.u instanceof kc) {
								kc var10 = (kc) class_t.u;
								this.a(var10, plane, x, y, 1, 1);
								kc.a(class_kc, var10, 0, 0, 0, false);
								class_t.u = var10.a(var10.Lb, var10.xb, i, i1, i2);
							}

							class_t.c = class_kc.a(class_kc.Lb, class_kc.xb, i, i1, i2);
						}

						kc var11;
						for (int var12 = 0 ; var12 < class_me.ab ; ++var12) {
							la var13 = class_me.gb[var12];
							if (var13 != null && var13.y instanceof kc) {
								var11 = (kc) var13.y;
								this.a(var11, plane, x, y, var13.int_e - var13.f + 1, var13.p - var13.z + 1);
								var13.y = var11.a(var11.Lb, var11.xb, i, i1, i2);
							}
						}

						ra var14 = class_me.U;
						if (var14 != null && var14.n instanceof kc) {
							var11 = (kc) var14.n;
							this.a(var11, plane, x, y);
							var14.n = var11.a(var11.Lb, var11.xb, i, i1, i2);
						}
					}
				}
			}
		}

	}

	private boolean h (int var1, int var2, int var3) {
		for (int var4 = 0 ; var4 < x ; ++var4) {
			qe var5 = D[var4];
			int var6;
			int var7;
			int var8;
			int var9;
			int var10;
			if (var5.q == 1) {
				var6 = var5.c - var1;
				if (var6 > 0) {
					var7 = var5.w + (var5.o * var6 >> 8);
					var8 = var5.f + (var5.J * var6 >> 8);
					var9 = var5.m + (var5.i * var6 >> 8);
					var10 = var5.a + (var5.j * var6 >> 8);
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.q == 2) {
				var6 = var1 - var5.c;
				if (var6 > 0) {
					var7 = var5.w + (var5.o * var6 >> 8);
					var8 = var5.f + (var5.J * var6 >> 8);
					var9 = var5.m + (var5.i * var6 >> 8);
					var10 = var5.a + (var5.j * var6 >> 8);
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.q == 3) {
				var6 = var5.w - var3;
				if (var6 > 0) {
					var7 = var5.c + (var5.l * var6 >> 8);
					var8 = var5.b + (var5.A * var6 >> 8);
					var9 = var5.m + (var5.i * var6 >> 8);
					var10 = var5.a + (var5.j * var6 >> 8);
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.q == 4) {
				var6 = var3 - var5.w;
				if (var6 > 0) {
					var7 = var5.c + (var5.l * var6 >> 8);
					var8 = var5.b + (var5.A * var6 >> 8);
					var9 = var5.m + (var5.i * var6 >> 8);
					var10 = var5.a + (var5.j * var6 >> 8);
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.q == 5) {
				var6 = var2 - var5.m;
				if (var6 > 0) {
					var7 = var5.c + (var5.l * var6 >> 8);
					var8 = var5.b + (var5.A * var6 >> 8);
					var9 = var5.w + (var5.o * var6 >> 8);
					var10 = var5.f + (var5.J * var6 >> 8);
					if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
						return true;
					}
				}
			}
		}

		return false;
	}

	private void a () {
		int var1 = i[R];
		qe[] var2 = m[R];
		x = 0;

		for (int var3 = 0 ; var3 < var1 ; ++var3) {
			qe var4 = var2[var3];
			int var5;
			int var6;
			int var7;
			boolean var8;
			int var9;
			if (var4.int_v == 1) {
				var5 = var4.e - C + 25;
				if (var5 >= 0 && var5 <= 50) {
					var6 = var4.int_s - S + 25;
					if (var6 < 0) {
						var6 = 0;
					}

					var7 = var4.u - S + 25;
					if (var7 > 50) {
						var7 = 50;
					}

					var8 = false;

					while (var6 <= var7) {
						if (bb[var5][var6++]) {
							var8 = true;
							break;
						}
					}

					if (var8) {
						var9 = B - var4.c;
						if (var9 > 32) {
							var4.q = 1;
						} else {
							if (var9 >= -32) {
								continue;
							}

							var4.q = 2;
							var9 = -var9;
						}

						var4.o = (var4.w - P << 8) / var9;
						var4.J = (var4.f - P << 8) / var9;
						var4.i = (var4.m - E << 8) / var9;
						var4.j = (var4.a - E << 8) / var9;
						D[x++] = var4;
					}
				}
			} else if (var4.int_v == 2) {
				var5 = var4.int_s - S + 25;
				if (var5 >= 0 && var5 <= 50) {
					var6 = var4.e - C + 25;
					if (var6 < 0) {
						var6 = 0;
					}

					var7 = var4.int_n - C + 25;
					if (var7 > 50) {
						var7 = 50;
					}

					var8 = false;

					while (var6 <= var7) {
						if (bb[var6++][var5]) {
							var8 = true;
							break;
						}
					}

					if (var8) {
						var9 = P - var4.w;
						if (var9 > 32) {
							var4.q = 3;
						} else {
							if (var9 >= -32) {
								continue;
							}

							var4.q = 4;
							var9 = -var9;
						}

						var4.l = (var4.c - B << 8) / var9;
						var4.A = (var4.b - B << 8) / var9;
						var4.i = (var4.m - E << 8) / var9;
						var4.j = (var4.a - E << 8) / var9;
						D[x++] = var4;
					}
				}
			} else if (var4.int_v == 4) {
				var5 = var4.m - E;
				if (var5 > 128) {
					var6 = var4.int_s - S + 25;
					if (var6 < 0) {
						var6 = 0;
					}

					var7 = var4.u - S + 25;
					if (var7 > 50) {
						var7 = 50;
					}

					if (var6 <= var7) {
						int var13 = var4.e - C + 25;
						if (var13 < 0) {
							var13 = 0;
						}

						var9 = var4.int_n - C + 25;
						if (var9 > 50) {
							var9 = 50;
						}

						boolean var10 = false;

						label108:
						for (int var11 = var13 ; var11 <= var9 ; ++var11) {
							for (int var12 = var6 ; var12 <= var7 ; ++var12) {
								if (bb[var11][var12]) {
									var10 = true;
									break label108;
								}
							}
						}

						if (var10) {
							var4.q = 5;
							var4.l = (var4.c - B << 8) / var5;
							var4.A = (var4.b - B << 8) / var5;
							var4.o = (var4.w - P << 8) / var5;
							var4.J = (var4.f - P << 8) / var5;
							D[x++] = var4;
						}
					}
				}
			}
		}

	}

	final boolean a (int var1, int var2, int var3, int var4, int var5, ha var6, int var7, int var8, boolean var9) {
		if (var6 == null) {
			return true;
		} else {
			int var10 = var2 - var5;
			int var11 = var3 - var5;
			int var12 = var2 + var5;
			int var13 = var3 + var5;
			if (var9) {
				if (var7 > 640 && var7 < 1408) {
					var13 += 128;
				}

				if (var7 > 1152 && var7 < 1920) {
					var12 += 128;
				}

				if (var7 > 1664 || var7 < 384) {
					var11 -= 128;
				}

				if (var7 > 128 && var7 < 896) {
					var10 -= 128;
				}
			}

			var10 /= 128;
			var11 /= 128;
			var12 /= 128;
			var13 /= 128;
			return this
					.a(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
		}
	}

	final void c () {
		for (int plane = 0 ; plane < this.F ; ++plane) {
			for (int mapX = 0 ; mapX < this.n ; ++mapX) {
				for (int mapY = 0 ; mapY < this.s ; ++mapY) {
					this.a[plane][mapX][mapY] = null;
				}
			}
		}

		for (int plane = 0 ; plane < int_v ; ++plane) {
			for (int i1 = 0 ; i1 < ua.i[plane] ; ++i1) {
				m[plane][i1] = null;
			}

			ua.i[plane] = 0;
		}

		for (int i = 0 ; i < this.q ; ++i) {
			this.c[i] = null;
		}

		this.q = 0;

		for (int i = 0 ; i < b.length ; ++i) {
			b[i] = null;
		}
	}

	final void j (int var1, int var2, int var3) {
		me var4 = this.a[var1][var2][var3];
		if (var4 != null) {
			var4.U = null;
		}
	}

	final void a (int var1, int var2, int var3, int var4, ha var5, int var6, ha var7, ha var8) {
		mb var9 = new mb();
		var9.f = var5;
		var9.g = var2 * 128 + 64;
		var9.u = var3 * 128 + 64;
		var9.n = var4;
		var9.w = var6;
		var9.k = var7;
		var9.j = var8;
		int var10 = 0;
		me var11 = this.a[var1][var2][var3];
		if (var11 != null) {
			for (int var12 = 0 ; var12 < var11.ab ; ++var12) {
				if ((var11.gb[var12].o & 256) == 256 && var11.gb[var12].y instanceof ue) {
					ue var13 = (ue) var11.gb[var12].y;
					var13.d();
					if (var13.int_qb > var10) {
						var10 = var13.int_qb;
					}
				}
			}
		}

		var9.d = var10;
		if (this.a[var1][var2][var3] == null) {
			this.a[var1][var2][var3] = new me(var1, var2, var3);
		}

		this.a[var1][var2][var3].Y = var9;
	}

	private boolean k (int var1, int var2, int var3) {
		int var4 = this.p[var1][var2][var3];
		if (var4 == -j) {
			return false;
		} else if (var4 == j) {
			return true;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			if (this.h(var5 + 1, this.J[var1][var2][var3], var6 + 1) && this
					.h(var5 + 128 - 1, this.J[var1][var2 + 1][var3], var6 + 1) && this
					.h(var5 + 128 - 1, this.J[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this
					.h(var5 + 1, this.J[var1][var2][var3 + 1], var6 + 128 - 1)) {
				this.p[var1][var2][var3] = j;
				return true;
			} else {
				this.p[var1][var2][var3] = -j;
				return false;
			}
		}
	}

	final void a (int var1, int var2, int var3, int var4, ha var5, int var6, int var7) {
		if (var5 != null) {
			ra var8 = new ra();
			var8.n = var5;
			var8.k = var2 * 128 + 64;
			var8.v = var3 * 128 + 64;
			var8.int_s = var4;
			var8.p = var6;
			var8.d = var7;
			if (this.a[var1][var2][var3] == null) {
				this.a[var1][var2][var3] = new me(var1, var2, var3);
			}

			this.a[var1][var2][var3].U = var8;
		}
	}

	final la l (int var1, int var2, int var3) {
		me var4 = this.a[var1][var2][var3];
		if (var4 == null) {
			return null;
		} else {
			for (int var5 = 0 ; var5 < var4.ab ; ++var5) {
				la var6 = var4.gb[var5];
				if ((var6.k >> 29 & 3) == 2 && var6.f == var2 && var6.z == var3) {
					return var6;
				}
			}

			return null;
		}
	}

	private boolean c (int var1, int var2, int var3, int var4) {
		if (!this.k(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			return this.h(var5 + 1, this.J[var1][var2][var3] - var4, var6 + 1) && this
					.h(var5 + 128 - 1, this.J[var1][var2 + 1][var3] - var4, var6 + 1) && this
					.h(var5 + 128 - 1, this.J[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this
					.h(var5 + 1, this.J[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
		}
	}

	final void m (int var1, int var2, int var3) {
		me var4 = this.a[var1][var2][var3];
		if (var4 != null) {
			var4.fb = null;
		}
	}

	final t n (int var1, int var2, int var3) {
		me var4 = this.a[var1][var2][var3];
		return var4 == null ? null : var4.R;
	}

	final void d () {
		for (int var1 = 0 ; var1 < this.q ; ++var1) {
			la var2 = this.c[var1];
			this.a(var2);
			this.c[var1] = null;
		}

		this.q = 0;
	}

	private void a (kc var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true;
		int var8 = var3;
		int var9 = var3 + var5;
		int var10 = var4 - 1;
		int var11 = var4 + var6;

		for (int var12 = var2 ; var12 <= var2 + 1 ; ++var12) {
			if (var12 != this.F) {
				for (int var13 = var8 ; var13 <= var9 ; ++var13) {
					if (var13 >= 0 && var13 < this.n) {
						for (int var14 = var10 ; var14 <= var11 ; ++var14) {
							if (var14 >= 0 && var14 < this.s && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var13 != var3)) {
								me var15 = this.a[var12][var13][var14];
								if (var15 != null) {
									int var16 = (this.J[var12][var13][var14] + this.J[var12][var13 + 1][var14] + this.J[var12][var13][var14 + 1] + this.J[var12][var13 + 1][var14 + 1]) / 4 - (this.J[var2][var3][var4] + this.J[var2][var3 + 1][var4] + this.J[var2][var3][var4 + 1] + this.J[var2][var3 + 1][var4 + 1]) / 4;
									t var17 = var15.R;
									if (var17 != null) {
										kc var18;
										if (var17.c instanceof kc) {
											var18 = (kc) var17.c;
											kc.a(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
										}

										if (var17.u instanceof kc) {
											var18 = (kc) var17.u;
											kc.a(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
										}
									}

									for (int var23 = 0 ; var23 < var15.ab ; ++var23) {
										la var19 = var15.gb[var23];
										if (var19 != null && var19.y instanceof kc) {
											kc var20 = (kc) var19.y;
											int var21 = var19.int_e - var19.f + 1;
											int var22 = var19.p - var19.z + 1;
											kc.a(var1, var20, (var19.f - var3) * 128 + (var21 - var5) * 64, var16, (var19.z - var4) * 128 + (var22 - var6) * 64, var7);
										}
									}
								}
							}
						}
					}
				}

				--var8;
				var7 = false;
			}
		}

	}

	final int o (int plane, int x, int y) {
		me class_me = this.a[plane][x][y];
		if (class_me == null) {
			return 0;
		} else {
			for (int index = 0 ; index < class_me.ab ; ++index) {
				la class_la = class_me.gb[index];
				if ((class_la.k >> 29 & 3) == 2 && class_la.f == x && class_la.z == y) {
					return class_la.k;
				}
			}

			return 0;
		}
	}

	final void a (int var1, int var2, int var3, int var4, ha var5, ha var6, int var7, int var8, int var9, int var10) {
		if (var5 != null || var6 != null) {
			t var11 = new t();
			var11.w = var9;
			var11.p = var10;
			var11.x = var2 * 128 + 64;
			var11.y = var3 * 128 + 64;
			var11.n = var4;
			var11.c = var5;
			var11.u = var6;
			var11.b = var7;
			var11.z = var8;

			for (int var12 = var1 ; var12 >= 0 ; --var12) {
				if (this.a[var12][var2][var3] == null) {
					this.a[var12][var2][var3] = new me(var12, var2, var3);
				}
			}

			this.a[var1][var2][var3].R = var11;
		}
	}

	final void d (int plane, int x, int y, int i) {
		me class_me = this.a[plane][x][y];
		if (class_me != null) {
			this.a[plane][x][y].mb = i;
		}
	}

	private void a (me var1, boolean var2) {
		md_u.a(var1, (byte) 118);

		while (true) {
			me var3 = (me) md_u.d(-127);
			if (var3 == null) {
				return;
			}

			if (var3.hb) {
				int var4 = var3.N;
				int var5 = var3.jb;
				int var6 = var3.O;
				int var7 = var3.eb;
				me[][] var8 = this.a[var6];
				me var9;
				int var11;
				la var12;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				int var23;
				boolean var24;
				me var35;
				if (var3.Z) {
					if (var2) {
						if (var6 > 0) {
							var9 = this.a[var6 - 1][var4][var5];
							if (var9 != null && var9.hb) {
								continue;
							}
						}

						if (var4 <= C && var4 > z) {
							var9 = var8[var4 - 1][var5];
							if (var9 != null && var9.hb && (var9.Z || (var3.bb & 1) == 0)) {
								continue;
							}
						}

						if (var4 >= C && var4 < y - 1) {
							var9 = var8[var4 + 1][var5];
							if (var9 != null && var9.hb && (var9.Z || (var3.bb & 4) == 0)) {
								continue;
							}
						}

						if (var5 <= S && var5 > G) {
							var9 = var8[var4][var5 - 1];
							if (var9 != null && var9.hb && (var9.Z || (var3.bb & 8) == 0)) {
								continue;
							}
						}

						if (var5 >= S && var5 < H - 1) {
							var9 = var8[var4][var5 + 1];
							if (var9 != null && var9.hb && (var9.Z || (var3.bb & 2) == 0)) {
								continue;
							}
						}
					} else {
						var2 = true;
					}

					var3.Z = false;
					if (var3.P != null) {
						var9 = var3.P;
						if (var9.S != null) {
							if (!this.k(0, var4, var5)) {
								this.a(var9.S, 0, h, A, d, N, var4, var5);
							}
						} else if (var9.V != null && !this.k(0, var4, var5)) {
							this.a(var9.V, h, A, d, N, var4, var5);
						}

						t var10 = var9.R;
						if (var10 != null) {
							var10.c.a(0, h, A, d, N, var10.x - B, var10.n - E, var10.y - P, var10.w);
						}

						for (var11 = 0; var11 < var9.ab ; ++var11) {
							var12 = var9.gb[var11];
							if (var12 != null) {
								var12.y.a(var12.A, h, A, d, N, var12.h - B, var12.d - E, var12.int_a - P, var12.k);
							}
						}
					}

					var24 = false;
					if (var3.S != null) {
						if (!this.k(var7, var4, var5)) {
							var24 = true;
							if (var3.S.i != 12345678 || g && var6 <= K) {
								this.a(var3.S, var7, h, A, d, N, var4, var5);
							}
						}
					} else if (var3.V != null && !this.k(var7, var4, var5)) {
						var24 = true;
						this.a(var3.V, h, A, d, N, var4, var5);
					}

					var23 = 0;
					var11 = 0;
					t var25 = var3.R;
					bc var13 = var3.fb;
					if (var25 != null || var13 != null) {
						if (C == var4) {
							++var23;
						} else if (C < var4) {
							var23 += 2;
						}

						if (S == var5) {
							var23 += 3;
						} else if (S > var5) {
							var23 += 6;
						}

						var11 = U[var23];
						var3.kb = V[var23];
					}

					if (var25 != null) {
						if ((var25.b & ab[var23]) != 0) {
							if (var25.b == 16) {
								var3.ib = 3;
								var3.X = W[var23];
								var3.W = 3 - var3.X;
							} else if (var25.b == 32) {
								var3.ib = 6;
								var3.X = Z[var23];
								var3.W = 6 - var3.X;
							} else if (var25.b == 64) {
								var3.ib = 12;
								var3.X = cb[var23];
								var3.W = 12 - var3.X;
							} else {
								var3.ib = 9;
								var3.X = db[var23];
								var3.W = 9 - var3.X;
							}
						} else {
							var3.ib = 0;
						}

						if ((var25.b & var11) != 0 && !this.a(var7, var4, var5, var25.b)) {
							var25.c.a(0, h, A, d, N, var25.x - B, var25.n - E, var25.y - P, var25.w);
						}

						if ((var25.z & var11) != 0 && !this.a(var7, var4, var5, var25.z)) {
							var25.u.a(0, h, A, d, N, var25.x - B, var25.n - E, var25.y - P, var25.w);
						}
					}

					if (var13 != null && !this.c(var7, var4, var5, var13.m.int_qb)) {
						if ((var13.C & var11) != 0) {
							var13.m.a(var13.f, h, A, d, N, var13.F - B, var13.h - E, var13.B - P, var13.int_b);
						} else if ((var13.C & 768) != 0) {
							var14 = var13.F - B;
							var15 = var13.h - E;
							var16 = var13.B - P;
							var17 = var13.f;
							if (var17 != 1 && var17 != 2) {
								var18 = var14;
							} else {
								var18 = -var14;
							}

							if (var17 != 2 && var17 != 3) {
								var19 = var16;
							} else {
								var19 = -var16;
							}

							int var20;
							int var21;
							if ((var13.C & 256) != 0 && var19 < var18) {
								var20 = var14 + t[var17];
								var21 = var16 + l[var17];
								var13.m.a(var17 * 512 + 256, h, A, d, N, var20, var15, var21, var13.int_b);
							}

							if ((var13.C & 512) != 0 && var19 > var18) {
								var20 = var14 + Q[var17];
								var21 = var16 + I[var17];
								var13.m.a(var17 * 512 + 1280 & 2047, h, A, d, N, var20, var15, var21, var13.int_b);
							}
						}
					}

					if (var24) {
						ra var30 = var3.U;
						if (var30 != null) {
							var30.n.a(0, h, A, d, N, var30.k - B, var30.int_s - E, var30.v - P, var30.p);
						}

						mb var34 = var3.Y;
						if (var34 != null && var34.d == 0) {
							if (var34.k != null) {
								var34.k.a(0, h, A, d, N, var34.g - B, var34.n - E, var34.u - P, var34.w);
							}

							if (var34.j != null) {
								var34.j.a(0, h, A, d, N, var34.g - B, var34.n - E, var34.u - P, var34.w);
							}

							if (var34.f != null) {
								var34.f.a(0, h, A, d, N, var34.g - B, var34.n - E, var34.u - P, var34.w);
							}
						}
					}

					var14 = var3.bb;
					if (var14 != 0) {
						if (var4 < C && (var14 & 4) != 0) {
							var35 = var8[var4 + 1][var5];
							if (var35 != null && var35.hb) {
								md_u.a(var35, (byte) 108);
							}
						}

						if (var5 < S && (var14 & 2) != 0) {
							var35 = var8[var4][var5 + 1];
							if (var35 != null && var35.hb) {
								md_u.a(var35, (byte) -18);
							}
						}

						if (var4 > C && (var14 & 1) != 0) {
							var35 = var8[var4 - 1][var5];
							if (var35 != null && var35.hb) {
								md_u.a(var35, (byte) -46);
							}
						}

						if (var5 > S && (var14 & 8) != 0) {
							var35 = var8[var4][var5 - 1];
							if (var35 != null && var35.hb) {
								md_u.a(var35, (byte) 119);
							}
						}
					}
				}

				t var26;
				if (var3.ib != 0) {
					var24 = true;

					for (var23 = 0; var23 < var3.ab ; ++var23) {
						if (var3.gb[var23].n != j && (var3.M[var23] & var3.ib) == var3.X) {
							var24 = false;
							break;
						}
					}

					if (var24) {
						var26 = var3.R;
						if (!this.a(var7, var4, var5, var26.b)) {
							var26.c.a(0, h, A, d, N, var26.x - B, var26.n - E, var26.y - P, var26.w);
						}

						var3.ib = 0;
					}
				}

				int var27;
				int var29;
				if (var3.db) {
					try {
						int var28 = var3.ab;
						var3.db = false;
						var23 = 0;

						label551:
						for (var11 = 0; var11 < var28 ; ++var11) {
							var12 = var3.gb[var11];
							if (var12.n != j) {
								for (var29 = var12.f; var29 <= var12.int_e ; ++var29) {
									for (var14 = var12.z; var14 <= var12.p ; ++var14) {
										var35 = var8[var29][var14];
										if (var35.Z) {
											var3.db = true;
											continue label551;
										}

										if (var35.ib != 0) {
											var16 = 0;
											if (var29 > var12.f) {
												++var16;
											}

											if (var29 < var12.int_e) {
												var16 += 4;
											}

											if (var14 > var12.z) {
												var16 += 8;
											}

											if (var14 < var12.p) {
												var16 += 2;
											}

											if ((var16 & var35.ib) == var3.W) {
												var3.db = true;
												continue label551;
											}
										}
									}
								}

								b[var23++] = var12;
								var14 = C - var12.f;
								var15 = var12.int_e - C;
								if (var15 > var14) {
									var14 = var15;
								}

								var16 = S - var12.z;
								var17 = var12.p - S;
								if (var17 > var16) {
									var12.c = var14 + var17;
								} else {
									var12.c = var14 + var16;
								}
							}
						}

						while (var23 > 0) {
							var27 = -50;
							var29 = -1;

							la var36;
							for (var14 = 0; var14 < var23 ; ++var14) {
								var36 = b[var14];
								if (var36.n != j) {
									if (var36.c > var27) {
										var27 = var36.c;
										var29 = var14;
									} else if (var36.c == var27) {
										var16 = var36.h - B;
										var17 = var36.int_a - P;
										var18 = b[var29].h - B;
										var19 = b[var29].int_a - P;
										if (var16 * var16 + var17 * var17 > var18 * var18 + var19 * var19) {
											var29 = var14;
										}
									}
								}
							}

							if (var29 == -1) {
								break;
							}

							var36 = b[var29];
							var36.n = j;
							if (!this.a(var7, var36.f, var36.int_e, var36.z, var36.p, var36.y.int_qb)) {
								var36.y.a(var36.A, h, A, d, N, var36.h - B, var36.d - E, var36.int_a - P, var36.k);
							}

							for (var16 = var36.f; var16 <= var36.int_e ; ++var16) {
								for (var17 = var36.z; var17 <= var36.p ; ++var17) {
									me var37 = var8[var16][var17];
									if (var37.ib != 0) {
										md_u.a(var37, (byte) 102);
									} else if ((var16 != var4 || var17 != var5) && var37.hb) {
										md_u.a(var37, (byte) 104);
									}
								}
							}
						}

						if (var3.db) {
							continue;
						}
					} catch (Exception var22) {
						var3.db = false;
					}
				}

				if (var3.hb && var3.ib == 0) {
					if (var4 <= C && var4 > z) {
						var9 = var8[var4 - 1][var5];
						if (var9 != null && var9.hb) {
							continue;
						}
					}

					if (var4 >= C && var4 < y - 1) {
						var9 = var8[var4 + 1][var5];
						if (var9 != null && var9.hb) {
							continue;
						}
					}

					if (var5 <= S && var5 > G) {
						var9 = var8[var4][var5 - 1];
						if (var9 != null && var9.hb) {
							continue;
						}
					}

					if (var5 >= S && var5 < H - 1) {
						var9 = var8[var4][var5 + 1];
						if (var9 != null && var9.hb) {
							continue;
						}
					}

					var3.hb = false;
					--M;
					mb var32 = var3.Y;
					if (var32 != null && var32.d != 0) {
						if (var32.k != null) {
							var32.k.a(0, h, A, d, N, var32.g - B, var32.n - E - var32.d, var32.u - P, var32.w);
						}

						if (var32.j != null) {
							var32.j.a(0, h, A, d, N, var32.g - B, var32.n - E - var32.d, var32.u - P, var32.w);
						}

						if (var32.f != null) {
							var32.f.a(0, h, A, d, N, var32.g - B, var32.n - E - var32.d, var32.u - P, var32.w);
						}
					}

					if (var3.kb != 0) {
						bc var31 = var3.fb;
						if (var31 != null && !this.c(var7, var4, var5, var31.m.int_qb)) {
							if ((var31.C & var3.kb) != 0) {
								var31.m.a(var31.f, h, A, d, N, var31.F - B, var31.h - E, var31.B - P, var31.int_b);
							} else if ((var31.C & 768) != 0) {
								var11 = var31.F - B;
								var27 = var31.h - E;
								var29 = var31.B - P;
								var14 = var31.f;
								if (var14 != 1 && var14 != 2) {
									var15 = var11;
								} else {
									var15 = -var11;
								}

								if (var14 != 2 && var14 != 3) {
									var16 = var29;
								} else {
									var16 = -var29;
								}

								if ((var31.C & 256) != 0 && var16 >= var15) {
									var17 = var11 + t[var14];
									var18 = var29 + l[var14];
									var31.m.a(var14 * 512 + 256, h, A, d, N, var17, var27, var18, var31.int_b);
								}

								if ((var31.C & 512) != 0 && var16 <= var15) {
									var17 = var11 + Q[var14];
									var18 = var29 + I[var14];
									var31.m.a(var14 * 512 + 1280 & 2047, h, A, d, N, var17, var27, var18, var31.int_b);
								}
							}
						}

						var26 = var3.R;
						if (var26 != null) {
							if ((var26.z & var3.kb) != 0 && !this.a(var7, var4, var5, var26.z)) {
								var26.u.a(0, h, A, d, N, var26.x - B, var26.n - E, var26.y - P, var26.w);
							}

							if ((var26.b & var3.kb) != 0 && !this.a(var7, var4, var5, var26.b)) {
								var26.c.a(0, h, A, d, N, var26.x - B, var26.n - E, var26.y - P, var26.w);
							}
						}
					}

					me var33;
					if (var6 < this.F - 1) {
						var33 = this.a[var6 + 1][var4][var5];
						if (var33 != null && var33.hb) {
							md_u.a(var33, (byte) 89);
						}
					}

					if (var4 < C) {
						var33 = var8[var4 + 1][var5];
						if (var33 != null && var33.hb) {
							md_u.a(var33, (byte) -72);
						}
					}

					if (var5 < S) {
						var33 = var8[var4][var5 + 1];
						if (var33 != null && var33.hb) {
							md_u.a(var33, (byte) 95);
						}
					}

					if (var4 > C) {
						var33 = var8[var4 - 1][var5];
						if (var33 != null && var33.hb) {
							md_u.a(var33, (byte) -32);
						}
					}

					if (var5 > S) {
						var33 = var8[var4][var5 - 1];
						if (var33 != null && var33.hb) {
							md_u.a(var33, (byte) 105);
						}
					}
				}
			}
		}
	}

	final void a (int plane) {
		this.e = plane;
		for (int x = 0 ; x < this.n ; ++x) {
			for (int y = 0 ; y < this.s ; ++y) {
				if (this.a[plane][x][y] == null) {
					this.a[plane][x][y] = new me(plane, x, y);
				}
			}
		}
	}

	private boolean a (int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (var2 < var3 && var2 < var4 && var2 < var5) {
			return false;
		} else if (var2 > var3 && var2 > var4 && var2 > var5) {
			return false;
		} else if (var1 < var6 && var1 < var7 && var1 < var8) {
			return false;
		} else if (var1 > var6 && var1 > var7 && var1 > var8) {
			return false;
		} else {
			int var9 = (var2 - var3) * (var7 - var6) - (var1 - var6) * (var4 - var3);
			int var10 = (var2 - var5) * (var6 - var8) - (var1 - var8) * (var3 - var5);
			int var11 = (var2 - var4) * (var8 - var7) - (var1 - var7) * (var5 - var4);
			return var9 * var11 > 0 && var11 * var10 > 0;
		}
	}

	final int p (int plane, int x, int y) {
		me class_me = this.a[plane][x][y];
		return class_me != null && class_me.R != null ? class_me.R.w : 0;
	}

	final int q (int plane, int x, int y) {
		me class_me = this.a[plane][x][y];
		return class_me != null && class_me.U != null ? class_me.U.p : 0;
	}

	private boolean a (int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, ha var9,
					   int var10, boolean var11, int var12, int var13) {
		for (int var14 = var2 ; var14 < var2 + var4 ; ++var14) {
			for (int var15 = var3 ; var15 < var3 + var5 ; ++var15) {
				if (var14 < 0 || var15 < 0 || var14 >= this.n || var15 >= this.s) {
					return false;
				}

				me var16 = this.a[var1][var14][var15];
				if (var16 != null && var16.ab >= 5) {
					return false;
				}
			}
		}

		la var21 = new la();
		var21.k = var12;
		var21.o = var13;
		var21.g = var1;
		var21.h = var6;
		var21.int_a = var7;
		var21.d = var8;
		var21.y = var9;
		var21.A = var10;
		var21.f = var2;
		var21.z = var3;
		var21.int_e = var2 + var4 - 1;
		var21.p = var3 + var5 - 1;

		for (int var22 = var2 ; var22 < var2 + var4 ; ++var22) {
			for (int var17 = var3 ; var17 < var3 + var5 ; ++var17) {
				int var18 = 0;
				if (var22 > var2) {
					++var18;
				}

				if (var22 < var2 + var4 - 1) {
					var18 += 4;
				}

				if (var17 > var3) {
					var18 += 8;
				}

				if (var17 < var3 + var5 - 1) {
					var18 += 2;
				}

				for (int var19 = var1 ; var19 >= 0 ; --var19) {
					if (this.a[var19][var22][var17] == null) {
						this.a[var19][var22][var17] = new me(var19, var22, var17);
					}
				}

				me var20 = this.a[var1][var22][var17];
				var20.gb[var20.ab] = var21;
				var20.M[var20.ab] = var18;
				var20.bb |= var18;
				++var20.ab;
			}
		}

		if (var11) {
			this.c[this.q++] = var21;
		}

		return true;
	}

	final void a (int i, int i1, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
		nb class_nb;
		int index;
		if (i3 == 0) {
			class_nb = new nb(i10, i11, i12, i13, -1, i18, false);

			for (index = i; index >= 0 ; --index) {
				if (this.a[index][i1][i2] == null) {
					this.a[index][i1][i2] = new me(index, i1, i2);
				}
			}

			this.a[i][i1][i2].S = class_nb;
		} else if (i3 != 1) {
			ob class_ob = new ob(i3, i4, i5, i1, i2, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19);

			for (index = i; index >= 0 ; --index) {
				if (this.a[index][i1][i2] == null) {
					this.a[index][i1][i2] = new me(index, i1, i2);
				}
			}

			this.a[i][i1][i2].V = class_ob;
		} else {
			class_nb = new nb(i14, i15, i16, i17, i5, i19, i6 == i7 && i6 == i8 && i6 == i9);

			for (index = i; index >= 0 ; --index) {
				if (this.a[index][i1][i2] == null) {
					this.a[index][i1][i2] = new me(index, i1, i2);
				}
			}

			this.a[i][i1][i2].S = class_nb;
		}
	}

	final void a (int[] data, int pointer, int unused, int plane, int x, int y) {
		me class_me = this.a[plane][x][y];
		if (class_me != null) {
			nb class_nb = class_me.S;
			int i;
			if (class_nb == null) {
				ob class_ob = class_me.V;
				if (class_ob != null) {
					i = class_ob.m;
					int i1 = class_ob.n;
					int i2 = class_ob.g;
					int i3 = class_ob.h;
					int[] ints = this.L[i];
					int[] ints1 = this.O[i1];
					int i4 = 0;
					if (i2 != 0) {
						for (int i6 = 0; i6 < 4 ; ++i6) {
							data[pointer] = ints[ints1[i4++]] == 0 ? i2 : i3;
							data[pointer + 1] = ints[ints1[i4++]] == 0 ? i2 : i3;
							data[pointer + 2] = ints[ints1[i4++]] == 0 ? i2 : i3;
							data[pointer + 3] = ints[ints1[i4++]] == 0 ? i2 : i3;
							pointer += 512;
						}

					} else {
						for (int i6 = 0; i6 < 4 ; ++i6) {
							if (ints[ints1[i4++]] != 0) {
								data[pointer] = i3;
							}

							if (ints[ints1[i4++]] != 0) {
								data[pointer + 1] = i3;
							}

							if (ints[ints1[i4++]] != 0) {
								data[pointer + 2] = i3;
							}

							if (ints[ints1[i4++]] != 0) {
								data[pointer + 3] = i3;
							}

							pointer += 512;
						}

					}
				}
			} else {
				int i1 = class_nb.q;
				if (i1 != 0) {
					for (i = 0; i < 4 ; ++i) {
						data[pointer] = i1;
						data[pointer + 1] = i1;
						data[pointer + 2] = i1;
						data[pointer + 3] = i1;
						pointer += 512;
					}
				}
			}
		}
	}

	final void b (int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 < 0) {
			var1 = 0;
		} else if (var1 >= this.n * 128) {
			var1 = this.n * 128 - 1;
		}

		if (var3 < 0) {
			var3 = 0;
		} else if (var3 >= this.s * 128) {
			var3 = this.s * 128 - 1;
		}

		++j;
		h = v.pb[var4];
		A = v.wb[var4];
		d = v.pb[var5];
		N = v.wb[var5];
		bb = fb[(var4 - 128) / 32][var5 / 64];
		B = var1;
		E = var2;
		P = var3;
		C = var1 / 128;
		S = var3 / 128;
		R = var6;
		z = C - 25;
		if (z < 0) {
			z = 0;
		}

		G = S - 25;
		if (G < 0) {
			G = 0;
		}

		y = C + 25;
		if (y > this.n) {
			y = this.n;
		}

		H = S + 25;
		if (H > this.s) {
			H = this.s;
		}

		this.a();
		M = 0;

		int var9;
		int var10;
		for (int var7 = this.e ; var7 < this.F ; ++var7) {
			me[][] var8 = this.a[var7];

			for (var9 = z; var9 < y ; ++var9) {
				for (var10 = G; var10 < H ; ++var10) {
					me var11 = var8[var9][var10];
					if (var11 != null) {
						if (var11.mb <= var6 && (bb[var9 - C + 25][var10 - S + 25] || this.J[var7][var9][var10] - var2 >= 2000)) {
							var11.Z = true;
							var11.hb = true;
							if (var11.ab > 0) {
								var11.db = true;
							} else {
								var11.db = false;
							}

							++M;
						} else {
							var11.Z = false;
							var11.hb = false;
							var11.ib = 0;
						}
					}
				}
			}
		}

		int var12;
		int var13;
		int var14;
		int var15;
		int var21;
		for (int var18 = this.e ; var18 < this.F ; ++var18) {
			me[][] var19 = this.a[var18];

			for (var10 = -25; var10 <= 0 ; ++var10) {
				var21 = C + var10;
				var12 = C - var10;
				if (var21 >= z || var12 < y) {
					for (var13 = -25; var13 <= 0 ; ++var13) {
						var14 = S + var13;
						var15 = S - var13;
						me var16;
						if (var21 >= z) {
							if (var14 >= G) {
								var16 = var19[var21][var14];
								if (var16 != null && var16.Z) {
									this.a(var16, true);
								}
							}

							if (var15 < H) {
								var16 = var19[var21][var15];
								if (var16 != null && var16.Z) {
									this.a(var16, true);
								}
							}
						}

						if (var12 < y) {
							if (var14 >= G) {
								var16 = var19[var12][var14];
								if (var16 != null && var16.Z) {
									this.a(var16, true);
								}
							}

							if (var15 < H) {
								var16 = var19[var12][var15];
								if (var16 != null && var16.Z) {
									this.a(var16, true);
								}
							}
						}

						if (M == 0) {
							g = false;
							return;
						}
					}
				}
			}
		}

		for (var9 = this.e; var9 < this.F ; ++var9) {
			me[][] var20 = this.a[var9];

			for (var21 = -25; var21 <= 0 ; ++var21) {
				var12 = C + var21;
				var13 = C - var21;
				if (var12 >= z || var13 < y) {
					for (var14 = -25; var14 <= 0 ; ++var14) {
						var15 = S + var14;
						int var22 = S - var14;
						me var17;
						if (var12 >= z) {
							if (var15 >= G) {
								var17 = var20[var12][var15];
								if (var17 != null && var17.Z) {
									this.a(var17, false);
								}
							}

							if (var22 < H) {
								var17 = var20[var12][var22];
								if (var17 != null && var17.Z) {
									this.a(var17, false);
								}
							}
						}

						if (var13 < y) {
							if (var15 >= G) {
								var17 = var20[var13][var15];
								if (var17 != null && var17.Z) {
									this.a(var17, false);
								}
							}

							if (var22 < H) {
								var17 = var20[var13][var22];
								if (var17 != null && var17.Z) {
									this.a(var17, false);
								}
							}
						}

						if (M == 0) {
							g = false;
							return;
						}
					}
				}
			}
		}

		g = false;
	}

	final void e (int var1, int var2, int var3, int var4) {
		me var5 = this.a[var1][var2][var3];
		if (var5 != null) {
			bc var6 = var5.fb;
			if (var6 != null) {
				int var7 = var2 * 128 + 64;
				int var8 = var3 * 128 + 64;
				var6.F = var7 + (var6.F - var7) * var4 / 16;
				var6.B = var8 + (var6.B - var8) * var4 / 16;
			}
		}
	}

	final void r (int var1, int var2, int var3) {
		g = true;
		K = var1;
		k = var2;
		f = var3;
		o = -1;
		r = -1;
	}
}
