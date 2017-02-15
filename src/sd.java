final class sd extends je {
	static rd loadedConfig2;
	static byte encryption = 0;
	static int[] E = new int[100];
	static int G;
	static rd hiddenUse = md.a((String) "Hidden)2use", (byte) 125);
	static int I;
	static rd loginServerOffline_unableToConnect;
	static jd L;
	static int M;
	static int O = 0;
	static rd P = null;
	static pb archiveFile0;
	static int S;
	static kc[] U = new kc[4];
	static id[] X = new id[2048];
	static rd badSessionId_unableToConnect;
	static pb archiveFile2;
	static int[] bb;
	static rd unexpectedLoginserverResponse2;
	static int eb;
	private static rd loadedConfig = md.a((String) "Loaded config", (byte) 123);
	private static rd unexpectedLoginserverResponse = md.a((String) "Unexpected loginserver response)3", (byte) 124);
	private static rd unableToConnect;

	static {
		unexpectedLoginserverResponse2 = unexpectedLoginserverResponse;
		unableToConnect = md.a("Unable to connect)3", (byte) 126);
		loadedConfig2 = loadedConfig;
		badSessionId_unableToConnect = unableToConnect;
		loginServerOffline_unableToConnect = unableToConnect;
	}

	int z;
	int F;
	ma[] J;
	int[] N;
	int[] R;
	ma[] T;
	int[] V;
	byte[][][] Z;

	public static void a (byte var0) {
		try {
			bb = null;
			E = null;
			hiddenUse = null;
			loadedConfig = null;
			unexpectedLoginserverResponse2 = null;
			archiveFile0 = null;
			badSessionId_unableToConnect = null;
			unableToConnect = null;
			loginServerOffline_unableToConnect = null;
			P = null;
			loadedConfig2 = null;
			unexpectedLoginserverResponse = null;
			U = null;
			if (var0 > -24) {
				archiveFile2 = null;
			}

			X = null;
			L = null;
			archiveFile2 = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "sd.A(" + var0 + ')');
		}
	}

	static void a (int i, int unused) {
		try {
			wb.a(0, 1, null, i, false);
			++M;
		} catch (RuntimeException var3) {
			throw id.a(var3, "sd.B(" + i + ',' + unused + ')');
		}
	}

	static int b (int val1, int val2) {
		try {
			return val1 ^ val2;
		} catch (RuntimeException var3) {
			throw id.a(var3, "sd.C(" + val1 + ',' + val2 + ')');
		}
	}
}
