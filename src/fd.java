final class fd {
	private static l l_a = new l();

	private static byte a (l class_l) {
		return (byte) a(1, class_l);
	}

	@SuppressWarnings({"unused", "SynchronizeOnNonFinalField"})
	static int a (byte[] bufferRead, int capacity, byte[] buf, int length, int unused) {
		synchronized (l_a) {
			int i;
			l_a.c = buf;
			l_a.cb = 9;
			l_a.eb = bufferRead;
			l_a.N = 0;
			l_a.db = capacity;
			l_a.int_a = 0;
			l_a.int_g = 0;
			l_a.q = 0;
			l_a.k = 0;
			d(l_a);
			capacity -= l_a.db;
			l_a.c = null;
			l_a.eb = null;
			i = capacity;
			return i;
		}
	}

	private static void b (l class_l) {
		class_l.d = 0;
		for (int index = 0 ; index < 256 ; ++index) {
			if (class_l.T[index]) {
				class_l.z[class_l.d] = (byte) index;
				++class_l.d;
			}
		}
	}

	private static void c (l class_l) {
		byte b = class_l.x;
		int i = class_l.p;
		int i1 = class_l.u;
		int i2 = class_l.A;
		int[] ints = id.M;
		int i3 = class_l.b;
		byte[] bytes = class_l.eb;
		int i4 = class_l.N;
		int i5 = class_l.db;
		int i6 = class_l.r + 1;
		label63:
		while (true) {
			if (i > 0) {
				while (true) {
					if (i5 == 0) {
						break label63;
					} else {
						if (i == 1) {
							if (i5 == 0) {
								i = 1;
								break label63;
							} else {
								bytes[i4] = b;
								++i4;
								--i5;
								break;
							}
						} else {
							bytes[i4] = b;
							--i;
							++i4;
							--i5;
						}
					}
				}
			}

			boolean flag = true;
			while (flag) {
				flag = false;
				if (i1 == i6) {
					i = 0;
					break label63;
				} else {
					b = (byte) i2;
					i3 = ints[i3];
					byte b1 = (byte) (i3 & 255);
					i3 >>= 8;
					++i1;
					if (b1 != i2) {
						i2 = b1;
						if (i5 == 0) {
							i = 1;
							break label63;
						} else {
							bytes[i4] = b;
							++i4;
							--i5;
							flag = true;
						}
					} else if (i1 == i6) {
						if (i5 == 0) {
							i = 1;
							break label63;
						} else {
							bytes[i4] = b;
							++i4;
							--i5;
							flag = true;
						}
					}
				}
			}

			i = 2;
			i3 = ints[i3];
			byte b1 = (byte) (i3 & 255);
			i3 >>= 8;
			++i1;
			if (i1 != i6) {
				if (b1 != i2) {
					i2 = b1;
				} else {
					i = 3;
					i3 = ints[i3];
					b1 = (byte) (i3 & 255);
					i3 >>= 8;
					++i1;
					if (i1 != i6) {
						if (b1 != i2) {
							i2 = b1;
						} else {
							i3 = ints[i3];
							b1 = (byte) (i3 & 255);
							i3 >>= 8;
							++i1;
							i = (b1 & 255) + 4;
							i3 = ints[i3];
							i2 = (byte) (i3 & 255);
							i3 >>= 8;
							++i1;
						}
					}
				}
			}
		}

		class_l.k += i5 - i5;
		class_l.x = b;
		class_l.p = i;
		class_l.u = i1;
		class_l.A = i2;
		id.M = ints;
		class_l.b = i3;
		class_l.eb = bytes;
		class_l.N = i4;
		class_l.db = i5;
	}

	private static void d (l class_l) {
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		boolean var9 = false;
		boolean var10 = false;
		boolean var11 = false;
		boolean var12 = false;
		boolean var13 = false;
		boolean var14 = false;
		boolean var15 = false;
		boolean var16 = false;
		boolean var17 = false;
		boolean var18 = false;
		boolean var19 = false;
		boolean var20 = false;
		boolean var21 = false;
		int i = 0;
		int[] ints = null;
		int[] ints1 = null;
		int[] ints2 = null;
		class_l.n = 1;
		if (id.M == null) {
			id.M = new int[class_l.n * 100000];
		}

		boolean flag = true;
		while (flag) {
			byte b = e(class_l);
			if (b == 23) {
				return;
			}

			b = e(class_l);
			b = e(class_l);
			b = e(class_l);
			b = e(class_l);
			b = e(class_l);
			b = e(class_l);
			b = e(class_l);
			b = e(class_l);
			b = e(class_l);
			b = a(class_l);
			class_l.int_hb = 0;
			b = e(class_l);
			class_l.int_hb = class_l.int_hb << 8 | b & 255;
			b = e(class_l);
			class_l.int_hb = class_l.int_hb << 8 | b & 255;
			b = e(class_l);
			class_l.int_hb = class_l.int_hb << 8 | b & 255;

			int i1;
			for (i1 = 0; i1 < 16 ; ++i1) {
				b = a(class_l);
				class_l.M[i1] = b == 1;
			}

			for (i1 = 0; i1 < 256 ; ++i1) {
				class_l.T[i1] = false;
			}

			int i2;
			for (i1 = 0; i1 < 16 ; ++i1) {
				if (class_l.M[i1]) {
					for (i2 = 0; i2 < 16 ; ++i2) {
						b = a(class_l);
						if (b == 1) {
							class_l.T[i1 * 16 + i2] = true;
						}
					}
				}
			}

			b(class_l);
			int i3 = class_l.d + 2;
			int i4 = a(3, class_l);
			int i5 = a(15, class_l);
			for (i1 = 0; i1 < i5 ; ++i1) {
				i2 = 0;

				while (true) {
					b = a(class_l);
					if (b == 0) {
						class_l.P[i1] = (byte) i2;
						break;
					}

					++i2;
				}
			}

			byte[] bytes = new byte[6];
			byte b1;
			for (b1 = 0; b1 < i4 ; bytes[b1] = b1++) {}

			for (i1 = 0; i1 < i5 ; ++i1) {
				b1 = class_l.P[i1];

				byte b2;
				for (b2 = bytes[b1]; b1 > 0 ; --b1) {
					bytes[b1] = bytes[b1 - 1];
				}

				bytes[0] = b2;
				class_l.F[i1] = b2;
			}

			int i6;
			for (i6 = 0; i6 < i4 ; ++i6) {
				int i7 = a(5, class_l);
				i1 = 0;
				while (i1 < i3) {
					while (true) {
						b = a(class_l);
						if (b == 0) {
							break;
						}
						b = a(class_l);
						if (b == 0) {
							++i7;
						} else {
							--i7;
						}
					}
					class_l.Y[i6][i1] = (byte) i7;
					++i1;
				}
			}

			for (i6 = 0; i6 < i4 ; ++i6) {
				byte b2 = 32;
				byte b3 = 0;
				for (i1 = 0; i1 < i3 ; ++i1) {
					if (class_l.Y[i6][i1] > b3) {
						b3 = class_l.Y[i6][i1];
					}

					if (class_l.Y[i6][i1] < b2) {
						b2 = class_l.Y[i6][i1];
					}
				}

				a(class_l.fb[i6], class_l.ints_f[i6], class_l.V[i6], class_l.Y[i6], b2, b3, i3);
				class_l.h[i6] = b2;
			}

			int i7 = class_l.d + 1;
			int i8 = -1;
			byte b2 = 0;
			for (i1 = 0; i1 <= 255 ; ++i1) {
				class_l.D[i1] = 0;
			}

			int i9 = 4095;
			for (int i10 = 15 ; i10 >= 0 ; --i10) {
				for (int i11 = 15 ; i11 >= 0 ; --i11) {
					class_l.S[i9] = (byte) (i10 * 16 + i11);
					--i9;
				}

				class_l.W[i10] = i9 + 1;
			}

			int i10 = 0;
			byte b3;
			if (b2 == 0) {
				++i8;
				b2 = 50;
				b3 = class_l.F[i8];
				i = class_l.h[b3];
				ints = class_l.fb[b3];
				ints2 = class_l.V[b3];
				ints1 = class_l.ints_f[b3];
			}

			int i11 = b2 - 1;
			int i12 = i;
			int i13;
			byte b4;
			for (i13 = a(i, class_l); i13 > ints[i12] ; i13 = i13 << 1 | b4) {
				++i12;
				b4 = a(class_l);
			}

			int i14 = ints2[i13 - ints1[i12]];
			while (i14 != i7) {
				if (i14 != 0 && i14 != 1) {
					int i15 = i14 - 1;
					int i16;
					if (i15 < 16) {
						i16 = class_l.W[0];

						for (b = class_l.S[i16 + i15]; i15 > 3 ; i15 -= 4) {
							int i17 = i16 + i15;
							class_l.S[i17] = class_l.S[i17 - 1];
							class_l.S[i17 - 1] = class_l.S[i17 - 2];
							class_l.S[i17 - 2] = class_l.S[i17 - 3];
							class_l.S[i17 - 3] = class_l.S[i17 - 4];
						}

						while (i15 > 0) {
							class_l.S[i16 + i15] = class_l.S[i16 + i15 - 1];
							--i15;
						}

						class_l.S[i16] = b;
					} else {
						int i17 = i15 / 16;
						int i18 = i15 % 16;
						i16 = class_l.W[i17] + i18;

						for (b = class_l.S[i16]; i16 > class_l.W[i17] ; --i16) {
							class_l.S[i16] = class_l.S[i16 - 1];
						}

						++class_l.W[i17];

						while (i17 > 0) {
							--class_l.W[i17];
							class_l.S[class_l.W[i17]] = class_l.S[class_l.W[i17 - 1] + 16 - 1];
							--i17;
						}

						--class_l.W[0];
						class_l.S[class_l.W[0]] = b;
						if (class_l.W[0] == 0) {
							int i19 = 4095;
							for (int i20 = 15 ; i20 >= 0 ; --i20) {
								for (int i21 = 15 ; i21 >= 0 ; --i21) {
									class_l.S[i19] = class_l.S[class_l.W[i20] + i21];
									--i19;
								}

								class_l.W[i20] = i19 + 1;
							}
						}
					}

					++class_l.D[class_l.z[b & 255] & 255];
					id.M[i10] = class_l.z[b & 255] & 255;
					++i10;
					if (i11 == 0) {
						++i8;
						i11 = 50;
						b3 = class_l.F[i8];
						i = class_l.h[b3];
						ints = class_l.fb[b3];
						ints2 = class_l.V[b3];
						ints1 = class_l.ints_f[b3];
					}

					--i11;
					i12 = i;

					for (i13 = a(i, class_l); i13 > ints[i12] ; i13 = i13 << 1 | b4) {
						++i12;
						b4 = a(class_l);
					}

					i14 = ints2[i13 - ints1[i12]];
				} else {
					int i15 = -1;
					int i16 = 1;
					do {
						if (i14 == 0) {
							i15 += i16;
						} else if (i14 == 1) {
							i15 += 2 * i16;
						}

						i16 *= 2;
						if (i11 == 0) {
							++i8;
							i11 = 50;
							b3 = class_l.F[i8];
							i = class_l.h[b3];
							ints = class_l.fb[b3];
							ints2 = class_l.V[b3];
							ints1 = class_l.ints_f[b3];
						}

						--i11;
						i12 = i;

						for (i13 = a(i, class_l); i13 > ints[i12] ; i13 = i13 << 1 | b4) {
							++i12;
							b4 = a(class_l);
						}

						i14 = ints2[i13 - ints1[i12]];
					} while (i14 == 0 || i14 == 1);

					++i15;
					b = class_l.z[class_l.S[class_l.W[0]] & 255];

					for (class_l.D[b & 255] += i15; i15 > 0 ; --i15) {
						id.M[i10] = b & 255;
						++i10;
					}
				}
			}

			class_l.p = 0;
			class_l.x = 0;
			class_l.L[0] = 0;

			for (i1 = 1; i1 <= 256 ; ++i1) {
				class_l.L[i1] = class_l.D[i1 - 1];
			}

			for (i1 = 1; i1 <= 256 ; ++i1) {
				class_l.L[i1] += class_l.L[i1 - 1];
			}

			for (i1 = 0; i1 < i10 ; ++i1) {
				b = (byte) (id.M[i1] & 255);
				id.M[class_l.L[b & 255]] |= i1 << 8;
				++class_l.L[b & 255];
			}

			class_l.b = id.M[class_l.int_hb] >> 8;
			class_l.u = 0;
			class_l.b = id.M[class_l.b];
			class_l.A = (byte) (class_l.b & 255);
			class_l.b >>= 8;
			++class_l.u;
			class_l.r = i10;
			c(class_l);
			flag = class_l.u == class_l.r + 1 && class_l.p == 0;
		}
	}

	private static byte e (l class_l) {
		return (byte) a(8, class_l);
	}

	private static int a (int i, l class_l) {
		while (class_l.int_a < i) {
			class_l.int_g = class_l.int_g << 8 | class_l.c[class_l.cb] & 255;
			class_l.int_a += 8;
			++class_l.cb;
			++class_l.q;
		}

		int i1 = class_l.int_g >> class_l.int_a - i & (1 << i) - 1;
		class_l.int_a -= i;
		return i1;
	}

	public static void a () {
		l_a = null;
	}

	private static void a (int[] ints, int[] ints1, int[] ints2, byte[] bytes, int i, int i1, int i2) {
		int i3 = 0;
		int i4;
		for (i4 = i; i4 <= i1 ; ++i4) {
			for (int i5 = 0 ; i5 < i2 ; ++i5) {
				if (bytes[i5] == i4) {
					ints2[i3] = i5;
					++i3;
				}
			}
		}

		for (i4 = 0; i4 < 23 ; ++i4) {
			ints1[i4] = 0;
		}

		for (i4 = 0; i4 < i2 ; ++i4) {
			++ints1[bytes[i4] + 1];
		}

		for (i4 = 1; i4 < 23 ; ++i4) {
			ints1[i4] += ints1[i4 - 1];
		}

		for (i4 = 0; i4 < 23 ; ++i4) {
			ints[i4] = 0;
		}

		int i5 = 0;
		for (i4 = i; i4 <= i1 ; ++i4) {
			i5 += ints1[i4 + 1] - ints1[i4];
			ints[i4] = i5 - 1;
			i5 <<= 1;
		}

		for (i4 = i + 1; i4 <= i1 ; ++i4) {
			ints1[i4] = (ints[i4 - 1] + 1 << 1) - ints1[i4];
		}
	}
}
