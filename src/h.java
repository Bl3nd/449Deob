final class h {
	static int int_a;
	static int int_b;
	static int int_c;
	static volatile boolean boolean_d = false;
	static int int_f;
	static int int_h;
	static int int_k;
	static oa oa_l;
	static int int_m = 0;
	static rd rd_n;
	static int int_o;
	static int int_q;
	static rd rd_r;
	static df df_s;
	static int int_t;
	static rd loadedGamescreen2;
	static rd loadedTextures2;
	static int x;
	static rd y;
	private static rd loadedTextures = md.a((String) "Loaded textures", (byte) 121);
	private static rd loadedGamescreen;
	private static rd rd_u;

	static {
		loadedTextures2 = loadedTextures;
		loadedGamescreen = md.a("Loaded gamescreen", (byte) 120);
		int_q = 0;
		y = null;
		int_c = 0;
		rd_u = md.a("Please remove ", (byte) 126);
		rd_n = rd_u;
		loadedGamescreen2 = loadedGamescreen;
		rd_r = rd_u;
	}

	private int[][] ints_e;
	private int int_g;
	private int int_i;

	h (int sampleRateValue, int sampleRate) {
		try {
			if (sampleRateValue != sampleRate) {
				int i = se.a(15106, sampleRateValue, sampleRate);
				sampleRate /= i;
				sampleRateValue /= i;
				this.ints_e = new int[sampleRateValue][14];
				this.int_g = sampleRateValue;
				this.int_i = sampleRate;
				int i1 = 0;
				if (sampleRateValue > i1) {
					do {
						int[] ints = this.ints_e[i1];
						double v = (double) i1 / (double) sampleRateValue + 6.0D;
						int floor = (int) Math.floor(v - 7.0D + 1.0D);
						if (floor < 0) {
							floor = 0;
						}

						int ceil = (int) Math.ceil(7.0D + v);
						if (ceil > 14) {
							ceil = 14;
						}

						double v1 = (double) sampleRate / (double) sampleRateValue;
						if (floor >= ceil) {
							++i1;
						} else {
							do {
								double v2 = 3.141592653589793D * ((double) floor - v);
								double v3 = v1;
								if (v2 < -1.0E-4D || v2 > 1.0E-4D) {
									v3 = v1 * (Math.sin(v2) / v2);
								}

								v3 *= 0.54D + Math.cos(0.2243994752564138D * ((double) floor - v)) * 0.46D;
								ints[floor] = (int) Math.floor(0.5D + v3 * 65536.0D);
								++floor;
							} while (floor < ceil);

							++i1;
						}
					} while (sampleRateValue > i1);

				}
			}
		} catch (RuntimeException var17) {
			throw id.a(var17, "h.<init>(" + sampleRateValue + ',' + sampleRate + ')');
		}
	}

	static hf a (int unused, int fileRequest) {
		try {
			++int_h;
			hf var2 = (hf) je.dd_w.a((byte) -120, (long) fileRequest);
			if (var2 != null) {
				return var2;
			} else {
				byte[] var3 = ka.archiveFile2.a(4, fileRequest, (byte) 66);
				var2 = new hf();
				if (var3 != null) {
					var2.a(16876, new id(var3), fileRequest);
				}

				var2.d((byte) 92);
				je.dd_w.a(-93, var2, (long) fileRequest);
				return var2;
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "h.F(" + unused + ',' + fileRequest + ')');
		}
	}

	static void a (byte var0, int var1) {
		try {
			++x;
			if (var0 != 93) {
				loadedTextures = null;
			}

			if (p.z != null) {
				if (~r.T != -1) {
					if (jc.K != null) {
						ce.z = var1;
					}
				} else {
					if (f.Ab < 0) {
						return;
					}

					f.Ab = var1;
					p.z.a(0, var1, 14);
				}

			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "h.E(" + var0 + ',' + var1 + ')');
		}
	}

	static void a (int var0, int var1, int var2, int var3, int var4) {
		int var10 = client.int_tb;

		try {
			ud var5 = (ud) ud.P.a(-1, (long) var0);
			++int_o;
			if (var5 == null) {
				var5 = new ud();
				ud.P.a((byte) -7, (long) var0, var5);
			}

			if (~var5.L.length >= ~var4) {
				int[] var6 = new int[var4 + 1];
				int[] var7 = new int[var4 + 1];
				int var8 = 0;
				if (var10 != 0 || var8 < var5.L.length) {
					do {
						var6[var8] = var5.L[var8];
						var7[var8] = var5.D[var8];
						++var8;
					} while (var8 < var5.L.length);
				}

				int var9 = var5.L.length;
				if (var10 != 0 || var9 < var4) {
					do {
						var6[var9] = -1;
						var7[var9] = 0;
						++var9;
					} while (var9 < var4);
				}

				var5.D = var7;
				var5.L = var6;
			}

			var5.L[var4] = var3;
			if (var1 >= 29) {
				var5.D[var4] = var2;
			}
		} catch (RuntimeException var11) {
			throw id.a(var11, "h.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}

	public static void a (boolean var0) {
		try {
			loadedGamescreen = null;
			rd_n = null;
			rd_u = null;
			rd_r = null;
			oa_l = null;
			df_s = null;
			loadedGamescreen2 = null;
			y = null;
			if (var0) {
				loadedTextures = null;
				loadedTextures2 = null;
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "h.D(" + var0 + ')');
		}
	}

	final int b (int var1, int var2) {
		try {
			if (this.ints_e != null) {
				var2 = 6 + (int) ((long) var2 * (long) this.int_i / (long) this.int_g);
			}

			if (var1 != 0) {
				this.a((byte) -120, null);
			}

			++int_f;
			return var2;
		} catch (RuntimeException var4) {
			throw id.a(var4, "h.G(" + var1 + ',' + var2 + ')');
		}
	}

	final byte[] a (byte var1, byte[] var2) {
		int var12 = client.int_tb;

		try {
			++int_k;
			if (this.ints_e != null) {
				int var3 = (int) ((long) this.int_i * (long) var2.length / (long) this.int_g) - -14;
				int var5 = 0;
				int[] var4 = new int[var3];
				int var6 = 0;
				int var7 = 0;
				if (var12 != 0 || var2.length > var7) {
					do {
						byte var8 = var2[var7];
						int[] var9 = this.ints_e[var6];
						int var10 = 0;
						if (var12 != 0) {
							var4[var5 - -var10] += var9[var10] * var8;
							++var10;
						}

						while (var10 < 14) {
							var4[var5 - -var10] += var9[var10] * var8;
							++var10;
						}

						var6 += this.int_i;
						int var11 = var6 / this.int_g;
						var6 -= var11 * this.int_g;
						var5 += var11;
						++var7;
					} while (var2.length > var7);
				}

				var2 = new byte[var3];
				int var14 = 0;
				if (var12 != 0 || ~var14 > ~var3) {
					do {
						label80:
						{
							int var15 = '耀' + var4[var14] >> 16;
							if (~var15 > 127) {
								var2[var14] = -128;
								if (var12 == 0) {
									break label80;
								}
							}

							if (~var15 < -128) {
								var2[var14] = 127;
								if (var12 == 0) {
									break label80;
								}
							}

							var2[var14] = (byte) var15;
						}

						++var14;
					} while (~var14 > ~var3);
				}
			}

			return var1 != 127 ? null : var2;
		} catch (RuntimeException var13) {
			throw id.a(var13, "h.C(" + var1 + ',' + "{...}" + ')');
		}
	}

	final int c (int var1, int var2) {
		try {
			if (this.ints_e != null) {
				var2 = (int) ((long) var2 * (long) this.int_i / (long) this.int_g);
			}

			if (var1 != -128) {
				this.int_g = 24;
			}

			++int_t;
			return var2;
		} catch (RuntimeException var4) {
			throw id.a(var4, "h.A(" + var1 + ',' + var2 + ')');
		}
	}
}
