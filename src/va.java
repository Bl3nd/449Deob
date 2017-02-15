import java.awt.Component;

abstract class va {
	static int a;
	static int b;
	static int c;
	static dd dd_d = new dd(30);
	static rd e = md.a((String) "(Y ", (byte) 124);
	static int int_f;
	static int g = 0;
	static rd i = md.a((String) "Die Adresse dieses Computers wurde gesperrt)1", (byte) 119);
	static boolean isMembers_j = false;
	static he[] hitmarks;
	static rd acceptChallenge2;
	static rd addIgnore2;
	static rd p;
	static int int_q;
	static rd r;
	private static rd addIgnore;
	private static rd k;
	private static rd acceptChallenge = md.a((String) "Accept challenge", (byte) 120);

	static {
		acceptChallenge2 = acceptChallenge;
		k = md.a("You have only just left another world)3", (byte) 126);
		p = md.a("@whi@ )4 ", (byte) 119);
		r = k;
		addIgnore = md.a("Add ignore", (byte) 121);
		addIgnore2 = addIgnore;
	}

	static void a (byte var0, int var1) {
		try {
			++c;
			if (uc.n(-62)) {
				int var2 = -20 % ((var0 - 60) / 54);
				if (f.boolean_bc) {
					be.int_j = var1;
				} else {
					addIgnore.readUnsignedByte((byte) 93, var1);
				}
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "va.E(" + var0 + ',' + var1 + ')');
		}
	}

	public static void a (int var0) {
		try {
			p = null;
			r = null;
			addIgnore2 = null;
			if (var0 != 0) {
				hitmarks = null;
			}

			e = null;
			i = null;
			addIgnore = null;
			hitmarks = null;
			k = null;
			acceptChallenge = null;
			acceptChallenge2 = null;
			dd_d = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "va.C(" + var0 + ')');
		}
	}

	static void a (int var0, int var1, int var2, td var3, int var4) {
		int var9 = client.int_tb;

		try {
			if (var1 == 14) {
				++a;
				if (var3 != af.td_p) {
					if (~id.rb > -401) {
						rd var5;
						label126:
						{
							if (var3.gd != 0) {
								var5 = pc.a((byte) 127, new rd[]{
										var3.Gd,
										l.gb,
										ub.E,
										bf.a(var3.gd, -31766),
										md.o
								});
								if (var9 == 0) {
									break label126;
								}
							}

							var5 = pc.a((byte) 127, new rd[]{
									var3.Gd,
									dd.a(af.td_p.int_sd, 7, var3.int_sd),
									l.gb,
									qc.T,
									bf.a(var3.int_sd, -31766),
									md.o
							});
						}

						int var6;
						label135:
						{
							if (~we.f == -2) {
								ab.a(var2, pc.a((byte) 126, new rd[]{
										ca.rd_d,
										ra.b,
										var5
								}), var0, (byte) 122, 14, sa.use2, var4);
								++we.o;
								if (var9 == 0) {
									break label135;
								}
							}

							if (tc.K) {
								if (~(8 & d.int_g) != -9) {
									break label135;
								}

								ab.a(var2, pc.a((byte) 125, new rd[]{
										ee.rd_t,
										ra.b,
										var5
								}), var0, (byte) 126, 16, sd.P, var4);
								++qc.I;
								if (var9 == 0) {
									break label135;
								}
							}

							var6 = 4;
							do {
								if (s.wb[var6] != null) {
									short var7;
									label88:
									{
										var7 = 0;
										++gf.int_h;
										if (s.wb[var6].b(ca.attack2, true)) {
											if (var3.int_sd > af.td_p.int_sd) {
												var7 = 2000;
											}

											if (af.td_p.Xc == 0 || var3.Xc == 0) {
												break label88;
											}

											if (af.td_p.Xc != var3.Xc) {
												var7 = 0;
												if (var9 == 0) {
													break label88;
												}
											}

											var7 = 2000;
											if (var9 == 0) {
												break label88;
											}
										}

										if (tb.Pb[var6]) {
											var7 = 2000;
										}
									}

									int var8 = 0;
									if (~var6 == -1) {
										var8 = var7 + 43;
									}

									if (var6 == 1) {
										var8 = 26 - -var7;
									}

									if (~var6 == -3) {
										var8 = var7 + 11;
									}

									if (~var6 == -4) {
										var8 = var7 + 34;
									}

									if (~var6 == -5) {
										var8 = var7 + 12;
									}

									ab.a(var2, pc.a((byte) 126, new rd[]{
											u.whiteText,
											var5
									}), var0, (byte) 127, var8, s.wb[var6], var4);
								}

								--var6;
							} while (var6 >= 0);
						}

						var6 = 0;
						if (var9 != 0 || ~id.rb < ~var6) {
							do {
								if (~sa.mb[var6] == -20) {
									ta.xb[var6] = pc.a((byte) 125, new rd[]{qc.walkHere2, jb.space2, u.whiteText, var5});
									return;
								}

								++var6;
							} while (~id.rb < ~var6);

						}
					}
				}
			}
		} catch (RuntimeException var10) {
			throw id.a(var10, "va.B(" + var0 + ',' + var1 + ',' + var2 + ',' + "{...}" + ',' + var4 + ')');
		}
	}

	static void a (mc class_mc, int i, int unused) {
		try {
			++b;
			int i1 = i >> 5;
			mc class_mc_2 = ud.z[i1];
			if (class_mc_2 == null) {
				q.mcs_v[i1] = class_mc;
			} else {
				class_mc_2.B = class_mc;
			}

			ud.z[i1] = class_mc;
			class_mc.A = i;
		} catch (RuntimeException var5) {
			throw id.a(var5, "va.A(" + (class_mc != null ? "{...}" : "null") + ',' + i + ',' + unused + ')');
		}
	}

	static int a (byte unused, pb archiveFile8) {
		try {
			++int_f;
			int gameScreenSpriteCount = 0;
			if (archiveFile8.b((byte) -12, lc.invback, f.Jc)) {
				++gameScreenSpriteCount;
			}

			if (archiveFile8.b((byte) -99, jb.chatback, f.Jc)) {
				++gameScreenSpriteCount;
			}

			if (archiveFile8.b((byte) -102, kd.mapback, f.Jc)) {
				++gameScreenSpriteCount;
			}

			if (archiveFile8.b((byte) -47, d.backbase1, f.Jc)) {
				++gameScreenSpriteCount;
			}

			if (archiveFile8.b((byte) -25, dd.backbase2, f.Jc)) {
				++gameScreenSpriteCount;
			}

			if (archiveFile8.b((byte) -15, we.backhmid1, f.Jc)) {
				++gameScreenSpriteCount;
			}

			if (archiveFile8.b((byte) -96, ec.backleft1, f.Jc)) {
				++gameScreenSpriteCount;
			}

			if (archiveFile8.b((byte) -98, w.backleft2, f.Jc)) {
				++gameScreenSpriteCount;
			}

			if (archiveFile8.b((byte) -96, me.backright1, f.Jc)) {
				++gameScreenSpriteCount;
			}

			if (archiveFile8.b((byte) -78, pe.backright2, f.Jc)) {
				++gameScreenSpriteCount;
			}

			if (archiveFile8.b((byte) -101, td.backtop1, f.Jc)) {
				++gameScreenSpriteCount;
			}

			if (archiveFile8.b((byte) -98, pb.backvmid1, f.Jc)) {
				++gameScreenSpriteCount;
			}

			if (archiveFile8.b((byte) -24, m.backvmid2, f.Jc)) {
				++gameScreenSpriteCount;
			}

			if (archiveFile8.b((byte) -49, jd.backvmid3, f.Jc)) {
				++gameScreenSpriteCount;
			}

			if (archiveFile8.b((byte) -53, t.backhmid2, f.Jc)) {
				++gameScreenSpriteCount;
			}

			if (archiveFile8.b((byte) -63, cc.redstone1, f.Jc)) {
				++gameScreenSpriteCount;
			}

			if (archiveFile8.b((byte) -56, wc.redstone2, f.Jc)) {
				++gameScreenSpriteCount;
			}

			if (archiveFile8.b((byte) -103, qc.redstone3, f.Jc)) {
				++gameScreenSpriteCount;
			}

			if (archiveFile8.b((byte) -34, ld.sideicons, f.Jc)) {
				++gameScreenSpriteCount;
			}

			return gameScreenSpriteCount;
		} catch (RuntimeException var4) {
			throw id.a(var4, "va.H(" + unused + ',' + (archiveFile8 != null ? "{...}" : "null") + ')');
		}
	}

	abstract void addMouseWheelListener (int unused, Component component);

	abstract int getWheelRotation (boolean unused);

	abstract void b (int var1, Component var2);
}
