final class dc {
	static oa[] oas_b;
	static volatile long long_c = 0L;
	static oa oa_d;
	static int int_e;
	static int int_f;
	static int int_h = 1;
	static int int_j;
	static jd jd_k;
	static int int_l;
	static rd close2;
	static int int_n;
	static int int_o;
	static int int_p;
	static rd rd_q = md.a((String) " )2> @lre@", (byte) 125);
	static bb[] cacheIDXIndices_r = new bb[14];
	static int int_s;
	static int int_t = 20;
	static int int_u;
	static boolean[] x = new boolean[]{
			true,
			true,
			true,
			true,
			true,
			true,
			true,
			true,
			true,
			true,
			true,
			true,
			true,
			true,
			true,
			true,
			true,
			true,
			true,
			true,
			true,
			true,
			true,
			false,
			false
	};
	static jd A;
	static int B;
	private static rd close = md.a((String) "Close", (byte) 119);

	static {
		close2 = close;
	}

	private int int_a;
	private int[] ints_g;
	private int[] ints_i;
	private int int_v;
	private int y;
	private int z;

	dc (int[] isaac) {
		try {
			this.ints_i = new int[256];
			this.ints_g = new int[256];
			System.arraycopy(isaac, 0, this.ints_g, 0, isaac.length);
			this.a((byte) 101);
		} catch (RuntimeException var4) {
			throw id.a(var4, "dc.<init>(" + (isaac != null ? "{...}" : "null") + ')');
		}
	}

	public static void a (int unused) {
		try {
			oa_d = null;
			jd_k = null;
			oas_b = null;
			rd_q = null;
			cacheIDXIndices_r = null;
			A = null;
			x = null;
			close2 = null;
			close = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "dc.C(" + unused + ')');
		}
	}

	@SuppressWarnings("SameParameterValue")
	static Class getParameterByType (boolean unused, String type) throws ClassNotFoundException {
		try {
			++int_o;
			switch (type) {
				case "B":
					return Byte.TYPE;
				case "I":
					return Integer.TYPE;
				case "S":
					return Short.TYPE;
				case "J":
					return Long.TYPE;
				case "Z":
					return Boolean.TYPE;
				case "F":
					return Float.TYPE;
				case "D":
					return Double.TYPE;
				default:
					return type.equals("C") ? Character.TYPE : Class.forName(type);
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "dc.F(" + unused + ',' + "{...}" + ')');
		}
	}

	static void b (int unused) {
		try {
			tb.Wb.c(-93);
			++B;
		} catch (RuntimeException var2) {
			throw id.a(var2, "dc.H(" + unused + ')');
		}
	}

	static int a (int i, int i1, boolean unused) {
		try {
			++int_p;
			int i2 = ff.a(i1 - 1, -1 + i, Integer.MAX_VALUE) + ff.a(-1 + i1, i + 1, Integer.MAX_VALUE) - (-ff.a(1 + i1, i + -1, Integer.MAX_VALUE) + -ff
					.a(1 + i1, 1 + i, Integer.MAX_VALUE));
			int i3 = ff.a(i1, i - 1, Integer.MAX_VALUE) - -ff.a(i1, i - -1, Integer.MAX_VALUE) - (-ff.a(-1 + i1, i, Integer.MAX_VALUE) - ff.a(i1 - -1, i, Integer.MAX_VALUE));
			int a = ff.a(i1, i, Integer.MAX_VALUE);
			return i3 / 8 + i2 / 16 + (a / 4);
		} catch (RuntimeException var6) {
			throw id.a(var6, "dc.J(" + i + ',' + i1 + ',' + unused + ')');
		}
	}

	static void b (byte unused) {
		try {
			++int_s;
			sb.d(-12);
			if (q.y == 1) {
				rb.cross[b.int_ed / 100].a(-4 + ka.Rb + -8, -12 + ja.int_k);
			} else if (q.y == 2) {
				rb.cross[4 + (b.int_ed / 100)].a(-4 + ka.Rb - 8, ja.int_k + -12);
			}

			if (kd.t != -1) {
				client.b(kd.t, 0);
				wd.a(0, 334, 512, 0, false, 4, kd.t);
			}

			if (sa.zb != -1) {
				client.b(sa.zb, 0);
				wd.a(0, 334, 512, 0, false, 0, sa.zb);
			}

			j.h(-826);
			if (!s.ub) {
				je.a(true);
				sa.h(-24413);
			} else {
				if (bf.int_d == 0) {
					db.f(-7);
				}
			}

			if (uc.Vb == 1) {
				rd.overlay_multiway.a(472, 296);
			}

			if (t.g) {
				short sh = 507;
				byte b = 20;
				ad.gb_a.a(pc.a((byte) 127, new rd[]{pc.fps_, bf.a(wc.gameFPS, -31766)}), sh, b, 0xffff00);
				int i = b + 15;
				Runtime runtime = Runtime.getRuntime();
				int memory = (int) ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L);
				int color = 16776960;
				if (memory > 32768 && jb.L) {
					color = 16711680;
				}

				if (memory > 65536 && !jb.L) {
					color = 16711680;
				}

				ad.gb_a.a(pc.a((byte) 125, new rd[]{s.mem_, bf.a(memory, -31766), ff.k_}), sh, i, color);
				i += 15;
				if (ff.redrawSidePanel) {
					ad.gb_a.a(ha.sidePanelRedrawn, sh, i, 16711680);
					i += 15;
					ff.redrawSidePanel = false;
				}

				if (la.redrawChatPanel) {
					ad.gb_a.a(a.chatPanelRedrawn, sh, i, 16711680);
					la.redrawChatPanel = false;
					i += 15;
				}

				if (ie.redrawIcons) {
					ad.gb_a.a(me.iconsRedrawn, sh, i, 16711680);
					i += 15;
					ie.redrawIcons = false;
				}
			}

			if (le.updateTime != 0) {
				int second = le.updateTime / 50;
				int minute = second / 60;
				second %= 60;
				if (second >= 10) {
					ad.gb_a.b(pc.a((byte) 126, new rd[]{m.systemUpdateIn_2, bf.a(minute, -31766), pc.colon, bf.a(second, -31766)}), 4, 329, 16776960);
				} else {
					ad.gb_a.b(pc.a((byte) 127, new rd[]{m.systemUpdateIn_2, bf.a(minute, -44 ^ 31806), d.rd_e, bf.a(second, -31766)}), 4, 329, 16776960);
				}
			}
		} catch (RuntimeException var6) {
			throw id.a(var6, "dc.E(" + unused + ')');
		}
	}

	static void a (pb archiveFile2, int unused) {
		try {
			wc.archiveFile2 = archiveFile2;
			++int_u;
		} catch (RuntimeException var3) {
			throw id.a(var3, "dc.K(" + (archiveFile2 != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}

	static void d (int unused) {
		try {
			jc class_jc = (jc) ra.x.c((byte) 75);
			if (class_jc == null) {
				++int_n;
			} else {
				do {
					if (class_jc.A != null) {
						class_jc.e(17015);
					}

					class_jc = (jc) ra.x.a((byte) -68);
				} while (class_jc != null);

				++int_n;
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "dc.B(" + unused + ')');
		}
	}

	static int a (byte[] buffer, int i, int unused, int length) {
		try {
			int i1 = -1;
			int size = i;
			while (length > size) {
				i1 = i1 >>> 8 ^ ge.H[255 & (i1 ^ buffer[size])];
				++size;
			}

			i1 = ~i1;
			++int_l;
			return i1;
		} catch (RuntimeException var7) {
			throw id.a(var7, "dc.G(" + (buffer != null ? "{...}" : "null") + ',' + i + ',' + unused + ',' + length + ')');
		}
	}

	private void a (byte unused) {
		try {
			++int_e;
			int i = -1640531527;
			int i1 = -1640531527;
			int i2 = -1640531527;
			int i3 = -1640531527;
			int i4 = -1640531527;
			int i5 = -1640531527;
			int i6 = -1640531527;
			int i7 = -1640531527;
			int i8 = 0;
			while (i8 < 4) {
				i7 ^= i6 << 11;
				i6 += i5;
				i4 += i7;
				i6 ^= i5 >>> 2;
				i3 += i6;
				i5 += i4;
				i5 ^= i4 << 8;
				i2 += i5;
				i4 += i3;
				i4 ^= i3 >>> 16;
				i3 += i2;
				i3 ^= i2 << 10;
				i += i3;
				i1 += i4;
				i2 += i1;
				i2 ^= i1 >>> 4;
				i7 += i2;
				i1 += i;
				i1 ^= i << 8;
				i += i7;
				i ^= i7 >>> 9;
				i5 += i;
				i6 += i1;
				i7 += i6;
				++i8;
			}

			i8 = 0;
			do {
				i6 += this.ints_g[i8 + 1];
				i4 += this.ints_g[3 + i8];
				i5 += this.ints_g[i8 - -2];
				i += this.ints_g[7 + i8];
				i1 += this.ints_g[6 + i8];
				i7 += this.ints_g[i8];
				i7 ^= i6 << 11;
				i2 += this.ints_g[i8 + 5];
				i6 += i5;
				i3 += this.ints_g[i8 - -4];
				i4 += i7;
				i6 ^= i5 >>> 2;
				i5 += i4;
				i5 ^= i4 << 8;
				i3 += i6;
				i4 += i3;
				i2 += i5;
				i4 ^= i3 >>> 16;
				i3 += i2;
				i1 += i4;
				i3 ^= i2 << 10;
				i += i3;
				i2 += i1;
				i2 ^= i1 >>> 4;
				i1 += i;
				i7 += i2;
				i1 ^= i << 8;
				i += i7;
				i ^= i7 >>> 9;
				i5 += i;
				i6 += i1;
				i7 += i6;
				this.ints_i[i8] = i7;
				this.ints_i[i8 + 1] = i6;
				this.ints_i[2 + i8] = i5;
				this.ints_i[i8 + 3] = i4;
				this.ints_i[i8 - -4] = i3;
				this.ints_i[i8 - -5] = i2;
				this.ints_i[6 + i8] = i1;
				this.ints_i[7 + i8] = i;
				i8 += 8;
			} while (i8 < 256);

			i8 = 0;
			do {
				i1 += this.ints_i[i8 - -6];
				i4 += this.ints_i[3 + i8];
				i3 += this.ints_i[i8 - -4];
				i5 += this.ints_i[i8 + 2];
				i6 += this.ints_i[i8 + 1];
				i7 += this.ints_i[i8];
				i7 ^= i6 << 11;
				i2 += this.ints_i[5 + i8];
				i += this.ints_i[i8 - -7];
				i4 += i7;
				i6 += i5;
				i6 ^= i5 >>> 2;
				i5 += i4;
				i5 ^= i4 << 8;
				i3 += i6;
				i4 += i3;
				i2 += i5;
				i4 ^= i3 >>> 16;
				i3 += i2;
				i3 ^= i2 << 10;
				i1 += i4;
				i += i3;
				i2 += i1;
				i2 ^= i1 >>> 4;
				i7 += i2;
				i1 += i;
				i1 ^= i << 8;
				i += i7;
				i ^= i7 >>> 9;
				i6 += i1;
				i5 += i;
				i7 += i6;
				this.ints_i[i8] = i7;
				this.ints_i[1 + i8] = i6;
				this.ints_i[i8 + 2] = i5;
				this.ints_i[i8 - -3] = i4;
				this.ints_i[4 + i8] = i3;
				this.ints_i[5 + i8] = i2;
				this.ints_i[6 + i8] = i1;
				this.ints_i[7 + i8] = i;
				i8 += 8;
			} while (i8 < 256);

			this.c((byte) -87);
			this.int_a = 256;
		} catch (RuntimeException var12) {
			throw id.a(var12, "dc.D(" + unused + ')');
		}
	}

	final int c (int unused) {
		try {
			if (this.int_a-- == 0) {
				this.c((byte) -87);
				this.int_a = 255;
			}

			++int_j;
			return this.ints_g[this.int_a];
		} catch (RuntimeException var3) {
			throw id.a(var3, "dc.A(" + unused + ')');
		}
	}

	private void c (byte unused) {
		try {
			++int_f;
			this.y += ++this.z;
			int i = 0;
			do {
				int i1 = this.ints_i[i];
				if ((i & 2) == 0) {
					if ((i & 1) != 0) {
						this.int_v ^= this.int_v >>> 6;
					} else {
						this.int_v ^= this.int_v << 13;
					}
				} else if ((i & 1) != 0) {
					this.int_v ^= this.int_v >>> 16;
				} else {
					this.int_v ^= this.int_v << 2;
				}

				this.int_v += this.ints_i[255 & i - -128];
				int var4;
				this.ints_i[i] = var4 = this.ints_i[od.a(i1, 1020) >> 2] + this.int_v + this.y;
				this.ints_g[i] = this.y = this.ints_i[od.a(255, var4 >> 0xcdfd4c48 >> 883942306)] + i1;
				++i;
			} while (i < 256);

		} catch (RuntimeException var6) {
			throw id.a(var6, "dc.I(" + unused + ')');
		}
	}
}
