final class ae {
	static int[][] c = new int[2][8];
	static int h;
	private static float d;
	private static float[][] f = new float[2][8];
	int[] b = new int[2];
	private int[] a = new int[2];
	private int[][][] e = new int[2][2][4];
	private int[][][] g = new int[2][2][4];

	private static float a (float v) {
		float v1 = 32.703197F * (float) Math.pow(2.0D, (double) v);
		return v1 * 3.1415927F / 11025.0F;
	}

	public static void a () {
		f = null;
		c = null;
	}

	final void a (id class_id, ga class_ga) {
		int i = class_id.readUnsignedByte((byte) 116);
		this.b[0] = i >> 4;
		this.b[1] = i & 15;
		if (i == 0) {
			this.a[0] = this.a[1] = 0;
		} else {
			this.a[0] = class_id.readUnsignedLEShort(255);
			this.a[1] = class_id.readUnsignedLEShort(255);
			int i1 = class_id.readUnsignedByte((byte) 116);
			for (int i2 = 0 ; i2 < 2 ; ++i2) {
				for (int i3 = 0; i3 < this.b[i2] ; ++i3) {
					this.e[i2][0][i3] = class_id.readUnsignedLEShort(255);
					this.g[i2][0][i3] = class_id.readUnsignedLEShort(255);
				}
			}

			for (int i2 = 0; i2 < 2 ; ++i2) {
				for (int i3 = 0 ; i3 < this.b[i2] ; ++i3) {
					if ((i1 & 1 << i2 * 4 << i3) != 0) {
						this.e[i2][1][i3] = class_id.readUnsignedLEShort(255);
						this.g[i2][1][i3] = class_id.readUnsignedLEShort(255);
					} else {
						this.e[i2][1][i3] = this.e[i2][0][i3];
						this.g[i2][1][i3] = this.g[i2][0][i3];
					}
				}
			}

			if (i1 != 0 || this.a[1] != this.a[0]) {
				class_ga.b(class_id);
			}
		}
	}

	private float a (int i, int i1, float v) {
		float v1 = (float) this.e[i][0][i1] + v * (float) (this.e[i][1][i1] - this.e[i][0][i1]);
		v1 *= 1.2207031E-4F;
		return a(v1);
	}

	final int a (int i, float v) {
		if (i == 0) {
			float v1 = (float) this.a[0] + (float) (this.a[1] - this.a[0]) * v;
			v1 *= 0.0030517578F;
			d = (float) Math.pow(0.1D, (double) (v1 / 20.0F));
			h = (int) (d * 65536.0F);
		}

		if (this.b[i] == 0) {
			return 0;
		} else {
			float v1 = this.b(i, 0, v);
			f[i][0] = -2.0F * v1 * (float) Math.cos((double) this.a(i, 0, v));
			f[i][1] = v1 * v1;

			for (int i1 = 1 ; i1 < this.b[i] ; ++i1) {
				v1 = this.b(i, i1, v);
				float v2 = -2.0F * v1 * (float) Math.cos((double) this.a(i, i1, v));
				float v3 = v1 * v1;
				f[i][i1 * 2 + 1] = f[i][i1 * 2 - 1] * v3;
				f[i][i1 * 2] = f[i][i1 * 2 - 1] * v2 + f[i][i1 * 2 - 2] * v3;

				for (int i2 = i1 * 2 - 1 ; i2 >= 2 ; --i2) {
					f[i][i2] += f[i][i2 - 1] * v2 + f[i][i2 - 2] * v3;
				}

				f[i][1] += f[i][0] * v2 + v3;
				f[i][0] += v2;
			}

			if (i == 0) {
				for (int i1 = 0; i1 < this.b[0] * 2 ; ++i1) {
					f[0][i1] *= d;
				}
			}

			for (int i1 = 0; i1 < this.b[i] * 2 ; ++i1) {
				c[i][i1] = (int) (f[i][i1] * 65536.0F);
			}

			return this.b[i] * 2;
		}
	}

	private float b (int i, int i1, float v) {
		float v1 = (float) this.g[i][0][i1] + v * (float) (this.g[i][1][i1] - this.g[i][0][i1]);
		v1 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-v1 / 20.0F));
	}
}
