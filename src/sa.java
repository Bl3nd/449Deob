import java.io.IOException;

final class sa extends jb {
	static rd Z;
	static int ab;
	static rd use2;
	static int int_db;
	static int fb;
	static ff hb;
	static int ib;
	static nd nd_jb;
	static int lb;
	static int[] mb;
	static int int_nb;
	static int[] ob;
	static int int_pb;
	static ke cacheFile2;
	static int rb;
	static int sb;
	static int worldId_tb;
	static int[] ints_ub;
	static int vb;
	static int xb;
	static int yb;
	static int zb;
	static rd Bb;
	static int Cb;
	static rd loading_PleaseWait2;
	static int Gb;
	static int Hb;
	static int Ib;
	private static rd use = md.a((String) "Use", (byte) 124);
	private static rd loading_PleaseWait;
	private static rd Ab;

	static {
		use2 = use;
		ib = 0;
		rb = 0;
		worldId_tb = 1;
		loading_PleaseWait = md.a("Loading )2 please wait)3", (byte) 117);
		vb = 0;
		Bb = md.a("::gc", (byte) 125);
		ob = new int[]{8, 11, 4, 6, 9, 7, 10};
		ints_ub = new int[1000];
		Ab = md.a("Message", (byte) 126);
		mb = new int[500];
		lb = 0;
		zb = -1;
		Gb = 0;
		Z = Ab;
		loading_PleaseWait2 = loading_PleaseWait;
	}

	int eb;
	int gb;
	int wb;
	int Db;
	private int Eb = 0;

	static void f (int var0) {
		int var9 = client.int_tb;

		try {
			++qe.F;
			ca.a(true, (byte) 113);
			++Cb;
			te.a(12698, true);
			ca.a(false, (byte) 124);
			te.a(12698, false);
			pb.b(-56);
			u.f(-1);
			int var1;
			int var2;
			if (!bc.k) {
				var1 = nb.m;
				var2 = nd.qd + o.w & 2047;
				if (~var1 > ~(o.D / 256)) {
					var1 = o.D / 256;
				}

				if (df.booleans_v[4] && ~(128 + ld.ints_o[4]) < ~var1) {
					var1 = ld.ints_o[4] - -128;
				}

				a(r.z, var1, var2, 27, -50 + vc.a(ce.plane, af.td_p.x_, af.td_p.y_, (byte) 37), ta.Vb, 600 + var1 * 3);
			}

			label71:
			{
				if (!bc.k) {
					var1 = je.b(-56);
					if (var9 == 0) {
						break label71;
					}
				}

				var1 = d.b(800);
			}

			var2 = wc.d;
			int var4 = pa.n;
			int var3 = u.vb;
			int var5 = nb.p;
			int var6 = w.j;
			int var7 = 0;
			int var8;
			if (var9 == 0 && var7 >= 5) {
				ie.a((byte) -34);
				ue.hc = la.t + -4;
				ue.yc = 0;
				ue.Ac = true;
				ue.Vb = pb.H - 4;
				ic.a();
				pc.o.b(wc.d, u.vb, pa.n, nb.p, w.j, var1);
				pc.o.d();
				pc.c(0);
				af.a(-87);
				((wd) v.cd_ub).c(va.g, 0);
				dc.b((byte) -44);
				if (i.z && ~gd.a(true, false, true) == -1) {
					i.z = false;
				}

				if (i.z) {
					ie.a((byte) -34);
					ic.a();
					nd.a(0, null, false, loading_PleaseWait2);
				}

				pa.b(-97);
				nb.p = var5;
				u.vb = var3;
				w.j = var6;
				pa.n = var4;
				var8 = -99 / ((-58 - var0) / 50);
				wc.d = var2;
			} else {
				do {
					if (df.booleans_v[var7]) {
						var8 = (int) (Math.random() * (double) (i.I[var7] * 2 + 1) - (double) i.I[var7] + Math
								.sin((double) uc.hc[var7] / 100.0D * (double) df.ints_g[var7]) * (double) ld.ints_o[var7]);
						if (~var7 == -1) {
							wc.d += var8;
						}

						if (var7 == 4) {
							nb.p += var8;
							if (nb.p < 128) {
								nb.p = 128;
							}

							if (~nb.p < -384) {
								nb.p = 383;
							}
						}

						if (~var7 == -2) {
							u.vb += var8;
						}

						if (~var7 == -4) {
							w.j = var8 + w.j & 2047;
						}

						if (~var7 == -3) {
							pa.n += var8;
						}
					}

					++var7;
				} while (var7 < 5);

				ie.a((byte) -34);
				ue.hc = la.t + -4;
				ue.yc = 0;
				ue.Ac = true;
				ue.Vb = pb.H - 4;
				ic.a();
				pc.o.b(wc.d, u.vb, pa.n, nb.p, w.j, var1);
				pc.o.d();
				pc.c(0);
				af.a(-87);
				((wd) v.cd_ub).c(va.g, 0);
				dc.b((byte) -44);
				if (i.z && gd.a(true, false, true) == 0) {
					i.z = false;
				}

				if (i.z) {
					ie.a((byte) -34);
					ic.a();
					nd.a(0, null, false, loading_PleaseWait2);
				}

				pa.b(-97);
				nb.p = var5;
				u.vb = var3;
				w.j = var6;
				pa.n = var4;
				var8 = -99 / ((-58 - var0) / 50);
				wc.d = var2;
			}
		} catch (RuntimeException var10) {
			throw id.a(var10, "sa.H(" + var0 + ')');
		}
	}

	public static void g (int var0) {
		try {
			use = null;
			cacheFile2 = null;
			ob = null;
			ints_ub = null;
			Bb = null;
			hb = null;
			use2 = null;
			mb = null;
			loading_PleaseWait2 = null;
			Z = null;
			nd_jb = null;
			Ab = null;
			loading_PleaseWait = null;
			if (var0 != 256) {
				rb = 47;
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "sa.E(" + var0 + ')');
		}
	}

	static void h (int var0) {
		int var2 = client.int_tb;

		try {
			if (var0 != -24413) {
				zb = 124;
			}

			++fb;
			if (~id.rb <= -3 || we.f != 0 || tc.K) {
				rd var1;
				label51:
				{
					if (we.f == 1 && ~id.rb > -3) {
						var1 = pc.a((byte) 125, new rd[]{use2, jb.space2, ca.rd_d, pc.rd_e});
						if (var2 == 0) {
							break label51;
						}
					}

					if (!tc.K || ~id.rb <= -3) {
						var1 = ta.xb[-1 + id.rb];
						if (var2 == 0) {
							break label51;
						}
					}

					var1 = pc.a((byte) 125, new rd[]{sd.P, jb.space2, ee.rd_t, pc.rd_e});
				}

				if (id.rb > 2) {
					var1 = pc.a((byte) 125, new rd[]{var1, va.p, bf.a(-2 + id.rb, -31766), l.I});
				}

				client.Y.b(var1, 4, 15, 16777215, true, ce.y / 1000);
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "sa.I(" + var0 + ')');
		}
	}

	static boolean c (boolean flag) {
		try {
			++ab;
			long var1 = pa.c(0);
			int var3 = (int) (var1 - ge.W);
			if (var3 > 200) {
				var3 = 200;
			}

			ge.W = var1;
			jc.Q += var3;
			if (~sd.O == -1 && ~gf.int_r == -1 && ~o.int_r == -1 && we.g == 0) {
				return true;
			} else if (jc.cb == null) {
				return false;
			} else {
				try {
					if (~jc.Q < -30001) {
						throw new IOException();
					} else {
						label246:
						while (true) {
							u var4;
							id var5;
							if (gf.int_r < 20) {
								if (we.g > 0) {
									var4 = (u) ud.N.a((byte) 104);
									var5 = new id(4);
									var5.writeByte((byte) 121, 1);
									var5.writeMedium(-2016590992, (int) var4.script);
									jc.cb.writeToStream(false, 4, 0, var5.buffer);
									rd.F.a((byte) -7, var4.script, var4);
									--we.g;
									++gf.int_r;
									continue;
								}

								if ((sd.O >= 20 || o.int_r <= 0)) {
									break;
								}
							} else if (sd.O >= 20 || o.int_r <= 0) {
								break;
							}

							while (true) {
								var4 = (u) jb.J.b((byte) -123);
								var5 = new id(4);
								var5.writeByte((byte) -114, 0);
								var5.writeMedium(-2016590992, (int) var4.script);
								jc.cb.writeToStream(false, 4, 0, var5.buffer);
								var4.a((byte) -75);
								qe.B.a((byte) -7, var4.script, var4);
								--o.int_r;
								++sd.O;
								if (sd.O >= 20 || o.int_r <= 0) {
									break label246;
								}
							}
						}

						int var21 = 0;
						if (!flag) {
							a(-64, -120, 18);
							if (~var21 <= -101) {
								return true;
							}
						} else if (~var21 <= -101) {
							return true;
						}

						do {
							int var22 = jc.cb.available((byte) -74);
							if (var22 < 0) {
								throw new IOException();
							}

							if (var22 == 0) {
								break;
							}

							byte var6 = 0;
							jc.Q = 0;
							if (pd.V != null) {
								if (je.int_t == 0) {
									var6 = 1;
								}
							} else {
								var6 = 8;
							}

							label272:
							{
								int len;
								int len1;
								int var9;
								int var11;
								if (var6 > 0) {
									len = var6 - wa.cb.pointer;
									if (~var22 > ~len) {
										len = var22;
									}

									jc.cb.read(wa.cb.pointer, wa.cb.buffer, len, 0);
									if (sd.encryption != 0) {
										len1 = 0;
										if (len1 < len) {
											do {
												wa.cb.buffer[len1 + wa.cb.pointer] = (byte) sd.b(wa.cb.buffer[len1 + wa.cb.pointer], sd.encryption);
												++len1;
											} while (len1 < len);
										}
									}

									wa.cb.pointer += len;
									if (~var6 < ~wa.cb.pointer) {
										break;
									}

									if (pd.V == null) {
										wa.cb.pointer = 0;
										len1 = wa.cb.readUnsignedByte((byte) 116);
										var9 = wa.cb.readUnsignedLEShort(255);
										long var12 = (long) (var9 + (len1 << 16));
										int var10 = wa.cb.readUnsignedByte((byte) 116);
										var11 = wa.cb.readInt((byte) -67);
										u var14 = (u) rd.F.a(-1, var12);
										ba.boolean_l = true;
										if (var14 == null) {
											var14 = (u) qe.B.a(-1, var12);
											ba.boolean_l = false;
										}

										if (var14 == null) {
											throw new IOException();
										}

										pd.V = var14;
										int var15 = ~var10 == -1 ? 5 : 9;
										te.Qb = new id(pd.V.compressionType + var15 + var11);
										te.Qb.writeByte((byte) 103, var10);
										te.Qb.writeInt(-7155, var11);
										je.int_t = 8;
										wa.cb.pointer = 0;
										++var21;
										continue;
									} else if (je.int_t == 0) {
										if (wa.cb.buffer[0] == -1) {
											wa.cb.pointer = 0;
											je.int_t = 1;
										} else {
											pd.V = null;
										}
									}
								} else {
									len = -pd.V.compressionType + te.Qb.buffer.length;
									len1 = -je.int_t + 512;
									if (len1 > len + -te.Qb.pointer) {
										len1 = len - te.Qb.pointer;
									}

									if (var22 < len1) {
										len1 = var22;
									}

									jc.cb.read(te.Qb.pointer, te.Qb.buffer, len1, 0);
									if (sd.encryption != 0) {
										var9 = 0;
										if (var9 < len1) {
											do {
												te.Qb.buffer[var9 + te.Qb.pointer] = (byte) sd.b(te.Qb.buffer[var9 + te.Qb.pointer], sd.encryption);
												++var9;
											} while (var9 < len1);
										}
									}

									je.int_t += len1;
									te.Qb.pointer += len1;
									if (len != te.Qb.pointer) {
										if (je.int_t != 512) {
											break;
										} else {
											je.int_t = 0;
										}
									} else {
										if (pd.V.script == 16711935L) {
											nb.s = te.Qb;
											int pointer = 0;
											while (pointer < 256) {
												ke class_ke = td.Id[pointer];
												if (class_ke != null) {
													nb.s.pointer = 5 + 4 * pointer;
													int crcChecksum = nb.s.readInt((byte) -79);
													class_ke.e(-30004, crcChecksum);
												}

												++pointer;
											}
										} else {
											wc.crc32.reset();
											wc.crc32.update(te.Qb.buffer, 0, len);
											int updateValue = (int) wc.crc32.getValue();
											System.err.println("CRC: crc-value - " + updateValue + " game-value - " + pd.V.crcChecksum);
											if (pd.V.crcChecksum != updateValue) {
												try {
													jc.cb.a(25830);
												} catch (Exception e) {
													e.printStackTrace();
												}

												++hf.int_kb;
												jc.cb = null;
												sd.encryption = (byte) ((int) (1.0D + 255.0D * Math.random()));
												System.out.println("New encryption: " + sd.encryption);
												return false;
											}

											hf.int_kb = 0;
											be.int_m = 0;
											pd.V.ab.a(ba.boolean_l, (int) (pd.V.script & 65535L), (byte) 0, te.Qb.buffer, (pd.V.script & 16711680L) == 16711680L);
										}

										pd.V.d(-26669);
										pd.V = null;
										je.int_t = 0;
										if (ba.boolean_l) {
											--gf.int_r;
										} else {
											--sd.O;
										}

										te.Qb = null;
									}
								}
							}

							++var21;
						} while (~var21 > -101);

						return true;
					}
				} catch (IOException e1) {
					e1.printStackTrace();
					try {
						jc.cb.a(25830);
					} catch (Exception e) {
						e.printStackTrace();
					}

					++be.int_m;
					jc.cb = null;
					return false;
				}
			}
		} catch (RuntimeException var20) {
			throw id.a(var20, "sa.K(" + flag + ')');
		}
	}

	static void d (boolean unused) {
		int dummy = client.int_tb;
		try {
			++sb;
			if (be.nd_c != null) {
				nd class_nd = be.nd_c;
				nd class_nd2 = t.a(class_nd, 104);
				if (class_nd2 == null) {
					be.nd_c = null;
					return;
				}

				int[] var3;
				int[] var4;
				int var5;
				int var6;
				label140:
				{
					++ub.C;
					var3 = pb.a(class_nd2, 18168);
					var4 = pb.a(class_nd, 18168);
					var5 = -ja.int_d + pb.H;
					var6 = -la.v + la.t;
					if (~var5 >= ~class_nd.xc && -class_nd.xc <= var5 && var6 <= class_nd.xc && var6 >= -class_nd.xc && !ca.boolean_f) {
						var5 = 0;
						var6 = 0;
						if (dummy == 0) {
							break label140;
						}
					}

					if (ub.C > class_nd.Ob || ca.boolean_f) {
						ca.boolean_f = true;
						if (dummy == 0) {
							break label140;
						}
					}

					var5 = 0;
					var6 = 0;
				}

				int var7 = var5 + -var3[0] + var4[0];
				int var8 = var6 + var4[1] - var3[1];
				if (~var7 > -1) {
					var7 = 0;
				}

				if (var8 < 0) {
					var8 = 0;
				}

				if (class_nd.Nb + var8 > class_nd2.Nb) {
					var8 = class_nd2.Nb - class_nd.Nb;
				}

				if (class_nd2.Bb < class_nd.Bb + var7) {
					var7 = class_nd2.Bb - class_nd.Bb;
				}

				if (be.nd_c.uc != null && ca.boolean_f) {
					m.a(class_nd.uc, var7, 0, var8, 95, null, class_nd);
				}

				if (~s.zb == -1) {
					label143:
					{
						if (ca.boolean_f) {
							int var9 = pb.H - var3[0];
							int var10 = -var3[1] + la.t;
							if (var10 < 0) {
								var10 = 0;
							}

							if (~var9 > -1) {
								var9 = 0;
							}

							if (~(class_nd2.Bb + -1) > ~var9) {
								var9 = -1 + class_nd2.Bb;
							}

							if (-1 + class_nd2.Nb < var10) {
								var10 = -1 + class_nd2.Nb;
							}

							nd var11 = cf.a(0, class_nd2, class_nd, var9, var10);
							if (be.nd_c.objects_eb != null) {
								m.a(class_nd.objects_eb, var7, 0, var8, 118, var11, class_nd);
							}

							if (var11 == null || pd.a(class_nd, (byte) 109) == null) {
								break label143;
							}

							ie.writeStream.writeOpcode(8, 223);
							ie.writeStream.writeLEShort(class_nd.Yc, (byte) -105);
							ie.writeStream.writeInt_V2(var11.dc, -1762115368);
							ie.writeStream.writeShortA((byte) 16, var11.Yc);
							ie.writeStream.writeInt_V2(class_nd.dc, -1762115368);
							++nc.s;
							if (dummy == 0) {
								break label143;
							}
						}

						if (be.nd_c.Fc != null) {
							m.a(class_nd.Fc, var7, 0, var8, 34, null, class_nd);
						}

						if (~ad.int_t != -2 && !ad.a(-1 + id.rb, true) || ~id.rb >= -3) {
							if (id.rb <= 0) {
								break label143;
							}

							db.b(-1 + id.rb, -3);
							if (dummy == 0) {
								break label143;
							}
						}

						qe.b(-115);
					}

					be.nd_c = null;
				}
			}
		} catch (RuntimeException var13) {
			throw id.a(var13, "sa.J(" + unused + ')');
		}
	}

	static void a (int var0, int var1, int var2) {
		try {
			++int_pb;
			long fileRequest = (long) (var2 + (var1 << 16));
			u class_u = (u) kb.c.a(-1, fileRequest);
			if (class_u != null) {
				jb.J.b(class_u, (byte) -20);
				if (var0 < 123) {
					g(24);
				}
			}
		} catch (RuntimeException var6) {
			throw id.a(var6, "sa.A(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}

	private static void a (int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		try {
			++int_db;
			int var9 = 0;
			int var8 = 2047 & -var2 + 2048;
			int var11 = var6;
			int var10 = 0;
			int var7 = 2047 & 2048 + -var1;
			int var12;
			int var13;
			int var14;
			if (~var7 != -1) {
				var12 = v.pb[var7];
				var13 = v.wb[var7];
				var14 = var10 * var13 - var6 * var12 >> 16;
				var11 = var6 * var13 + var10 * var12 >> 16;
				var10 = var14;
			}

			if (var8 != 0) {
				var12 = v.pb[var8];
				var13 = v.wb[var8];
				var14 = var9 * var13 + var11 * var12 >> 16;
				var11 = var11 * var13 + -(var9 * var12) >> 16;
				var9 = var14;
			}

			nb.p = var1;
			u.vb = -var10 + var4;
			pa.n = var0 + -var11;
			w.j = var2;
			var12 = -104 / ((var3 - 78) / 42);
			wc.d = -var9 + var5;
		} catch (RuntimeException var15) {
			throw id.a(var15, "sa.L(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
		}
	}

	static int a (int var0, int var1, int var2, int var3) {
		try {
			++int_nb;
			int var5 = -1 + var3 & var0;
			int var4 = var0 / var3;
			if (var1 != 17470) {
				use = null;
			}

			int var6 = var2 / var3;
			int var7 = var2 & -1 + var3;
			int var8 = dc.a(var4, var6, true);
			int var9 = dc.a(1 + var4, var6, true);
			int var10 = dc.a(var4, var6 - -1, true);
			int var11 = dc.a(var4 - -1, var6 + 1, true);
			int var12 = qe.a(var1 ^ -17437, var8, var3, var5, var9);
			int var13 = qe.a(-35, var10, var3, var5, var11);
			return qe.a(var1 ^ -17437, var12, var3, var7, var13);
		} catch (RuntimeException var14) {
			throw id.a(var14, "sa.F(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	final void a (int var1, boolean var2, id var3) {
		int var5 = client.int_tb;

		try {
			if (var2) {
				ob = null;
			}

			++Hb;

			do {
				int var4 = var3.readUnsignedByte((byte) 116);
				if (~var4 == -1) {
					break;
				}

				this.a(var1, -118, var4, var3);
			} while (var5 == 0);

		} catch (RuntimeException var6) {
			throw id.a(var6, "sa.B(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	private void a (int unused, int unused2, int input, id class_id) {
		try {
			++xb;
			if (input == 1) {
				this.Eb = class_id.readMedInt((byte) -41);
			}
		} catch (RuntimeException var6) {
			throw id.a(var6, "sa.G(" + unused + ',' + unused2 + ',' + input + ',' + (class_id != null ? "{...}" : "null") + ')');
		}
	}

	private void a (int i, byte unused) {
		try {
			++yb;
			double v = (double) ((16727732 & i) >> 16) / 256.0D;
			double v1 = (double) ((i & 'ￄ') >> 8) / 256.0D;
			double v2 = (double) (255 & i) / 256.0D;
			double v3 = 0.0D;
			double v4 = 0.0D;
			double v5 = v;
			double v6 = v;
			if (v < v1) {
				v6 = v1;
			}

			if (v1 < v) {
				v5 = v1;
			}

			if (v6 < v2) {
				v6 = v2;
			}

			if (v5 > v2) {
				v5 = v2;
			}

			double v7 = (v6 + v5) / 2.0D;
			this.wb = (int) (v7 * 256.0D);
			if (v5 != v6) {
				if (v != v6) {
					if (v6 == v1) {
						v3 = (v2 - v) / (v6 - v5) + 2.0D;
					} else {
						if (v2 == v6) {
							v3 = 4.0D + (v - v1) / (v6 - v5);
						}
					}
				} else {
					v3 = (-v2 + v1) / (v6 - v5);
				}

				if (v7 < 0.5D) {
					v4 = (-v5 + v6) / (v6 + v5);
				}

				if (v7 >= 0.5D) {
					v4 = (v6 - v5) / (2.0D - v6 - v5);
				}
			}

			if (this.wb >= 0) {
				if (this.wb > 255) {
					this.wb = 255;
				}
			} else {
				this.wb = 0;
			}

			if (v7 > 0.5D) {
				this.eb = (int) (512.0D * v4 * (-v7 + 1.0D));
			} else {
				this.eb = (int) (512.0D * v7 * v4);
			}

			v3 /= 6.0D;
			this.gb = (int) (256.0D * v4);
			if (this.gb >= 0) {
				if (this.gb > 255) {
					this.gb = 255;
				}
			} else {
				this.gb = 0;
			}

			if (this.eb < 1) {
				this.eb = 1;
			}

			this.Db = (int) (v3 * (double) this.eb);
		} catch (RuntimeException var20) {
			throw id.a(var20, "sa.C(" + i + ',' + unused + ')');
		}
	}

	final void i (int unused) {
		try {
			this.a(this.Eb, (byte) 115);
			++Ib;
		} catch (RuntimeException var3) {
			throw id.a(var3, "sa.D(" + unused + ')');
		}
	}
}
