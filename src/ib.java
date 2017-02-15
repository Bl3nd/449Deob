import java.io.IOException;

final class ib extends RuntimeException {
	static md md_a = new md();
	static rd rd_b = md.a((String) "Okay", (byte) 119);
	static int c;
	static he[] d = new he[1000];
	static int g;
	static long long_h;
	static byte[][] bytes_i = new byte[50][];
	static int j;
	static int k;
	static int int_l = 0;
	static rd titleBox = md.a((String) "titlebox", (byte) 121);
	static jd jd_n;
	static int o = 127;
	static int int_p = 0;
	static long long_q;
	static oa oa_r;
	Throwable e;
	String string_f;

	ib (Throwable var1, String var2) {
		this.string_f = var2;
		this.e = var1;
	}

	public static void a (byte var0) {
		md_a = null;
		if (var0 <= 51) {
			a(null, -53, -51, -77);
		}

		d = null;
		bytes_i = null;
		rd_b = null;
		jd_n = null;
		titleBox = null;
		oa_r = null;
	}

	static boolean a (boolean flag) {//TODO: IncomingPacket method
		int dummy = client.int_tb;
		try {
			++c;
			if (cc.ff_k == null) {
				return false;
			} else {
				int var3;
				try {
					int available = cc.ff_k.available((byte) -127);
					if (available == 0) {
						return false;
					}

					if (jd.currentIncomingPacket == -1) {
						cc.ff_k.read(0, lc.readStream.buffer, 1, 0);
						--available;
						lc.readStream.pointer = 0;
						jd.currentIncomingPacket = lc.readStream.o(50);//readOpcode()
						l.incomingPacketSize = i.incomingPacketSizes[jd.currentIncomingPacket];
					}

					if (l.incomingPacketSize == -1) {
						if (available <= 0) {
							return false;
						}

						--available;
						cc.ff_k.read(0, lc.readStream.buffer, 1, 0);
						l.incomingPacketSize = lc.readStream.buffer[0] & 255;
					}

					if (l.incomingPacketSize == -2) {
						if (available <= 1) {
							return false;
						}

						cc.ff_k.read(0, lc.readStream.buffer, 2, 0);
						available -= 2;
						lc.readStream.pointer = 0;
						l.incomingPacketSize = lc.readStream.readUnsignedLEShort(255);
					}

					if (l.incomingPacketSize > available) {
						return false;
					}

					lc.readStream.pointer = 0;
					cc.ff_k.read(0, lc.readStream.buffer, l.incomingPacketSize, 0);
					vc.I = db.H;
					db.H = ta.Bb;
					ta.Bb = jd.currentIncomingPacket;
					nb.n = 0;
					int var22;
					if (jd.currentIncomingPacket == 193) {
						bc.k = false;
						int i = 0;
						while (i < 5) {
							df.booleans_v[i] = false;
							++i;
						}

						jd.currentIncomingPacket = -1;
						return true;
					}

					int var4;
					int var5;
					long var12;
					long var30;
					int var36;

					//Logged in/logged out message
					if (jd.currentIncomingPacket == 71) {
						long otherPlayerName = lc.readStream.readLong(false);
						int playerOnlineStatus = lc.readStream.readUnsignedLEShort(255);
						int i1 = lc.readStream.readUnsignedByte((byte) 116);
						@SuppressWarnings("ConstantConditions") rd otherPlayer = ff.a(-26567, otherPlayerName).e(-94);
						int i2 = 0;
						if (i2 < u.int_eb) {
							do {
								if (otherPlayerName == cc.longs_f[i2]) {
									if (ee.ints_k[i2] != playerOnlineStatus) {
										ee.ints_k[i2] = playerOnlineStatus;
										db.F = true;
										if (playerOnlineStatus > 0) {
											n.a(kd.rd_v, pc.a((byte) 127, new rd[]{otherPlayer, nc._hasLoggedIn2}), true, 5);
										}

										if (playerOnlineStatus == 0) {
											n.a(kd.rd_v, pc.a((byte) 127, new rd[]{otherPlayer, qe._hasLoggedOut2}), true, 5);
										}
									}

									je.ints_i[i2] = i1;
									otherPlayer = null;
									break;
								}

								++i2;
							} while (i2 < u.int_eb);
						}

						if (otherPlayer != null && u.int_eb < 200) {
							cc.longs_f[u.int_eb] = otherPlayerName;
							ad.rds_k[u.int_eb] = otherPlayer;
							ee.ints_k[u.int_eb] = playerOnlineStatus;
							je.ints_i[u.int_eb] = i1;
							ec.int_i = ce.y;
							db.F = true;
							++u.int_eb;
						}

						boolean flag2;
						do {
							flag2 = true;
							int i = 0;
							if (u.int_eb + -1 > i) {
								do {
									if (ee.ints_k[i] != sa.worldId_tb
											&& ee.ints_k[1 + i] == sa.worldId_tb
											|| ee.ints_k[i] == 0
											&& ee.ints_k[i + 1] != 0) {
										flag2 = false;
										int i3 = ee.ints_k[i];
										ee.ints_k[i] = ee.ints_k[1 + i];
										ee.ints_k[1 + i] = i3;
										rd class_rd = ad.rds_k[i];
										ad.rds_k[i] = ad.rds_k[1 + i];
										ad.rds_k[1 + i] = class_rd;
										long l = cc.longs_f[i];
										cc.longs_f[i] = cc.longs_f[i + 1];
										cc.longs_f[1 + i] = l;
										int i4 = je.ints_i[i];
										je.ints_i[i] = je.ints_i[1 + i];
										je.ints_i[i + 1] = i4;
										db.F = true;
									}

									++i;
								} while (u.int_eb + -1 > i);
							}
						} while (!flag2);

						jd.currentIncomingPacket = -1;
						return true;
					}

					if (jd.currentIncomingPacket == 106) {
						int index = 0;
						if (ta.Pb.length <= index) {
							jd.currentIncomingPacket = -1;
							ec.int_i = ce.y;
							return true;
						}

						do {
							if (tc.G[index] != ta.Pb[index]) {
								ta.Pb[index] = tc.G[index];
								kd.a((byte) -73, index);
								db.F = true;
							}

							++index;
						} while (~ta.Pb.length < ~index);

						jd.currentIncomingPacket = -1;
						ec.int_i = ce.y;
						return true;
					}

					if (~jd.currentIncomingPacket == -192) {
						ge.X = lc.readStream.readUnsignedByte((byte) 116);
						ce.A = lc.readStream.readUnsignedByteS(255);
						var22 = ge.X;
						if (dummy != 0) {
							var3 = ce.A;
							if (dummy == 0 && ce.A - -8 <= var3) {
								++var22;
							} else {
								while (true) {
									if (lc.s[ce.plane][var22][var3] != null) {
										lc.s[ce.plane][var22][var3] = null;
										ec.a(var22, 55, var3);
									}

									++var3;
									if (ce.A - -8 <= var3) {
										++var22;
										break;
									}
								}
							}
						}

						while (var22 < 8 + ge.X) {
							var3 = ce.A;
							if (dummy == 0 && ce.A - -8 <= var3) {
								++var22;
							} else {
								do {
									if (lc.s[ce.plane][var22][var3] != null) {
										lc.s[ce.plane][var22][var3] = null;
										ec.a(var22, 55, var3);
									}

									++var3;
								} while (ce.A - -8 > var3);

								++var22;
							}
						}

						p var54 = (p) kd.j.c((byte) 64);
						if (dummy == 0 && var54 == null) {
							jd.currentIncomingPacket = -1;
							return true;
						}

						do {
							if (var54.X >= ge.X && var54.X < 8 + ge.X && var54.J >= ce.A && var54.J < 8 + ce.A && var54.T == ce.plane) {
								var54.O = 0;
							}

							var54 = (p) kd.j.a((byte) -68);
						} while (var54 != null);

						jd.currentIncomingPacket = -1;
						return true;
					}

					if (jd.currentIncomingPacket == 59) {
						sb.int_a = lc.readStream.readUnsignedByte((byte) 116);
						if (sb.int_a == 1) {
							hb.int_k = lc.readStream.readUnsignedLEShort(255);
						}

						if (sb.int_a >= 2 && sb.int_a <= 6) {
							if (~sb.int_a == -3) {
								ta.Qb = 64;
								bc.y = 64;
							}

							if (~sb.int_a == -4) {
								ta.Qb = 64;
								bc.y = 0;
							}

							if (sb.int_a == 4) {
								ta.Qb = 64;
								bc.y = 128;
							}

							if (sb.int_a == 5) {
								bc.y = 64;
								ta.Qb = 0;
							}

							if (sb.int_a == 6) {
								bc.y = 64;
								ta.Qb = 128;
							}

							sb.int_a = 2;
							gd.int_o = lc.readStream.readUnsignedLEShort(255);
							ta.Rb = lc.readStream.readUnsignedLEShort(255);
							m.int_d = lc.readStream.readUnsignedByte((byte) 116);
						}

						if (sb.int_a == 10) {
							qe.t = lc.readStream.readUnsignedLEShort(255);
						}

						jd.currentIncomingPacket = -1;
						return true;
					}

					if (jd.currentIncomingPacket == 13) {
						bd.publicChatStatus = lc.readStream.readUnsignedByte((byte) 116);
						ub.privateChatStatus = lc.readStream.readUnsignedByte((byte) 116);
						pa.trade_competeStatus = lc.readStream.readUnsignedByte((byte) 116);
						w.h = true;
						db.L = true;
						jd.currentIncomingPacket = -1;
						return true;
					}

					int var6;
					nd var23;
					if (jd.currentIncomingPacket == 43) {
						db.F = true;
						var22 = lc.readStream.readInt((byte) -63);
						var3 = lc.readStream.readUnsignedLEShort(255);
						if (~var22 > 69999) {
							var3 += '耀';
						}

						label1246:
						{
							if (~var22 > -1) {
								var23 = null;
								if (dummy == 0) {
									if (l.incomingPacketSize <= lc.readStream.pointer) {
										pc.int_d = ce.y;
										jd.currentIncomingPacket = -1;
										return true;
									}
									break label1246;
								}
							}

							var23 = bf.b('\uffff', var22);
							if (dummy == 0 && l.incomingPacketSize <= lc.readStream.pointer) {
								pc.int_d = ce.y;
								jd.currentIncomingPacket = -1;
								return true;
							}
						}

						do {
							var5 = lc.readStream.readUnsignedSmart((byte) -68);
							var6 = lc.readStream.readUnsignedLEShort(255);
							var36 = 0;
							if (~var6 != -1) {
								var36 = lc.readStream.readUnsignedByte((byte) 116);
								if (var36 == 255) {
									var36 = lc.readStream.readInt((byte) -72);
								}
							}

							if (var23 != null && ~var5 <= -1 && var5 < var23.ob.length) {
								var23.ob[var5] = var6;
								var23.zc[var5] = var36;
							}

							h.a(var3, 42, var36, var6 + -1, var5);
						} while (l.incomingPacketSize > lc.readStream.pointer);

						pc.int_d = ce.y;
						jd.currentIncomingPacket = -1;
						return true;
					}

					if (jd.currentIncomingPacket == 97) {
						if (~ta.Yb != 0) {
							q.a(ta.Yb, (byte) -90);
							ta.Yb = -1;
							db.F = true;
							pe.l = true;
						}

						if (~ta.Sb != 0) {
							q.a(ta.Sb, (byte) -90);
							ta.Sb = -1;
							w.h = true;
						}

						if (~ee.int_h != 0) {
							q.a(ee.int_h, (byte) -90);
							ee.int_h = -1;
							bd.a(false, 30);
						}

						if (~i.R != 0) {
							q.a(i.R, (byte) -90);
							i.R = -1;
						}

						if (~sa.zb != 0) {
							q.a(sa.zb, (byte) -90);
							sa.zb = -1;
						}

						jd.currentIncomingPacket = -1;
						ce.int_l = -1;
						if (~wb.int_db != -1) {
							w.h = true;
							wb.int_db = 0;
						}

						return true;
					}

					rd var40;
					if (~jd.currentIncomingPacket == -85) {
						var22 = lc.readStream.readUnsignedByte((byte) 116);
						var40 = lc.readStream.readRSString(-1);
						var4 = lc.readStream.i(0);
						if (~var22 <= -2 && var22 <= 5) {
							if (var40.b(we.i, !flag)) {
								var40 = null;
							}

							s.wb[-1 + var22] = var40;
							tb.Pb[-1 + var22] = ~var4 == -1;
						}

						jd.currentIncomingPacket = -1;
						return true;
					}

					if (jd.currentIncomingPacket == 184) {
						qb.c((byte) -72);
						jd.currentIncomingPacket = -1;
						return true;
					}

					if (~jd.currentIncomingPacket == -181) {
						var22 = lc.readStream.readUnsignedLEShort(255);
						var3 = lc.readStream.readUnsignedByte((byte) 116);
						var4 = lc.readStream.readUnsignedLEShort(255);
						bd.a(var3, -125, var4, var22);
						jd.currentIncomingPacket = -1;
						return true;
					}

					if (~jd.currentIncomingPacket == -8) {
						var22 = lc.readStream.readShort(1331464976);
						if (b.int_ld != var22) {
							q.a(b.int_ld, (byte) -90);
							b.int_ld = var22;
						}

						w.h = true;
						lc.a((byte) -123, b.int_ld);
						jd.currentIncomingPacket = -1;
						return true;
					}

					if (~jd.currentIncomingPacket == -211) {
						var22 = lc.readStream.readUnsignedLEShortA((byte) 107);
						var3 = lc.readStream.readInt_V1((byte) 119);
						var23 = bf.b('\uffff', var3);
						jd.currentIncomingPacket = -1;
						var23.int_kc = var22;
						var23.int_od = 2;
						return true;
					}

					if (jd.currentIncomingPacket == 176) {
						var22 = 0;
						if (dummy == 0 && t.q <= var22) {
							if (b.int_ld != -1) {
								w.h = true;
							}

							ec.int_i = ce.y;
							db.F = true;
							jd.currentIncomingPacket = -1;
							return true;
						}

						do {
							n var53 = wa.a(var22, -1);
							if (var53 != null && var53.kb == 0) {
								tc.G[var22] = 0;
								ta.Pb[var22] = 0;
							}

							++var22;
						} while (t.q > var22);

						if (b.int_ld != -1) {
							w.h = true;
						}

						ec.int_i = ce.y;
						db.F = true;
						jd.currentIncomingPacket = -1;
						return true;
					}

					if (~jd.currentIncomingPacket == -42) {
						var22 = lc.readStream.f(false);
						mb.a(true, var22);
						if (ta.Sb != -1) {
							q.a(ta.Sb, (byte) -90);
							w.h = true;
							ta.Sb = -1;
						}

						if (ee.int_h != -1) {
							q.a(ee.int_h, (byte) -90);
							ee.int_h = -1;
							bd.a(false, 30);
						}

						if (~i.R != 0) {
							q.a(i.R, (byte) -90);
							i.R = -1;
						}

						if (sa.zb != -1) {
							q.a(sa.zb, (byte) -90);
							sa.zb = -1;
						}

						label1204:
						{
							if (var22 == ta.Yb) {
								ad.a(ta.Yb, (byte) -73);
								if (dummy == 0) {
									break label1204;
								}
							}

							q.a(ta.Yb, (byte) -90);
							ta.Yb = var22;
						}

						pe.l = true;
						ce.int_l = -1;
						db.F = true;
						if (~wb.int_db != -1) {
							w.h = true;
							wb.int_db = 0;
						}

						lc.a((byte) -126, ta.Yb);
						jd.currentIncomingPacket = -1;
						return true;
					}

					if (jd.currentIncomingPacket == 60) {
						var22 = lc.readStream.readUnsignedShort((byte) 104);
						jd.a(var22, (byte) -122);
						jd.currentIncomingPacket = -1;
						pc.int_d = ce.y;
						return true;
					}

					nd var29;
					if (jd.currentIncomingPacket == 167) {
						var22 = lc.readStream.d(false);
						var3 = lc.readStream.g((byte) -89);
						var4 = lc.readStream.c(false);
						var29 = bf.b('\uffff', var3);
						jd.currentIncomingPacket = -1;
						var29.Hb = var29.Pc + var4;
						var29.kb = var29.Ub + var22;
						return true;
					}

					nd var37;
					if (jd.currentIncomingPacket == 66) {
						var22 = lc.readStream.k((byte) -53);
						var37 = bf.b('\uffff', var22);
						var4 = 0;
						if (dummy == 0 && var37.ob.length <= var4) {
							jd.currentIncomingPacket = -1;
							return true;
						}

						do {
							var37.ob[var4] = -1;
							var37.ob[var4] = 0;
							++var4;
						} while (var37.ob.length > var4);

						jd.currentIncomingPacket = -1;
						return true;
					}

					if (jd.currentIncomingPacket == 21) {
						if (~ta.Sb != 0) {
							q.a(ta.Sb, (byte) -90);
							ta.Sb = -1;
						}

						wb.int_db = 1;
						kd.x = kd.rd_v;
						ad.boolean_v = false;
						jd.currentIncomingPacket = -1;
						w.h = true;
						return true;
					}

					if (jd.currentIncomingPacket == 57) {
						if (pd.g == 12) {
							db.F = true;
						}

						uc.lc = lc.readStream.readShort(1331464976);
						jd.currentIncomingPacket = -1;
						return true;
					}

					if (~jd.currentIncomingPacket == -195) {
						var22 = lc.readStream.readInt((byte) -40);
						var3 = lc.readStream.c(false);
						var23 = bf.b('\uffff', var22);
						if (var3 != var23.rb || var3 == -1) {
							var23.Lb = 0;
							var23.rb = var3;
							var23.cb = 0;
						}

						jd.currentIncomingPacket = -1;
						return true;
					}

					if (jd.currentIncomingPacket == 254) {
						var22 = lc.readStream.readUnsignedLEShort(255);
						var3 = lc.readStream.readUnsignedLEShortA((byte) 102);
						var4 = lc.readStream.g((byte) -89);
						var5 = lc.readStream.f(false);
						nd var44 = bf.b('\uffff', var4);
						var44.int_db = var5;
						var44.int_sd = var22;
						var44.int_id = var3;
						jd.currentIncomingPacket = -1;
						return true;
					}

					int var38;
					if (jd.currentIncomingPacket == 248) {
						db.F = true;
						var22 = lc.readStream.readInt((byte) -46);
						var3 = lc.readStream.readUnsignedLEShort(255);
						if (~var22 > 69999) {
							var3 += '耀';
						}

						label1181:
						{
							if (var22 >= 0) {
								var23 = bf.b('\uffff', var22);
								if (dummy == 0) {
									break label1181;
								}
							}

							var23 = null;
						}

						if (var23 != null) {
							var5 = 0;
							if (dummy != 0 || ~var23.ob.length < ~var5) {
								do {
									var23.ob[var5] = 0;
									var23.zc[var5] = 0;
									++var5;
								} while (~var23.ob.length < ~var5);
							}
						}

						pd.a(59, var3);
						var5 = lc.readStream.readUnsignedLEShort(255);
						var6 = 0;
						if (dummy == 0 && ~var5 >= ~var6) {
							jd.currentIncomingPacket = -1;
							pc.int_d = ce.y;
							return true;
						}

						do {
							var36 = lc.readStream.readUnsignedByteS(255);
							if (var36 == 255) {
								var36 = lc.readStream.k((byte) -53);
							}

							var38 = lc.readStream.readUnsignedLEShortA((byte) 111);
							if (var23 != null && ~var23.ob.length < ~var6) {
								var23.ob[var6] = var38;
								var23.zc[var6] = var36;
							}

							h.a(var3, 61, var36, -1 + var38, var6);
							++var6;
						} while (~var5 < ~var6);

						jd.currentIncomingPacket = -1;
						pc.int_d = ce.y;
						return true;
					}

					if (jd.currentIncomingPacket == 214) {
						le.updateTime = lc.readStream.f(flag) * 30;
						jd.currentIncomingPacket = -1;
						return true;
					}

					if (~jd.currentIncomingPacket == -92 || jd.currentIncomingPacket == 80 || ~jd.currentIncomingPacket == -179 || ~jd.currentIncomingPacket == -9 || ~jd.currentIncomingPacket == -191 || jd.currentIncomingPacket == 65 || ~jd.currentIncomingPacket == -245 || ~jd.currentIncomingPacket == -40 || jd.currentIncomingPacket == 152 || ~jd.currentIncomingPacket == -208 || jd.currentIncomingPacket == 17) {
						rd.a(false);
						jd.currentIncomingPacket = -1;
						return true;
					}

					if (~jd.currentIncomingPacket == -231) {
						bc.k = true;
						ec.int_n = lc.readStream.readUnsignedByte((byte) 116);
						wd.c = lc.readStream.readUnsignedByte((byte) 116);
						wc.l = lc.readStream.readUnsignedLEShort(255);
						lc.i = lc.readStream.readUnsignedByte((byte) 116);
						w.int_e = lc.readStream.readUnsignedByte((byte) 116);
						if (w.int_e >= 100) {
							var3 = 128 * wd.c + 64;
							var22 = 64 + 128 * ec.int_n;
							var4 = vc.a(ce.plane, var22, var3, (byte) 37) - wc.l;
							var5 = var22 - wc.d;
							var6 = var4 - u.vb;
							var36 = -pa.n + var3;
							var38 = (int) Math.sqrt((double) (var5 * var5 - -(var36 * var36)));
							nb.p = 2047 & (int) (Math.atan2((double) var6, (double) var38) * 325.949D);
							w.j = 2047 & (int) (Math.atan2((double) var5, (double) var36) * -325.949D);
							if (nb.p < 128) {
								nb.p = 128;
							}

							if (nb.p > 383) {
								nb.p = 383;
							}
						}

						jd.currentIncomingPacket = -1;
						return true;
					}

					if (~jd.currentIncomingPacket == -38) {
						var22 = lc.readStream.readUnsignedByteS(255);
						var3 = lc.readStream.readUnsignedByte((byte) 116);
						var4 = lc.readStream.c((byte) 117);
						ce.plane = var22 >> 1;
						af.td_p.a((byte) -121, ~(var22 & 1) == -2, var3, var4);
						jd.currentIncomingPacket = -1;
						return true;
					}

					if (~jd.currentIncomingPacket == -146) {
						cc.c((byte) -61);
						jd.currentIncomingPacket = -1;
						return false;
					}

					if (jd.currentIncomingPacket == 173) {
						var22 = lc.readStream.f(false);
						var3 = lc.readStream.readInt_V1((byte) 119);
						tc.G[var22] = var3;
						if (~var3 != ~ta.Pb[var22]) {
							ta.Pb[var22] = var3;
							kd.a((byte) -125, var22);
							if (b.int_ld != -1) {
								w.h = true;
							}

							db.F = true;
						}

						ec.int_i = ce.y;
						jd.currentIncomingPacket = -1;
						return true;
					}

					if (jd.currentIncomingPacket == 255) {
						var22 = lc.readStream.g((byte) -89);
						boolean var50 = ~lc.readStream.i(0) == -2;
						var23 = bf.b('\uffff', var22);
						jd.currentIncomingPacket = -1;
						var23.Jc = var50;
						return true;
					}

					if (jd.currentIncomingPacket == 112) {
						u.int_db = lc.readStream.readUnsignedShort((byte) -72);
						jd.currentIncomingPacket = -1;
						return true;
					}

					long var28;
					if (~jd.currentIncomingPacket == -16) {
						var22 = lc.readStream.k((byte) -53);
						var3 = lc.readStream.f(false);
						var4 = lc.readStream.k((byte) -53);
						if (~var3 == -65536) {
							var3 = -1;
						}

						var28 = (long) var3 + ((long) var22 << 32);
						je var42 = bd.Qb.a(-1, var28);
						if (var42 != null) {
							var42.d(-26669);
						}

						bd.Qb.a((byte) -7, var28, new ub(var4));
						jd.currentIncomingPacket = -1;
						return true;
					}

					if (jd.currentIncomingPacket == 129) {
						ke.int_mb = lc.readStream.readUnsignedByte((byte) 116);
						db.F = true;
						ec.int_i = ce.y;
						jd.currentIncomingPacket = -1;
						return true;
					}

					if (~jd.currentIncomingPacket == -20) {
						var22 = lc.readStream.f(flag);
						if (~var22 == -65536) {
							var22 = -1;
						}

						td.a(0, var22);
						jd.currentIncomingPacket = -1;
						return true;
					}

					if (jd.currentIncomingPacket == 34) {
						var22 = lc.readStream.f(false);
						if (~var22 == -65536) {
							var22 = -1;
						}

						var3 = lc.readStream.g(22604);
						gd.a(var22, var3, -69);
						jd.currentIncomingPacket = -1;
						return true;
					}

					if (jd.currentIncomingPacket == 220) {
						hb.a((byte) -106);
						jd.currentIncomingPacket = -1;
						return true;
					}

					if (jd.currentIncomingPacket == 211) {
						pb.d = lc.readStream.readUnsignedByte((byte) 116);
						jd.currentIncomingPacket = -1;
						return true;
					}

					long var9;
					long var35;
					if (~jd.currentIncomingPacket == -17) {
						var30 = lc.readStream.readLong(false);
						var35 = (long) lc.readStream.readUnsignedLEShort(255);
						long var43 = (long) lc.readStream.readMedInt((byte) -48);
						var38 = lc.readStream.readUnsignedByte((byte) 116);
						var9 = (var35 << 32) - -var43;
						boolean var45 = false;
						int var47 = 0;
						if (dummy != 0 || var47 < 100) {
							do {
								if (~var9 == ~wb.eb[var47]) {
									var45 = true;
									if (dummy == 0) {
										break;
									}
								}

								++var47;
							} while (var47 < 100);
						}

						if (~var38 >= -2) {
							int var13 = 0;
							if (dummy != 0 || var13 < nc.p) {
								do {
									if (var30 == md.p[var13]) {
										var45 = true;
										if (dummy == 0) {
											break;
										}
									}

									++var13;
								} while (var13 < nc.p);
							}
						}

						if (!var45 && ~client.int_ob == -1) {
							label1502:
							{
								wb.eb[bb.int_m] = var9;
								bb.int_m = (1 + bb.int_m) % 100;
								rd var49 = ie.a(0, lc.readStream).f(-115);
								if (~var38 == -3 || var38 == 3) {
									n.a(pc.a((byte) 127, new rd[]{
											le.rd_ab,
											ff.a(-26567, var30).e(-85)
									}), var49, true, 7);
									if (dummy == 0) {
										break label1502;
									}
								}

								if (~var38 != -2) {
									n.a(ff.a(-26567, var30).e(-118), var49, !flag, 3);
									if (dummy == 0) {
										break label1502;
									}
								}

								n.a(pc.a((byte) 125, new rd[]{
										ha.Z,
										ff.a(-26567, var30).e(-126)
								}), var49, true, 7);
							}
						}

						jd.currentIncomingPacket = -1;
						return true;
					}

					if (jd.currentIncomingPacket == 98) {
						var22 = lc.readStream.g((byte) -89);
						gd.ma_e = f.Nc.a(0, var22);
						jd.currentIncomingPacket = -1;
						return true;
					}

					if (jd.currentIncomingPacket == 246) {
						var22 = lc.readStream.g((byte) -89);
						var3 = lc.readStream.readUnsignedShort((byte) -127);
						var4 = lc.readStream.f(false);
						var29 = bf.b('\uffff', var22);
						jd.currentIncomingPacket = -1;
						var29.Nc = var4 + (var3 << 16);
						return true;
					}

					if (jd.currentIncomingPacket == 156) {
						var22 = lc.readStream.readUnsignedLEShortA((byte) 119);
						if (~var22 == -65536) {
							var22 = -1;
						}

						label1087:
						{
							var3 = lc.readStream.readUnsignedByteS(255);
							if (ta.Zb[var3] != var22) {
								q.a(ta.Zb[var3], (byte) -90);
								ta.Zb[var3] = var22;
								if (dummy == 0) {
									break label1087;
								}
							}

							ad.a(ta.Zb[var3], (byte) -124);
						}

						pe.l = true;
						db.F = true;
						lc.a((byte) -124, ta.Zb[var3]);
						jd.currentIncomingPacket = -1;
						return true;
					}

					if (~jd.currentIncomingPacket == -49) {
						var22 = lc.readStream.readUnsignedLEShortA((byte) 108);
						mb.a(!flag, var22);
						if (~ta.Yb != 0) {
							q.a(ta.Yb, (byte) -90);
							db.F = true;
							pe.l = true;
							ta.Yb = -1;
						}

						if (ee.int_h != -1) {
							q.a(ee.int_h, (byte) -90);
							ee.int_h = -1;
							bd.a(false, 30);
						}

						if (i.R != -1) {
							q.a(i.R, (byte) -90);
							i.R = -1;
						}

						if (sa.zb != -1) {
							q.a(sa.zb, (byte) -90);
							sa.zb = -1;
						}

						label1073:
						{
							if (var22 != ta.Sb) {
								q.a(ta.Sb, (byte) -90);
								ta.Sb = var22;
								if (dummy == 0) {
									break label1073;
								}
							}

							ad.a(ta.Sb, (byte) -101);
						}

						ce.int_l = -1;
						lc.a((byte) -128, ta.Sb);
						jd.currentIncomingPacket = -1;
						w.h = true;
						return true;
					}

					rd var24;
					if (~jd.currentIncomingPacket == -54) {
						label1503:
						{
							var24 = lc.readStream.readRSString(-1);
							boolean var32;
							if (!var24.a(-31152, ja.rd_n)) {
								if (var24.a(-31152, ab.rd_t)) {
									var40 = var24.b(var24.a((byte) 96, pc.colon), -23745, 0);
									var35 = var40.i(29486);
									var32 = false;
									var36 = 0;
									if (dummy != 0 || nc.p > var36) {
										do {
											if (~var35 == ~md.p[var36]) {
												var32 = true;
												if (dummy == 0) {
													break;
												}
											}

											++var36;
										} while (nc.p > var36);
									}

									if (var32 || ~client.int_ob != -1) {
										break label1503;
									}

									n.a(var40, pa.g, true, 8);
									if (dummy == 0) {
										break label1503;
									}
								}

								if (var24.a(-31152, ja.rd_e)) {
									var40 = var24.b(var24.a((byte) 78, pc.colon), -23745, 0);
									var35 = var40.i(29486);
									var32 = false;
									var36 = 0;
									if (dummy != 0 || ~nc.p < ~var36) {
										do {
											if (~var35 == ~md.p[var36]) {
												var32 = true;
												if (dummy == 0) {
													break;
												}
											}

											++var36;
										} while (~nc.p < ~var36);
									}

									if (var32 || client.int_ob != 0) {
										break label1503;
									}

									rd var8 = var24.b(var24.b(-29348) - 9, -23745, var24.a((byte) 84, pc.colon) + 1);
									n.a(var40, var8, true, 8);
									if (dummy == 0) {
										break label1503;
									}
								}

								n.a(kd.rd_v, var24, true, 0);
								if (dummy == 0) {
									break label1503;
								}
							}

							var40 = var24.b(var24.a((byte) 92, pc.colon), -23745, 0);
							var32 = false;
							var35 = var40.i(29486);
							var36 = 0;
							if (dummy != 0 || nc.p > var36) {
								do {
									if (~md.p[var36] == ~var35) {
										var32 = true;
										if (dummy == 0) {
											break;
										}
									}

									++var36;
								} while (nc.p > var36);
							}

							if (!var32 && ~client.int_ob == -1) {
								n.a(var40, md.u, !flag, 4);
							}
						}

						jd.currentIncomingPacket = -1;
						return true;
					}

					if (~jd.currentIncomingPacket == -90) {
						var30 = lc.readStream.readLong(false);
						rd var33 = ie.a(0, lc.readStream).f(-39);
						n.a(ff.a(-26567, var30).e(-118), var33, true, 6);
						jd.currentIncomingPacket = -1;
						return true;
					}

					if (~jd.currentIncomingPacket == -163) {
						ff.a(false, (byte) -85);
						jd.currentIncomingPacket = -1;
						return true;
					}

					if (~jd.currentIncomingPacket == -218) {
						var22 = lc.readStream.readUnsignedLEShort(255);
						var3 = lc.readStream.readUnsignedShort((byte) 92);
						mb.a(true, var3);
						if (var22 != -1) {
							mb.a(!flag, var22);
						}

						if (~sa.zb != 0) {
							q.a(sa.zb, (byte) -90);
							sa.zb = -1;
						}

						if (ta.Yb != -1) {
							q.a(ta.Yb, (byte) -90);
							ta.Yb = -1;
						}

						if (ta.Sb != -1) {
							q.a(ta.Sb, (byte) -90);
							ta.Sb = -1;
						}

						label997:
						{
							if (~var3 != ~ee.int_h) {
								q.a(ee.int_h, (byte) -90);
								ee.int_h = var3;
								bd.a(false, 35);
								if (dummy == 0) {
									break label997;
								}
							}

							ad.a(ee.int_h, (byte) -95);
						}

						label992:
						{
							if (~var3 == ~i.R) {
								ad.a(i.R, (byte) -109);
								if (dummy == 0) {
									break label992;
								}
							}

							q.a(i.R, (byte) -90);
							i.R = var22;
						}

						ce.int_l = -1;
						wb.int_db = 0;
						lc.a((byte) 110, ee.int_h);
						lc.a((byte) -124, i.R);
						jd.currentIncomingPacket = -1;
						return true;
					}

					if (~jd.currentIncomingPacket == -93) {
						var22 = lc.readStream.g((byte) -89);
						var3 = lc.readStream.readUnsignedShort((byte) -103);
						if (~var3 == -65536) {
							var3 = -1;
						}

						label1467:
						{
							var4 = lc.readStream.readInt_V1((byte) 126);
							var29 = bf.b('\uffff', var4);
							hc var26;
							if (!var29.gb) {
								if (var3 == -1) {
									jd.currentIncomingPacket = -1;
									var29.int_od = 0;
									return true;
								}

								var26 = u.a(var3, false);
								var29.int_id = var26.fc;
								var29.int_db = var26.Sb * 100 / var22;
								var29.int_od = 4;
								var29.int_kc = var3;
								var29.int_sd = var26.vb;
								if (dummy == 0) {
									break label1467;
								}
							}

							var29.Qc = var3;
							var29.gc = var22;
							var26 = u.a(var3, false);
							var29.ac = var26.wb;
							var29.int_db = var26.Sb;
							var29.ed = var26.ec;
							var29.int_sb = var26.Lb;
							var29.int_id = var26.fc;
							var29.int_sd = var26.vb;
							if (~var29.Bb < -1) {
								var29.int_db = 32 * var29.int_db / var29.Bb;
							}

							r.a(var29, (byte) -57);
						}

						jd.currentIncomingPacket = -1;
						return true;
					}

					if (~jd.currentIncomingPacket == -11) {
						if (pd.g == 12) {
							db.F = true;
						}

						qc.O = lc.readStream.readUnsignedByte((byte) 116);
						jd.currentIncomingPacket = -1;
						return true;
					}

					if (jd.currentIncomingPacket == 177) {
						var22 = lc.readStream.readUnsignedLEShort(255);
						mb.a(true, var22);
						if (~ta.Yb != 0) {
							q.a(ta.Yb, (byte) -90);
							ta.Yb = -1;
							pe.l = true;
							db.F = true;
						}

						if (ta.Sb != -1) {
							q.a(ta.Sb, (byte) -90);
							ta.Sb = -1;
							w.h = true;
						}

						if (ee.int_h != -1) {
							q.a(ee.int_h, (byte) -90);
							ee.int_h = -1;
							bd.a(flag, 30);
						}

						if (~i.R != 0) {
							q.a(i.R, (byte) -90);
							i.R = -1;
						}

						label969:
						{
							if (~var22 != ~sa.zb) {
								q.a(sa.zb, (byte) -90);
								sa.zb = var22;
								if (dummy == 0) {
									break label969;
								}
							}

							ad.a(sa.zb, (byte) -104);
						}

						ce.int_l = -1;
						if (~wb.int_db != -1) {
							wb.int_db = 0;
							w.h = true;
						}

						lc.a((byte) -122, sa.zb);
						jd.currentIncomingPacket = -1;
						return true;
					}

					if (~jd.currentIncomingPacket == -91) {
						var22 = lc.readStream.b((byte) 127);
						if (~var22 <= -1) {
							mb.a(true, var22);
						}

						if (~kd.t != ~var22) {
							q.a(kd.t, (byte) -90);
							kd.t = var22;
						}

						lc.a((byte) -123, kd.t);
						jd.currentIncomingPacket = -1;
						return true;
					}

					if (~jd.currentIncomingPacket == -246) {
						var22 = lc.readStream.g((byte) -89);
						var40 = lc.readStream.readRSString(-1);
						var23 = bf.b('\uffff', var22);
						var23.rd_ub = var40;
						if (var22 >> 16 == ta.Zb[pd.g]) {
							db.F = true;
						}

						jd.currentIncomingPacket = -1;
						return true;
					}

					if (jd.currentIncomingPacket == 132) {
						ff.a(true, (byte) -85);
						jd.currentIncomingPacket = -1;
						return true;
					}

					if (jd.currentIncomingPacket == 26) {
						var22 = 0;
						if (dummy != 0) {
							if (f.Lc[var22] != null) {
								f.Lc[var22].zc = -1;
							}

							++var22;
						}

						for ( ; f.Lc.length > var22 ; ++var22) {
							if (f.Lc[var22] != null) {
								f.Lc[var22].zc = -1;
							}
						}

						var3 = 0;
						if (dummy != 0) {
							if (ta.Nb[var3] != null) {
								ta.Nb[var3].zc = -1;
							}

							++var3;
						}

						for ( ; ~var3 > ~ta.Nb.length ; ++var3) {
							if (ta.Nb[var3] != null) {
								ta.Nb[var3].zc = -1;
							}
						}

						jd.currentIncomingPacket = -1;
						return true;
					}

					if (jd.currentIncomingPacket == 117) {
						uc.Vb = lc.readStream.readUnsignedByte((byte) 116);
						jd.currentIncomingPacket = -1;
						return true;
					}

					if (~jd.currentIncomingPacket == -4) {
						var30 = lc.readStream.readLong(false);
						byte var27 = lc.readStream.readByte(true);
						var28 = lc.readStream.readLong(false);
						long var34 = (long) lc.readStream.readUnsignedLEShort(255);
						boolean var14 = false;
						var9 = (long) lc.readStream.readMedInt((byte) -99);
						var12 = (var34 << 32) - -var9;
						int var11 = lc.readStream.readUnsignedByte((byte) 116);
						int var15 = 0;
						if (dummy != 0 || ~var15 > -101) {
							do {
								if (~wb.eb[var15] == ~var12) {
									var14 = true;
									if (dummy == 0) {
										break;
									}
								}

								++var15;
							} while (~var15 > -101);
						}

						if (~var11 >= -2) {
							int var16 = 0;
							if (dummy != 0 || ~var16 > ~nc.p) {
								do {
									if (~md.p[var16] == ~var30) {
										var14 = true;
										if (dummy == 0) {
											break;
										}
									}

									++var16;
								} while (~var16 > ~nc.p);
							}
						}

						if (!var14 && client.int_ob == 0) {
							label899:
							{
								wb.eb[bb.int_m] = var12;
								bb.int_m = (bb.int_m + 1) % 100;
								rd var52 = ie.a(0, lc.readStream).f(-66);
								rd var17 = pc.a((byte) 126, new rd[]{
										fb.doubleColon,
										ff.a(-26567, var28),
										qb.ob,
										bf.a(var27, -31766),
										va.e
								});
								if (~var11 != -3 && var11 != 3) {
									if (var11 == 1) {
										n.a(pc.a((byte) 127, new rd[]{
												var17,
												ha.Z,
												ff.a(-26567, var30).e(-73)
										}), var52, true, 7);
										if (dummy == 0) {
											break label899;
										}
									}

									n.a(pc.a((byte) 125, new rd[]{
											var17,
											ff.a(-26567, var30).e(-128)
									}), var52, true, 3);
									if (dummy == 0) {
										break label899;
									}
								}

								n.a(pc.a((byte) 125, new rd[]{
										var17,
										le.rd_ab,
										ff.a(-26567, var30).e(-98)
								}), var52, true, 7);
							}
						}

						jd.currentIncomingPacket = -1;
						return true;
					}

					if (jd.currentIncomingPacket == 137) {
						kd.A = lc.readStream.readRSString(-1);
						if (ta.Sb != -1) {
							q.a(ta.Sb, (byte) -90);
							ta.Sb = -1;
						}

						w.h = true;
						jd.currentIncomingPacket = -1;
						ad.boolean_v = false;
						kd.x = kd.rd_v;
						wb.int_db = 4;
						return true;
					}

					if (~jd.currentIncomingPacket == -164) {
						ge.X = lc.readStream.c((byte) 88);
						ce.A = lc.readStream.readUnsignedByteS(255);
						jd.currentIncomingPacket = -1;
						return true;
					}

					if (jd.currentIncomingPacket == 166) {
						pd.g = lc.readStream.c((byte) 96);
						pe.l = true;
						db.F = true;
						jd.currentIncomingPacket = -1;
						return true;
					}

					if (~jd.currentIncomingPacket == -142) {
						var22 = lc.readStream.readInt((byte) -78);
						var37 = bf.b('\uffff', var22);
						var37.int_od = 3;
						var37.int_kc = af.td_p.o_jd.b(70);
						jd.currentIncomingPacket = -1;
						return true;
					}

					if (jd.currentIncomingPacket == 83) {
						fc.int_r = lc.readStream.c((byte) 106);
						if (fc.int_r == pd.g) {
							label880:
							{
								if (~fc.int_r == -4) {
									pd.g = 1;
									if (dummy == 0) {
										break label880;
									}
								}

								pd.g = 3;
							}

							db.F = true;
						}

						jd.currentIncomingPacket = -1;
						return true;
					}

					if (~jd.currentIncomingPacket == -64) {
						db.F = true;
						var22 = lc.readStream.c((byte) 106);
						var3 = lc.readStream.c((byte) 111);
						var4 = lc.readStream.g((byte) -89);
						p.N[var22] = var4;
						ke.hb[var22] = var3;
						eb.ints_i[var22] = 1;
						var5 = 0;
						if (dummy == 0 && var5 >= 98) {
							ke.Pb = ce.y;
							jd.currentIncomingPacket = -1;
							return true;
						}

						do {
							if (~var4 <= ~a.ints_fb[var5]) {
								eb.ints_i[var22] = var5 - -2;
							}

							++var5;
						} while (var5 < 98);

						ke.Pb = ce.y;
						jd.currentIncomingPacket = -1;
						return true;
					}

					if (~jd.currentIncomingPacket == -156) {
						bc.k = true;
						wc.f = lc.readStream.readUnsignedByte((byte) 116);
						hf.int_pb = lc.readStream.readUnsignedByte((byte) 116);
						pb.r = lc.readStream.readUnsignedLEShort(255);
						jc.M = lc.readStream.readUnsignedByte((byte) 116);
						me.D = lc.readStream.readUnsignedByte((byte) 116);
						if (me.D >= 100) {
							wc.d = wc.f * 128 + 64;
							pa.n = 64 + 128 * hf.int_pb;
							u.vb = vc.a(ce.plane, wc.d, pa.n, (byte) 37) - pb.r;
						}

						jd.currentIncomingPacket = -1;
						return true;
					}

					if (~jd.currentIncomingPacket == -190) {
						var22 = lc.readStream.readUnsignedLEShort(255);
						var3 = lc.readStream.f(false);
						if (ta.Sb != -1) {
							q.a(ta.Sb, (byte) -90);
							ta.Sb = -1;
							w.h = true;
						}

						if (ee.int_h != -1) {
							q.a(ee.int_h, (byte) -90);
							ee.int_h = -1;
							bd.a(flag, 30);
						}

						if (~i.R != 0) {
							q.a(i.R, (byte) -90);
							i.R = -1;
						}

						label856:
						{
							if (sa.zb != var22) {
								q.a(sa.zb, (byte) -90);
								sa.zb = var22;
								if (dummy == 0) {
									break label856;
								}
							}

							ad.a(sa.zb, (byte) -113);
						}

						label851:
						{
							if (ta.Yb != var3) {
								q.a(ta.Yb, (byte) -90);
								ta.Yb = var3;
								if (dummy == 0) {
									break label851;
								}
							}

							ad.a(ta.Yb, (byte) -85);
						}

						pe.l = true;
						if (wb.int_db != 0) {
							w.h = true;
							wb.int_db = 0;
						}

						db.F = true;
						ce.int_l = -1;
						lc.a((byte) -121, sa.zb);
						lc.a((byte) -23, ta.Yb);
						jd.currentIncomingPacket = -1;
						return true;
					}

					if (~jd.currentIncomingPacket == -219) {
						var24 = lc.readStream.readRSString(-1);
						Object[] var31 = new Object[1 + var24.b(-29348)];
						var4 = var24.b(-29348) + -1;
						if (dummy == 0 && ~var4 > -1) {
							var31[0] = lc.readStream.readInt((byte) -90);
							m.a(var31, 0, 0, 0, 116, null, null);
							jd.currentIncomingPacket = -1;
							return true;
						}

						do {
							label834:
							{
								if (~var24.readUnsignedByte(var4, -14412) == -116) {
									var31[1 + var4] = lc.readStream.readRSString(-1);
									if (dummy == 0) {
										break label834;
									}
								}

								var31[1 + var4] = lc.readStream.readInt((byte) -23);
							}

							--var4;
						} while (~var4 <= -1);

						var31[0] = lc.readStream.readInt((byte) -90);
						m.a(var31, 0, 0, 0, 116, (nd) null, (nd) null);
						jd.currentIncomingPacket = -1;
						return true;
					}

					if (jd.currentIncomingPacket == 133) {
						la.a((byte) -116, l.incomingPacketSize, f.Nc, lc.readStream);
						jd.currentIncomingPacket = -1;
						return true;
					}

					if (~jd.currentIncomingPacket == -3) {
						nc.p = l.incomingPacketSize / 8;
						var22 = 0;
						if (dummy == 0 && var22 >= nc.p) {
							jd.currentIncomingPacket = -1;
							return true;
						}

						do {
							md.p[var22] = lc.readStream.readLong(false);
							++var22;
						} while (var22 < nc.p);

						jd.currentIncomingPacket = -1;
						return true;
					}

					if (jd.currentIncomingPacket == 138) {
						var22 = lc.readStream.readUnsignedShort((byte) 100);
						var3 = lc.readStream.readInt((byte) -77);
						var23 = bf.b('\uffff', var3);
						var23.int_kc = var22;
						var23.int_od = 1;
						jd.currentIncomingPacket = -1;
						return true;
					}

					if (~jd.currentIncomingPacket == -162) {
						if (~ta.Sb != 0) {
							q.a(ta.Sb, (byte) -90);
							ta.Sb = -1;
						}

						ad.boolean_v = false;
						w.h = true;
						jd.currentIncomingPacket = -1;
						wb.int_db = 2;
						kd.x = kd.rd_v;
						return true;
					}

					if (~jd.currentIncomingPacket == -73) {
						jd.currentIncomingPacket = -1;
						jb.M = 0;
						return true;
					}

					if (~jd.currentIncomingPacket == -101) {
						ge.X = lc.readStream.i(0);
						ce.A = lc.readStream.readUnsignedByteS(255);
						if (dummy != 0) {
							jd.currentIncomingPacket = lc.readStream.readUnsignedByte((byte) 116);
							rd.a(false);
						}

						while (l.incomingPacketSize > lc.readStream.pointer) {
							jd.currentIncomingPacket = lc.readStream.readUnsignedByte((byte) 116);
							rd.a(false);
						}

						jd.currentIncomingPacket = -1;
						return true;
					}

					if (jd.currentIncomingPacket == 74) {
						var22 = lc.readStream.readInt_V1((byte) 121);
						var3 = lc.readStream.readUnsignedShort((byte) -99);
						var4 = var3 >> 10 & 31;
						var5 = var3 >> 5 & 31;
						var6 = 31 & var3;
						nd var7 = bf.b('\uffff', var22);
						var7.Z = (var6 << 3) + (var5 << 11) + (var4 << 19);
						jd.currentIncomingPacket = -1;
						return true;
					}

					if (jd.currentIncomingPacket == 108) {
						var22 = lc.readStream.readUnsignedShort((byte) -103);
						byte var25 = lc.readStream.h(false);
						tc.G[var22] = var25;
						if (ta.Pb[var22] != var25) {
							ta.Pb[var22] = var25;
							kd.a((byte) -90, var22);
							if (b.int_ld != -1) {
								w.h = true;
							}

							db.F = true;
						}

						ec.int_i = ce.y;
						jd.currentIncomingPacket = -1;
						return true;
					}

					if (flag) {
						a(true);
					}

					if (jd.currentIncomingPacket == 67) {
						var22 = lc.readStream.g((byte) -89);
						var3 = lc.readStream.readUnsignedLEShortA((byte) 90);
						var23 = bf.b('\uffff', var22);
						if (var23 != null && var23.tb == 0) {
							if (var3 > -var23.Nb + var23.mb) {
								var3 = var23.mb - var23.Nb;
							}

							if (var3 < 0) {
								var3 = 0;
							}

							var23.int_ib = var3;
						}

						jd.currentIncomingPacket = -1;
						return true;
					}

					if (~jd.currentIncomingPacket == -242) {
						var22 = lc.readStream.readUnsignedByte((byte) 116);
						var3 = lc.readStream.readUnsignedByte((byte) 116);
						var4 = lc.readStream.readUnsignedByte((byte) 116);
						var5 = lc.readStream.readUnsignedByte((byte) 116);
						df.booleans_v[var22] = true;
						i.I[var22] = var3;
						ld.ints_o[var22] = var4;
						uc.hc[var22] = var5;
						df.ints_g[var22] = 0;
						jd.currentIncomingPacket = -1;
						return true;
					}

					se.a((byte) -122, null, "T1 - " + jd.currentIncomingPacket + "," + db.H + "," + vc.I + " - " + l.incomingPacketSize);
					cc.c((byte) -61);
				} catch (IOException var19) {
					n.g(32129);
				} catch (Exception var20) {
					String var2 = "T2 - " + jd.currentIncomingPacket + "," + db.H + "," + vc.I + " - " + l.incomingPacketSize + "," + (kd.int_w + af.td_p.xc[0]) + "," + (af.td_p.Hc[0] + jc.X) + " - ";
					var3 = 0;
					if (dummy != 0 || l.incomingPacketSize > var3 && var3 < 50) {
						do {
							var2 = var2 + lc.readStream.buffer[var3] + ",";
							++var3;
						} while (l.incomingPacketSize > var3 && var3 < 50);
					}

					se.a((byte) 15, var20, var2);
					cc.c((byte) -61);
				}

				return true;
			}
		} catch (RuntimeException var21) {
			throw id.a(var21, "ib.C(" + flag + ')');
		}
	}

	static he a (pb archiveFile8, int i, int index, int unused) {
		try {
			++g;
			return !t.a(index, (byte) -126, i, archiveFile8) ? null : la.a((byte) 99);
		} catch (RuntimeException var5) {
			throw id.a(var5, "ib.A(" + (archiveFile8 != null ? "{...}" : "null") + ',' + i + ',' + index + ',' + unused + ')');
		}
	}
}
