import java.io.EOFException;
import java.io.IOException;

final class d {
	static rd connectingToFriendserver2;
	static he[] headicons_hint;
	static rd rd_e;
	static int int_g;
	static int int_h;
	static int int_i;
	static byte[][][] bytes_j;
	static int int_k = 0;
	static rd backbase1 = md.a((String) "backbase1", (byte) 124);
	static int int_m;
	static int int_p;
	static int int_q;
	static rd rd_r = md.a((String) "blaugr-Un:", (byte) 120);
	static rd rd_s;
	static int int_t;
	static int int_u;
	static int int_v;
	static int int_w;
	static rd mapmarker;
	static int y;
	private static rd connectingToFriendserver = md.a((String) "Connecting to friendserver", (byte) 117);

	static {
		connectingToFriendserver2 = connectingToFriendserver;
		mapmarker = md.a("mapmarker", (byte) 123);
		rd_s = md.a("Weiter", (byte) 124);
		rd_e = md.a(":0", (byte) 127);
		bytes_j = new byte[4][104][104];
	}

	private int int_a = '\ufde8';
	private int archiveCacheFileId;
	private bb cacheDat2 = null;
	private bb cacheIDX = null;

	d (int archiveCacheFileId, bb cacheDat2, bb cacheIDX, int i) {
		try {
			this.archiveCacheFileId = archiveCacheFileId;
			this.cacheDat2 = cacheDat2;
			this.cacheIDX = cacheIDX;
			this.int_a = i;
		} catch (RuntimeException var6) {
			throw id.a(var6, "d.<init>(" + archiveCacheFileId + ',' + (cacheDat2 != null ? "{...}" : "null") + ',' + (cacheIDX != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public static void a (int unused) {
		try {
			mapmarker = null;
			backbase1 = null;
			connectingToFriendserver = null;
			rd_s = null;
			headicons_hint = null;
			rd_r = null;
			bytes_j = null;
			connectingToFriendserver2 = null;
			rd_e = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "d.G(" + unused + ')');
		}
	}

	static void a (f class_f, boolean unused) {
		try {
			class_f.zb = false;
			++y;
			if (class_f.int_lc != -1) {
				e class_e = bd.a(class_f.int_lc, false);
				if (class_e == null || class_e.Gb == null) {
					class_f.int_lc = -1;
				} else {
					++class_f.Vb;
					if (class_e.Gb.length > class_f.Fb && class_f.Vb > class_e.Eb[class_f.Fb]) {
						++class_f.Fb;
						class_f.Vb = 1;
						dd.a(class_f.Fb, 6693, class_f.x_, class_e, class_f.y_);
					}

					if (class_f.Fb >= class_e.Gb.length) {
						class_f.Fb = 0;
						class_f.Vb = 0;
						dd.a(class_f.Fb, 6693, class_f.x_, class_e, class_f.y_);
					}
				}
			}

			if (class_f.Wb != -1 && ce.y >= class_f.Hb) {
				if (class_f.int_tc < 0) {
					class_f.int_tc = 0;
				}

				//noinspection ConstantConditions
				int var6 = l.a(true, class_f.Wb).xb;
				if (var6 == -1) {
					class_f.Wb = -1;
				} else {
					e var3 = bd.a(var6, false);
					if (var3 != null && var3.Gb != null) {
						++class_f.Sb;
						if (~var3.Gb.length < ~class_f.int_tc && class_f.Sb > var3.Eb[class_f.int_tc]) {
							++class_f.int_tc;
							class_f.Sb = 1;
							dd.a(class_f.int_tc, 6693, class_f.x_, var3, class_f.y_);
						}

						if (class_f.int_tc >= var3.Gb.length && (class_f.int_tc < 0 || class_f.int_tc >= var3.Gb.length)) {
							class_f.Wb = -1;
						}
					} else {
						class_f.Wb = -1;
					}
				}
			}

			if (class_f.zc != -1 && class_f.Gb <= 1) {
				e class_e = bd.a(class_f.zc, false);
				if (class_e.Ob == 1 && class_f.int_rc > 0 && ce.y >= class_f.int_uc && ce.y > class_f.Ib) {
					class_f.Gb = 1;
					return;
				}
			} else if (class_f.zc != -1 && class_f.Gb == 0) {
				e class_e = bd.a(class_f.zc, false);
				if (class_e == null || class_e.Gb == null) {
					class_f.zc = -1;
				} else {
					++class_f.Ec;
					if (class_f.int_tb < class_e.Gb.length && class_f.Ec > class_e.Eb[class_f.int_tb]) {
						++class_f.int_tb;
						class_f.Ec = 1;
						dd.a(class_f.int_tb, 6693, class_f.x_, class_e, class_f.y_);
					}

					if (class_f.int_tb >= class_e.Gb.length) {
						++class_f.int_vb;
						class_f.int_tb -= class_e.Bb;
						if (class_f.int_vb < class_e.int_ab) {
							if (class_f.int_tb < 0 || class_f.int_tb >= class_e.Gb.length) {
								class_f.zc = -1;
							} else {
								dd.a(class_f.int_tb, 6693, class_f.x_, class_e, class_f.y_);
							}
						} else {
							class_f.zc = -1;
						}
					}

					class_f.zb = class_e.boolean_rb;
				}
			}

			if (class_f.Gb > 0) {
				--class_f.Gb;
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "d.I(" + "{...}" + ',' + unused + ')');
		}
	}

	static void a (int i, int i1, int i2, int unused, int i4, int i5, nd[] class_nds, int i6, int i7, int i8) {
		try {
			int i9 = 0;
			if (i9 >= class_nds.length) {
				++int_h;
			} else {
				do {
					nd class_nd = class_nds[i9];
					if (class_nd != null && (class_nd.tb == 0 || class_nd.jb) && class_nd.Uc == i1 && !se.a(class_nd, true)) {
						int i3 = i8 + class_nd.kb - i2;
						int i10 = i3 + class_nd.Bb;
						int i11 = i8 < i3 ? i3 : i8;
						int i12 = i5 > i10 ? i10 : i5;
						int i13 = class_nd.Hb + i - i6;
						int i14 = i13 + class_nd.Nb;
						int i15 = i13 <= i ? i : i13;
						int i16 = i14 >= i4 ? i4 : i14;
						if (class_nd.tb == 0) {
							a(i15, class_nd.dc, class_nd.Mb + -i3 + i11, 325, i16, i12, class_nds, -i13 + i15 + class_nd.int_ib, i7, i11);
							if (class_nd.Ab != null) {
								a(i15, class_nd.dc, class_nd.Mb + -i3 + i11, 325, i16, i12, class_nd.Ab, class_nd.int_ib + -i13 + i15, i7, i11);
							}
						}

						if (class_nd.jb) {
							boolean flag;
							flag = i11 <= pb.H && i15 <= la.t && pb.H < i12 && la.t < i16;

							boolean flag2 = false;
							if (s.zb == 1 && flag) {
								flag2 = true;
							}

							boolean flag3 = false;
							if (client.int_qb == 1 && wb.nb >= i11 && i15 <= sb.int_b && i12 > wb.nb && i16 > sb.int_b) {
								flag3 = true;
							}

							if (flag3 && be.nd_c == null && (i7 & 512) != 0 && !s.ub && t.a(class_nd, 104) != null) {
								be.nd_c = class_nd;
								ja.int_d = pb.H;
								ca.boolean_f = false;
								ub.C = 0;
								la.v = la.t;
							}

							if (be.nd_c != null || s.ub) {
								flag = false;
								flag3 = false;
								flag2 = false;
							}

							if (!class_nd.oc && flag3 && (i7 & 1) != 0) {
								class_nd.oc = true;
								if (class_nd.Jb != null) {
									m.a(class_nd.Jb, wb.nb - i3, 0, -i13 + sb.int_b, 75, null, class_nd);
								}
							}

							if (class_nd.oc && flag2 && (4 & i7) != 0 && class_nd.Wb != null) {
								m.a(class_nd.Wb, -i3 + pb.H, 0, -i13 + la.t, 77, null, class_nd);
							}

							if (class_nd.oc && !flag2 && (2 & i7) != 0) {
								class_nd.oc = false;
								if (class_nd.Ec != null) {
									m.a(class_nd.Ec, pb.H - i3, 0, -i13 + la.t, 28, null, class_nd);
								}
							}

							if (flag2 && (i7 & 8) != 0 && class_nd.cd != null) {
								m.a(class_nd.cd, -i3 + pb.H, 0, -i13 + la.t, 125, null, class_nd);
							}

							if (!class_nd.Ic && flag && (16 & i7) != 0) {
								class_nd.Ic = true;
								if (class_nd.Cb != null) {
									m.a(class_nd.Cb, pb.H - i3, 0, -i13 + la.t, 37, null, class_nd);
								}
							}

							if (class_nd.Ic && flag && ~(i7 & 64) != -1 && class_nd.vd != null) {
								m.a(class_nd.vd, -i3 + pb.H, 0, la.t - i13, 83, null, class_nd);
							}

							if (class_nd.Ic && !flag && ~(32 & i7) != -1) {
								class_nd.Ic = false;
								if (class_nd.Mc != null) {
									m.a(class_nd.Mc, pb.H + -i3, 0, la.t - i13, 46, null, class_nd);
								}
							}

							if (class_nd.Eb != null && (i7 & 128) != 0) {
								m.a(class_nd.Eb, 0, 0, 0, 84, null, class_nd);
							}

							if (flag && ce.int_g != 0 && class_nd.wc != null && (1024 & i7) != 0) {
								m.a(class_nd.wc, 0, 0, ce.int_g, 43, null, class_nd);
							}

							if ((i7 & 256) != 0) {
								if (class_nd.yc < ec.int_i && class_nd.objects_ld != null) {
									m.a(class_nd.objects_ld, 0, 0, 0, 75, null, class_nd);
								}

								if (class_nd.yc < pc.int_d && class_nd.objects_cc != null) {
									m.a(class_nd.objects_cc, 0, 0, 0, 29, null, class_nd);
								}

								if (class_nd.yc < ke.Pb && class_nd.Oc != null) {
									m.a(class_nd.Oc, 0, 0, 0, 65, null, class_nd);
								}

								class_nd.yc = ce.y;
							}
						}
					}

					++i9;
				} while (i9 < class_nds.length);

				++int_h;
			}
		} catch (RuntimeException var24) {
			throw id.a(var24, "d.E(" + i + ',' + i1 + ',' + i2 + ',' + unused + ',' + i4 + ',' + i5 + ',' + "{...}" + ',' + i6 + ',' + i7 + ',' + i8 + ')');
		}
	}

	static void a (int i, int fileId, int i2, int unused) {
		try {
			++int_u;
			if (i2 == 1) {
				ie.writeStream.writeOpcode(8, 149);
				ie.writeStream.writeInt(-7155, fileId);
				ie.writeStream.writeShort(i, (byte) 38);
				++cf.int_t;
			} else if (i2 == 2) {
				ie.writeStream.writeOpcode(8, 116);
				ie.writeStream.writeInt(-7155, fileId);
				ie.writeStream.writeShort(i, (byte) 8);
				++ld.i;
			} else if (i2 == 3) {
				++je.int_n;
				ie.writeStream.writeOpcode(8, 1);
				ie.writeStream.writeInt(-7155, fileId);
				ie.writeStream.writeShort(i, (byte) 14);
			} else if (i2 == 4) {
				ie.writeStream.writeOpcode(8, 3);
				++s.sb;
				ie.writeStream.writeInt(-7155, fileId);
				ie.writeStream.writeShort(i, (byte) 38);
			} else if (i2 == 5) {
				ie.writeStream.writeOpcode(8, 12);
				++p.I;
				ie.writeStream.writeInt(-7155, fileId);
				ie.writeStream.writeShort(i, (byte) 117);
			} else if (i2 == 6) {
				ie.writeStream.writeOpcode(8, 173);
				++o.p;
				ie.writeStream.writeInt(-7155, fileId);
				ie.writeStream.writeShort(i, (byte) 53);
			} else if (i2 == 7) {
				ie.writeStream.writeOpcode(8, 112);
				ie.writeStream.writeInt(-7155, fileId);
				ie.writeStream.writeShort(i, (byte) 106);
				++dd.int_o;
			} else if (i2 == 8) {
				++kd.k;
				ie.writeStream.writeOpcode(8, 111);
				ie.writeStream.writeInt(-7155, fileId);
				ie.writeStream.writeShort(i, (byte) 49);
			} else if (i2 == 9) {
				++r.O;
				ie.writeStream.writeOpcode(8, 232);
				ie.writeStream.writeInt(-7155, fileId);
				ie.writeStream.writeShort(i, (byte) 38);
			} else if (i2 == 10) {
				++nc.b;
				ie.writeStream.writeOpcode(8, 64);
				ie.writeStream.writeInt(-7155, fileId);
				ie.writeStream.writeShort(i, (byte) 77);
			}

			nd class_nd = o.a((byte) -107, fileId, i);
			if (class_nd != null && class_nd.objects_md != null) {
				m.a(class_nd.objects_md, 0, i2, 0, 126, null, class_nd);
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "d.J(" + i + ',' + fileId + ',' + i2 + ',' + unused + ')');
		}
	}

	static boolean a (byte unused, int y, int value, int x) {
		try {
			++int_m;
			int fileRequest = (value & 536862737) >> 14;
			int i1 = pc.o.b(ce.plane, x, y, value);
			if (i1 == -1) {
				return false;
			} else {
				int position = 31 & i1;
				int goalOrientation = i1 >> 6 & 3;
				if (position == 10 || position == 11 || position == 22) {
					int goalDX;
					int goalDY;
					bd class_bd = ub.a(-82, fileRequest);
					if (goalOrientation == 0 || goalOrientation == 2) {
						goalDX = class_bd.w;
						goalDY = class_bd.h;
					} else {
						goalDX = class_bd.h;
						goalDY = class_bd.w;
					}

					int surroundings = class_bd.int_db;
					if (goalOrientation != 0) {
						surroundings = (surroundings >> 4 + -goalOrientation) + (surroundings << goalOrientation & 15);
					}

					bb.a(x, af.td_p.Hc[0], af.td_p.xc[0], 2, true, y, goalDY, surroundings, -106, 0, 0, goalDX);
				} else {
					bb.a(x, af.td_p.Hc[0], af.td_p.xc[0], 2, true, y, 0, 0, -96, goalOrientation, position + 1, 0);
				}

				b.int_ed = 0;
				ja.int_k = sb.int_b;
				q.y = 2;
				ka.Rb = wb.nb;
				return true;
			}
		} catch (RuntimeException var13) {
			throw id.a(var13, "d.F(" + unused + ',' + y + ',' + value + ',' + x + ')');
		}
	}

	static int b (int unused) {
		try {
			++int_v;
			int i = vc.a(ce.plane, wc.d, pa.n, (byte) 37);
			return -u.vb + i < 800 && (bytes_j[ce.plane][wc.d >> 7][pa.n >> 7] & 4) != 0 ? ce.plane : 3;
		} catch (RuntimeException var2) {
			throw id.a(var2, "d.H(" + unused + ')');
		}
	}

	static void c (int unused) {
		try {
			ec.dd_g.c(-117);
			gf.dd_g.c(-106);
			++int_w;
		} catch (RuntimeException var2) {
			throw id.a(var2, "d.B(" + unused + ')');
		}
	}

	public final String toString () {
		try {
			++int_p;
			return "Cache:" + this.archiveCacheFileId;
		} catch (RuntimeException var2) {
			throw id.a(var2, "d.toString(" + ')');
		}
	}

	@SuppressWarnings("SynchronizeOnNonFinalField")
	private boolean a (int script, int unused, int length, boolean flag, byte[] data) {
		try {
			++int_t;
			synchronized (this.cacheDat2) {
				try {
					int i1;
					if (flag) {
						if ((long) (6 + script * 6) > this.cacheIDX.size(19398920)) {
							return false;
						}

						this.cacheIDX.a((long) (6 * script), (byte) 70);
						this.cacheIDX.a(ge.U, 0, -12112, 6);
						i1 = (255 & ge.U[5]) + (ge.U[3] << 16 & 16711680) + (ge.U[4] << 8 & '\uff00');
						if (i1 <= 0 || this.cacheDat2.size(19398920) / 520L < (long) i1) {
							return false;
						}
					} else {
						i1 = (int) ((519L + this.cacheDat2.size(19398920)) / 520L);
						if (i1 == 0) {
							i1 = 1;
						}
					}

					ge.U[0] = (byte) (length >> 16);
					ge.U[1] = (byte) (length >> 8);
					ge.U[2] = (byte) length;
					ge.U[3] = (byte) (i1 >> 16);
					ge.U[4] = (byte) (i1 >> 8);
					ge.U[5] = (byte) i1;
					this.cacheIDX.a((long) (6 * script), (byte) -127);
					int i2 = 0;
					this.cacheIDX.a(6, 0, ge.U, -32);
					int i3 = 0;
					if (i2 < length) {
						do {
							int i7 = 0;
							if (flag) {
								this.cacheDat2.a((long) (520 * i1), (byte) -128);

								try {
									this.cacheDat2.a(ge.U, 0, -12112, 8);
								} catch (EOFException e) {
									e.printStackTrace();
									break;
								}

								int i4 = (255 & ge.U[1]) + (ge.U[0] << 8 & '\uff00');
								int archiveFileId = ge.U[7] & 255;
								int i6 = (255 & ge.U[3]) + ((255 & ge.U[2]) << 8);
								i7 = (ge.U[4] << 16 & 16711680) + (ge.U[5] << 8 & '\uff00') + (ge.U[6] & 255);
								if (script != i4 || i3 != i6 || archiveFileId != this.archiveCacheFileId) {
									return false;
								}

								if (i7 < 0 || this.cacheDat2.size(19398920) / 520L < (long) i7) {
									return false;
								}
							}

							if (i7 == 0) {
								i7 = (int) ((this.cacheDat2.size(19398920) + 519L) / 520L);
								if (i7 == 0) {
									++i7;
								}

								if (~i7 == ~i1) {
									++i7;
								}

								flag = false;
							}

							ge.U[2] = (byte) (i3 >> 8);
							int i4 = -i2 + length;
							ge.U[1] = (byte) script;
							ge.U[7] = (byte) this.archiveCacheFileId;
							if (i4 > 512) {
								i4 = 512;
							}

							ge.U[0] = (byte) (script >> 8);
							if (-i2 + length <= 512) {
								i7 = 0;
							}

							ge.U[4] = (byte) (i7 >> 16);
							ge.U[5] = (byte) (i7 >> 8);
							ge.U[3] = (byte) i3;
							ge.U[6] = (byte) i7;
							this.cacheDat2.a((long) (i1 * 520), (byte) -127);
							this.cacheDat2.a(8, 0, ge.U, -36);
							i1 = i7;
							++i3;
							this.cacheDat2.a(i4, i2, data, -114);
							i2 += i4;
						} while (i2 < length);
					}

					return true;
				} catch (IOException var23) {
					var23.printStackTrace();
					return false;
				}
			}
		} catch (RuntimeException var25) {
			throw id.a(var25, "d.D(" + script + ',' + unused + ',' + length + ',' + flag + ',' + (data != null ? "{...}" : "null") + ')');
		}
	}

	@SuppressWarnings("SynchronizeOnNonFinalField")
	final byte[] a (byte unused, int fileRequest) {
		try {
			++int_i;
			synchronized (this.cacheDat2) {
				byte[] bytes;
				try {
					if (this.cacheIDX.size(19398920) < (long) (6 + 6 * fileRequest)) {
						return null;
					} else {
						this.cacheIDX.a((long) (6 * fileRequest), (byte) -16);
						this.cacheIDX.a(ge.U, 0, -12112, 6);
						byte[] bytes1;
						int size = (255 & ge.U[2]) + ((255 & ge.U[1]) << 8) + ((255 & ge.U[0]) << 16);
						int sector = ((ge.U[3] & 255) << 16) - (-(ge.U[4] << 8 & '\uff00') + -(ge.U[5] & 255));
						if (size >= 0 && size <= this.int_a) {
							if (sector > 0 && this.cacheDat2.size(19398920) / 520L >= (long) sector) {
								bytes1 = new byte[size];
								int i3 = 0;
								int chunkCount = 0;
								if (size > i3) {
									while (sector != 0) {
										this.cacheDat2.a((long) (520 * sector), (byte) -111);
										int dataSize = -i3 + size;
										if (dataSize > 512) {
											dataSize = 512;
										}

										this.cacheDat2.a(ge.U, 0, -12112, 8 + dataSize);
										int id = ('\uff00' & ge.U[0] << 8) + (255 & ge.U[1]);
										int type = ge.U[7] & 255;
										int nextSector = (ge.U[6] & 255) + ((255 & ge.U[5]) << 8) + (ge.U[4] << 16 & 0xff0000);
										int chunk = (ge.U[2] << 8 & '\uff00') + (ge.U[3] & 255);
										System.err.println("Current Sector: " + sector);
										System.err.println("ID: " + id + " ArchiveCacheFileId: " + type + " Next Sector: " + nextSector + " Chunk: " + chunk);
										if (fileRequest == id && chunk == chunkCount && type == this.archiveCacheFileId) {
											if (nextSector >= 0 && (long) nextSector <= this.cacheDat2.size(19398920) / 520L) {
												chunkCount++;
												sector = nextSector;
												int i = 0;
												if (i < dataSize) {
													while (i < dataSize) {
														bytes1[i3++] = ge.U[i + 8];
														++i;
													}
												}
											} else {
												return null;
											}
										} else {
											return null;
										}
									}

									return null;
								}
							} else {
								return null;
							}
						} else {
							return null;
						}

						bytes = bytes1;
						return bytes;
					}
				} catch (IOException var21) {
					return null;
				}
			}
		} catch (RuntimeException var23) {
			throw id.a(var23, "d.C(" + unused + ',' + fileRequest + ')');
		}
	}

	@SuppressWarnings("SynchronizeOnNonFinalField")
	final boolean a (int length, int script, byte[] data, int unused) {
		try {
			++int_q;
			synchronized (this.cacheDat2) {
				boolean flag;
				if (length < 0 || length > this.int_a) {
					throw new IllegalArgumentException();
				}

				boolean flag2 = this.a(script, -120, length, true, data);
				if (!flag2) {
					flag2 = this.a(script, 53, length, false, data);
				}

				flag = flag2;
				return flag;
			}
		} catch (RuntimeException var12) {
			throw id.a(var12, "d.A(" + length + ',' + script + ',' + (data != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}
}
