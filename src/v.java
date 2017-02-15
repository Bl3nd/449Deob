final class v extends ic {
	static boolean gb = false;
	static int[] hb = new int[65536];
	static int ib;
	static int[] jb = new int[2048];
	static int kb;
	static int lb = 0;
	static int nb;
	static int ob;
	static int[] pb = new int[2048];
	static int qb;
	static boolean sb = true;
	static int tb;
	static cd cd_ub;
	static int vb;
	static int[] wb = new int[2048];
	static int zb;
	private static boolean mb = false;
	private static int[] rb = new int[512];
	private static int[] xb;
	private static boolean yb = false;

	static {
		for (int var0 = 1 ; var0 < 512 ; ++var0) {
			rb[var0] = '耀' / var0;
		}

		for (int var1 = 1 ; var1 < 2048 ; ++var1) {
			jb[var1] = 65536 / var1;
		}

		for (int var2 = 0 ; var2 < 2048 ; ++var2) {
			pb[var2] = (int) (65536.0D * Math.sin((double) var2 * 0.0030679615D));
			wb[var2] = (int) (65536.0D * Math.cos((double) var2 * 0.0030679615D));
		}

	}

	static void a (int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8,
				   int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16,
				   int var17, int var18) {
		int[] var19 = cd_ub.b(var18, 20675);
		int var20;
		if (var19 == null) {
			var20 = cd_ub.a(-22953, var18);
			a(var0, var1, var2, var3, var4, var5, b(var20, var6), b(var20, var7), b(var20, var8));
		} else {
			yb = cd_ub.a(var18, true);
			mb = cd_ub.a((byte) -11, var18);
			var10 = var9 - var10;
			var13 = var12 - var13;
			var16 = var15 - var16;
			var11 -= var9;
			var14 -= var12;
			var17 -= var15;
			var20 = var11 * var12 - var14 * var9 << 14;
			int var21 = var14 * var15 - var17 * var12 << 8;
			int var22 = var17 * var9 - var11 * var15 << 5;
			int var23 = var10 * var12 - var13 * var9 << 14;
			int var24 = var13 * var15 - var16 * var12 << 8;
			int var25 = var16 * var9 - var10 * var15 << 5;
			int var26 = var13 * var11 - var10 * var14 << 14;
			int var27 = var16 * var14 - var13 * var17 << 8;
			int var28 = var10 * var17 - var16 * var11 << 5;
			int var29 = 0;
			int var30 = 0;
			if (var1 != var0) {
				var29 = (var4 - var3 << 16) / (var1 - var0);
				var30 = (var7 - var6 << 16) / (var1 - var0);
			}

			int var31 = 0;
			int var32 = 0;
			if (var2 != var1) {
				var31 = (var5 - var4 << 16) / (var2 - var1);
				var32 = (var8 - var7 << 16) / (var2 - var1);
			}

			int var33 = 0;
			int var34 = 0;
			if (var2 != var0) {
				var33 = (var3 - var5 << 16) / (var0 - var2);
				var34 = (var6 - var8 << 16) / (var0 - var2);
			}

			int var35;
			if (var0 <= var1 && var0 <= var2) {
				if (var0 < nb) {
					if (var1 > nb) {
						var1 = nb;
					}

					if (var2 > nb) {
						var2 = nb;
					}

					if (var1 < var2) {
						var5 = var3 <<= 16;
						var8 = var6 <<= 16;
						if (var0 < 0) {
							var5 -= var33 * var0;
							var3 -= var29 * var0;
							var8 -= var34 * var0;
							var6 -= var30 * var0;
							var0 = 0;
						}

						var4 <<= 16;
						var7 <<= 16;
						if (var1 < 0) {
							var4 -= var31 * var1;
							var7 -= var32 * var1;
							var1 = 0;
						}

						var35 = var0 - zb;
						var20 += var22 * var35;
						var23 += var25 * var35;
						var26 += var28 * var35;
						if ((var0 == var1 || var33 >= var29) && (var0 != var1 || var33 <= var31)) {
							var2 -= var1;
							var1 -= var0;
							var0 = xb[var0];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										a(ic.pixels, var19, 0, 0, var0, var4 >> 16, var5 >> 16, var7 >> 8, var8 >> 8, var20, var23, var26, var21, var24, var27);
										var5 += var33;
										var4 += var31;
										var8 += var34;
										var7 += var32;
										var0 += ic.width;
										var20 += var22;
										var23 += var25;
										var26 += var28;
									}
								}

								a(ic.pixels, var19, 0, 0, var0, var3 >> 16, var5 >> 16, var6 >> 8, var8 >> 8, var20, var23, var26, var21, var24, var27);
								var5 += var33;
								var3 += var29;
								var8 += var34;
								var6 += var30;
								var0 += ic.width;
								var20 += var22;
								var23 += var25;
								var26 += var28;
							}
						} else {
							var2 -= var1;
							var1 -= var0;
							var0 = xb[var0];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										a(ic.pixels, var19, 0, 0, var0, var5 >> 16, var4 >> 16, var8 >> 8, var7 >> 8, var20, var23, var26, var21, var24, var27);
										var5 += var33;
										var4 += var31;
										var8 += var34;
										var7 += var32;
										var0 += ic.width;
										var20 += var22;
										var23 += var25;
										var26 += var28;
									}
								}

								a(ic.pixels, var19, 0, 0, var0, var5 >> 16, var3 >> 16, var8 >> 8, var6 >> 8, var20, var23, var26, var21, var24, var27);
								var5 += var33;
								var3 += var29;
								var8 += var34;
								var6 += var30;
								var0 += ic.width;
								var20 += var22;
								var23 += var25;
								var26 += var28;
							}
						}
					} else {
						var4 = var3 <<= 16;
						var7 = var6 <<= 16;
						if (var0 < 0) {
							var4 -= var33 * var0;
							var3 -= var29 * var0;
							var7 -= var34 * var0;
							var6 -= var30 * var0;
							var0 = 0;
						}

						var5 <<= 16;
						var8 <<= 16;
						if (var2 < 0) {
							var5 -= var31 * var2;
							var8 -= var32 * var2;
							var2 = 0;
						}

						var35 = var0 - zb;
						var20 += var22 * var35;
						var23 += var25 * var35;
						var26 += var28 * var35;
						if ((var0 == var2 || var33 >= var29) && (var0 != var2 || var31 <= var29)) {
							var1 -= var2;
							var2 -= var0;
							var0 = xb[var0];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										a(ic.pixels, var19, 0, 0, var0, var3 >> 16, var5 >> 16, var6 >> 8, var8 >> 8, var20, var23, var26, var21, var24, var27);
										var5 += var31;
										var3 += var29;
										var8 += var32;
										var6 += var30;
										var0 += ic.width;
										var20 += var22;
										var23 += var25;
										var26 += var28;
									}
								}

								a(ic.pixels, var19, 0, 0, var0, var3 >> 16, var4 >> 16, var6 >> 8, var7 >> 8, var20, var23, var26, var21, var24, var27);
								var4 += var33;
								var3 += var29;
								var7 += var34;
								var6 += var30;
								var0 += ic.width;
								var20 += var22;
								var23 += var25;
								var26 += var28;
							}
						} else {
							var1 -= var2;
							var2 -= var0;
							var0 = xb[var0];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										a(ic.pixels, var19, 0, 0, var0, var5 >> 16, var3 >> 16, var8 >> 8, var6 >> 8, var20, var23, var26, var21, var24, var27);
										var5 += var31;
										var3 += var29;
										var8 += var32;
										var6 += var30;
										var0 += ic.width;
										var20 += var22;
										var23 += var25;
										var26 += var28;
									}
								}

								a(ic.pixels, var19, 0, 0, var0, var4 >> 16, var3 >> 16, var7 >> 8, var6 >> 8, var20, var23, var26, var21, var24, var27);
								var4 += var33;
								var3 += var29;
								var7 += var34;
								var6 += var30;
								var0 += ic.width;
								var20 += var22;
								var23 += var25;
								var26 += var28;
							}
						}
					}
				}
			} else if (var1 <= var2) {
				if (var1 < nb) {
					if (var2 > nb) {
						var2 = nb;
					}

					if (var0 > nb) {
						var0 = nb;
					}

					if (var2 < var0) {
						var3 = var4 <<= 16;
						var6 = var7 <<= 16;
						if (var1 < 0) {
							var3 -= var29 * var1;
							var4 -= var31 * var1;
							var6 -= var30 * var1;
							var7 -= var32 * var1;
							var1 = 0;
						}

						var5 <<= 16;
						var8 <<= 16;
						if (var2 < 0) {
							var5 -= var33 * var2;
							var8 -= var34 * var2;
							var2 = 0;
						}

						var35 = var1 - zb;
						var20 += var22 * var35;
						var23 += var25 * var35;
						var26 += var28 * var35;
						if ((var1 == var2 || var29 >= var31) && (var1 != var2 || var29 <= var33)) {
							var0 -= var2;
							var2 -= var1;
							var1 = xb[var1];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}

										a(ic.pixels, var19, 0, 0, var1, var5 >> 16, var3 >> 16, var8 >> 8, var6 >> 8, var20, var23, var26, var21, var24, var27);
										var3 += var29;
										var5 += var33;
										var6 += var30;
										var8 += var34;
										var1 += ic.width;
										var20 += var22;
										var23 += var25;
										var26 += var28;
									}
								}

								a(ic.pixels, var19, 0, 0, var1, var4 >> 16, var3 >> 16, var7 >> 8, var6 >> 8, var20, var23, var26, var21, var24, var27);
								var3 += var29;
								var4 += var31;
								var6 += var30;
								var7 += var32;
								var1 += ic.width;
								var20 += var22;
								var23 += var25;
								var26 += var28;
							}
						} else {
							var0 -= var2;
							var2 -= var1;
							var1 = xb[var1];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}

										a(ic.pixels, var19, 0, 0, var1, var3 >> 16, var5 >> 16, var6 >> 8, var8 >> 8, var20, var23, var26, var21, var24, var27);
										var3 += var29;
										var5 += var33;
										var6 += var30;
										var8 += var34;
										var1 += ic.width;
										var20 += var22;
										var23 += var25;
										var26 += var28;
									}
								}

								a(ic.pixels, var19, 0, 0, var1, var3 >> 16, var4 >> 16, var6 >> 8, var7 >> 8, var20, var23, var26, var21, var24, var27);
								var3 += var29;
								var4 += var31;
								var6 += var30;
								var7 += var32;
								var1 += ic.width;
								var20 += var22;
								var23 += var25;
								var26 += var28;
							}
						}
					} else {
						var5 = var4 <<= 16;
						var8 = var7 <<= 16;
						if (var1 < 0) {
							var5 -= var29 * var1;
							var4 -= var31 * var1;
							var8 -= var30 * var1;
							var7 -= var32 * var1;
							var1 = 0;
						}

						var3 <<= 16;
						var6 <<= 16;
						if (var0 < 0) {
							var3 -= var33 * var0;
							var6 -= var34 * var0;
							var0 = 0;
						}

						var35 = var1 - zb;
						var20 += var22 * var35;
						var23 += var25 * var35;
						var26 += var28 * var35;
						if (var29 < var31) {
							var2 -= var0;
							var0 -= var1;
							var1 = xb[var1];

							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										a(ic.pixels, var19, 0, 0, var1, var3 >> 16, var4 >> 16, var6 >> 8, var7 >> 8, var20, var23, var26, var21, var24, var27);
										var3 += var33;
										var4 += var31;
										var6 += var34;
										var7 += var32;
										var1 += ic.width;
										var20 += var22;
										var23 += var25;
										var26 += var28;
									}
								}

								a(ic.pixels, var19, 0, 0, var1, var5 >> 16, var4 >> 16, var8 >> 8, var7 >> 8, var20, var23, var26, var21, var24, var27);
								var5 += var29;
								var4 += var31;
								var8 += var30;
								var7 += var32;
								var1 += ic.width;
								var20 += var22;
								var23 += var25;
								var26 += var28;
							}
						} else {
							var2 -= var0;
							var0 -= var1;
							var1 = xb[var1];

							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										a(ic.pixels, var19, 0, 0, var1, var4 >> 16, var3 >> 16, var7 >> 8, var6 >> 8, var20, var23, var26, var21, var24, var27);
										var3 += var33;
										var4 += var31;
										var6 += var34;
										var7 += var32;
										var1 += ic.width;
										var20 += var22;
										var23 += var25;
										var26 += var28;
									}
								}

								a(ic.pixels, var19, 0, 0, var1, var4 >> 16, var5 >> 16, var7 >> 8, var8 >> 8, var20, var23, var26, var21, var24, var27);
								var5 += var29;
								var4 += var31;
								var8 += var30;
								var7 += var32;
								var1 += ic.width;
								var20 += var22;
								var23 += var25;
								var26 += var28;
							}
						}
					}
				}
			} else if (var2 < nb) {
				if (var0 > nb) {
					var0 = nb;
				}

				if (var1 > nb) {
					var1 = nb;
				}

				if (var0 < var1) {
					var4 = var5 <<= 16;
					var7 = var8 <<= 16;
					if (var2 < 0) {
						var4 -= var31 * var2;
						var5 -= var33 * var2;
						var7 -= var32 * var2;
						var8 -= var34 * var2;
						var2 = 0;
					}

					var3 <<= 16;
					var6 <<= 16;
					if (var0 < 0) {
						var3 -= var29 * var0;
						var6 -= var30 * var0;
						var0 = 0;
					}

					var35 = var2 - zb;
					var20 += var22 * var35;
					var23 += var25 * var35;
					var26 += var28 * var35;
					if (var31 < var33) {
						var1 -= var0;
						var0 -= var2;
						var2 = xb[var2];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									a(ic.pixels, var19, 0, 0, var2, var4 >> 16, var3 >> 16, var7 >> 8, var6 >> 8, var20, var23, var26, var21, var24, var27);
									var4 += var31;
									var3 += var29;
									var7 += var32;
									var6 += var30;
									var2 += ic.width;
									var20 += var22;
									var23 += var25;
									var26 += var28;
								}
							}

							a(ic.pixels, var19, 0, 0, var2, var4 >> 16, var5 >> 16, var7 >> 8, var8 >> 8, var20, var23, var26, var21, var24, var27);
							var4 += var31;
							var5 += var33;
							var7 += var32;
							var8 += var34;
							var2 += ic.width;
							var20 += var22;
							var23 += var25;
							var26 += var28;
						}
					} else {
						var1 -= var0;
						var0 -= var2;
						var2 = xb[var2];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									a(ic.pixels, var19, 0, 0, var2, var3 >> 16, var4 >> 16, var6 >> 8, var7 >> 8, var20, var23, var26, var21, var24, var27);
									var4 += var31;
									var3 += var29;
									var7 += var32;
									var6 += var30;
									var2 += ic.width;
									var20 += var22;
									var23 += var25;
									var26 += var28;
								}
							}

							a(ic.pixels, var19, 0, 0, var2, var5 >> 16, var4 >> 16, var8 >> 8, var7 >> 8, var20, var23, var26, var21, var24, var27);
							var4 += var31;
							var5 += var33;
							var7 += var32;
							var8 += var34;
							var2 += ic.width;
							var20 += var22;
							var23 += var25;
							var26 += var28;
						}
					}
				} else {
					var3 = var5 <<= 16;
					var6 = var8 <<= 16;
					if (var2 < 0) {
						var3 -= var31 * var2;
						var5 -= var33 * var2;
						var6 -= var32 * var2;
						var8 -= var34 * var2;
						var2 = 0;
					}

					var4 <<= 16;
					var7 <<= 16;
					if (var1 < 0) {
						var4 -= var29 * var1;
						var7 -= var30 * var1;
						var1 = 0;
					}

					var35 = var2 - zb;
					var20 += var22 * var35;
					var23 += var25 * var35;
					var26 += var28 * var35;
					if (var31 < var33) {
						var0 -= var1;
						var1 -= var2;
						var2 = xb[var2];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}

									a(ic.pixels, var19, 0, 0, var2, var4 >> 16, var5 >> 16, var7 >> 8, var8 >> 8, var20, var23, var26, var21, var24, var27);
									var4 += var29;
									var5 += var33;
									var7 += var30;
									var8 += var34;
									var2 += ic.width;
									var20 += var22;
									var23 += var25;
									var26 += var28;
								}
							}

							a(ic.pixels, var19, 0, 0, var2, var3 >> 16, var5 >> 16, var6 >> 8, var8 >> 8, var20, var23, var26, var21, var24, var27);
							var3 += var31;
							var5 += var33;
							var6 += var32;
							var8 += var34;
							var2 += ic.width;
							var20 += var22;
							var23 += var25;
							var26 += var28;
						}
					} else {
						var0 -= var1;
						var1 -= var2;
						var2 = xb[var2];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}

									a(ic.pixels, var19, 0, 0, var2, var5 >> 16, var4 >> 16, var8 >> 8, var7 >> 8, var20, var23, var26, var21, var24, var27);
									var4 += var29;
									var5 += var33;
									var7 += var30;
									var8 += var34;
									var2 += ic.width;
									var20 += var22;
									var23 += var25;
									var26 += var28;
								}
							}

							a(ic.pixels, var19, 0, 0, var2, var5 >> 16, var3 >> 16, var8 >> 8, var6 >> 8, var20, var23, var26, var21, var24, var27);
							var3 += var31;
							var5 += var33;
							var6 += var32;
							var8 += var34;
							var2 += ic.width;
							var20 += var22;
							var23 += var25;
							var26 += var28;
						}
					}
				}
			}
		}
	}

	static void a (cd var0) {
		cd_ub = var0;
	}

	static int[] d () {
		return xb;
	}

	private static void a (int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7,
						   int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
		if (var5 < var6) {
			int var15;
			int var16;
			if (gb) {
				var15 = (var8 - var7) / (var6 - var5);
				if (var6 > vb) {
					var6 = vb;
				}

				if (var5 < 0) {
					var7 -= var5 * var15;
					var5 = 0;
				}

				if (var5 >= var6) {
					return;
				}

				var16 = var6 - var5 >> 3;
				var15 <<= 12;
				var7 <<= 9;
			} else {
				if (var6 - var5 > 7) {
					var16 = var6 - var5 >> 3;
					var15 = (var8 - var7) * rb[var16] >> 6;
				} else {
					var16 = 0;
					var15 = 0;
				}

				var7 <<= 9;
			}

			var4 += var5;
			int var17;
			int var18;
			int var19;
			int var20;
			int var21;
			int var22;
			int var23;
			int var24;
			if (yb) {
				var17 = 0;
				var18 = 0;
				var20 = var5 - kb;
				var9 += (var12 >> 3) * var20;
				var10 += (var13 >> 3) * var20;
				var11 += (var14 >> 3) * var20;
				var19 = var11 >> 12;
				if (var19 != 0) {
					var2 = var9 / var19;
					var3 = var10 / var19;
					if (var2 < 0) {
						var2 = 0;
					} else if (var2 > 4032) {
						var2 = 4032;
					}
				}

				var9 += var12;
				var10 += var13;
				var11 += var14;
				var19 = var11 >> 12;
				if (var19 != 0) {
					var17 = var9 / var19;
					var18 = var10 / var19;
					if (var17 < 7) {
						var17 = 7;
					} else if (var17 > 4032) {
						var17 = 4032;
					}
				}

				var21 = var17 - var2 >> 3;
				var22 = var18 - var3 >> 3;
				var2 += (var7 & 6291456) >> 3;
				var23 = var7 >> 23;
				if (!mb) {
					while (var16-- > 0) {
						if ((var24 = var1[(var3 & 4032) + (var2 >> 6)] >>> var23) != 0) {
							var0[var4] = var24;
						}

						++var4;
						var2 += var21;
						var3 += var22;
						if ((var24 = var1[(var3 & 4032) + (var2 >> 6)] >>> var23) != 0) {
							var0[var4] = var24;
						}

						++var4;
						var2 += var21;
						var3 += var22;
						if ((var24 = var1[(var3 & 4032) + (var2 >> 6)] >>> var23) != 0) {
							var0[var4] = var24;
						}

						++var4;
						var2 += var21;
						var3 += var22;
						if ((var24 = var1[(var3 & 4032) + (var2 >> 6)] >>> var23) != 0) {
							var0[var4] = var24;
						}

						++var4;
						var2 += var21;
						var3 += var22;
						if ((var24 = var1[(var3 & 4032) + (var2 >> 6)] >>> var23) != 0) {
							var0[var4] = var24;
						}

						++var4;
						var2 += var21;
						var3 += var22;
						if ((var24 = var1[(var3 & 4032) + (var2 >> 6)] >>> var23) != 0) {
							var0[var4] = var24;
						}

						++var4;
						var2 += var21;
						var3 += var22;
						if ((var24 = var1[(var3 & 4032) + (var2 >> 6)] >>> var23) != 0) {
							var0[var4] = var24;
						}

						++var4;
						var2 += var21;
						var3 += var22;
						if ((var24 = var1[(var3 & 4032) + (var2 >> 6)] >>> var23) != 0) {
							var0[var4] = var24;
						}

						++var4;
						var2 = var17;
						var3 = var18;
						var9 += var12;
						var10 += var13;
						var11 += var14;
						var19 = var11 >> 12;
						if (var19 != 0) {
							var17 = var9 / var19;
							var18 = var10 / var19;
							if (var17 < 7) {
								var17 = 7;
							} else if (var17 > 4032) {
								var17 = 4032;
							}
						}

						var21 = var17 - var2 >> 3;
						var22 = var18 - var3 >> 3;
						var7 += var15;
						var2 += (var7 & 6291456) >> 3;
						var23 = var7 >> 23;
					}

					for (var16 = var6 - var5 & 7; var16-- > 0 ; var3 += var22) {
						if ((var24 = var1[(var3 & 4032) + (var2 >> 6)] >>> var23) != 0) {
							var0[var4] = var24;
						}

						++var4;
						var2 += var21;
					}

				} else {
					while (var16-- > 0) {
						var0[var4++] = var1[(var3 & 4032) + (var2 >> 6)] >>> var23;
						var2 += var21;
						var3 += var22;
						var0[var4++] = var1[(var3 & 4032) + (var2 >> 6)] >>> var23;
						var2 += var21;
						var3 += var22;
						var0[var4++] = var1[(var3 & 4032) + (var2 >> 6)] >>> var23;
						var2 += var21;
						var3 += var22;
						var0[var4++] = var1[(var3 & 4032) + (var2 >> 6)] >>> var23;
						var2 += var21;
						var3 += var22;
						var0[var4++] = var1[(var3 & 4032) + (var2 >> 6)] >>> var23;
						var2 += var21;
						var3 += var22;
						var0[var4++] = var1[(var3 & 4032) + (var2 >> 6)] >>> var23;
						var2 += var21;
						var3 += var22;
						var0[var4++] = var1[(var3 & 4032) + (var2 >> 6)] >>> var23;
						var2 += var21;
						var3 += var22;
						var0[var4++] = var1[(var3 & 4032) + (var2 >> 6)] >>> var23;
						var2 = var17;
						var3 = var18;
						var9 += var12;
						var10 += var13;
						var11 += var14;
						var19 = var11 >> 12;
						if (var19 != 0) {
							var17 = var9 / var19;
							var18 = var10 / var19;
							if (var17 < 7) {
								var17 = 7;
							} else if (var17 > 4032) {
								var17 = 4032;
							}
						}

						var21 = var17 - var2 >> 3;
						var22 = var18 - var3 >> 3;
						var7 += var15;
						var2 += (var7 & 6291456) >> 3;
						var23 = var7 >> 23;
					}

					for (var16 = var6 - var5 & 7; var16-- > 0 ; var3 += var22) {
						var0[var4++] = var1[(var3 & 4032) + (var2 >> 6)] >>> var23;
						var2 += var21;
					}

				}
			} else {
				var17 = 0;
				var18 = 0;
				var20 = var5 - kb;
				var9 += (var12 >> 3) * var20;
				var10 += (var13 >> 3) * var20;
				var11 += (var14 >> 3) * var20;
				var19 = var11 >> 14;
				if (var19 != 0) {
					var2 = var9 / var19;
					var3 = var10 / var19;
					if (var2 < 0) {
						var2 = 0;
					} else if (var2 > 16256) {
						var2 = 16256;
					}
				}

				var9 += var12;
				var10 += var13;
				var11 += var14;
				var19 = var11 >> 14;
				if (var19 != 0) {
					var17 = var9 / var19;
					var18 = var10 / var19;
					if (var17 < 7) {
						var17 = 7;
					} else if (var17 > 16256) {
						var17 = 16256;
					}
				}

				var21 = var17 - var2 >> 3;
				var22 = var18 - var3 >> 3;
				var2 += var7 & 6291456;
				var23 = var7 >> 23;
				if (!mb) {
					while (var16-- > 0) {
						if ((var24 = var1[(var3 & 16256) + (var2 >> 7)] >>> var23) != 0) {
							var0[var4] = var24;
						}

						++var4;
						var2 += var21;
						var3 += var22;
						if ((var24 = var1[(var3 & 16256) + (var2 >> 7)] >>> var23) != 0) {
							var0[var4] = var24;
						}

						++var4;
						var2 += var21;
						var3 += var22;
						if ((var24 = var1[(var3 & 16256) + (var2 >> 7)] >>> var23) != 0) {
							var0[var4] = var24;
						}

						++var4;
						var2 += var21;
						var3 += var22;
						if ((var24 = var1[(var3 & 16256) + (var2 >> 7)] >>> var23) != 0) {
							var0[var4] = var24;
						}

						++var4;
						var2 += var21;
						var3 += var22;
						if ((var24 = var1[(var3 & 16256) + (var2 >> 7)] >>> var23) != 0) {
							var0[var4] = var24;
						}

						++var4;
						var2 += var21;
						var3 += var22;
						if ((var24 = var1[(var3 & 16256) + (var2 >> 7)] >>> var23) != 0) {
							var0[var4] = var24;
						}

						++var4;
						var2 += var21;
						var3 += var22;
						if ((var24 = var1[(var3 & 16256) + (var2 >> 7)] >>> var23) != 0) {
							var0[var4] = var24;
						}

						++var4;
						var2 += var21;
						var3 += var22;
						if ((var24 = var1[(var3 & 16256) + (var2 >> 7)] >>> var23) != 0) {
							var0[var4] = var24;
						}

						++var4;
						var2 = var17;
						var3 = var18;
						var9 += var12;
						var10 += var13;
						var11 += var14;
						var19 = var11 >> 14;
						if (var19 != 0) {
							var17 = var9 / var19;
							var18 = var10 / var19;
							if (var17 < 7) {
								var17 = 7;
							} else if (var17 > 16256) {
								var17 = 16256;
							}
						}

						var21 = var17 - var2 >> 3;
						var22 = var18 - var3 >> 3;
						var7 += var15;
						var2 += var7 & 6291456;
						var23 = var7 >> 23;
					}

					for (var16 = var6 - var5 & 7; var16-- > 0 ; var3 += var22) {
						if ((var24 = var1[(var3 & 16256) + (var2 >> 7)] >>> var23) != 0) {
							var0[var4] = var24;
						}

						++var4;
						var2 += var21;
					}

				} else {
					while (var16-- > 0) {
						var0[var4++] = var1[(var3 & 16256) + (var2 >> 7)] >>> var23;
						var2 += var21;
						var3 += var22;
						var0[var4++] = var1[(var3 & 16256) + (var2 >> 7)] >>> var23;
						var2 += var21;
						var3 += var22;
						var0[var4++] = var1[(var3 & 16256) + (var2 >> 7)] >>> var23;
						var2 += var21;
						var3 += var22;
						var0[var4++] = var1[(var3 & 16256) + (var2 >> 7)] >>> var23;
						var2 += var21;
						var3 += var22;
						var0[var4++] = var1[(var3 & 16256) + (var2 >> 7)] >>> var23;
						var2 += var21;
						var3 += var22;
						var0[var4++] = var1[(var3 & 16256) + (var2 >> 7)] >>> var23;
						var2 += var21;
						var3 += var22;
						var0[var4++] = var1[(var3 & 16256) + (var2 >> 7)] >>> var23;
						var2 += var21;
						var3 += var22;
						var0[var4++] = var1[(var3 & 16256) + (var2 >> 7)] >>> var23;
						var2 = var17;
						var3 = var18;
						var9 += var12;
						var10 += var13;
						var11 += var14;
						var19 = var11 >> 14;
						if (var19 != 0) {
							var17 = var9 / var19;
							var18 = var10 / var19;
							if (var17 < 7) {
								var17 = 7;
							} else if (var17 > 16256) {
								var17 = 16256;
							}
						}

						var21 = var17 - var2 >> 3;
						var22 = var18 - var3 >> 3;
						var7 += var15;
						var2 += var7 & 6291456;
						var23 = var7 >> 23;
					}

					for (var16 = var6 - var5 & 7; var16-- > 0 ; var3 += var22) {
						var0[var4++] = var1[(var3 & 16256) + (var2 >> 7)] >>> var23;
						var2 += var21;
					}

				}
			}
		}
	}

	static void a (int var0, int var1, int var2) {
		gb = var0 < 0 || var0 > vb || var1 < 0 || var1 > vb || var2 < 0 || var2 > vb;
	}

	static void a (int var0, int var1) {
		int var2 = xb[0];
		int var3 = var2 / ic.width;
		int var4 = var2 - var3 * ic.width;
		kb = var0 - var4;
		zb = var1 - var3;
		ib = -kb;
		tb = vb - kb;
		qb = -zb;
		ob = nb - zb;
	}

	static void e () {
		kb = vb / 2;
		zb = nb / 2;
		ib = -kb;
		tb = vb - kb;
		qb = -zb;
		ob = nb - zb;
	}

	private static int b (int var0, int var1) {
		var1 = (127 - var1) * (var0 & 127) >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 'ﾀ') + var1;
	}

	private static void a (int[] var0, int var1, int var2, int var3, int var4, int var5) {
		if (gb) {
			if (var5 > vb) {
				var5 = vb;
			}

			if (var4 < 0) {
				var4 = 0;
			}
		}

		if (var4 < var5) {
			var1 += var4;
			var3 = var5 - var4 >> 2;
			if (lb == 0) {
				while (true) {
					--var3;
					if (var3 < 0) {
						var3 = var5 - var4 & 3;

						while (true) {
							--var3;
							if (var3 < 0) {
								return;
							}

							var0[var1++] = var2;
						}
					}

					var0[var1++] = var2;
					var0[var1++] = var2;
					var0[var1++] = var2;
					var0[var1++] = var2;
				}
			} else {
				int var6 = lb;
				int var7 = 256 - lb;
				var2 = ((var2 & 16711935) * var7 >> 8 & 16711935) + ((var2 & '\uff00') * var7 >> 8 & '\uff00');

				while (true) {
					--var3;
					if (var3 < 0) {
						var3 = var5 - var4 & 3;

						while (true) {
							--var3;
							if (var3 < 0) {
								return;
							}

							var0[var1++] = var2 + ((var0[var1] & 16711935) * var6 >> 8 & 16711935) + ((var0[var1] & '\uff00') * var6 >> 8 & '\uff00');
						}
					}

					var0[var1++] = var2 + ((var0[var1] & 16711935) * var6 >> 8 & 16711935) + ((var0[var1] & '\uff00') * var6 >> 8 & '\uff00');
					var0[var1++] = var2 + ((var0[var1] & 16711935) * var6 >> 8 & 16711935) + ((var0[var1] & '\uff00') * var6 >> 8 & '\uff00');
					var0[var1++] = var2 + ((var0[var1] & 16711935) * var6 >> 8 & 16711935) + ((var0[var1] & '\uff00') * var6 >> 8 & '\uff00');
					var0[var1++] = var2 + ((var0[var1] & 16711935) * var6 >> 8 & 16711935) + ((var0[var1] & '\uff00') * var6 >> 8 & '\uff00');
				}
			}
		}
	}

	static int a (int i, double v) {
		double v1 = (double) (i >> 16) / 256.0D;
		double v2 = (double) (i >> 8 & 255) / 256.0D;
		double v3 = (double) (i & 255) / 256.0D;
		v1 = Math.pow(v1, v);
		v2 = Math.pow(v2, v);
		v3 = Math.pow(v3, v);
		int i1 = (int) (v1 * 256.0D);
		int i2 = (int) (v2 * 256.0D);
		int i3 = (int) (v3 * 256.0D);
		return (i1 << 16) + (i2 << 8) + i3;
	}

	public static void f () {
		xb = null;
		hb = null;
		cd_ub = null;
		rb = null;
		jb = null;
		pb = null;
		wb = null;
	}

	static void a (int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = 0;
		if (var1 != var0) {
			var7 = (var4 - var3 << 16) / (var1 - var0);
		}

		int var8 = 0;
		if (var2 != var1) {
			var8 = (var5 - var4 << 16) / (var2 - var1);
		}

		int var9 = 0;
		if (var2 != var0) {
			var9 = (var3 - var5 << 16) / (var0 - var2);
		}

		if (var0 <= var1 && var0 <= var2) {
			if (var0 < nb) {
				if (var1 > nb) {
					var1 = nb;
				}

				if (var2 > nb) {
					var2 = nb;
				}

				if (var1 < var2) {
					var5 = var3 <<= 16;
					if (var0 < 0) {
						var5 -= var9 * var0;
						var3 -= var7 * var0;
						var0 = 0;
					}

					var4 <<= 16;
					if (var1 < 0) {
						var4 -= var8 * var1;
						var1 = 0;
					}

					if ((var0 == var1 || var9 >= var7) && (var0 != var1 || var9 <= var8)) {
						var2 -= var1;
						var1 -= var0;
						var0 = xb[var0];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									a(ic.pixels, var0, var6, 0, var4 >> 16, var5 >> 16);
									var5 += var9;
									var4 += var8;
									var0 += ic.width;
								}
							}

							a(ic.pixels, var0, var6, 0, var3 >> 16, var5 >> 16);
							var5 += var9;
							var3 += var7;
							var0 += ic.width;
						}
					} else {
						var2 -= var1;
						var1 -= var0;
						var0 = xb[var0];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									a(ic.pixels, var0, var6, 0, var5 >> 16, var4 >> 16);
									var5 += var9;
									var4 += var8;
									var0 += ic.width;
								}
							}

							a(ic.pixels, var0, var6, 0, var5 >> 16, var3 >> 16);
							var5 += var9;
							var3 += var7;
							var0 += ic.width;
						}
					}
				} else {
					var4 = var3 <<= 16;
					if (var0 < 0) {
						var4 -= var9 * var0;
						var3 -= var7 * var0;
						var0 = 0;
					}

					var5 <<= 16;
					if (var2 < 0) {
						var5 -= var8 * var2;
						var2 = 0;
					}

					if ((var0 == var2 || var9 >= var7) && (var0 != var2 || var8 <= var7)) {
						var1 -= var2;
						var2 -= var0;
						var0 = xb[var0];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									a(ic.pixels, var0, var6, 0, var3 >> 16, var5 >> 16);
									var5 += var8;
									var3 += var7;
									var0 += ic.width;
								}
							}

							a(ic.pixels, var0, var6, 0, var3 >> 16, var4 >> 16);
							var4 += var9;
							var3 += var7;
							var0 += ic.width;
						}
					} else {
						var1 -= var2;
						var2 -= var0;
						var0 = xb[var0];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									a(ic.pixels, var0, var6, 0, var5 >> 16, var3 >> 16);
									var5 += var8;
									var3 += var7;
									var0 += ic.width;
								}
							}

							a(ic.pixels, var0, var6, 0, var4 >> 16, var3 >> 16);
							var4 += var9;
							var3 += var7;
							var0 += ic.width;
						}
					}
				}
			}
		} else if (var1 <= var2) {
			if (var1 < nb) {
				if (var2 > nb) {
					var2 = nb;
				}

				if (var0 > nb) {
					var0 = nb;
				}

				if (var2 < var0) {
					var3 = var4 <<= 16;
					if (var1 < 0) {
						var3 -= var7 * var1;
						var4 -= var8 * var1;
						var1 = 0;
					}

					var5 <<= 16;
					if (var2 < 0) {
						var5 -= var9 * var2;
						var2 = 0;
					}

					if ((var1 == var2 || var7 >= var8) && (var1 != var2 || var7 <= var9)) {
						var0 -= var2;
						var2 -= var1;
						var1 = xb[var1];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}

									a(ic.pixels, var1, var6, 0, var5 >> 16, var3 >> 16);
									var3 += var7;
									var5 += var9;
									var1 += ic.width;
								}
							}

							a(ic.pixels, var1, var6, 0, var4 >> 16, var3 >> 16);
							var3 += var7;
							var4 += var8;
							var1 += ic.width;
						}
					} else {
						var0 -= var2;
						var2 -= var1;
						var1 = xb[var1];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}

									a(ic.pixels, var1, var6, 0, var3 >> 16, var5 >> 16);
									var3 += var7;
									var5 += var9;
									var1 += ic.width;
								}
							}

							a(ic.pixels, var1, var6, 0, var3 >> 16, var4 >> 16);
							var3 += var7;
							var4 += var8;
							var1 += ic.width;
						}
					}
				} else {
					var5 = var4 <<= 16;
					if (var1 < 0) {
						var5 -= var7 * var1;
						var4 -= var8 * var1;
						var1 = 0;
					}

					var3 <<= 16;
					if (var0 < 0) {
						var3 -= var9 * var0;
						var0 = 0;
					}

					if (var7 < var8) {
						var2 -= var0;
						var0 -= var1;
						var1 = xb[var1];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									a(ic.pixels, var1, var6, 0, var3 >> 16, var4 >> 16);
									var3 += var9;
									var4 += var8;
									var1 += ic.width;
								}
							}

							a(ic.pixels, var1, var6, 0, var5 >> 16, var4 >> 16);
							var5 += var7;
							var4 += var8;
							var1 += ic.width;
						}
					} else {
						var2 -= var0;
						var0 -= var1;
						var1 = xb[var1];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									a(ic.pixels, var1, var6, 0, var4 >> 16, var3 >> 16);
									var3 += var9;
									var4 += var8;
									var1 += ic.width;
								}
							}

							a(ic.pixels, var1, var6, 0, var4 >> 16, var5 >> 16);
							var5 += var7;
							var4 += var8;
							var1 += ic.width;
						}
					}
				}
			}
		} else if (var2 < nb) {
			if (var0 > nb) {
				var0 = nb;
			}

			if (var1 > nb) {
				var1 = nb;
			}

			if (var0 < var1) {
				var4 = var5 <<= 16;
				if (var2 < 0) {
					var4 -= var8 * var2;
					var5 -= var9 * var2;
					var2 = 0;
				}

				var3 <<= 16;
				if (var0 < 0) {
					var3 -= var7 * var0;
					var0 = 0;
				}

				if (var8 < var9) {
					var1 -= var0;
					var0 -= var2;
					var2 = xb[var2];

					while (true) {
						--var0;
						if (var0 < 0) {
							while (true) {
								--var1;
								if (var1 < 0) {
									return;
								}

								a(ic.pixels, var2, var6, 0, var4 >> 16, var3 >> 16);
								var4 += var8;
								var3 += var7;
								var2 += ic.width;
							}
						}

						a(ic.pixels, var2, var6, 0, var4 >> 16, var5 >> 16);
						var4 += var8;
						var5 += var9;
						var2 += ic.width;
					}
				} else {
					var1 -= var0;
					var0 -= var2;
					var2 = xb[var2];

					while (true) {
						--var0;
						if (var0 < 0) {
							while (true) {
								--var1;
								if (var1 < 0) {
									return;
								}

								a(ic.pixels, var2, var6, 0, var3 >> 16, var4 >> 16);
								var4 += var8;
								var3 += var7;
								var2 += ic.width;
							}
						}

						a(ic.pixels, var2, var6, 0, var5 >> 16, var4 >> 16);
						var4 += var8;
						var5 += var9;
						var2 += ic.width;
					}
				}
			} else {
				var3 = var5 <<= 16;
				if (var2 < 0) {
					var3 -= var8 * var2;
					var5 -= var9 * var2;
					var2 = 0;
				}

				var4 <<= 16;
				if (var1 < 0) {
					var4 -= var7 * var1;
					var1 = 0;
				}

				if (var8 < var9) {
					var0 -= var1;
					var1 -= var2;
					var2 = xb[var2];

					while (true) {
						--var1;
						if (var1 < 0) {
							while (true) {
								--var0;
								if (var0 < 0) {
									return;
								}

								a(ic.pixels, var2, var6, 0, var4 >> 16, var5 >> 16);
								var4 += var7;
								var5 += var9;
								var2 += ic.width;
							}
						}

						a(ic.pixels, var2, var6, 0, var3 >> 16, var5 >> 16);
						var3 += var8;
						var5 += var9;
						var2 += ic.width;
					}
				} else {
					var0 -= var1;
					var1 -= var2;
					var2 = xb[var2];

					while (true) {
						--var1;
						if (var1 < 0) {
							while (true) {
								--var0;
								if (var0 < 0) {
									return;
								}

								a(ic.pixels, var2, var6, 0, var5 >> 16, var4 >> 16);
								var4 += var7;
								var5 += var9;
								var2 += ic.width;
							}
						}

						a(ic.pixels, var2, var6, 0, var5 >> 16, var3 >> 16);
						var3 += var8;
						var5 += var9;
						var2 += ic.width;
					}
				}
			}
		}
	}

	private static int[] a (int var0, int var1, int var2, int var3, int[] var4) {
		vb = var2 - var0;
		nb = var3 - var1;
		if (var4 == null) {
			int var5 = nb;
			if (var5 == 0) {
				++var5;
			}

			xb = new int[var5];

			for (int var6 = 0 ; var6 < var5 ; ++var6) {
				xb[var6] = (var1 + var6) * ic.width + var0;
			}
		} else {
			xb = var4;
		}

		e();
		return xb;
	}

	private static void a (int[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8;
		int var9;
		int var10;
		if (sb) {
			if (gb) {
				if (var5 - var4 > 3) {
					var8 = (var7 - var6) / (var5 - var4);
				} else {
					var8 = 0;
				}

				if (var5 > vb) {
					var5 = vb;
				}

				if (var4 < 0) {
					var6 -= var4 * var8;
					var4 = 0;
				}

				if (var4 >= var5) {
					return;
				}

				var1 += var4;
				var3 = var5 - var4 >> 2;
				var8 <<= 2;
			} else {
				if (var4 >= var5) {
					return;
				}

				var1 += var4;
				var3 = var5 - var4 >> 2;
				if (var3 > 0) {
					var8 = (var7 - var6) * rb[var3] >> 15;
				} else {
					var8 = 0;
				}
			}

			if (lb == 0) {
				while (true) {
					--var3;
					if (var3 < 0) {
						var3 = var5 - var4 & 3;
						if (var3 > 0) {
							var2 = hb[var6 >> 8];

							do {
								var0[var1++] = var2;
								--var3;
							} while (var3 > 0);

							return;
						}
						break;
					}

					var2 = hb[var6 >> 8];
					var6 += var8;
					var0[var1++] = var2;
					var0[var1++] = var2;
					var0[var1++] = var2;
					var0[var1++] = var2;
				}
			} else {
				var9 = lb;
				var10 = 256 - lb;

				while (true) {
					--var3;
					if (var3 < 0) {
						var3 = var5 - var4 & 3;
						if (var3 > 0) {
							var2 = hb[var6 >> 8];
							var2 = ((var2 & 16711935) * var10 >> 8 & 16711935) + ((var2 & '\uff00') * var10 >> 8 & '\uff00');

							do {
								var0[var1++] = var2 + ((var0[var1] & 16711935) * var9 >> 8 & 16711935) + ((var0[var1] & '\uff00') * var9 >> 8 & '\uff00');
								--var3;
							} while (var3 > 0);
						}
						break;
					}

					var2 = hb[var6 >> 8];
					var6 += var8;
					var2 = ((var2 & 16711935) * var10 >> 8 & 16711935) + ((var2 & '\uff00') * var10 >> 8 & '\uff00');
					var0[var1++] = var2 + ((var0[var1] & 16711935) * var9 >> 8 & 16711935) + ((var0[var1] & '\uff00') * var9 >> 8 & '\uff00');
					var0[var1++] = var2 + ((var0[var1] & 16711935) * var9 >> 8 & 16711935) + ((var0[var1] & '\uff00') * var9 >> 8 & '\uff00');
					var0[var1++] = var2 + ((var0[var1] & 16711935) * var9 >> 8 & 16711935) + ((var0[var1] & '\uff00') * var9 >> 8 & '\uff00');
					var0[var1++] = var2 + ((var0[var1] & 16711935) * var9 >> 8 & 16711935) + ((var0[var1] & '\uff00') * var9 >> 8 & '\uff00');
				}
			}

		} else if (var4 < var5) {
			var8 = (var7 - var6) / (var5 - var4);
			if (gb) {
				if (var5 > vb) {
					var5 = vb;
				}

				if (var4 < 0) {
					var6 -= var4 * var8;
					var4 = 0;
				}

				if (var4 >= var5) {
					return;
				}
			}

			var1 += var4;
			var3 = var5 - var4;
			if (lb == 0) {
				do {
					var0[var1++] = hb[var6 >> 8];
					var6 += var8;
					--var3;
				} while (var3 > 0);

			} else {
				var9 = lb;
				var10 = 256 - lb;

				do {
					var2 = hb[var6 >> 8];
					var6 += var8;
					var2 = ((var2 & 16711935) * var10 >> 8 & 16711935) + ((var2 & '\uff00') * var10 >> 8 & '\uff00');
					var0[var1++] = var2 + ((var0[var1] & 16711935) * var9 >> 8 & 16711935) + ((var0[var1] & '\uff00') * var9 >> 8 & '\uff00');
					--var3;
				} while (var3 > 0);

			}
		}
	}

	static void a (int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = 0;
		int var10 = 0;
		if (var1 != var0) {
			var9 = (var4 - var3 << 16) / (var1 - var0);
			var10 = (var7 - var6 << 15) / (var1 - var0);
		}

		int var11 = 0;
		int var12 = 0;
		if (var2 != var1) {
			var11 = (var5 - var4 << 16) / (var2 - var1);
			var12 = (var8 - var7 << 15) / (var2 - var1);
		}

		int var13 = 0;
		int var14 = 0;
		if (var2 != var0) {
			var13 = (var3 - var5 << 16) / (var0 - var2);
			var14 = (var6 - var8 << 15) / (var0 - var2);
		}

		if (var0 <= var1 && var0 <= var2) {
			if (var0 < nb) {
				if (var1 > nb) {
					var1 = nb;
				}

				if (var2 > nb) {
					var2 = nb;
				}

				if (var1 < var2) {
					var5 = var3 <<= 16;
					var8 = var6 <<= 15;
					if (var0 < 0) {
						var5 -= var13 * var0;
						var3 -= var9 * var0;
						var8 -= var14 * var0;
						var6 -= var10 * var0;
						var0 = 0;
					}

					var4 <<= 16;
					var7 <<= 15;
					if (var1 < 0) {
						var4 -= var11 * var1;
						var7 -= var12 * var1;
						var1 = 0;
					}

					if ((var0 == var1 || var13 >= var9) && (var0 != var1 || var13 <= var11)) {
						var2 -= var1;
						var1 -= var0;
						var0 = xb[var0];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									a(ic.pixels, var0, 0, 0, var4 >> 16, var5 >> 16, var7 >> 7, var8 >> 7);
									var5 += var13;
									var4 += var11;
									var8 += var14;
									var7 += var12;
									var0 += ic.width;
								}
							}

							a(ic.pixels, var0, 0, 0, var3 >> 16, var5 >> 16, var6 >> 7, var8 >> 7);
							var5 += var13;
							var3 += var9;
							var8 += var14;
							var6 += var10;
							var0 += ic.width;
						}
					} else {
						var2 -= var1;
						var1 -= var0;
						var0 = xb[var0];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									a(ic.pixels, var0, 0, 0, var5 >> 16, var4 >> 16, var8 >> 7, var7 >> 7);
									var5 += var13;
									var4 += var11;
									var8 += var14;
									var7 += var12;
									var0 += ic.width;
								}
							}

							a(ic.pixels, var0, 0, 0, var5 >> 16, var3 >> 16, var8 >> 7, var6 >> 7);
							var5 += var13;
							var3 += var9;
							var8 += var14;
							var6 += var10;
							var0 += ic.width;
						}
					}
				} else {
					var4 = var3 <<= 16;
					var7 = var6 <<= 15;
					if (var0 < 0) {
						var4 -= var13 * var0;
						var3 -= var9 * var0;
						var7 -= var14 * var0;
						var6 -= var10 * var0;
						var0 = 0;
					}

					var5 <<= 16;
					var8 <<= 15;
					if (var2 < 0) {
						var5 -= var11 * var2;
						var8 -= var12 * var2;
						var2 = 0;
					}

					if ((var0 == var2 || var13 >= var9) && (var0 != var2 || var11 <= var9)) {
						var1 -= var2;
						var2 -= var0;
						var0 = xb[var0];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									a(ic.pixels, var0, 0, 0, var3 >> 16, var5 >> 16, var6 >> 7, var8 >> 7);
									var5 += var11;
									var3 += var9;
									var8 += var12;
									var6 += var10;
									var0 += ic.width;
								}
							}

							a(ic.pixels, var0, 0, 0, var3 >> 16, var4 >> 16, var6 >> 7, var7 >> 7);
							var4 += var13;
							var3 += var9;
							var7 += var14;
							var6 += var10;
							var0 += ic.width;
						}
					} else {
						var1 -= var2;
						var2 -= var0;
						var0 = xb[var0];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									a(ic.pixels, var0, 0, 0, var5 >> 16, var3 >> 16, var8 >> 7, var6 >> 7);
									var5 += var11;
									var3 += var9;
									var8 += var12;
									var6 += var10;
									var0 += ic.width;
								}
							}

							a(ic.pixels, var0, 0, 0, var4 >> 16, var3 >> 16, var7 >> 7, var6 >> 7);
							var4 += var13;
							var3 += var9;
							var7 += var14;
							var6 += var10;
							var0 += ic.width;
						}
					}
				}
			}
		} else if (var1 <= var2) {
			if (var1 < nb) {
				if (var2 > nb) {
					var2 = nb;
				}

				if (var0 > nb) {
					var0 = nb;
				}

				if (var2 < var0) {
					var3 = var4 <<= 16;
					var6 = var7 <<= 15;
					if (var1 < 0) {
						var3 -= var9 * var1;
						var4 -= var11 * var1;
						var6 -= var10 * var1;
						var7 -= var12 * var1;
						var1 = 0;
					}

					var5 <<= 16;
					var8 <<= 15;
					if (var2 < 0) {
						var5 -= var13 * var2;
						var8 -= var14 * var2;
						var2 = 0;
					}

					if ((var1 == var2 || var9 >= var11) && (var1 != var2 || var9 <= var13)) {
						var0 -= var2;
						var2 -= var1;
						var1 = xb[var1];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}

									a(ic.pixels, var1, 0, 0, var5 >> 16, var3 >> 16, var8 >> 7, var6 >> 7);
									var3 += var9;
									var5 += var13;
									var6 += var10;
									var8 += var14;
									var1 += ic.width;
								}
							}

							a(ic.pixels, var1, 0, 0, var4 >> 16, var3 >> 16, var7 >> 7, var6 >> 7);
							var3 += var9;
							var4 += var11;
							var6 += var10;
							var7 += var12;
							var1 += ic.width;
						}
					} else {
						var0 -= var2;
						var2 -= var1;
						var1 = xb[var1];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}

									a(ic.pixels, var1, 0, 0, var3 >> 16, var5 >> 16, var6 >> 7, var8 >> 7);
									var3 += var9;
									var5 += var13;
									var6 += var10;
									var8 += var14;
									var1 += ic.width;
								}
							}

							a(ic.pixels, var1, 0, 0, var3 >> 16, var4 >> 16, var6 >> 7, var7 >> 7);
							var3 += var9;
							var4 += var11;
							var6 += var10;
							var7 += var12;
							var1 += ic.width;
						}
					}
				} else {
					var5 = var4 <<= 16;
					var8 = var7 <<= 15;
					if (var1 < 0) {
						var5 -= var9 * var1;
						var4 -= var11 * var1;
						var8 -= var10 * var1;
						var7 -= var12 * var1;
						var1 = 0;
					}

					var3 <<= 16;
					var6 <<= 15;
					if (var0 < 0) {
						var3 -= var13 * var0;
						var6 -= var14 * var0;
						var0 = 0;
					}

					if (var9 < var11) {
						var2 -= var0;
						var0 -= var1;
						var1 = xb[var1];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									a(ic.pixels, var1, 0, 0, var3 >> 16, var4 >> 16, var6 >> 7, var7 >> 7);
									var3 += var13;
									var4 += var11;
									var6 += var14;
									var7 += var12;
									var1 += ic.width;
								}
							}

							a(ic.pixels, var1, 0, 0, var5 >> 16, var4 >> 16, var8 >> 7, var7 >> 7);
							var5 += var9;
							var4 += var11;
							var8 += var10;
							var7 += var12;
							var1 += ic.width;
						}
					} else {
						var2 -= var0;
						var0 -= var1;
						var1 = xb[var1];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									a(ic.pixels, var1, 0, 0, var4 >> 16, var3 >> 16, var7 >> 7, var6 >> 7);
									var3 += var13;
									var4 += var11;
									var6 += var14;
									var7 += var12;
									var1 += ic.width;
								}
							}

							a(ic.pixels, var1, 0, 0, var4 >> 16, var5 >> 16, var7 >> 7, var8 >> 7);
							var5 += var9;
							var4 += var11;
							var8 += var10;
							var7 += var12;
							var1 += ic.width;
						}
					}
				}
			}
		} else if (var2 < nb) {
			if (var0 > nb) {
				var0 = nb;
			}

			if (var1 > nb) {
				var1 = nb;
			}

			if (var0 < var1) {
				var4 = var5 <<= 16;
				var7 = var8 <<= 15;
				if (var2 < 0) {
					var4 -= var11 * var2;
					var5 -= var13 * var2;
					var7 -= var12 * var2;
					var8 -= var14 * var2;
					var2 = 0;
				}

				var3 <<= 16;
				var6 <<= 15;
				if (var0 < 0) {
					var3 -= var9 * var0;
					var6 -= var10 * var0;
					var0 = 0;
				}

				if (var11 < var13) {
					var1 -= var0;
					var0 -= var2;
					var2 = xb[var2];

					while (true) {
						--var0;
						if (var0 < 0) {
							while (true) {
								--var1;
								if (var1 < 0) {
									return;
								}

								a(ic.pixels, var2, 0, 0, var4 >> 16, var3 >> 16, var7 >> 7, var6 >> 7);
								var4 += var11;
								var3 += var9;
								var7 += var12;
								var6 += var10;
								var2 += ic.width;
							}
						}

						a(ic.pixels, var2, 0, 0, var4 >> 16, var5 >> 16, var7 >> 7, var8 >> 7);
						var4 += var11;
						var5 += var13;
						var7 += var12;
						var8 += var14;
						var2 += ic.width;
					}
				} else {
					var1 -= var0;
					var0 -= var2;
					var2 = xb[var2];

					while (true) {
						--var0;
						if (var0 < 0) {
							while (true) {
								--var1;
								if (var1 < 0) {
									return;
								}

								a(ic.pixels, var2, 0, 0, var3 >> 16, var4 >> 16, var6 >> 7, var7 >> 7);
								var4 += var11;
								var3 += var9;
								var7 += var12;
								var6 += var10;
								var2 += ic.width;
							}
						}

						a(ic.pixels, var2, 0, 0, var5 >> 16, var4 >> 16, var8 >> 7, var7 >> 7);
						var4 += var11;
						var5 += var13;
						var7 += var12;
						var8 += var14;
						var2 += ic.width;
					}
				}
			} else {
				var3 = var5 <<= 16;
				var6 = var8 <<= 15;
				if (var2 < 0) {
					var3 -= var11 * var2;
					var5 -= var13 * var2;
					var6 -= var12 * var2;
					var8 -= var14 * var2;
					var2 = 0;
				}

				var4 <<= 16;
				var7 <<= 15;
				if (var1 < 0) {
					var4 -= var9 * var1;
					var7 -= var10 * var1;
					var1 = 0;
				}

				if (var11 < var13) {
					var0 -= var1;
					var1 -= var2;
					var2 = xb[var2];

					while (true) {
						--var1;
						if (var1 < 0) {
							while (true) {
								--var0;
								if (var0 < 0) {
									return;
								}

								a(ic.pixels, var2, 0, 0, var4 >> 16, var5 >> 16, var7 >> 7, var8 >> 7);
								var4 += var9;
								var5 += var13;
								var7 += var10;
								var8 += var14;
								var2 += ic.width;
							}
						}

						a(ic.pixels, var2, 0, 0, var3 >> 16, var5 >> 16, var6 >> 7, var8 >> 7);
						var3 += var11;
						var5 += var13;
						var6 += var12;
						var8 += var14;
						var2 += ic.width;
					}
				} else {
					var0 -= var1;
					var1 -= var2;
					var2 = xb[var2];

					while (true) {
						--var1;
						if (var1 < 0) {
							while (true) {
								--var0;
								if (var0 < 0) {
									return;
								}

								a(ic.pixels, var2, 0, 0, var5 >> 16, var4 >> 16, var8 >> 7, var7 >> 7);
								var4 += var9;
								var5 += var13;
								var7 += var10;
								var8 += var14;
								var2 += ic.width;
							}
						}

						a(ic.pixels, var2, 0, 0, var5 >> 16, var3 >> 16, var8 >> 7, var6 >> 7);
						var3 += var11;
						var5 += var13;
						var6 += var12;
						var8 += var14;
						var2 += ic.width;
					}
				}
			}
		}
	}

	static void a (double v) {
		a(v, 0, 512);
	}

	static int[] c (int[] ints) {
		return a(ic.int_ab, ic.int_bb, ic.Z, ic.int_db, ints);
	}

	private static void a (double v, int unused, int unused2) {
		v += Math.random() * 0.03D - 0.015D;
		int i = 0;
		for (int i1 = 0 ; i1 < 512 ; ++i1) {
			double v1 = (double) (i1 >> 3) / 64.0D + 0.0078125D;
			double v2 = (double) (i1 & 7) / 8.0D + 0.0625D;
			for (int i2 = 0 ; i2 < 128 ; ++i2) {
				double v3 = (double) i2 / 128.0D;
				double v4 = v3;
				double v5 = v3;
				double v6 = v3;
				if (v2 != 0.0D) {
					double v7;
					if (v3 < 0.5D) {
						v7 = v3 * (1.0D + v2);
					} else {
						v7 = v3 + v2 - v3 * v2;
					}

					double v8 = 2.0D * v3 - v7;
					double v9 = v1 + 0.3333333333333333D;
					if (v9 > 1.0D) {
						--v9;
					}

					double v10 = v1 - 0.3333333333333333D;
					if (v10 < 0.0D) {
						++v10;
					}

					if (6.0D * v9 < 1.0D) {
						v4 = v8 + (v7 - v8) * 6.0D * v9;
					} else if (2.0D * v9 < 1.0D) {
						v4 = v7;
					} else if (3.0D * v9 < 2.0D) {
						v4 = v8 + (v7 - v8) * (0.6666666666666666D - v9) * 6.0D;
					} else {
						v4 = v8;
					}

					if (6.0D * v1 < 1.0D) {
						v5 = v8 + (v7 - v8) * 6.0D * v1;
					} else if (2.0D * v1 < 1.0D) {
						v5 = v7;
					} else if (3.0D * v1 < 2.0D) {
						v5 = v8 + (v7 - v8) * (0.6666666666666666D - v1) * 6.0D;
					} else {
						v5 = v8;
					}

					if (6.0D * v10 < 1.0D) {
						v6 = v8 + (v7 - v8) * 6.0D * v10;
					} else if (2.0D * v10 < 1.0D) {
						v6 = v7;
					} else if (3.0D * v10 < 2.0D) {
						v6 = v8 + (v7 - v8) * (0.6666666666666666D - v10) * 6.0D;
					} else {
						v6 = v8;
					}
				}

				int i3 = (int) (v4 * 256.0D);
				int i4 = (int) (v5 * 256.0D);
				int i5 = (int) (v6 * 256.0D);
				int i6 = (i3 << 16) + (i4 << 8) + i5;
				i6 = a(i6, v);
				if (i6 == 0) {
					i6 = 1;
				}

				hb[i++] = i6;
			}
		}

	}
}
