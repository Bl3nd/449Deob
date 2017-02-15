final class ob {
	static int[] j = new int[6];
	static int[] k = new int[6];
	static int[] o = new int[6];
	static int[] p = new int[6];
	static int[] s = new int[6];
	private static int[][] e = new int[][]{
			{1, 3, 5, 7},
			{1, 3, 5, 7},
			{1, 3, 5, 7},
			{1, 3, 5, 7, 6},
			{1, 3, 5, 7, 6},
			{1, 3, 5, 7, 6},
			{1, 3, 5, 7, 6},
			{1, 3, 5, 7, 2, 6},
			{1, 3, 5, 7, 2, 8},
			{1, 3, 5, 7, 2, 8},
			{1, 3, 5, 7, 11, 12},
			{1, 3, 5, 7, 11, 12},
			{1, 3, 5, 7, 13, 14}
	};
	private static int[][] v = new int[][]{
			{0, 1, 2, 3, 0, 0, 1, 3},
			{1, 1, 2, 3, 1, 0, 1, 3},
			{0, 1, 2, 3, 1, 0, 1, 3},
			{0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3},
			{0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4},
			{0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4},
			{0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3},
			{0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3},
			{0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5},
			{0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5},
			{0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3},
			{1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3},
			{1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5}
	};
	boolean a = true;
	int[] b;
	int[] c;
	int[] d;
	int[] f;
	int g;
	int h;
	int[] i;
	int[] l;
	int m;
	int n;
	int[] q;
	int[] r;
	int[] t;
	int[] u;

	ob (int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11,
		int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19) {
		if (var6 != var7 || var6 != var8 || var6 != var9) {
			this.a = false;
		}

		this.m = var1;
		this.n = var2;
		this.g = var18;
		this.h = var19;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = e[var1];
		int var25 = var24.length;
		this.r = new int[var25];
		this.b = new int[var25];
		this.t = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = var4 * var20;
		int var29 = var5 * var20;

		int var32;
		int var33;
		int var34;
		int var35;
		int var36;
		for (int var30 = 0 ; var30 < var25 ; ++var30) {
			int var31 = var24[var30];
			if ((var31 & 1) == 0 && var31 <= 8) {
				var31 = (var31 - var2 - var2 - 1 & 7) + 1;
			}

			if (var31 > 8 && var31 <= 12) {
				var31 = (var31 - 9 - var2 & 3) + 9;
			}

			if (var31 > 12 && var31 <= 16) {
				var31 = (var31 - 13 - var2 & 3) + 13;
			}

			if (var31 == 1) {
				var32 = var28;
				var33 = var29;
				var34 = var6;
				var35 = var10;
				var36 = var14;
			} else if (var31 == 2) {
				var32 = var28 + var21;
				var33 = var29;
				var34 = var6 + var7 >> 1;
				var35 = var10 + var11 >> 1;
				var36 = var14 + var15 >> 1;
			} else if (var31 == 3) {
				var32 = var28 + var20;
				var33 = var29;
				var34 = var7;
				var35 = var11;
				var36 = var15;
			} else if (var31 == 4) {
				var32 = var28 + var20;
				var33 = var29 + var21;
				var34 = var7 + var8 >> 1;
				var35 = var11 + var12 >> 1;
				var36 = var15 + var16 >> 1;
			} else if (var31 == 5) {
				var32 = var28 + var20;
				var33 = var29 + var20;
				var34 = var8;
				var35 = var12;
				var36 = var16;
			} else if (var31 == 6) {
				var32 = var28 + var21;
				var33 = var29 + var20;
				var34 = var8 + var9 >> 1;
				var35 = var12 + var13 >> 1;
				var36 = var16 + var17 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var29 + var20;
				var34 = var9;
				var35 = var13;
				var36 = var17;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var29 + var21;
				var34 = var9 + var6 >> 1;
				var35 = var13 + var10 >> 1;
				var36 = var17 + var14 >> 1;
			} else if (var31 == 9) {
				var32 = var28 + var21;
				var33 = var29 + var22;
				var34 = var6 + var7 >> 1;
				var35 = var10 + var11 >> 1;
				var36 = var14 + var15 >> 1;
			} else if (var31 == 10) {
				var32 = var28 + var23;
				var33 = var29 + var21;
				var34 = var7 + var8 >> 1;
				var35 = var11 + var12 >> 1;
				var36 = var15 + var16 >> 1;
			} else if (var31 == 11) {
				var32 = var28 + var21;
				var33 = var29 + var23;
				var34 = var8 + var9 >> 1;
				var35 = var12 + var13 >> 1;
				var36 = var16 + var17 >> 1;
			} else if (var31 == 12) {
				var32 = var28 + var22;
				var33 = var29 + var21;
				var34 = var9 + var6 >> 1;
				var35 = var13 + var10 >> 1;
				var36 = var17 + var14 >> 1;
			} else if (var31 == 13) {
				var32 = var28 + var22;
				var33 = var29 + var22;
				var34 = var6;
				var35 = var10;
				var36 = var14;
			} else if (var31 == 14) {
				var32 = var28 + var23;
				var33 = var29 + var22;
				var34 = var7;
				var35 = var11;
				var36 = var15;
			} else if (var31 == 15) {
				var32 = var28 + var23;
				var33 = var29 + var23;
				var34 = var8;
				var35 = var12;
				var36 = var16;
			} else {
				var32 = var28 + var22;
				var33 = var29 + var23;
				var34 = var9;
				var35 = var13;
				var36 = var17;
			}

			this.r[var30] = var32;
			this.b[var30] = var34;
			this.t[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var39 = v[var1];
		var32 = var39.length / 4;
		this.d = new int[var32];
		this.u = new int[var32];
		this.l = new int[var32];
		this.f = new int[var32];
		this.c = new int[var32];
		this.i = new int[var32];
		if (var3 != -1) {
			this.q = new int[var32];
		}

		var33 = 0;

		for (var34 = 0; var34 < var32 ; ++var34) {
			var35 = var39[var33];
			var36 = var39[var33 + 1];
			int var37 = var39[var33 + 2];
			int var38 = var39[var33 + 3];
			var33 += 4;
			if (var36 < 4) {
				var36 = var36 - var2 & 3;
			}

			if (var37 < 4) {
				var37 = var37 - var2 & 3;
			}

			if (var38 < 4) {
				var38 = var38 - var2 & 3;
			}

			this.d[var34] = var36;
			this.u[var34] = var37;
			this.l[var34] = var38;
			if (var35 == 0) {
				this.f[var34] = var26[var36];
				this.c[var34] = var26[var37];
				this.i[var34] = var26[var38];
				if (this.q != null) {
					this.q[var34] = -1;
				}
			} else {
				this.f[var34] = var27[var36];
				this.c[var34] = var27[var37];
				this.i[var34] = var27[var38];
				if (this.q != null) {
					this.q[var34] = var3;
				}
			}
		}

		var35 = var6;
		var36 = var7;
		if (var7 < var6) {
			var35 = var7;
		}

		if (var7 > var7) {
			var36 = var7;
		}

		if (var8 < var35) {
			var35 = var8;
		}

		if (var8 > var36) {
			var36 = var8;
		}

		if (var9 < var35) {
			var35 = var9;
		}

		if (var9 > var36) {
			var36 = var9;
		}

		var35 /= 14;
		var36 /= 14;
	}

	public static void a () {
		p = null;
		o = null;
		k = null;
		j = null;
		s = null;
		e = null;
		v = null;
	}
}
