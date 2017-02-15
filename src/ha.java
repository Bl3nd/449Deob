abstract class ha extends jb {
	static rd Z = md.a((String) "@cr1@", (byte) 114);
	static int int_ab;
	static int int_bb;
	static boolean boolean_cb = true;
	static rd rd_db = md.a((String) "::fpsoff", (byte) 124);
	static int int_eb;
	static rd rd_fb;
	static int int_hb;
	static rd sidePanelRedrawn = md.a((String) "Side panel redrawn", (byte) 117);
	static rd rd_jb = md.a((String) "Lade Benutzeroberfl-=che )2 ", (byte) 127);
	static int int_kb;
	static rd invalidLoginserverRequested2;
	static jd jd_mb;
	static int[][] ints_nb;
	static int[] ints_ob;
	static int int_pb;
	private static rd invalidLoginserverRequested = md.a((String) "Invalid loginserver requested)3", (byte) 115);

	static {
		invalidLoginserverRequested2 = invalidLoginserverRequested;
		int_pb = 0;
		rd_fb = md.a("null", (byte) 123);
		ints_nb = new int[104][104];
	}

	int int_qb = 1000;

	static void a (byte var0, int var1, int var2, int var3, tb var4) {
		int var10 = client.int_tb;

		try {
			++int_kb;
			if (id.rb < 400) {
				if (var4.Fb != null) {
					var4 = var4.f(-1);
				}

				if (var4 != null) {
					if (var4.Eb) {
						if (var0 >= -81) {
							invalidLoginserverRequested = null;
						}

						rd var5 = var4.sb;
						if (var4.Tb != 0) {
							var5 = pc.a((byte) 126, new rd[]{
									var5,
									dd.a(af.td_p.int_sd, 7, var4.Tb),
									l.gb,
									qc.T,
									bf.a(var4.Tb, -31766),
									md.o
							});
						}

						if (we.f == 1) {
							ab.a(var1, pc.a((byte) 127, new rd[]{
									ca.rd_d,
									je.rd_v,
									var5
							}), var3, (byte) 122, 30, sa.use2, var2);
							++r.A;
						} else if (!tc.K) {
							rd[] var6 = var4.Gb;
							if (qb.kb) {
								var6 = e.a(112, var6);
							}

							int var7;
							if (var6 != null) {
								var7 = 4;
								if (var10 != 0 || var7 >= 0) {
									do {
										if (var6[var7] != null && !var6[var7].b(ca.attack2, true)) {
											++bc.l;
											byte var8 = 0;
											if (var7 == 0) {
												var8 = 35;
											}

											if (var7 == 1) {
												var8 = 49;
											}

											if (var7 == 2) {
												var8 = 20;
											}

											if (var7 == 3) {
												var8 = 47;
											}

											if (var7 == 4) {
												var8 = 54;
											}

											ab.a(var1, pc.a((byte) 125, new rd[]{
													ab.rd_j,
													var5
											}), var3, (byte) 127, var8, var6[var7], var2);
										}

										--var7;
									} while (var7 >= 0);
								}
							}

							if (var6 != null) {
								var7 = 4;
								if (var10 != 0 || ~var7 <= -1) {
									do {
										if (var6[var7] != null && var6[var7].b(ca.attack2, true)) {
											++nc.z;
											short var12 = 0;
											int var9 = 0;
											if (~var4.Tb < ~af.td_p.int_sd) {
												var12 = 2000;
											}

											if (~var7 == -1) {
												var9 = 35 - -var12;
											}

											if (var7 == 1) {
												var9 = 49 - -var12;
											}

											if (var7 == 2) {
												var9 = 20 - -var12;
											}

											if (var7 == 3) {
												var9 = 47 + var12;
											}

											if (var7 == 4) {
												var9 = var12 + 54;
											}

											ab.a(var1, pc.a((byte) 125, new rd[]{
													ab.rd_j,
													var5
											}), var3, (byte) 124, var9, var6[var7], var2);
										}

										--var7;
									} while (~var7 <= -1);
								}
							}

							ab.a(var1, pc
									.a((byte) 126, new rd[]{ab.rd_j, var5}), var3, (byte) 125, 1005, tb.examine2, var2);
							++nb.d;
						} else if ((d.int_g & 2) == 2) {
							ab.a(var1, pc.a((byte) 127, new rd[]{
									ee.rd_t,
									je.rd_v,
									var5
							}), var3, (byte) 125, 32, sd.P, var2);
							++ec.int_c;
						}
					}
				}
			}
		} catch (RuntimeException var11) {
			throw id.a(var11, "ha.W(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + "{...}" + ')');
		}
	}

	public static void c (boolean var0) {
		try {
			rd_db = null;
			ints_ob = null;
			Z = null;
			rd_jb = null;
			jd_mb = null;
			rd_fb = null;
			sidePanelRedrawn = null;
			ints_nb = null;
			invalidLoginserverRequested2 = null;
			if (var0) {
				invalidLoginserverRequested = null;
			}

			invalidLoginserverRequested = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "ha.AA(" + var0 + ')');
		}
	}

	ue c (byte var1) {
		try {
			++int_eb;
			if (var1 > -9) {
				jd_mb = null;
			}

			return null;
		} catch (RuntimeException var3) {
			throw id.a(var3, "ha.F(" + var1 + ')');
		}
	}

	void a (int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		try {
			ue var10 = this.c((byte) -117);
			++int_bb;
			if (var10 != null) {
				this.int_qb = var10.int_qb;
				var10.a(var1, var2, var3, var4, var5, var6, var7, var8, var9);
			}
		} catch (RuntimeException var11) {
			throw id.a(var11, "ha.V(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ')');
		}
	}
}
