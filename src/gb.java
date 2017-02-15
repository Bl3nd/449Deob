import java.util.Random;

final class gb extends ic {
	private static boolean boolean_gb = false;
	private static rd darkRedText = md.a((String) "dre", (byte) 127);
	private static rd orange2Text = md.a((String) "or2", (byte) 119);
	private static rd green3Text = md.a((String) "gr3", (byte) 126);
	private static rd blueText = md.a((String) "blu", (byte) 125);
	private static rd strikeText_ = md.a((String) "@str@", (byte) 127);
	private static rd strikeText = md.a((String) "str", (byte) 116);
	private static rd redText = md.a((String) "red", (byte) 121);
	private static rd blackText = md.a((String) "bla", (byte) 121);
	private static rd darkBlackText_ = md.a((String) "dbl", (byte) 115);
	private static rd yellowText = md.a((String) "yel", (byte) 118);
	private static rd greenText = md.a((String) "gre", (byte) 124);
	private static rd lightRedText = md.a((String) "lre", (byte) 127);
	private static rd orange3Text = md.a((String) "or3", (byte) 123);
	private static rd[] yb = new rd[100];
	private static rd orange1Text = md.a((String) "or1", (byte) 123);
	private static rd cyanText = md.a((String) "cya", (byte) 115);
	private static rd green1Text = md.a((String) "gr1", (byte) 119);
	private static rd green2Text = md.a((String) "gr2", (byte) 120);
	private static rd whiteText = md.a((String) "whi", (byte) 119);
	private static rd Ib = md.a((String) "mag", (byte) 116);
	int Fb = 0;
	private int[] ints_mb;
	private int[] ints_qb;
	private Random random_rb = new Random();
	private int[] ints_vb;
	private byte[][] zb = new byte[256][];
	private int Gb;
	private int Hb;

	gb (int[] ints, int[] ints1, int[] ints2, int[] ints3, byte[][] bytes) {
		this.ints_qb = ints;
		this.ints_mb = ints1;
		this.ints_vb = ints2;
		byte b = 0;
		for (int index = 1 ; index < ints3.length ; ++index) {
			if (ints3[index] == 1) {
				b = (byte) index;
			}
		}

		this.zb = bytes;
		int maxValue = Integer.MAX_VALUE;
		int minValue = Integer.MIN_VALUE;
		for (int index = 0 ; index < 256 ; ++index) {
			if (this.ints_qb[index] < maxValue && this.ints_vb[index] != 0) {
				maxValue = this.ints_qb[index];
			}

			if (this.ints_qb[index] + this.ints_vb[index] > minValue) {
				minValue = this.ints_qb[index] + this.ints_vb[index];
			}

			byte[] bytes1 = this.zb[index];
			int length = bytes1.length;
			for (int i = 0 ; i < length ; ++i) {
				bytes1[i] = (byte) (bytes1[i] == b ? 0 : 1);
			}
		}

		this.Fb = this.ints_qb[32] + this.ints_vb[32];
		this.Gb = this.Fb - maxValue;
		this.Hb = minValue - this.Fb;
	}

	gb (byte[] buffer) {
		this.ints_mb = new int[buffer.length];
		for (int pointer = 0 ; pointer < this.ints_mb.length ; ++pointer) {
			this.ints_mb[pointer] = buffer[pointer] & 255;
		}
	}

	private static void a (int[] pixels, byte[] bytes, int color, int i1, int i2, int i3, int i4, int i5, int i6, int nextInt) {
		color = ((color & 16711935) * nextInt & -16711936) + ((color & '\uff00') * nextInt & 16711680) >> 8;
		nextInt = 256 - nextInt;
		for (int i8 = -i4 ; i8 < 0 ; ++i8) {
			for (int i9 = -i3 ; i9 < 0 ; ++i9) {
				if (bytes[i1++] != 0) {
					int pixel = pixels[i2];
					pixels[i2++] = (((pixel & 16711935) * nextInt & -16711936) + ((pixel & '\uff00') * nextInt & 16711680) >> 8) + color;
				} else {
					++i2;
				}
			}

			i2 += i5;
			i1 += i6;
		}
	}

	private static void a (int[] pixels, byte[] bytes, int color, int i1, int i2, int i3, int i4, int i5, int i6) {
		int i7 = -(i3 >> 2);
		i3 = -(i3 & 3);
		for (int i8 = -i4 ; i8 < 0 ; ++i8) {
			for (int i9 = i7 ; i9 < 0 ; ++i9) {
				if (bytes[i1++] != 0) {
					pixels[i2++] = color;
				} else {
					++i2;
				}

				if (bytes[i1++] != 0) {
					pixels[i2++] = color;
				} else {
					++i2;
				}

				if (bytes[i1++] != 0) {
					pixels[i2++] = color;
				} else {
					++i2;
				}

				if (bytes[i1++] != 0) {
					pixels[i2++] = color;
				} else {
					++i2;
				}
			}

			for (int i9 = i3 ; i9 < 0 ; ++i9) {
				if (bytes[i1++] != 0) {
					pixels[i2++] = color;
				} else {
					++i2;
				}
			}

			i2 += i5;
			i1 += i6;
		}
	}

	private static void a (byte[] bytes, int x, int y, int i2, int i3, int color) {
		int i5 = x + y * ic.width;
		int i6 = ic.width - i2;
		int i7 = 0;
		int i8 = 0;
		int i9;
		if (y < ic.int_bb) {
			i9 = ic.int_bb - y;
			i3 -= i9;
			y = ic.int_bb;
			i8 += i9 * i2;
			i5 += i9 * ic.width;
		}

		if (y + i3 > ic.int_db) {
			i3 -= y + i3 - ic.int_db;
		}

		if (x < ic.int_ab) {
			i9 = ic.int_ab - x;
			i2 -= i9;
			x = ic.int_ab;
			i8 += i9;
			i5 += i9;
			i7 += i9;
			i6 += i9;
		}

		if (x + i2 > ic.Z) {
			i9 = x + i2 - ic.Z;
			i2 -= i9;
			i7 += i9;
			i6 += i9;
		}

		if (i2 > 0 && i3 > 0) {
			a(ic.pixels, bytes, color, i8, i5, i2, i3, i6, i7);
		}
	}

	private static void a (byte[] bytes, int x, int y, int i2, int i3, int color, int nextInt) {
		int i = x + y * ic.width;
		int i1 = ic.width - i2;
		int i6 = 0;
		int i7 = 0;
		int i8;
		if (y < ic.int_bb) {
			i8 = ic.int_bb - y;
			i3 -= i8;
			y = ic.int_bb;
			i7 += i8 * i2;
			i += i8 * ic.width;
		}

		if (y + i3 > ic.int_db) {
			i3 -= y + i3 - ic.int_db;
		}

		if (x < ic.int_ab) {
			i8 = ic.int_ab - x;
			i2 -= i8;
			x = ic.int_ab;
			i7 += i8;
			i += i8;
			i6 += i8;
			i1 += i8;
		}

		if (x + i2 > ic.Z) {
			i8 = x + i2 - ic.Z;
			i2 -= i8;
			i6 += i8;
			i1 += i8;
		}

		if (i2 > 0 && i3 > 0) {
			a(ic.pixels, bytes, color, i7, i, i2, i3, i1, i6, nextInt);
		}
	}

	public static void d () {
		strikeText = null;
		strikeText_ = null;
		redText = null;
		greenText = null;
		blueText = null;
		yellowText = null;
		cyanText = null;
		Ib = null;
		whiteText = null;
		blackText = null;
		lightRedText = null;
		darkRedText = null;
		darkBlackText_ = null;
		orange1Text = null;
		orange2Text = null;
		orange3Text = null;
		green1Text = null;
		green2Text = null;
		green3Text = null;
		yb = null;
	}

	private void a (rd text, int x, int y, int color, boolean flag, int i3) {
		text = text.d(-6488);
		int i4 = 0;
		for (int pointer = 0 ; pointer < text.b(-29348) ; ++pointer) {
			if (text.readUnsignedByte(pointer, -14412) == 32) {
				++i4;
			}
		}

		int i5 = 0;
		int i6 = 0;
		if (i4 > 0) {
			i5 = (i3 - this.a(text)) * 256 / i4;
		}

		boolean_gb = false;
		int i7 = x;
		y -= this.Fb;
		for (int pointer = 0 ; pointer < text.stringPointer ; ++pointer) {
			int i8;
			if (text.stringBuffer[pointer] == 64 && pointer + 4 < text.stringPointer && text.stringBuffer[pointer + 4] == 64) {
				i8 = this.c(text.b(pointer + 4, -23745, pointer + 1));
				if (i8 != -1) {
					color = i8;
				}

				pointer += 4;
			} else {
				i8 = text.stringBuffer[pointer] & 255;
				if (i8 != 32) {
					if (flag) {
						a(this.zb[i8], x + 1, y + this.ints_qb[i8] + 1, this.ints_mb[i8], this.ints_vb[i8], 0);
					}

					a(this.zb[i8], x, y + this.ints_qb[i8], this.ints_mb[i8], this.ints_vb[i8], color);
				}

				x += this.ints_mb[i8];
				if (i8 == 32) {
					i6 += i5;
					x += i6 / 256;
					i6 &= 255;
				}
			}
		}

		if (boolean_gb) {
			ic.b(x, y + (int) ((double) this.Fb * 0.7D), x - i7, 8388608);
		}
	}

	final int a (rd class_rd, int i) {
		int length = this.a(class_rd, i, true);
		int i2 = 0;
		for (int var5 = 0 ; var5 < length ; ++var5) {
			int i1 = this.b(yb[var5]);
			if (i1 > i2) {
				i2 = i1;
			}
		}

		return i2;
	}

	final void a (rd class_rd, int i, int i1, int color) {
		this.b(class_rd, i - this.b(class_rd), i1, color);
	}

	final void b (rd class_rd, int x, int y, int color, boolean flag, int seed) {
		if (class_rd != null) {
			this.random_rb.setSeed((long) seed);
			int nextInt = 192 + (this.random_rb.nextInt() & 31);
			y -= this.Fb;
			for (int pointer = 0 ; pointer < class_rd.stringPointer ; ++pointer) {
				int i;
				if (class_rd.stringBuffer[pointer] == 64 && pointer + 4 < class_rd.stringPointer && class_rd.stringBuffer[pointer + 4] == 64) {
					i = this.c(class_rd.b(pointer + 4, -23745, pointer + 1));
					if (i != -1) {
						color = i;
					}

					pointer += 4;
				} else {
					i = class_rd.stringBuffer[pointer] & 255;
					if (i != 32) {
						if (flag) {
							a(this.zb[i], x + 1, y + this.ints_qb[i] + 1, this.ints_mb[i], this.ints_vb[i], 0, 192);
						}

						a(this.zb[i], x, y + this.ints_qb[i], this.ints_mb[i], this.ints_vb[i], color, nextInt);
					}

					x += this.ints_mb[i];
					if ((this.random_rb.nextInt() & 3) == 0) {
						++x;
					}
				}
			}
		}
	}

	final void a (rd text, int i, int i1, int i2, int i3) {
		if (text != null) {
			i -= this.b(text) / 2;
			i1 -= this.Fb;

			for (int pointer = 0 ; pointer < text.stringPointer ; ++pointer) {
				int value = text.stringBuffer[pointer] & 255;
				if (value != 32) {
					a(this.zb[value], i, i1 + this.ints_qb[value] + (int) (Math.sin((double) pointer / 2.0D + (double) i3 / 5.0D) * 5.0D), this.ints_mb[value], this.ints_vb[value], i2);
				}

				i += this.ints_mb[value];
			}
		}
	}

	final void a (rd text, int i, int i1, int i2, boolean flag) {
		this.c(text, i - this.a(text), i1, i2, flag);
	}

	final void b (rd var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			var2 -= this.b(var1) / 2;
			var3 -= this.Fb;

			for (int var6 = 0 ; var6 < var1.b(-29348) ; ++var6) {
				int var7 = var1.stringBuffer[var6] & 255;
				if (var7 != 32) {
					a(this.zb[var7], var2 + (int) (Math
							.sin((double) var6 / 5.0D + (double) var5 / 5.0D) * 5.0D), var3 + this.ints_qb[var7] + (int) (Math
							.sin((double) var6 / 3.0D + (double) var5 / 5.0D) * 5.0D), this.ints_mb[var7], this.ints_vb[var7], var4);
				}

				var2 += this.ints_mb[var7];
			}
		}
	}

	final int a (rd text) {
		if (text == null) {
			return 0;
		} else {
			int value = 0;
			for (int index = 0 ; index < text.stringPointer ; ++index) {
				if (text.stringBuffer[index] == 64 && index + 4 < text.stringPointer && text.stringBuffer[index + 4] == 64) {
					index += 4;
				} else {
					value += this.ints_mb[text.stringBuffer[index] & 255];
				}
			}

			return value;
		}
	}

	final int b (rd text) {
		if (text == null) {
			return 0;
		} else {
			int value = 0;
			for (int index = 0 ; index < text.stringPointer ; ++index) {
				value += this.ints_mb[text.stringBuffer[index] & 255];
			}

			return value;
		}
	}

	final int f (int var1) {
		return this.ints_mb[var1 & 255];
	}

	final int b (rd var1, int var2) {
		return this.a(var1, var2, true);
	}

	final void a (rd text, int var2, int var3, int var4, int var5, int var6, boolean var7, int var8, int var9,
				  int var10) {
		if (text != null) {
			if (var10 == 0) {
				var10 = this.Fb;
			}

			boolean var11 = true;
			if (var5 < this.Gb + this.Hb + var10 && var5 < var10 + var10) {
				var11 = false;
			}

			int var12 = this.a(text, var4, var11);
			if (var9 == 3 && var12 == 1) {
				var9 = 1;
			}

			int var13;
			int var14;
			if (var9 == 0) {
				var13 = var3 + this.Gb;
			} else if (var9 == 1) {
				var13 = var3 + this.Gb + (var5 - this.Gb - this.Hb - (var12 - 1) * var10) / 2;
			} else if (var9 == 2) {
				var13 = var3 + var5 - this.Hb - (var12 - 1) * var10;
			} else {
				var14 = (var5 - this.Gb - this.Hb - (var12 - 1) * var10) / (var12 + 1);
				if (var14 < 0) {
					var14 = 0;
				}

				var13 = var3 + this.Gb + var14;
				var10 += var14;
			}

			for (var14 = 0; var14 < var12 ; ++var14) {
				if (var8 == 0) {
					this.c(yb[var14], var2, var13, var6, var7);
				} else if (var8 == 1) {
					this.b(yb[var14], var2 + var4 / 2, var13, var6, var7);
				} else if (var8 == 2) {
					this.a(yb[var14], var2 + var4, var13, var6, var7);
				} else if (var14 == var12 - 1) {
					this.c(yb[var14], var2, var13, var6, var7);
				} else {
					this.a(yb[var14], var2, var13, var6, var7, var4);
				}

				var13 += var10;
			}
		}
	}

	final void a (rd var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			double var7 = 7.0D - (double) var6 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			var2 -= this.b(var1) / 2;
			var3 -= this.Fb;

			for (int var9 = 0 ; var9 < var1.b(-29348) ; ++var9) {
				int var10 = var1.stringBuffer[var9] & 255;
				if (var10 != 32) {
					a(this.zb[var10], var2, var3 + this.ints_qb[var10] + (int) (Math
							.sin((double) var9 / 1.5D + (double) var5) * var7), this.ints_mb[var10], this.ints_vb[var10], var4);
				}

				var2 += this.ints_mb[var10];
			}

		}
	}

	private int c (rd textColor) {
		if (textColor.a(redText, false)) {
			return 16711680;
		} else if (textColor.a(greenText, false)) {
			return '\uff00';
		} else if (textColor.a(blueText, false)) {
			return 255;
		} else if (textColor.a(yellowText, false)) {
			return 16776960;
		} else if (textColor.a(cyanText, false)) {
			return '\uffff';
		} else if (textColor.a(Ib, false)) {
			return 16711935;
		} else if (textColor.a(whiteText, false)) {
			return 16777215;
		} else if (textColor.a(blackText, false)) {
			return 0;
		} else if (textColor.a(lightRedText, false)) {
			return 16748608;
		} else if (textColor.a(darkRedText, false)) {
			return 8388608;
		} else if (textColor.a(darkBlackText_, false)) {
			return 128;
		} else if (textColor.a(orange1Text, false)) {
			return 16756736;
		} else if (textColor.a(orange2Text, false)) {
			return 16740352;
		} else if (textColor.a(orange3Text, false)) {
			return 16723968;
		} else if (textColor.a(green1Text, false)) {
			return 12648192;
		} else if (textColor.a(green2Text, false)) {
			return 8453888;
		} else if (textColor.a(green3Text, false)) {
			return 4259584;
		} else {
			if (textColor.a(strikeText, false)) {
				boolean_gb = true;
			}

			return -1;
		}
	}

	final void b (rd text, int i, int i1, int color) {
		if (text != null) {
			i1 -= this.Fb;
			for (int index = 0 ; index < text.stringPointer ; ++index) {
				int value = text.stringBuffer[index] & 255;
				if (value != 32) {
					a(this.zb[value], i, i1 + this.ints_qb[value], this.ints_mb[value], this.ints_vb[value], color);
				}

				i += this.ints_mb[value];
			}
		}
	}

	private int a (rd var1, int var2, boolean var3) {
		int var4 = 0;
		int var5 = 0;
		rd var6 = qe.a((byte) -8, 100);
		int var7 = -1;
		int var8 = 0;
		rd var9 = null;
		int var10 = 0;
		boolean var11 = false;
		int var12 = 0;
		int var13 = 0;
		int var14 = var1.b(-29348);

		for (int var15 = 0 ; var15 < var14 ; ++var15) {
			int var16 = var1.readUnsignedByte(var15, -14412);
			if (var16 == 64 && var15 + 4 < var14 && var1.readUnsignedByte(var15 + 4, -14412) == 64) {
				rd var17 = var1.b(var15 + 5, -23745, var15);
				if (var17.a(strikeText, false)) {
					var11 = true;
					var12 = var6.b(-29348);
				} else {
					var9 = var17;
					var10 = var6.b(-29348);
				}

				var6.a(var17, (byte) 69);
				var15 += 4;
			} else if (var16 == 92 && var15 + 1 < var14 && var1.readUnsignedByte(var15 + 1, -14412) == 110) {
				yb[var13++] = var6.b(var6.b(-29348), -23745, var5).d(-6488);
				var5 = var6.b(-29348);
				var4 = 0;
				var7 = -1;
				++var15;
				var9 = null;
				var11 = false;
			} else {
				var6.c(var16, -101);
				var4 += this.f(var16);
				if (var16 == 32 || var16 == 45) {
					var7 = var6.b(-29348);
					var8 = var4;
				}

				if (var3 && var4 > var2 && var7 >= 0) {
					yb[var13++] = var6.b(var7, -23745, var5).d(-6488);
					var5 = var7;
					var7 = -1;
					var4 -= var8;
					if (var9 != null && var10 < var5 && var5 > 4) {
						var5 -= 5;
						var6.a(var5, (byte) 74, var9);
					}

					if (var11 && var12 < var5 && var5 > 4) {
						var5 -= 5;
						var6.a(var5, (byte) -65, strikeText_);
					}
				}
			}
		}

		if (var6.b(-29348) > var5) {
			yb[var13++] = var6.b(var6.b(-29348), -23745, var5).d(-6488);
		}

		return var13;
	}

	final void b (rd text, int i, int i1, int color, boolean flag) {
		this.c(text, i - this.a(text) / 2, i1, color, flag);
	}

	final void c (rd text, int i, int i1, int color) {
		this.b(text, i - this.b(text) / 2, i1, color);
	}

	final void c (rd text, int i, int i1, int color, boolean flag) {
		boolean_gb = false;
		int i3 = i;
		if (text != null) {
			i1 -= this.Fb;
			for (int index = 0 ; index < text.stringPointer ; ++index) {
				if (text.stringBuffer[index] == 64 && index + 4 < text.stringPointer && text.stringBuffer[index + 4] == 64) {
					int i4 = this.c(text.b(index + 4, -23745, index + 1));
					if (i4 != -1) {
						color = i4;
					}

					index += 4;
				} else {
					int i4 = text.stringBuffer[index] & 255;
					if (i4 != 32) {
						if (flag) {
							a(this.zb[i4], i + 1, i1 + this.ints_qb[i4] + 1, this.ints_mb[i4], this.ints_vb[i4], 0);
						}

						a(this.zb[i4], i, i1 + this.ints_qb[i4], this.ints_mb[i4], this.ints_vb[i4], color);
					}

					i += this.ints_mb[i4];
				}
			}

			if (boolean_gb) {
				ic.b(i, i1 + (int) ((double) this.Fb * 0.7D), i - i3, 8388608);
			}
		}
	}
}
