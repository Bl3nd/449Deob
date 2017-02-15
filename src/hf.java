import java.math.BigInteger;
import java.util.Calendar;

final class hf extends jb {
	static int int_bb;
	static rd gb = md.a((String) "oder ung-Ultiges Passwort)3", (byte) 123);
	static int hb;
	static int ib;
	static int jb;
	static int int_kb = 0;
	static int mb;
	static int nb;
	static int int_pb;
	static int qb;
	static int int_rb;
	static BigInteger bigInteger_sb = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
	static int vb;
	static pb archiveFile2;
	static bb cacheIDX255;
	static oa yb;
	static rd zb = md.a((String) "Bitte wenden Sie sich an den Kundendienst)3", (byte) 119);
	static rd Ab = md.a((String) "Freunde)2Server)3)3)3", (byte) 115);
	static ke cacheFile11;
	static Calendar Cb = Calendar.getInstance();
	static int Db;
	static rd Fb = md.a((String) "Benutzen Sie bitte eine andere Welt)3", (byte) 116);
	static rd pressRecoverALockedAccountOnFrontPage2;
	static rd Hb;
	static int Ib;
	private static rd pressRecoverALockedAccountOnFrontPage = md.a((String) "Press (Wrecover a locked account(W on front page)3", (byte) 115);

	static {
		pressRecoverALockedAccountOnFrontPage2 = pressRecoverALockedAccountOnFrontPage;
		Ib = 0;
		Hb = md.a("Verbindung abgebrochen)3", (byte) 116);
	}

	int Z;
	int ab;
	boolean cb = true;
	int db;
	int int_eb;
	int fb;
	int lb = 0;
	int ob;
	int tb = -1;
	int int_ub = -1;

	static void f (int unused) {
		try {
			++int_rb;
			if (pb.d == 0) {
				if (client.int_qb == 1) {
					int var2 = wb.nb - 575;
					int var3 = -4 + -5 + sb.int_b;
					if (~var2 <= -1 && ~var3 <= -1 && ~var2 > -147 && var3 < 151) {
						var3 -= 75;
						var2 -= 73;
						int var4 = 2047 & o.w + ka.Kb;
						int var5 = v.pb[var4];
						var5 = var5 * (256 + gf.int_j) >> 8;
						int var6 = v.wb[var4];
						var6 = var6 * (256 + gf.int_j) >> 8;
						int var8 = var3 * var6 - var2 * var5 >> 11;
						int var7 = var6 * var2 + var5 * var3 >> 11;
						int var9 = var7 + af.td_p.x_ >> 7;
						int var10 = -var8 + af.td_p.y_ >> 7;
						boolean var11 = bb.a(var9, af.td_p.Hc[0], af.td_p.xc[0], 1, true, var10, 0, 0, -103, 0, 0, 0);
						if (var11) {
							ie.writeStream.writeByte((byte) -32, var2);
							ie.writeStream.writeByte((byte) 94, var3);
							ie.writeStream.writeShort(o.w, (byte) 55);
							ie.writeStream.writeByte((byte) -52, 57);
							ie.writeStream.writeByte((byte) 108, ka.Kb);
							ie.writeStream.writeByte((byte) -28, gf.int_j);
							ie.writeStream.writeByte((byte) 89, 89);
							ie.writeStream.writeShort(af.td_p.x_, (byte) 10);
							ie.writeStream.writeShort(af.td_p.y_, (byte) 66);
							ie.writeStream.writeByte((byte) 102, ca.int_g);
							ie.writeStream.writeByte((byte) -120, 63);
						}
					}
				}

			}
		} catch (RuntimeException var12) {
			throw id.a(var12, "hf.G(" + unused + ')');
		}
	}

	public static void c (byte var0) {
		try {
			pressRecoverALockedAccountOnFrontPage2 = null;
			if (var0 > -16) {
				cacheIDX255 = null;
			}

			Ab = null;
			cacheFile11 = null;
			yb = null;
			bigInteger_sb = null;
			Cb = null;
			gb = null;
			archiveFile2 = null;
			pressRecoverALockedAccountOnFrontPage = null;
			Fb = null;
			Hb = null;
			zb = null;
			cacheIDX255 = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "hf.F(" + var0 + ')');
		}
	}

	static he[] a (pb archiveFile8, rd sprite, rd class_rd, byte unused) {
		try {
			++hb;
			int index = archiveFile8.a(sprite, (byte) -116);
			int i = archiveFile8.a(class_rd, -31757, index);
			return rb.a(archiveFile8, i, index, 128);
		} catch (RuntimeException var6) {
			throw id.a(var6, "hf.C(" + (archiveFile8 != null ? "{...}" : "null") + ',' + (sprite != null ? "{...}" : "null") + ',' + (class_rd != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}

	static int a (nd var0, int var1, byte var2) {
		int var14 = client.int_tb;

		try {
			++jb;
			if (var0.Yb != null && ~var0.Yb.length < ~var1) {
				try {
					int[] var3 = var0.Yb[var1];
					int var4 = 0;
					if (var2 > -29) {
						a(-68, 91, -103, -7, 69, -88);
					}

					int var5 = 0;
					byte var6 = 0;

					while (true) {
						int var7 = var3[var5++];
						int var8 = 0;
						byte var9 = 0;
						if (~var7 == -1) {
							return var4;
						}

						if (var7 == 15) {
							var9 = 1;
						}

						if (var7 == 1) {
							var8 = ke.hb[var3[var5++]];
						}

						if (~var7 == -3) {
							var8 = eb.ints_i[var3[var5++]];
						}

						if (~var7 == -17) {
							var9 = 2;
						}

						if (~var7 == -4) {
							var8 = p.N[var3[var5++]];
						}

						if (~var7 == -18) {
							var9 = 3;
						}

						int var10;
						nd var11;
						int var12;
						int var13;
						if (var7 == 4) {
							var10 = var3[var5++] << 16;
							var10 += var3[var5++];
							var11 = bf.b('\uffff', var10);
							var12 = var3[var5++];
							if (~var12 != 0 && (!u.a(var12, false).dc || va.isMembers_j)) {
								var13 = 0;
								if (var14 != 0 || var13 < var11.ob.length) {
									do {
										if (var11.ob[var13] == 1 + var12) {
											var8 += var11.zc[var13];
										}

										++var13;
									} while (var13 < var11.ob.length);
								}
							}
						}

						if (var7 == 5) {
							var8 = ta.Pb[var3[var5++]];
						}

						if (var7 == 6) {
							var8 = a.ints_fb[-1 + eb.ints_i[var3[var5++]]];
						}

						if (~var7 == -8) {
							var8 = 100 * ta.Pb[var3[var5++]] / '뜛';
						}

						if (~var7 == -9) {
							var8 = af.td_p.int_sd;
						}

						if (var7 == 9) {
							var10 = 0;
							if (var14 != 0 || var10 < 25) {
								do {
									if (dc.x[var10]) {
										var8 += eb.ints_i[var10];
									}

									++var10;
								} while (var10 < 25);
							}
						}

						if (~var7 == -11) {
							var10 = var3[var5++] << 16;
							var10 += var3[var5++];
							var11 = bf.b('\uffff', var10);
							var12 = var3[var5++];
							if (~var12 != 0 && (!u.a(var12, false).dc || va.isMembers_j)) {
								var13 = 0;
								if (var14 != 0 || ~var13 > ~var11.ob.length) {
									do {
										if (var11.ob[var13] == var12 - -1) {
											var8 = 999999999;
											if (var14 == 0) {
												break;
											}
										}

										++var13;
									} while (~var13 > ~var11.ob.length);
								}
							}
						}

						if (~var7 == -12) {
							var8 = qc.O;
						}

						if (var7 == 12) {
							var8 = uc.lc;
						}

						if (~var7 == -14) {
							var10 = ta.Pb[var3[var5++]];
							int var17 = var3[var5++];
							var8 = (1 << var17 & var10) != 0 ? 1 : 0;
						}

						if (var7 == 14) {
							var10 = var3[var5++];
							var8 = o.a((byte) 99, var10);
						}

						if (~var7 == -19) {
							var8 = kd.int_w + (af.td_p.x_ >> 7);
						}

						if (var7 == 19) {
							var8 = jc.X + (af.td_p.y_ >> 7);
						}

						if (var7 == 20) {
							var8 = var3[var5++];
						}

						if (~var9 != -1) {
							var6 = var9;
							if (var14 == 0) {
								continue;
							}
						}

						if (~var6 == -1) {
							var4 += var8;
						}

						if (~var6 == -2) {
							var4 -= var8;
						}

						if (var6 == 2 && ~var8 != -1) {
							var4 /= var8;
						}

						if (var6 == 3) {
							var4 *= var8;
						}

						var6 = 0;
					}
				} catch (Exception var15) {
					return -1;
				}
			} else {
				return -2;
			}
		} catch (RuntimeException var16) {
			throw id.a(var16, "hf.B(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ')');
		}
	}

	static void a (int y, int unused, int x, int var3, int var4, int plane) {
		int dummy = client.int_tb;

		try {
			++vb;
			int i = pc.o.p(plane, x, y);
			int var7;
			int var8;
			int var9;
			int var10;
			int var12;
			int var13;
			if (i != 0) {
				int i1 = pc.o.b(plane, x, y, i);
				int i2 = 31 & i1;
				int i3 = var3;
				if (~i < -1) {
					i3 = var4;
				}

				int[] imagePixels = pd.S.imagePixels;
				int i4 = (231 & i1) >> 6;
				int i5 = 512 * (-y + 103) * 4 + 24624 + x * 4;
				int i6 = i >> 14 & 32767;
				bd class_bd = ub.a(-114, i6);
				if (class_bd.Hb != -1) {
					oa class_oa = kb.mapscene[class_bd.Hb];
					if (class_oa != null) {
						int i7 = (-class_oa.nb + 4 * class_bd.h) / 2;
						int i8 = (4 * class_bd.w - class_oa.mb) / 2;
						class_oa.a(48 + (x * 4) + i8, i7 + 48 + ((104 + (-y - class_bd.h)) * 4));
					}
				} else {
					if (i2 == 0 || i2 == 2) {
						if (i4 != 0) {
							if (i4 != 1) {
								if (i4 != 2) {
									if (i4 == 3) {
										imagePixels[i5 + 1536] = i3;
										imagePixels[1536 + i5 + 1] = i3;
										imagePixels[1536 + i5 - -2] = i3;
										imagePixels[3 + i5 + 1536] = i3;
									}
								} else {
									imagePixels[i5 + 3] = i3;
									imagePixels[512 + 3 + i5] = i3;
									imagePixels[1024 + 3 + i5] = i3;
									imagePixels[1539 + i5] = i3;
								}
							} else {
								imagePixels[i5] = i3;
								imagePixels[1 + i5] = i3;
								imagePixels[i5 + 2] = i3;
								imagePixels[i5 + 3] = i3;
							}
						} else {
							imagePixels[i5] = i3;
							imagePixels[512 + i5] = i3;
							imagePixels[1024 + i5] = i3;
							imagePixels[1536 + i5] = i3;
						}
					} else if (i2 == 3) {
						if (i4 == 0) {
							imagePixels[i5] = i3;
						} else if (i4 != 1) {
							if (i4 != 2) {
								if (i4 == 3) {
									imagePixels[1536 + i5] = i3;
								}
							} else {
								imagePixels[1539 + i5] = i3;
							}
						} else {
							imagePixels[3 + i5] = i3;
						}
					}

					if (i2 == 2) {
						if (i4 != 3) {
							if (i4 == 0) {
								imagePixels[i5] = i3;
								imagePixels[i5 - -1] = i3;
								imagePixels[2 + i5] = i3;
								imagePixels[3 + i5] = i3;
							} else if (i4 == 1) {
								imagePixels[3 + i5] = i3;
								imagePixels[i5 + 515] = i3;
								imagePixels[1024 + (i5 - -3)] = i3;
								imagePixels[1539 + i5] = i3;
							} else if (i4 == 2) {
								imagePixels[1536 + i5] = i3;
								imagePixels[1 + i5 - -1536] = i3;
								imagePixels[2 + i5 + 1536] = i3;
								imagePixels[3 + 1536 + i5] = i3;
							}
						} else {
							imagePixels[i5] = i3;
							imagePixels[512 + i5] = i3;
							imagePixels[1024 + i5] = i3;
							imagePixels[i5 - -1536] = i3;
						}
					}
				}
			}

			i = pc.o.o(plane, x, y);
			if (i != 0) {
				label76:
				{
					var7 = pc.o.b(plane, x, y, i);
					var8 = (var7 & 243) >> 6;
					var10 = 32767 & i >> 14;
					var9 = var7 & 31;
					bd var22 = ub.a(-88, var10);
					int var26;
					if (var22.Hb == -1) {
						if (var9 != 9) {
							break label76;
						}

						var12 = 15658734;
						if (i > 0) {
							var12 = 15597568;
						}

						int[] var24 = pd.S.imagePixels;
						var26 = 4 * ('츀' + -(512 * y)) + 24624 + 4 * x;
						if (~var8 != -1 && var8 != 2) {
							var24[var26] = var12;
							var24[1 + var26 + 512] = var12;
							var24[var26 - -1026] = var12;
							var24[3 + (var26 - -1536)] = var12;
							if (dummy == 0) {
								break label76;
							}
						}

						var24[var26 + 1536] = var12;
						var24[1 + 1024 + var26] = var12;
						var24[2 + 512 + var26] = var12;
						var24[3 + var26] = var12;
						if (dummy == 0) {
							break label76;
						}
					}

					oa var25 = kb.mapscene[var22.Hb];
					if (var25 != null) {
						var13 = (var22.w * 4 + -var25.mb) / 2;
						var26 = (-var25.nb + 4 * var22.h) / 2;
						var25.a(var13 + 4 * x + 48, var26 + (48 - -(4 * (-y + (104 - var22.h)))));
					}
				}
			}

			i = pc.o.q(plane, x, y);
			if (i != 0) {
				var7 = (536867781 & i) >> 14;
				bd var20 = ub.a(-61, var7);
				if (var20.Hb != -1) {
					oa var21 = kb.mapscene[var20.Hb];
					if (var21 != null) {
						int var23 = (4 * var20.h + -var21.nb) / 2;
						var10 = (-var21.mb + 4 * var20.w) / 2;
						var21.a(48 + 4 * x - -var10, var23 + (-y + 104 - var20.h) * 4 + 48);
					}
				}
			}

		} catch (RuntimeException var19) {
			throw id.a(var19, "hf.H(" + y + ',' + unused + ',' + x + ',' + var3 + ',' + var4 + ',' + plane + ')');
		}
	}

	final void a (int var1, id var2, int var3) {
		int var5 = client.int_tb;

		try {
			++Db;

			do {
				int var4 = var2.readUnsignedByte((byte) 116);
				if (~var4 == -1) {
					break;
				}

				this.a(75, var2, var4, var3);
			} while (var5 == 0);

			if (var1 != 16876) {
				archiveFile2 = null;
			}
		} catch (RuntimeException var6) {
			throw id.a(var6, "hf.I(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
		}
	}

	private void a (int var1, id var2, int input, int var4) {
		try {
			label40:
			{
				if (input != 1) {
					if (input == 2) {
						this.tb = var2.readUnsignedByte((byte) 116);
					} else if (input == 5) {
						this.cb = false;
					} else if (input == 7) {
						this.int_ub = var2.readMedInt((byte) -37);
					}
				} else {
					this.lb = var2.readMedInt((byte) -30);
				}
			}

			if (var1 == 75) {
				++qb;
			}
		} catch (RuntimeException var7) {
			throw id.a(var7, "hf.A(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + input + ',' + var4 + ')');
		}
	}

	final void d (byte var1) {
		try {
			if (var1 < 75) {
				c((byte) -37);
			}

			if (this.int_ub != -1) {
				this.a(-4492, this.int_ub);
				this.db = this.fb;
				this.ob = this.Z;
				this.ab = this.int_eb;
			}

			this.a(-4492, this.lb);
			++nb;
		} catch (RuntimeException var3) {
			throw id.a(var3, "hf.E(" + var1 + ')');
		}
	}

	private void a (int var1, int var2) {
		int var19 = client.int_tb;

		try {
			++mb;
			double var3 = (double) (var2 >> 16 & 255) / 256.0D;
			double var7 = (double) (255 & var2) / 256.0D;
			double var9 = var3;
			if (var1 != -4492) {
				c((byte) -25);
			}

			double var5 = (double) (255 & var2 >> 8) / 256.0D;
			if (var5 < var3) {
				var9 = var5;
			}

			if (var9 > var7) {
				var9 = var7;
			}

			double var11 = var3;
			double var15 = 0.0D;
			double var13 = 0.0D;
			if (var3 < var5) {
				var11 = var5;
			}

			if (var11 < var7) {
				var11 = var7;
			}

			double var17 = (var9 + var11) / 2.0D;
			if (var11 != var9) {
				label64:
				{
					if (var3 != var11) {
						if (var5 == var11) {
							var13 = 2.0D + (-var3 + var7) / (-var9 + var11);
							if (var19 == 0) {
								break label64;
							}
						}

						if (var11 != var7) {
							break label64;
						}

						var13 = 4.0D + (-var5 + var3) / (var11 - var9);
						if (var19 == 0) {
							break label64;
						}
					}

					var13 = (var5 - var7) / (-var9 + var11);
				}

				if (var17 < 0.5D) {
					var15 = (-var9 + var11) / (var11 + var9);
				}

				if (var17 >= 0.5D) {
					var15 = (-var9 + var11) / (-var11 + 2.0D - var9);
				}
			}

			label54:
			{
				this.Z = (int) (var17 * 256.0D);
				if (~this.Z <= -1) {
					if (this.Z <= 255) {
						break label54;
					}

					this.Z = 255;
					if (var19 == 0) {
						break label54;
					}
				}

				this.Z = 0;
			}

			var13 /= 6.0D;
			this.fb = (int) (256.0D * var15);
			this.int_eb = (int) (var13 * 256.0D);
			if (~this.fb > -1) {
				this.fb = 0;
			} else if (this.fb > 255) {
				this.fb = 255;
			}
		} catch (RuntimeException var20) {
			throw id.a(var20, "hf.D(" + var1 + ',' + var2 + ')');
		}
	}
}
