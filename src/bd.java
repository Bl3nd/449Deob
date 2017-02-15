final class bd extends jb {
	static int int_cb;
	static int int_fb;
	static int int_jb;
	static int int_mb;
	static int int_nb;
	static int int_ob;
	static int int_pb;
	static int int_qb;
	static int int_rb;
	static int int_tb;
	static int int_ub;
	static rd xb = md.a((String) "(U3", (byte) 114);
	static int zb;
	static int Ab;
	static int Eb = 0;
	static int Ib;
	static int Kb;
	static int Nb;
	static int Ob;
	static pc Qb = new pc(512);
	static int publicChatStatus = 0;
	static int int_cc;
	static int int_hc;
	static int int_kc;
	static rd thisComputersAddressHasBeenBlocked2;
	static byte[] bytes_mc;
	static rd off2;
	static int int_pc;
	static rd _seconds2;
	static dd dd_uc;
	static rd titleButton;
	static ke cacheFile4;
	static kb xc;
	static rd yc;
	private static rd _seconds = md.a((String) " seconds)3", (byte) 119);
	private static rd off;
	private static rd thisComputersAddressHasBeenBlocked;

	static {
		_seconds2 = _seconds;
		int_pc = 0;
		thisComputersAddressHasBeenBlocked = md.a("This computers address has been blocked", (byte) 124);
		bytes_mc = new byte[]{
				(byte) 95,
				(byte) 97,
				(byte) 98,
				(byte) 99,
				(byte) 100,
				(byte) 101,
				(byte) 102,
				(byte) 103,
				(byte) 104,
				(byte) 105,
				(byte) 106,
				(byte) 107,
				(byte) 108,
				(byte) 109,
				(byte) 110,
				(byte) 111,
				(byte) 112,
				(byte) 113,
				(byte) 114,
				(byte) 115,
				(byte) 116,
				(byte) 117,
				(byte) 118,
				(byte) 119,
				(byte) 120,
				(byte) 121,
				(byte) 122,
				(byte) 48,
				(byte) 49,
				(byte) 50,
				(byte) 51,
				(byte) 52,
				(byte) 53,
				(byte) 54,
				(byte) 55,
				(byte) 56,
				(byte) 57
		};
		thisComputersAddressHasBeenBlocked2 = thisComputersAddressHasBeenBlocked;
		off = md.a("Off", (byte) 117);
		off2 = off;
		titleButton = md.a("titlebutton", (byte) 126);
		int_kc = 0;
		dd_uc = new dd(20);
		yc = md.a("Registrierter Benutzer", (byte) 123);
	}

	boolean Z = false;
	int int_ab;
	boolean boolean_bb;
	int int_db = 0;
	int int_eb = 0;
	boolean boolean_ib;
	int int_kb = -1;
	int int_lb = 0;
	int[] ints_sb;
	int Cb;
	boolean Fb = false;
	boolean Gb;
	int Hb;
	int[] Jb;
	rd Lb;
	int Mb;
	boolean Rb;
	int Tb;
	boolean impenetrable;
	int Yb;
	rd[] Zb;
	int h;
	int int_fc;
	int int_ic;
	int w;
	private int int_gb = -1;
	private int int_hb;
	private boolean boolean_vb = false;
	private boolean boolean_wb;
	private int yb;
	private short[] Bb;
	private int Db;
	private short[] Pb;
	private int Sb;
	private int Wb;
	private int[] Xb;
	private int[] ints_ac;
	private int int_bc;
	private int int_ec;
	private int int_gc;
	private int int_rc;

	public bd () {
		this.Lb = m.rd_g;
		this.Tb = 16;
		this.Wb = 128;
		this.Gb = false;
		this.boolean_bb = true;
		this.int_hb = 0;
		this.Rb = false;
		this.Hb = -1;
		this.Yb = 0;
		this.boolean_ib = true;
		this.Cb = -1;
		this.Db = 0;
		this.int_gc = 0;
		this.impenetrable = true;
		this.int_ec = -1;
		this.Mb = -1;
		this.yb = 128;
		this.h = 1;
		this.Zb = new rd[5];
		this.int_fc = -1;
		this.int_bc = 0;
		this.Sb = 0;
		this.boolean_wb = false;
		this.int_rc = 128;
		this.w = 1;
		this.int_ic = -1;
	}

	static rd a (int unused, byte unused2, id class_id) {
		try {
			++Ob;

			try {
				rd class_rd = new rd();
				class_rd.stringPointer = class_id.readUnsignedSmart((byte) -54);
				if (class_rd.stringPointer > 32767) {
					class_rd.stringPointer = 32767;
				}

				class_rd.stringBuffer = new byte[class_rd.stringPointer];
				class_id.pointer += xc.a(class_id.pointer, -1, class_id.buffer, 0, class_rd.stringBuffer, class_rd.stringPointer);
				return class_rd;
			} catch (Exception e) {
				return je.cabbage;
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "bd.G(" + unused + ',' + unused2 + ',' + (class_id != null ? "{...}" : "null") + ')');
		}
	}

	static rd b (int i, int unused) {
		try {
			++Ib;
			if (i < 999999999) {
				return bf.a(i, -31766);
			} else {
				return le.rd_hb;
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "bd.A(" + i + ',' + unused + ')');
		}
	}

	static void a (int i, int unused, int i1, int i2) {
		try {
			++int_pb;
			if (ib.o != 0 && i != 0 && me.lb < 50) {
				kd.B[me.lb] = i2;
				wc.o[me.lb] = i;
				ba.ints_r[me.lb] = i1;
				eb.ias_c[me.lb] = null;
				gd.ints_n[me.lb] = 0;
				++me.lb;
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "bd.D(" + i + ',' + unused + ',' + i1 + ',' + i2 + ')');
		}
	}

	static e a (int fileRequest, boolean unused) {
		try {
			++Kb;
			e class_e = (e) n.ab.a((byte) -107, (long) fileRequest);
			if (class_e != null) {
				return class_e;
			} else {
				byte[] buffer = je.archiveFile2_.a(12, fileRequest, (byte) 66);
				class_e = new e();
				if (buffer != null) {
					class_e.a((byte) 111, new id(buffer));
				}

				class_e.c(true);
				n.ab.a(-88, class_e, (long) fileRequest);
				return class_e;
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "bd.L(" + fileRequest + ',' + unused + ')');
		}
	}

	static void a (boolean unused, int state) {
		System.err.println("State - " + state);
		try {
			++Ab;
			if (state != lc.currentGameState) {
				if (lc.currentGameState == 0) {
					ja.a((byte) 114);
				}

				if (state == 20 || state == 40) {
					we.q = 0;
					md.loginStage = 0;
					se.int_g = 0;
				}

				if (state != 20 && state != 40 && sa.hb != null) {
					sa.hb.a(25830);
					sa.hb = null;
				}

				if (lc.currentGameState == 25 || lc.currentGameState == 40) {
					ie.a((byte) -34);
					ic.a();
				}

				if (lc.currentGameState == 25) {
					d.int_k = 0;
					wa.rb = 0;
					i.M = 1;
					hc.kb = 0;
					dc.int_h = 1;
				}

				if (state == 0 || state == 35) {
					j.c((byte) 69);
					jd.b((byte) 110);
					if (wc.b == null) {
						wc.b = je.a(-98, 765, 503, rd.canvas);//Image
					}
				} else if (state == 5 || state == 10 || state == 20) {
					wc.b = null;
					j.c((byte) 81);
					ca.a(u.cacheFile10, rd.canvas, q.cacheFile8, -116);
				} else if (state == 25 || state == 30 || state == 40) {
					wc.b = null;
					jd.b((byte) 100);
					df.a(rd.canvas, true, q.cacheFile8);
				}

				ee.boolean_o = true;
				lc.currentGameState = state;
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "bd.N(" + unused + ',' + state + ')');
		}
	}

	static int a (int i, int i1, int unused) {
		try {
			++int_qb;
			if (~i1 == 1) {
				return 12345678;
			} else if (i1 == -1) {
				if (i < 0) {
					i = 0;
				} else if (i > 127) {
					i = 127;
				}

				i = -i + 127;
				return i;
			} else {
				i = i * (127 & i1) / 128;
				if (i < 2) {
					i = 2;
				} else if (i > 126) {
					i = 126;
				}

				return ('ﾀ' & i1) + i;
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "bd.I(" + i + ',' + i1 + ',' + unused + ')');
		}
	}

	static void a (int cacheId, int i, int i1, byte unused, int i2, int i3, int i4) {
		try {
			++int_hc;
			if (a.a(0, cacheId)) {
				d.a(i, -1, 0, 325, i1, i4, ld.c[cacheId], 0, i2, i3);
			}
		} catch (RuntimeException var8) {
			throw id.a(var8, "bd.P(" + cacheId + ',' + i + ',' + i1 + ',' + unused + ',' + i2 + ',' + i3 + ',' + i4 + ')');
		}
	}

	public static void c (boolean unused) {
		try {
			_seconds = null;
			Qb = null;
			_seconds2 = null;
			xb = null;
			off = null;
			yc = null;
			titleButton = null;
			dd_uc = null;
			thisComputersAddressHasBeenBlocked = null;
			cacheFile4 = null;
			thisComputersAddressHasBeenBlocked2 = null;
			bytes_mc = null;
			off2 = null;
			xc = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "bd.C(" + unused + ')');
		}
	}

	final boolean a (int unused, int i) {
		int dummy = client.int_tb;
		try {
			++int_rb;
			if (this.Xb == null) {
				if (this.ints_ac == null) {
					return true;
				} else if (i != 10) {
					return true;
				} else {
					boolean flag = true;
					int i1 = 0;
					if (i1 >= this.ints_ac.length) {
						return true;
					} else {
						do {
							flag &= q.archiveFile7.a(0, (byte) 62, this.ints_ac[i1]);
							++i1;
						} while (i1 < this.ints_ac.length);

						return flag;
					}
				}
			} else {
				int i1 = 0;
				if (i1 >= this.Xb.length) {
					return true;
				} else {
					do {
						if (this.Xb[i1] == i) {
							return q.archiveFile7.a(0, (byte) 62, this.ints_ac[i1]);
						}

						++i1;
					} while (i1 < this.Xb.length);

					return true;
				}
			}
		} catch (RuntimeException var6) {
			throw id.a(var6, "bd.F(" + unused + ',' + i + ')');
		}
	}

	final boolean f (int unused) {
		int dummy = client.int_tb;
		try {
			++int_nb;
			if (this.ints_ac == null) {
				return true;
			} else {
				boolean flag = true;
				int i = 0;
				if (this.ints_ac.length <= i) {
					return true;
				} else {
					do {
						flag &= q.archiveFile7.a(0, (byte) 62, this.ints_ac[i]);
						++i;
					} while (this.ints_ac.length > i);

					return flag;
				}
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "bd.O(" + unused + ')');
		}
	}

	final bd g (int unused) {
		try {
			++int_ob;
			int i = -1;
			if (this.int_ec != -1) {
				i = o.a((byte) 45, this.int_ec);
			}

			if (this.int_gb != -1) {
				i = ta.Pb[this.int_gb];
			}

			return i >= 0 && this.Jb.length > i && this.Jb[i] != -1 ? ub.a(-101, this.Jb[i]) : null;
		} catch (RuntimeException var3) {
			throw id.a(var3, "bd.S(" + unused + ')');
		}
	}

	@SuppressWarnings("SameParameterValue")
	final void initialize (int unused, id class_id) {
		try {
			++int_cc;
			while (true) {
				int input = class_id.readUnsignedByte((byte) 116);
				if (input == 0) {
					break;
				}

				this.decode(class_id, input, 31486);
			}
		} catch (RuntimeException var6) {
			throw id.a(var6, "bd.E(" + unused + ',' + (class_id != null ? "{...}" : "null") + ')');
		}
	}

	@SuppressWarnings("ConstantConditions")
	final ha a (int orientation, int i1, int maxArea, int unused, int i3, int regularArea, int position) {
		try {
			++int_ub;
			long fileRequest;
			if (this.Xb == null) {
				fileRequest = (long) (orientation + (this.int_ab << 10));
			} else {
				fileRequest = (long) (orientation + (position << 3) + (this.int_ab << 10));
			}

			Object o = td.qd.a((byte) -71, fileRequest);
			if (o == null) {
				kc class_kc = this.a((byte) -100, position, orientation);
				if (class_kc == null) {
					return null;
				}

				if (this.boolean_vb) {
					class_kc.xb = (short) (5 * this.int_gc + 768);
					o = class_kc;
					class_kc.Lb = (short) (64 + this.Db);
					class_kc.g();
				} else {
					o = class_kc.a(this.Db + 64, 768 + 5 * this.int_gc, -50, -10, -50);
				}

				td.qd.a(-101, (jb) o, fileRequest);
			}

			if (this.boolean_vb) {
				o = ((kc) o).d();
			}

			if (this.Fb) {
				if (!(o instanceof ue)) {
					if ((o instanceof kc)) {
						o = ((kc) o).a(regularArea, i1, maxArea, i3, true);
					}
				} else {
					o = ((ue) o).a(regularArea, i1, maxArea, i3, true);
				}
			}

			return (ha) o;
		} catch (RuntimeException var13) {
			throw id.a(var13, "bd.J(" + orientation + ',' + i1 + ',' + maxArea + ',' + unused + ',' + i3 + ',' + regularArea + ',' + position + ')');
		}
	}

	final boolean h (int unused) {
		try {
			++Nb;
			if (this.Jb == null) {
				return this.int_fc != -1 || this.ints_sb != null;
			} else {
				int i = 0;
				if (this.Jb.length <= i) {
					return false;
				} else {
					do {
						if (this.Jb[i] != -1) {
							bd class_bd = ub.a(-45, this.Jb[i]);
							if (class_bd.int_fc != -1 || class_bd.ints_sb != null) {
								return true;
							}
						}

						++i;
					} while (this.Jb.length > i);

					return false;
				}
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "bd.M(" + unused + ')');
		}
	}

	final ue a (byte unused, int i, int i1, int i2, int i3, int i4, int i5) {
		try {
			long fileRequest;
			if (this.Xb != null) {
				fileRequest = (long) ((this.int_ab << 10) - (-(i3 << 3) + -i));
			} else {
				fileRequest = (long) ((this.int_ab << 10) + i);
			}

			++int_cb;
			ue class_ue = (ue) qc.J.a((byte) -111, fileRequest);
			if (class_ue == null) {
				kc class_kc = this.a((byte) -122, i3, i);
				if (class_kc == null) {
					return null;
				}

				class_ue = class_kc.a(this.Db + 64, 768 + 5 * this.int_gc, -50, -10, -50);
				qc.J.a(-110, class_ue, fileRequest);
			}

			if (this.Fb) {
				class_ue = class_ue.a(i1, i2, i4, i5, true);
			}

			return class_ue;
		} catch (RuntimeException var13) {
			throw id.a(var13, "bd.K(" + unused + ',' + i + ',' + i1 + ',' + i2 + ',' + i3 + ',' + i4 + ',' + i5 + ')');
		}
	}

	@SuppressWarnings("SameParameterValue")
	private void decode (id class_id, int input, int unused) {
		int dummy = client.int_tb;
		try {
			label307:
			{
				if (input == 1) {
					int i = class_id.readUnsignedByte((byte) 116);
					if (i > 0) {
						if (this.ints_ac != null && !pa.boolean_h) {
							class_id.pointer += i * 3;
						} else {
							this.ints_ac = new int[i];
							this.Xb = new int[i];
							int i1 = 0;
							if (i > i1) {
								do {
									this.ints_ac[i1] = class_id.readUnsignedLEShort(255);
									this.Xb[i1] = class_id.readUnsignedByte((byte) 116);
									++i1;
								} while (i > i1);
							}

						}
					}
				} else if (input != 2) {
					if (input != 5) {
						if (input != 14) {
							if (input != 15) {
								if (input != 17) {
									if (input == 18) {
										this.impenetrable = false;
									} else if (input == 19) {
										this.Mb = class_id.readUnsignedByte((byte) 116);
									} else if (input == 21) {
										this.Fb = true;
									} else if (input != 22) {
										if (input == 23) {
											this.Rb = true;
										} else if (input == 24) {
											this.int_kb = class_id.readUnsignedLEShort(255);
											if (this.int_kb == 65535) {
												this.int_kb = -1;
											}
										} else if (input != 28) {
											if (input == 29) {
												this.Db = class_id.readByte(true);
											} else if (input != 39) {
												if (input < 30 || input >= 35) {
													if (input == 40) {
														int i = class_id.readUnsignedByte((byte) 116);
														this.Pb = new short[i];
														this.Bb = new short[i];
														int i1 = 0;
														if (i1 < i) {
															do {
																this.Pb[i1] = (short) class_id.readUnsignedLEShort(31486 + -31231);
																this.Bb[i1] = (short) class_id.readUnsignedLEShort(255);
																++i1;
															} while (i1 < i);
														}
													} else if (input != 60) {
														if (input != 62) {
															if (input == 64) {
																this.boolean_bb = false;
															} else if (input != 65) {
																if (input != 66) {
																	if (input == 67) {
																		this.yb = class_id.readUnsignedLEShort(255);
																	} else if (input != 68) {
																		if (input == 69) {
																			this.int_db = class_id.readUnsignedByte((byte) 116);
																		} else if (input != 70) {
																			if (input == 71) {
																				this.Sb = class_id.readShort(1331464976);
																			} else if (input == 72) {
																				this.int_hb = class_id.readShort(1331464976);
																			} else if (input != 73) {
																				if (input == 74) {
																					this.Z = true;
																				} else if (input != 75) {
																					if (input != 77) {
																						if (input == 78) {
																							this.int_fc = class_id.readUnsignedLEShort(255);
																							this.Yb = class_id.readUnsignedByte((byte) 116);
																						} else if (input == 79) {
																							this.int_eb = class_id.readUnsignedLEShort(255);
																							this.int_lb = class_id.readUnsignedLEShort(255);
																							this.Yb = class_id.readUnsignedByte((byte) 116);
																							int i = class_id.readUnsignedByte((byte) 116);
																							this.ints_sb = new int[i];
																							int i1 = 0;
																							if (i > i1) {
																								do {
																									this.ints_sb[i1] = class_id.readUnsignedLEShort(sd.b(31486, 31233));
																									++i1;
																								} while (i > i1);
																							}
																						}
																					} else {
																						this.int_ec = class_id.readUnsignedLEShort(255);
																						if (this.int_ec == '\uffff') {
																							this.int_ec = -1;
																						}

																						this.int_gb = class_id.readUnsignedLEShort(255);
																						if (this.int_gb == 65535) {
																							this.int_gb = -1;
																						}

																						int i = class_id.readUnsignedByte((byte) 116);
																						this.Jb = new int[1 + i];
																						int i1 = 0;
																						if (i1 <= i) {
																							do {
																								this.Jb[i1] = class_id.readUnsignedLEShort(255);
																								if (this.Jb[i1] == '\uffff') {
																									this.Jb[i1] = -1;
																								}

																								++i1;
																							} while (i1 <= i);
																						}
																					}
																				} else {
																					this.Cb = class_id.readUnsignedByte((byte) 116);
																				}
																			} else {
																				this.Gb = true;
																			}
																		} else {
																			this.int_bc = class_id.readShort(1331464976);
																		}
																	} else {
																		this.Hb = class_id.readUnsignedLEShort(255);
																	}
																} else {
																	this.int_rc = class_id.readUnsignedLEShort(255);
																}
															} else {
																this.Wb = class_id.readUnsignedLEShort(255);
															}
														} else {
															this.boolean_wb = true;
														}
													} else {
														this.int_ic = class_id.readUnsignedLEShort(255);
													}
												} else {
													this.Zb[input + -30] = class_id.readRSString(-1);
													if (this.Zb[-30 + input].b(eb.hidden2, true)) {
														this.Zb[-30 + input] = null;
													}
												}
											} else {
												this.int_gc = 5 * class_id.readByte(true);
											}
										} else {
											this.Tb = class_id.readUnsignedByte((byte) 116);
										}
									} else {
										this.boolean_vb = true;
									}
								} else {
									this.boolean_ib = false;
								}
							} else {
								this.h = class_id.readUnsignedByte((byte) 116);
							}
						} else {
							this.w = class_id.readUnsignedByte((byte) 116);
						}
					} else {
						int i = class_id.readUnsignedByte((byte) 116);
						if (i > 0) {
							if (this.ints_ac == null || pa.boolean_h) {
								this.ints_ac = new int[i];
								this.Xb = null;
								int i1 = 0;
								if (i > i1) {
									do {
										this.ints_ac[i1] = class_id.readUnsignedLEShort(255);
										++i1;
									} while (i > i1);
								}

								if (dummy == 0) {
									break label307;
								}
							}

							class_id.pointer += i * 2;
						}
					}
				} else {
					this.Lb = class_id.readRSString(-1);
				}
			}

			++zb;
		} catch (RuntimeException var7) {
			throw id.a(var7, "bd.Q(" + (class_id != null ? "{...}" : "null") + ',' + input + ',' + unused + ')');
		}
	}

	final ue a (int i, int i1, int i2, e class_e, int i3, int i4, int unused, int i5, int i6) {
		try {
			long fileRequest;
			if (this.Xb == null) {
				fileRequest = (long) ((this.int_ab << 10) + i5);
			} else {
				fileRequest = (long) ((i1 << 3) + (this.int_ab << 10) + i5);
			}

			++int_jb;
			ue class_ue = (ue) qc.J.a((byte) -73, fileRequest);
			if (class_ue == null) {
				kc class_kc = this.a((byte) -95, i1, i5);
				if (class_kc == null) {
					return null;
				}

				class_ue = class_kc.a(this.Db + 64, this.int_gc * 5 + 768, -50, -10, -50);
				qc.J.a(-107, class_ue, fileRequest);
			}

			if (class_e == null && !this.Fb) {
				return class_ue;
			} else {
				if (class_e == null) {
					class_ue = class_ue.e(true);
				} else {
					class_ue = class_e.a(-1, i2, i5, class_ue);
				}

				if (this.Fb) {
					if (class_ue != null) {
						class_ue.a(i, i3, i4, i6, false);
					}
				}

				return class_ue;
			}
		} catch (RuntimeException var15) {
			throw id.a(var15, "bd.H(" + i + ',' + i1 + ',' + i2 + ',' + (class_e != null ? "{...}" : "null") + ',' + i3 + ',' + i4 + ',' + unused + ',' + i5 + ',' + i6 + ')');
		}
	}

	final void c (byte unused) {
		try {
			if (this.Mb == -1) {
				this.Mb = 0;
				if (this.ints_ac != null && (this.Xb == null || this.Xb[0] == 10)) {
					this.Mb = 1;
				}

				for (int index = 0 ; index < 5 ; index++) {
					if (this.Zb[index] != null) {
						this.Mb = 1;
					}
				}
			}

			if (this.Cb == -1) {
				this.Cb = !this.boolean_ib ? 0 : 1;
			}

			++int_mb;
		} catch (RuntimeException var4) {
			throw id.a(var4, "bd.B(" + unused + ')');
		}
	}

	private kc a (byte unused, int position, int orientation) {
		int dummy = client.int_tb;
		try {
			++int_tb;
			kc class_kc = null;
			boolean flag;
			int length;
			if (this.Xb == null) {
				if (position != 10) {
					return null;
				}

				if (this.ints_ac == null) {
					return null;
				}

				flag = this.boolean_wb ^ orientation > 3;
				length = this.ints_ac.length;

				for (int index = 0 ; index < length ; ++index) {
					int fileRequest = this.ints_ac[index];
					if (flag) {
						fileRequest += 65536;
					}

					class_kc = (kc) ec.dd_j.a((byte) -77, (long) fileRequest);
					if (class_kc == null) {
						class_kc = kc.a(q.archiveFile7, fileRequest, 0);
						if (class_kc == null) {
							return null;
						}

						if (flag) {
							class_kc.h();
						}

						ec.dd_j.a(-127, class_kc, (long) fileRequest);
					}

					if (length > 1) {
						sd.U[index] = class_kc;
					}
				}

				if (length > 1) {
					class_kc = new kc(sd.U, length);
				}
			} else {
				int i3 = -1;
				length = 0;
				if (this.Xb.length > length) {
					do {
						if (position == this.Xb[length]) {
							i3 = length;
							if (dummy == 0) {
								break;
							}
						}

						++length;
					} while (this.Xb.length > length);
				}

				if (i3 == -1) {
					return null;
				}

				int fileRequest = this.ints_ac[i3];
				boolean flag2 = this.boolean_wb ^ orientation > 3;
				if (flag2) {
					fileRequest += 65536;
				}

				class_kc = (kc) ec.dd_j.a((byte) -107, (long) fileRequest);
				if (class_kc == null) {
					class_kc = kc.a(q.archiveFile7, fileRequest, 0);
					if (class_kc == null) {
						return null;
					}

					if (flag2) {
						class_kc.h();
					}

					ec.dd_j.a(-79, class_kc, (long) fileRequest);
				}
			}

			boolean flag2;
			flag2 = !(this.int_bc == 0 && this.Sb == 0 && this.int_hb == 0);

			flag = this.Wb != 128 || this.int_rc != 128 || this.yb != 128;

			kc class_kc2 = new kc(class_kc, orientation == 0 && !flag && !flag2, this.Pb == null, true);
			orientation &= 3;
			if (orientation == 1) {
				class_kc2.b();
			} else if (orientation != 2) {
				if (orientation == 3) {
					class_kc2.j();
				}
			} else {
				class_kc2.f();
			}

			if (this.Pb != null) {
				int index = 0;
				if (this.Pb.length > index) {
					do {
						class_kc2.a(this.Pb[index], this.Bb[index]);
						++index;
					} while (this.Pb.length > index);
				}
			}

			if (flag) {
				class_kc2.a(this.Wb, this.int_rc, this.yb);
			}

			if (flag2) {
				class_kc2.b(this.int_bc, this.Sb, this.int_hb);
			}

			return class_kc2;
		} catch (RuntimeException var11) {
			throw id.a(var11, "bd.R(" + unused + ',' + position + ',' + orientation + ')');
		}
	}
}
