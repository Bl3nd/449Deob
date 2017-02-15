final class wa extends jb {
	static int bb;
	static id cb = new id(8);
	static int int_db;
	static int eb;
	static int gb;
	static int hb;
	static int ib;
	static int int_jb;
	static int kb;
	static rd lb = md.a((String) " ", (byte) 126);
	static int mb;
	static rd ob = md.a((String) "(U2", (byte) 126);
	static int int_pb;
	static rd qb = md.a((String) "Spieler)3 Bitte w-=hlen Sie eine andere Welt)3", (byte) 120);
	static int rb = 0;
	static int sb;
	static rd rd_ub = md.a((String) "System)2Update in: ", (byte) 123);
	static rd tooManyConnectionFromYourAddress2;
	static int xb = 0;
	static rd yb = md.a((String) "und haben es deaktiviert)3 Klicken Sie auf der", (byte) 121);
	static int zb;
	private static rd tooManyConnectionFromYourAddress = md.a((String) "Too many connections from your address)3", (byte) 127);

	static {
		tooManyConnectionFromYourAddress2 = tooManyConnectionFromYourAddress;
	}

	int ab = -1;
	boolean boolean_tb = false;
	private int[] Z = new int[]{-1, -1, -1, -1, -1};
	private short[] fb = new short[6];
	private short[] nb = new short[6];
	private int[] wb;

	static void sleep (int unused, long millis) {
		try {
			++gb;
			if (millis > 0L) {
				if (millis % 10L != 0L) {
					q.sleep(millis, (byte) -94);
				} else {
					q.sleep(-1L + millis, (byte) -94);
					q.sleep(1L, (byte) -94);
				}
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "wa.F(" + unused + ',' + millis + ')');
		}
	}

	static void f (int var0) {
		int var14 = client.int_tb;

		try {
			++mb;
			rd var1 = null;
			int var2 = 0;
			if (var14 != 0 || id.rb > var2) {
				do {
					if (~ta.xb[var2].a((byte) 68, db.lightRedText) != 0) {
						var1 = ta.xb[var2].a(false, ta.xb[var2].a((byte) 91, db.lightRedText));
						break;
					}

					++var2;
				} while (id.rb > var2);
			}

			if (var1 == null) {
				db.f(var0 ^ -185);
			} else {
				int var3 = uc.gc;
				int var4 = n.eb;
				int var5 = ud.I;
				if (var0 < var5) {
					var5 = 190;
				}

				if (~var3 > -1) {
					var3 = 0;
				}

				int var7 = 6116423;
				int var6 = wc.n;
				ic.c(var3, var4, var5, var6, var7);
				ic.c(1 + var3, var4 - -1, -2 + var5, 16, 0);
				ic.a(1 + var3, var4 - -18, var5 - 2, -19 + var6, 0);
				client.Y.c(var1, var3 - -3, 14 + var4, var7, false);
				int var9 = la.t;
				int var8 = pb.H;
				if (bf.int_d == 0) {
					var9 -= 4;
					var8 -= 4;
				}

				if (bf.int_d == 1) {
					var9 -= 205;
					var8 -= 553;
				}

				if (bf.int_d == 2) {
					var9 -= 357;
					var8 -= 17;
				}

				int var10 = 0;
				if (var14 != 0 || ~var10 > ~id.rb) {
					do {
						int var12 = 16777215;
						int var11 = (id.rb + -1 + -var10) * 15 + 31 + var4;
						rd var13 = ta.xb[var10];
						if (var8 > var3 && var8 < var5 + var3 && var11 - 13 < var9 && ~(3 + var11) < ~var9) {
							var12 = 16776960;
						}

						if (var13.a(-31152, var1)) {
							var13 = var13.b(var13.b(var0 + -29538) - var1.b(var0 ^ -29214), -23745, 0);
							if (var13.a(var0 + -31342, jb.space2)) {
								var13 = var13.b(var13.b(-29348) + -jb.space2.b(-29348), -23745, 0);
							}
						}

						client.Y.c(var13, 3 + var3, var11, var12, true);
						++var10;
					} while (~var10 > ~id.rb);

				}
			}
		} catch (RuntimeException var15) {
			throw id.a(var15, "wa.D(" + var0 + ')');
		}
	}

	static n a (int fileRequest, int var1) {
		try {
			if (var1 != -1) {
				a(-2, 76);
			}

			n var2 = (n) tb.Wb.a((byte) -84, (long) fileRequest);
			++int_jb;
			if (var2 != null) {
				return var2;
			} else {
				byte[] var3 = i.archiveFile2.a(16, fileRequest, (byte) 66);
				var2 = new n();
				if (var3 != null) {
					var2.a(new id(var3), (byte) -107);
				}

				tb.Wb.a(-128, var2, (long) fileRequest);
				return var2;
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "wa.I(" + fileRequest + ',' + var1 + ')');
		}
	}

	public static void c (byte var0) {
		try {
			tooManyConnectionFromYourAddress = null;
			tooManyConnectionFromYourAddress2 = null;
			cb = null;
			ob = null;
			qb = null;
			if (var0 >= -87) {
				tooManyConnectionFromYourAddress2 = null;
			}

			rd_ub = null;
			lb = null;
			yb = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "wa.M(" + var0 + ')');
		}
	}

	static Object a (int var0, byte[] buffer, boolean var2) {
		try {
			++ib;
			if (var0 <= 93) {
				a(93, -109);
			}

			if (buffer == null) {
				return null;
			} else {
				if (buffer.length > 136) {
					try {
						bf var3 = (bf) Class.forName("qa").newInstance();
						var3.put(21370, buffer);//put();
						return var3;
					} catch (Throwable var4) {
						var4.printStackTrace();
					}
				}

				return var2 ? se.a(buffer, -16044) : buffer;
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "wa.A(" + var0 + ',' + (buffer != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}

	static void a (int var0, nc var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8,
				   ua var9) {
		int var23 = client.int_tb;

		try {
			++kb;
			int var10 = tb.Yb[var8][var5][var0];
			int var11 = tb.Yb[var8][var5 + 1][var0];
			int var12 = tb.Yb[var8][var5 + 1][var0 - -1];
			int var13 = tb.Yb[var8][var5][1 + var0];
			bd var15 = ub.a(-94, var3);
			int var14 = var12 + var11 + (var10 - -var13) >> 2;
			int var17 = var4 + (var2 << 6);
			int var16 = (var3 << 14) + (var0 << 7) + var5 + 1073741824;
			if (~var15.Cb == -2) {
				var17 += 256;
			}

			if (~var15.Mb == -1) {
				var16 += Integer.MIN_VALUE;
			}

			if (var4 == 22) {
				Object var25;
				label164:
				{
					if (~var15.int_kb == 0 && var15.Jb == null) {
						var25 = var15.a((byte) 61, var2, var10, var11, 22, var12, var13);
						if (var23 == 0) {
							break label164;
						}
					}

					var25 = new ta(var3, 22, var2, var10, var11, var12, var13, var15.int_kb, true, null);
				}

				var9.a(var6, var5, var0, var14, (ha) var25, var16, var17);
				if (var15.boolean_ib && var15.Mb == 1) {
					var1.markBlocked(var5, var0, (byte) -38);
				}

			} else {
				int var18 = 76 / ((32 - var7) / 43);
				Object var19;
				int var20;
				if (var4 != 10 && ~var4 != -12) {
					if (var4 >= 12) {
						label319:
						{
							if (~var15.int_kb != 0 || var15.Jb != null) {
								var19 = new ta(var3, var4, var2, var10, var11, var12, var13, var15.int_kb, true, null);
								if (var23 == 0) {
									break label319;
								}
							}

							var19 = var15.a((byte) -106, var2, var10, var11, var4, var12, var13);
						}

						var9.a(var6, var5, var0, var14, 1, 1, (ha) var19, 0, var16, var17);
						if (var15.boolean_ib) {
							var1.markSolidOccupant(var15.h, 20850, var15.w, var5, var15.impenetrable, var2, var0);
						}

					} else if (var4 == 0) {
						label320:
						{
							if (var15.int_kb != -1 || var15.Jb != null) {
								var19 = new ta(var3, 0, var2, var10, var11, var12, var13, var15.int_kb, true, null);
								if (var23 == 0) {
									break label320;
								}
							}

							var19 = var15.a((byte) -79, var2, var10, var11, 0, var12, var13);
						}

						var9.a(var6, var5, var0, var14, (ha) var19, null, gd.ints_h[var2], 0, var16, var17);
						if (var15.boolean_ib) {
							var1.markWall(var0, var5, var15.impenetrable, (byte) -102, var4, var2);
						}

					} else if (~var4 == -2) {
						label191:
						{
							if (~var15.int_kb == 0 && var15.Jb == null) {
								var19 = var15.a((byte) 97, var2, var10, var11, 1, var12, var13);
								if (var23 == 0) {
									break label191;
								}
							}

							var19 = new ta(var3, 1, var2, var10, var11, var12, var13, var15.int_kb, true, null);
						}

						var9.a(var6, var5, var0, var14, (ha) var19, (ha) null, tb.Xb[var2], 0, var16, var17);
						if (var15.boolean_ib) {
							var1.markWall(var0, var5, var15.impenetrable, (byte) -102, var4, var2);
						}

					} else {
						int var26;
						Object var28;
						if (~var4 == -3) {
							Object var27;
							label199:
							{
								var26 = 1 + var2 & 3;
								if (~var15.int_kb == 0 && var15.Jb == null) {
									var27 = var15.a((byte) -96, var2 + 4, var10, var11, 2, var12, var13);
									var28 = var15.a((byte) -42, var26, var10, var11, 2, var12, var13);
									if (var23 == 0) {
										break label199;
									}
								}

								var27 = new ta(var3, 2, var2 + 4, var10, var11, var12, var13, var15.int_kb, true, null);
								var28 = new ta(var3, 2, var26, var10, var11, var12, var13, var15.int_kb, true, null);
							}

							var9.a(var6, var5, var0, var14, (ha) var27, (ha) var28, gd.ints_h[var2], gd.ints_h[var26], var16, var17);
							if (var15.boolean_ib) {
								var1.markWall(var0, var5, var15.impenetrable, (byte) -102, var4, var2);
							}

						} else if (var4 == 3) {
							label207:
							{
								if (var15.int_kb == -1 && var15.Jb == null) {
									var19 = var15.a((byte) 66, var2, var10, var11, 3, var12, var13);
									if (var23 == 0) {
										break label207;
									}
								}

								var19 = new ta(var3, 3, var2, var10, var11, var12, var13, var15.int_kb, true, null);
							}

							var9.a(var6, var5, var0, var14, (ha) var19, (ha) null, tb.Xb[var2], 0, var16, var17);
							if (var15.boolean_ib) {
								var1.markWall(var0, var5, var15.impenetrable, (byte) -102, var4, var2);
							}

						} else if (~var4 == -10) {
							label321:
							{
								if (~var15.int_kb != 0 || var15.Jb != null) {
									var19 = new ta(var3, var4, var2, var10, var11, var12, var13, var15.int_kb, true, null);
									if (var23 == 0) {
										break label321;
									}
								}

								var19 = var15.a((byte) 90, var2, var10, var11, var4, var12, var13);
							}

							var9.a(var6, var5, var0, var14, 1, 1, (ha) var19, 0, var16, var17);
							if (var15.boolean_ib) {
								var1.markSolidOccupant(var15.h, 20850, var15.w, var5, var15.impenetrable, var2, var0);
							}

						} else {
							if (var15.Fb) {
								label309:
								{
									if (~var2 == -2) {
										var26 = var13;
										var13 = var12;
										var12 = var11;
										var11 = var10;
										var10 = var26;
										if (var23 == 0) {
											break label309;
										}
									}

									if (~var2 != -3) {
										if (~var2 != -4) {
											break label309;
										}

										var26 = var13;
										var13 = var10;
										var10 = var11;
										var11 = var12;
										var12 = var26;
										if (var23 == 0) {
											break label309;
										}
									}

									var26 = var13;
									var13 = var11;
									var11 = var26;
									var26 = var12;
									var12 = var10;
									var10 = var26;
								}
							}

							if (var4 == 4) {
								label225:
								{
									if (var15.int_kb == -1 && var15.Jb == null) {
										var19 = var15.a((byte) 124, 0, var10, var11, 4, var12, var13);
										if (var23 == 0) {
											break label225;
										}
									}

									var19 = new ta(var3, 4, 0, var10, var11, var12, var13, var15.int_kb, true, null);
								}

								var9.a(var6, var5, var0, var14, (ha) var19, gd.ints_h[var2], 512 * var2, 0, 0, var16, var17);
							} else if (~var4 == -6) {
								var26 = 16;
								var20 = var9.p(var6, var5, var0);
								if (~var20 != -1) {
									var26 = ub.a(-126, (var20 & 536868939) >> 14).Tb;
								}

								label232:
								{
									if (~var15.int_kb == 0 && var15.Jb == null) {
										var28 = var15.a((byte) -82, 0, var10, var11, 4, var12, var13);
										if (var23 == 0) {
											break label232;
										}
									}

									var28 = new ta(var3, 4, 0, var10, var11, var12, var13, var15.int_kb, true, null);
								}

								var9.a(var6, var5, var0, var14, (ha) var28, gd.ints_h[var2], 512 * var2, var26 * af.ints_g[var2], ec.ints_r[var2] * var26, var16, var17);
							} else if (~var4 == -7) {
								label241:
								{
									if (~var15.int_kb == 0 && var15.Jb == null) {
										var19 = var15.a((byte) 87, 0, var10, var11, 4, var12, var13);
										if (var23 == 0) {
											break label241;
										}
									}

									var19 = new ta(var3, 4, 0, var10, var11, var12, var13, var15.int_kb, true, null);
								}

								var9.a(var6, var5, var0, var14, (ha) var19, 256, var2, 0, 0, var16, var17);
							} else if (var4 == 7) {
								label322:
								{
									if (var15.int_kb != -1 || var15.Jb != null) {
										var19 = new ta(var3, 4, 0, var10, var11, var12, var13, var15.int_kb, true, null);
										if (var23 == 0) {
											break label322;
										}
									}

									var19 = var15.a((byte) 74, 0, var10, var11, 4, var12, var13);
								}

								var9.a(var6, var5, var0, var14, (ha) var19, 512, var2, 0, 0, var16, var17);
							} else if (var4 == 8) {
								label257:
								{
									if (~var15.int_kb == 0 && var15.Jb == null) {
										var19 = var15.a((byte) 107, 0, var10, var11, 4, var12, var13);
										if (var23 == 0) {
											break label257;
										}
									}

									var19 = new ta(var3, 4, 0, var10, var11, var12, var13, var15.int_kb, true, null);
								}

								var9.a(var6, var5, var0, var14, (ha) var19, 768, var2, 0, 0, var16, var17);
							}
						}
					}
				} else {
					label293:
					{
						if (~var15.int_kb == 0 && var15.Jb == null) {
							var19 = var15.a((byte) 122, var2, var10, var11, 10, var12, var13);
							if (var23 == 0) {
								break label293;
							}
						}

						var19 = new ta(var3, 10, var2, var10, var11, var12, var13, var15.int_kb, true, null);
					}

					if (var19 != null) {
						int var21;
						label323:
						{
							if (~var2 == -2 || var2 == 3) {
								var20 = var15.h;
								var21 = var15.w;
								if (var23 == 0) {
									break label323;
								}
							}

							var20 = var15.w;
							var21 = var15.h;
						}

						int var22 = 0;
						if (var4 == 11) {
							var22 += 256;
						}

						var9.a(var6, var5, var0, var14, var20, var21, (ha) var19, var22, var16, var17);
					}

					if (var15.boolean_ib) {
						var1.markSolidOccupant(var15.h, 20850, var15.w, var5, var15.impenetrable, var2, var0);
					}

				}
			}
		} catch (RuntimeException var24) {
			throw id.a(var24, "wa.L(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + (var9 != null ? "{...}" : "null") + ')');
		}
	}

	static boolean a (int var0, int var1, pb var2) {
		try {
			++zb;
			if (var1 != 512) {
				f(103);
			}

			byte[] var3 = var2.a(0, var0);
			if (var3 == null) {
				return false;
			} else {
				pc.a(80, var3);
				return true;
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "wa.C(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	final boolean c (boolean var1) {
		int var4 = client.int_tb;

		try {
			++bb;
			if (this.wb == null) {
				return true;
			} else {
				boolean var2 = true;
				int var3 = 0;
				if (var1) {
					rb = 57;
					if (var4 != 0) {
						if (!s.archiveFile7.a(0, (byte) 62, this.wb[var3])) {
							var2 = false;
						}

						++var3;
					}
				}

				for ( ; var3 < this.wb.length ; ++var3) {
					if (!s.archiveFile7.a(0, (byte) 62, this.wb[var3])) {
						var2 = false;
					}
				}

				return var2;
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "wa.B(" + var1 + ')');
		}
	}

	final kc g (int var1) {
		int var6 = client.int_tb;

		try {
			++eb;
			if (this.wb == null) {
				return null;
			} else {
				kc[] var2 = new kc[this.wb.length];
				if (var1 != 31811) {
					return null;
				} else {
					int var3 = 0;
					if (var6 != 0) {
						var2[var3] = kc.a(s.archiveFile7, this.wb[var3], 0);
						++var3;
					}

					while (var3 < this.wb.length) {
						var2[var3] = kc.a(s.archiveFile7, this.wb[var3], 0);
						++var3;
					}

					kc var4;
					label39:
					{
						if (var2.length != 1) {
							var4 = new kc(var2, var2.length);
							if (var6 == 0) {
								break label39;
							}
						}

						var4 = var2[0];
					}

					int var5 = 0;
					if (var6 != 0 || var5 < 6) {
						while (~this.nb[var5] != -1) {
							var4.a(this.nb[var5], this.fb[var5]);
							++var5;
							if (var5 >= 6) {
								break;
							}
						}
					}

					return var4;
				}
			}
		} catch (RuntimeException var7) {
			throw id.a(var7, "wa.G(" + var1 + ')');
		}
	}

	final boolean h (int var1) {
		int var4 = client.int_tb;

		try {
			++int_db;
			boolean var2 = true;
			int var3 = var1;
			if (var4 == 0 && ~var1 <= -6) {
				return var2;
			} else {
				do {
					if (this.Z[var3] != -1 && !s.archiveFile7.a(0, (byte) 62, this.Z[var3])) {
						var2 = false;
					}

					++var3;
				} while (~var3 > -6);

				return var2;
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "wa.E(" + var1 + ')');
		}
	}

	private void a (int var1, id var2, int var3) {
		int var6 = client.int_tb;

		try {
			++int_pb;
			if (var3 > -105) {
				rd_ub = null;
			}

			if (~var1 != -2) {
				if (var1 == 2) {
					int var4 = var2.readUnsignedByte((byte) 116);
					this.wb = new int[var4];
					int var5 = 0;
					if (var6 == 0 && var5 >= var4) {
						return;
					}

					do {
						this.wb[var5] = var2.readUnsignedLEShort(255);
						++var5;
					} while (var5 < var4);

					return;
				}

				if (var1 == 3) {
					this.boolean_tb = true;
					return;
				}

				if (var1 >= 40 && var1 < 50) {
					this.nb[var1 - 40] = (short) var2.readUnsignedLEShort(255);
					return;
				}

				if (var1 >= 50 && var1 < 60) {
					this.fb[-50 + var1] = (short) var2.readUnsignedLEShort(255);
					return;
				}

				if (~var1 <= -61 && ~var1 > -71) {
					this.Z[var1 - 60] = var2.readUnsignedLEShort(255);
				}
			} else {
				this.ab = var2.readUnsignedByte((byte) 116);
			}

		} catch (RuntimeException var7) {
			throw id.a(var7, "wa.K(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
		}
	}

	final kc i (int var1) {
		int var8 = client.int_tb;

		try {
			++sb;
			kc[] var2 = new kc[5];
			int var3 = 0;
			int var4 = 0;
			if (var8 != 0) {
				if (~this.Z[var4] != 0) {
					var2[var3++] = kc.a(s.archiveFile7, this.Z[var4], 0);
				}

				++var4;
			}

			for ( ; ~var4 > -6 ; ++var4) {
				if (~this.Z[var4] != 0) {
					var2[var3++] = kc.a(s.archiveFile7, this.Z[var4], 0);
				}
			}

			int var5 = -101 % ((var1 - -30) / 37);
			kc var6 = new kc(var2, var3);
			int var7 = 0;
			if (var8 != 0 || ~var7 > -7) {
				while (this.nb[var7] != 0) {
					var6.a(this.nb[var7], this.fb[var7]);
					++var7;
					if (~var7 <= -7) {
						break;
					}
				}
			}

			return var6;
		} catch (RuntimeException var9) {
			throw id.a(var9, "wa.J(" + var1 + ')');
		}
	}

	final void a (int var1, id var2) {
		int var4 = client.int_tb;

		try {
			++hb;
			if (var1 != -7) {
				this.boolean_tb = false;
			}

			do {
				int var3 = var2.readUnsignedByte((byte) 116);
				if (var3 == 0) {
					break;
				}

				this.a(var3, var2, var1 + -105);
			} while (var4 == 0);

		} catch (RuntimeException var5) {
			throw id.a(var5, "wa.H(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}
}
