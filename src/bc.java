import java.awt.event.KeyEvent;

final class bc {
	static rd[] rds_a;
	static int[] ints_c;
	static int d;
	static int[] e;
	static rd thisWorldIsRunningAClosedBeta2;
	static int[] i;
	static int j = 50;
	static boolean k = false;
	static int l;
	static int p;
	static jd q;
	static int[] r;
	static eb t;
	static int u;
	static int[] v;
	static int w;
	static int x;
	static int y;
	static int z;
	static int[] A;
	static int D;
	static rd enterAmount_2;
	static int[] G;
	static ee H;
	private static rd thisWorldIsRunningAClosedBeta;
	private static rd enterAmount_;

	static {
		ints_c = new int[j];
		r = new int[j];
		i = new int[j];
		thisWorldIsRunningAClosedBeta = md.a("This world is running a closed Beta)3", (byte) 117);
		enterAmount_ = md.a("Enter amount:", (byte) 115);
		rds_a = new rd[j];
		e = new int[j];
		A = new int[j];
		thisWorldIsRunningAClosedBeta2 = thisWorldIsRunningAClosedBeta;
		y = 0;
		v = new int[j];
		enterAmount_2 = enterAmount_;
		G = new int[j];
	}

	int int_b = 0;
	int f;
	int h;
	ha m;
	int n = 0;
	int B;
	int C;
	int F;

	@SuppressWarnings("SameParameterValue")
	static int getKeyChar (KeyEvent keyEvent, int unused) {
		try {
			++D;
			int keyChar = keyEvent.getKeyChar();
			if (keyChar <= 0 || keyChar >= 256) {
				keyChar = -1;
			}

			return keyChar;
		} catch (RuntimeException var3) {
			throw id.a(var3, "bc.C(" + (keyEvent != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}

	public static void a (byte unused) {
		try {
			i = null;
			thisWorldIsRunningAClosedBeta = null;
			enterAmount_ = null;
			r = null;
			v = null;
			rds_a = null;
			thisWorldIsRunningAClosedBeta2 = null;
			G = null;
			q = null;
			e = null;
			A = null;
			ints_c = null;
			enterAmount_2 = null;
			H = null;
			t = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "bc.B(" + unused + ')');
		}
	}

	static void exit (byte unused) {
		try {
			++x;
			System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
			System.exit(1);
		} catch (RuntimeException var2) {
			throw id.a(var2, "bc.A(" + unused + ')');
		}
	}
}
