@SuppressWarnings("Duplicates")
final class ac extends mc {
	private int E;
	private int F;
	private int G;
	private int H;
	private int I;
	private int J;
	private int K;
	private int L;
	private boolean M;
	private int N;
	private int O;
	private int P;
	private int Q;
	private int R;

	private ac (na class_na, int i, int i1) {
		super.z = class_na;
		this.K = class_na.D;
		this.R = class_na.A;
		this.M = class_na.E;
		this.O = i;
		this.G = i1;
		this.Q = 128;
		this.H = 0;
	}

	@SuppressWarnings({"ParameterCanBeLocal", "SameParameterValue"})
	private static int a (byte[] bytes, int[] ints, int i, int i1, int i2, int i3, int i4, int i5, int i6, int i7, ac class_ac) {
		i >>= 8;
		i7 >>= 8;
		i2 <<= 8;
		i4 <<= 8;
		if ((i5 = i1 + i7 - i) > i6) {
			i5 = i6;
		}

		int i8;
		for (i5 -= 3; i1 < i5 ; i2 += i4) {
			i8 = i1++;
			ints[i8] += bytes[i++] * i2 >> i3;
			i2 += i4;
			i8 = i1++;
			ints[i8] += bytes[i++] * i2 >> i3;
			i2 += i4;
			i8 = i1++;
			ints[i8] += bytes[i++] * i2 >> i3;
			i2 += i4;
			i8 = i1++;
			ints[i8] += bytes[i++] * i2 >> i3;
		}

		for (i5 += 3; i1 < i5 ; i2 += i4) {
			i8 = i1++;
			ints[i8] += bytes[i++] * i2 >> i3;
		}

		class_ac.G = i2 >> 8;
		class_ac.H = i << 8;
		return i1;
	}

	@SuppressWarnings({"ParameterCanBeLocal", "SameParameterValue", "unused"})
	private static int a (int i, byte[] bytes, int[] ints, int i1, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, ac class_ac) {
		i1 >>= 8;
		i10 >>= 8;
		i3 <<= 8;
		i4 <<= 8;
		i6 <<= 8;
		i7 <<= 8;
		if ((i8 = i2 + i1 - (i10 - 1)) > i9) {
			i8 = i9;
		}

		i2 <<= 1;
		i8 <<= 1;

		byte b;
		int i11;
		for (i8 -= 6; i2 < i8 ; i4 += i7) {
			b = bytes[i1--];
			i11 = i2++;
			ints[i11] += b * i3 >> i5;
			i3 += i6;
			i11 = i2++;
			ints[i11] += b * i4 >> i5;
			i4 += i7;
			b = bytes[i1--];
			i11 = i2++;
			ints[i11] += b * i3 >> i5;
			i3 += i6;
			i11 = i2++;
			ints[i11] += b * i4 >> i5;
			i4 += i7;
			b = bytes[i1--];
			i11 = i2++;
			ints[i11] += b * i3 >> i5;
			i3 += i6;
			i11 = i2++;
			ints[i11] += b * i4 >> i5;
			i4 += i7;
			b = bytes[i1--];
			i11 = i2++;
			ints[i11] += b * i3 >> i5;
			i3 += i6;
			i11 = i2++;
			ints[i11] += b * i4 >> i5;
		}

		for (i8 += 6; i2 < i8 ; i4 += i7) {
			b = bytes[i1--];
			i11 = i2++;
			ints[i11] += b * i3 >> i5;
			i3 += i6;
			i11 = i2++;
			ints[i11] += b * i4 >> i5;
		}

		class_ac.G = i3 >> 8;
		class_ac.Q = i4 >> 8;
		class_ac.H = i1 << 8;
		return i2 >> 1;
	}

	@SuppressWarnings({"ParameterCanBeLocal", "SameParameterValue"})
	private static int a (int i, int i1, byte[] bytes, int[] ints, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, ac class_ac, int i12, int i13) {
		if (i12 == 0 || (i9 = i3 + (i11 + 256 - i2 + i12) / i12) > i10) {
			i9 = i10;
		}

		i3 <<= 1;

		int i14;
		for (i9 <<= 1; i3 < i9 ; i2 += i12) {
			i1 = i2 >> 8;
			byte b = bytes[i1 - 1];
			i = (b << 8) + (bytes[i1] - b) * (i2 & 255);
			i14 = i3++;
			ints[i14] += i * i4 >> i6;
			i4 += i7;
			i14 = i3++;
			ints[i14] += i * i5 >> i6;
			i5 += i8;
		}

		if (i12 == 0 || (i9 = (i3 >> 1) + (i11 - i2 + i12) / i12) > i10) {
			i9 = i10;
		}

		i9 <<= 1;

		for (i1 = i13; i3 < i9 ; i2 += i12) {
			i = (i1 << 8) + (bytes[i2 >> 8] - i1) * (i2 & 255);
			i14 = i3++;
			ints[i14] += i * i4 >> i6;
			i4 += i7;
			i14 = i3++;
			ints[i14] += i * i5 >> i6;
			i5 += i8;
		}

		class_ac.G = i4;
		class_ac.Q = i5;
		class_ac.H = i2;
		return i3 >> 1;
	}

	@SuppressWarnings({"ParameterCanBeLocal", "SameParameterValue"})
	private static int b (byte[] bytes, int[] ints, int i, int i1, int i2, int i3, int i4, int i5, int i6, int i7, ac class_ac) {
		i >>= 8;
		i7 >>= 8;
		i2 <<= 8;
		i4 <<= 8;
		if ((i5 = i1 + i - (i7 - 1)) > i6) {
			i5 = i6;
		}

		int i8;
		for (i5 -= 3; i1 < i5 ; i2 += i4) {
			i8 = i1++;
			ints[i8] += bytes[i--] * i2 >> i3;
			i2 += i4;
			i8 = i1++;
			ints[i8] += bytes[i--] * i2 >> i3;
			i2 += i4;
			i8 = i1++;
			ints[i8] += bytes[i--] * i2 >> i3;
			i2 += i4;
			i8 = i1++;
			ints[i8] += bytes[i--] * i2 >> i3;
		}

		for (i5 += 3; i1 < i5 ; i2 += i4) {
			i8 = i1++;
			ints[i8] += bytes[i--] * i2 >> i3;
		}

		class_ac.G = i2 >> 8;
		class_ac.H = i << 8;
		return i1;
	}

	@SuppressWarnings({"ParameterCanBeLocal", "SameParameterValue"})
	private static int a (int i, int i1, byte[] bytes, int[] ints, int i2, int i3, int i4, int i5, int i6, int i7, int i8, ac class_ac, int i9, int i10) {
		if (i9 == 0 || (i6 = i3 + (i8 - i2 + i9 - 257) / i9) > i7) {
			i6 = i7;
		}

		i3 <<= 1;

		byte b;
		int i11;
		for (i6 <<= 1; i3 < i6 ; i2 += i9) {
			i1 = i2 >> 8;
			b = bytes[i1];
			i = (b << 8) + (bytes[i1 + 1] - b) * (i2 & 255);
			i11 = i3++;
			ints[i11] += i * i4;
			i11 = i3++;
			ints[i11] += i * i5;
		}

		if (i9 == 0 || (i6 = (i3 >> 1) + (i8 - i2 + i9 - 1) / i9) > i7) {
			i6 = i7;
		}

		i6 <<= 1;

		for (i1 = i10; i3 < i6 ; i2 += i9) {
			b = bytes[i2 >> 8];
			i = (b << 8) + (i1 - b) * (i2 & 255);
			i11 = i3++;
			ints[i11] += i * i4;
			i11 = i3++;
			ints[i11] += i * i5;
		}

		class_ac.H = i2;
		return i3 >> 1;
	}

	@SuppressWarnings({"SameParameterValue", "unused", "ParameterCanBeLocal"})
	private static int a (int i, int i1, byte[] bytes, int[] ints, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, ac class_ac, int i10, int i11) {
		if (i10 == 0 || (i7 = i3 + (i9 - i2 + i10 - 257) / i10) > i8) {
			i7 = i8;
		}

		byte b;
		int i12;
		while (i3 < i7) {
			i1 = i2 >> 8;
			b = bytes[i1];
			i12 = i3++;
			ints[i12] += ((b << 8) + (bytes[i1 + 1] - b) * (i2 & 255)) * i4 >> i5;
			i4 += i6;
			i2 += i10;
		}

		if (i10 == 0 || (i7 = i3 + (i9 - i2 + i10 - 1) / i10) > i8) {
			i7 = i8;
		}

		for (i1 = i11; i3 < i7 ; i2 += i10) {
			b = bytes[i2 >> 8];
			i12 = i3++;
			ints[i12] += ((b << 8) + (i1 - b) * (i2 & 255)) * i4 >> i5;
			i4 += i6;
		}

		class_ac.G = i4;
		class_ac.H = i2;
		return i3;
	}

	@SuppressWarnings({"ParameterCanBeLocal", "SameParameterValue"})
	private static int b (int i, int i1, byte[] bytes, int[] ints, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, ac class_ac, int i12, int i13) {
		if (i12 == 0 || (i9 = i3 + (i11 - i2 + i12 - 257) / i12) > i10) {
			i9 = i10;
		}

		i3 <<= 1;

		byte b;
		int i14;
		for (i9 <<= 1; i3 < i9 ; i2 += i12) {
			i1 = i2 >> 8;
			b = bytes[i1];
			i = (b << 8) + (bytes[i1 + 1] - b) * (i2 & 255);
			i14 = i3++;
			ints[i14] += i * i4 >> i6;
			i4 += i7;
			i14 = i3++;
			ints[i14] += i * i5 >> i6;
			i5 += i8;
		}

		if (i12 == 0 || (i9 = (i3 >> 1) + (i11 - i2 + i12 - 1) / i12) > i10) {
			i9 = i10;
		}

		i9 <<= 1;

		for (i1 = i13; i3 < i9 ; i2 += i12) {
			b = bytes[i2 >> 8];
			i = (b << 8) + (i1 - b) * (i2 & 255);
			i14 = i3++;
			ints[i14] += i * i4 >> i6;
			i4 += i7;
			i14 = i3++;
			ints[i14] += i * i5 >> i6;
			i5 += i8;
		}

		class_ac.G = i4;
		class_ac.Q = i5;
		class_ac.H = i2;
		return i3 >> 1;
	}

	@SuppressWarnings({"ParameterCanBeLocal", "SameParameterValue"})
	private static int a (byte[] bytes, int[] ints, int i, int i1, int i2, int i3, int i4, int i5, ac class_ac) {
		i >>= 8;
		i5 >>= 8;
		i2 <<= 8;
		if ((i3 = i1 + i - (i5 - 1)) > i4) {
			i3 = i4;
		}

		int i6;
		for (i3 -= 3; i1 < i3 ; ints[i6] += bytes[i--] * i2) {
			i6 = i1++;
			ints[i6] += bytes[i--] * i2;
			i6 = i1++;
			ints[i6] += bytes[i--] * i2;
			i6 = i1++;
			ints[i6] += bytes[i--] * i2;
			i6 = i1++;
		}

		for (i3 += 3; i1 < i3 ; ints[i6] += bytes[i--] * i2) {
			i6 = i1++;
		}

		class_ac.H = i << 8;
		return i1;
	}

	@SuppressWarnings({"SameParameterValue", "unused", "ParameterCanBeLocal"})
	private static int a (int i, byte[] bytes, int[] ints, int i1, int i2, int i3, int i4, int i5, int i6, int i7, ac class_ac) {
		i1 >>= 8;
		i7 >>= 8;
		i3 <<= 8;
		i4 <<= 8;
		if ((i5 = i2 + i7 - i1) > i6) {
			i5 = i6;
		}

		i2 <<= 1;
		i5 <<= 1;

		int i8;
		byte b;
		for (i5 -= 6; i2 < i5 ; ints[i8] += b * i4) {
			b = bytes[i1++];
			i8 = i2++;
			ints[i8] += b * i3;
			i8 = i2++;
			ints[i8] += b * i4;
			b = bytes[i1++];
			i8 = i2++;
			ints[i8] += b * i3;
			i8 = i2++;
			ints[i8] += b * i4;
			b = bytes[i1++];
			i8 = i2++;
			ints[i8] += b * i3;
			i8 = i2++;
			ints[i8] += b * i4;
			b = bytes[i1++];
			i8 = i2++;
			ints[i8] += b * i3;
			i8 = i2++;
		}

		for (i5 += 6; i2 < i5 ; ints[i8] += b * i4) {
			b = bytes[i1++];
			i8 = i2++;
			ints[i8] += b * i3;
			i8 = i2++;
		}

		class_ac.H = i1 << 8;
		return i2 >> 1;
	}

	@SuppressWarnings({"ParameterCanBeLocal", "SameParameterValue"})
	private static int b (byte[] bytes, int[] ints, int i, int i1, int i2, int i3, int i4, int i5, ac ac) {
		i >>= 8;
		i5 >>= 8;
		i2 <<= 8;
		if ((i3 = i1 + i5 - i) > i4) {
			i3 = i4;
		}

		int i6;
		for (i3 -= 3; i1 < i3 ; ints[i6] += bytes[i++] * i2) {
			i6 = i1++;
			ints[i6] += bytes[i++] * i2;
			i6 = i1++;
			ints[i6] += bytes[i++] * i2;
			i6 = i1++;
			ints[i6] += bytes[i++] * i2;
			i6 = i1++;
		}

		for (i3 += 3; i1 < i3 ; ints[i6] += bytes[i++] * i2) {
			i6 = i1++;
		}

		ac.H = i << 8;
		return i1;
	}

	@SuppressWarnings({"ParameterCanBeLocal", "SameParameterValue"})
	private static int a (int i, int i1, byte[] bytes, int[] ints, int i2, int i3, int i4, int i5, int i6, int i7, ac class_ac, int i8, int i9) {
		if (i8 == 0 || (i5 = i3 + (i7 + 256 - i2 + i8) / i8) > i6) {
			i5 = i6;
		}

		int i10;
		while (i3 < i5) {
			i1 = i2 >> 8;
			byte var13 = bytes[i1 - 1];
			i10 = i3++;
			ints[i10] += ((var13 << 8) + (bytes[i1] - var13) * (i2 & 255)) * i4;
			i2 += i8;
		}

		if (i8 == 0 || (i5 = i3 + (i7 - i2 + i8) / i8) > i6) {
			i5 = i6;
		}

		i = i9;

		for (i1 = i8; i3 < i5 ; i2 += i1) {
			i10 = i3++;
			ints[i10] += ((i << 8) + (bytes[i2 >> 8] - i) * (i2 & 255)) * i4;
		}

		class_ac.H = i2;
		return i3;
	}

	@SuppressWarnings({"SameParameterValue", "unused", "ParameterCanBeLocal"})
	private static int b (int i, byte[] bytes, int[] ints, int i1, int i2, int i3, int i4, int i5, int i6, int i7, ac class_ac) {
		i1 >>= 8;
		i7 >>= 8;
		i3 <<= 8;
		i4 <<= 8;
		if ((i5 = i2 + i1 - (i7 - 1)) > i6) {
			i5 = i6;
		}

		i2 <<= 1;
		i5 <<= 1;

		int i8;
		byte b;
		for (i5 -= 6; i2 < i5 ; ints[i8] += b * i4) {
			b = bytes[i1--];
			i8 = i2++;
			ints[i8] += b * i3;
			i8 = i2++;
			ints[i8] += b * i4;
			b = bytes[i1--];
			i8 = i2++;
			ints[i8] += b * i3;
			i8 = i2++;
			ints[i8] += b * i4;
			b = bytes[i1--];
			i8 = i2++;
			ints[i8] += b * i3;
			i8 = i2++;
			ints[i8] += b * i4;
			b = bytes[i1--];
			i8 = i2++;
			ints[i8] += b * i3;
			i8 = i2++;
		}

		for (i5 += 6; i2 < i5 ; ints[i8] += b * i4) {
			b = bytes[i1--];
			i8 = i2++;
			ints[i8] += b * i3;
			i8 = i2++;
		}

		class_ac.H = i1 << 8;
		return i2 >> 1;
	}

	@SuppressWarnings({"SameParameterValue", "unused", "ParameterCanBeLocal"})
	private static int b (int i, byte[] bytes, int[] ints, int i1, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, ac class_ac) {
		i1 >>= 8;
		i10 >>= 8;
		i3 <<= 8;
		i4 <<= 8;
		i6 <<= 8;
		i7 <<= 8;
		if ((i8 = i2 + i10 - i1) > i9) {
			i8 = i9;
		}

		i2 <<= 1;
		i8 <<= 1;

		byte b;
		int i11;
		for (i8 -= 6; i2 < i8 ; i4 += i7) {
			b = bytes[i1++];
			i11 = i2++;
			ints[i11] += b * i3 >> i5;
			i3 += i6;
			i11 = i2++;
			ints[i11] += b * i4 >> i5;
			i4 += i7;
			b = bytes[i1++];
			i11 = i2++;
			ints[i11] += b * i3 >> i5;
			i3 += i6;
			i11 = i2++;
			ints[i11] += b * i4 >> i5;
			i4 += i7;
			b = bytes[i1++];
			i11 = i2++;
			ints[i11] += b * i3 >> i5;
			i3 += i6;
			i11 = i2++;
			ints[i11] += b * i4 >> i5;
			i4 += i7;
			b = bytes[i1++];
			i11 = i2++;
			ints[i11] += b * i3 >> i5;
			i3 += i6;
			i11 = i2++;
			ints[i11] += b * i4 >> i5;
		}

		for (i8 += 6; i2 < i8 ; i4 += i7) {
			b = bytes[i1++];
			i11 = i2++;
			ints[i11] += b * i3 >> i5;
			i3 += i6;
			i11 = i2++;
			ints[i11] += b * i4 >> i5;
		}

		class_ac.G = i3 >> 8;
		class_ac.Q = i4 >> 8;
		class_ac.H = i1 << 8;
		return i2 >> 1;
	}

	@SuppressWarnings({"ParameterCanBeLocal", "SameParameterValue"})
	private static int b (int i, int i1, byte[] bytes, int[] ints, int i2, int i3, int i4, int i5, int i6, int i7, int i8, ac class_ac, int i9, int i10) {
		if (i9 == 0 || (i6 = i3 + (i8 + 256 - i2 + i9) / i9) > i7) {
			i6 = i7;
		}

		i3 <<= 1;

		int i11;
		for (i6 <<= 1; i3 < i6 ; i2 += i9) {
			i1 = i2 >> 8;
			byte b = bytes[i1 - 1];
			i = (b << 8) + (bytes[i1] - b) * (i2 & 255);
			i11 = i3++;
			ints[i11] += i * i4;
			i11 = i3++;
			ints[i11] += i * i5;
		}

		if (i9 == 0 || (i6 = (i3 >> 1) + (i8 - i2 + i9) / i9) > i7) {
			i6 = i7;
		}

		i6 <<= 1;

		for (i1 = i10; i3 < i6 ; i2 += i9) {
			i = (i1 << 8) + (bytes[i2 >> 8] - i1) * (i2 & 255);
			i11 = i3++;
			ints[i11] += i * i4;
			i11 = i3++;
			ints[i11] += i * i5;
		}

		class_ac.H = i2;
		return i3 >> 1;
	}

	@SuppressWarnings({"SameParameterValue", "unused", "ParameterCanBeLocal"})
	private static int b (int i, int i1, byte[] bytes, int[] ints, int i2, int i3, int i4, int i5, int i6, int i7, ac class_ac, int i8, int i9) {
		if (i8 == 0 || (i5 = i3 + (i7 - i2 + i8 - 257) / i8) > i6) {
			i5 = i6;
		}

		byte b;
		int i10;
		while (i3 < i5) {
			i1 = i2 >> 8;
			b = bytes[i1];
			i10 = i3++;
			ints[i10] += ((b << 8) + (bytes[i1 + 1] - b) * (i2 & 255)) * i4;
			i2 += i8;
		}

		if (i8 == 0 || (i5 = i3 + (i7 - i2 + i8 - 1) / i8) > i6) {
			i5 = i6;
		}

		for (i1 = i9; i3 < i5 ; i2 += i8) {
			b = bytes[i2 >> 8];
			i10 = i3++;
			ints[i10] += ((b << 8) + (i1 - b) * (i2 & 255)) * i4;
		}

		class_ac.H = i2;
		return i3;
	}

	@SuppressWarnings({"ParameterCanBeLocal", "SameParameterValue"})
	private static int b (int i, int i1, byte[] bytes, int[] ints, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, ac class_ac, int i10, int i11) {
		if (i10 == 0 || (i7 = i3 + (i9 + 256 - i2 + i10) / i10) > i8) {
			i7 = i8;
		}

		int i12;
		while (i3 < i7) {
			i1 = i2 >> 8;
			byte b = bytes[i1 - 1];
			i12 = i3++;
			ints[i12] += ((b << 8) + (bytes[i1] - b) * (i2 & 255)) * i4 >> i5;
			i4 += i6;
			i2 += i10;
		}

		if (i10 == 0 || (i7 = i3 + (i9 - i2 + i10) / i10) > i8) {
			i7 = i8;
		}

		i = i11;

		for (i1 = i10; i3 < i7 ; i2 += i1) {
			i12 = i3++;
			ints[i12] += ((i << 8) + (bytes[i2 >> 8] - i) * (i2 & 255)) * i4 >> i5;
			i4 += i6;
		}

		class_ac.G = i4;
		class_ac.H = i2;
		return i3;
	}

	@SuppressWarnings("unused")
	static ac a (na class_na, int unused, int i) {
		return class_na.B != null && class_na.B.length != 0 ? new ac(class_na, (int) ((long) class_na.C * 256L * (long) 100 / (long) (100 * hc.sampleRate)), i) : null;
	}

	private int a (int[] data, int i, int i1, int len, int i2) {
		if (this.F > 0) {
			int i3 = i + this.F;
			if (i3 > len) {
				i3 = len;
			}

			this.F += i;
			if (this.O == -256 && (this.H & 255) == 0) {
				if (qb.mb) {
					i = a(0, ((na) super.z).B, data, this.H, i, this.G, this.Q, this.P, this.I, this.N, 0, i3, i1, this);
				} else {
					i = b(((na) super.z).B, data, this.H, i, this.G, this.P, this.I, 0, i3, i1, this);
				}
			} else if (qb.mb) {
				i = a(0, 0, ((na) super.z).B, data, this.H, i, this.G, this.Q, this.P, this.I, this.N, 0, i3, i1, this, this.O, i2);
			} else {
				i = b(0, 0, ((na) super.z).B, data, this.H, i, this.G, this.P, this.I, 0, i3, i1, this, this.O, i2);
			}

			this.F -= i;
			if (this.F != 0) {
				return i;
			}

			this.Q = this.L;
			if (this.J == Integer.MIN_VALUE) {
				this.G = 0;
				this.d(-26669);
				return len;
			}

			this.G = this.J;
		}

		return this.O == -256 && (this.H & 255) == 0 ? (qb.mb ? b(0, ((na) super.z).B, data, this.H, i, this.i(), this
				.f(), 0, len, i1, this) : a(((na) super.z).B, data, this.H, i, this.G, 0, len, i1, this)) : (qb.mb ? b(0, 0, ((na) super.z).B, data, this.H, i, this.i(), this
				.f(), 0, len, i1, this, this.O, i2) : a(0, 0, ((na) super.z).B, data, this.H, i, this.G, 0, len, i1, this, this.O, i2));
	}

	final synchronized void f (int i) {
		this.E = i;
	}

	final int c () {
		int i = this.G * 3;
		i = (i ^ i >> 31) + (i >>> 31);
		if (this.E == 0) {
			i -= i * this.H / (((na) super.z).B.length << 8);
		} else if (this.E >= 0) {
			i -= i * this.K / ((na) super.z).B.length;
		}

		return i > 255 ? 255 : i;
	}

	final int a () {
		return this.G == 0 && (this.F == 0 || this.J == 0 || this.J == Integer.MIN_VALUE) ? 0 : 1;
	}

	private synchronized void a (int i, int i1) {
		this.G = i;
		this.Q = i1;
		this.F = 0;
	}

	final synchronized void e (int len) {
		if (!this.e()) {
			if (this.F > 0) {
				if (len >= this.F) {
					if (this.J == Integer.MIN_VALUE) {
						this.G = 0;
						this.d(-26669);
						len = this.F;
					} else {
						this.G = this.J;
					}

					this.Q = this.L;
					this.F = 0;
				} else {
					this.G += this.I * len;
					if (qb.mb) {
						this.Q += this.N * len;
					}

					this.F -= len;
				}
			}

			na class_na = (na) super.z;
			int i = this.K << 8;
			int i1 = this.R << 8;
			int i2 = class_na.B.length << 8;
			int i3 = i1 - i;
			if (i3 <= 0) {
				this.E = 0;
			}

			if (this.H < 0) {
				if (this.O <= 0) {
					this.g();
					this.d(-26669);
					return;
				}

				this.H = 0;
			} else if (this.H >= i2) {
				if (this.O >= 0) {
					this.g();
					this.d(-26669);
					return;
				}

				this.H = i2 - 1;
			}

			this.H += this.O * len;
			if (this.E < 0) {
				if (!this.M) {
					if (this.O < 0) {
						if (this.H < i) {
							this.H = i1 - 1 - (i1 - 1 - this.H) % i3;
						}
					} else if (this.H >= i1) {
						this.H = i + (this.H - i) % i3;
					}
				} else {
					if (this.O < 0) {
						if (this.H >= i) {
							return;
						}

						this.H = i + i - 1 - this.H;
						this.O = -this.O;
					}

					while (this.H >= i1) {
						this.H = i1 + i1 - 1 - this.H;
						this.O = -this.O;
						if (this.H >= i) {
							return;
						}

						this.H = i + i - 1 - this.H;
						this.O = -this.O;
					}

				}
			} else {
				if (this.E > 0) {
					if (this.M) {
						if (this.O < 0) {
							if (this.H >= i) {
								return;
							}

							this.H = i + i - 1 - this.H;
							this.O = -this.O;
						} else {
							do {
								if (this.H < i1) {
									return;
								}

								this.H = i1 + i1 - 1 - this.H;
								this.O = -this.O;
								if (--this.E == 0) {
									break;
								}

								if (this.H >= i) {
									return;
								}

								this.H = i + i - 1 - this.H;
								this.O = -this.O;
							} while (--this.E != 0);
						}
					} else {
						int i4;
						if (this.O < 0) {
							if (this.H >= i) {
								return;
							}

							i4 = (i1 - 1 - this.H) / i3;
							if (i4 < this.E) {
								this.H += i3 * i4;
								this.E -= i4;
								return;
							}

							this.H += i3 * this.E;
							this.E = 0;
						} else {
							if (this.H < i1) {
								return;
							}

							i4 = (this.H - i) / i3;
							if (i4 < this.E) {
								this.H -= i3 * i4;
								this.E -= i4;
								return;
							}

							this.H -= i3 * this.E;
							this.E = 0;
						}
					}
				}

				if (this.O < 0) {
					if (this.H < 0) {
						this.H = -1;
						this.g();
						this.d(-26669);
					}
				} else if (this.H >= i2) {
					this.H = i2;
					this.g();
					this.d(-26669);
				}
			}
		}
	}

	private boolean e () {
		if (this.F != 0 && qb.mb == (this.N == Integer.MIN_VALUE)) {
			this.G = this.J == Integer.MIN_VALUE ? 0 : this.J;
			this.Q = this.L;
			this.F = 0;
			if (this.J == Integer.MIN_VALUE) {
				this.d(-26669);
				return true;
			}
		}

		return false;
	}

	private int f () {
		return this.Q < 0 ? -this.G : (int) ((double) this.G * Math.sqrt((double) this.Q * 0.0078125D) + 0.5D);
	}

	final mc d () {
		return null;
	}

	private void g () {
		if (this.F != 0) {
			this.G = this.J == Integer.MIN_VALUE ? 0 : this.J;
			this.Q = this.L;
			this.F = 0;
		}
	}

	private synchronized int h () {
		return this.F > 0 ? this.L : this.Q;
	}

	final synchronized void g (int i) {
		this.a(i, this.h());
	}

	final synchronized void a (int[] data, int i, int len) {
		if (!this.e()) {
			if (this.G == 0 && (this.F == 0 || this.J == 0 || this.J == Integer.MIN_VALUE)) {
				this.e(len);
			} else {
				na class_na = (na) super.z;
				int i1 = this.K << 8;
				int i2 = this.R << 8;
				int i3 = class_na.B.length << 8;
				int i4 = i2 - i1;
				if (i4 <= 0) {
					this.E = 0;
				}

				int i5 = i;
				len += i;
				if (this.H < 0) {
					if (this.O <= 0) {
						this.g();
						this.d(-26669);
						return;
					}

					this.H = 0;
				} else if (this.H >= i3) {
					if (this.O >= 0) {
						this.g();
						this.d(-26669);
						return;
					}

					this.H = i3 - 1;
				}

				if (this.E < 0) {
					if (this.M) {
						if (this.O < 0) {
							i5 = this.a(data, i, i1, len, class_na.B[this.K]);
							if (this.H >= i1) {
								return;
							}

							this.H = i1 + i1 - 1 - this.H;
							this.O = -this.O;
						}

						while (true) {
							i5 = this.b(data, i5, i2, len, class_na.B[this.R - 1]);
							if (this.H < i2) {
								return;
							}

							this.H = i2 + i2 - 1 - this.H;
							this.O = -this.O;
							i5 = this.a(data, i5, i1, len, class_na.B[this.K]);
							if (this.H >= i1) {
								return;
							}

							this.H = i1 + i1 - 1 - this.H;
							this.O = -this.O;
						}
					} else if (this.O < 0) {
						while (true) {
							i5 = this.a(data, i5, i1, len, class_na.B[this.R - 1]);
							if (this.H >= i1) {
								return;
							}

							this.H = i2 - 1 - (i2 - 1 - this.H) % i4;
						}
					} else {
						while (true) {
							i5 = this.b(data, i5, i2, len, class_na.B[this.K]);
							if (this.H < i2) {
								return;
							}

							this.H = i1 + (this.H - i1) % i4;
						}
					}
				} else {
					if (this.E > 0) {
						if (this.M) {
							if (this.O < 0) {
								i5 = this.a(data, i, i1, len, class_na.B[this.K]);
								if (this.H >= i1) {
									return;
								}

								this.H = i1 + i1 - 1 - this.H;
								this.O = -this.O;
							} else {
								do {
									i5 = this.b(data, i5, i2, len, class_na.B[this.R - 1]);
									if (this.H < i2) {
										return;
									}

									this.H = i2 + i2 - 1 - this.H;
									this.O = -this.O;
									if (--this.E == 0) {
										break;
									}

									i5 = this.a(data, i5, i1, len, class_na.B[this.K]);
									if (this.H >= i1) {
										return;
									}

									this.H = i1 + i1 - 1 - this.H;
									this.O = -this.O;
								} while (--this.E != 0);
							}
						} else {
							if (this.O < 0) {
								while (true) {
									i5 = this.a(data, i5, i1, len, class_na.B[this.R - 1]);
									if (this.H >= i1) {
										return;
									}

									int i6 = (i2 - 1 - this.H) / i4;
									if (i6 >= this.E) {
										this.H += i4 * this.E;
										this.E = 0;
										break;
									}

									this.H += i4 * i6;
									this.E -= i6;
								}
							} else {
								while (true) {
									i5 = this.b(data, i5, i2, len, class_na.B[this.K]);
									if (this.H < i2) {
										return;
									}

									int i6 = (this.H - i1) / i4;
									if (i6 >= this.E) {
										this.H -= i4 * this.E;
										this.E = 0;
										break;
									}

									this.H -= i4 * i6;
									this.E -= i6;
								}
							}
						}
					}

					if (this.O < 0) {
						this.a(data, i5, 0, len, 0);
						if (this.H < 0) {
							this.H = -1;
							this.g();
							this.d(-26669);
						}
					} else {
						this.b(data, i5, i3, len, 0);
						if (this.H >= i3) {
							this.H = i3;
							this.g();
							this.d(-26669);
						}
					}
				}
			}
		}
	}

	private int b (int[] data, int i, int i1, int len, int i2) {
		if (this.F > 0) {
			int i3 = i + this.F;
			if (i3 > len) {
				i3 = len;
			}

			this.F += i;
			if (this.O == 256 && (this.H & 255) == 0) {
				if (qb.mb) {
					i = b(0, ((na) super.z).B, data, this.H, i, this.G, this.Q, this.P, this.I, this.N, 0, i3, i1, this);
				} else {
					i = a(((na) super.z).B, data, this.H, i, this.G, this.P, this.I, 0, i3, i1, this);
				}
			} else if (qb.mb) {
				i = b(0, 0, ((na) super.z).B, data, this.H, i, this.G, this.Q, this.P, this.I, this.N, 0, i3, i1, this, this.O, i2);
			} else {
				i = a(0, 0, ((na) super.z).B, data, this.H, i, this.G, this.P, this.I, 0, i3, i1, this, this.O, i2);
			}

			this.F -= i;
			if (this.F != 0) {
				return i;
			}

			this.Q = this.L;
			if (this.J == Integer.MIN_VALUE) {
				this.G = 0;
				this.d(-26669);
				return len;
			}

			this.G = this.J;
		}

		return this.O == 256 && (this.H & 255) == 0 ? (qb.mb ? a(0, ((na) super.z).B, data, this.H, i, this.i(), this
				.f(), 0, len, i1, this) : b(((na) super.z).B, data, this.H, i, this.G, 0, len, i1, this)) : (qb.mb ? a(0, 0, ((na) super.z).B, data, this.H, i, this.i(), this
				.f(), 0, len, i1, this, this.O, i2) : b(0, 0, ((na) super.z).B, data, this.H, i, this.G, 0, len, i1, this, this.O, i2));
	}

	private int i () {
		return this.Q < 0 ? this.G : (int) ((double) this.G * Math.sqrt((double) (256 - this.Q) * 0.0078125D) + 0.5D);
	}

	final mc b () {
		return null;
	}
}
