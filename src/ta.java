import java.awt.FontMetrics;

final class ta extends ha {
	static int int_rb;
	static int int_sb;
	static pb archiveFile7;
	static int int_vb;
	static rd[] xb = new rd[500];
	static FontMetrics fontMetrics;
	static int Bb = 0;
	static int Db = 256;
	static int Gb;
	static int Hb;
	static int Jb;
	static dd Kb = new dd(64);
	static b[] Nb = new b['耀'];
	static int Ob = 0;
	static int[] Pb = new int[2000];
	static int Qb = 0;
	static int Rb = 0;
	static int Sb = -1;
	static int Vb;
	static rd weSuspectSomeoneKnowsYourPassword2;
	static byte[][][] Xb;
	static int Yb = -1;
	static int[] Zb = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
	private static rd weSuspectSomeoneKnowsYourPassword = md.a((String) "We suspect someone knows your password)3", (byte) 115);
	private static rd Ub = md.a((String) " steht bereits auf Ihrer Ignorieren)2Liste(Q", (byte) 126);

	static {
		weSuspectSomeoneKnowsYourPassword2 = weSuspectSomeoneKnowsYourPassword;
	}

	private int int_ub;
	private int int_wb;
	private e zb;
	private int Ab;
	private int Cb;
	private int Eb;
	private int Fb;
	private int Ib;
	private int Lb;
	private int Mb;

	ta (int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, ha var10) {
		try {
			this.Eb = var1;
			this.int_wb = var3;
			this.Ab = var4;
			this.Lb = var6;
			this.int_ub = var2;
			this.Mb = var5;
			this.Ib = var7;
			if (var8 != -1) {
				this.zb = bd.a(var8, false);
				this.Cb = ce.y + -1;
				this.Fb = 0;
				if (~this.zb.Db == -1 && var10 != null && var10 instanceof ta) {
					ta var11 = (ta) var10;
					if (var11.zb == this.zb) {
						this.Cb = var11.Cb;
						this.Fb = var11.Fb;
						return;
					}
				}

				if (var9 && this.zb.Bb != -1) {
					this.Fb = (int) ((double) this.zb.Gb.length * Math.random());
					this.Cb -= (int) ((double) this.zb.Eb[this.Fb] * Math.random());
				}
			}

		} catch (RuntimeException var12) {
			throw id.a(var12, "ta.<init>(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ',' + (var10 != null ? "{...}" : "null") + ')');
		}
	}

	public static void d (byte var0) {
		try {
			if (var0 == -101) {
				weSuspectSomeoneKnowsYourPassword = null;
				fontMetrics = null;
				weSuspectSomeoneKnowsYourPassword2 = null;
				Ub = null;
				Kb = null;
				Pb = null;
				Zb = null;
				Xb = null;
				Nb = null;
				xb = null;
				archiveFile7 = null;
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "ta.C(" + var0 + ')');
		}
	}

	static void f (int var0) {
		int var2 = client.int_tb;

		try {
			weSuspectSomeoneKnowsYourPassword2 = sb.rd_h;
			dd.pressChangeYourPasswordOnFrontPage2 = e.rd_gb;
			ra.loadingSprites2 = rb.B;
			l.welcomeToRunescape2 = ud.O;
			tb.loadedInputHandler2 = eb.rd_r;
			ca.attack2 = ke.Kb;
			uc.publicChat2 = ke.Ob;
			e.clickToContinue2 = tb.Vb;
			jc.runescapeHasBeenUpdated2 = we.l;
			u.loadedInterfaces2 = nc.q;
			pd.D = tb.rd_kb;
			dc.close2 = rd.C;
			je.rd_q = ub.B;
			lc.connectionLost2 = hf.Hb;
			dd.privateChat2 = kd.rd_e;
			ab.invalidUsernameOrPassword2 = hf.gb;
			m.systemUpdateIn_2 = wa.rd_ub;
			e.connectionTimedOut2 = m.rd_n;
			gf.rd_l = pb.n;
			la.loadingFonts2 = nd.ud;
			hc.bb = tc.O;
			pd.rd_o = tb.rd_kb;
			ee.startingGameEngine2 = ba.rd_q;
			f.Tc = mb.t;
			pd.newUser2 = qb.lb;
			n.couldNotCompleteLogin2 = kd.g;
			md.x = qe.G;
			j.yb = wb.bb;
			sd.unexpectedLoginserverResponse2 = qc.N;
			ha.invalidLoginserverRequested2 = ab.rd_k;
			jc.unexpectedServerResponse2 = t.f;
			pa.g = uc.ac;
			se.w = rb.r;
			cc.offline2 = qc.S;
			te.ub = se.rd_n;
			wd.youAreStandingInAMembersOnlyArea2 = pb.X;
			ge.rd_bb = bd.yc;
			je.rd_k = hf.Ab;
			f.K2 = mb.t;
			pd.T = te.Rb;
			if (var0 != -1) {
				f(-108);
			}

			ge.loadedUpdateList2 = ec.rd_s;
			sb.rd_u = l.y;
			pd.malformedLoginPacket2 = r.rd_k;
			ad.unexpectedLoginserverResponse_pleaseTryUsingADifferentWorld = ff.B;
			d.connectingToFriendserver2 = me.I;
			pd.y = ub.B;
			h.loadedGamescreen2 = be.rd_d;
			vc.loadingTitleScreen2 = jc.db;
			pd.R = tb.rd_kb;
			ad.M2 = r.M;
			ba.rd_n = jc.bb;
			pd.d = tb.rd_kb;
			pd.J = s.kb;
			we.pleaseWait_attemptingToReestablish2 = wd.s;
			qc.T = id.U;
			ad.invalidLoginserverRequested_pleaseTryUsingADifferentWorld = ff.B;
			pd.a = td.rd_ud;
			pd.rd_f = qc.C;
			pd.v = la.j;
			bd._seconds2 = u.cb;
			sd.badSessionId_unableToConnect = qb.ab;
			l.i = m.rd_f;
			td.td = ge.Y;
			eb.loadingIgnoreList2 = td.Dd;
			h.loadedTextures2 = id.z;
			se.rd_a = m.rd_k;
			l.I = la.s;
			eb.username_2 = wc.m;
			ce.unableToFind_2 = ja.rd_l;
			w.preparedSoundEngine2 = ge.Q;
			pd.n = tb.rd_kb;
			sd.loadedConfig2 = mb.m;
			ub.E = fb.rd_j;
			jb.I = mb.c;
			ca.preparedVisibilityMap2 = pb.w;
			q.yourAccountIsAlreadyLoggedIn2 = we.rd_m;
			bd.off2 = fb.rd_i;
			gf.theServerIsBeingUpdated2 = i.L;
			qc.walkHere2 = df.rd_u;
			j.rd_sb = id.Lb;
			hb.rd_m = pd.O;
			pd.z = te.Rb;
			od.loadingGameScreen2 = sb.rd_n;
			vc.H = se.x;
			s.bb = mb.y;
			wb.loadingWordpack2 = ke.Bb;
			j.accountLockedAsWeSuspectItHasBeenStolen2 = ee.z;
			va.addIgnore2 = tc.R;
			bc.enterAmount_2 = pd.i;
			ke.pleaseSubscribeOrUseADifferentWorld2 = t.a;
			se.continueText2 = d.rd_s;
			gf.rd_p = n.cb;
			je.acceptTrade2 = b.rd_ad;
			pd.j = n.tb;
			uc.loadingTextures2 = ee.rd_r;
			pd.Q = la.j;
			pd.x = tb.rd_kb;
			cf.enterObjectName2 = ie.b;
			pd.N = tb.rd_kb;
			dd._fromYourignoreListFirst2 = cc.rd_l;
			h.rd_n = b.rd_bd;
			cf.pleaseUseADifferentWorld_thisWorldIsRunningAClosedBeta = tb.rd_kb;
			nd.td = u.rd_hb;
			vc.J = ee.rd_l;
			pb.l = wd.w;
			ab.yourAccountHasBeenDisabled2 = mb.A;
			pd.bb = tb.rd_kb;
			bc.thisWorldIsRunningAClosedBeta2 = t.r;
			pa.l = sb.rd_d;
			uc.jc = af.rd_e;
			l.checkingForUpdates2 = ge.V;
			sa.Z = l.m;
			fb.ok2 = ib.rd_b;
			pd.m = p.S;
			gd.rd_m = n.ib;
			jb.tryAgainIn60Secs2 = wc.j;
			kd.sorryInvitedPlayersOnly2 = wa.qb;
			ad.connectionTimedOut_pleaseTryUsingADifferentWorld = ra.l;
			uc.vc = pe.o;
			te.thisWorldIsFull2 = ce.rd_o;
			ce.enterNameOfPlayerToAddToList2 = f.rd_wb;
			se.rd_b = eb.rd_o;
			mb.reportAbuse2 = ke.Db;
			ge.rd_db = sb.rd_g;
			pd.p = tb.rd_kb;
			pd.H = ff.B;
			pd.U = tb.rd_kb;
			kb.s = Ub;
			ra.noReplyFromLoginserver_pleaseWait1MinuteAndTryAgain = gd.rd_k;
			sa.loading_PleaseWait2 = a.rd_ob;
			va.acceptChallenge2 = hc.Ab;
			pd.q = tb.rd_kb;
			++Jb;
			ad.noResponseFromServer_pleaseTryUsingADifferentWorld = ra.l;
			cf.take2 = lc.c;
			pd.Y = tb.rd_kb;
			pd.c = tb.rd_kb;
			ra.theServerIsBeingUpdated_pleaseWait1MinuteAndTryAgain = gd.rd_k;
			me.errorConnectingToServer2 = md.z;
			gf.rd_c = vc.F;
			nc.x = ca.rd_p;
			jb.space2 = ce.colon_;
			wd.m = wb.rb;
			qe._hasLoggedOut2 = hb.rd_c;
			f.youNeedAMembersAccountToLoginToThisWorld2 = tc.J;
			af.pleaseReloadThisPage2 = hb.rd_a;
			vc.noReplyFromLoginserver2 = jd.rd_l;
			cf.worldFull_pleaseUseADifferentWorld = hf.Fb;
			l.pleaseTryAgain2 = dd.rd_m;
			h.rd_r = b.rd_bd;
			cf.enterNameOfFriendToAddToList2 = ie.n;
			va.r = pe.m;
			pd.ab = b.rd_nd;
			q.trade_compete2 = mb.x;
			l.H = pb.A;
			ad.loginLimitExceeded2 = pa.rd_f;
			ld.h = u.sb;
			ce.to2 = df.rd_w;
			wa.tooManyConnectionFromYourAddress2 = la.b;
			je.rd_s = gf.rd_e;
			nb.b = fc.y;
			vc.L = be.rd_o;
			sa.use2 = pc.E;
			id.loadingConfig2 = gd.rd_g;
			ab.rd_l = qb.hb;
			ba.errorLoadingYourProfile2 = db.X;
			o.loginServerOffline2 = we.rd_s;
			ra.pleaseWait5MinutesBeforeTryingAgain2 = rb.i;
			ke.select2 = eb.rd_n;
			bf.asItWasUsedToBreakOurRules2 = ra.t;
			ad.unexpectedServerResponse_pleaseTryUsingADifferentWorld = ff.B;
			eb.hidden2 = wb.rb;
			jb.V = e.Z;
			r.loadedTitleScreen2 = e.rd_hb;
			sd.loginServerOffline_unableToConnect = qb.ab;
			kb.pleaseCheckYourMessageCentreForDetails2 = jb.U;
			ka.pleaseContactCustomerSupport2 = hf.zb;
			pd.X = o.rd_u;
			h.y = e.rd_wb;
			jb.X = d.rd_r;
			kd.loadedWordpack2 = pe.h;
			ja.rd_g = q.A;
			ad.connectingToUpdateServer2 = rd.rd_b;
			af.rd_a = le.qb;
			db.on2 = se.rd_h;
			gf.rd_n = hc.xb;
			rb.g = pb.L;
			bb._million2 = r.M;
			nc._hasLoggedIn2 = id.Kb;
			we.toPlayOnThisWorldMoveToAFreeAreaFirst2 = n.rb;
			la.loadingInterfaces2 = ha.rd_jb;
			ee.friends2 = q.E;
			pd.l = tb.rd_kb;
			f.enterYourUsername_password2 = tc.C;
			ba.pleaseCloseTheInterfaceBeforeUsingReportAbuse2 = tc.H;
			ad.couldNotCompleteLogin_pleaseTryUsingADifferentWorld = bb.rd_j;
			ff.loadedFonts2 = wc.c;
			ud.J = pa.m;
			bd.thisComputersAddressHasBeenBlocked2 = va.i;
			qe.z = cf.rd_v;
			pd.K = tb.rd_kb;
			fc.badSessionId2 = cf.rd_u;
			mb.r = ad.rd_s;
			pc.noResponseFromServer2 = i.S;
			u.rd_jb = be.rd_e;
			kb.h = ud.S;
			md.u = hc.Fb;
			pd.t = tb.rd_kb;
			hf.pressRecoverALockedAccountOnFrontPage2 = wa.yb;
			le.runescapeIsLoading_pleaseWait2 = nb.a;
			pd.rd_b = tb.rd_kb;
			u.tooManyIncorrectLoginsFromYourAddress2 = pc.B;
			hb.addFriend2 = se.c;
			fc.noMatchingObjectsFound_pleaseShortenSearch2 = nb.o;
			pd.rd_h = b.rd_kd;
			pd.r = fb.rd_c;
			ba.rd_m = sb.gelb_;
			tb.examine2 = sb.rd_i;
		} catch (RuntimeException var3) {
			throw id.a(var3, "ta.B(" + var0 + ')');
		}

		if (r.U != 0) {
			++var2;
			client.int_tb = var2;
		}

	}

	static void e (byte paramByte) {
		//System.err.println("Method e(byte) in class ta is not decompiled!");
		int i4 = client.int_tb;
		try {
			jc.g(0);
			Gb += 1;
			if (lc.currentGameState != 10) {
				return;
			}
			int i = client.int_qb;
			int k = /*65365 + */sb.int_b;
			int j = /*65334 + */wb.nb;
			int m;
			int n;
			if (h.int_c == 0) {
				m = 302;
				n = 291;
				if (i == 1 && m - 75 <= j && 75 + m >= j && n + -20 <= k && n + 20 >= k) {
					h.int_c = 3;
					fc.int_k = 0;
				}
				m = 462;
				if (i == 1 && -75 + m <= j && 75 + m >= j && n + -20 <= k && n - -20 >= k) {
					ff.z = pd.X;
					ff.rd_m = pd.R;
					fc.int_k = 0;
					ff.rd_i = f.enterYourUsername_password2;
					h.int_c = 2;
				}
			} else if (h.int_c != 2) {
				if (~h.int_c == -4) {
					m = 382;
					n = 321;
					if (~i == -2 && j >= -75 + m && j <= m - -75 && -20 + n <= k && n - -20 >= k) {
						h.int_c = 0;
					}
				}
			} else {
				m = 231;
				m += 30;
				if (~i == -2 && m + -15 <= k && m > k) {
					fc.int_k = 0;
				}
				n = 302;
				int i1 = 321;
				m += 15;
				if (~i == -2 && k >= -15 + m && k > m) {
					fc.int_k = 1;
				}
				m += 15;
				if (~i == -2 && n - 75 <= j && j <= n - -75 && k >= i1 + -20 && i1 - -20 >= k) {
					ff.rd_f = ff.rd_f.c(4009).e(-91);
					be.a(0, pd.x, pd.rd_b, l.H);
					bd.a(false, 20);
					return;
				}
				n = 462;
				if (~i == -2 && j >= n - 75 && 75 + n >= j && k >= i1 - 20 && i1 + 20 >= k) {
					h.int_c = 0;
					ff.rd_w = ff.rd_t;
					ff.rd_f = ff.rd_t;
				}
				while (kd.b(1)) {
					int i2 = 0;
					int i3 = 0;
					while (uc.pc.b(36188) > i3) {
						if (~dd.z == ~uc.pc.readUnsignedByte(i3, 51124)) {
							i2 = 1;
							/*if (i4 == 0) {
								break;
							}*/
						}
						i3++;
					}
					if (~fc.int_k != -1) {
						if (~fc.int_k == -2) {
							if (af.int_i == 85 && ~ff.rd_w.b(36188) < -1) {
								ff.rd_w = ff.rd_w.b(-1 + ff.rd_w.b(36188), 41791, 0);
							}
							if (af.int_i == 84 || ~af.int_i == -81) {
								fc.int_k = 0;
							}
							if (i2 != 0 && ~ff.rd_w.b(36188) > -21) {
								ff.rd_w = ff.rd_w.d(dd.z, -126);
							}
						}
					} else {
						if (~af.int_i == -86 && ~ff.rd_f.b(36188) < -1) {
							ff.rd_f = ff.rd_f.b(-1 + ff.rd_f.b(36188), 41791, 0);
						}
						if (af.int_i == 84 || ~af.int_i == -81) {
							fc.int_k = 1;
						}
						if (i2 != 0 && ff.rd_f.b(36188) < 12) {
							ff.rd_f = ff.rd_f.d(dd.z, -98);
						}
					}
				}
			}
		} catch (RuntimeException localRuntimeException) {
			throw id.a(localRuntimeException, "ta.A(" + paramByte + ')');
		}

	}

	final ue c (byte var1) {
		int var3 = client.int_tb;

		try {
			if (var1 >= -9) {
				d((byte) -64);
			}

			++Hb;
			if (this.zb != null) {
				int var2;
				label52:
				{
					var2 = -this.Cb + ce.y;
					if (~var2 < -101) {
						if (this.zb.Bb > 0) {
							var2 = 100;
							if (var3 == 0 && ~this.zb.Eb[this.Fb] <= ~var2) {
								break label52;
							}
						} else if (~this.zb.Eb[this.Fb] <= ~var2) {
							break label52;
						}
					} else if (~this.zb.Eb[this.Fb] <= ~var2) {
						break label52;
					}

					do {
						var2 -= this.zb.Eb[this.Fb];
						++this.Fb;
						if (this.Fb >= this.zb.Gb.length) {
							this.Fb -= this.zb.Bb;
							if (~this.Fb > -1 || this.Fb >= this.zb.Gb.length) {
								this.zb = null;
								if (var3 == 0) {
									break;
								}
							}
						}
					} while (~this.zb.Eb[this.Fb] > ~var2);
				}

				this.Cb = -var2 + ce.y;
			}

			bd var5 = ub.a(-112, this.Eb);
			if (var5.Jb != null) {
				var5 = var5.g(-1);
			}

			return var5 == null ? null : var5
					.a(this.Ab, this.int_ub, this.Fb, this.zb, this.Mb, this.Lb, -26359, this.int_wb, this.Ib);
		} catch (RuntimeException var4) {
			throw id.a(var4, "ta.F(" + var1 + ')');
		}
	}
}
