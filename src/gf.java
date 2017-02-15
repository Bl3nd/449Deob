final class gf {
	static int int_a;
	static ke cacheFile1;
	static rd rd_c;
	static rd rd_e = md.a((String) "welle2:", (byte) 121);
	static int int_f = -1;
	static dd dd_g;
	static int int_h;
	static int int_i;
	static int int_j;
	static int int_k;
	static rd rd_l;
	static rd rd_n;
	static rd rd_p;
	static int int_q;
	static int int_r;
	static int int_u;
	static rd theServerIsBeingUpdated2;
	private static rd rd_d = md.a((String) "To create a new account you need to", (byte) 124);
	private static rd rd_m;
	private static rd rd_o;
	private static rd rd_s;
	private static rd theServerIsBeingUpdated;

	static {
		rd_c = rd_d;
		int_j = 0;
		dd_g = new dd(50);
		rd_o = md.a("Classic", (byte) 118);
		int_r = 0;
		int_q = 0;
		rd_m = md.a("shake:", (byte) 119);
		rd_s = md.a("Loading friend list", (byte) 119);
		rd_n = rd_s;
		theServerIsBeingUpdated = md.a("The server is being updated)3", (byte) 126);
		int_u = 0;
		rd_l = rd_m;
		rd_p = rd_o;
		theServerIsBeingUpdated2 = theServerIsBeingUpdated;
	}

	static void a (byte var0) {
		int var4 = client.int_tb;

		try {
			jd.currentIncomingPacket = -1;
			nb.n = 0;
			++int_i;
			ie.writeStream.pointer = 0;
			db.H = -1;
			s.ub = false;
			id.rb = 0;
			vc.I = -1;
			jb.M = 0;
			le.updateTime = 0;
			ta.Bb = -1;
			pb.d = 0;
			l.incomingPacketSize = 0;
			lc.readStream.pointer = 0;
			int var2 = 0;
			if (var4 != 0 || ~var2 > ~f.Lc.length) {
				do {
					if (f.Lc[var2] != null) {
						f.Lc[var2].Kb = -1;
					}

					++var2;
				} while (~var2 > ~f.Lc.length);
			}

			int var3 = 0;
			if (var4 != 0) {
				if (ta.Nb[var3] != null) {
					ta.Nb[var3].Kb = -1;
				}

				++var3;
			}

			for ( ; var3 < ta.Nb.length ; ++var3) {
				if (ta.Nb[var3] != null) {
					ta.Nb[var3].Kb = -1;
				}
			}

			sb.a(-1);
			bd.a(false, 30);
		} catch (RuntimeException var5) {
			throw id.a(var5, "gf.C(" + var0 + ')');
		}
	}

	public static void b (byte var0) {
		try {
			rd_c = null;
			rd_o = null;
			rd_m = null;
			if (var0 != -60) {
				theServerIsBeingUpdated2 = null;
			}

			rd_d = null;
			rd_l = null;
			cacheFile1 = null;
			rd_p = null;
			rd_n = null;
			rd_e = null;
			theServerIsBeingUpdated = null;
			theServerIsBeingUpdated2 = null;
			dd_g = null;
			rd_s = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "gf.B(" + var0 + ')');
		}
	}

	static byte[] a (Object o, boolean flag, byte unused) {
		try {
			++int_k;
			if (o == null) {
				return null;
			} else if (o instanceof byte[]) {
				byte[] data = (byte[]) o;
				return flag ? se.a(data, -16044) : data;//Copy data or return data
			} else if (o instanceof bf) {
				bf class_bf = (bf) o;
				return class_bf.get((byte) 120);//get();
			} else {
				throw new IllegalArgumentException();
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "gf.A(" + "{...}" + ',' + flag + ',' + unused + ')');
		}
	}
}
