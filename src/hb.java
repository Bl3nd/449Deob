final class hb {
	static rd rd_a = md.a((String) "Bitte laden Sie die Seite neu)3", (byte) 120);
	static rd rd_c = md.a((String) " hat sich ausgeloggt)3", (byte) 116);
	static int int_d;
	static int int_e;
	static int int_f;
	static int int_g;
	static int int_h;
	static int int_i;
	static rd addFriend2;
	static int int_k;
	static rd rd_m;
	static he compass;
	private static rd addFriend = md.a((String) "Add friend", (byte) 116);
	private static rd rd_l;

	static {
		addFriend2 = addFriend;
		rd_l = md.a("glow2:", (byte) 124);
		rd_m = rd_l;
		int_d = 0;
		int_k = 0;
	}

	public static void a (boolean var0) {
		try {
			if (var0) {
				addFriend = null;
				addFriend2 = null;
				rd_a = null;
				compass = null;
				rd_m = null;
				rd_l = null;
				rd_c = null;
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "hb.A(" + var0 + ')');
		}
	}

	static tb a (int var0, byte var1) {
		try {
			++int_g;
			tb var2 = (tb) ec.dd_g.a((byte) -115, (long) var0);
			if (var2 != null) {
				return var2;
			} else {
				byte[] var3 = db.archiveFile2.a(9, var0, (byte) 66);
				var2 = new tb();
				var2.zb = var0;
				if (var3 != null) {
					var2.a(0, new id(var3));
				}

				var2.c((byte) -55);
				ec.dd_g.a(-128, var2, (long) var0);
				if (var1 != 48) {
					a((byte) -89);
				}

				return var2;
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "hb.B(" + var0 + ',' + var1 + ')');
		}
	}

	static void a (byte var0) {
		int var3 = client.int_tb;

		try {
			++int_f;
			gf.int_q = 0;
			if (var0 > -56) {
				rd_a = null;
			}

			me.Q = 0;
			nd.g(2);
			ee.a(32555);
			jb.b((byte) 46);
			int var1 = 0;
			int var2;
			if (var3 != 0) {
				var2 = pd.E[var1];
				if (ta.Nb[var2].Pb != ce.y) {
					ta.Nb[var2].tb_md = null;
					ta.Nb[var2] = null;
				}

				++var1;
			}

			for ( ; var1 < me.Q ; ++var1) {
				var2 = pd.E[var1];
				if (ta.Nb[var2].Pb != ce.y) {
					ta.Nb[var2].tb_md = null;
					ta.Nb[var2] = null;
				}
			}

			if (l.incomingPacketSize != lc.readStream.pointer) {
				throw new RuntimeException("gnp1 pos:" + lc.readStream.pointer + " psize:" + l.incomingPacketSize);
			} else {
				var2 = 0;
				if (var3 != 0 || var2 < lc.q) {
					do {
						if (ta.Nb[ca.ints_b[var2]] == null) {
							throw new RuntimeException("gnp2 pos:" + var2 + " size:" + lc.q);
						}

						++var2;
					} while (var2 < lc.q);

				}
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "hb.C(" + var0 + ')');
		}
	}

	static void a (int unused) {
		try {
			j.Z.c(-118);
			va.dd_d.c(-103);
			++int_h;
		} catch (RuntimeException var2) {
			throw id.a(var2, "hb.D(" + unused + ')');
		}
	}
}
