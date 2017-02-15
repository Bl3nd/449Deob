final class ab {
	static int[][][] mapChunks = new int[4][13][13];
	static int int_b;
	static int int_c;
	static int int_d = -1;
	static int int_f;
	static rd rd_j;
	static rd rd_k = md.a((String) "Ung-Ultige Verbindung mit einem Anmelde)2Server)3", (byte) 121);
	static rd rd_l;
	static int int_m;
	static int int_n;
	static rd invalidUsernameOrPassword2;
	static int int_p;
	static oa oa_q;
	static rd yourAccountHasBeenDisabled2;
	static rd rd_t;
	private static rd rd_e = md.a((String) "green:", (byte) 123);
	private static rd yourAccountHasBeenDisabled;
	private static rd invalidUsernameOrPassword;

	static {
		rd_l = rd_e;
		rd_t = md.a(":duelreq:", (byte) 124);
		rd_j = md.a("@yel@", (byte) 114);
		invalidUsernameOrPassword = md.a("Invalid username or password)3", (byte) 120);
		invalidUsernameOrPassword2 = invalidUsernameOrPassword;
		yourAccountHasBeenDisabled = md.a("Your account has been disabled)3", (byte) 119);
		yourAccountHasBeenDisabled2 = yourAccountHasBeenDisabled;
	}

	int int_g;
	int int_h;
	int int_i;
	int int_s;

	public ab () {}

	ab (ab class_ab) {
		try {
			this.int_h = class_ab.int_h;
			this.int_s = class_ab.int_s;
			this.int_g = class_ab.int_g;
			this.int_i = class_ab.int_i;
		} catch (RuntimeException var3) {
			throw id.a(var3, "ab.<init>(" + (class_ab != null ? "{...}" : "null") + ')');
		}
	}

	public static void a (int unused) {
		try {
			invalidUsernameOrPassword2 = null;
			rd_t = null;
			oa_q = null;
			mapChunks = null;
			rd_e = null;
			rd_l = null;
			yourAccountHasBeenDisabled = null;
			rd_j = null;
			yourAccountHasBeenDisabled2 = null;
			rd_k = null;
			invalidUsernameOrPassword = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "ab.A(" + unused + ')');
		}
	}

	static void a (int i, rd class_rd, int i1, byte unused, int i2, rd class_rd2, int i3) {
		try {
			++int_n;
			if (id.rb < 500) {
				if (class_rd.b(-29348) > 0) {
					ta.xb[id.rb] = pc.a((byte) 127, new rd[]{class_rd2, jb.space2, class_rd});
				} else {
					ta.xb[id.rb] = class_rd2;
				}

				sa.mb[id.rb] = i2;
				pe.q[id.rb] = i3;
				kd.ints_f[id.rb] = i;
				sb.ints_k[id.rb] = i1;
				++id.rb;
			}
		} catch (RuntimeException var8) {
			throw id.a(var8, "ab.C(" + i + ',' + (class_rd != null ? "{...}" : "null") + ',' + i1 + ',' + unused + ',' + i2 + ',' + (class_rd2 != null ? "{...}" : "null") + ',' + i3 + ')');
		}
	}

	static void a (pb archiveFile2, int unused) {
		try {
			++int_c;
			i.archiveFile2 = archiveFile2;
			t.q = i.archiveFile2.getLengthForIndex(16, false);
		} catch (RuntimeException var3) {
			throw id.a(var3, "ab.D(" + (archiveFile2 != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}

	static void a (boolean unused) {
		try {
			++int_p;
			ib.jd_n.a(-1926);
			nc.g.a(0, 0);
			ff.ints_v = v.c(ff.ints_v);
		} catch (RuntimeException var2) {
			throw id.a(var2, "ab.B(" + unused + ')');
		}
	}

	static void a (byte unused) {
		try {
			bc.H.e(15);
			++int_m;
			int i = 0;
			while (i < 32) {
				ec.longs_o[i] = 0L;
				++i;
			}

			int i1 = 0;
			while (i1 < 32) {
				db.M[i1] = 0L;
				++i1;
			}

			le.int_mb = 0;
		} catch (RuntimeException var4) {
			throw id.a(var4, "ab.F(" + unused + ')');
		}
	}

	static void b (int unused) {
		try {
			++int_b;
			if (bf.int_l == 0) {
				if (be.nd_c == null) {
					int i = client.int_qb;
					if (tc.K && wb.nb >= 516 && sb.int_b >= 160 && wb.nb <= 765 && sb.int_b <= 205) {
						i = 0;
					}

					if (s.ub) {
						if (i != 1) {
							int i1 = pb.H;
							int i2 = la.t;
							if (bf.int_d == 0) {
								i2 -= 4;
								i1 -= 4;
							} else if (bf.int_d == 1) {
								i2 -= 205;
								i1 -= 553;
							} else if (bf.int_d == 2) {
								i2 -= 357;
								i1 -= 17;
							}

							if (i1 < -10 + uc.gc || 10 + uc.gc + ud.I < i1 || i2 < -10 + n.eb || i2 > 10 + n.eb + wc.n) {
								if (bf.int_d == 2) {
									w.h = true;
								}

								s.ub = false;
								if (bf.int_d == 1) {
									db.F = true;
								}
							}
						} else {
							int i1 = n.eb;
							int i2 = uc.gc;
							int i3 = ud.I;
							int i4 = wb.nb;
							int i5 = sb.int_b;
							if (bf.int_d == 0) {
								i4 -= 4;
								i5 -= 4;
							} else if (bf.int_d == 1) {
								i4 -= 553;
								i5 -= 205;
							}

							int i8 = -1;
							if (bf.int_d == 2) {
								i4 -= 17;
								i5 -= 357;
							}

							int i6 = 0;
							if (i6 < id.rb) {
								do {
									int i7 = i1 + 31 + (id.rb - 1 - i6) * 15;
									if (i4 > i2 && i4 < i2 + i3 && i5 > -13 + i7 && i7 + 3 > i5) {
										i8 = i6;
									}

									++i6;
								} while (i6 < id.rb);
							}

							if (i8 != -1) {
								db.b(i8, -3);
							}

							if (bf.int_d == 1) {
								db.F = true;
							}

							s.ub = false;
							if (bf.int_d == 2) {
								w.h = true;
							}
						}
					} else {
						if (i == 1 && id.rb > 0) {
							int i1 = sa.mb[id.rb + -1];
							if (i1 == 37 || i1 == 10 || i1 == 1 || i1 == 48 || i1 == 36 || i1 == 28 || i1 == 50 || i1 == 6 || i1 == 31 || i1 == 57 || i1 == 23 || i1 == 1006) {
								int i2 = kd.ints_f[id.rb + -1];
								int fileId = sb.ints_k[-1 + id.rb];
								nd class_nd = bf.b('\uffff', fileId);
								if (q.a((byte) 28, fc.a(class_nd, 1572721824)) || a.d(fc.a(class_nd, 1572721824), 1073340130)) {
									bf.int_l = 2;
									n.qb = 0;
									qc.V = false;
									if (sa.zb == fileId >> 16) {
										bf.int_l = 1;
									}

									if (ta.Sb == fileId >> 16) {
										bf.int_l = 3;
									}

									l.O = fileId;
									ha.int_pb = sb.int_b;
									bf.int_g = wb.nb;
									a.int_lb = i2;
									return;
								}
							}
						}

						if (i == 1 && (ad.int_t == 1 || ad.a(-1 + id.rb, true)) && id.rb > 2) {
							i = 2;
						}

						if (i == 1 && id.rb > 0) {
							db.b(-1 + id.rb, -3);
						}

						if (i != 2 || id.rb <= 0) {
							return;
						}

						qe.b(-106);
					}
				}
			}
		} catch (RuntimeException var11) {
			throw id.a(var11, "ab.E(" + unused + ')');
		}
	}
}
