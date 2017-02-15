import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

final class he extends ic {
	int gb;
	int imageWidth;
	int[] imagePixels;
	int jb;
	int kb;
	int lb;
	int imageHeight;

	he () {
	}

	he (int var1, int var2) {
		this.imagePixels = new int[var1 * var2];
		this.imageWidth = this.lb = var1;
		this.imageHeight = this.kb = var2;
		this.gb = this.jb = 0;
	}

	he (byte[] imageData, Component component) {
		try {
			Image image = Toolkit.getDefaultToolkit().createImage(imageData);
			MediaTracker mediaTracker = new MediaTracker(component);
			mediaTracker.addImage(image, 0);
			mediaTracker.waitForAll();
			this.imageWidth = image.getWidth(component);
			this.imageHeight = image.getHeight(component);
			this.lb = this.imageWidth;
			this.kb = this.imageHeight;
			this.gb = 0;
			this.jb = 0;
			this.imagePixels = new int[this.imageWidth * this.imageHeight];
			PixelGrabber pixelGrabber = new PixelGrabber(image, 0, 0, this.imageWidth, this.imageHeight, this.imagePixels, 0, this.imageWidth);
			pixelGrabber.grabPixels();
		} catch (InterruptedException var6) {
			var6.printStackTrace();
		}
	}

	private static void a (int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7,
						   int var8, byte[] var9) {
		int var10 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var11 = -var6 ; var11 < 0 ; ++var11) {
			for (int var12 = var10 ; var12 < 0 ; ++var12) {
				var2 = var1[var3++];
				if (var2 != 0 && var9[var4] == 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				var2 = var1[var3++];
				if (var2 != 0 && var9[var4] == 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				var2 = var1[var3++];
				if (var2 != 0 && var9[var4] == 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				var2 = var1[var3++];
				if (var2 != 0 && var9[var4] == 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			for (int var13 = var5 ; var13 < 0 ; ++var13) {
				var2 = var1[var3++];
				if (var2 != 0 && var9[var4] == 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	private static void a (int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7,
						   int var8, int var9) {
		int var10 = 256 - var9;

		for (int var11 = -var6 ; var11 < 0 ; ++var11) {
			for (int var12 = -var5 ; var12 < 0 ; ++var12) {
				var2 = var1[var3++];
				if (var2 != 0) {
					int var13 = var0[var4];
					var0[var4++] = ((var2 & 16711935) * var9 + (var13 & 16711935) * var10 & -16711936) + ((var2 & '\uff00') * var9 + (var13 & '\uff00') * var10 & 16711680) >> 8;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	private static void a (int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7,
						   int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var10 = -var6 ; var10 < 0 ; ++var10) {
			for (int var11 = var9 ; var11 < 0 ; ++var11) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			for (int var12 = var5 ; var12 < 0 ; ++var12) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	private static void a (int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7,
						   int var8, int var9, int var10, int var11) {
		int var12 = var3;

		for (int var13 = -var8 ; var13 < 0 ; ++var13) {
			int var14 = (var4 >> 16) * var11;

			for (int var15 = -var7 ; var15 < 0 ; ++var15) {
				var2 = var1[(var3 >> 16) + var14];
				if (var2 != 0) {
					var0[var5++] = var2;
				} else {
					++var5;
				}

				var3 += var9;
			}

			var4 += var10;
			var3 = var12;
			var5 += var6;
		}

	}

	private static void a (int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = -var5 ; var8 < 0 ; ++var8) {
			int var9;
			for (var9 = var3 + var4 - 3; var3 < var9 ; var0[var3++] = var1[var2++]) {
				var0[var3++] = var1[var2++];
				var0[var3++] = var1[var2++];
				var0[var3++] = var1[var2++];
			}

			for (var9 += 3; var3 < var9 ; var0[var3++] = var1[var2++]) {
				;
			}

			var3 += var6;
			var2 += var7;
		}

	}

	private static void a (int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7,
						   int var8, int var9, int var10, int var11, int var12) {
		int var13 = 256 - var12;
		int var14 = var3;

		for (int var15 = -var8 ; var15 < 0 ; ++var15) {
			int var16 = (var4 >> 16) * var11;

			for (int var17 = -var7 ; var17 < 0 ; ++var17) {
				var2 = var1[(var3 >> 16) + var16];
				if (var2 != 0) {
					int var18 = var0[var5];
					var0[var5++] = ((var2 & 16711935) * var12 + (var18 & 16711935) * var13 & -16711936) + ((var2 & '\uff00') * var12 + (var18 & '\uff00') * var13 & 16711680) >> 8;
				} else {
					++var5;
				}

				var3 += var9;
			}

			var4 += var10;
			var3 = var14;
			var5 += var6;
		}

	}

	final void d (int var1, int var2, int var3, int var4) {
		this.c(this.lb << 3, this.kb << 3, var1 << 4, var2 << 4, var3, var4);
	}

	final void f (int var1, int var2, int var3, int var4, int var5) {
		if (var3 > 0 && var4 > 0) {
			int var6 = this.imageWidth;
			int var7 = this.imageHeight;
			int var8 = 0;
			int var9 = 0;
			int var10 = this.lb;
			int var11 = this.kb;
			int var12 = (var10 << 16) / var3;
			int var13 = (var11 << 16) / var4;
			int var14;
			if (this.gb > 0) {
				var14 = ((this.gb << 16) + var12 - 1) / var12;
				var1 += var14;
				var8 += var14 * var12 - (this.gb << 16);
			}

			if (this.jb > 0) {
				var14 = ((this.jb << 16) + var13 - 1) / var13;
				var2 += var14;
				var9 += var14 * var13 - (this.jb << 16);
			}

			if (var6 < var10) {
				var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
			}

			if (var7 < var11) {
				var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
			}

			var14 = var1 + var2 * ic.width;
			int var15 = ic.width - var3;
			if (var2 + var4 > ic.int_db) {
				var4 -= var2 + var4 - ic.int_db;
			}

			int var16;
			if (var2 < ic.int_bb) {
				var16 = ic.int_bb - var2;
				var4 -= var16;
				var14 += var16 * ic.width;
				var9 += var13 * var16;
			}

			if (var1 + var3 > ic.Z) {
				var16 = var1 + var3 - ic.Z;
				var3 -= var16;
				var15 += var16;
			}

			if (var1 < ic.int_ab) {
				var16 = ic.int_ab - var1;
				var3 -= var16;
				var14 += var16;
				var8 += var12 * var16;
				var15 += var16;
			}

			a(ic.pixels, this.imagePixels, 0, var8, var9, var14, var15, var3, var4, var12, var13, var6, var5);
		}
	}

	final void d () {
		int[] var1 = new int[this.imageWidth * this.imageHeight];
		int var2 = 0;

		for (int var3 = this.imageHeight - 1 ; var3 >= 0 ; --var3) {
			for (int var4 = 0 ; var4 < this.imageWidth ; ++var4) {
				var1[var2++] = this.imagePixels[var4 + var3 * this.imageWidth];
			}
		}

		this.imagePixels = var1;
		this.jb = this.kb - this.imageHeight - this.jb;
	}

	final void a (int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
		try {
			int var10 = -var3 / 2;
			int var11 = -var4 / 2;
			int var12 = (int) (Math.sin(var7) * 65536.0D);
			int var13 = (int) (Math.cos(var7) * 65536.0D);
			var12 = var12 * var9 >> 8;
			var13 = var13 * var9 >> 8;
			int var14 = (var5 << 16) + var11 * var12 + var10 * var13;
			int var15 = (var6 << 16) + (var11 * var13 - var10 * var12);
			int var16 = var1 + var2 * ic.width;

			for (var2 = 0; var2 < var4 ; ++var2) {
				int var17 = var16;
				int var18 = var14;
				int var19 = var15;

				for (var1 = -var3; var1 < 0 ; ++var1) {
					int var20 = this.imagePixels[(var18 >> 16) + (var19 >> 16) * this.imageWidth];
					if (var20 != 0) {
						ic.pixels[var17++] = var20;
					} else {
						++var17;
					}

					var18 += var13;
					var19 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += ic.width;
			}

		} catch (Exception var21) {
			;
		}
	}

	final void f (int var1) {
		if (this.imageWidth != this.lb || this.imageHeight != this.kb) {
			int var2 = var1;
			if (var1 > this.gb) {
				var2 = this.gb;
			}

			int var3 = var1;
			if (var1 + this.gb + this.imageWidth > this.lb) {
				var3 = this.lb - this.gb - this.imageWidth;
			}

			int var4 = var1;
			if (var1 > this.jb) {
				var4 = this.jb;
			}

			int var5 = var1;
			if (var1 + this.jb + this.imageHeight > this.kb) {
				var5 = this.kb - this.jb - this.imageHeight;
			}

			int var6 = this.imageWidth + var2 + var3;
			int var7 = this.imageHeight + var4 + var5;
			int[] var8 = new int[var6 * var7];

			for (int var9 = 0 ; var9 < this.imageHeight ; ++var9) {
				for (int var10 = 0 ; var10 < this.imageWidth ; ++var10) {
					var8[(var9 + var4) * var6 + var10 + var2] = this.imagePixels[var9 * this.imageWidth + var10];
				}
			}

			this.imagePixels = var8;
			this.imageWidth = var6;
			this.imageHeight = var7;
			this.gb -= var2;
			this.jb -= var4;
		}
	}

	final void g (int var1) {
		for (int var2 = this.imageHeight - 1 ; var2 > 0 ; --var2) {
			int var3 = var2 * this.imageWidth;

			for (int var4 = this.imageWidth - 1 ; var4 > 0 ; --var4) {
				if (this.imagePixels[var4 + var3] == 0 && this.imagePixels[var4 + var3 - 1 - this.imageWidth] != 0) {
					this.imagePixels[var4 + var3] = var1;
				}
			}
		}

	}

	final void e () {
		if (this.imageWidth != this.lb || this.imageHeight != this.kb) {
			int[] ints = new int[this.lb * this.kb];
			for (int i = 0 ; i < this.imageHeight ; ++i) {
				for (int i1 = 0 ; i1 < this.imageWidth ; ++i1) {
					ints[(i + this.jb) * this.lb + i1 + this.gb] = this.imagePixels[i * this.imageWidth + i1];
				}
			}

			this.imagePixels = ints;
			this.imageWidth = this.lb;
			this.imageHeight = this.kb;
			this.gb = 0;
			this.jb = 0;
		}
	}

	final void f () {
		ic.a(this.imagePixels, this.imageWidth, this.imageHeight);
	}

	final void e (int var1, int var2, int var3, int var4) {
		if (var3 > 0 && var4 > 0) {
			int var5 = this.imageWidth;
			int var6 = this.imageHeight;
			int var7 = 0;
			int var8 = 0;
			int var9 = this.lb;
			int var10 = this.kb;
			int var11 = (var9 << 16) / var3;
			int var12 = (var10 << 16) / var4;
			int var13;
			if (this.gb > 0) {
				var13 = ((this.gb << 16) + var11 - 1) / var11;
				var1 += var13;
				var7 += var13 * var11 - (this.gb << 16);
			}

			if (this.jb > 0) {
				var13 = ((this.jb << 16) + var12 - 1) / var12;
				var2 += var13;
				var8 += var13 * var12 - (this.jb << 16);
			}

			if (var5 < var9) {
				var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
			}

			if (var6 < var10) {
				var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
			}

			var13 = var1 + var2 * ic.width;
			int var14 = ic.width - var3;
			if (var2 + var4 > ic.int_db) {
				var4 -= var2 + var4 - ic.int_db;
			}

			int var15;
			if (var2 < ic.int_bb) {
				var15 = ic.int_bb - var2;
				var4 -= var15;
				var13 += var15 * ic.width;
				var8 += var12 * var15;
			}

			if (var1 + var3 > ic.Z) {
				var15 = var1 + var3 - ic.Z;
				var3 -= var15;
				var14 += var15;
			}

			if (var1 < ic.int_ab) {
				var15 = ic.int_ab - var1;
				var3 -= var15;
				var13 += var15;
				var7 += var11 * var15;
				var14 += var15;
			}

			a(ic.pixels, this.imagePixels, 0, var7, var8, var13, var14, var3, var4, var11, var12, var5);
		}
	}

	private void c (int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var6 != 0) {
			var1 -= this.gb << 4;
			var2 -= this.jb << 4;
			double var7 = (double) (var5 & '\uffff') * 9.587379924285257E-5D;
			int var9 = (int) Math.floor(Math.sin(var7) * (double) var6 + 0.5D);
			int var10 = (int) Math.floor(Math.cos(var7) * (double) var6 + 0.5D);
			int var11 = -var1 * var10 + -var2 * var9;
			int var12 = var1 * var9 + -var2 * var10;
			int var13 = ((this.imageWidth << 4) - var1) * var10 + -var2 * var9;
			int var14 = -((this.imageWidth << 4) - var1) * var9 + -var2 * var10;
			int var15 = -var1 * var10 + ((this.imageHeight << 4) - var2) * var9;
			int var16 = var1 * var9 + ((this.imageHeight << 4) - var2) * var10;
			int var17 = ((this.imageWidth << 4) - var1) * var10 + ((this.imageHeight << 4) - var2) * var9;
			int var18 = -((this.imageWidth << 4) - var1) * var9 + ((this.imageHeight << 4) - var2) * var10;
			int var19;
			int var20;
			if (var11 < var13) {
				var19 = var11;
				var20 = var13;
			} else {
				var19 = var13;
				var20 = var11;
			}

			if (var15 < var19) {
				var19 = var15;
			}

			if (var17 < var19) {
				var19 = var17;
			}

			if (var15 > var20) {
				var20 = var15;
			}

			if (var17 > var20) {
				var20 = var17;
			}

			int var21;
			int var22;
			if (var12 < var14) {
				var21 = var12;
				var22 = var14;
			} else {
				var21 = var14;
				var22 = var12;
			}

			if (var16 < var21) {
				var21 = var16;
			}

			if (var18 < var21) {
				var21 = var18;
			}

			if (var16 > var22) {
				var22 = var16;
			}

			if (var18 > var22) {
				var22 = var18;
			}

			var19 >>= 12;
			var20 = var20 + 4095 >> 12;
			var21 >>= 12;
			var22 = var22 + 4095 >> 12;
			var19 += var3;
			var20 += var3;
			var21 += var4;
			var22 += var4;
			var19 >>= 4;
			var20 = var20 + 15 >> 4;
			var21 >>= 4;
			var22 = var22 + 15 >> 4;
			if (var19 < ic.int_ab) {
				var19 = ic.int_ab;
			}

			if (var20 > ic.Z) {
				var20 = ic.Z;
			}

			if (var21 < ic.int_bb) {
				var21 = ic.int_bb;
			}

			if (var22 > ic.int_db) {
				var22 = ic.int_db;
			}

			var20 = var19 - var20;
			if (var20 < 0) {
				var22 = var21 - var22;
				if (var22 < 0) {
					int var23 = var21 * ic.width + var19;
					double var24 = 1.6777216E7D / (double) var6;
					int var26 = (int) Math.floor(Math.sin(var7) * var24 + 0.5D);
					int var27 = (int) Math.floor(Math.cos(var7) * var24 + 0.5D);
					int var28 = (var19 << 4) + 8 - var3;
					int var29 = (var21 << 4) + 8 - var4;
					int var30 = (var1 << 8) - (var29 * var26 >> 4);
					int var31 = (var2 << 8) + (var29 * var27 >> 4);
					int var32;
					int var33;
					int var34;
					int var35;
					int var36;
					int var37;
					int var38;
					if (var27 == 0) {
						if (var26 == 0) {
							for (var33 = var22; var33 < 0 ; var23 += ic.width) {
								var34 = var23;
								var35 = var30;
								var36 = var31;
								var37 = var20;
								if (var30 >= 0 && var31 >= 0 && var30 - (this.imageWidth << 12) < 0 && var31 - (this.imageHeight << 12) < 0) {
									for ( ; var37 < 0 ; ++var37) {
										var38 = this.imagePixels[(var36 >> 12) * this.imageWidth + (var35 >> 12)];
										if (var38 != 0) {
											ic.pixels[var34++] = var38;
										} else {
											++var34;
										}
									}
								}

								++var33;
							}

						} else if (var26 < 0) {
							for (var33 = var22; var33 < 0 ; var23 += ic.width) {
								var34 = var23;
								var35 = var30;
								var36 = var31 + (var28 * var26 >> 4);
								var37 = var20;
								if (var30 >= 0 && var30 - (this.imageWidth << 12) < 0) {
									if ((var32 = var36 - (this.imageHeight << 12)) >= 0) {
										var32 = (var26 - var32) / var26;
										var37 = var20 + var32;
										var36 += var26 * var32;
										var34 = var23 + var32;
									}

									if ((var32 = (var36 - var26) / var26) > var37) {
										var37 = var32;
									}

									while (var37 < 0) {
										var38 = this.imagePixels[(var36 >> 12) * this.imageWidth + (var35 >> 12)];
										if (var38 != 0) {
											ic.pixels[var34++] = var38;
										} else {
											++var34;
										}

										var36 += var26;
										++var37;
									}
								}

								++var33;
								var30 -= var26;
							}

						} else {
							for (var33 = var22; var33 < 0 ; var23 += ic.width) {
								var34 = var23;
								var35 = var30;
								var36 = var31 + (var28 * var26 >> 4);
								var37 = var20;
								if (var30 >= 0 && var30 - (this.imageWidth << 12) < 0) {
									if (var36 < 0) {
										var32 = (var26 - 1 - var36) / var26;
										var37 = var20 + var32;
										var36 += var26 * var32;
										var34 = var23 + var32;
									}

									if ((var32 = (1 + var36 - (this.imageHeight << 12) - var26) / var26) > var37) {
										var37 = var32;
									}

									while (var37 < 0) {
										var38 = this.imagePixels[(var36 >> 12) * this.imageWidth + (var35 >> 12)];
										if (var38 != 0) {
											ic.pixels[var34++] = var38;
										} else {
											++var34;
										}

										var36 += var26;
										++var37;
									}
								}

								++var33;
								var30 -= var26;
							}

						}
					} else if (var27 < 0) {
						if (var26 == 0) {
							for (var33 = var22; var33 < 0 ; var23 += ic.width) {
								var34 = var23;
								var35 = var30 + (var28 * var27 >> 4);
								var36 = var31;
								var37 = var20;
								if (var31 >= 0 && var31 - (this.imageHeight << 12) < 0) {
									if ((var32 = var35 - (this.imageWidth << 12)) >= 0) {
										var32 = (var27 - var32) / var27;
										var37 = var20 + var32;
										var35 += var27 * var32;
										var34 = var23 + var32;
									}

									if ((var32 = (var35 - var27) / var27) > var37) {
										var37 = var32;
									}

									while (var37 < 0) {
										var38 = this.imagePixels[(var36 >> 12) * this.imageWidth + (var35 >> 12)];
										if (var38 != 0) {
											ic.pixels[var34++] = var38;
										} else {
											++var34;
										}

										var35 += var27;
										++var37;
									}
								}

								++var33;
								var31 += var27;
							}

						} else if (var26 < 0) {
							for (var33 = var22; var33 < 0 ; var23 += ic.width) {
								var34 = var23;
								var35 = var30 + (var28 * var27 >> 4);
								var36 = var31 + (var28 * var26 >> 4);
								var37 = var20;
								if ((var32 = var35 - (this.imageWidth << 12)) >= 0) {
									var32 = (var27 - var32) / var27;
									var37 = var20 + var32;
									var35 += var27 * var32;
									var36 += var26 * var32;
									var34 = var23 + var32;
								}

								if ((var32 = (var35 - var27) / var27) > var37) {
									var37 = var32;
								}

								if ((var32 = var36 - (this.imageHeight << 12)) >= 0) {
									var32 = (var26 - var32) / var26;
									var37 += var32;
									var35 += var27 * var32;
									var36 += var26 * var32;
									var34 += var32;
								}

								if ((var32 = (var36 - var26) / var26) > var37) {
									var37 = var32;
								}

								while (var37 < 0) {
									var38 = this.imagePixels[(var36 >> 12) * this.imageWidth + (var35 >> 12)];
									if (var38 != 0) {
										ic.pixels[var34++] = var38;
									} else {
										++var34;
									}

									var35 += var27;
									var36 += var26;
									++var37;
								}

								++var33;
								var30 -= var26;
								var31 += var27;
							}

						} else {
							for (var33 = var22; var33 < 0 ; var23 += ic.width) {
								var34 = var23;
								var35 = var30 + (var28 * var27 >> 4);
								var36 = var31 + (var28 * var26 >> 4);
								var37 = var20;
								if ((var32 = var35 - (this.imageWidth << 12)) >= 0) {
									var32 = (var27 - var32) / var27;
									var37 = var20 + var32;
									var35 += var27 * var32;
									var36 += var26 * var32;
									var34 = var23 + var32;
								}

								if ((var32 = (var35 - var27) / var27) > var37) {
									var37 = var32;
								}

								if (var36 < 0) {
									var32 = (var26 - 1 - var36) / var26;
									var37 += var32;
									var35 += var27 * var32;
									var36 += var26 * var32;
									var34 += var32;
								}

								if ((var32 = (1 + var36 - (this.imageHeight << 12) - var26) / var26) > var37) {
									var37 = var32;
								}

								while (var37 < 0) {
									var38 = this.imagePixels[(var36 >> 12) * this.imageWidth + (var35 >> 12)];
									if (var38 != 0) {
										ic.pixels[var34++] = var38;
									} else {
										++var34;
									}

									var35 += var27;
									var36 += var26;
									++var37;
								}

								++var33;
								var30 -= var26;
								var31 += var27;
							}

						}
					} else if (var26 == 0) {
						for (var33 = var22; var33 < 0 ; var23 += ic.width) {
							var34 = var23;
							var35 = var30 + (var28 * var27 >> 4);
							var36 = var31;
							var37 = var20;
							if (var31 >= 0 && var31 - (this.imageHeight << 12) < 0) {
								if (var35 < 0) {
									var32 = (var27 - 1 - var35) / var27;
									var37 = var20 + var32;
									var35 += var27 * var32;
									var34 = var23 + var32;
								}

								if ((var32 = (1 + var35 - (this.imageWidth << 12) - var27) / var27) > var37) {
									var37 = var32;
								}

								while (var37 < 0) {
									var38 = this.imagePixels[(var36 >> 12) * this.imageWidth + (var35 >> 12)];
									if (var38 != 0) {
										ic.pixels[var34++] = var38;
									} else {
										++var34;
									}

									var35 += var27;
									++var37;
								}
							}

							++var33;
							var31 += var27;
						}

					} else if (var26 < 0) {
						for (var33 = var22; var33 < 0 ; var23 += ic.width) {
							var34 = var23;
							var35 = var30 + (var28 * var27 >> 4);
							var36 = var31 + (var28 * var26 >> 4);
							var37 = var20;
							if (var35 < 0) {
								var32 = (var27 - 1 - var35) / var27;
								var37 = var20 + var32;
								var35 += var27 * var32;
								var36 += var26 * var32;
								var34 = var23 + var32;
							}

							if ((var32 = (1 + var35 - (this.imageWidth << 12) - var27) / var27) > var37) {
								var37 = var32;
							}

							if ((var32 = var36 - (this.imageHeight << 12)) >= 0) {
								var32 = (var26 - var32) / var26;
								var37 += var32;
								var35 += var27 * var32;
								var36 += var26 * var32;
								var34 += var32;
							}

							if ((var32 = (var36 - var26) / var26) > var37) {
								var37 = var32;
							}

							while (var37 < 0) {
								var38 = this.imagePixels[(var36 >> 12) * this.imageWidth + (var35 >> 12)];
								if (var38 != 0) {
									ic.pixels[var34++] = var38;
								} else {
									++var34;
								}

								var35 += var27;
								var36 += var26;
								++var37;
							}

							++var33;
							var30 -= var26;
							var31 += var27;
						}

					} else {
						for (var33 = var22; var33 < 0 ; var23 += ic.width) {
							var34 = var23;
							var35 = var30 + (var28 * var27 >> 4);
							var36 = var31 + (var28 * var26 >> 4);
							var37 = var20;
							if (var35 < 0) {
								var32 = (var27 - 1 - var35) / var27;
								var37 = var20 + var32;
								var35 += var27 * var32;
								var36 += var26 * var32;
								var34 = var23 + var32;
							}

							if ((var32 = (1 + var35 - (this.imageWidth << 12) - var27) / var27) > var37) {
								var37 = var32;
							}

							if (var36 < 0) {
								var32 = (var26 - 1 - var36) / var26;
								var37 += var32;
								var35 += var27 * var32;
								var36 += var26 * var32;
								var34 += var32;
							}

							if ((var32 = (1 + var36 - (this.imageHeight << 12) - var26) / var26) > var37) {
								var37 = var32;
							}

							while (var37 < 0) {
								var38 = this.imagePixels[(var36 >> 12) * this.imageWidth + (var35 >> 12)];
								if (var38 != 0) {
									ic.pixels[var34++] = var38;
								} else {
									++var34;
								}

								var35 += var27;
								var36 += var26;
								++var37;
							}

							++var33;
							var30 -= var26;
							var31 += var27;
						}

					}
				}
			}
		}
	}

	final void a (int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9,
				  int[] var10) {
		try {
			int var11 = -var3 / 2;
			int var12 = -var4 / 2;
			int var13 = (int) (Math.sin((double) var7 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos((double) var7 / 326.11D) * 65536.0D);
			var13 = var13 * var8 >> 8;
			var14 = var14 * var8 >> 8;
			int var15 = (var5 << 16) + var12 * var13 + var11 * var14;
			int var16 = (var6 << 16) + (var12 * var14 - var11 * var13);
			int var17 = var1 + var2 * ic.width;

			for (var2 = 0; var2 < var4 ; ++var2) {
				int var18 = var9[var2];
				int var19 = var17 + var18;
				int var20 = var15 + var14 * var18;
				int var21 = var16 - var13 * var18;

				for (var1 = -var10[var2]; var1 < 0 ; ++var1) {
					ic.pixels[var19++] = this.imagePixels[(var20 >> 16) + (var21 >> 16) * this.imageWidth];
					var20 += var14;
					var21 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += ic.width;
			}

		} catch (Exception var22) {
			;
		}
	}

	final void h (int var1) {
		int[] var2 = new int[this.imageWidth * this.imageHeight];
		int var3 = 0;

		for (int var4 = 0 ; var4 < this.imageHeight ; ++var4) {
			for (int var5 = 0 ; var5 < this.imageWidth ; ++var5) {
				int var6 = this.imagePixels[var3];
				if (var6 == 0) {
					if (var5 > 0 && this.imagePixels[var3 - 1] != 0) {
						var6 = var1;
					} else if (var4 > 0 && this.imagePixels[var3 - this.imageWidth] != 0) {
						var6 = var1;
					} else if (var5 < this.imageWidth - 1 && this.imagePixels[var3 + 1] != 0) {
						var6 = var1;
					} else if (var4 < this.imageHeight - 1 && this.imagePixels[var3 + this.imageWidth] != 0) {
						var6 = var1;
					}
				}

				var2[var3++] = var6;
			}
		}

		this.imagePixels = var2;
	}

	final void g () {
		int[] var1 = new int[this.imageWidth * this.imageHeight];
		int var2 = 0;

		for (int var3 = 0 ; var3 < this.imageHeight ; ++var3) {
			for (int var4 = this.imageWidth - 1 ; var4 >= 0 ; --var4) {
				var1[var2++] = this.imagePixels[var4 + var3 * this.imageWidth];
			}
		}

		this.imagePixels = var1;
		this.gb = this.lb - this.imageWidth - this.gb;
	}

	final void a (oa var1, int var2, int var3) {
		var2 += this.gb;
		var3 += this.jb;
		int var4 = var2 + var3 * ic.width;
		int var5 = 0;
		int var6 = this.imageHeight;
		int var7 = this.imageWidth;
		int var8 = ic.width - var7;
		int var9 = 0;
		int var10;
		if (var3 < ic.int_bb) {
			var10 = ic.int_bb - var3;
			var6 -= var10;
			var3 = ic.int_bb;
			var5 += var10 * var7;
			var4 += var10 * ic.width;
		}

		if (var3 + var6 > ic.int_db) {
			var6 -= var3 + var6 - ic.int_db;
		}

		if (var2 < ic.int_ab) {
			var10 = ic.int_ab - var2;
			var7 -= var10;
			var2 = ic.int_ab;
			var5 += var10;
			var4 += var10;
			var9 += var10;
			var8 += var10;
		}

		if (var2 + var7 > ic.Z) {
			var10 = var2 + var7 - ic.Z;
			var7 -= var10;
			var9 += var10;
			var8 += var10;
		}

		if (var7 > 0 && var6 > 0) {
			a(ic.pixels, this.imagePixels, 0, var5, var4, var7, var6, var8, var9, var1.jb);
		}
	}

	final void a (int var1, int var2) {
		var1 += this.gb;
		var2 += this.jb;
		int var3 = var1 + var2 * ic.width;
		int var4 = 0;
		int var5 = this.imageHeight;
		int var6 = this.imageWidth;
		int var7 = ic.width - var6;
		int var8 = 0;
		int var9;
		if (var2 < ic.int_bb) {
			var9 = ic.int_bb - var2;
			var5 -= var9;
			var2 = ic.int_bb;
			var4 += var9 * var6;
			var3 += var9 * ic.width;
		}

		if (var2 + var5 > ic.int_db) {
			var5 -= var2 + var5 - ic.int_db;
		}

		if (var1 < ic.int_ab) {
			var9 = ic.int_ab - var1;
			var6 -= var9;
			var1 = ic.int_ab;
			var4 += var9;
			var3 += var9;
			var8 += var9;
			var7 += var9;
		}

		if (var1 + var6 > ic.Z) {
			var9 = var1 + var6 - ic.Z;
			var6 -= var9;
			var8 += var9;
			var7 += var9;
		}

		if (var6 > 0 && var5 > 0) {
			a(ic.pixels, this.imagePixels, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	final void a (int var1, int var2, int var3) {
		var1 += this.gb;
		var2 += this.jb;
		int var4 = var1 + var2 * ic.width;
		int var5 = 0;
		int var6 = this.imageHeight;
		int var7 = this.imageWidth;
		int var8 = ic.width - var7;
		int var9 = 0;
		int var10;
		if (var2 < ic.int_bb) {
			var10 = ic.int_bb - var2;
			var6 -= var10;
			var2 = ic.int_bb;
			var5 += var10 * var7;
			var4 += var10 * ic.width;
		}

		if (var2 + var6 > ic.int_db) {
			var6 -= var2 + var6 - ic.int_db;
		}

		if (var1 < ic.int_ab) {
			var10 = ic.int_ab - var1;
			var7 -= var10;
			var1 = ic.int_ab;
			var5 += var10;
			var4 += var10;
			var9 += var10;
			var8 += var10;
		}

		if (var1 + var7 > ic.Z) {
			var10 = var1 + var7 - ic.Z;
			var7 -= var10;
			var9 += var10;
			var8 += var10;
		}

		if (var7 > 0 && var6 > 0) {
			a(ic.pixels, this.imagePixels, 0, var5, var4, var7, var6, var8, var9, var3);
		}
	}

	final void b (int i, int i1, int i2) {
		for (int i3 = 0 ; i3 < this.imagePixels.length ; ++i3) {
			int i4 = this.imagePixels[i3];
			if (i4 != 0) {
				int i5 = i4 >> 16 & 255;
				i5 += i;
				if (i5 < 1) {
					i5 = 1;
				} else if (i5 > 255) {
					i5 = 255;
				}

				int i6 = i4 >> 8 & 255;
				i6 += i1;
				if (i6 < 1) {
					i6 = 1;
				} else if (i6 > 255) {
					i6 = 255;
				}

				int i7 = i4 & 255;
				i7 += i2;
				if (i7 < 1) {
					i7 = 1;
				} else if (i7 > 255) {
					i7 = 255;
				}

				this.imagePixels[i3] = (i5 << 16) + (i6 << 8) + i7;
			}
		}
	}

	final void b (int var1, int var2) {
		var1 += this.gb;
		var2 += this.jb;
		int var3 = var1 + var2 * ic.width;
		int var4 = 0;
		int var5 = this.imageHeight;
		int var6 = this.imageWidth;
		int var7 = ic.width - var6;
		int var8 = 0;
		int var9;
		if (var2 < ic.int_bb) {
			var9 = ic.int_bb - var2;
			var5 -= var9;
			var2 = ic.int_bb;
			var4 += var9 * var6;
			var3 += var9 * ic.width;
		}

		if (var2 + var5 > ic.int_db) {
			var5 -= var2 + var5 - ic.int_db;
		}

		if (var1 < ic.int_ab) {
			var9 = ic.int_ab - var1;
			var6 -= var9;
			var1 = ic.int_ab;
			var4 += var9;
			var3 += var9;
			var8 += var9;
			var7 += var9;
		}

		if (var1 + var6 > ic.Z) {
			var9 = var1 + var6 - ic.Z;
			var6 -= var9;
			var8 += var9;
			var7 += var9;
		}

		if (var6 > 0 && var5 > 0) {
			a(ic.pixels, this.imagePixels, var4, var3, var6, var5, var7, var8);
		}
	}
}
