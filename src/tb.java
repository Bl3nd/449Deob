import java.awt.Graphics;

final class tb extends jb {
	static int Z;
	static int ab;
	static int fb;
	static int int_hb;
	static int ib;
	static rd rd_kb;
	static int lb;
	static rd percentageSymbol = md.a((String) "(U", (byte) 123);
	static int ob;
	static rd ub = md.a((String) ")1", (byte) 121);
	static int int_wb;
	static rd examine2;
	static dd Hb;
	static int Lb;
	static boolean[] Pb;
	static int Qb;
	static int Rb;
	static int Sb;
	static rd Vb;
	static dd Wb;
	static int[] Xb;
	static int[][][] Yb;
	static int[] Zb;
	static he[] mapdots;
	static pb archiveFile2;
	static rd loadedInputHandler2;
	private static rd examine = md.a((String) "Examine", (byte) 121);
	private static rd loadedInputHandler;

	static {
		examine2 = examine;
		rd_kb = md.a("", (byte) 116);
		Pb = new boolean[5];
		Hb = new dd(64);
		Vb = md.a("Hier klicken)1 um fortzufahren)3)3)3", (byte) 124);
		Yb = new int[4][105][105];
		Xb = new int[]{16, 32, 64, 128};
		Wb = new dd(64);
		loadedInputHandler = md.a("Loaded input handler", (byte) 121);
		loadedInputHandler2 = loadedInputHandler;
	}

	int int_eb;
	boolean jb;
	int int_pb = -1;
	rd sb;
	int vb;
	int xb;
	boolean yb;
	int zb;
	int Bb;
	int Cb;
	boolean Eb;
	int[] Fb;
	rd[] Gb;
	int Ib;
	boolean Kb;
	int Mb;
	int Ob;
	int Tb;
	int Ub;
	private int bb = 128;
	private short[] cb;
	private int[] db;
	private int gb;
	private int nb = -1;
	private int qb;
	private short[] shorts_rb;
	private int Ab;
	private int Jb;
	private int[] Nb;

	public tb () {
		this.sb = kd.rd_m;
		this.jb = true;
		this.int_eb = -1;
		this.Eb = true;
		this.xb = -1;
		this.qb = -1;
		this.gb = 0;
		this.Gb = new rd[5];
		this.yb = true;
		this.Bb = -1;
		this.vb = -1;
		this.Jb = 128;
		this.Cb = -1;
		this.Ab = 0;
		this.Ib = 32;
		this.Ob = -1;
		this.Mb = 1;
		this.Kb = false;
		this.Ub = -1;
		this.Tb = -1;
	}

	static void a (gb class_gb, gb class_gb2, int unused) {
		try {
			od.jd_sb.a(-1926);
			if (lc.currentGameState == 0 || lc.currentGameState == 5) {
				byte b = 20;
				int i = 82 - b;
				class_gb2.c(le.runescapeIsLoading_pleaseWait2, 180, -b + 74, 0xffffff);
				ic.a(28, i, 304, 34, 0x8c1111);
				ic.a(29, i + 1, 302, 32, 0);
				ic.c(30, 2 + i, rd.percentageBar * 3, 30, 9179409);
				ic.c(30 + 3 * rd.percentageBar, 2 + i, 300 + -(rd.percentageBar * 3), 30, 0);
				class_gb2.c(ff.loadingText, 180, -b + 105, 16777215);
			}

			int var9;
			if (lc.currentGameState == 20) {
				rb.A.a(0, 0);
				byte b = 40;
				class_gb2.b(ff.z, 180, b, 16776960, true);
				var9 = b + 15;
				class_gb2.b(ff.rd_i, 180, var9, 16776960, true);
				var9 += 15;
				class_gb2.b(ff.rd_m, 180, var9, 16776960, true);
				var9 += 15;
				var9 += 10;
				class_gb2.c(pc.a((byte) 126, new rd[]{eb.username_2, ff.rd_f}), 90, var9, 16777215, true);
				var9 += 15;
				class_gb2.c(pc.a((byte) 126, new rd[]{pb.l, ff.rd_w.c((byte) 57)}), 92, var9, 16777215, true);
				var9 += 15;
			}

			++int_wb;
			if (lc.currentGameState == 10) {
				rb.A.a(0, 0);
				byte var10;
				short var11;
				if (h.int_c == 0) {
					byte b = 80;
					class_gb2.b(l.welcomeToRunescape2, 180, b, 16776960, true);
					var9 = b + 30;
					var10 = 100;
					byte b1 = 120;
					dc.oa_d.a(-73 + var10, -20 + b1);
					class_gb2.a(pd.newUser2, -73 + var10, b1 - 20, 144, 40, 16777215, true, 1, 1, 0);
					var11 = 260;
					dc.oa_d.a(var11 - 73, b1 - 20);
					class_gb2.a(ge.rd_bb, -73 + var11, b1 + -20, 144, 40, 16777215, true, 1, 1, 0);
				} else if (h.int_c == 2) {
					byte b = 40;
					var10 = 100;
					class_gb2.b(ff.z, 180, b, 16776960, true);
					var9 = b + 15;
					class_gb2.b(ff.rd_i, 180, var9, 16776960, true);
					short s = 150;
					var9 += 15;
					class_gb2.b(ff.rd_m, 180, var9, 16776960, true);
					var9 += 15;
					var9 += 10;
					class_gb2.c(pc.a((byte) 127, new rd[]{
							eb.username_2,
							ff.rd_f,
							fc.int_k == 0 & ~(ce.y % 40) > -21 ? ee.rd_v : ff.rd_t
					}), 90, var9, 16777215, true);
					var9 += 15;
					class_gb2.c(pc.a((byte) 125, new rd[]{
							pb.l,
							ff.rd_w.c((byte) 57),
							!(~fc.int_k == -2 & ce.y % 40 < 20) ? ff.rd_t : ee.rd_v
					}), 92, var9, 16777215, true);
					dc.oa_d.a(-73 + var10, -20 + s);
					var9 += 15;
					class_gb2.b(te.ub, var10, s + 5, 16777215, true);
					var11 = 260;
					dc.oa_d.a(-73 + var11, -20 + s);
					class_gb2.b(ge.rd_db, var11, 5 + s, 16777215, true);
				} else if (h.int_c == 3) {
					class_gb2.b(se.rd_b, 180, 40, 16776960, true);
					var11 = 180;
					short s = 150;
					byte b = 65;
					class_gb2.b(gf.rd_c, 180, b, 16777215, true);
					var9 = b + 15;
					class_gb2.b(vc.J, 180, var9, 16777215, true);
					var9 += 15;
					class_gb2.b(se.w, 180, var9, 16777215, true);
					var9 += 15;
					class_gb2.b(rb.g, 180, var9, 16777215, true);
					var9 += 15;
					dc.oa_d.a(-73 + var11, -20 + s);
					class_gb2.b(ge.rd_db, var11, s + 5, 16777215, true);
				}
			}

			wb.f(0);

			try {
				Graphics canvasGraphics = rd.canvas.getGraphics();
				od.jd_sb.a(0, 202, 171, canvasGraphics);
				ke.wb.a(0, 0, 0, canvasGraphics);
				te.Vb.a(0, 637, 0, canvasGraphics);
				if (ee.boolean_o) {
					ee.boolean_o = false;
					l.v.a(0, 128, 0, canvasGraphics);
					ja.jd_q.a(0, 202, 371, canvasGraphics);
					kb.j.a(0, 0, 265, canvasGraphics);
					dc.jd_k.a(0, 562, 265, canvasGraphics);
					sd.L.a(0, 128, 171, canvasGraphics);
					s.db.a(0, 562, 171, canvasGraphics);
				}
			} catch (Exception var7) {
				rd.canvas.repaint();
			}
		} catch (RuntimeException var8) {
			throw id.a(var8, "tb.K(" + (class_gb != null ? "{...}" : "null") + ',' + (class_gb2 != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}

	public static void g (int var0) {
		try {
			rd_kb = null;
			Hb = null;
			percentageSymbol = null;
			archiveFile2 = null;
			examine = null;
			ub = null;
			Vb = null;
			loadedInputHandler = null;
			examine2 = null;
			loadedInputHandler2 = null;
			Xb = null;
			Yb = null;
			mapdots = null;
			Zb = null;
			Wb = null;
			if (var0 != 107) {
				a(null, null, -23);
			}

			Pb = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "tb.A(" + var0 + ')');
		}
	}

	static oa a (byte var0, pb var1, int var2) {
		try {
			++Lb;
			if (var0 <= 4) {
				examine = null;
			}

			return !wa.a(var2, 512, var1) ? null : pa.a(-19457);
		} catch (RuntimeException var4) {
			throw id.a(var4, "tb.C(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}

	static void a (byte[] buffer, int x, int y, byte unused, nc[] ncs, int i2, int i3) {
		try {
			for (int plane = 0 ; plane < 4 ; plane++) {
				for (int mapRegionX = 0 ; mapRegionX < 64 ; mapRegionX++) {
					for (int mapRegionY = 0 ; mapRegionY < 64 ; mapRegionY++) {
						if (x + mapRegionX > 0 && mapRegionX + x < 103 && y + mapRegionY > 0 && mapRegionY + y < 103) {
							ncs[plane].adjacency[mapRegionX + x][y + mapRegionY] = od.a(ncs[plane].adjacency[mapRegionX + x][y + mapRegionY], -16777217);
						}
					}
				}
			}
			++lb;
			id class_id = new id(buffer);

			for (int plane = 0 ; plane < 4 ; plane++) {
				for (int mapRegionX = 0 ; mapRegionX < 64 ; mapRegionX++) {
					for (int mapRegionY = 0 ; mapRegionY < 64 ; mapRegionY++) {
						td.a(0, mapRegionX + x, i3, class_id, i2, 49, y + mapRegionY, plane);
					}
				}
			}
		} catch (RuntimeException var13) {
			throw id.a(var13, "tb.E(" + (buffer != null ? "{...}" : "null") + ',' + x + ',' + y + ',' + unused + ',' + (ncs != null ? "{...}" : "null") + ',' + i2 + ',' + i3 + ')');
		}
	}

	final tb f (int var1) {
		try {
			int var2;
			label25:
			{
				var2 = var1;
				if (this.qb == -1) {
					if (this.nb == -1) {
						break label25;
					}

					var2 = ta.Pb[this.nb];
					if (client.int_tb == 0) {
						break label25;
					}
				}

				var2 = o.a((byte) 20, this.qb);
			}

			++int_hb;
			return ~var2 <= -1 && var2 < this.Fb.length && this.Fb[var2] != -1 ? hb.a(this.Fb[var2], (byte) 48) : null;
		} catch (RuntimeException var3) {
			throw id.a(var3, "tb.D(" + var1 + ')');
		}
	}

	final void a (int var1, id var2) {
		int var4 = client.int_tb;

		try {
			++Z;
			if (var1 == 0) {
				do {
					int var3 = var2.readUnsignedByte((byte) 116);
					if (var3 == 0) {
						break;
					}

					this.a(var1 ^ 102, var2, var3);
				} while (var4 == 0);

			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "tb.J(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	final ue a (int var1, e var2, int var3, byte var4, e var5) {
		int var13 = client.int_tb;

		try {
			++ib;
			if (this.Fb != null) {
				tb var15 = this.f(-1);
				return var15 == null ? null : var15.a(var1, var2, var3, (byte) 24, var5);
			} else if (var4 != 24) {
				return null;
			} else {
				ue var6 = (ue) gf.dd_g.a((byte) -122, (long) this.zb);
				if (var6 == null) {
					boolean var7 = false;
					int var8 = 0;
					if (var13 != 0 || ~var8 > ~this.db.length) {
						do {
							if (!tc.archiveFile7.a(0, (byte) 62, this.db[var8])) {
								var7 = true;
							}

							++var8;
						} while (~var8 > ~this.db.length);
					}

					if (var7) {
						return null;
					}

					kc[] var10 = new kc[this.db.length];
					int var11 = 0;
					if (var13 != 0 || this.db.length > var11) {
						do {
							var10[var11] = kc.a(tc.archiveFile7, this.db[var11], 0);
							++var11;
						} while (this.db.length > var11);
					}

					kc var9;
					label96:
					{
						if (var10.length != 1) {
							var9 = new kc(var10, var10.length);
							if (var13 == 0) {
								break label96;
							}
						}

						var9 = var10[0];
					}

					if (this.shorts_rb != null) {
						int var12 = 0;
						if (var13 != 0 || this.shorts_rb.length > var12) {
							do {
								var9.a(this.shorts_rb[var12], this.cb[var12]);
								++var12;
							} while (this.shorts_rb.length > var12);
						}
					}

					var6 = var9.a(this.gb + 64, 850 + this.Ab, -30, -50, -30);
					gf.dd_g.a(-116, var6, (long) this.zb);
				}

				ue var16;
				label140:
				{
					if (var2 == null || var5 == null) {
						if (var2 != null) {
							var16 = var2.a(var6, var3, (byte) -43);
							if (var13 == 0) {
								break label140;
							}
						}

						if (var5 != null) {
							var16 = var5.a(var6, var1, (byte) -43);
							if (var13 == 0) {
								break label140;
							}
						}

						var16 = var6.e(true);
						if (var13 == 0) {
							break label140;
						}
					}

					var16 = var2.a(var1, var3, var5, var4 + -33, var6);
				}

				if (this.Jb != 128 || this.bb != 128) {
					var16.a(this.Jb, this.bb, this.Jb);
				}

				return var16;
			}
		} catch (RuntimeException var14) {
			throw id.a(var14, "tb.I(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + var4 + ',' + (var5 != null ? "{...}" : "null") + ')');
		}
	}

	private void a (int var1, id var2, int var3) {
		int var6 = client.int_tb;

		try {
			label212:
			{
				++Sb;
				int var4;
				int var5;
				if (~var3 == -2) {
					var4 = var2.readUnsignedByte((byte) 116);
					this.db = new int[var4];
					var5 = 0;
					if (var6 != 0 || ~var4 < ~var5) {
						do {
							this.db[var5] = var2.readUnsignedLEShort(255);
							++var5;
						} while (~var4 < ~var5);
					}

					if (var6 == 0) {
						break label212;
					}
				}

				if (~var3 != -3) {
					if (var3 == 12) {
						this.Mb = var2.readUnsignedByte((byte) 116);
						if (var6 == 0) {
							break label212;
						}
					}

					if (~var3 == -14) {
						this.int_pb = var2.readUnsignedLEShort(255);
						if (var6 == 0) {
							break label212;
						}
					}

					if (var3 == 14) {
						this.Bb = var2.readUnsignedLEShort(var1 + 153);
						if (var6 == 0) {
							break label212;
						}
					}

					if (~var3 == -16) {
						this.Ub = var2.readUnsignedLEShort(var1 + 153);
						if (var6 == 0) {
							break label212;
						}
					}

					if (var3 != 16) {
						if (var3 == 17) {
							this.Bb = var2.readUnsignedLEShort(var1 + 153);
							this.xb = var2.readUnsignedLEShort(255);
							this.int_eb = var2.readUnsignedLEShort(255);
							this.Ob = var2.readUnsignedLEShort(255);
							if (var6 == 0) {
								break label212;
							}
						}

						if (~var3 <= -31 && var3 < 35) {
							this.Gb[var3 + -30] = var2.readRSString(var1 + -103);
							if (!this.Gb[var3 + -30].b(eb.hidden2, true)) {
								break label212;
							}

							this.Gb[var3 - 30] = null;
							if (var6 == 0) {
								break label212;
							}
						}

						if (~var3 != -41) {
							if (var3 == 60) {
								var4 = var2.readUnsignedByte((byte) 116);
								this.Nb = new int[var4];
								var5 = 0;
								if (var6 != 0 || var5 < var4) {
									do {
										this.Nb[var5] = var2.readUnsignedLEShort(255);
										++var5;
									} while (var5 < var4);
								}

								if (var6 == 0) {
									break label212;
								}
							}

							if (var3 == 93) {
								this.yb = false;
								if (var6 == 0) {
									break label212;
								}
							}

							if (~var3 != -96) {
								if (~var3 == -98) {
									this.Jb = var2.readUnsignedLEShort(255);
									if (var6 == 0) {
										break label212;
									}
								}

								if (~var3 == -99) {
									this.bb = var2.readUnsignedLEShort(255);
									if (var6 == 0) {
										break label212;
									}
								}

								if (~var3 != -100) {
									if (var3 != 100) {
										if (var3 != 101) {
											if (var3 == 102) {
												this.Cb = var2.readUnsignedLEShort(var1 ^ 153);
												if (var6 == 0) {
													break label212;
												}
											}

											if (~var3 == -104) {
												this.Ib = var2.readUnsignedLEShort(255);
												if (var6 == 0) {
													break label212;
												}
											}

											if (var3 != 106) {
												if (var3 == 107) {
													this.Eb = false;
													if (var6 == 0) {
														break label212;
													}
												}

												if (var3 != 109) {
													break label212;
												}

												this.jb = false;
												if (var6 == 0) {
													break label212;
												}
											}

											this.qb = var2.readUnsignedLEShort(255);
											if (~this.qb == -65536) {
												this.qb = -1;
											}

											this.nb = var2.readUnsignedLEShort(255);
											if (~this.nb == -65536) {
												this.nb = -1;
											}

											var4 = var2.readUnsignedByte((byte) 116);
											this.Fb = new int[1 + var4];
											var5 = 0;
											if (var6 != 0 || var4 >= var5) {
												do {
													this.Fb[var5] = var2.readUnsignedLEShort(255);
													if (~this.Fb[var5] == -65536) {
														this.Fb[var5] = -1;
													}

													++var5;
												} while (var4 >= var5);
											}

											if (var6 == 0) {
												break label212;
											}
										}

										this.Ab = var2.readByte(true) * 5;
										if (var6 == 0) {
											break label212;
										}
									}

									this.gb = var2.readByte(true);
									if (var6 == 0) {
										break label212;
									}
								}

								this.Kb = true;
								if (var6 == 0) {
									break label212;
								}
							}

							this.Tb = var2.readUnsignedLEShort(255);
							if (var6 == 0) {
								break label212;
							}
						}

						var4 = var2.readUnsignedByte((byte) 116);
						this.cb = new short[var4];
						this.shorts_rb = new short[var4];
						var5 = 0;
						if (var6 != 0 || ~var5 > ~var4) {
							do {
								this.shorts_rb[var5] = (short) var2.readUnsignedLEShort(255);
								this.cb[var5] = (short) var2.readUnsignedLEShort(255);
								++var5;
							} while (~var5 > ~var4);
						}

						if (var6 == 0) {
							break label212;
						}
					}

					this.vb = var2.readUnsignedLEShort(255);
					if (var6 == 0) {
						break label212;
					}
				}

				this.sb = var2.readRSString(-1);
			}

			if (var1 != 102) {
				this.i(15);
			}
		} catch (RuntimeException var7) {
			throw id.a(var7, "tb.H(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
		}
	}

	final void c (byte var1) {
		try {
			++Rb;
			int var2 = 88 / ((80 - var1) / 46);
		} catch (RuntimeException var3) {
			throw id.a(var3, "tb.G(" + var1 + ')');
		}
	}

	final kc h (int var1) {
		int var8 = client.int_tb;

		try {
			++ab;
			if (this.Fb != null) {
				tb var10 = this.f(-1);
				return var10 == null ? null : var10.h(0);
			} else if (this.Nb == null) {
				return null;
			} else {
				boolean var2 = false;
				int var3 = 0;
				if (var8 != 0) {
					if (!tc.archiveFile7.a(0, (byte) 62, this.Nb[var3])) {
						var2 = true;
					}

					++var3;
				}

				for ( ; this.Nb.length > var3 ; ++var3) {
					if (!tc.archiveFile7.a(0, (byte) 62, this.Nb[var3])) {
						var2 = true;
					}
				}

				if (var2) {
					return null;
				} else {
					kc[] var4 = new kc[this.Nb.length];
					int var5 = var1;
					if (var8 != 0) {
						var4[var1] = kc.a(tc.archiveFile7, this.Nb[var1], 0);
						var5 = var1 + 1;
					}

					while (this.Nb.length > var5) {
						var4[var5] = kc.a(tc.archiveFile7, this.Nb[var5], 0);
						++var5;
					}

					kc var6;
					label52:
					{
						if (~var4.length == -2) {
							var6 = var4[0];
							if (var8 == 0) {
								break label52;
							}
						}

						var6 = new kc(var4, var4.length);
					}

					if (this.shorts_rb != null) {
						int var7 = 0;
						if (var8 != 0 || ~this.shorts_rb.length < ~var7) {
							do {
								var6.a(this.shorts_rb[var7], this.cb[var7]);
								++var7;
							} while (~this.shorts_rb.length < ~var7);
						}
					}

					return var6;
				}
			}
		} catch (RuntimeException var9) {
			throw id.a(var9, "tb.B(" + var1 + ')');
		}
	}

	final boolean i (int var1) {
		try {
			++fb;
			if (var1 != 3061) {
				this.int_eb = -4;
			}

			if (this.Fb == null) {
				return true;
			} else {
				int var2 = -1;
				if (this.qb == -1) {
					if (this.nb == -1) {
						return ~var2 <= -1 && var2 < this.Fb.length && this.Fb[var2] != -1;
					}

					var2 = ta.Pb[this.nb];
					if (client.int_tb == 0) {
						return ~var2 <= -1 && var2 < this.Fb.length && this.Fb[var2] != -1;
					}
				}

				var2 = o.a((byte) 49, this.qb);
				return ~var2 <= -1 && var2 < this.Fb.length && this.Fb[var2] != -1;
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "tb.F(" + var1 + ')');
		}
	}
}
