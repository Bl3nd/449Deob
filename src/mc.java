abstract class mc extends je {
	de z;
	int A;
	mc B;
	volatile boolean C = true;

	abstract void a (int[] data, int i, int len);

	abstract int a ();

	abstract mc b ();

	abstract void e (int var1);

	final void b (int[] data, int i, int len) {
		if (this.C) {
			this.a(data, i, len);
		} else {
			this.e(len);
		}
	}

	int c () {
		return 255;
	}

	abstract mc d ();
}
