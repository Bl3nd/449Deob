import java.io.InputStream;

final class da extends InputStream {
	boolean boolean_a;
	private byte[] bytes_b = new byte[65536];
	private int[] ints_c = new int[]{
			0,
			0,
			1,
			1,
			2,
			2,
			2,
			2,
			3,
			3,
			3,
			3,
			3,
			3,
			3,
			3,
			4,
			4,
			4,
			4,
			4,
			4,
			4,
			4,
			4,
			4,
			4,
			4,
			4,
			4,
			4,
			4,
			5,
			5,
			5,
			5,
			5,
			5,
			5,
			5,
			5,
			5,
			5,
			5,
			5,
			5,
			5,
			5,
			5,
			5,
			5,
			5,
			5,
			5,
			5,
			5,
			5,
			5,
			5,
			5,
			5,
			5,
			5,
			5,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			6,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7,
			7
	};
	private int[] ints_d = new int[256];

	da () {
		for (int index = -32768 ; index < '耀' ; ++index) {
			this.bytes_b[index + '耀'] = this.a(index);
		}
	}

	@SuppressWarnings({"ParameterCanBeLocal", "SameParameterValue"})
	private static void a (byte[] src, int[] ints, byte[] dest, int pointer, int destPointer, int length) {
		for (pointer = 0; pointer < length ; ++pointer) {
			dest[destPointer++] = src[(ints[pointer] >> 8) + '耀'];
		}
	}

	@SuppressWarnings("ResultOfMethodCallIgnored")
	public final int read () {
		byte[] bytes = new byte[1];
		this.read(bytes, 0, 1);
		return bytes[0];
	}

	private byte a (int index) {
		int i = index >> 8 & 128;
		if (i != 0) {
			index = -index;
		}

		if (index > 32635) {
			index = 32635;
		}

		index += 132;
		int i1 = this.ints_c[index >> 7 & 255];
		int i2 = index >> i1 + 3 & 15;
		return (byte) (~(i | i1 << 4 | i2));
	}

	@SuppressWarnings("ResultOfMethodCallIgnored")
	public final synchronized int read (byte[] bytes, int off, int len) {
		try {
			if (this.boolean_a) {
				return -1;
			} else if (len > 256) {
				this.read(bytes, off, 256);
				this.read(bytes, off + 256, len - 256);
				return len;
			} else {
				eb.a(this.ints_d, len);

				for (int index = 0 ; index < len ; ++index) {
					int i = this.ints_d[index];
					if ((i + 8388608 & -16777216) != 0) {
						this.ints_d[index] = 8388607 ^ i >> 31;
					}
				}

				a(this.bytes_b, this.ints_d, bytes, 0, off, len);
				return len;
			}
		} catch (Exception e) {
			this.boolean_a = true;
			se.a((byte) -112, e, null);
			return -1;
		}
	}
}
