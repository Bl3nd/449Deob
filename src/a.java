final class a extends jb {
	static int Z;
	static int bb;
	static int int_cb;
	static int int_db;
	static int int_eb;
	static int[] ints_fb = new int[99];
	static byte[][][] bytes_gb;
	static rd chatPanelRedrawn;
	static rd headicons_pk;
	static boolean boolean_jb;
	static int int_kb;
	static int int_lb;
	static int mb;
	static int[] ints_nb;
	static rd rd_ob;

	static {
		int i2 = 0;
		for (int index = 0 ; index < 99 ; index++) {
			int i = 1 + index;
			int i1 = (int) ((double) i + Math.pow(2.0D, (double) i / 7.0D) * 300.0D);
			i2 += i1;
			ints_fb[index] = i2 / 4;
		}

		chatPanelRedrawn = md.a("Chat panel redrawn", (byte) 125);
		boolean_jb = false;
		int_kb = 2;
		int_lb = 0;
		headicons_pk = md.a("headicons_pk", (byte) 122);
		ints_nb = new int[]{16776960, 16711680, '\uff00', '\uffff', 16711935, 16777215};
		rd_ob = md.a("Ladevorgang )2 bitte warten Sie)3", (byte) 121);
	}

	fe[] fes_ab;

	a (pb class_pb, pb class_pb2, int index, boolean flag) {
		try {
			md class_md = new md();
			int length = class_pb.getLengthForIndex(index, false);
			this.fes_ab = new fe[length];
			int[] ints = class_pb.a(index, false);
			int var8 = 0;
			if (ints.length > var8) {
				do {
					byte[] buffer = class_pb.a(index, ints[var8], (byte) 66);
					i class_i = null;
					int fileRequestId = buffer[1] & 255 | (255 & buffer[0]) << 8;
					i class_i2 = (i) class_md.c((byte) 24);
					if (class_i2 != null) {
						do {
							if (fileRequestId == class_i2.D) {
								class_i = class_i2;
								break;
							}

							class_i2 = (i) class_md.a((byte) -68);
						} while (class_i2 != null);
					}

					if (class_i == null) {
						byte[] data;
						if (flag) {
							data = class_pb2.a(0, -1, fileRequestId);
						} else {
							data = class_pb2.a(fileRequestId, -1, 0);
						}

						class_i = new i(fileRequestId, data);
						class_md.a(class_i, (byte) -40);
					}

					this.fes_ab[ints[var8]] = new fe(buffer, class_i);
					++var8;
				} while (ints.length > var8);

			}
		} catch (RuntimeException var15) {
			throw id.a(var15, "a.<init>(" + (class_pb != null ? "{...}" : "null") + ',' + (class_pb2 != null ? "{...}" : "null") + ',' + index + ',' + flag + ')');
		}
	}

	static boolean a (int unused, int cacheId) {
		try {
			++int_eb;
			if (l.Z[cacheId]) {
				return true;
			} else if (!eb.archiveFile3.a((byte) 53, cacheId)) {
				return false;
			} else {
				int length = eb.archiveFile3.getLengthForIndex(cacheId, false);
				if (length == 0) {
					l.Z[cacheId] = true;
					return true;
				} else {
					if (ld.c[cacheId] == null) {
						ld.c[cacheId] = new nd[length];
					}

					int fileId = unused;
					if (length <= unused) {
						l.Z[cacheId] = true;
						return true;
					} else {
						do {
							if (ld.c[cacheId][fileId] == null) {
								byte[] buffer = eb.archiveFile3.a(cacheId, fileId, (byte) 66);
								if (buffer != null) {
									ld.c[cacheId][fileId] = new nd();
									ld.c[cacheId][fileId].dc = (cacheId << 16) + fileId;
									if (buffer[0] == -1) {
										ld.c[cacheId][fileId].a((byte) -87, new id(buffer));
									} else {
										ld.c[cacheId][fileId].a(new id(buffer), 16959);
									}
								}
							}

							++fileId;
						} while (length > fileId);

						l.Z[cacheId] = true;
						return true;
					}
				}
			}
		} catch (RuntimeException var6) {
			throw id.a(var6, "a.C(" + unused + ',' + cacheId + ')');
		}
	}

	static rd b (int unused, int i) {
		try {
			++Z;
			if (i < 100000) {
				return bf.a(i, -31766);
			} else {
				return i < 10000000 ? pc.a((byte) 125, new rd[]{bf.a(i / 1000, -31766), f.K2}) : pc.a((byte) 127, new rd[]{bf.a(i / 1000000, -31766), ad.M2});
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "a.A(" + unused + ',' + i + ')');
		}
	}

	static boolean d (int i, int unused) {
		try {
			++int_db;
			return (1073340130 & i) >> 29 != 0;
		} catch (RuntimeException var3) {
			throw id.a(var3, "a.D(" + i + ',' + unused + ')');
		}
	}

	public static void f (int unused) {
		try {
			chatPanelRedrawn = null;
			headicons_pk = null;
			ints_nb = null;
			rd_ob = null;
			ints_fb = null;
			bytes_gb = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "a.B(" + unused + ')');
		}
	}

	final boolean c (int index, int unused) {
		try {
			++int_cb;
			return this.fes_ab[index].boolean_e;
		} catch (RuntimeException var4) {
			throw id.a(var4, "a.E(" + index + ',' + unused + ')');
		}
	}
}
