final class qd extends je {
	private static int[] I;
	boolean A = false;
	int[] D;
	int F;
	int G;
	boolean H;
	private int[] z;
	private int B;
	private int[] C;
	private int[] E;
	private int[] K;

	qd (id class_id) {
		this.G = class_id.readUnsignedLEShort(255);
		this.H = class_id.readUnsignedByte((byte) 116) == 1;
		int i = class_id.readUnsignedByte((byte) 116);
		if (i >= 1 && i <= 4) {
			this.E = new int[i];
			for (int index = 0 ; index < i ; ++index) {
				this.E[index] = class_id.readUnsignedLEShort(255);
			}

			int i1;
			if (i > 1) {
				this.K = new int[i - 1];
				for (i1 = 0; i1 < i - 1 ; ++i1) {
					this.K[i1] = class_id.readUnsignedByte((byte) 116);
				}
			}

			if (i > 1) {
				this.C = new int[i - 1];
				for (i1 = 0; i1 < i - 1 ; ++i1) {
					this.C[i1] = class_id.readUnsignedByte((byte) 116);
				}
			}

			this.z = new int[i];
			for (i1 = 0; i1 < i ; ++i1) {
				this.z[i1] = class_id.readInt((byte) -105);
			}

			this.F = class_id.readUnsignedByte((byte) 116);
			this.B = class_id.readUnsignedByte((byte) 116);
			this.D = null;
		} else {
			throw new RuntimeException();
		}
	}

	public static void b () {
		I = null;
	}

	final void a () {
		this.D = null;
	}

	final boolean a (double var1, int var3, pb var4) {
		for (int aE : this.E) {
			if (var4.c(-9464, aE) == null) {
				return false;
			}
		}

		int var6 = var3 * var3;
		this.D = new int[var6 * 4];

		for (int var7 = 0 ; var7 < this.E.length ; ++var7) {
			oa var8 = tb.a((byte) 127, var4, this.E[var7]);
			var8.f();
			byte[] var9 = var8.jb;
			int[] var10 = var8.ib;
			int var11 = this.z[var7];
			int var12;
			int var13;
			int var14;
			int var15;
			if ((var11 & -16777216) == 50331648) {
				var12 = var11 & 16711935;
				var13 = var11 >> 8 & 255;

				for (var14 = 0; var14 < var10.length ; ++var14) {
					var15 = var10[var14];
					if ((var15) == var15 >> 8) {
						var15 &= 255;
						var10[var14] = var12 * var15 >> 8 & 16711935 | var13 * var15 & '\uff00';
					}
				}
			}

			for (var12 = 0; var12 < var10.length ; ++var12) {
				var10[var12] = v.a(var10[var12], var1);
			}

			if (var7 == 0) {
				var13 = 0;
			} else {
				var13 = this.K[var7 - 1];
			}

			if (var13 == 0) {
				if (var8.mb == var3) {
					for (var14 = 0; var14 < var6 ; ++var14) {
						this.D[var14] = var10[var9[var14] & 255];
					}
				} else {
					int var16;
					if (var8.mb == 64 && var3 == 128) {
						var14 = 0;

						for (var15 = 0; var15 < var3 ; ++var15) {
							for (var16 = 0; var16 < var3 ; ++var16) {
								this.D[var14++] = var10[var9[(var16 >> 1) + (var15 >> 1 << 6)] & 255];
							}
						}
					} else {
						if (var8.mb != 128 || var3 != 64) {
							throw new RuntimeException();
						}

						var14 = 0;

						for (var15 = 0; var15 < var3 ; ++var15) {
							for (var16 = 0; var16 < var3 ; ++var16) {
								this.D[var14++] = var10[var9[(var16 << 1) + (var15 << 1 << 7)] & 255];
							}
						}
					}
				}
			}
		}

		for (int var17 = 0 ; var17 < var6 ; ++var17) {
			this.D[var17] &= 16316671;
			int var18 = this.D[var17];
			this.D[var17 + var6] = var18 - (var18 >>> 3) & 16316671;
			this.D[var17 + var6 + var6] = var18 - (var18 >>> 2) & 16316671;
			this.D[var17 + var6 + var6 + var6] = var18 - (var18 >>> 2) - (var18 >>> 3) & 16316671;
		}

		return true;
	}

	final void e (int var1) {
		if (this.D != null) {
			short var2;
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			int[] var10;
			if (this.F == 1 || this.F == 3) {
				if (I == null || I.length < this.D.length) {
					I = new int[this.D.length];
				}

				if (this.D.length == 16384) {
					var2 = 64;
				} else {
					var2 = 128;
				}

				var3 = this.D.length / 4;
				var4 = var2 * var1 * this.B;
				var5 = var3 - 1;
				if (this.F == 1) {
					var4 = -var4;
				}

				for (var6 = 0; var6 < var3 ; ++var6) {
					var7 = var6 + var4 & var5;
					I[var6] = this.D[var7];
					I[var6 + var3] = this.D[var7 + var3];
					I[var6 + var3 + var3] = this.D[var7 + var3 + var3];
					I[var6 + var3 + var3 + var3] = this.D[var7 + var3 + var3 + var3];
				}

				var10 = this.D;
				this.D = I;
				I = var10;
			}

			if (this.F == 2 || this.F == 4) {
				if (I == null || I.length < this.D.length) {
					I = new int[this.D.length];
				}

				if (this.D.length == 16384) {
					var2 = 64;
				} else {
					var2 = 128;
				}

				var3 = this.D.length / 4;
				var4 = var1 * this.B;
				var5 = var2 - 1;
				if (this.F == 2) {
					var4 = -var4;
				}

				for (var6 = 0; var6 < var3 ; var6 += var2) {
					for (var7 = 0; var7 < var2 ; ++var7) {
						int var8 = var6 + var7;
						int var9 = var6 + (var7 + var4 & var5);
						I[var8] = this.D[var9];
						I[var8 + var3] = this.D[var9 + var3];
						I[var8 + var3 + var3] = this.D[var9 + var3 + var3];
						I[var8 + var3 + var3 + var3] = this.D[var9 + var3 + var3 + var3];
					}
				}

				var10 = this.D;
				this.D = I;
				I = var10;
			}

		}
	}
}
