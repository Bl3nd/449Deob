class ic extends jb {
	static int Z = 0;
	static int int_ab = 0;
	static int int_bb = 0;
	static int[] pixels;
	static int int_db = 0;
	static int height;
	static int width;

	static void a () {
		int var0 = 0;

		int var1;
		for (var1 = width * height - 7; var0 < var1 ; pixels[var0++] = 0) {
			pixels[var0++] = 0;
			pixels[var0++] = 0;
			pixels[var0++] = 0;
			pixels[var0++] = 0;
			pixels[var0++] = 0;
			pixels[var0++] = 0;
			pixels[var0++] = 0;
		}

		for (var1 += 7; var0 < var1 ; pixels[var0++] = 0) {
			;
		}
	}

	static void b () {
		int_ab = 0;
		int_bb = 0;
		Z = width;
		int_db = height;
	}

	static void a (int width, int height, int x, int y, int color) {
		b(width, height, x, color);
		b(width, height + y - 1, x, color);
		c(width, height, y, color);
		c(width + x - 1, height, y, color);
	}

	static void a (int var0, int var1, int w, int h) {
		if (var0 < 0) {
			var0 = 0;
		}

		if (var1 < 0) {
			var1 = 0;
		}

		if (w > width) {
			w = width;
		}

		if (h > height) {
			h = height;
		}

		int_ab = var0;
		int_bb = var1;
		Z = w;
		int_db = h;
	}

	static void a (int[] var0) {
		int_ab = var0[0];
		int_bb = var0[1];
		Z = var0[2];
		int_db = var0[3];
	}

	static void a (int var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 < int_ab) {
			var2 -= int_ab - var0;
			var0 = int_ab;
		}

		if (var1 < int_bb) {
			var3 -= int_bb - var1;
			var1 = int_bb;
		}

		if (var0 + var2 > Z) {
			var2 = Z - var0;
		}

		if (var1 + var3 > int_db) {
			var3 = int_db - var1;
		}

		int var6 = 256 - var5;
		int var7 = (var4 >> 16 & 255) * var5;
		int var8 = (var4 >> 8 & 255) * var5;
		int var9 = (var4 & 255) * var5;
		int var13 = width - var2;
		int var14 = var0 + var1 * width;

		for (int var15 = 0 ; var15 < var3 ; ++var15) {
			for (int var16 = -var2 ; var16 < 0 ; ++var16) {
				int var10 = (pixels[var14] >> 16 & 255) * var6;
				int var11 = (pixels[var14] >> 8 & 255) * var6;
				int var12 = (pixels[var14] & 255) * var6;
				int var17 = (var7 + var10 >> 8 << 16) + (var8 + var11 >> 8 << 8) + (var9 + var12 >> 8);
				pixels[var14++] = var17;
			}

			var14 += var13;
		}
	}

	static void b (int var0, int var1, int var2, int var3, int var4) {
		var2 -= var0;
		var3 -= var1;
		if (var3 == 0) {
			if (var2 >= 0) {
				b(var0, var1, var2 + 1, var4);
			} else {
				b(var0 + var2, var1, -var2 + 1, var4);
			}
		} else if (var2 == 0) {
			if (var3 >= 0) {
				c(var0, var1, var3 + 1, var4);
			} else {
				c(var0, var1 + var3, -var3 + 1, var4);
			}
		} else {
			if (var2 + var3 < 0) {
				var0 += var2;
				var2 = -var2;
				var1 += var3;
				var3 = -var3;
			}

			int var5;
			int var6;
			if (var2 > var3) {
				var1 <<= 16;
				var1 += '耀';
				var3 <<= 16;
				var5 = (int) Math.floor((double) var3 / (double) var2 + 0.5D);
				var2 += var0;
				if (var0 < int_ab) {
					var1 += var5 * (int_ab - var0);
					var0 = int_ab;
				}

				if (var2 >= Z) {
					var2 = Z - 1;
				}

				while (var0 <= var2) {
					var6 = var1 >> 16;
					if (var6 >= int_bb && var6 < int_db) {
						pixels[var0 + var6 * width] = var4;
					}

					var1 += var5;
					++var0;
				}

			} else {
				var0 <<= 16;
				var0 += '耀';
				var2 <<= 16;
				var5 = (int) Math.floor((double) var2 / (double) var3 + 0.5D);
				var3 += var1;
				if (var1 < int_bb) {
					var0 += var5 * (int_bb - var1);
					var1 = int_bb;
				}

				if (var3 >= int_db) {
					var3 = int_db - 1;
				}

				while (var1 <= var3) {
					var6 = var0 >> 16;
					if (var6 >= int_ab && var6 < Z) {
						pixels[var6 + var1 * width] = var4;
					}

					var0 += var5;
					++var1;
				}

			}
		}
	}

	static void b (int width, int height, int x, int color) {
		if (height >= int_bb && height < int_db) {
			if (width < int_ab) {
				x -= int_ab - width;
				width = int_ab;
			}

			if (width + x > Z) {
				x = Z - width;
			}

			int i4 = width + height * ic.width;
			for (int index = 0 ; index < x ; ++index) {
				pixels[i4 + index] = color;
			}
		}
	}

	static void b (int var0, int var1, int var2, int var3, int var4, int var5) {
		d(var0, var1, var2, var4, var5);
		d(var0, var1 + var3 - 1, var2, var4, var5);
		if (var3 >= 3) {
			e(var0, var1 + 1, var3 - 2, var4, var5);
			e(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
		}

	}

	static void c (int x, int y, int width, int height, int color) {
		if (x < int_ab) {
			width -= int_ab - x;
			x = int_ab;
		}

		if (y < int_bb) {
			height -= int_bb - y;
			y = int_bb;
		}

		if (x + width > Z) {
			width = Z - x;
		}

		if (y + height > int_db) {
			height = int_db - y;
		}

		int i = ic.width - width;
		int i1 = x + y * ic.width;
		for (int h = -height ; h < 0 ; ++h) {
			for (int w = -width ; w < 0 ; ++w) {
				pixels[i1++] = color;
			}

			i1 += i;
		}
	}

	static void c (int width, int height, int y, int color) {
		if (width >= int_ab && width < Z) {
			if (height < int_bb) {
				y -= int_bb - height;
				height = int_bb;
			}

			if (height + y > int_db) {
				y = int_db - height;
			}

			int i4 = width + height * ic.width;
			for (int i5 = 0 ; i5 < y ; ++i5) {
				pixels[i4 + i5 * ic.width] = color;
			}
		}
	}

	private static void d (int var0, int var1, int var2, int var3, int var4) {
		if (var1 >= int_bb && var1 < int_db) {
			if (var0 < int_ab) {
				var2 -= int_ab - var0;
				var0 = int_ab;
			}

			if (var0 + var2 > Z) {
				var2 = Z - var0;
			}

			int var5 = 256 - var4;
			int var6 = (var3 >> 16 & 255) * var4;
			int var7 = (var3 >> 8 & 255) * var4;
			int var8 = (var3 & 255) * var4;
			int var12 = var0 + var1 * width;

			for (int var13 = 0 ; var13 < var2 ; ++var13) {
				int var9 = (pixels[var12] >> 16 & 255) * var5;
				int var10 = (pixels[var12] >> 8 & 255) * var5;
				int var11 = (pixels[var12] & 255) * var5;
				int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
				pixels[var12++] = var14;
			}
		}
	}

	static void a (int[] pixels, int w, int h) {
		ic.pixels = pixels;
		width = w;
		height = h;
		a(0, 0, w, h);
	}

	private static void e (int var0, int var1, int var2, int var3, int var4) {
		if (var0 >= int_ab && var0 < Z) {
			if (var1 < int_bb) {
				var2 -= int_bb - var1;
				var1 = int_bb;
			}

			if (var1 + var2 > int_db) {
				var2 = int_db - var1;
			}

			int var5 = 256 - var4;
			int var6 = (var3 >> 16 & 255) * var4;
			int var7 = (var3 >> 8 & 255) * var4;
			int var8 = (var3 & 255) * var4;
			int var12 = var0 + var1 * width;

			for (int var13 = 0 ; var13 < var2 ; ++var13) {
				int var9 = (pixels[var12] >> 16 & 255) * var5;
				int var10 = (pixels[var12] >> 8 & 255) * var5;
				int var11 = (pixels[var12] & 255) * var5;
				int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
				pixels[var12] = var14;
				var12 += width;
			}
		}
	}

	static void b (int[] var0) {
		var0[0] = int_ab;
		var0[1] = int_bb;
		var0[2] = Z;
		var0[3] = int_db;
	}

	public static void c () {
		pixels = null;
	}
}
