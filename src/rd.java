import java.awt.Canvas;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

final class rd implements cb {
	static int a;
	static int c;
	static he overlay_multiway;
	static int e;
	static int[] ints_f;
	static int g;
	static int h;
	static int int_i;
	static int j;
	static int k;
	static int l;
	static int m;
	static int int_n;
	static int o;
	static int p;
	static int q;
	static int int_r;
	static int s;
	static int t;
	static int u;
	static int v;
	static int w;
	static int x;
	static int y;
	static int z;
	static int A;
	static int D;
	static int E;
	static pc F = new pc(32);
	static int G;
	static int H;
	static int percentageBar = 10;
	static int K;
	static int L;
	static int M;
	static int O;
	static int P;
	static int Q;
	static int S;
	static Canvas canvas;
	static int U;
	static int V;
	static int W;
	static int X;
	static int Y;
	static int Z;
	static int ab;
	static int bb;
	// $FF: synthetic field
	static Class db;
	static rd rd_b = md.a((String) "Verbindung mit Update)2Server)3)3)3", (byte) 116);
	static rd C = md.a((String) "Schlie-8en", (byte) 124);
	static rd cb = md.a((String) "::errortest", (byte) 118);
	int stringPointer;
	byte[] stringBuffer;
	private int I;
	private boolean N = true;

	public static void a (int var0) {
		try {
			if (var0 != 0) {
				a(-31);
			}

			ints_f = null;
			rd_b = null;
			F = null;
			canvas = null;
			overlay_multiway = null;
			cb = null;
			C = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "rd.DA(" + var0 + ')');
		}
	}

	static void a (boolean var0) {
		int var26 = client.int_tb;

		try {
			++u;
			int var1;
			int var2;
			int var3;
			int var4;
			int var5;
			int var6;
			if (~jd.currentIncomingPacket == -191) {
				var1 = lc.readStream.readUnsignedByte((byte) 116);
				var2 = ge.X - -(7 & var1 >> 4);
				var3 = ce.A - -(var1 & 7);
				var4 = lc.readStream.readUnsignedLEShort(255);
				var5 = lc.readStream.readUnsignedByte((byte) 116);
				var6 = lc.readStream.readUnsignedLEShort(255);
				if (~var2 <= -1 && var3 >= 0 && ~var2 > -105 && var3 < 104) {
					var3 = 64 + var3 * 128;
					var2 = 64 + var2 * 128;
					te var35 = new te(var4, ce.plane, var2, var3, vc.a(ce.plane, var2, var3, (byte) 37) - var5, var6, ce.y);
					ib.md_a.a(var35, (byte) 97);
				}

			} else {
				int var7;
				if (~jd.currentIncomingPacket == -208) {
					var1 = lc.readStream.i(0);
					var2 = ge.X - -((var1 & 115) >> 4);
					var3 = (7 & var1) + ce.A;
					var4 = lc.readStream.i(0);
					var5 = var4 >> 2;
					var6 = 3 & var4;
					var7 = tc.E[var5];
					if (~var2 <= -1 && var3 >= 0 && var2 < 104 && var3 < 104) {
						mb.a(var3, var2, var6, -1, 0, -120, ce.plane, var7, -1, var5);
					}

				} else if (jd.currentIncomingPacket == 80) {
					var1 = lc.readStream.readUnsignedByte((byte) 116);
					var2 = ge.X - -(var1 >> 4 & 7);
					var3 = (var1 & 7) + ce.A;
					var4 = lc.readStream.readUnsignedLEShort(255);
					var5 = lc.readStream.readUnsignedLEShort(255);
					var6 = lc.readStream.readUnsignedLEShort(255);
					if (~var2 <= -1 && var3 >= 0 && ~var2 > -105 && var3 < 104) {
						md var34 = lc.s[ce.plane][var2][var3];
						if (var34 != null) {
							od var36 = (od) var34.c((byte) 98);
							if (var26 != 0 || var36 != null) {
								do {
									if (var36.xb == (var4 & 32767) && ~var5 == ~var36.Gb) {
										var36.Gb = var6;
										if (var26 == 0) {
											break;
										}
									}

									var36 = (od) var34.a((byte) -68);
								} while (var36 != null);
							}

							ec.a(var2, 13, var3);
						}
					}

				} else {
					int var8;
					int var9;
					int var10;
					int var11;
					int var12;
					int var14;
					if (jd.currentIncomingPacket == 152) {
						var1 = lc.readStream.i(0);
						var2 = var1 >> 2;
						var4 = tc.E[var2];
						var5 = lc.readStream.readUnsignedByteS(255);
						var6 = ((var5 & 112) >> 4) + ge.X;
						var3 = 3 & var1;
						var7 = (var5 & 7) + ce.A;
						var8 = lc.readStream.readUnsignedLEShort(255);
						if (var6 >= 0 && ~var7 <= -1 && ~var6 > -104 && ~var7 > -104) {
							var9 = tb.Yb[ce.plane][var6][var7];
							var10 = tb.Yb[ce.plane][var6 + 1][var7];
							var11 = tb.Yb[ce.plane][1 + var6][1 + var7];
							var12 = tb.Yb[ce.plane][var6][1 + var7];
							if (~var4 == -1) {
								t var37 = pc.o.n(ce.plane, var6, var7);
								if (var37 != null) {
									label235:
									{
										var14 = 32767 & var37.w >> 14;
										if (~var2 != -3) {
											var37.c = new ta(var14, var2, var3, var9, var10, var11, var12, var8, false, var37.c);
											if (var26 == 0) {
												break label235;
											}
										}

										var37.c = new ta(var14, 2, 4 + var3, var9, var10, var11, var12, var8, false, var37.c);
										var37.u = new ta(var14, 2, 3 & var3 - -1, var9, var10, var11, var12, var8, false, var37.u);
									}
								}
							}

							if (var4 == 1) {
								bc var38 = pc.o.a(ce.plane, var6, var7);
								if (var38 != null) {
									var38.m = new ta((536862566 & var38.int_b) >> 14, 4, 0, var9, var10, var11, var12, var8, false, var38.m);
								}
							}

							if (~var4 == -3) {
								if (~var2 == -12) {
									var2 = 10;
								}

								la var39 = pc.o.l(ce.plane, var6, var7);
								if (var39 != null) {
									var39.y = new ta(32767 & var39.k >> 14, var2, var3, var9, var10, var11, var12, var8, false, var39.y);
								}
							}

							if (var4 == 3) {
								ra var41 = pc.o.b(ce.plane, var6, var7);
								if (var41 != null) {
									var41.n = new ta((var41.p & 536856932) >> 14, 22, var3, var9, var10, var11, var12, var8, false, var41.n);
								}
							}
						}

					} else {
						if (var0) {
							a(true);
						}

						if (jd.currentIncomingPacket == 91) {
							var1 = lc.readStream.readUnsignedByte((byte) 116);
							var3 = ce.A - -(7 & var1);
							var2 = (7 & var1 >> 4) + ge.X;
							var4 = lc.readStream.readUnsignedLEShort(255);
							var5 = lc.readStream.readUnsignedByte((byte) 116);
							var7 = var5 & 7;
							var6 = (var5 & 247) >> 4;
							var8 = lc.readStream.readUnsignedByte((byte) 116);
							if (~var2 <= -1 && var3 >= 0 && ~var2 > -105 && ~var3 > -105) {
								var9 = 1 + var6;
								if (~(var2 + -var9) >= ~af.td_p.xc[0] && ~af.td_p.xc[0] >= ~(var2 + var9) && ~af.td_p.Hc[0] <= ~(var3 - var9) && var3 + var9 >= af.td_p.Hc[0] && md.b != 0 && ~var7 < -1 && ~me.lb > -51) {
									kd.B[me.lb] = var4;
									wc.o[me.lb] = var7;
									ba.ints_r[me.lb] = var8;
									eb.ias_c[me.lb] = null;
									gd.ints_n[me.lb] = (var3 << 8) + (var2 << 16) + var6;
									++me.lb;
								}
							}
						}

						if (jd.currentIncomingPacket == 17) {
							var1 = lc.readStream.readUnsignedByteS(255);
							var3 = var1 & 3;
							var2 = var1 >> 2;
							var4 = tc.E[var2];
							var5 = lc.readStream.readUnsignedLEShort(255);
							var6 = lc.readStream.c((byte) 102);
							var8 = (var6 & 7) + ce.A;
							var7 = ge.X - -((113 & var6) >> 4);
							if (var7 >= 0 && ~var8 <= -1 && var7 < 104 && ~var8 > -105) {
								mb.a(var8, var7, var3, -1, 0, -123, ce.plane, var4, var5, var2);
							}

						} else {
							int var13;
							if (jd.currentIncomingPacket == 65) {
								var1 = lc.readStream.readUnsignedByte((byte) 116);
								var2 = ge.X + (var1 >> 4 & 7);
								var3 = (7 & var1) + ce.A;
								var4 = var2 - -lc.readStream.readByte(true);
								var5 = lc.readStream.readByte(true) + var3;
								var6 = lc.readStream.readShort(1331464976);
								var7 = lc.readStream.readUnsignedLEShort(255);
								var8 = lc.readStream.readUnsignedByte((byte) 116) * 4;
								var9 = 4 * lc.readStream.readUnsignedByte((byte) 116);
								var10 = lc.readStream.readUnsignedLEShort(255);
								var11 = lc.readStream.readUnsignedLEShort(255);
								var12 = lc.readStream.readUnsignedByte((byte) 116);
								var13 = lc.readStream.readUnsignedByte((byte) 116);
								if (var2 >= 0 && ~var3 <= -1 && ~var2 > -105 && var3 < 104 && ~var4 <= -1 && var5 >= 0 && ~var4 > -105 && ~var5 > -105 && var7 != '\uffff') {
									var5 = var5 * 128 - -64;
									var4 = 128 * var4 - -64;
									var3 = 64 + 128 * var3;
									var2 = var2 * 128 - -64;
									ka var40 = new ka(var7, ce.plane, var2, var3, vc
											.a(ce.plane, var2, var3, (byte) 37) - var8, var10 + ce.y, ce.y + var11, var12, var13, var6, var9);
									var40.a(vc.a(ce.plane, var4, var5, (byte) 37) - var9, var5, var4, (byte) -3, var10 - -ce.y);
									jc.J.a(var40, (byte) 86);
								}

							} else {
								od var32;
								if (~jd.currentIncomingPacket == -40) {
									var1 = lc.readStream.c((byte) 110);
									var2 = ((119 & var1) >> 4) + ge.X;
									var3 = ce.A - -(7 & var1);
									var4 = lc.readStream.readUnsignedLEShort(255);
									var5 = lc.readStream.readUnsignedLEShortA((byte) 112);
									if (~var2 <= -1 && ~var3 <= -1 && var2 < 104 && ~var3 > -105) {
										var32 = new od();
										var32.Gb = var4;
										var32.xb = var5;
										if (lc.s[ce.plane][var2][var3] == null) {
											lc.s[ce.plane][var2][var3] = new md();
										}

										lc.s[ce.plane][var2][var3].a(var32, (byte) 106);
										ec.a(var2, -128, var3);
									}

								} else if (jd.currentIncomingPacket == 8) {
									var1 = lc.readStream.readUnsignedLEShort(255);
									var2 = lc.readStream.readUnsignedLEShort(255);
									var3 = lc.readStream.i(0);
									var4 = ((var3 & 127) >> 4) + ge.X;
									var5 = (var3 & 7) + ce.A;
									var6 = lc.readStream.readUnsignedShort((byte) 85);
									if (var4 >= 0 && ~var5 <= -1 && ~var4 > -105 && ~var5 > -105 && var1 != lc.n) {
										od var33 = new od();
										var33.Gb = var6;
										var33.xb = var2;
										if (lc.s[ce.plane][var4][var5] == null) {
											lc.s[ce.plane][var4][var5] = new md();
										}

										lc.s[ce.plane][var4][var5].a(var33, (byte) -124);
										ec.a(var4, -128, var5);
									}

								} else {
									if (jd.currentIncomingPacket == 178) {
										byte var15;
										td var16;
										byte var28;
										byte var29;
										byte var30;
										label279:
										{
											var28 = lc.readStream.h(-121);
											var2 = lc.readStream.readUnsignedShort((byte) 76);
											var3 = lc.readStream.readUnsignedLEShortA((byte) 114);
											var4 = lc.readStream.f(false);
											var29 = lc.readStream.e(-121);
											var30 = lc.readStream.e(-127);
											var7 = lc.readStream.readUnsignedShort((byte) 74);
											var8 = lc.readStream.readUnsignedByteS(255);
											var9 = var8 >> 2;
											var10 = 3 & var8;
											var11 = tc.E[var9];
											var12 = lc.readStream.readUnsignedByteS(255);
											var13 = ge.X - -((var12 & 119) >> 4);
											var14 = (7 & var12) + ce.A;
											var15 = lc.readStream.h(false);
											if (lc.n == var4) {
												var16 = af.td_p;
												if (var26 == 0) {
													break label279;
												}
											}

											var16 = f.Lc[var4];
										}

										if (var16 != null) {
											bd var17 = ub.a(-93, var7);
											int var20 = tb.Yb[ce.plane][var13 - -1][var14 - -1];
											int var19 = tb.Yb[ce.plane][var13 + 1][var14];
											int var18 = tb.Yb[ce.plane][var13][var14];
											int var21 = tb.Yb[ce.plane][var13][1 + var14];
											ue var22 = var17
													.a((byte) 55, var10, var18, var19, var9, var20, var21);
											if (var22 != null) {
												mb.a(var14, var13, 0, 1 + var3, 1 + var2, -123, ce.plane, var11, -1, 0);
												var16.zd = ce.y + var2;
												var16.Hd = var22;
												byte var25;
												if (~var30 < ~var15) {
													var25 = var30;
													var30 = var15;
													var15 = var25;
												}

												int var24 = var17.h;
												var16.Cd = var3 - -ce.y;
												if (var28 > var29) {
													var25 = var28;
													var28 = var29;
													var29 = var25;
												}

												int var23 = var17.w;
												if (~var10 == -2 || ~var10 == -4) {
													var23 = var17.h;
													var24 = var17.w;
												}

												var16.rd = 64 * var23 + var13 * 128;
												var16.int_bd = var14 * 128 - -(var24 * 64);
												var16.Bd = vc.a(ce.plane, var16.rd, var16.int_bd, (byte) 37);
												var16.dd = var30 + var13;
												var16.Yc = var15 + var13;
												var16.int_md = var29 + var14;
												var16.Zc = var14 + var28;
											}
										}
									}

									if (jd.currentIncomingPacket == 244) {
										var1 = lc.readStream.i(0);
										var2 = ((126 & var1) >> 4) + ge.X;
										var3 = ce.A - -(7 & var1);
										var4 = lc.readStream.readUnsignedLEShortA((byte) 111);
										if (var2 >= 0 && ~var3 <= -1 && var2 < 104 && var3 < 104) {
											md var31 = lc.s[ce.plane][var2][var3];
											if (var31 != null) {
												var32 = (od) var31.c((byte) 53);
												if (var26 != 0 || var32 != null) {
													do {
														if (var32.xb == (32767 & var4)) {
															var32.d(-26669);
															if (var26 == 0) {
																break;
															}
														}

														var32 = (od) var31.a((byte) -68);
													} while (var32 != null);
												}

												if (var31.c((byte) 56) == null) {
													lc.s[ce.plane][var2][var3] = null;
												}

												ec.a(var2, -128, var3);
											}
										}

									}
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException var27) {
			throw id.a(var27, "rd.AA(" + var0 + ')');
		}
	}

	static void j (int var0) {
		int var10 = client.int_tb;

		try {
			++int_n;
			int var1 = lc.readStream.readBits((byte) 68, 8);
			if (var0 < 82) {
				a(68);
			}

			int var2;
			if (var1 < b.int_hd) {
				var2 = var1;
				if (var10 != 0 || b.int_hd > var1) {
					do {
						pd.E[me.Q++] = r.R[var2];
						++var2;
					} while (b.int_hd > var2);
				}
			}

			if (b.int_hd < var1) {
				throw new RuntimeException("gppov1");
			} else {
				b.int_hd = 0;
				var2 = 0;
				if (var10 != 0 || ~var2 > ~var1) {
					do {
						label86:
						{
							int var3 = r.R[var2];
							td var4 = f.Lc[var3];
							int var5 = lc.readStream.readBits((byte) 52, 1);
							if (~var5 == -1) {
								r.R[b.int_hd++] = var3;
								var4.Pb = ce.y;
								if (var10 == 0) {
									break label86;
								}
							}

							int var6 = lc.readStream.readBits((byte) 98, 2);
							if (~var6 == -1) {
								r.R[b.int_hd++] = var3;
								var4.Pb = ce.y;
								sb.ints_o[gf.int_q++] = var3;
								if (var10 == 0) {
									break label86;
								}
							}

							int var7;
							int var8;
							if (~var6 == -2) {
								r.R[b.int_hd++] = var3;
								var4.Pb = ce.y;
								var7 = lc.readStream.readBits((byte) 54, 3);
								var4.a(false, var7, false);
								var8 = lc.readStream.readBits((byte) 117, 1);
								if (var8 != 1) {
									break label86;
								}

								sb.ints_o[gf.int_q++] = var3;
								if (var10 == 0) {
									break label86;
								}
							}

							if (var6 == 2) {
								r.R[b.int_hd++] = var3;
								var4.Pb = ce.y;
								var7 = lc.readStream.readBits((byte) 106, 3);
								var4.a(true, var7, false);
								var8 = lc.readStream.readBits((byte) 36, 3);
								var4.a(true, var8, false);
								int var9 = lc.readStream.readBits((byte) 100, 1);
								if (var9 != 1) {
									break label86;
								}

								sb.ints_o[gf.int_q++] = var3;
								if (var10 == 0) {
									break label86;
								}
							}

							if (~var6 == -4) {
								pd.E[me.Q++] = var3;
							}
						}

						++var2;
					} while (~var2 > ~var1);

				}
			}
		} catch (RuntimeException var11) {
			throw id.a(var11, "rd.OA(" + var0 + ')');
		}
	}

	// $FF: synthetic method
	static Class a (String var0) {
		try {
			return Class.forName(var0);
		} catch (ClassNotFoundException var2) {
			throw new NoClassDefFoundError(var2.getMessage());
		}
	}

	final rd a (byte var1) {
		try {
			++Z;
			long l = this.k(94);
			synchronized (db != null ? db : (db = a("rd"))) {
				vc class_vc;
				if (n.nb == null) {
					n.nb = new pc(4096);
				} else {
					for (class_vc = (vc) n.nb.a(-1, l); class_vc != null ; class_vc = (vc) n.nb.b(2)) {
						if (this.a(class_vc.M, false)) {
							return class_vc.M;
						}
					}
				}

				class_vc = new vc();
				class_vc.M = this;
				this.N = false;
				if (var1 != 32) {
					this.I = 120;
				}

				n.nb.a((byte) -7, l, class_vc);
			}

			return this;
		} catch (RuntimeException var11) {
			throw id.a(var11, "rd.D(" + var1 + ')');
		}
	}

	final rd a (int var1, byte var2, rd var3) {
		int var7 = client.int_tb;

		try {
			++v;
			if (!this.N) {
				throw new IllegalArgumentException();
			} else if (~var1 < ~this.stringPointer) {
				throw new IllegalArgumentException();
			} else {
				this.I = 0;
				int var4 = 74 / ((var2 - 9) / 46);
				if (var1 - -var3.stringPointer > this.stringBuffer.length) {
					int var5 = 1;
					if (var7 != 0) {
						var5 += var5;
					}

					while (~var5 > ~(var1 - -var3.stringPointer)) {
						var5 += var5;
					}

					byte[] var6 = new byte[var5];
					ef.copyBytes(this.stringBuffer, 0, var6, 0, this.stringPointer);
					this.stringBuffer = var6;
				}

				ef.copyBytes(var3.stringBuffer, 0, this.stringBuffer, var1, var3.stringPointer);
				if (this.stringPointer < var3.stringPointer + var1) {
					this.stringPointer = var3.stringPointer + var1;
				}

				return this;
			}
		} catch (RuntimeException var8) {
			throw id.a(var8, "rd.CA(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	final int b (int unused) {
		try {
			++E;
			return this.stringPointer;
		} catch (RuntimeException var3) {
			throw id.a(var3, "rd.GA(" + unused + ')');
		}
	}

	private int a (int var1, int var2, int var3) {
		int var6 = client.int_tb;

		try {
			byte var4 = (byte) var2;
			++c;
			if (var3 >= -107) {
				this.stringPointer = 29;
			}

			int var5 = var1;
			if (var6 == 0 && var1 >= this.stringPointer) {
				return -1;
			} else {
				do {
					if (~this.stringBuffer[var5] == ~var4) {
						return var5;
					}

					++var5;
				} while (var5 < this.stringPointer);

				return -1;
			}
		} catch (RuntimeException var7) {
			throw id.a(var7, "rd.JA(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	final rd c (int var1) {
		int var5 = client.int_tb;

		try {
			if (var1 != 4009) {
				return null;
			} else {
				rd var2 = new rd();
				++ab;
				var2.stringPointer = 0;
				int var3 = 0;
				var2.stringBuffer = new byte[12];
				int var4 = 0;
				if (var5 != 0 || ~var4 > ~this.stringPointer) {
					do {
						label73:
						{
							if (~this.stringBuffer[var4] > -66 || ~this.stringBuffer[var4] < -91) {
								if ((~this.stringBuffer[var4] > -98 || this.stringBuffer[var4] > 122) && (~this.stringBuffer[var4] > -49 || ~this.stringBuffer[var4] < -58)) {
									if (var3 <= 0) {
										break label73;
									}

									var2.stringBuffer[var3++] = 95;
									if (var5 == 0) {
										break label73;
									}
								}

								var2.stringBuffer[var3++] = this.stringBuffer[var4];
								var2.stringPointer = var3;
								if (var5 == 0) {
									break label73;
								}
							}

							var2.stringBuffer[var3++] = (byte) (this.stringBuffer[var4] - 65 + 97);
							var2.stringPointer = var3;
						}

						if (var3 == 12 && var5 == 0) {
							break;
						}

						++var4;
					} while (~var4 > ~this.stringPointer);
				}

				return var2;
			}
		} catch (RuntimeException var6) {
			throw id.a(var6, "rd.T(" + var1 + ')');
		}
	}

	final int a (rd var1, int var2) {
		int var5 = client.int_tb;

		try {
			int var3;
			label46:
			{
				++x;
				if (var1.stringPointer >= this.stringPointer) {
					var3 = this.stringPointer;
					if (var5 == 0) {
						break label46;
					}
				}

				var3 = var1.stringPointer;
			}

			int var4 = 0;
			if (var5 == 0 && var4 >= var3) {
				if (~this.stringPointer > ~var1.stringPointer) {
					return -1;
				} else {
					if (var2 != 22941) {
						this.a(-67, (byte) -114);
					}

					return ~var1.stringPointer > ~this.stringPointer ? 1 : 0;
				}
			} else {
				do {
					if (~i.G[255 & this.stringBuffer[var4]] > ~i.G[255 & var1.stringBuffer[var4]]) {
						return -1;
					}

					if (i.G[this.stringBuffer[var4] & 255] > i.G[var1.stringBuffer[var4] & 255]) {
						return 1;
					}

					++var4;
				} while (var4 < var3);

				if (~this.stringPointer > ~var1.stringPointer) {
					return -1;
				} else {
					if (var2 != 22941) {
						this.a(-67, (byte) -114);
					}

					if (~var1.stringPointer > ~this.stringPointer) {
						return 1;
					} else {
						return 0;
					}
				}
			}
		} catch (RuntimeException var6) {
			throw id.a(var6, "rd.I(" + "{...}" + ',' + var2 + ')');
		}
	}

	final int a (byte var1, rd var2) {
		try {
			if (var1 <= 22) {
				canvas = null;
			}

			++e;
			return this.a((byte) -58, var2, 0);
		} catch (RuntimeException var4) {
			throw id.a(var4, "rd.R(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	final boolean a (int var1, rd var2) {
		int var5 = client.int_tb;

		try {
			++K;
			if (var2.stringPointer > this.stringPointer) {
				return false;
			} else {
				int var3 = this.stringPointer - var2.stringPointer;
				if (var1 != -31152) {
					this.c(-125, -60);
				}

				int var4 = 0;
				if (var5 == 0 && ~var4 <= ~var2.stringPointer) {
					return true;
				} else {
					do {
						if (this.stringBuffer[var4 + var3] != var2.stringBuffer[var4]) {
							return false;
						}

						++var4;
					} while (~var4 > ~var2.stringPointer);

					return true;
				}
			}
		} catch (RuntimeException var6) {
			throw id.a(var6, "rd.G(" + var1 + ',' + "{...}" + ')');
		}
	}

	final rd b (int i, int unused, int srcPointer) {
		try {
			rd class_rd = new rd();
			class_rd.stringPointer = -srcPointer + i;
			++t;
			class_rd.stringBuffer = new byte[-srcPointer + i];
			ef.copyBytes(this.stringBuffer, srcPointer, class_rd.stringBuffer, 0, class_rd.stringPointer);
			return class_rd;
		} catch (RuntimeException var5) {
			throw id.a(var5, "rd.FA(" + i + ',' + unused + ',' + srcPointer + ')');
		}
	}

	final int readUnsignedByte (int pointer, int var2) {
		try {
			++U;
			return 255 & this.stringBuffer[pointer];
		} catch (RuntimeException var4) {
			throw id.a(var4, "rd.KA(" + pointer + ',' + var2 + ')');
		}
	}

	final rd d (int var1) {
		int var6 = client.int_tb;

		try {
			++h;
			int var3 = this.stringPointer;
			int var2 = 0;
			if (var6 != 0) {
				++var2;
			}

			while (true) {
				if (~var2 > ~this.stringPointer) {
					if (this.stringBuffer[var2] >= 0 && ~this.stringBuffer[var2] >= -33 || ~(255 & this.stringBuffer[var2]) == -161) {
						++var2;
						continue;
					}

					if (var6 != 0) {
						--var3;
					}
				}

				while (~var3 < ~var2 && (this.stringBuffer[var3 + -1] >= 0 && ~this.stringBuffer[-1 + var3] >= -33 || ~(this.stringBuffer[-1 + var3] & 255) == -161)) {
					--var3;
				}

				if (var2 == 0 && var3 == this.stringPointer) {
					return this;
				} else {
					rd var4 = new rd();
					var4.stringPointer = var3 + -var2;
					var4.stringBuffer = new byte[var4.stringPointer];
					int var5 = 0;
					if (var6 != 0) {
						var4.stringBuffer[var5] = this.stringBuffer[var5 + var2];
						++var5;
					}

					while (var5 < var4.stringPointer) {
						var4.stringBuffer[var5] = this.stringBuffer[var5 + var2];
						++var5;
					}

					if (var1 != -6488) {
						this.stringPointer = 79;
					}

					return var4;
				}
			}
		} catch (RuntimeException var7) {
			throw id.a(var7, "rd.C(" + var1 + ')');
		}
	}

	final rd e (int unused) {
		try {
			++l;
			rd class_rd = new rd();
			boolean flag = true;
			class_rd.stringPointer = this.stringPointer;
			class_rd.stringBuffer = new byte[this.stringPointer];
			int var4 = 0;
			if (this.stringPointer <= var4) {
				return class_rd;
			} else {
				do {
					byte b = this.stringBuffer[var4];
					if (b == 95) {
						flag = true;
						class_rd.stringBuffer[var4] = 32;
					} else if (b < 97 || b > 122 || !flag) {
						flag = false;
						class_rd.stringBuffer[var4] = b;
					} else {
						flag = false;
						class_rd.stringBuffer[var4] = (byte) (b - 32);
					}

					++var4;
				} while (this.stringPointer > var4);

				return class_rd;
			}
		} catch (RuntimeException var7) {
			throw id.a(var7, "rd.L(" + unused + ')');
		}
	}

	final boolean b (int var1, rd var2) {
		int var4 = client.int_tb;

		try {
			++q;
			if (~this.stringPointer > ~var2.stringPointer) {
				return false;
			} else {
				if (var1 != 27) {
					ints_f = null;
				}

				int var3 = 0;
				if (var4 == 0 && var3 >= var2.stringPointer) {
					return true;
				} else {
					do {
						if (~this.stringBuffer[var3] != ~var2.stringBuffer[var3]) {
							return false;
						}

						++var3;
					} while (var3 < var2.stringPointer);

					return true;
				}
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "rd.B(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	public final int hashCode () {
		try {
			++bb;
			return this.g(255);
		} catch (RuntimeException var2) {
			throw id.a(var2, "rd.hashCode(" + ')');
		}
	}

	final rd f (int var1) {
		int var7 = client.int_tb;

		try {
			int var2 = -15 % ((var1 - 21) / 60);
			rd var3 = new rd();
			++z;
			var3.stringPointer = this.stringPointer;
			var3.stringBuffer = new byte[this.stringPointer];
			boolean var4 = true;
			int var5 = 0;
			if (var7 == 0 && ~var5 <= ~this.stringPointer) {
				return var3;
			} else {
				do {
					byte var6;
					label94:
					{
						var6 = this.stringBuffer[var5];
						if (var6 >= 97 && ~var6 >= -123 || ~var6 <= 31 && ~var6 >= 1 && var6 != -9) {
							if (var4) {
								var6 = (byte) (var6 - 32);
							}

							var4 = false;
							if (var7 == 0) {
								break label94;
							}
						}

						if (var6 >= 65 && var6 <= 90 || var6 >= -64 && var6 <= -34 && var6 != -41) {
							if (!var4) {
								var6 = (byte) (var6 + 32);
							}

							var4 = false;
						}
					}

					if (~var6 == -47 || ~var6 == -34 || ~var6 == -64) {
						var4 = true;
					}

					var3.stringBuffer[var5] = var6;
					++var5;
				} while (~var5 > ~this.stringPointer);

				return var3;
			}
		} catch (RuntimeException var8) {
			throw id.a(var8, "rd.MA(" + var1 + ')');
		}
	}

	final rd a (boolean var1, int pointer) {
		try {
			++Y;
			if (var1) {
				overlay_multiway = null;
			}

			return this.b(this.stringPointer, -23745, pointer);
		} catch (RuntimeException var4) {
			throw id.a(var4, "rd.H(" + var1 + ',' + pointer + ')');
		}
	}

	private int b (int var1, int var2) {
		int var9 = client.int_tb;

		try {
			if (~var1 > -2 || ~var1 < -37) {
				var1 = 10;
			}

			++A;
			boolean var4 = false;
			boolean var3 = false;
			int var5 = 0;
			if (var2 != -28719) {
				ints_f = null;
			}

			int var6 = 0;
			if (var9 == 0 && this.stringPointer <= var6) {
				if (!var4) {
					throw new NumberFormatException();
				} else {
					return var5;
				}
			} else {
				do {
					label106:
					{
						int var7 = 255 & this.stringBuffer[var6];
						if (~var6 == -1) {
							if (~var7 == -46) {
								var3 = true;
								if (var9 == 0) {
									break label106;
								}
							}

							if (var7 == 43 && var9 == 0) {
								break label106;
							}
						}

						label111:
						{
							if (~var7 > -49 || var7 > 57) {
								if (~var7 > -66 || ~var7 < -91) {
									if (~var7 > -98 || var7 > 122) {
										throw new NumberFormatException();
									}

									var7 -= 87;
									if (var9 == 0) {
										break label111;
									}
								}

								var7 -= 55;
								if (var9 == 0) {
									break label111;
								}
							}

							var7 -= 48;
						}

						if (~var1 >= ~var7) {
							throw new NumberFormatException();
						}

						if (var3) {
							var7 = -var7;
						}

						int var8 = var7 + var1 * var5;
						if (~(var8 / var1) != ~var5) {
							throw new NumberFormatException();
						}

						var4 = true;
						var5 = var8;
					}

					++var6;
				} while (this.stringPointer > var6);

				if (!var4) {
					throw new NumberFormatException();
				} else {
					return var5;
				}
			}
		} catch (RuntimeException var10) {
			throw id.a(var10, "rd.M(" + var1 + ',' + var2 + ')');
		}
	}

	final boolean b (boolean var1) {
		try {
			++int_r;
			if (!var1) {
				this.a(32, 8, 127);
			}

			return this.e(-110, 10);
		} catch (RuntimeException var3) {
			throw id.a(var3, "rd.O(" + var1 + ')');
		}
	}

	final void drawString (int x, int unused, int y, Graphics graphics) {
		try {
			++j;
			String str;
			try {
				str = new String(this.stringBuffer, 0, this.stringPointer, "ISO-8859-1");
			} catch (UnsupportedEncodingException e) {
				str = new String(this.stringBuffer, 0, this.stringPointer);
			}

			graphics.drawString(str, x, y);
		} catch (RuntimeException var7) {
			throw id.a(var7, "rd.IA(" + x + ',' + unused + ',' + y + ',' + (graphics != null ? "{...}" : "null") + ')');
		}
	}

	final int g (int unused) {
		try {
			++P;
			int i = 0;
			for (int index = 0 ; this.stringPointer > index ; ++index) {
				i = (255 & this.stringBuffer[index]) + -i + (i << 5);
			}

			return i;
		} catch (RuntimeException var4) {
			throw id.a(var4, "rd.U(" + unused + ')');
		}
	}

	final rd c (int var1, int var2) {
		int var5 = client.int_tb;

		try {
			if (var2 >= -96) {
				this.stringBuffer = null;
			}

			++V;
			if (var1 > 0 && ~var1 >= -256) {
				if (!this.N) {
					throw new IllegalArgumentException();
				} else {
					this.I = 0;
					if (~this.stringPointer == ~this.stringBuffer.length) {
						int var3 = 1;
						if (var5 != 0) {
							var3 += var3;
						}

						while (~this.stringPointer <= ~var3) {
							var3 += var3;
						}

						byte[] var4 = new byte[var3];
						ef.copyBytes(this.stringBuffer, 0, var4, 0, this.stringPointer);
						this.stringBuffer = var4;
					}

					this.stringBuffer[this.stringPointer++] = (byte) var1;
					return this;
				}
			} else {
				throw new IllegalArgumentException("invalid char");
			}
		} catch (RuntimeException var6) {
			throw id.a(var6, "rd.NA(" + var1 + ',' + var2 + ')');
		}
	}

	private int a (byte var1, rd var2, int var3) {
		int var17 = client.int_tb;

		try {
			++s;
			int[] var4 = new int[var2.stringPointer];
			int[] var6 = new int[var2.stringPointer];
			int[] var5 = new int[256];
			int var7 = 0;
			if (var1 > -27) {
				this.a(-46, (byte) -112, null);
				if (var17 != 0) {
					var5[var7] = var2.stringPointer;
					++var7;
				}
			}

			while (~var5.length < ~var7) {
				var5[var7] = var2.stringPointer;
				++var7;
			}

			int var8 = 1;
			if (var17 != 0) {
				var4[var8 - 1] = (var2.stringPointer << 1) - var8;
				var5[od.a(255, var2.stringBuffer[var8 + -1])] = -var8 + var2.stringPointer;
				++var8;
			}

			while (~var8 >= ~var2.stringPointer) {
				var4[var8 - 1] = (var2.stringPointer << 1) - var8;
				var5[od.a(255, var2.stringBuffer[var8 + -1])] = -var8 + var2.stringPointer;
				++var8;
			}

			int var9 = var2.stringPointer + 1;
			int var10 = var2.stringPointer;
			if (var17 != 0 || var10 > 0) {
				do {
					var6[var10 - 1] = var9;
					if (var17 != 0 || ~var9 >= ~var2.stringPointer && var2.stringBuffer[var9 - 1] != var2.stringBuffer[-1 + var10]) {
						do {
							if (var4[var9 + -1] >= -var10 + var2.stringPointer) {
								var4[var9 + -1] = -var10 + var2.stringPointer;
							}

							var9 = var6[-1 + var9];
						} while (~var9 >= ~var2.stringPointer && var2.stringBuffer[var9 - 1] != var2.stringBuffer[-1 + var10]);
					}

					--var10;
					--var9;
				} while (var10 > 0);
			}

			int var11 = var9;
			var9 = -var9 + (var2.stringPointer - -1);
			int var12 = 1;
			int var13 = 0;
			int var14 = 1;
			if (var17 != 0) {
				var6[-1 + var14] = var13;
				var13 = var6[-1 + var13];

				while (var13 >= 1 && ~var2.stringBuffer[var13 + -1] != ~var2.stringBuffer[var14 + -1]) {
					var13 = var6[-1 + var13];
				}

				++var13;
				++var14;
			}

			while (~var9 <= ~var14) {
				var6[-1 + var14] = var13;
				if (var17 != 0) {
					var13 = var6[-1 + var13];
				}

				while (var13 >= 1 && ~var2.stringBuffer[var13 + -1] != ~var2.stringBuffer[var14 + -1]) {
					var13 = var6[-1 + var13];
				}

				++var13;
				++var14;
			}

			int var15;
			if (var17 != 0 || var2.stringPointer > var11) {
				do {
					var15 = var12;
					if (var17 == 0 && ~var11 > ~var12) {
						var12 = var11 - -1;
						var11 = -var6[var9 - 1] + var11 + var9;
						var9 = var6[var9 + -1];
					} else {
						do {
							if (~var4[-1 + var15] <= ~(var2.stringPointer + var11 + -var15)) {
								var4[var15 + -1] = -var15 + var2.stringPointer - -var11;
							}

							++var15;
						} while (~var11 <= ~var15);

						var12 = var11 - -1;
						var11 = -var6[var9 - 1] + var11 + var9;
						var9 = var6[var9 + -1];
					}
				} while (var2.stringPointer > var11);
			}

			var15 = var2.stringPointer + var3 + -1;
			if (var17 == 0 && ~var15 <= ~this.stringPointer) {
				return -1;
			} else {
				do {
					int var16 = var2.stringPointer + -1;
					if (var17 != 0) {
						--var15;
						--var16;
					}

					while (~var16 <= -1 && var2.stringBuffer[var16] == this.stringBuffer[var15]) {
						--var15;
						--var16;
					}

					if (~var16 == 0) {
						return var15 - -1;
					}

					var15 += Math.max(var5[this.stringBuffer[var15] & 255], var4[var16]);
				} while (~var15 > ~this.stringPointer);

				return -1;
			}
		} catch (RuntimeException var18) {
			throw id.a(var18, "rd.K(" + var1 + ',' + "{...}" + ',' + var3 + ')');
		}
	}

	final byte[] b (byte var1) {
		try {
			++X;
			byte[] var2 = new byte[this.stringPointer];
			if (var1 != -28) {
				C = null;
			}

			ef.copyBytes(this.stringBuffer, 0, var2, 0, this.stringPointer);
			return var2;
		} catch (RuntimeException var3) {
			throw id.a(var3, "rd.V(" + var1 + ')');
		}
	}

	final int a (int unused, int unused2, byte[] buffer, int pointer, int i) {
		try {
			ef.copyBytes(this.stringBuffer, 0, buffer, pointer, i);
			++L;
			return i;
		} catch (RuntimeException var7) {
			throw id.a(var7, "rd.F(" + unused + ',' + unused2 + ',' + (buffer != null ? "{...}" : "null") + ',' + pointer + ',' + i + ')');
		}
	}

	final int a (int var1, byte var2) {
		try {
			++w;
			if (var2 < 61) {
				this.b(77, 105, -120);
			}

			return this.a(0, var1, -128);
		} catch (RuntimeException var4) {
			throw id.a(var4, "rd.LA(" + var1 + ',' + var2 + ')');
		}
	}

	final int h (int var1) {
		try {
			if (var1 != 122) {
				return 91;
			} else {
				++G;
				return this.b(10, var1 + -28841);
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "rd.A(" + var1 + ')');
		}
	}

	final long i (int unused) {
		try {
			long l = 0L;
			int capacity = 0;
			if (~this.stringPointer < ~capacity) {
				do {
					l *= 37L;
					byte value = this.stringBuffer[capacity];
					if (value < 65 || value > 90) {
						if (value < 97 || ~value < -123) {
							if (~value <= -49 && ~value >= -58) {
								l += (long) (value + 27 + -48);
							}
						} else {
							l += (long) (1 - (-value + 97));
						}
					} else {
						l += (long) (-65 + (1 + value));
					}

					++capacity;
				} while (~this.stringPointer < ~capacity && capacity < 12);
			}

			while (l % 37L == 0L && l != 0L) {
				l /= 37L;
			}

			++a;
			return l;
		} catch (RuntimeException var7) {
			throw id.a(var7, "rd.E(" + unused + ')');
		}
	}

	final rd c (byte var1) {
		int var4 = client.int_tb;

		try {
			++H;
			if (var1 != 57) {
				this.f(-82);
			}

			rd var2 = new rd();
			var2.stringPointer = this.stringPointer;
			var2.stringBuffer = new byte[this.stringPointer];
			int var3 = 0;
			if (var4 != 0) {
				var2.stringBuffer[var3] = 42;
				++var3;
			}

			while (var3 < this.stringPointer) {
				var2.stringBuffer[var3] = 42;
				++var3;
			}

			return var2;
		} catch (RuntimeException var5) {
			throw id.a(var5, "rd.HA(" + var1 + ')');
		}
	}

	final rd d (byte var1) {
		try {
			if (var1 < 59) {
				this.a(-48, -32, null, 68, -65);
			}

			++o;
			if (!this.N) {
				throw new IllegalArgumentException();
			} else {
				this.I = 0;
				if (this.stringPointer != this.stringBuffer.length) {
					byte[] destBuffer = new byte[this.stringPointer];
					ef.copyBytes(this.stringBuffer, 0, destBuffer, 0, this.stringPointer);
					this.stringBuffer = destBuffer;
				}

				return this;
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "rd.W(" + var1 + ')');
		}
	}

	final boolean a (rd var1, boolean var2) {
		try {
			++M;
			if (var1 == null) {
				return false;
			} else if (this.stringPointer != var1.stringPointer) {
				return false;
			} else {
				if (!this.N || !var1.N) {
					if (~this.I == -1) {
						this.I = this.g(255);
						if (~this.I == -1) {
							this.I = 1;
						}
					}

					if (~var1.I == -1) {
						var1.I = var1.g(255);
						if (~var1.I == -1) {
							var1.I = 1;
						}
					}

					if (~var1.I != ~this.I) {
						return false;
					}
				}

				for (int var3 = 0 ; ~this.stringPointer < ~var3 ; ++var3) {
					if (this.stringBuffer[var3] != var1.stringBuffer[var3]) {
						return false;
					}
				}

				if (var2) {
					F = null;
				}

				return true;
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "rd.EA(" + "{...}" + ',' + var2 + ')');
		}
	}

	final int stringWidth (FontMetrics fontMetrics, int unused) {
		try {
			++m;

			String str;
			try {
				str = new String(this.stringBuffer, 0, this.stringPointer, "ISO-8859-1");
			} catch (UnsupportedEncodingException var4) {
				str = new String(this.stringBuffer, 0, this.stringPointer);
			}

			return fontMetrics.stringWidth(str);
		} catch (RuntimeException var5) {
			throw id.a(var5, "rd.N(" + (fontMetrics != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}

	final rd a (rd var1, byte var2) {
		int var5 = client.int_tb;

		try {
			++Q;
			if (!this.N) {
				throw new IllegalArgumentException();
			} else {
				this.I = 0;
				if (var2 <= 46) {
					return null;
				} else {
					if (this.stringPointer - -var1.stringPointer > this.stringBuffer.length) {
						int var3 = 1;
						if (var5 != 0) {
							var3 += var3;
						}

						while (~var3 > ~(this.stringPointer + var1.stringPointer)) {
							var3 += var3;
						}

						byte[] var4 = new byte[var3];
						ef.copyBytes(this.stringBuffer, 0, var4, 0, this.stringPointer);
						this.stringBuffer = var4;
					}

					ef.copyBytes(var1.stringBuffer, 0, this.stringBuffer, this.stringPointer, var1.stringPointer);
					this.stringPointer += var1.stringPointer;
					return this;
				}
			}
		} catch (RuntimeException var6) {
			throw id.a(var6, "rd.Q(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}

	final rd d (int var1, int var2) {
		try {
			++int_i;
			if (var2 > -70) {
				return null;
			} else if (~var1 < -1 && var1 <= 255) {
				rd var3 = new rd();
				var3.stringBuffer = new byte[this.stringPointer - -1];
				var3.stringPointer = 1 + this.stringPointer;
				ef.copyBytes(this.stringBuffer, 0, var3.stringBuffer, 0, this.stringPointer);
				var3.stringBuffer[this.stringPointer] = (byte) var1;
				return var3;
			} else {
				throw new IllegalArgumentException("invalid char");
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "rd.J(" + var1 + ',' + var2 + ')');
		}
	}

	public final boolean equals (Object var1) {
		try {
			++k;
			if (var1 instanceof rd) {
				return this.a((rd) var1, false);
			} else {
				throw new IllegalArgumentException();
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "rd.equals(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	private long k (int var1) {
		try {
			++y;
			if (var1 <= 88) {
				this.stringBuffer = null;
			}

			long var2 = 0L;

			for (int var4 = 0 ; ~this.stringPointer < ~var4 ; ++var4) {
				var2 = (var2 << 5) - var2 - -((long) (this.stringBuffer[var4] & 255));
			}

			return var2;
		} catch (RuntimeException var5) {
			throw id.a(var5, "rd.PA(" + var1 + ')');
		}
	}

	final boolean b (rd var1, boolean var2) {
		int var6 = client.int_tb;

		try {
			++D;
			if (var1 == null) {
				return false;
			} else if (~var1.stringPointer != ~this.stringPointer) {
				return false;
			} else {
				if (!var2) {
					F = null;
				}

				int var3 = 0;
				if (var6 == 0 && var3 >= this.stringPointer) {
					return true;
				} else {
					do {
						byte var5 = var1.stringBuffer[var3];
						byte var4 = this.stringBuffer[var3];
						if (~var5 <= -66 && var5 <= 90 || var5 >= -64 && var5 <= -34 && ~var5 != 40) {
							var5 = (byte) (var5 + 32);
						}

						if (var4 >= 65 && ~var4 >= -91 || ~var4 <= 63 && var4 <= -34 && var4 != -41) {
							var4 = (byte) (var4 + 32);
						}

						if (~var5 != ~var4) {
							return false;
						}

						++var3;
					} while (var3 < this.stringPointer);

					return true;
				}
			}
		} catch (RuntimeException var7) {
			throw id.a(var7, "rd.BA(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}

	private boolean e (int var1, int var2) {
		int var9 = client.int_tb;

		try {
			boolean var3 = false;
			++W;
			if (var2 < 1 || ~var2 < -37) {
				var2 = 10;
			}

			boolean var4 = false;
			if (var1 >= -78) {
				this.stringPointer = 61;
			}

			int var5 = 0;
			int var6 = 0;
			if (var9 == 0 && this.stringPointer <= var6) {
				return var4;
			} else {
				while (true) {
					label97:
					{
						int var7 = 255 & this.stringBuffer[var6];
						if (~var6 == -1) {
							if (var7 == 45) {
								var3 = true;
								if (var9 == 0) {
									break label97;
								}
							}

							if (var7 == 43 && var9 == 0) {
								break label97;
							}
						}

						if (~var7 <= -49 && var7 <= 57) {
							var7 -= 48;
						} else {
							label96:
							{
								if (var7 >= 65 && ~var7 >= -91) {
									var7 -= 55;
									if (var9 == 0) {
										break label96;
									}
								}

								if (var7 < 97 || ~var7 < -123) {
									break;
								}

								var7 -= 87;
								if (var9 != 0) {
									break;
								}
							}
						}

						if (var2 <= var7) {
							return false;
						}

						if (var3) {
							var7 = -var7;
						}

						int var8 = var5 * var2 + var7;
						if (~var5 != ~(var8 / var2)) {
							return false;
						}

						var5 = var8;
						var4 = true;
					}

					++var6;
					if (this.stringPointer <= var6) {
						return var4;
					}
				}

				return false;
			}
		} catch (RuntimeException var10) {
			throw id.a(var10, "rd.P(" + var1 + ',' + var2 + ')');
		}
	}

	final rd l (int unused) {
		try {
			++S;
			rd class_rd = new rd();
			class_rd.stringPointer = this.stringPointer;
			class_rd.stringBuffer = new byte[this.stringPointer];
			int i = 0;
			if (i >= this.stringPointer) {
				return class_rd;
			} else {
				do {
					byte b = this.stringBuffer[i];
					if (b >= 65 && b <= 90 || b >= -64 && b <= -34 && b != -41) {
						b = (byte) (b + 32);
					}

					class_rd.stringBuffer[i] = b;
					System.err.println("FileName letter ASCII value array: " + Arrays.toString(class_rd.stringBuffer));
					++i;
				} while (i < this.stringPointer);

				return class_rd;
			}
		} catch (RuntimeException var6) {
			throw id.a(var6, "rd.S(" + unused + ')');
		}
	}
}
