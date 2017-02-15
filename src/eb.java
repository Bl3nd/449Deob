class eb {
	static rd loadingIgnoreList2;
	static ia[] ias_c;
	static int int_d;
	static int int_e;
	static int int_f = 50;
	static int[] ints_g;
	static int[] ints_i;
	static rd username_2;
	static rd hidden2;
	static ke cacheFile9;
	static rd rd_n = md.a((String) "Ausw-=hlen", (byte) 126);
	static rd rd_o;
	static int int_p;
	static int int_q;
	static rd rd_r;
	static pb archiveFile3;
	static int int_t;
	static int int_u;
	private static rd hidden = md.a((String) "Hidden", (byte) 121);
	private static rd loadingIgnoreList = md.a((String) "Loading ignore list", (byte) 117);
	private static rd username_;

	static {
		loadingIgnoreList2 = loadingIgnoreList;
		rd_r = md.a("Lade Eingabe)2Steuerungsprogramm)3)3)3", (byte) 114);
		ints_i = new int[25];
		username_ = md.a("Username: ", (byte) 122);
		hidden2 = hidden;
		username_2 = username_;
		ias_c = new ia[50];
		rd_o = md.a("Ein kostenloses Spielkonto erstellen)3", (byte) 121);
	}

	public static void a (byte unused) {
		try {
			rd_n = null;
			ints_g = null;
			loadingIgnoreList = null;
			ias_c = null;
			cacheFile9 = null;
			hidden2 = null;
			hidden = null;
			rd_r = null;
			loadingIgnoreList2 = null;
			username_2 = null;
			ints_i = null;
			archiveFile3 = null;
			username_ = null;
			rd_o = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "eb.Q(" + unused + ')');
		}
	}

	@SuppressWarnings("StatementWithEmptyBody")
	static synchronized void a (int[] data, int len) {
		int i7 = len;
		if (qb.mb) {
			i7 = len << 1;
		}

		int size = 0;
		for (i7 -= 7; i7 > size ; data[size++] = 0) {
			data[size++] = 0;
			data[size++] = 0;
			data[size++] = 0;
			data[size++] = 0;
			data[size++] = 0;
			data[size++] = 0;
			data[size++] = 0;
		}

		for (i7 += 7; i7 > size ; data[size++] = 0) {}

		lc.l -= len;
		if (te.Ub != null && lc.l <= 0) {
			lc.l += hc.sampleRate >> 4;
			ka.a(-15, te.Ub);
			va.a(te.Ub, te.Ub.c(), 89);
			int i = 0;
			int i1 = 255;
			int i2;
			for (int i3 = 7 ; i1 != 0 ; --i3) {
				int i4;
				if (i3 < 0) {
					i2 = i3 & 3;
					i4 = -(i3 >> 2);
				} else {
					i2 = i3;
					i4 = 0;
				}

				for (int i5 = i1 >>> i2 & 286331153 ; i5 != 0 ; i5 >>>= 4) {
					if ((i5 & 1) != 0) {
						i1 &= ~(1 << i2);
						mc class_mc = null;
						mc class_mc_2 = q.mcs_v[i2];
						while (class_mc_2 != null) {
							de class_de = class_mc_2.z;
							if (class_de != null && class_de.z > i4) {
								i1 |= 1 << i2;
								class_mc = class_mc_2;
								class_mc_2 = class_mc_2.B;
							} else {
								class_mc_2.C = true;
								int i6 = class_mc_2.a();
								i += i6;
								if (class_de != null) {
									class_de.z += i6;
								}

								if (i >= db.G) {
									break;
								}

								mc class_mc_3 = class_mc_2.b();
								if (class_mc_3 != null) {
									for (int var15 = class_mc_2.A ; class_mc_3 != null ; class_mc_3 = class_mc_2.d()) {
										va.a(class_mc_3, var15 * class_mc_3.c() >> 8, 105);
									}
								}

								mc class_mc_4 = class_mc_2.B;
								class_mc_2.B = null;
								if (class_mc == null) {
									q.mcs_v[i2] = class_mc_4;
								} else {
									class_mc.B = class_mc_4;
								}

								if (class_mc_4 == null) {
									ud.z[i2] = class_mc;
								}

								class_mc_2 = class_mc_4;
							}
						}
					}

					i2 += 4;
					++i4;
				}
			}

			for (i2 = 0; i2 < 8 ; ++i2) {
				mc class_mc = q.mcs_v[i2];
				mc class_mc_2;
				for (q.mcs_v[i2] = ud.z[i2] = null; class_mc != null ; class_mc = class_mc_2) {
					class_mc_2 = class_mc.B;
					class_mc.B = null;
				}
			}
		}

		if (lc.l < 0) {
			lc.l = 0;
		}

		if (te.Ub != null) {
			te.Ub.a(data, 0, len);
		}

		nb.a(len, (byte) 102);
	}

	static synchronized void a (int unused, int unused2) {
		try {
			lc.l -= 256;
			++int_p;
			if (lc.l < 0) {
				lc.l = 0;
			}

			if (te.Ub != null) {
				te.Ub.e(256);
			}

			nb.a(256, (byte) 109);
		} catch (RuntimeException var3) {
			throw id.a(var3, "eb.N(" + unused + ',' + unused2 + ')');
		}
	}

	static synchronized void a (int unused, mc class_mc) {
		try {
			++int_e;
			te.Ub = class_mc;
		} catch (RuntimeException var3) {
			throw id.a(var3, "eb.O(" + unused + ',' + (class_mc != null ? "{...}" : "null") + ')');
		}
	}

	void a (long l) {
		try {
			++int_q;
		} catch (RuntimeException var4) {
			throw id.a(var4, "eb.J(" + l + ')');
		}
	}

	void a () {
		try {
			++int_t;
		} catch (RuntimeException var2) {
			throw id.a(var2, "eb.K(" + ')');
		}
	}
}
