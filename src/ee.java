import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

abstract class ee {
	static int int_a;
	static int int_b;
	static dd dd_c = new dd(64);
	static int int_d;
	static int int_e;
	static int[] ints_f;
	static int int_g;
	static int int_h = -1;
	static int int_i;
	static int[] ints_j = new int[4000];
	static int[] ints_k = new int[200];
	static rd rd_l;
	static rd startingGameEngine2;
	static volatile boolean boolean_o = true;
	static int int_p;
	static rd rd_r = md.a((String) "Lade Texturen )2 ", (byte) 121);
	static int int_s;
	static rd rd_t = null;
	static rd friends2;
	static rd rd_v;
	static rd serviceUnavailable2;
	static int y;
	static rd z;
	private static rd friends = md.a((String) "Friends", (byte) 123);
	private static rd serviceUnavailable;
	private static rd startingGameEngine;

	static {
		friends2 = friends;
		rd_l = md.a("zur-Uck auf die RuneScape)2Webseite gehen", (byte) 119);
		serviceUnavailable = md.a("Service unavailable)3", (byte) 121);
		z = md.a("Wir vermuten)1 dass Ihr Konto gestohlen wurde", (byte) 117);
		rd_v = md.a("@yel@*V", (byte) 126);
		serviceUnavailable2 = serviceUnavailable;
		startingGameEngine = md.a("Starting game engine)3)3)3", (byte) 115);
		startingGameEngine2 = startingGameEngine;
	}

	static void a (int unused) {
		try {
			++int_d;
			while (lc.readStream.k(-117, l.incomingPacketSize) >= 27) {
				int i = lc.readStream.readBits((byte) 87, 15);
				if (i == 32767) {
					break;
				}

				boolean flag = false;
				if (ta.Nb[i] == null) {
					ta.Nb[i] = new b();
					flag = true;
				}

				b class_b = ta.Nb[i];
				ca.ints_b[lc.q++] = i;
				class_b.Pb = ce.y;
				int i1 = lc.readStream.readBits((byte) 41, 5);
				class_b.tb_md = hb.a(lc.readStream.readBits((byte) 121, 13), (byte) 48);
				if (i1 > 15) {
					i1 -= 32;
				}

				int i2 = ca.ints_o[lc.readStream.readBits((byte) 65, 3)];
				if (flag) {
					class_b.Bb = i2;
				}

				int i3 = lc.readStream.readBits((byte) 127, 5);
				int i4 = lc.readStream.readBits((byte) 18, 1);
				if (i3 > 15) {
					i3 -= 32;
				}

				if (i4 == 1) {
					sb.ints_o[gf.int_q++] = i;
				}

				int i5 = lc.readStream.readBits((byte) 91, 1);
				class_b.int_oc = class_b.tb_md.xb;
				class_b.int_sc = class_b.tb_md.vb;
				class_b.Xb = class_b.tb_md.Ib;
				if (class_b.Xb == 0) {
					class_b.Bb = 0;
				}

				class_b.Rb = class_b.tb_md.Ob;
				class_b.int_kc = class_b.tb_md.Mb;
				class_b.xb = class_b.tb_md.Bb;
				class_b.yb = class_b.tb_md.int_pb;
				class_b.Gc = class_b.tb_md.Ub;
				class_b.int_fc = class_b.tb_md.int_eb;
				class_b.a((byte) -121, i5 == 1, i1 + af.td_p.Hc[0], af.td_p.xc[0] + i3);
			}

			lc.readStream.finishBitAccess((byte) 61);
		} catch (RuntimeException var10) {
			throw id.a(var10, "ee.K(" + unused + ')');
		}
	}

	static int a (int archiveCacheId, int unused, int fileId) {
		try {
			++int_s;
			long requestFile = (long) (fileId + (archiveCacheId << 16));
			return pd.V != null && requestFile == pd.V.script ? 1 + (te.Qb.pointer * 99 / (-pd.V.compressionType + te.Qb.buffer.length)) : 0;
		} catch (RuntimeException var5) {
			throw id.a(var5, "ee.H(" + archiveCacheId + ',' + unused + ',' + fileId + ')');
		}
	}

	static gb a (pb cacheFile8, byte unused, rd emptyString, rd fontName) {
		try {
			++int_g;
			int index = cacheFile8.a(fontName, (byte) -108);
			int i1 = cacheFile8.a(emptyString, -31757, index);
			return od.a(-104, index, cacheFile8, i1);
		} catch (RuntimeException var6) {
			throw id.a(var6, "ee.G(" + (cacheFile8 != null ? "{...}" : "null") + ',' + unused + ',' + (emptyString != null ? "{...}" : "null") + ',' + (fontName != null ? "{...}" : "null") + ')');
		}
	}

	static void b (int unused) {
		try {
			w.bytes_s = null;
			sd.bb = null;
			++int_p;
			ra.q = null;
			e.yb = null;
			w.ints_a = null;
			eb.ints_g = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "ee.I(" + unused + ')');
		}
	}

	@SuppressWarnings("SynchronizeOnNonFinalField")
	static void d (int unused) {
		try {
			synchronized (f.Ac) {
				if (fc.int_n != 0) {
					fc.int_n = 1;

					try {
						f.Ac.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

			++int_e;
		} catch (RuntimeException var7) {
			throw id.a(var7, "ee.D(" + unused + ')');
		}
	}

	static void a (boolean unused) {
		try {
			int i1 = -1;
			if (we.f == 0 && !tc.K) {
				++ke.rb;
				ab.a(pb.H, kd.rd_v, la.t, (byte) 124, 19, qc.walkHere2, 0);
			}

			int i2 = 0;
			if (ue.yc <= i2) {
				++int_i;
			} else {
				do {
					int value = ue.ic[i2];
					int x = 127 & value;
					int y = 127 & value >> 7;
					int i6 = (value & 1649534694) >> 29;
					int fileRequest = (536858725 & value) >> 14;
					if (i1 != value) {
						i1 = value;
						int i3;
						if (i6 == 2 && pc.o.b(ce.plane, x, y, value) >= 0) {
							bd class_bd = ub.a(-62, fileRequest);
							if (class_bd.Jb != null) {
								class_bd = class_bd.g(-1);
							}

							if (class_bd != null) {
								if (we.f != 1) {
									if (tc.K) {
										if ((d.int_g & 4) == 4) {
											++gf.int_a;
											ab.a(x, pc.a((byte) 127, new rd[]{rd_t, o.z, class_bd.Lb}), y, (byte) 126, 8, sd.P, value);
										}
									} else {
										++ab.int_f;
										rd[] class_rds = class_bd.Zb;
										if (qb.kb) {
											class_rds = e.a(110, class_rds);
										}

										if (class_rds != null) {
											i3 = 4;
											do {
												if (class_rds[i3] != null) {
													++cf.int_e;
													short s = 0;
													if (i3 == 0) {
														s = 52;
													} else if (i3 == 1) {
														s = 5;
													} else if (i3 == 2) {
														s = 46;
													} else if (i3 == 3) {
														s = 13;
													} else if (i3 == 4) {
														s = 1002;
													}

													ab.a(x, pc.a((byte) 127, new rd[]{ra.cyanText, class_bd.Lb}), y, (byte) 125, s, class_rds[i3], value);
												}

												--i3;
											} while (i3 >= 0);
										} else {
											ab.a(x, pc.a((byte) 126, new rd[]{ra.cyanText, class_bd.Lb}), y, (byte) 125, 1003, tb.examine2, class_bd.int_ab << 14);
										}
									}
								} else {
									++mb.s;
									ab.a(x, pc.a((byte) 126, new rd[]{ca.rd_d, o.z, class_bd.Lb}), y, (byte) 122, 51, sa.use2, value);
								}
							}
						} else if (i6 == 1) {
							b class_b = ta.Nb[fileRequest];
							if (class_b.tb_md.Mb == 1 && (class_b.x_ & 127) == 64 && (class_b.y_ & 127) == 64) {
								int i4 = 0;
								if (i4 < lc.q) {
									do {
										b class_b2 = ta.Nb[ca.ints_b[i4]];
										if (class_b2 != null && class_b2 != class_b && ~class_b2.tb_md.Mb == -2 && class_b2.x_ == class_b.x_ && class_b2.y_ == class_b.y_) {
											ha.a((byte) -86, x, ca.ints_b[i4], y, class_b2.tb_md);
										}

										++i4;
									} while (i4 < lc.q);
								}

								i3 = 0;
								if (b.int_hd > i3) {
									do {
										td class_td = f.Lc[rd_r.stringBuffer[i3]];
										if (class_td != null && class_b.x_ == class_td.x_ && class_td.y_ == class_b.y_) {
											va.a(y, 14, x, class_td, r.R[i3]);
										}

										++i3;
									} while (b.int_hd > i3);
								}
							}

							ha.a((byte) -90, x, fileRequest, y, class_b.tb_md);
						} else if (i6 == 0) {
							td class_td = f.Lc[fileRequest];
							if ((class_td.x_ & 127) == 64 && (class_td.y_ & 127) == 64) {
								int i4 = 0;
								if (lc.q > i4) {
									do {
										b class_b = ta.Nb[ca.ints_b[i4]];
										if (class_b != null && class_b.tb_md.Mb == 1 && class_b.x_ == class_td.x_ && class_b.y_ == class_td.y_) {
											ha.a((byte) -86, x, ca.ints_b[i4], y, class_b.tb_md);
										}

										++i4;
									} while (lc.q > i4);
								}

								i3 = 0;
								if (b.int_hd > i3) {
									do {
										td class_td2 = f.Lc[rd_r.stringBuffer[i3]];
										if (class_td2 != null && class_td2 != class_td && class_td2.x_ == class_td.x_ && class_td2.y_ == class_td.y_) {
											va.a(y, 14, x, class_td2, rd_r.stringBuffer[i3]);
										}

										++i3;
									} while (b.int_hd > i3);
								}
							}

							va.a(y, 14, x, class_td, fileRequest);
						} else if (i6 == 3) {
							md class_md = lc.s[ce.plane][x][y];
							if (class_md != null) {
								od class_od = (od) class_md.b((byte) 24);
								if (class_od != null) {
									do {
										hc class_hc = u.a(class_od.xb, false);
										if (we.f == 1) {
											ab.a(x, pc.a((byte) 127, new rd[]{ca.rd_d, dc.rd_q, class_hc.Rb}), y, (byte) 124, 38, sa.use2, class_od.xb);
											++fb.int_f;
										} else {
											if (tc.K) {
												if ((1 & d.int_g) == 1) {
													ab.a(x, pc.a((byte) 127, new rd[]{rd_t, dc.rd_q, class_hc.Rb}), y, (byte) 122, 33, sd.P, class_od.xb);
													++ee.y;
												}
											} else {
												++i.E;
												rd[] class_rds = class_hc.Bb;
												if (qb.kb) {
													class_rds = e.a(124, class_rds);
												}

												int i4 = 4;
												do {
													if (class_rds != null && class_rds[i4] != null) {
														++j.fb;
														byte b = 0;
														if (i4 == 0) {
															b = 58;
														} else if (i4 == 1) {
															b = 44;
														} else if (i4 == 2) {
															b = 3;
														} else if (i4 == 3) {
															b = 56;
														} else if (i4 == 4) {
															b = 18;
														}

														ab.a(x, pc.a((byte) 125, new rd[]{db.lightRedText, class_hc.Rb}), y, (byte) 121, b, class_rds[i4], class_od.xb);
													} else {
														if (i4 == 2) {
															ab.a(x, pc.a((byte) 127, new rd[]{db.lightRedText, class_hc.Rb}), y, (byte) 119, 3, cf.take2, class_od.xb);
															++wb.ib;
														}
													}

													--i4;
												} while (i4 >= 0);

												ab.a(x, pc.a((byte) 127, new rd[]{db.lightRedText, class_hc.Rb}), y, (byte) 125, 1001, tb.examine2, class_od.xb);
											}
										}

										class_od = (od) class_md.c(-117);
									} while (class_od != null);
								}
							}
						}
					}

					++i2;
				} while (ue.yc > i2);
				++int_i;
			}
		} catch (RuntimeException var15) {
			throw id.a(var15, "ee.E(" + unused + ')');
		}
	}

	public static void f (int unused) {
		try {
			friends = null;
			dd_c = null;
			startingGameEngine2 = null;
			serviceUnavailable = null;
			ints_j = null;
			rd_t = null;
			rd_l = null;
			rd_v = null;
			z = null;
			friends2 = null;
			serviceUnavailable2 = null;
			startingGameEngine = null;
			ints_f = null;
			rd_r = null;
			ints_k = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "ee.F(" + unused + ')');
		}
	}

	static byte[] a (byte[] buf, boolean unused) {
		try {
			++int_b;
			id class_id = new id(buf);
			int i = class_id.readUnsignedByte((byte) 116);
			int length = class_id.readInt((byte) -107);
			if (length >= 0 && (le.int_db == 0 || length <= le.int_db)) {
				if (i == 0) {
					byte[] bytes = new byte[length];
					class_id.readBytes(length, bytes, (byte) 112, 0);
					return bytes;
				} else {
					int capacity = class_id.readInt((byte) -89);
					if (capacity >= 0 && (le.int_db == 0 || capacity <= le.int_db)) {
						if (capacity >= 2000000) {
							return new byte[100];
						}
						byte[] bufferRead = new byte[capacity];
						if (i == 1) {
							fd.a(bufferRead, capacity, buf, length, 9);
						} else {
							try {
								DataInputStream dataInputStream = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(buf, 9, length)));
								dataInputStream.readFully(bufferRead);
								dataInputStream.close();
							} catch (IOException e) {
								e.printStackTrace();
							}
						}
						return bufferRead;
					} else {
						return new byte[100];
					}
				}
			} else {
				return new byte[100];
			}
		} catch (RuntimeException var9) {
			throw id.a(var9, "ee.J(" + (buf != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}

	abstract int b (int i, int i1, int unused);

	abstract void c (int unused);

	abstract void e (int unused);
}
