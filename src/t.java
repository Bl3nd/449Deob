final class t {
	static rd a = md.a((String) "Bitte starten Sie eine Mitgliedschaft", (byte) 122);
	static int[][] d = new int[104][104];
	static rd e = md.a((String) "null", (byte) 115);
	static rd f = md.a((String) "Unerwartete Antwort vom Anmelde)2Server", (byte) 115);
	static boolean g = false;
	static rd h = md.a((String) " )2> ", (byte) 127);
	static int i;
	static int j;
	static int k;
	static int l;
	static int m;
	static int o;
	static int q;
	static rd r = md.a((String) "Diese Betatest)2Welt ist nur f-Ur eingeladene", (byte) 117);
	static int s;
	static int t;
	static int v;
	static rd backhmid2 = md.a((String) "backhmid2", (byte) 127);
	// $FF: synthetic field
	static Class B;
	int b;
	ha c;
	int n;
	int p = 0;
	ha u;
	int w = 0;
	int x;
	int y;
	int z;

	static void a (pb archiveFile7, int unused, pb archiveFile2) {
		try {
			++j;
			tc.archiveFile7 = archiveFile7;
			db.archiveFile2 = archiveFile2;
		} catch (RuntimeException var4) {
			throw id.a(var4, "t.E(" + (archiveFile7 != null ? "{...}" : "null") + ',' + unused + ',' + (archiveFile2 != null ? "{...}" : "null") + ')');
		}
	}

	public static void a (int var0) {
		try {
			a = null;
			int var1 = -50 / ((var0 - -17) / 55);
			f = null;
			backhmid2 = null;
			r = null;
			h = null;
			e = null;
			d = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "t.H(" + var0 + ')');
		}
	}

	static void a (byte[] var0, d var1, int var2, boolean var3) {
		try {
			++l;
			tc var4 = new tc();
			var4.script = (long) var2;
			var4.D = 0;
			var4.N = var0;
			var4.P = var1;
			synchronized (sb.md_e) {
				sb.md_e.a(var4, (byte) 93);
			}

			if (!var3) {
				r = null;
			}

			ad.a((byte) 57);
		} catch (RuntimeException var9) {
			throw id.a(var9, "t.C(" + (var0 != null ? "{...}" : "null") + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
		}
	}

	static nd a (nd var0, int var1) {
		try {
			if (var1 != 104) {
				return null;
			} else {
				nd var2 = pd.a(var0, (byte) 100);
				if (var2 == null) {
					var2 = var0.zb;
				}

				++t;
				return var2;
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "t.A(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}

	static void a (int unused, pb archiveFile2) {
		try {
			++o;
			hf.archiveFile2 = archiveFile2;
		} catch (RuntimeException var3) {
			throw id.a(var3, "t.G(" + unused + ',' + (archiveFile2 != null ? "{...}" : "null") + ')');
		}
	}

	static wb a (int var0, int var1) {
		int var8 = client.int_tb;

		try {
			++m;
			wb var2 = (wb) fc.dd_h.a((byte) -102, (long) var1);
			if (var2 != null) {
				return var2;
			} else {
				byte[] var3 = dd.cacheFile12.a(var1, 0, (byte) 66);
				if (var3 == null) {
					return null;
				} else {
					var2 = new wb();
					id var4 = new id(var3);
					int var6 = 0;
					var4.pointer = -12 + var4.buffer.length;
					int var5 = var4.readInt((byte) -55);
					var2.gb = var4.readUnsignedLEShort(var0 + -24624);
					var2.int_tb = var4.readUnsignedLEShort(255);
					var2.int_jb = var4.readUnsignedLEShort(var0 ^ 25040);
					var2.hb = var4.readUnsignedLEShort(255);
					var2.ob = new int[var5];
					var4.pointer = 0;
					var2.sb = new int[var5];
					var2.Z = new rd[var5];
					if (var8 == 0 && ~var4.pointer <= ~(-12 + var4.buffer.length)) {
						if (var0 != 24879) {
							a(-43, -123);
						}

						fc.dd_h.a(-108, var2, (long) var1);
						return var2;
					} else {
						do {
							int var7;
							label42:
							{
								var7 = var4.readUnsignedLEShort(var0 ^ 25040);
								if (~var7 != -4) {
									if (var7 >= 100 || ~var7 == -22 || ~var7 == -39 || ~var7 == -40) {
										var2.ob[var6] = var4.readUnsignedByte((byte) 116);
										if (var8 == 0) {
											break label42;
										}
									}

									var2.ob[var6] = var4.readInt((byte) -81);
									if (var8 == 0) {
										break label42;
									}
								}

								var2.Z[var6] = var4.readRSString(-1);
							}

							var2.sb[var6++] = var7;
						} while (~var4.pointer > ~(-12 + var4.buffer.length));

						if (var0 != 24879) {
							a(-43, -123);
						}

						fc.dd_h.a(-108, var2, (long) var1);
						return var2;
					}
				}
			}
		} catch (RuntimeException var9) {
			throw id.a(var9, "t.F(" + var0 + ',' + var1 + ')');
		}
	}

	static void b (int unused) {
		try {
			++i;
			if (bc.t != null) {
				long l = pa.c(0);
				if (l > ib.long_q) {
					bc.t.a(l);
					int i = (int) (-ib.long_q + l);
					ib.long_q = l;
					synchronized (B != null ? B : (B = forName("eb"))) {
						va.int_q += hc.sampleRate * i;
						int i1 = (va.int_q - 2000 * hc.sampleRate) / 1000;
						if (i1 > 0) {
							if (te.Ub != null) {
								te.Ub.e(i1);
							}

							va.int_q -= i1 * 1000;
						}
					}
				}
			}
		} catch (RuntimeException var10) {
			throw id.a(var10, "t.D(" + unused + ')');
		}
	}

	static boolean a (int index, byte unused, int i1, pb cacheFile) {
		try {
			++s;
			byte[] data = cacheFile.a(index, i1, (byte) 66);
			if (data == null) {
				return false;
			} else {
				pc.a(85, data);
				return true;
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "t.B(" + index + ',' + unused + ',' + i1 + ',' + (cacheFile != null ? "{...}" : "null") + ')');
		}
	}

	// $FF: synthetic method
	private static Class forName (String className) {
		try {
			return Class.forName(className);
		} catch (ClassNotFoundException var2) {
			throw new NoClassDefFoundError(var2.getMessage());
		}
	}
}
