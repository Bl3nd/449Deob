import java.awt.Component;

final class oe extends fa {
	private static ed J;

	oe (g var1) {
		J = var1.a((byte) 114);
	}

	public static void f () {
		J = null;
	}

	final void c () {
		J.a(true);
	}

	final int dataAvailable () {
		return J.a((byte) 115);
	}

	final void write () {
		J.a(fa.A);
	}

	final void a (int bufferSize) throws Exception {
		J.a(8275, bufferSize);
	}

	final void a (Component component, int sampleRate, boolean unused) throws Exception {
		J.a(component, unused, (byte) 116, sampleRate);
	}
}
