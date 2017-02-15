final class ia {
	private int a;
	private k[] b = new k[10];
	private int c;

	private ia (id var1) {
		for (int var2 = 0 ; var2 < 10 ; ++var2) {
			int var3 = var1.readUnsignedByte((byte) 116);
			if (var3 != 0) {
				--var1.pointer;
				this.b[var2] = new k();
				this.b[var2].a(var1);
			}
		}

		this.c = var1.readUnsignedLEShort(255);
		this.a = var1.readUnsignedLEShort(255);
	}

	private ia () {
	}

	static ia a (pb var0, int var1, int var2) {
		byte[] var3 = var0.a(var1, var2, (byte) 66);
		return var3 == null ? null : new ia(new id(var3));
	}

	final na a () {
		byte[] var1 = this.b();
		return new na(22050, var1, 22050 * this.c / 1000, 22050 * this.a / 1000);
	}

	private byte[] b () {
		int var1 = 0;

		for (int var2 = 0 ; var2 < 10 ; ++var2) {
			if (this.b[var2] != null && this.b[var2].u + this.b[var2].a > var1) {
				var1 = this.b[var2].u + this.b[var2].a;
			}
		}

		if (var1 == 0) {
			return new byte[0];
		} else {
			int var3 = 22050 * var1 / 1000;
			byte[] var4 = new byte[var3];

			for (int var5 = 0 ; var5 < 10 ; ++var5) {
				if (this.b[var5] != null) {
					int var6 = this.b[var5].u * 22050 / 1000;
					int var7 = this.b[var5].a * 22050 / 1000;
					int[] var8 = this.b[var5].a(var6, this.b[var5].u);

					for (int var9 = 0 ; var9 < var6 ; ++var9) {
						int var10 = var4[var9 + var7] + (var8[var9] >> 8);
						if ((var10 + 128 & -256) != 0) {
							var10 = var10 >> 31 ^ 127;
						}

						var4[var9 + var7] = (byte) var10;
					}
				}
			}

			return var4;
		}
	}

	final int c () {
		int var1 = 9999999;

		for (int var2 = 0 ; var2 < 10 ; ++var2) {
			if (this.b[var2] != null && this.b[var2].a / 20 < var1) {
				var1 = this.b[var2].a / 20;
			}
		}

		if (this.c < this.a && this.c / 20 < var1) {
			var1 = this.c / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0 ; var3 < 10 ; ++var3) {
				if (this.b[var3] != null) {
					this.b[var3].a -= var1 * 20;
				}
			}

			if (this.c < this.a) {
				this.c -= var1 * 20;
				this.a -= var1 * 20;
			}

			return var1;
		} else {
			return 0;
		}
	}
}
