final class hc extends jb {
	static rd bb;
	static int hb;
	static int kb = 0;
	static int lb;
	static int pb;
	static int tb;
	static int ub;
	static rd xb = md.a((String) "Lade Freunde)2Liste)3)3)3", (byte) 119);
	static int zb;
	static rd Ab = md.a((String) "Duell akzeptieren", (byte) 125);
	static ma Cb;
	static int Db;
	static rd Fb = md.a((String) "m-Ochte mit Ihnen handeln)3", (byte) 125);
	static int Kb;
	static int sampleRate;
	static int Ob;
	static int Pb;
	static int Ub;
	static rd huffman;
	static int ac;
	static int gc;
	private static rd Qb = md.a((String) "Loaded sprites", (byte) 117);

	static {
		bb = Qb;
		huffman = md.a("huffman", (byte) 120);
		Ub = 0;
	}

	int[] Z;
	int fb = 0;
	int gb = 0;
	int jb;
	int rb = -1;
	int sb = 0;
	int vb;
	int wb;
	int[] yb;
	rd[] Bb;
	int Eb;
	rd[] Gb;
	int Lb;
	int Nb;
	rd Rb;
	int Sb;
	int Yb;
	boolean dc;
	int ec;
	int fc;
	private int ab = -1;
	private int cb;
	private int int_db;
	private int int_eb = -1;
	private int ib = -1;
	private short[] mb;
	private int nb;
	private int ob;
	private int qb;
	private int Hb;
	private int Ib;
	private short[] Jb;
	private int Tb;
	private int Vb;
	private int Wb;
	private int Zb;
	private int bc;
	private int cc;

	public hc () {
		this.Bb = new rd[]{null, null, cf.take2, null, null};
		this.nb = -1;
		this.ob = 128;
		this.Ib = -1;
		this.wb = 0;
		this.vb = 0;
		this.Gb = new rd[]{null, null, null, null, md.x};
		this.cb = -1;
		this.Hb = 128;
		this.Sb = 2000;
		this.Lb = 0;
		this.Vb = -1;
		this.int_db = -1;
		this.Tb = 128;
		this.Wb = 0;
		this.Rb = t.e;
		this.Zb = 0;
		this.Nb = 0;
		this.Eb = -1;
		this.cc = -1;
		this.Yb = 1;
		this.bc = -1;
		this.fc = 0;
		this.dc = false;
		this.ec = 0;
	}

	public static void f (int var0) {
		try {
			Fb = null;
			Ab = null;
			bb = null;
			Cb = null;
			xb = null;
			huffman = null;
			if (var0 != 128) {
				f(16);
			}

			Qb = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "hc.B(" + var0 + ')');
		}
	}

	final boolean a (boolean var1, byte var2) {
		try {
			int var5 = this.bc;
			++zb;
			int var3 = this.cb;
			int var4 = this.cc;
			if (var1) {
				var3 = this.int_db;
				var4 = this.ib;
				var5 = this.Vb;
			}

			if (var3 == -1) {
				return true;
			} else {
				boolean var6 = true;
				if (!db.archiveFile7.a(0, (byte) 62, var3)) {
					var6 = false;
				}

				if (~var4 != 0 && !db.archiveFile7.a(0, (byte) 62, var4)) {
					var6 = false;
				}

				if (~var5 != 0 && !db.archiveFile7.a(0, (byte) 62, var5)) {
					var6 = false;
				}

				if (var2 != 40) {
					Ab = null;
				}

				return var6;
			}
		} catch (RuntimeException var7) {
			throw id.a(var7, "hc.J(" + var1 + ',' + var2 + ')');
		}
	}

	final boolean a (int var1, boolean var2) {
		try {
			int var3 = 43 % ((-14 - var1) / 56);
			++pb;
			int var4 = this.int_eb;
			int var5 = this.nb;
			if (var2) {
				var5 = this.ab;
				var4 = this.Ib;
			}

			if (var4 == -1) {
				return true;
			} else {
				boolean var6 = true;
				if (!db.archiveFile7.a(0, (byte) 62, var4)) {
					var6 = false;
				}

				if (var5 != -1 && !db.archiveFile7.a(0, (byte) 62, var5)) {
					var6 = false;
				}

				return var6;
			}
		} catch (RuntimeException var7) {
			throw id.a(var7, "hc.D(" + var1 + ',' + var2 + ')');
		}
	}

	private void a (id var1, int var2, int var3) {
		int var6 = client.int_tb;

		try {
			label224:
			{
				++Pb;
				if (~var3 == -2) {
					this.qb = var1.readUnsignedLEShort(255);
					if (var6 == 0) {
						break label224;
					}
				}

				if (var3 == 2) {
					this.Rb = var1.readRSString(-1);
					if (var6 == 0) {
						break label224;
					}
				}

				if (~var3 != -5) {
					if (~var3 == -6) {
						this.fc = var1.readUnsignedLEShort(255);
						if (var6 == 0) {
							break label224;
						}
					}

					if (var3 == 6) {
						this.vb = var1.readUnsignedLEShort(255);
						if (var6 == 0) {
							break label224;
						}
					}

					if (var3 != 7) {
						if (var3 != 8) {
							if (var3 == 11) {
								this.gb = 1;
								if (var6 == 0) {
									break label224;
								}
							}

							if (var3 != 12) {
								if (~var3 != -17) {
									if (~var3 != -24) {
										if (var3 == 24) {
											this.cc = var1.readUnsignedLEShort(255);
											if (var6 == 0) {
												break label224;
											}
										}

										if (~var3 != -26) {
											if (var3 != 26) {
												if (var3 >= 30 && ~var3 > -36) {
													this.Bb[-30 + var3] = var1.readRSString(-1);
													if (!this.Bb[-30 + var3].b(eb.hidden2, true)) {
														break label224;
													}

													this.Bb[-30 + var3] = null;
													if (var6 == 0) {
														break label224;
													}
												}

												if (~var3 <= -36 && ~var3 > -41) {
													this.Gb[-35 + var3] = var1.readRSString(-1);
													if (var6 == 0) {
														break label224;
													}
												}

												if (~var3 != -41) {
													if (var3 != 78) {
														if (var3 == 79) {
															this.Vb = var1.readUnsignedLEShort(255);
															if (var6 == 0) {
																break label224;
															}
														}

														if (var3 != 90) {
															if (var3 != 91) {
																if (~var3 == -93) {
																	this.nb = var1.readUnsignedLEShort(255);
																	if (var6 == 0) {
																		break label224;
																	}
																}

																if (var3 == 93) {
																	this.ab = var1.readUnsignedLEShort(255);
																	if (var6 == 0) {
																		break label224;
																	}
																}

																if (var3 != 95) {
																	if (~var3 != -98) {
																		if (var3 == 98) {
																			this.rb = var1.readUnsignedLEShort(255);
																			if (var6 == 0) {
																				break label224;
																			}
																		}

																		if (~var3 <= -101 && var3 < 110) {
																			if (this.yb == null) {
																				this.yb = new int[10];
																				this.Z = new int[10];
																			}

																			this.yb[-100 + var3] = var1.readUnsignedLEShort(255);
																			this.Z[-100 + var3] = var1.readUnsignedLEShort(255);
																			if (var6 == 0) {
																				break label224;
																			}
																		}

																		if (var3 != 110) {
																			if (~var3 == -112) {
																				this.ob = var1.readUnsignedLEShort(255);
																				if (var6 == 0) {
																					break label224;
																				}
																			}

																			if (~var3 != -113) {
																				if (var3 != 113) {
																					if (~var3 != -115) {
																						if (~var3 != -116) {
																							break label224;
																						}

																						this.Nb = var1.readUnsignedByte((byte) 116);
																						if (var6 == 0) {
																							break label224;
																						}
																					}

																					this.sb = 5 * var1.readByte(true);
																					if (var6 == 0) {
																						break label224;
																					}
																				}

																				this.fb = var1.readByte(true);
																				if (var6 == 0) {
																					break label224;
																				}
																			}

																			this.Hb = var1.readUnsignedLEShort(255);
																			if (var6 == 0) {
																				break label224;
																			}
																		}

																		this.Tb = var1.readUnsignedLEShort(255);
																		if (var6 == 0) {
																			break label224;
																		}
																	}

																	this.Eb = var1.readUnsignedLEShort(255);
																	if (var6 == 0) {
																		break label224;
																	}
																}

																this.Lb = var1.readUnsignedLEShort(255);
																if (var6 == 0) {
																	break label224;
																}
															}

															this.Ib = var1.readUnsignedLEShort(255);
															if (var6 == 0) {
																break label224;
															}
														}

														this.int_eb = var1.readUnsignedLEShort(255);
														if (var6 == 0) {
															break label224;
														}
													}

													this.bc = var1.readUnsignedLEShort(255);
													if (var6 == 0) {
														break label224;
													}
												}

												int var4 = var1.readUnsignedByte((byte) 116);
												this.mb = new short[var4];
												this.Jb = new short[var4];
												int var5 = 0;
												if (var6 != 0 || var4 > var5) {
													do {
														this.mb[var5] = (short) var1.readUnsignedLEShort(255);
														this.Jb[var5] = (short) var1.readUnsignedLEShort(255);
														++var5;
													} while (var4 > var5);
												}

												if (var6 == 0) {
													break label224;
												}
											}

											this.ib = var1.readUnsignedLEShort(255);
											if (var6 == 0) {
												break label224;
											}
										}

										this.int_db = var1.readUnsignedLEShort(255);
										this.Wb = var1.readUnsignedByte((byte) 116);
										if (var6 == 0) {
											break label224;
										}
									}

									this.cb = var1.readUnsignedLEShort(255);
									this.Zb = var1.readUnsignedByte((byte) 116);
									if (var6 == 0) {
										break label224;
									}
								}

								this.dc = true;
								if (var6 == 0) {
									break label224;
								}
							}

							this.Yb = var1.readInt((byte) -124);
							if (var6 == 0) {
								break label224;
							}
						}

						this.wb = var1.readUnsignedLEShort(255);
						if (~this.wb >= -32768) {
							break label224;
						}

						this.wb -= 65536;
						if (var6 == 0) {
							break label224;
						}
					}

					this.ec = var1.readUnsignedLEShort(255);
					if (~this.ec >= -32768) {
						break label224;
					}

					this.ec -= 65536;
					if (var6 == 0) {
						break label224;
					}
				}

				this.Sb = var1.readUnsignedLEShort(255);
			}

			if (var2 <= 61) {
				this.a(-48, null, null);
			}
		} catch (RuntimeException var7) {
			throw id.a(var7, "hc.H(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
		}
	}

	final void a (int var1, hc var2, hc var3) {
		try {
			this.vb = var2.vb;
			this.fc = var2.fc;
			this.Rb = var3.Rb;
			this.Jb = var2.Jb;
			if (var1 > 0) {
				Cb = null;
			}

			this.qb = var2.qb;
			this.dc = var3.dc;
			this.Lb = var2.Lb;
			this.wb = var2.wb;
			++Db;
			this.ec = var2.ec;
			this.Yb = var3.Yb;
			this.mb = var2.mb;
			this.Sb = var2.Sb;
			this.gb = 1;
		} catch (RuntimeException var5) {
			throw id.a(var5, "hc.C(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	final void a (int var1, id var2) {
		int var4 = client.int_tb;

		try {
			++ub;

			do {
				int var3 = var2.readUnsignedByte((byte) 116);
				if (~var3 == -1) {
					break;
				}

				this.a(var2, 69, var3);
			} while (var4 == 0);

			if (var1 != -1) {
				this.fc = 81;
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "hc.L(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	final hc a (int var1, byte var2) {
		int var5 = client.int_tb;

		try {
			++Kb;
			int var3;
			if (this.yb != null && var1 > 1) {
				var3 = -1;
				int var4 = 0;
				if (var5 != 0 || ~var4 > -11) {
					do {
						if (~this.Z[var4] >= ~var1 && ~this.Z[var4] != -1) {
							var3 = this.yb[var4];
						}

						++var4;
					} while (~var4 > -11);
				}

				if (var3 != -1) {
					return u.a(var3, false);
				}
			}

			var3 = -100 / ((var2 - -57) / 37);
			return this;
		} catch (RuntimeException var6) {
			throw id.a(var6, "hc.I(" + var1 + ',' + var2 + ')');
		}
	}

	final kc b (int var1, boolean var2) {
		int var8 = client.int_tb;

		try {
			int var3 = this.int_eb;
			++lb;
			int var4 = this.nb;
			if (var2) {
				var3 = this.Ib;
				var4 = this.ab;
			}

			if (~var3 == 0) {
				return null;
			} else {
				kc var5 = kc.a(db.archiveFile7, var3, 0);
				if (var1 <= 50) {
					return null;
				} else {
					if (~var4 != 0) {
						kc var6 = kc.a(db.archiveFile7, var4, 0);
						kc[] var7 = new kc[]{var5, var6};
						var5 = new kc(var7, 2);
					}

					if (this.mb != null) {
						int var10 = 0;
						if (var8 != 0 || var10 < this.mb.length) {
							do {
								var5.a(this.mb[var10], this.Jb[var10]);
								++var10;
							} while (var10 < this.mb.length);
						}
					}

					return var5;
				}
			}
		} catch (RuntimeException var9) {
			throw id.a(var9, "hc.E(" + var1 + ',' + var2 + ')');
		}
	}

	final kc a (byte var1, int var2) {
		int var5 = client.int_tb;

		try {
			++hb;
			int var4;
			if (this.yb != null && var2 > 1) {
				int var3 = -1;
				var4 = 0;
				if (var5 != 0 || ~var4 > -11) {
					do {
						if (var2 >= this.Z[var4] && ~this.Z[var4] != -1) {
							var3 = this.yb[var4];
						}

						++var4;
					} while (~var4 > -11);
				}

				if (~var3 != 0) {
					return u.a(var3, false).a((byte) -121, 1);
				}
			}

			kc var7 = kc.a(db.archiveFile7, this.qb, 0);
			if (var7 == null) {
				return null;
			} else {
				if (var1 >= -61) {
					Fb = null;
				}

				if (~this.Tb != -129 || this.ob != 128 || ~this.Hb != -129) {
					var7.a(this.Tb, this.ob, this.Hb);
				}

				if (this.mb != null) {
					var4 = 0;
					if (var5 != 0 || ~this.mb.length < ~var4) {
						do {
							var7.a(this.mb[var4], this.Jb[var4]);
							++var4;
						} while (~this.mb.length < ~var4);
					}
				}

				return var7;
			}
		} catch (RuntimeException var6) {
			throw id.a(var6, "hc.K(" + var1 + ',' + var2 + ')');
		}
	}

	final kc c (int var1, boolean var2) {
		int var10 = client.int_tb;

		try {
			if (var1 != 0) {
				return null;
			} else {
				int var5 = this.bc;
				int var4 = this.cc;
				++gc;
				int var3 = this.cb;
				if (var2) {
					var4 = this.ib;
					var5 = this.Vb;
					var3 = this.int_db;
				}

				if (var3 == -1) {
					return null;
				} else {
					kc var6 = kc.a(db.archiveFile7, var3, 0);
					if (var4 != -1) {
						label51:
						{
							kc var7 = kc.a(db.archiveFile7, var4, 0);
							if (var5 != -1) {
								kc var8 = kc.a(db.archiveFile7, var5, 0);
								kc[] var9 = new kc[]{var6, var7, var8};
								var6 = new kc(var9, 3);
								if (var10 == 0) {
									break label51;
								}
							}

							kc[] var13 = new kc[]{var6, var7};
							var6 = new kc(var13, 2);
						}
					}

					if (!var2 && this.Zb != 0) {
						var6.b(0, this.Zb, 0);
					}

					if (var2 && this.Wb != 0) {
						var6.b(0, this.Wb, 0);
					}

					if (this.mb != null) {
						int var12 = 0;
						if (var10 != 0 || ~var12 > ~this.mb.length) {
							do {
								var6.a(this.mb[var12], this.Jb[var12]);
								++var12;
							} while (~var12 > ~this.mb.length);
						}
					}

					return var6;
				}
			}
		} catch (RuntimeException var11) {
			throw id.a(var11, "hc.F(" + var1 + ',' + var2 + ')');
		}
	}

	final void c (byte var1) {
		try {
			++ac;
			if (var1 != 13) {
				this.ab = 40;
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "hc.A(" + var1 + ')');
		}
	}

	final ue a (int var1, int var2) {
		int var6 = client.int_tb;

		try {
			++Ob;
			if (this.yb != null && ~var1 < -2) {
				int var3 = -1;
				int var4 = 0;
				if (var6 != 0 || ~var4 > -11) {
					do {
						if (~var1 <= ~this.Z[var4] && ~this.Z[var4] != -1) {
							var3 = this.yb[var4];
						}

						++var4;
					} while (~var4 > -11);
				}

				if (var3 != -1) {
					return u.a(var3, false).a(1, var2);
				}
			}

			ue var8 = (ue) df.dd_e.a((byte) -87, (long) this.jb);
			if (var2 != -93) {
				return null;
			} else if (var8 != null) {
				return var8;
			} else {
				kc var9 = kc.a(db.archiveFile7, this.qb, 0);
				if (var9 == null) {
					return null;
				} else {
					if (~this.Tb != -129 || ~this.ob != -129 || ~this.Hb != -129) {
						var9.a(this.Tb, this.ob, this.Hb);
					}

					if (this.mb != null) {
						int var5 = 0;
						if (var6 != 0 || ~this.mb.length < ~var5) {
							do {
								var9.a(this.mb[var5], this.Jb[var5]);
								++var5;
							} while (~this.mb.length < ~var5);
						}
					}

					var8 = var9.a(64 - -this.fb, this.sb + 768, -50, -10, -50);
					var8.Db = true;
					df.dd_e.a(var2 ^ 5, var8, (long) this.jb);
					return var8;
				}
			}
		} catch (RuntimeException var7) {
			throw id.a(var7, "hc.G(" + var1 + ',' + var2 + ')');
		}
	}
}
