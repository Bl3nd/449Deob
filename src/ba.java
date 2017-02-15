final class ba {
	static int int_b;
	static rd errorLoadingYourProfile2;
	static int int_e;
	static int int_f;
	static oa oa_h;
	static int int_i;
	static rd pleaseCloseTheInterfaceBeforeUsingReportAbuse2;
	static boolean boolean_l;
	static rd rd_m;
	static rd rd_n;
	static rd[] rds_o;
	static rd mapdots;
	static rd rd_q;
	static int[] ints_r;
	static int int_s;
	static int int_t;
	private static rd pleaseCloseTheInterfaceBeforeUsingReportAbuse = md.a((String) "Please close the interface you have open before using (Wreport abuse(W", (byte) 116);
	private static rd errorLoadingYourProfile = md.a((String) "Error loading your profile)3", (byte) 125);
	private static rd rd_g = md.a((String) " is already on your friend list", (byte) 124);
	private static rd rd_k = md.a((String) "yellow:", (byte) 122);

	static {
		rd_m = rd_k;
		pleaseCloseTheInterfaceBeforeUsingReportAbuse2 = pleaseCloseTheInterfaceBeforeUsingReportAbuse;
		rd_n = rd_g;
		errorLoadingYourProfile2 = errorLoadingYourProfile;
		mapdots = md.a("mapdots", (byte) 121);
		int_f = 0;
		ints_r = new int[50];
		rd_q = md.a("Spiel)2Engine wird gestartet)3)3)3", (byte) 117);
	}

	static void a (ua class_ua, nc[] ncs, int x, byte[] data, int unused, int y) {
		try {
			++int_i;
			id class_id = new id(data);
			int fileRequest = -1;
			do {
				int i1 = class_id.readUnsignedSmart((byte) -100);
				if (i1 == 0) {
					break;
				}

				fileRequest += i1;
				int i2 = 0;
				while (true) {
					int i3 = class_id.readUnsignedSmart((byte) -124);
					if (i3 == 0) {
						break;
					}

					i2 += -1 + i3;
					int i4 = i2 >> 6 & 63;
					int i5 = i2 & 63;
					int i6 = class_id.readUnsignedByte((byte) 116);
					int plane = i2 >> 12;
					int i8 = i6 >> 2;
					int i9 = 3 & i6;
					int xx = i4 + x;
					int yy = y + i5;
					if (xx > 0 && yy > 0 && xx < 103 && yy < 103) {
						int i10 = plane;
						nc class_nc = null;
						if ((2 & d.bytes_j[1][xx][yy]) == 2) {
							i10 = plane - 1;
						}

						if (i10 >= 0) {
							class_nc = ncs[i10];
						}

						ca.a(yy, i8, plane, class_ua, class_nc, i9, fileRequest, xx, (byte) -55);
					}
				}
			} while (true);
		} catch (RuntimeException var22) {
			throw id.a(var22, "ba.C(" + (class_ua != null ? "{...}" : "null") + ',' + (ncs != null ? "{...}" : "null") + ',' + x + ',' + (data != null ? "{...}" : "null") + ',' + unused + ',' + y + ')');
		}
	}

	static ke a (boolean flag, int archiveId, int unused, boolean flag2, boolean flag3) {
		try {
			++int_b;
			d class_d = null;
			if (b.cacheDat2 != null) {
				class_d = new d(archiveId, b.cacheDat2, dc.cacheIDXIndices_r[archiveId], 1000000);
			}

			return new ke(class_d, ka.Tb, archiveId, flag2, flag3, flag);
		} catch (RuntimeException var7) {
			throw id.a(var7, "ba.A(" + flag + ',' + archiveId + ',' + unused + ',' + flag2 + ',' + flag3 + ')');
		}
	}

	static void a (byte unused) {
		try {
			if (g.javaVendorProperty_a.toLowerCase().contains("microsoft")) {
				qc.W[219] = 42;
				qc.W[221] = 43;
				qc.W[220] = 74;
				qc.W[192] = 58;
				qc.W[186] = 57;
				qc.W[187] = 27;
				qc.W[189] = 26;
				qc.W[188] = 71;
				qc.W[191] = 73;
				qc.W[190] = 72;
				qc.W[223] = 28;
				qc.W[222] = 59;
			} else {
				qc.W[92] = 74;
				qc.W[93] = 43;
				qc.W[45] = 26;
				qc.W[47] = 73;
				qc.W[61] = 27;
				qc.W[59] = 57;
				qc.W[44] = 71;
				if (g.setFocusTraversalKeysEnabled_p != null) {
					qc.W[192] = 28;
					qc.W[520] = 59;
					qc.W[222] = 58;
				} else {
					qc.W[222] = 59;
					qc.W[192] = 58;
				}

				qc.W[46] = 72;
				qc.W[91] = 42;
			}
			++int_e;
		} catch (RuntimeException var3) {
			throw id.a(var3, "ba.B(" + unused + ')');
		}
	}

	public static void b (byte unused) {
		try {
			mapdots = null;
			errorLoadingYourProfile2 = null;
			rds_o = null;
			rd_g = null;
			ints_r = null;
			pleaseCloseTheInterfaceBeforeUsingReportAbuse = null;
			oa_h = null;
			rd_n = null;
			errorLoadingYourProfile = null;
			rd_k = null;
			pleaseCloseTheInterfaceBeforeUsingReportAbuse2 = null;
			rd_q = null;
			rd_m = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "ba.D(" + unused + ')');
		}
	}

	static void a (int i, int i1, int unused, int fileId) {
		try {
			++int_s;
			nd class_nd = o.a((byte) -115, fileId, i1);
			if (class_nd != null && class_nd.hc != null) {
				m.a(class_nd.hc, 0, 0, 0, 107, null, class_nd);
			}

			lc.j = i1;
			tc.K = true;
			d.int_g = i;
			vc.C = fileId;
		} catch (RuntimeException var5) {
			throw id.a(var5, "ba.E(" + i + ',' + i1 + ',' + unused + ',' + fileId + ')');
		}
	}
}
