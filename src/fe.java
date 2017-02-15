final class fe {
	private static int[] ints_a = new int[500];
	private static int[] ints_c = new int[500];
	private static int[] ints_f = new int[500];
	private static int[] ints_k = new int[500];
	i i_b = null;
	int[] ints_d;
	boolean boolean_e = false;
	int[] ints_g;
	int[] ints_h;
	int int_i = -1;
	int[] ints_j;

	fe (byte[] buffer, i class_i) {
		this.i_b = class_i;
		id readStream = new id(buffer);
		id writeStream = new id(buffer);
		readStream.pointer = 2;
		int i = readStream.readUnsignedByte((byte) 116);
		int i1 = -1;
		int i2 = 0;
		writeStream.pointer = readStream.pointer + i;
		int i3;
		for (int i4 = 0 ; i4 < i ; ++i4) {
			i3 = readStream.readUnsignedByte((byte) 116);
			if (i3 > 0) {
				if (this.i_b.A[i4] != 0) {
					for (int i5 = i4 - 1 ; i5 > i1 ; --i5) {
						if (this.i_b.A[i5] == 0) {
							ints_k[i2] = i5;
							ints_f[i2] = 0;
							ints_c[i2] = 0;
							ints_a[i2] = 0;
							++i2;
							break;
						}
					}
				}

				ints_k[i2] = i4;
				short s = 0;
				if (this.i_b.A[i4] == 3) {
					s = 128;
				}

				if ((i3 & 1) != 0) {
					ints_f[i2] = writeStream.readSmartA(false);
				} else {
					ints_f[i2] = s;
				}

				if ((i3 & 2) != 0) {
					ints_c[i2] = writeStream.readSmartA(false);
				} else {
					ints_c[i2] = s;
				}

				if ((i3 & 4) != 0) {
					ints_a[i2] = writeStream.readSmartA(false);
				} else {
					ints_a[i2] = s;
				}

				i1 = i4;
				++i2;
				if (this.i_b.A[i4] == 5) {
					this.boolean_e = true;
				}
			}
		}

		if (writeStream.pointer != buffer.length) {
			throw new RuntimeException();
		} else {
			this.int_i = i2;
			this.ints_d = new int[i2];
			this.ints_g = new int[i2];
			this.ints_j = new int[i2];
			this.ints_h = new int[i2];

			for (i3 = 0; i3 < i2 ; ++i3) {
				this.ints_d[i3] = ints_k[i3];
				this.ints_g[i3] = ints_f[i3];
				this.ints_j[i3] = ints_c[i3];
				this.ints_h[i3] = ints_a[i3];
			}
		}
	}

	public static void a () {
		ints_k = null;
		ints_f = null;
		ints_c = null;
		ints_a = null;
	}
}
