final class sc {
	private static byte[] b = new byte[]{
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 1,
			(byte) 1,
			(byte) 1,
			(byte) 1,
			(byte) 1,
			(byte) 1,
			(byte) 1,
			(byte) 1,
			(byte) 1,
			(byte) 1,
			(byte) 1,
			(byte) 1,
			(byte) 1,
			(byte) 1,
			(byte) 1,
			(byte) 1,
			(byte) 1,
			(byte) 1,
			(byte) 1,
			(byte) 1,
			(byte) 1,
			(byte) 1,
			(byte) 1,
			(byte) 1,
			(byte) 1,
			(byte) 1,
			(byte) 1,
			(byte) 1,
			(byte) 1,
			(byte) 1,
			(byte) 1,
			(byte) 1,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 2,
			(byte) 0,
			(byte) 1,
			(byte) 2,
			(byte) 1,
			(byte) 0,
			(byte) 0,
			(byte) 0,
			(byte) 0,
			(byte) 0,
			(byte) 0,
			(byte) 0,
			(byte) 0,
			(byte) 0,
			(byte) 0,
			(byte) 0,
			(byte) 0
	};
	int[] d;
	int f;
	private id a = new id((byte[]) null);
	private int c;
	private int[] e;
	private long g;
	private int[] h;
	private int[] i;

	public static void d () {
		b = null;
	}

	final long a (int var1) {
		return this.g + (long) var1 * (long) this.c;
	}

	final void a () {
		this.a.buffer = null;
		this.e = null;
		this.i = null;
		this.d = null;
		this.h = null;
	}

	final void a (byte[] buffer) {
		this.a.buffer = buffer;
		this.a.pointer = 10;
		int length = this.a.readUnsignedLEShort(255);
		this.f = this.a.readUnsignedLEShort(255);
		this.c = 500000;
		this.e = new int[length];
		int i;
		int i1;
		for (int index = 0 ; index < length ; this.a.pointer += i1) {
			i = this.a.readInt((byte) -39);
			i1 = this.a.readInt((byte) -57);
			if (i == 1297379947) {
				this.e[index] = this.a.pointer;
				++index;
			}
		}

		this.i = new int[this.e.length];
		for (i = 0; i < this.i.length ; ++i) {
			this.i[i] = this.e[i];
		}

		this.d = new int[length];
		this.h = new int[length];
	}

	final void b () {
		this.a.pointer = -1;
	}

	final boolean c () {
		int var1 = this.i.length;

		for (int var2 = 0 ; var2 < var1 ; ++var2) {
			if (this.i[var2] >= 0) {
				return false;
			}
		}

		return true;
	}

	final void b (int size) {
		this.a.pointer = this.i[size];
	}

	final void a (long var1) {
		this.g = var1;
		int var3 = this.i.length;

		for (int var4 = 0 ; var4 < var3 ; ++var4) {
			this.d[var4] = 0;
			this.h[var4] = 0;
			this.a.pointer = this.e[var4];
			this.c(var4);
			this.i[var4] = this.a.pointer;
		}

	}

	final void c (int size) {
		int var2 = this.a.j(true);
		this.d[size] += var2;
	}

	final int e () {
		int var1 = this.i.length;
		int var2 = -1;
		int var3 = Integer.MAX_VALUE;

		for (int var4 = 0 ; var4 < var1 ; ++var4) {
			if (this.i[var4] >= 0 && this.d[var4] < var3) {
				var2 = var4;
				var3 = this.d[var4];
			}
		}

		return var2;
	}

	final void d (int var1) {
		this.i[var1] = this.a.pointer;
	}

	final boolean f () {
		return this.a.pointer < 0;
	}

	private int a (int var1, int var2) {
		int var4;
		if (var2 == 255) {
			int var7 = this.a.readUnsignedByte((byte) 116);
			var4 = this.a.j(true);
			if (var7 == 47) {
				this.a.pointer += var4;
				return 1;
			} else if (var7 == 81) {
				int var5 = this.a.readMedInt((byte) -44);
				var4 -= 3;
				int var6 = this.d[var1];
				this.g += (long) var6 * (long) (this.c - var5);
				this.c = var5;
				this.a.pointer += var4;
				return 2;
			} else {
				this.a.pointer += var4;
				return 3;
			}
		} else {
			byte var3 = b[var2 - 128];
			var4 = var2;
			if (var3 >= 1) {
				var4 = var2 | this.a.readUnsignedByte((byte) 116) << 8;
			}

			if (var3 >= 2) {
				var4 |= this.a.readUnsignedByte((byte) 116) << 16;
			}

			return var4;
		}
	}

	private int e (int var1) {
		byte var2 = this.a.buffer[this.a.pointer];
		int var5;
		if (var2 < 0) {
			var5 = var2 & 255;
			this.h[var1] = var5;
			++this.a.pointer;
		} else {
			var5 = this.h[var1];
		}

		if (var5 != 240 && var5 != 247) {
			return this.a(var1, var5);
		} else {
			int var3 = this.a.j(true);
			if (var5 == 247 && var3 > 0) {
				int var4 = this.a.buffer[this.a.pointer] & 255;
				if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
					++this.a.pointer;
					this.h[var1] = var4;
					return this.a(var1, var4);
				}
			}

			this.a.pointer += var3;
			return 0;
		}
	}

	final boolean g () {
		return this.a.buffer != null;
	}

	final int h () {
		return this.i.length;
	}

	final int f (int var1) {
		return this.e(var1);
	}
}
