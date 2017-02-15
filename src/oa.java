final class oa extends ic {
	int gb;
	int hb;
	int[] ib;
	byte[] jb;
	int kb;
	int lb;
	int mb;
	int nb;

	oa () {
	}

	private oa (int var1, int var2, int var3) {
		this.gb = this.mb = var1;
		this.lb = this.nb = var2;
		this.hb = this.kb = 0;
		this.jb = new byte[var1 * var2];
		this.ib = new int[var3];
	}

	private static void a (int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7,
						   int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var10 = -var6 ; var10 < 0 ; ++var10) {
			for (int var11 = var9 ; var11 < 0 ; ++var11) {
				byte var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					++var4;
				}

				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					++var4;
				}

				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					++var4;
				}

				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					++var4;
				}
			}

			for (int var14 = var5 ; var14 < 0 ; ++var14) {
				byte var13 = var1[var3++];
				if (var13 != 0) {
					var0[var4++] = var2[var13 & 255];
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	final void a (int i, int i1, int i2) {
		for (int i3 = 0 ; i3 < this.ib.length ; ++i3) {
			int i4 = this.ib[i3] >> 16 & 255;
			i4 += i;
			if (i4 < 0) {
				i4 = 0;
			} else if (i4 > 255) {
				i4 = 255;
			}

			int i5 = this.ib[i3] >> 8 & 255;
			i5 += i1;
			if (i5 < 0) {
				i5 = 0;
			} else if (i5 > 255) {
				i5 = 255;
			}

			int i6 = this.ib[i3] & 255;
			i6 += i2;
			if (i6 < 0) {
				i6 = 0;
			} else if (i6 > 255) {
				i6 = 255;
			}

			this.ib[i3] = (i4 << 16) + (i5 << 8) + i6;
		}
	}

	final oa d () {
		oa var1 = new oa(this.mb, this.nb, this.ib.length);
		var1.gb = this.gb;
		var1.lb = this.lb;
		var1.hb = this.hb;
		var1.kb = this.kb;
		int var2 = this.jb.length;

		System.arraycopy(this.jb, 0, var1.jb, 0, var2);

		var2 = this.ib.length;

		System.arraycopy(this.ib, 0, var1.ib, 0, var2);

		return var1;
	}

	final void a (int i, int i1) {
		i += this.hb;
		i1 += this.kb;
		int i2 = i + i1 * ic.width;
		int i3 = 0;
		int i4 = this.nb;
		int i5 = this.mb;
		int i6 = ic.width - i5;
		int i7 = 0;
		int i8;
		if (i1 < ic.int_bb) {
			i8 = ic.int_bb - i1;
			i4 -= i8;
			i1 = ic.int_bb;
			i3 += i8 * i5;
			i2 += i8 * ic.width;
		}

		if (i1 + i4 > ic.int_db) {
			i4 -= i1 + i4 - ic.int_db;
		}

		if (i < ic.int_ab) {
			i8 = ic.int_ab - i;
			i5 -= i8;
			i = ic.int_ab;
			i3 += i8;
			i2 += i8;
			i7 += i8;
			i6 += i8;
		}

		if (i + i5 > ic.Z) {
			i8 = i + i5 - ic.Z;
			i5 -= i8;
			i7 += i8;
			i6 += i8;
		}

		if (i5 > 0 && i4 > 0) {
			a(ic.pixels, this.jb, this.ib, i3, i2, i5, i4, i6, i7);
		}
	}

	final void e () {
		byte[] var1 = new byte[this.mb * this.nb];
		int var2 = 0;

		for (int var3 = this.nb - 1 ; var3 >= 0 ; --var3) {
			for (int var4 = 0 ; var4 < this.mb ; ++var4) {
				var1[var2++] = this.jb[var4 + var3 * this.mb];
			}
		}

		this.jb = var1;
		this.kb = this.lb - this.nb - this.kb;
	}

	final void f () {
		if (this.mb != this.gb || this.nb != this.lb) {
			byte[] var1 = new byte[this.gb * this.lb];
			int var2 = 0;

			for (int var3 = 0 ; var3 < this.nb ; ++var3) {
				for (int var4 = 0 ; var4 < this.mb ; ++var4) {
					var1[var4 + this.hb + (var3 + this.kb) * this.gb] = this.jb[var2++];
				}
			}

			this.jb = var1;
			this.mb = this.gb;
			this.nb = this.lb;
			this.hb = 0;
			this.kb = 0;
		}
	}

	final void g () {
		byte[] var1 = new byte[this.mb * this.nb];
		int var2 = 0;

		for (int var3 = 0 ; var3 < this.nb ; ++var3) {
			for (int var4 = this.mb - 1 ; var4 >= 0 ; --var4) {
				var1[var2++] = this.jb[var4 + var3 * this.mb];
			}
		}

		this.jb = var1;
		this.hb = this.gb - this.mb - this.hb;
	}
}
