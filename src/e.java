final class e extends jb {
	static rd Z;
	static int int_cb = 1;
	static int int_eb;
	static jd jd_fb;
	static rd rd_gb = md.a((String) "Benutzen Sie die (WPasswort -=ndern(W Option", (byte) 125);
	static rd rd_hb = md.a((String) "Titelbild geladen)3", (byte) 123);
	static int[][] ints_ib;
	static rd rd_kb;
	static int int_lb;
	static int int_mb;
	static rd clickToContinue2;
	static int int_qb;
	static rd rd_tb;
	static int int_ub;
	static int int_vb;
	static rd rd_wb;
	static int[] yb;
	static rd connectionTimedOut2;
	static int Ab;
	static int Fb;
	static int Hb;
	static gb Ib;
	static int Jb;
	static int Kb;
	static int Lb;
	static re Nb;
	static int Pb;
	private static rd connectionTimedOut = md.a((String) "Connection timed out)3", (byte) 125);
	private static rd clickToContinue = md.a((String) "Click to continue", (byte) 115);

	static {
		connectionTimedOut2 = connectionTimedOut;
		Z = md.a("W-=hlen Sie eine Option", (byte) 118);
		clickToContinue2 = clickToContinue;
		rd_tb = md.a(" @whi@(X", (byte) 114);
		rd_kb = md.a("(U4", (byte) 116);
		int_mb = 0;
		rd_wb = md.a("bevor Sie die (WRegelversto-8 melden(W Option benutzen", (byte) 121);
	}

	int int_ab = 99;
	int int_bb = -1;
	int int_jb = -1;
	boolean boolean_rb = false;
	int[] ints_sb;
	int Bb = -1;
	int Cb = -1;
	int Db = 2;
	int[] Eb;
	int[] Gb;
	int Mb = 5;
	int Ob = -1;
	private int[] ints_db;
	private int[] xb;

	public static void c (byte unused) {
		try {
			rd_wb = null;
			rd_kb = null;
			clickToContinue = null;
			Z = null;
			rd_hb = null;
			Ib = null;
			yb = null;
			connectionTimedOut = null;
			connectionTimedOut2 = null;
			ints_ib = null;
			rd_tb = null;
			Nb = null;
			jd_fb = null;
			clickToContinue2 = null;
			rd_gb = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "e.F(" + unused + ')');
		}
	}

	static boolean a (boolean unused, int i) {
		try {
			++Pb;
			return i >= 48 && i <= 57;
		} catch (RuntimeException var3) {
			throw id.a(var3, "e.H(" + unused + ',' + i + ')');
		}
	}

	static void f (int unused) {
		try {
			s.Ab.c(-119);
			++int_vb;
			ra.h.c(-96);
			bd.dd_uc.c(-122);
		} catch (RuntimeException var2) {
			throw id.a(var2, "e.I(" + unused + ')');
		}
	}

	static rd[] a (int unused, rd[] class_rds) {
		try {
			++Fb;
			rd[] class_rds2 = new rd[5];
			int index = 0;
			do {
				class_rds2[index] = pc.a((byte) 125, new rd[]{bf.a(index, -31766), vc.colon_});
				if (class_rds != null && class_rds[index] != null) {
					class_rds2[index] = pc.a((byte) 126, new rd[]{class_rds2[index], class_rds[index]});
				}

				++index;
			} while (index < 5);

			return class_rds2;
		} catch (RuntimeException var5) {
			throw id.a(var5, "e.D(" + unused + ',' + (class_rds != null ? "{...}" : "null") + ')');
		}
	}

	final ue a (int unused, int index, ue class_ue) {
		try {
			++int_eb;
			index = this.Gb[index];
			a class_a = kb.b((byte) 118, index >> 16);
			index &= '\uffff';
			if (class_a == null) {
				return class_ue.d(true);
			} else {
				ue class_ue2 = class_ue.d(!class_a.c(index, 2));
				class_ue2.a(class_a, index);
				return class_ue2;
			}
		} catch (RuntimeException var6) {
			throw id.a(var6, "e.E(" + unused + ',' + index + ',' + (class_ue != null ? "{...}" : "null") + ')');
		}
	}

	final ue a (ue class_ue, int unused, int i) {
		try {
			int i1 = this.Gb[i];
			a class_a = kb.b((byte) 118, i1 >> 16);
			i1 &= '\uffff';
			++Hb;
			if (class_a == null) {
				return class_ue.e(true);
			} else {
				a class_a2 = null;
				int i2 = 0;
				if (this.ints_db != null && ~i > ~this.ints_db.length) {
					i2 = this.ints_db[i];
					class_a2 = kb.b((byte) 118, i2 >> 16);
					i2 &= '\uffff';
				}

				ue class_ue2;
				if (class_a2 != null && i2 != '\uffff') {
					class_ue2 = class_ue.e(!class_a.c(i1, 2) & !class_a2.c(i2, 2));
					class_ue2.a(class_a, i1);
					class_ue2.a(class_a2, i2);
					return class_ue2;
				} else {
					class_ue2 = class_ue.e(!class_a.c(i1, 2));
					class_ue2.a(class_a, i1);
					return class_ue2;
				}
			}
		} catch (RuntimeException var9) {
			throw id.a(var9, "e.B(" + (class_ue != null ? "{...}" : "null") + ',' + unused + ',' + i + ')');
		}
	}

	final ue a (int i, int i1, e class_e, int unused, ue class_ue) {
		try {
			++Ab;
			i1 = this.Gb[i1];
			a class_a = kb.b((byte) 118, i1 >> 16);
			i1 &= '\uffff';
			if (class_a == null) {
				return class_e.a(class_ue, i, (byte) -43);
			} else {
				i = class_e.Gb[i];
				a class_a2 = kb.b((byte) 118, i >> 16);
				i &= '\uffff';
				ue class_ue2;
				if (class_a2 == null) {
					class_ue2 = class_ue.e(!class_a.c(i1, 2));
					class_ue2.a(class_a, i1);
					return class_ue2;
				} else {
					class_ue2 = class_ue.e(!class_a.c(i1, 2) & !class_a2.c(i, 2));
					class_ue2.a(class_a, i1, class_a2, i, this.xb);
					return class_ue2;
				}
			}
		} catch (RuntimeException var9) {
			throw id.a(var9, "e.G(" + i + ',' + i1 + ',' + (class_e != null ? "{...}" : "null") + ',' + unused + ',' + (class_ue != null ? "{...}" : "null") + ')');
		}
	}

	private void a (int input, byte unused, id class_id) {
		try {
			++int_ub;
			if (input != 1) {
				if (input == 2) {
					this.Bb = class_id.readUnsignedLEShort(255);
				} else if (input == 3) {
					int i = class_id.readUnsignedByte((byte) 116);
					this.xb = new int[1 + i];
					int index = 0;
					if (i > index) {
						do {
							this.xb[index] = class_id.readUnsignedByte((byte) 116);
							++index;
						} while (i > index);
					}

					this.xb[i] = 9999999;
				} else if (input != 4) {
					if (input != 5) {
						if (input == 6) {
							this.int_bb = class_id.readUnsignedLEShort(255);
						} else if (input == 7) {
							this.Cb = class_id.readUnsignedLEShort(255);
						} else if (input == 8) {
							this.int_ab = class_id.readUnsignedByte((byte) 116);
						} else if (input == 9) {
							this.Ob = class_id.readUnsignedByte((byte) 116);
						} else if (input != 10) {
							if (input != 11) {
								if (input == 12) {
									int i = class_id.readUnsignedByte((byte) 116);
									this.ints_db = new int[i];
									int index = 0;
									if (i > index) {
										do {
											this.ints_db[index] = class_id.readUnsignedLEShort(255);
											++index;
										} while (i > index);
									}

									int i1 = 0;
									if (i > i1) {
										do {
											this.ints_db[i1] = (class_id.readUnsignedLEShort(255) << 16) + this.ints_db[i1];
											++i1;
										} while (i > i1);
									}
								} else if (input == 13) {
									int i = class_id.readUnsignedByte((byte) 116);
									this.ints_sb = new int[i];
									int index = 0;
									if (index < i) {
										do {
											this.ints_sb[index] = class_id.readMedInt((byte) -39);
											++index;
										} while (index < i);
									}
								}
							} else {
								this.Db = class_id.readUnsignedByte((byte) 116);
							}
						} else {
							this.int_jb = class_id.readUnsignedByte((byte) 116);
						}
					} else {
						this.Mb = class_id.readUnsignedByte((byte) 116);
					}
				} else {
					this.boolean_rb = true;
				}
			} else {
				int i = class_id.readUnsignedByte((byte) 116);
				this.Eb = new int[i];
				int i1 = 0;
				if (i > i1) {
					do {
						this.Eb[i1] = class_id.readUnsignedLEShort(255);
						++i1;
					} while (i > i1);
				}

				this.Gb = new int[i];
				int i2 = 0;
				if (i2 < i) {
					do {
						this.Gb[i2] = class_id.readUnsignedLEShort(255);
						++i2;
					} while (i2 < i);
				}

				int i3 = 0;
				if (i3 < i) {
					do {
						this.Gb[i3] += class_id.readUnsignedLEShort(255) << 16;
						++i3;
					} while (i3 < i);
				}
			}
		} catch (RuntimeException var9) {
			throw id.a(var9, "e.C(" + input + ',' + unused + ',' + (class_id != null ? "{...}" : "null") + ')');
		}
	}

	final void c (boolean unused) {
		try {
			++Kb;
			if (this.int_jb == -1) {
				if (this.xb != null) {
					this.int_jb = 2;
				} else {
					this.int_jb = 0;
				}
			}

			if (this.Ob == -1) {
				if (this.xb == null) {
					this.Ob = 0;
				} else {
					this.Ob = 2;
				}
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "e.K(" + unused + ')');
		}
	}

	final ue a (int unused, int i, int i1, ue class_ue) {
		try {
			++Jb;
			i = this.Gb[i];
			a class_a = kb.b((byte) 118, i >> 16);
			i &= '\uffff';
			if (class_a == null) {
				return class_ue.e(true);
			} else {
				i1 &= 3;
				ue class_ue2 = class_ue.e(!class_a.c(i, 2));
				if (i1 != 1) {
					if (i1 != 2) {
						if (i1 == 3) {
							class_ue2.b();
						}
					} else {
						class_ue2.a();
					}
				} else {
					class_ue2.f();
				}

				class_ue2.a(class_a, i);
				if (i1 != 1) {
					if (i1 != 2) {
						if (i1 != 3) {
							return class_ue2;
						} else {
							class_ue2.f();
						}
					} else {
						class_ue2.a();
					}
				} else {
					class_ue2.b();
				}

				return class_ue2;
			}
		} catch (RuntimeException var8) {
			throw id.a(var8, "e.J(" + unused + ',' + i + ',' + i1 + ',' + (class_ue != null ? "{...}" : "null") + ')');
		}
	}

	final ue a (ue class_ue, int fileRequest, byte unused) {
		try {
			++int_lb;
			fileRequest = this.Gb[fileRequest];
			a class_a = kb.b((byte) 118, fileRequest >> 16);
			fileRequest &= '\uffff';
			if (class_a == null) {
				return class_ue.e(true);
			} else {
				ue class_ue2 = class_ue.e(!class_a.c(fileRequest, 2));
				class_ue2.a(class_a, fileRequest);
				return class_ue2;
			}
		} catch (RuntimeException var6) {
			throw id.a(var6, "e.A(" + (class_ue != null ? "{...}" : "null") + ',' + fileRequest + ',' + unused + ')');
		}
	}

	final void a (byte unused, id class_id) {
		try {
			++int_qb;
			do {
				int input = class_id.readUnsignedByte((byte) 116);
				if (input == 0) {
					break;
				}

				this.a(input, (byte) 22, class_id);
			} while (true);
		} catch (RuntimeException var5) {
			throw id.a(var5, "e.L(" + unused + ',' + (class_id != null ? "{...}" : "null") + ')');
		}
	}
}
