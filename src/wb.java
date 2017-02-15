final class wb extends jb {
	static nd ab;
	static rd bb = md.a((String) "Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <AN>", (byte) 124);
	static int cb;
	static int int_db = 0;
	static long[] eb = new long[100];
	static int fb;
	static int ib;
	static oa kb;
	static int lb;
	static int mb = 0;
	static int nb;
	static int int_qb;
	static rd rb = md.a((String) "Versteckt", (byte) 127);
	static rd loadingWordpack2;
	static int vb;
	private static rd loadingWordpack = md.a((String) "Loading wordpack )2 ", (byte) 125);

	static {
		loadingWordpack2 = loadingWordpack;
		vb = 7759444;
		nb = 0;
	}

	rd[] Z;
	int gb;
	int hb;
	int int_jb;
	int[] ob;
	int[] sb;
	int int_tb;

	static void f (int unused) {
		int dummy = client.int_tb;
		try {
			short var1;
			int var2;
			++cb;
			var1 = 256;
			if (j.zb <= 0) {
				if (h.int_q <= 0) {
					var2 = 0;
					do {
						jb.B[var2] = ff.ints_h[var2];
						++var2;
					} while (var2 < 256);
				} else {
					var2 = 0;
					do {
						if (h.int_q <= 768) {
							if (h.int_q > 256) {
								jb.B[var2] = ie.m[var2];
							} else {
								jb.B[var2] = f.a(ff.ints_h[var2], ie.m[var2], -h.int_q + 256, (byte) 78);
							}
						} else {
							jb.B[var2] = f.a(ie.m[var2], ff.ints_h[var2], 1024 + -h.int_q, (byte) 78);
						}

						++var2;
					} while (var2 < 256);
				}
			} else {
				var2 = 0;
				do {
					if (j.zb > 768) {
						jb.B[var2] = f.a(tb.Zb[var2], ff.ints_h[var2], -j.zb + 1024, (byte) 78);
					} else if (j.zb <= 256) {
						jb.B[var2] = f.a(ff.ints_h[var2], tb.Zb[var2], 256 + -j.zb, (byte) 78);
					} else {
						jb.B[var2] = tb.Zb[var2];
					}

					++var2;
				} while (var2 < 256);
			}

			var2 = 0;
			do {
				ke.wb.imagePixels[var2] = lc.he_a.imagePixels[var2];
				++var2;
			} while (var2 < 33920);

			int var3 = 0;
			int var4 = 1152;
			int var5 = 1;
			int var6;
			int var7;
			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			while (-1 + var1 > var5) {
				var6 = f.Vc[var5] * (-var5 + var1) / var1;
				var7 = 22 + var6;
				if (var7 < 0) {
					var7 = 0;
				}

				var3 += var7;
				var8 = var7;
				if (var7 >= 128) {
					var4 += var7;
					++var5;
				} else {
					do {
						var9 = lc.ints_f[var3++];
						if (var9 != 0) {
							var10 = var9;
							var11 = 256 + -var9;
							var9 = jb.B[var9];
							var12 = ke.wb.imagePixels[var4];
							ke.wb.imagePixels[var4++] = od.a(16711680,
															 od.a('\uff00', var9) * var10
																	 + var11 * od.a('\uff00', var12))
									+ od.a(-16711936, od.a(var9, 16711935) * var10
									+ var11 * od.a(16711935, var12)) >> 8;
						} else {
							++var4;
						}

						++var8;
					} while (var8 < 128);

					var4 += var7;
					++var5;
				}
			}

			var3 = 0;
			var4 = 1176;
			var6 = 0;
			do {
				te.Vb.imagePixels[var6] = ce.he_b.imagePixels[var6];
				++var6;
			} while (var6 < 33920);

			var7 = 1;
			if (var7 < -1 + var1) {
				do {
					var8 = (var1 + -var7) * f.Vc[var7] / var1;
					var9 = -var8 + 103;
					var4 += var8;
					var10 = 0;
					if (var9 <= var10) {
						var4 += 128 + -var9 - var8;
						var3 += 128 - var9;
						++var7;
					} else {
						do {
							var11 = lc.ints_f[var3++];
							if (var11 != 0) {
								var12 = var11;
								int i = -var11 + 256;
								int imagePixel = te.Vb.imagePixels[var4];
								var11 = jb.B[var11];
								te.Vb.imagePixels[var4++] = od.a(var12 * od.a('\uff00', var11) - -(i * od
										.a(imagePixel, '\uff00')), 16711680) + od
										.a(-16711936, od.a(16711935, imagePixel) * i + od
												.a(var11, 16711935) * var12) >> 8;
							} else {
								++var4;
							}

							++var10;
						} while (var9 > var10);

						var4 += 128 + -var9 - var8;
						var3 += 128 - var9;
						++var7;
					}
				} while (var7 < -1 + var1);

			}
		} catch (RuntimeException var16) {
			throw id.a(var16, "wb.D(" + unused + ')');
		}
	}

	public static void g (int var0) {
		try {
			ab = null;
			loadingWordpack2 = null;
			bb = null;
			kb = null;
			rb = null;
			eb = null;
			if (var0 != -8185) {
				mb = 4;
			}

			loadingWordpack = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "wb.A(" + var0 + ')');
		}
	}

	static void a (pb archiveFile2, int unused, boolean flag, pb archiveFile7) {
		try {
			++lb;
			pa.boolean_h = flag;
			te.archiveFile2 = archiveFile2;
			q.archiveFile7 = archiveFile7;
		} catch (RuntimeException var5) {
			throw id.a(var5, "wb.C(" + (archiveFile2 != null ? "{...}" : "null") + ',' + unused + ',' + flag + ',' + (archiveFile7 != null ? "{...}" : "null") + ')');
		}
	}

	static void a (pb archiveFile0, byte unused, pb archiveFile2, pb archiveFile1) {
		try {
			++int_qb;
			db.archiveFile1 = archiveFile1;
			je.archiveFile2_ = archiveFile2;
			sd.archiveFile0 = archiveFile0;
		} catch (RuntimeException var5) {
			throw id.a(var5, "wb.B(" + (archiveFile0 != null ? "{...}" : "null") + ',' + unused + ',' + (archiveFile2 != null ? "{...}" : "null") + ',' + (archiveFile1 != null ? "{...}" : "null") + ')');
		}
	}

	static void a (int var0, int var1, byte[] var2, int var3, boolean var4) {
		try {
			++fb;
			if (p.z != null) {
				if (var1 != 1) {
					f(-24);
				}

				if (f.Ab < 0) {
					if (r.T != 0) {
						client.loopInfinite = var4;
						ce.z = var0;
						jc.K = var2;
					} else {
						ja.a((byte) -104, var0, var2, var4);//Midi misc...
					}
				} else {
					te.tb = var3;
					if (f.Ab == 0) {
						r.T = 1;
					} else {
						int var5 = qb.a(f.Ab, (byte) -115);//natural log
						var5 -= tc.I;
						r.T = (3600 + var5) / var3;
						if (r.T < 1) {
							r.T = 1;
						}
					}

					ce.z = var0;
					client.loopInfinite = var4;
					jc.K = var2;
				}
			}
		} catch (RuntimeException var6) {
			throw id.a(var6, "wb.E(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + var4 + ')');
		}
	}
}
