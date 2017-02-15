import java.awt.Component;
import java.util.zip.CRC32;

final class wc {
	static pb archiveFile2;
	static jd b;
	static rd c = md.a((String) "Schrifts-=tze geladen)3", (byte) 118);
	static int d;
	static int gameFPS = 0;
	static int f;
	static CRC32 crc32 = new CRC32();
	static rd redstone2 = md.a((String) "redstone2", (byte) 126);
	static int i;
	static rd j = md.a((String) "Bitte versuchen Sie es in ", (byte) 127);
	static int k;
	static int l;
	static rd m = md.a((String) "Benutzername: ", (byte) 122);
	static int n;
	static int[] o = new int[50];

	static void a (int unused, Component component) {
		try {
			++i;
			component.addMouseListener(ja.fc_a);
			component.addMouseMotionListener(ja.fc_a);
			component.addFocusListener(ja.fc_a);
		} catch (RuntimeException var3) {
			throw id.a(var3, "wc.B(" + unused + ',' + (component != null ? "{...}" : "null") + ')');
		}
	}

	public static void a (boolean var0) {
		try {
			archiveFile2 = null;
			o = null;
			m = null;
			if (!var0) {
				m = null;
			}

			b = null;
			redstone2 = null;
			crc32 = null;
			c = null;
			j = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "wc.A(" + var0 + ')');
		}
	}
}
