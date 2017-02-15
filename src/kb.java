final class kb {
	static int a;
	static pc c;
	static int d;
	static int[][] f;
	static int g;
	static rd h;
	static oa[] mapscene;
	static jd j;
	static int l;
	static int m;
	static int n;
	static int o;
	static int p;
	static int q;
	static rd s;
	static rd pleaseCheckYourMessageCentreForDetails2;
	private static rd e = md.a((String) " is already on your ignore list", (byte) 125);
	private static rd r = md.a((String) "From", (byte) 119);
	private static rd pleaseCheckYourMessageCentreForDetails;

	static {
		h = r;
		s = e;
		f = new int[5][5000];
		c = new pc(4096);
		pleaseCheckYourMessageCentreForDetails = md.a("Please check your message)2centre for details)3", (byte) 114);
		pleaseCheckYourMessageCentreForDetails2 = pleaseCheckYourMessageCentreForDetails;
	}

	private byte[] b;
	private int[] k;
	private int[] t;

	kb (byte[] data) {
		int dummy = client.int_tb;
		try {
			int[] ints = new int[33];
			int i = 0;
			int length = data.length;
			this.b = data;
			this.t = new int[8];
			this.k = new int[length];
			int i1 = 0;
			if (length > i1) {
				do {
					byte b = data[i1];
					if (b != 0) {
						int i2;
						int i3;
						int i4;
						int i5;
						int i6;
						label79:
						{
							int i7 = 1 << 32 + -b;
							i2 = ints[b];
							this.k[i1] = i2;
							if (~(i2 & i7) == -1) {
								i3 = i2 | i7;
								i4 = b + -1;
								if (~i4 <= -2) {
									do {
										i5 = ints[i4];
										if (i5 != i2) {
											break label79;
										} else {
											i6 = 1 << 32 - i4;
											if ((i6 & i5) == 0) {
												ints[i4] = fb.b(i6, i5);
											} else {
												ints[i4] = ints[i4 - 1];
												break label79;
											}

											--i4;
										}
									} while (~i4 <= -2);
								}
							} else {
								i3 = ints[b - 1];
							}
						}

						ints[b] = i3;
						i4 = b - -1;
						if (i4 <= 32) {
							do {
								if (i2 == ints[i4]) {
									ints[i4] = i3;
								}

								++i4;
							} while (i4 <= 32);
						}

						i5 = 0;
						i6 = 0;
						if (~i6 > ~b) {
							do {
								int var13;
								label96:
								{
									var13 = Integer.MIN_VALUE >>> i6;
									if ((var13 & i2) != 0) {
										if (this.t[i5] == 0) {
											this.t[i5] = i;
										}

										i5 = this.t[i5];
										//break label96;
									}

									++i5;
								}

								if (~this.t.length >= ~i5) {
									int[] var14 = new int[2 * this.t.length];
									int var15 = 0;
									while (~this.t.length < ~var15) {
										var14[var15] = this.t[var15];
										++var15;
									}

									this.t = var14;
								}

								var13 >>>= 1;
								++i6;
							} while (~i6 > ~b);
						}

						if (i5 >= i) {
							i = 1 + i5;
						}

						this.t[i5] = ~i1;
					}

					++i1;
				} while (length > i1);

			}
		} catch (RuntimeException var17) {
			throw id.a(var17, "kb.<init>(" + (data != null ? "{...}" : "null") + ')');
		}
	}

	static void a (int var0) {
		int var3 = client.int_tb;

		try {
			++a;
			bc.H.c(-2982);
			int var1 = 0;
			if (var3 != 0) {
				ec.longs_o[var1] = 0L;
				++var1;
			}

			while (~var1 > -33) {
				ec.longs_o[var1] = 0L;
				++var1;
			}

			int var2 = 0;
			if (var3 != 0) {
				db.M[var2] = 0L;
				++var2;
			}

			while (var2 < 32) {
				db.M[var2] = 0L;
				++var2;
			}

			le.int_mb = 0;
			if (var0 < 54) {
				b(114);
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "kb.G(" + var0 + ')');
		}
	}

	static boolean a (byte var0, int var1) {
		try {
			if (var0 > -14) {
				c = null;
			}

			++q;
			return ~(var1 >> 31 & 1) != -1;
		} catch (RuntimeException var3) {
			throw id.a(var3, "kb.H(" + var0 + ',' + var1 + ')');
		}
	}

	static void a (gb class_gb, pb archiveFile2, int unused, boolean isMembers, pb archiveFile7) {
		try {
			++g;
			db.archiveFile7 = archiveFile7;
			sd.archiveFile2 = archiveFile2;
			nc.isMembers = isMembers;
			af.int_r = sd.archiveFile2.getLengthForIndex(10, false);
			qe.L = class_gb;
		} catch (RuntimeException var6) {
			throw id.a(var6, "kb.C(" + (class_gb != null ? "{...}" : "null") + ',' + (archiveFile2 != null ? "{...}" : "null") + ',' + unused + ',' + isMembers + ',' + (archiveFile7 != null ? "{...}" : "null") + ')');
		}
	}

	static a b (byte var0, int fileRequest) {
		try {
			++o;
			a var2 = (a) md.c.a((byte) -84, (long) fileRequest);
			if (var2 != null) {
				return var2;
			} else {
				var2 = me.a(fileRequest, sd.archiveFile0, false, db.archiveFile1, 0);
				if (var0 != 118) {
					j = null;
				}

				if (var2 != null) {
					md.c.a(var0 + -203, var2, (long) fileRequest);
				}

				return var2;
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "kb.E(" + var0 + ',' + fileRequest + ')');
		}
	}

	public static void a (byte var0) {
		try {
			s = null;
			e = null;
			r = null;
			if (var0 > -11) {
				c(-7);
			}

			mapscene = null;
			h = null;
			j = null;
			pleaseCheckYourMessageCentreForDetails2 = null;
			c = null;
			pleaseCheckYourMessageCentreForDetails = null;
			f = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "kb.D(" + var0 + ')');
		}
	}

	static void a (d class_d, int fileRequest, int i1, ke class_ke) {
		try {
			++n;
			byte[] var4 = null;
			synchronized (sb.md_e) {
				tc var7 = (tc) sb.md_e.c((byte) 94);
				while (var7 != null) {
					if (~var7.script == ~((long) fileRequest) || var7.P == class_d || var7.D == 0) {
						var4 = var7.N;
						break;
					}

					var7 = (tc) sb.md_e.a((byte) -68);
				}
				/*label121:
				{
					tc var7 = (tc) sb.md_e.c((byte) 94);
					if (var7 != null) {
						while (~var7.long_m != ~((long) fileRequest) || var7.P != class_d || var7.D != 0) {
							var7 = (tc) sb.md_e.a((byte) -68);
							if (var7 == null) {
								break label121;
							}
						}

						var4 = var7.N;
					}
				}*/
			}


			if (var4 != null) {
				class_ke.a(fileRequest, -105, var4, class_d, true);
			} else {
				byte[] var13 = class_d.a((byte) -119, fileRequest);
				class_ke.a(fileRequest, i1 + -87, var13, class_d, true);
			}
		} catch (RuntimeException var12) {
			throw id.a(var12, "kb.A(" + (class_d != null ? "{...}" : "null") + ',' + fileRequest + ',' + i1 + ',' + (class_ke != null ? "{...}" : "null") + ')');
		}
	}

	static void b (int var0) {
		try {
			if (var0 < -91) {
				jb.L = false;
				++l;
				ua.w = false;
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "kb.J(" + var0 + ')');
		}
	}

	static void c (int var0) {
		try {
			if (bc.t != null) {
				bc.t.a();
				bc.t = null;
			}

			if (var0 >= -76) {
				a((byte) -65);
			}

			hc.sampleRate = 0;
			++m;
		} catch (RuntimeException var2) {
			throw id.a(var2, "kb.B(" + var0 + ')');
		}
	}

	final int a (int pointer, int unused, byte[] buffer, int unused2, byte[] stringBuffer, int stringPointer) {
		int dummy = client.int_tb;
		try {
			++p;
			if (stringPointer == 0) {
				return 0;
			} else {
				stringPointer += unused2;
				int var7 = 0;
				int var8 = pointer;

				do {
					byte var9 = buffer[var8];
					if (var9 < 0) {
						var7 = this.t[var7];
					} else {
						++var7;
					}

					int var10;
					if (~(var10 = this.t[var7]) > -1) {
						stringBuffer[unused2++] = (byte) (~var10);
						if (~unused2 <= ~stringPointer) {
							break;
						}

						var7 = 0;
					}

					label150:
					{
						if ((64 & var9) == 0) {
							++var7;
							if (dummy == 0) {
								break label150;
							}
						}

						var7 = this.t[var7];
					}

					if (~(var10 = this.t[var7]) > -1) {
						stringBuffer[unused2++] = (byte) (~var10);
						if (~stringPointer >= ~unused2) {
							break;
						}

						var7 = 0;
					}

					label144:
					{
						if (~(var9 & 32) == -1) {
							++var7;
							if (dummy == 0) {
								break label144;
							}
						}

						var7 = this.t[var7];
					}

					if ((var10 = this.t[var7]) < 0) {
						stringBuffer[unused2++] = (byte) (~var10);
						if (unused2 >= stringPointer) {
							break;
						}

						var7 = 0;
					}

					label138:
					{
						if ((16 & var9) != 0) {
							var7 = this.t[var7];
							if (dummy == 0) {
								break label138;
							}
						}

						++var7;
					}

					if (~(var10 = this.t[var7]) > -1) {
						stringBuffer[unused2++] = (byte) (~var10);
						if (~unused2 <= ~stringPointer) {
							break;
						}

						var7 = 0;
					}

					label132:
					{
						if ((8 & var9) != 0) {
							var7 = this.t[var7];
							if (dummy == 0) {
								break label132;
							}
						}

						++var7;
					}

					if ((var10 = this.t[var7]) < 0) {
						stringBuffer[unused2++] = (byte) (~var10);
						if (~stringPointer >= ~unused2) {
							break;
						}

						var7 = 0;
					}

					label126:
					{
						if ((4 & var9) != 0) {
							var7 = this.t[var7];
							if (dummy == 0) {
								break label126;
							}
						}

						++var7;
					}

					if (~(var10 = this.t[var7]) > -1) {
						stringBuffer[unused2++] = (byte) (~var10);
						if (unused2 >= stringPointer) {
							break;
						}

						var7 = 0;
					}

					label120:
					{
						if ((2 & var9) == 0) {
							++var7;
							if (dummy == 0) {
								break label120;
							}
						}

						var7 = this.t[var7];
					}

					if ((var10 = this.t[var7]) < 0) {
						stringBuffer[unused2++] = (byte) (~var10);
						if (unused2 >= stringPointer) {
							break;
						}

						var7 = 0;
					}

					label114:
					{
						if (~(var9 & 1) != -1) {
							var7 = this.t[var7];
							if (dummy == 0) {
								break label114;
							}
						}

						++var7;
					}

					if (~(var10 = this.t[var7]) > -1) {
						stringBuffer[unused2++] = (byte) (~var10);
						if (stringPointer <= unused2) {
							break;
						}

						var7 = 0;
					}

					++var8;
				} while (dummy == 0);

				return 1 + var8 - pointer;
			}
		} catch (RuntimeException var12) {
			throw id.a(var12, "kb.F(" + pointer + ',' + unused + ',' + (buffer != null ? "{...}" : "null") + ',' + unused2 + ',' + (stringBuffer != null ? "{...}" : "null") + ',' + stringPointer + ')');
		}
	}

	final int a (int pos, byte[] buffer, int pointer, int unused, byte[] stringBuffer, int stringPointer) {
		try {
			stringPointer += pos;
			int i4 = 0;
			int i = pointer << 3;
			++d;
			if (pos >= stringPointer) {
				return (7 + i >> 3) - pointer;
			} else {
				do {
					int dataValue = stringBuffer[pos] & 255;
					byte b = this.b[dataValue];
					int i1 = this.k[dataValue];
					if (b == 0) {
						throw new RuntimeException("No codeword for data value " + dataValue);
					}

					int i2 = i >> 3;
					int i3 = 7 & i;
					i4 &= -i3 >> 31;
					i += b;
					int i5 = (i3 + b + -1 >> 3) + i2;
					i3 += 24;
					buffer[i2] = (byte) (i4 = fb.b(i4, i1 >>> i3));
					if (i5 > i2) {
						++i2;
						i3 -= 8;
						buffer[i2] = (byte) (i4 = i1 >>> i3);
						if (i2 < i5) {
							++i2;
							i3 -= 8;
							buffer[i2] = (byte) (i4 = i1 >>> i3);
							if (i5 > i2) {
								i3 -= 8;
								++i2;
								buffer[i2] = (byte) (i4 = i1 >>> i3);
								if (i2 < i5) {
									++i2;
									i3 -= 8;
									buffer[i2] = (byte) (i4 = i1 << -i3);
								}
							}
						}
					}

					++pos;
				} while (~pos > ~stringPointer);

				return (7 + i >> 3) - pointer;
			}
		} catch (RuntimeException var16) {
			throw id.a(var16, "kb.I(" + pos + ',' + (buffer != null ? "{...}" : "null") + ',' + pointer + ',' + unused + ',' + "{...}" + ',' + stringPointer + ')');
		}
	}
}
