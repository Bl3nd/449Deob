final class ad {
	static gb gb_a;
	static int int_b;
	static rd M2;
	static rd invalidLoginserverRequested_pleaseTryUsingADifferentWorld;
	static rd noResponseFromServer_pleaseTryUsingADifferentWorld;
	static rd connectionTimedOut_pleaseTryUsingADifferentWorld;
	static rd connectingToUpdateServer2;
	static int int_j;
	static rd[] rds_k = new rd[200];
	static rd rd_l;
	static int int_m;
	static rd couldNotCompleteLogin_pleaseTryUsingADifferentWorld;
	static rd unexpectedServerResponse_pleaseTryUsingADifferentWorld;
	static int int_r;
	static rd rd_s;
	static int int_t;
	static int int_u;
	static boolean boolean_v;
	static int int_w;
	static rd unexpectedLoginserverResponse_pleaseTryUsingADifferentWorld;
	static rd loginLimitExceeded2;
	static int z;
	private static rd connectingToUpdateServer = md.a((String) "Connecting to update server", (byte) 119);
	private static rd pleaseTryUsingADifferentWorld;
	private static rd M = md.a((String) "M", (byte) 124);
	private static rd loginLimitExceeded;

	static {
		connectingToUpdateServer2 = connectingToUpdateServer;
		loginLimitExceeded = md.a("Login limit exceeded)3", (byte) 124);
		M2 = M;
		rd_s = md.a(" zuerst von Ihrer Freunde)2Liste(Q", (byte) 124);
		int_t = 0;
		boolean_v = false;
		pleaseTryUsingADifferentWorld = md.a("Please try using a different world)3", (byte) 119);
		noResponseFromServer_pleaseTryUsingADifferentWorld = pleaseTryUsingADifferentWorld;
		connectionTimedOut_pleaseTryUsingADifferentWorld = pleaseTryUsingADifferentWorld;
		couldNotCompleteLogin_pleaseTryUsingADifferentWorld = pleaseTryUsingADifferentWorld;
		unexpectedLoginserverResponse_pleaseTryUsingADifferentWorld = pleaseTryUsingADifferentWorld;
		unexpectedServerResponse_pleaseTryUsingADifferentWorld = pleaseTryUsingADifferentWorld;
		invalidLoginserverRequested_pleaseTryUsingADifferentWorld = pleaseTryUsingADifferentWorld;
		loginLimitExceeded2 = loginLimitExceeded;
		rd_l = md.a("0(U", (byte) 114);
	}

	static void a (int i, byte unused) {
		try {
			ub class_ub = (ub) bd.Qb.a((byte) 104);
			if (class_ub == null) {
				++int_m;
			} else {
				do {
					if ((long) i == (65535L & class_ub.script >> 48)) {
						class_ub.d(-26669);
					}

					class_ub = (ub) bd.Qb.a(-1);
				} while (class_ub != null);

				++int_m;
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "ad.G(" + i + ',' + unused + ')');
		}
	}

	static sa a (boolean unused, int fileRequest) {
		try {
			++int_u;
			sa class_sa = (sa) tb.Hb.a((byte) -71, (long) fileRequest);
			if (class_sa != null) {
				return class_sa;
			} else {
				byte[] data = wc.archiveFile2.a(1, fileRequest, (byte) 66);
				class_sa = new sa();
				if (data != null) {
					class_sa.a(fileRequest, false, new id(data));
				}

				class_sa.i(-22130);
				tb.Hb.a(-93, class_sa, (long) fileRequest);
				return class_sa;
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "ad.D(" + unused + ',' + fileRequest + ')');
		}
	}

	static boolean a (int size, boolean unused) {
		try {
			++int_j;
			if (size < 0) {
				return false;
			} else {
				int i = sa.mb[size];
				if (i >= 2000) {
					i -= 2000;
				}

				return i == 7;
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "ad.E(" + size + ',' + unused + ')');
		}
	}

	@SuppressWarnings("SynchronizeOnNonFinalField")
	static void a (byte unused) {
		try {
			++int_w;
			synchronized (f.Ac) {
				if (fc.int_n == 0) {
					f.Nc.a(5, (byte) -103, new cf());
				}

				fc.int_n = 600;
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "ad.F(" + unused + ')');
		}
	}

	public static void a (int unused) {
		try {
			invalidLoginserverRequested_pleaseTryUsingADifferentWorld = null;
			rd_s = null;
			noResponseFromServer_pleaseTryUsingADifferentWorld = null;
			M = null;
			loginLimitExceeded2 = null;
			unexpectedLoginserverResponse_pleaseTryUsingADifferentWorld = null;
			connectingToUpdateServer2 = null;
			loginLimitExceeded = null;
			unexpectedServerResponse_pleaseTryUsingADifferentWorld = null;
			connectingToUpdateServer = null;
			pleaseTryUsingADifferentWorld = null;
			M2 = null;
			rds_k = null;
			gb_a = null;
			rd_l = null;
			connectionTimedOut_pleaseTryUsingADifferentWorld = null;
			couldNotCompleteLogin_pleaseTryUsingADifferentWorld = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "ad.A(" + unused + ')');
		}
	}

	//Some update protocol (player/npc)?
	static void b (byte unused) {
		try {
			++int_b;
			lc.readStream.initializeBITAccess(-102);
			int i = lc.readStream.readBits((byte) 50, 1);
			if (i != 0) {
				int i1 = lc.readStream.readBits((byte) 111, 2);
				if (i1 == 0) {
					sb.ints_o[gf.int_q++] = 2047;
				} else {
					if (i1 == 1) {
						int i2 = lc.readStream.readBits((byte) 57, 3);
						af.td_p.a(false, i2, false);
						int updateRequired = lc.readStream.readBits((byte) 63, 1);
						if (updateRequired == 1) {
							sb.ints_o[gf.int_q++] = 2047;
						}
					} else {
						if (i1 == 2) {
							int i2 = lc.readStream.readBits((byte) 56, 3);
							af.td_p.a(true, i2, false);
							int i3 = lc.readStream.readBits((byte) 107, 3);
							af.td_p.a(true, i3, false);
							int updateRequired = lc.readStream.readBits((byte) 105, 1);
							if (updateRequired == 1) {
								sb.ints_o[gf.int_q++] = 2047;
							}
						} else {
							if (i1 == 3) {
								int i2 = lc.readStream.readBits((byte) 38, 1);
								int i3 = lc.readStream.readBits((byte) 117, 7);
								int updateRequired = lc.readStream.readBits((byte) 118, 1);
								if (updateRequired == 1) {
									sb.ints_o[gf.int_q++] = 2047;
								}

								ce.plane = lc.readStream.readBits((byte) 112, 2);
								int i4 = lc.readStream.readBits((byte) 79, 7);
								af.td_p.a((byte) -121, ~i2 == -2, i4, i3);
							}
						}
					}
				}
			}
		} catch (RuntimeException var7) {
			throw id.a(var7, "ad.C(" + unused + ')');
		}
	}

	static void b (int connectionValue, byte unused) {
		try {
			if (connectionValue != -3) {
				if (connectionValue != -2) {
					if (connectionValue != -1) {
						if (connectionValue == 3) {
							be.a(0, pd.K, pd.a, ab.invalidUsernameOrPassword2);
						} else if (connectionValue != 4) {
							if (connectionValue != 5) {
								if (connectionValue == 6) {
									be.a(0, pd.q, jc.runescapeHasBeenUpdated2, af.pleaseReloadThisPage2);
								} else if (connectionValue == 7) {
									be.a(0, pd.l, te.thisWorldIsFull2, cf.worldFull_pleaseUseADifferentWorld);
								} else if (connectionValue == 8) {
									be.a(0, pd.c, sd.loginServerOffline_unableToConnect, o.loginServerOffline2);
								} else if (connectionValue == 9) {
									be.a(0, pd.D, loginLimitExceeded2, wa.tooManyConnectionFromYourAddress2);
								} else if (connectionValue == 10) {
									be.a(0, pd.d, sd.badSessionId_unableToConnect, fc.badSessionId2);
								} else if (connectionValue != 11) {
									if (connectionValue == 12) {
										be.a(0, pd.r, f.youNeedAMembersAccountToLoginToThisWorld2, ke.pleaseSubscribeOrUseADifferentWorld2);
									} else if (connectionValue != 13) {
										if (connectionValue == 14) {
											be.a(0, pd.z, gf.theServerIsBeingUpdated2, ra.theServerIsBeingUpdated_pleaseWait1MinuteAndTryAgain);
										} else if (connectionValue != 16) {
											if (connectionValue != 17) {
												if (connectionValue != 18) {
													if (connectionValue != 19) {
														if (connectionValue != 20) {
															if (connectionValue == 22) {
																be.a(0, pd.N, pd.malformedLoginPacket2, l.pleaseTryAgain2);
															} else if (connectionValue != 23) {
																if (connectionValue != 24) {
																	if (connectionValue == 25) {
																		be.a(0, pd.n, sd.unexpectedLoginserverResponse2, unexpectedLoginserverResponse_pleaseTryUsingADifferentWorld);
																	} else if (connectionValue != 26) {
																		if (connectionValue != 27) {
																			be.a(0, pd.rd_o, jc.unexpectedServerResponse2, unexpectedServerResponse_pleaseTryUsingADifferentWorld);
																		} else {
																			be.a(0, pd.w, pd.I, ee.serviceUnavailable2);
																		}
																	} else {
																		be.a(0, pd.rd_h, bd.thisComputersAddressHasBeenBlocked2, bf.asItWasUsedToBreakOurRules2);
																	}
																} else {
																	be.a(0, pd.bb, ba.errorLoadingYourProfile2, ka.pleaseContactCustomerSupport2);
																}
															} else {
																be.a(0, pd.T, vc.noReplyFromLoginserver2, ra.noReplyFromLoginserver_pleaseWait1MinuteAndTryAgain);
															}
														} else {
															be.a(0, pd.Y, ha.invalidLoginserverRequested2, invalidLoginserverRequested_pleaseTryUsingADifferentWorld);
														}
													} else {
														be.a(0, cf.pleaseUseADifferentWorld_thisWorldIsRunningAClosedBeta, bc.thisWorldIsRunningAClosedBeta2, kd.sorryInvitedPlayersOnly2);
													}
												} else {
													be.a(0, pd.m, j.accountLockedAsWeSuspectItHasBeenStolen2, hf.pressRecoverALockedAccountOnFrontPage2);
												}
											} else {
												be.a(0, pd.ab, wd.youAreStandingInAMembersOnlyArea2, we.toPlayOnThisWorldMoveToAFreeAreaFirst2);
											}
										} else {
											be.a(0, pd.J, u.tooManyIncorrectLoginsFromYourAddress2, ra.pleaseWait5MinutesBeforeTryingAgain2);
										}
									} else {
										be.a(0, pd.H, n.couldNotCompleteLogin2, couldNotCompleteLogin_pleaseTryUsingADifferentWorld);
									}
								} else {
									be.a(0, pd.j, ta.weSuspectSomeoneKnowsYourPassword2, dd.pressChangeYourPasswordOnFrontPage2);
								}
							} else {
								be.a(0, pd.rd_f, q.yourAccountIsAlreadyLoggedIn2, jb.tryAgainIn60Secs2);
							}
						} else {
							be.a(0, pd.t, ab.yourAccountHasBeenDisabled2, kb.pleaseCheckYourMessageCentreForDetails2);
						}
					} else {
						be.a(0, pd.Q, pc.noResponseFromServer2, noResponseFromServer_pleaseTryUsingADifferentWorld);
					}
				} else {
					be.a(0, pd.p, pd.U, me.errorConnectingToServer2);
				}
			} else {
				be.a(0, pd.v, e.connectionTimedOut2, connectionTimedOut_pleaseTryUsingADifferentWorld);
			}

			bd.a(false, 10);
			++int_r;
		} catch (RuntimeException var4) {
			throw id.a(var4, "ad.B(" + connectionValue + ',' + unused + ')');
		}
	}
}
