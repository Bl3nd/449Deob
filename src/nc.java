final class nc {
	static int a = 5063219;
	static int b;
	static int c;
	static int d;
	static int f;
	static oa g;
	static int h;
	static int int_i;
	static boolean isMembers;
	static int k;
	static rd n = md.a((String) "", (byte) 124);
	static int o;
	static int p = 0;
	static rd q = md.a((String) "Benutzeroberfl-=che geladen)3", (byte) 124);
	static int r;
	static int s;
	static int t;
	static int v;
	static rd x;
	static int y;
	static int z;
	static int B;
	static rd _hasLoggedIn2;
	static int D;
	static rd hitmarks;
	static boolean G;
	private static rd _hasLoggedIn = md.a((String) " has logged in)3", (byte) 122);
	private static rd A = md.a((String) "white:", (byte) 117);

	static {
		x = A;
		_hasLoggedIn2 = _hasLoggedIn;
		hitmarks = md.a("hitmarks", (byte) 121);
		G = false;
	}

	int[][] adjacency;
	private int height;
	private int insetY;
	private int width;
	private int insetX;

	nc (int var1, int var2) {
		try {
			this.height = var2;
			this.insetX = 0;
			this.insetY = 0;
			this.width = var1;
			this.adjacency = new int[this.width][this.height];
			this.a(-3390);
		} catch (RuntimeException var4) {
			throw id.a(var4, "nc.<init>(" + var1 + ',' + var2 + ')');
		}
	}

	static int a (pb cacheFile8, pb cacheFile10, int unused) {
		try {
			++r;
			int titleScreenSpritesCount = 0;
			if (cacheFile10.b((byte) -90, i.title_jpg, ff.rd_t)) {
				titleScreenSpritesCount = 1;
			}

			if (cacheFile8.b((byte) -19, ka.logo, ff.rd_t)) {
				++titleScreenSpritesCount;
			}

			if (cacheFile8.b((byte) -22, ib.titleBox, ff.rd_t)) {
				++titleScreenSpritesCount;
			}

			if (cacheFile8.b((byte) -20, bd.titleButton, ff.rd_t)) {
				++titleScreenSpritesCount;
			}

			if (cacheFile8.b((byte) -126, rb.runes, ff.rd_t)) {
				++titleScreenSpritesCount;
			}

			return titleScreenSpritesCount;
		} catch (RuntimeException var4) {
			throw id.a(var4, "nc.D(" + (cacheFile8 != null ? "{...}" : "null") + ',' + (cacheFile10 != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}

	public static void b (int var0) {
		try {
			n = null;
			_hasLoggedIn2 = null;
			g = null;
			x = null;
			hitmarks = null;
			_hasLoggedIn = null;
			q = null;
			A = null;
			int var1 = 116 % ((-45 - var0) / 39);
		} catch (RuntimeException var2) {
			throw id.a(var2, "nc.J(" + var0 + ')');
		}
	}

	final boolean reachedWall (int unused, int currentY, int currentX, int goalPosition, int goalX, int goalOrientation, int goalY) {
		try {
			++B;
			if (currentX == goalX && currentY == goalY) {
				return true;
			} else {
				goalY -= this.insetY;
				currentX -= this.insetX;
				goalX -= this.insetX;
				currentY -= this.insetY;
				if (goalPosition == 0) {
					if (goalOrientation != 0) {
						if (goalOrientation != 1) {
							if (goalOrientation == 2) {
								if (currentX == 1 + goalX && currentY == goalY) {
									return true;
								}

								if (currentX == goalX && currentY == goalY + 1 && (this.adjacency[currentX][currentY] & 0x1280120) == 0) {
									return true;
								}

								if (goalX == currentX && goalY - 1 == currentY && (this.adjacency[currentX][currentY] & 19398914) == 0) {
									return true;
								}
							} else if (goalOrientation == 3) {
								if (goalX == currentX && goalY + -1 == currentY) {
									return true;
								}

								if (goalX - 1 == currentX && currentY == goalY && (this.adjacency[currentX][currentY] & 19398920) == 0) {
									return true;
								}

								if (currentX == 1 + goalX && currentY == goalY && (this.adjacency[currentX][currentY] & 19399040) == 0) {
									return true;
								}
							}
						} else {
							if (goalX == currentX && 1 + goalY == currentY) {
								return true;
							}

							if (goalX - 1 == currentX && currentY == goalY && (19398920 & this.adjacency[currentX][currentY]) == 0) {
								return true;
							}

							if (goalX + 1 == currentX && goalY == currentY && (19399040 & this.adjacency[currentX][currentY]) == 0) {
								return true;
							}
						}
					} else {
						if (currentX == goalX + -1 && goalY == currentY) {
							return true;
						}

						if (currentX == goalX && currentY == goalY + 1 && (this.adjacency[currentX][currentY] & 19398944) == 0) {
							return true;
						}

						if (currentX == goalX && currentY == goalY - 1 && (this.adjacency[currentX][currentY] & 19398914) == 0) {
							return true;
						}
					}
				} else if (goalPosition == 2) {
					if (goalOrientation != 0) {
						if (goalOrientation == 1) {
							if (currentX == -1 + goalX && currentY == goalY && (this.adjacency[currentX][currentY] & 19398920) == 0) {
								return true;
							}

							if (goalX == currentX && goalY + 1 == currentY) {
								return true;
							}

							if (currentX == 1 + goalX && goalY == currentY) {
								return true;
							}

							if (goalX == currentX && currentY == goalY - 1 && (19398914 & this.adjacency[currentX][currentY]) == 0) {
								return true;
							}
						} else if (goalOrientation != 2) {
							if (goalOrientation == 3) {
								if (currentX == -1 + goalX && goalY == currentY) {
									return true;
								}

								if (currentX == goalX && currentY == 1 + goalY && (19398944 & this.adjacency[currentX][currentY]) == 0) {
									return true;
								}

								if (currentX == 1 + goalX && goalY == currentY && (19399040 & this.adjacency[currentX][currentY]) == 0) {
									return true;
								}

								if (goalX == currentX && goalY - 1 == currentY) {
									return true;
								}
							}
						} else {
							if (currentX == goalX - 1 && goalY == currentY && (this.adjacency[currentX][currentY] & 19398920) == 0) {
								return true;
							}

							if (goalX == currentX && currentY == goalY + 1 && (19398944 & this.adjacency[currentX][currentY]) == 0) {
								return true;
							}

							if (1 + goalX == currentX && currentY == goalY) {
								return true;
							}

							if (goalX == currentX && currentY == goalY + -1) {
								return true;
							}
						}
					} else {
						if (currentX == goalX + -1 && goalY == currentY) {
							return true;
						}

						if (goalX == currentX && 1 + goalY == currentY) {
							return true;
						}

						if (goalX + 1 == currentX && goalY == currentY && (this.adjacency[currentX][currentY] & 19399040) == 0) {
							return true;
						}

						if (goalX == currentX && currentY == -1 + goalY && (19398914 & this.adjacency[currentX][currentY]) == 0) {
							return true;
						}
					}
				} else if (goalPosition == 9) {
					if (currentX == goalX && currentY == 1 + goalY && (this.adjacency[currentX][currentY] & 32) == 0) {
						return true;
					}

					if (goalX == currentX && currentY == -1 + goalY && (this.adjacency[currentX][currentY] & 2) == 0) {
						return true;
					}

					if (currentX == -1 + goalX && goalY == currentY && (this.adjacency[currentX][currentY] & 8) == 0) {
						return true;
					}

					if (currentX == goalX + 1 && currentY == goalY && (this.adjacency[currentX][currentY] & 128) == 0) {
						return true;
					}
				}
				return false;
			}
		} catch (RuntimeException var9) {
			throw id.a(var9, "nc.E(" + unused + ',' + currentY + ',' + currentX + ',' + goalPosition + ',' + goalX + ',' + goalOrientation + ',' + goalY + ')');
		}
	}

	final void markWall (int y, int x, boolean impenetrable, byte unused, int position, int orientation) {
		try {
			++h;
			x -= this.insetX;
			y -= this.insetY;
			if (position == 0) {
				if (orientation == 0) {
					this.set(40, y, x, 128);
					this.set(40, y, -1 + x, 8);
				} else if (orientation == 1) {
					this.set(40, y, x, 2);
					this.set(40, y - -1, x, 32);
				} else if (orientation == 2) {
					this.set(40, y, x, 8);
					this.set(40, y, x + 1, 128);
				} else if (orientation == 3) {
					this.set(40, y, x, 32);
					this.set(40, -1 + y, x, 2);
				}
			} else if (position == 1 || position == 3) {
				if (orientation == 0) {
					this.set(40, y, x, 1);
					this.set(40, y + 1, -1 + x, 16);
				}

				if (~orientation == -2) {
					this.set(40, y, x, 4);
					this.set(-102 ^ -78, 1 + y, x - -1, 64);
				}

				if (orientation == 2) {
					this.set(40, y, x, 16);
					this.set(-102 + 142, -1 + y, x + 1, 1);
				}

				if (orientation == 3) {
					this.set(40, y, x, 64);
					this.set(-102 ^ -78, -1 + y, -1 + x, 4);
				}
			}

			if (position == 2) {
				if (orientation == 0) {
					this.set(40, y, x, 130);
					this.set(40, y, -1 + x, 8);
					this.set(40, y + 1, x, 32);
				}

				if (orientation == 1) {
					this.set(40, y, x, 10);
					this.set(40, 1 + y, x, 32);
					this.set(40, y, 1 + x, 128);
				}

				if (orientation == 2) {
					this.set(40, y, x, 40);
					this.set(40, y, 1 + x, 128);
					this.set(40, y - 1, x, 2);
				}

				if (~orientation == -4) {
					this.set(40, y, x, 160);
					this.set(-102 ^ -78, -1 + y, x, 2);
					this.set(40, y, -1 + x, 8);
				}
			}

			if (impenetrable) {
				if (position == 0) {
					if (~orientation == -1) {
						this.set(40, y, x, 65536);
						this.set(-102 ^ -78, y, -1 + x, 4096);
					}

					if (~orientation == -2) {
						this.set(40, y, x, 1024);
						this.set(40, 1 + y, x, 16384);
					}

					if (orientation == 2) {
						this.set(40, y, x, 4096);
						this.set(-102 + 142, y, 1 + x, 65536);
					}

					if (~orientation == -4) {
						this.set(40, y, x, 16384);
						this.set(40, y - 1, x, 1024);
					}
				}

				if (~position == -2 || ~position == -4) {
					if (orientation == 0) {
						this.set(40, y, x, 512);
						this.set(40, y + 1, -1 + x, 8192);
					}

					if (~orientation == -2) {
						this.set(40, y, x, 2048);
						this.set(40, y + 1, 1 + x, '耀');
					}

					if (~orientation == -3) {
						this.set(-102 + 142, y, x, 8192);
						this.set(40, y - 1, 1 + x, 512);
					}

					if (~orientation == -4) {
						this.set(40, y, x, '耀');
						this.set(40, -1 + y, x - 1, 2048);
					}
				}

				if (position == 2) {
					if (orientation == 0) {
						this.set(40, y, x, 66560);
						this.set(40, y, -1 + x, 4096);
						this.set(40, 1 + y, x, 16384);
					}

					if (orientation == 1) {
						this.set(-102 ^ -78, y, x, 5120);
						this.set(40, y + 1, x, 16384);
						this.set(40, y, x + 1, 65536);
					}

					if (orientation == 2) {
						this.set(40, y, x, 20480);
						this.set(40, y, x - -1, 65536);
						this.set(40, y + -1, x, 1024);
					}

					if (~orientation == -4) {
						this.set(40, y, x, 81920);
						this.set(40, -1 + y, x, 1024);
						this.set(40, y, -1 + x, 4096);
					}
				}
			}

		} catch (RuntimeException var8) {
			throw id.a(var8, "nc.L(" + y + ',' + x + ',' + impenetrable + ',' + unused + ',' + position + ',' + orientation + ')');
		}
	}

	final void a (int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		int var11 = client.int_tb;

		try {
			int var8 = 256;
			if (var3) {
				var8 += 131072;
			}

			int var9;
			if (~var4 == -2 || var4 == 3) {
				var9 = var6;
				var6 = var1;
				var1 = var9;
			}

			var5 -= this.insetY;
			if (var2 != 0) {
				this.markBlocked(-107, -13, (byte) -117);
			}

			++o;
			var7 -= this.insetX;
			var9 = var7;
			if (var11 != 0 || ~(var6 + var7) < ~var7) {
				do {
					if (~var9 <= -1 && var9 < this.width) {
						int var10 = var5;
						if (var11 != 0 || ~(var5 - -var1) < ~var5) {
							do {
								if (var10 >= 0 && this.height > var10) {
									this.a(var9, var8, (byte) 122, var10);
								}

								++var10;
							} while (~(var5 - -var1) < ~var10);
						}
					}

					++var9;
				} while (~(var6 + var7) < ~var9);

			}
		} catch (RuntimeException var12) {
			throw id.a(var12, "nc.B(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
		}
	}

	final void a (int unused) {
		try {
			++v;
			int mapX = 0;
			if (this.width > mapX) {
				do {
					int mapY = 0;
					if (mapY >= this.height) {
						++mapX;
					} else {
						do {
							if (mapX != 0 && mapY != 0 && mapX != -1 + this.width && mapY != this.height + -1) {
								this.adjacency[mapX][mapY] = 16777216;
							} else {
								this.adjacency[mapX][mapY] = 16777215;
							}

							++mapY;
						} while (mapY < this.height);

						++mapX;
					}
				} while (this.width > mapX);

			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "nc.A(" + unused + ')');
		}
	}

	final void markBlocked (int x, int y, byte unused) {
		try {
			x -= this.insetX;
			y -= this.insetY;
			++f;
			this.adjacency[x][y] = fb.b(this.adjacency[x][y], 2097152);
		} catch (RuntimeException var5) {
			throw id.a(var5, "nc.M(" + x + ',' + y + ',' + unused + ')');
		}
	}

	final boolean reachedWallDecoration (int goalX, int currentY, int goalY, int unused, int goalOrientation, int goalPosition, int currentX) {
		try {
			++c;
			if (goalX == currentX && goalY == currentY) {
				return true;
			} else {
				goalY -= this.insetY;
				currentY -= this.insetY;
				goalX -= this.insetX;
				currentX -= this.insetX;
				if (goalPosition == 6 || goalPosition == 7) {
					if (goalPosition == 7) {
						goalOrientation = 2 + goalOrientation & 3;
					}

					if (goalOrientation == 0) {
						if (1 + goalX == currentX && currentY == goalY && (128 & this.adjacency[currentX][currentY]) == 0) {
							return true;
						}

						if (goalX == currentX && goalY - 1 == currentY && (2 & this.adjacency[currentX][currentY]) == 0) {
							return true;
						}
					} else if (goalOrientation != 1) {
						if (goalOrientation != 2) {
							if (goalOrientation == 3) {
								if (currentX == goalX + 1 && currentY == goalY && (128 & this.adjacency[currentX][currentY]) == 0) {
									return true;
								}

								if (currentX == goalX && currentY == goalY + 1 && (this.adjacency[currentX][currentY] & 32) == 0) {
									return true;
								}
							}
						} else {
							if (goalX + -1 == currentX && currentY == goalY && (this.adjacency[currentX][currentY] & 8) == 0) {
								return true;
							}

							if (currentX == goalX && currentY == 1 + goalY && (this.adjacency[currentX][currentY] & 32) == 0) {
								return true;
							}
						}
					} else {
						if (currentX == goalX - 1 && currentY == goalY && (this.adjacency[currentX][currentY] & 8) == 0) {
							return true;
						}

						if (currentX == goalX && currentY == -1 + goalY && (2 & this.adjacency[currentX][currentY]) == 0) {
							return true;
						}
					}
				} else if (goalPosition == 8) {
					if (goalX == currentX && currentY == goalY + 1 && (32 & this.adjacency[currentX][currentY]) == 0) {
						return true;
					}

					if (currentX == goalX && currentY == goalY - 1 && (2 & this.adjacency[currentX][currentY]) == 0) {
						return true;
					}

					if (goalX + -1 == currentX && currentY == goalY && (this.adjacency[currentX][currentY] & 8) == 0) {
						return true;
					}

					if (1 + goalX == currentX && goalY == currentY && (this.adjacency[currentX][currentY] & 128) == 0) {
						return true;
					}
				}

				return false;
			}
		} catch (RuntimeException var9) {
			throw id.a(var9, "nc.C(" + goalX + ',' + currentY + ',' + goalY + ',' + unused + ',' + goalOrientation + ',' + goalPosition + ',' + currentX + ')');
		}
	}

	final void b (int var1, int var2, boolean var3, byte var4, int var5, int var6) {
		try {
			var6 -= this.insetX;
			++D;
			var5 -= this.insetY;
			if (~var2 == -1) {
				if (var1 == 0) {
					this.a(var6, 128, (byte) 122, var5);
					this.a(-1 + var6, 8, (byte) 122, var5);
				}

				if (var1 == 1) {
					this.a(var6, 2, (byte) 122, var5);
					this.a(var6, 32, (byte) 122, 1 + var5);
				}

				if (var1 == 2) {
					this.a(var6, 8, (byte) 122, var5);
					this.a(1 + var6, 128, (byte) 122, var5);
				}

				if (var1 == 3) {
					this.a(var6, 32, (byte) 122, var5);
					this.a(var6, 2, (byte) 122, -1 + var5);
				}
			}

			if (var4 != 111) {
				_hasLoggedIn = null;
			}

			if (var2 == 1 || ~var2 == -4) {
				if (~var1 == -1) {
					this.a(var6, 1, (byte) 122, var5);
					this.a(-1 + var6, 16, (byte) 122, var5 - -1);
				}

				if (~var1 == -2) {
					this.a(var6, 4, (byte) 122, var5);
					this.a(var6 + 1, 64, (byte) 122, var5 + 1);
				}

				if (var1 == 2) {
					this.a(var6, 16, (byte) 122, var5);
					this.a(1 + var6, 1, (byte) 122, -1 + var5);
				}

				if (~var1 == -4) {
					this.a(var6, 64, (byte) 122, var5);
					this.a(var6 - 1, 4, (byte) 122, var5 + -1);
				}
			}

			if (var2 == 2) {
				if (~var1 == -1) {
					this.a(var6, 130, (byte) 122, var5);
					this.a(-1 + var6, 8, (byte) 122, var5);
					this.a(var6, 32, (byte) 122, 1 + var5);
				}

				if (~var1 == -2) {
					this.a(var6, 10, (byte) 122, var5);
					this.a(var6, 32, (byte) 122, 1 + var5);
					this.a(1 + var6, 128, (byte) 122, var5);
				}

				if (~var1 == -3) {
					this.a(var6, 40, (byte) 122, var5);
					this.a(var6 + 1, 128, (byte) 122, var5);
					this.a(var6, 2, (byte) 122, -1 + var5);
				}

				if (var1 == 3) {
					this.a(var6, 160, (byte) 122, var5);
					this.a(var6, 2, (byte) 122, var5 + -1);
					this.a(var6 + -1, 8, (byte) 122, var5);
				}
			}

			if (var3) {
				if (~var2 == -1) {
					if (~var1 == -1) {
						this.a(var6, 65536, (byte) 122, var5);
						this.a(-1 + var6, 4096, (byte) 122, var5);
					}

					if (~var1 == -2) {
						this.a(var6, 1024, (byte) 122, var5);
						this.a(var6, 16384, (byte) 122, 1 + var5);
					}

					if (~var1 == -3) {
						this.a(var6, 4096, (byte) 122, var5);
						this.a(1 + var6, 65536, (byte) 122, var5);
					}

					if (~var1 == -4) {
						this.a(var6, 16384, (byte) 122, var5);
						this.a(var6, 1024, (byte) 122, var5 - 1);
					}
				}

				if (var2 == 1 || ~var2 == -4) {
					if (~var1 == -1) {
						this.a(var6, 512, (byte) 122, var5);
						this.a(var6 - 1, 8192, (byte) 122, 1 + var5);
					}

					if (~var1 == -2) {
						this.a(var6, 2048, (byte) 122, var5);
						this.a(var6 - -1, '耀', (byte) 122, var5 + 1);
					}

					if (var1 == 2) {
						this.a(var6, 8192, (byte) 122, var5);
						this.a(1 + var6, 512, (byte) 122, -1 + var5);
					}

					if (var1 == 3) {
						this.a(var6, '耀', (byte) 122, var5);
						this.a(var6 + -1, 2048, (byte) 122, var5 - 1);
					}
				}

				if (var2 == 2) {
					if (~var1 == -1) {
						this.a(var6, 66560, (byte) 122, var5);
						this.a(var6 - 1, 4096, (byte) 122, var5);
						this.a(var6, 16384, (byte) 122, 1 + var5);
					}

					if (~var1 == -2) {
						this.a(var6, 5120, (byte) 122, var5);
						this.a(var6, 16384, (byte) 122, var5 + 1);
						this.a(1 + var6, 65536, (byte) 122, var5);
					}

					if (~var1 == -3) {
						this.a(var6, 20480, (byte) 122, var5);
						this.a(var6 - -1, 65536, (byte) 122, var5);
						this.a(var6, 1024, (byte) 122, -1 + var5);
					}

					if (var1 == 3) {
						this.a(var6, 81920, (byte) 122, var5);
						this.a(var6, 1024, (byte) 122, -1 + var5);
						this.a(-1 + var6, 4096, (byte) 122, var5);
					}
				}
			}

		} catch (RuntimeException var8) {
			throw id.a(var8, "nc.G(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
		}
	}

	private void a (int var1, int var2, byte var3, int var4) {
		try {
			if (var3 != 122) {
				this.markBlocked(-32, 105, (byte) -24);
			}

			this.adjacency[var1][var4] = od.a(this.adjacency[var1][var4], 16777215 + -var2);
			++k;
		} catch (RuntimeException var6) {
			throw id.a(var6, "nc.K(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}

	final void markSolidOccupant (int h, int unused, int w, int x, boolean impenetrable, int orientation, int y) {
		try {
			++nc.y;
			y -= this.insetY;
			x -= this.insetX;
			if (orientation == 1 || orientation == 3) {
				int tmp = w;
				w = h;
				h = tmp;
			}

			int occupied = 0x100;
			if (impenetrable) {
				occupied += 0x20000;
			}

			for (int xx = x ; xx < x + w ; xx++) {
				if (xx >= 0 && this.width > xx) {
					for (int yy = y ; yy < h + y ; yy++) {
						if (yy >= 0 && yy < this.height) {
							this.set(40, yy, xx, occupied);
						}
					}
				}
			}
		} catch (RuntimeException var12) {
			throw id.a(var12, "nc.F(" + h + ',' + unused + ',' + w + ',' + x + ',' + impenetrable + ',' + orientation + ',' + y + ')');
		}
	}

	private void set (int unused, int y, int x, int flag) {
		try {
			this.adjacency[x][y] = fb.b(this.adjacency[x][y], flag);
			++d;
		} catch (RuntimeException var6) {
			throw id.a(var6, "nc.N(" + unused + ',' + y + ',' + x + ',' + flag + ')');
		}
	}

	final void a (int var1, int var2, int var3) {
		try {
			var2 -= this.insetX;
			var3 -= this.insetY;
			if (var1 != -4877) {
				G = false;
			}

			this.adjacency[var2][var3] = od.a(this.adjacency[var2][var3], 14680063);
			++t;
		} catch (RuntimeException var5) {
			throw id.a(var5, "nc.H(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	final boolean reachedFacingObject (byte unused, int goalDX, int goalX, int goalY, int currentX, int surroundings, int goalDY, int currentY) {
		try {
			++int_i;
			int goalX2 = -1 + goalX + goalDX;
			int goalY2 = goalY + goalDY - 1;
			return currentX >= goalX && goalX2 >= currentX && goalY <= currentY && goalY2 >= currentY
					|| goalX - 1 == currentX && goalY <= currentY && goalY2 >= currentY && (8 & this.adjacency[-this.insetX + currentX][-this.insetY + currentY]) == 0 && (8 & surroundings) == 0
					|| 1 + goalX2 == currentX && goalY <= currentY && goalY2 >= currentY && (this.adjacency[-this.insetX + currentX][-this.insetY + currentY] & 128) == 0 && (2 & surroundings) == 0
					|| -1 + goalY == currentY && currentX >= goalX && currentX <= goalX2 && (this.adjacency[-this.insetX + currentX][-this.insetY + currentY] & 2) == 0 && (surroundings & 4) == 0
					|| currentY == 1 + goalY2 && goalX <= currentX && ~currentX >= ~goalX2 && (this.adjacency[-this.insetX + currentX][currentY - this.insetY] & 32) == 0 && (1 & surroundings) == 0;
		} catch (RuntimeException var11) {
			throw id.a(var11, "nc.I(" + unused + ',' + goalDX + ',' + goalX + ',' + goalY + ',' + currentX + ',' + surroundings + ',' + goalDY + ',' + currentY + ')');
		}
	}
}
