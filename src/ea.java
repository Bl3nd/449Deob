final class ea extends q implements Runnable {
	private static hd M;
	private static boolean N;
	private static sc O = new sc();
	private static int[] P = new int[256];
	private static int timeStamp;
	private static boolean R;
	private static int S;

	ea (g class_g, hd class_hd) {
		M = class_hd;
		M.a((byte) 120);
		M.a(127);
		this.a(-17, (long) timeStamp);
		M.a(P, S);
		S = 0;
		class_g.a(10, (byte) -103, this);
	}

	@SuppressWarnings({"SameParameterValue", "unused"})
	private static void b (boolean unused) {
		if (S > 0) {
			M.a(P, S);
			S = 0;
		}
	}

	@SuppressWarnings("unused")
	private static void a (byte unused, int data2, int timeStamp, int data1, int status) {
		if (S >= P.length) {
			M.a(P, S);
			S = 0;
		}

		P[S++] = -ea.timeStamp + timeStamp;
		ea.timeStamp = timeStamp;
		P[S++] = fb.b(data2 << 16, fb.b(status, data1 << 8));
	}

	final synchronized void a (int unused, int i) {
		this.a(i, (long) timeStamp, false);
		M.a(P, S);
		S = 0;
	}

	public final void run () {
		try {
			while (true) {
				synchronized (this) {
					if (!N) {
						this.c(15299);
					} else {
						N = false;
						return;
					}
				}

				wa.sleep(17525, 100L);
			}
		} catch (Exception e) {
			se.a((byte) 96, e, null);
		}
	}

	final synchronized void c (int unused) {
		if (O.g()) {
			long l = (long) (timeStamp + 200 + -M.c(2149)) * (long) (O.f * 1000);
			while (true) {
				int size = O.e();
				int i1 = O.d[size];
				long l1 = O.a(i1);
				if (l < l1) {
					b(false);
					return;
				}

				while (i1 == O.d[size]) {
					O.b(size);
					this.a(l1, (byte) -35, size);
					if (O.f()) {
						O.d(size);
						if (O.c()) {
							if (!R) {
								this.a(-17, (long) ((int) (l1 / (long) (O.f * 1000))));
								O.a();
								b(false);
								return;
							}

							O.a(l1);
						}
						break;
					}

					O.c(size);
					O.d(size);
				}
			}
		}
	}

	final synchronized void silence (byte unused) {
		M.a(127);
		this.a(-17, (long) timeStamp);
		M.a(P, S);
		S = 0;
		O.a();
	}

	final synchronized void a (boolean loopInfinite, int i, byte unused, byte[] buffer) {
		O.a(buffer);
		timeStamp = 0;
		boolean flag = true;
		R = loopInfinite;
		M.a(125);
		this.a((long) timeStamp, (byte) -8, i, 0);
		int length = O.h();
		int size = 0;
		while (length > size) {
			O.b(size);
			while (true) {
				if (!O.f()) {
					O.c(size);
					if (O.d[size] == 0) {
						this.a(0L, (byte) -35, size);
						continue;
					}

					flag = false;
				}

				O.d(size);
				++size;
				break;
			}
		}

		if (flag) {
			if (R) {
				throw new RuntimeException();
			}

			this.a(-17, (long) timeStamp);
			O.a();
		}

		b(false);
	}

	final synchronized void a (int i, int i1, int unused) {
		this.a((long) timeStamp, (byte) -8, i1, i);
	}

	final void e (int unused) {
		synchronized (this) {
			N = true;
		}

		while (true) {
			synchronized (this) {
				if (!N) {
					break;
				}
			}

			wa.sleep(17525, 20L);
		}

		M.b(-29032);
	}

	@SuppressWarnings("unused")
	private void a (long l, byte unused, int size) {
		int i = O.f(size);
		if (i != 1) {
			if ((128 & i) != 0) {
				int timeStamp = (int) (l / (long) (O.f * 1000));
				int data1 = (i & 'ﾮ') >> 8;
				int status = 255 & i;
				int data2 = (16712891 & i) >> 16;
				if (!this.b(status, data1, data2, (long) timeStamp)) {
					a((byte) -33, data2, timeStamp, data1, status);
				}
			}
		} else {
			O.b();
		}
	}

	final void send (int status, int data1, int data2, long timeStamp) {
		a((byte) -33, data2, (int) timeStamp, data1, status);
	}
}
