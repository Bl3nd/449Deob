final class qb extends jb {
	static int Z;
	static rd ab = md.a((String) "Verbindung konnte nicht hergestellt werden)3", (byte) 115);
	static int bb;
	static int cb;
	static int int_db;
	static int eb;
	static he[] mapmarker;
	static int gb;
	static rd hb = md.a((String) "gr-Un:", (byte) 116);
	static int int_jb;
	static boolean kb = false;
	static rd lb = md.a((String) "Neuer Benutzer", (byte) 115);
	static boolean mb;
	static int nb;
	static rd ob = md.a((String) ":: (X", (byte) 115);
	static rd null_ = md.a((String) "Null", (byte) 122);
	static int qb;
	byte[] ib;

	qb (byte[] var1) {
		try {
			this.ib = var1;
		} catch (RuntimeException var3) {
			throw id.a(var3, "qb.<init>(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	static int a (byte unused, int x, int plane, int y) {
		try {
			++bb;
			return (8 & d.bytes_j[plane][x][y]) != 0 ? 0 : (plane > 0 && (d.bytes_j[1][x][y] & 2) != 0 ? -1 + plane : plane);
		} catch (RuntimeException var5) {
			throw id.a(var5, "qb.G(" + unused + ',' + x + ',' + plane + ',' + y + ')');
		}
	}

	static wa a (int fileRequest, int var1) {
		try {
			++gb;
			if (var1 != -1) {
				a((byte) -108, -63, 75, -38);
			}

			wa var2 = (wa) jb.D.a((byte) -90, (long) fileRequest);
			if (var2 != null) {
				return var2;
			} else {
				byte[] var3 = ke.archiveFile2.a(3, fileRequest, (byte) 66);
				var2 = new wa();
				if (var3 != null) {
					var2.a(-7, new id(var3));
				}

				jb.D.a(-128, var2, (long) fileRequest);
				return var2;
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "qb.C(" + fileRequest + ',' + var1 + ')');
		}
	}

	static int a (int var0, byte var1) {
		try {
			++nb;
			if (var1 > -113) {
				f(-73);
			}

			return (int) (0.5D + Math.log(0.00390625D * (double) var0) * 868.5889638065036D);
		} catch (RuntimeException var3) {
			throw id.a(var3, "qb.D(" + var0 + ',' + var1 + ')');
		}
	}

	static oa[] a (rd class_rd, rd sprite, pb archiveFile8, int unused) {
		try {
			++int_jb;
			int index = archiveFile8.a(sprite, (byte) -106);
			int i = archiveFile8.a(class_rd, -31757, index);
			return we.a((byte) -93, index, archiveFile8, i);
		} catch (RuntimeException var6) {
			throw id.a(var6, "qb.A(" + (class_rd != null ? "{...}" : "null") + ',' + (sprite != null ? "{...}" : "null") + ',' + (archiveFile8 != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}

	static void a (int unused, byte unused2, f class_f) {
		try {
			++eb;
			if (class_f.x_ < 128 || class_f.y_ < 128 || class_f.x_ >= 13184 || class_f.y_ >= 13184) {
				class_f.int_uc = 0;
				class_f.x_ = 128 * class_f.xc[0] + (64 * class_f.int_kc);
				class_f.Wb = -1;
				class_f.y_ = class_f.int_kc * 64 + class_f.Hc[0] * 128;
				class_f.Ib = 0;
				class_f.zc = -1;
				class_f.f((byte) -105);
			}

			if (class_f == af.td_p && (class_f.x_ < 1536 || class_f.y_ < 1536 || class_f.x_ >= 11776 || class_f.y_ >= 11776)) {
				class_f.x_ = class_f.int_kc * 64 + class_f.xc[0] * 128;
				class_f.zc = -1;
				class_f.Ib = 0;
				class_f.Wb = -1;
				class_f.int_uc = 0;
				class_f.y_ = class_f.Hc[0] * 128 + class_f.int_kc * 64;
				class_f.f((byte) -105);
			}

			if (ce.y < class_f.int_uc) {
				db.a(true, class_f);
			} else if (ce.y > class_f.Ib) {
				u.a((byte) -20, class_f);
			} else {
				pc.a(3031, class_f);
			}

			l.a(-19558, class_f);
			d.a(class_f, false);
		} catch (RuntimeException var5) {
			throw id.a(var5, "qb.E(" + unused + ',' + unused2 + ',' + "{...}" + ')');
		}
	}

	public static void f (int var0) {
		try {
			if (var0 != 13402) {
			}

			mapmarker = null;
			lb = null;
			null_ = null;
			hb = null;
			ob = null;
			ab = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "qb.B(" + var0 + ')');
		}
	}

	static void c (byte var0) {
		int var3 = client.int_tb;

		try {
			me.Q = 0;
			gf.int_q = 0;
			++qb;
			ad.b((byte) 19);
			rd.j(109);
			m.a((byte) -2);
			w.a((byte) -91);
			int var1 = 0;
			if (var0 == -72) {
				int var2;
				for ( ; var1 < me.Q ; ++var1) {
					var2 = pd.E[var1];
					if (ce.y != f.Lc[var2].Pb) {
						f.Lc[var2] = null;
					}
				}

				if (~lc.readStream.pointer != ~l.incomingPacketSize) {
					throw new RuntimeException("gpp1 pos:" + lc.readStream.pointer + " psize:" + l.incomingPacketSize);
				} else {
					var2 = 0;
					if (var3 != 0 || var2 < b.int_hd) {
						do {
							if (f.Lc[r.R[var2]] == null) {
								throw new RuntimeException("gpp2 pos:" + var2 + " size:" + b.int_hd);
							}

							++var2;
						} while (var2 < b.int_hd);

					}
				}
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "qb.F(" + var0 + ')');
		}
	}
}
