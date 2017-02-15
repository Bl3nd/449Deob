final class ra {
	static rd loadingSprites2;
	static rd b = md.a((String) " )2> @whi@", (byte) 127);
	static pb archiveFile8;
	static int e;
	static int[] f;
	static dd h;
	static rd noReplyFromLoginserver_pleaseWait1MinuteAndTryAgain;
	static rd l = md.a((String) "Bitte versuchen Sie)1", (byte) 124);
	static rd theServerIsBeingUpdated_pleaseWait1MinuteAndTryAgain;
	static int[] q;
	static rd pleaseWait5MinutesBeforeTryingAgain2;
	static rd t;
	static int u;
	static rd l_;
	static md x;
	static rd cyanText;
	private static rd loadingSprites = md.a((String) "Loading sprites )2 ", (byte) 124);
	private static rd pleaseWait1MinuteAndTryAgain;
	private static rd pleaseWait5MinutesBeforeTryingAgain;

	static {
		loadingSprites2 = loadingSprites;
		pleaseWait1MinuteAndTryAgain = md.a("Please wait 1 minute and try again)3", (byte) 121);
		theServerIsBeingUpdated_pleaseWait1MinuteAndTryAgain = pleaseWait1MinuteAndTryAgain;
		pleaseWait5MinutesBeforeTryingAgain = md.a("Please wait 5 minutes before trying again)3", (byte) 127);
		pleaseWait5MinutesBeforeTryingAgain2 = pleaseWait5MinutesBeforeTryingAgain;
		noReplyFromLoginserver_pleaseWait1MinuteAndTryAgain = pleaseWait1MinuteAndTryAgain;
		t = md.a("da dieser Computer gegen unsere ", (byte) 127);
		l_ = md.a("l", (byte) 122);
		h = new dd(50);
		cyanText = md.a("@cya@", (byte) 124);
		x = new md();
	}

	int d;
	int k;
	ha n;
	int p;
	int int_s;
	int v;

	static void a (int var0) {
		int var2 = client.int_tb;

		try {
			ff.redrawSidePanel = true;
			++u;
			if (var0 != 9236) {
				a((byte) 107);
			}

			label39:
			{
				ab.a(false);
				boolean var1;
				if (~ta.Yb == 0) {
					if (ta.Zb[pd.g] == -1) {
						break label39;
					}

					var1 = wd.a(0, 261, 190, 0, false, 1, ta.Zb[pd.g]);
					if (var1) {
						break label39;
					}

					db.F = true;
					if (var2 == 0) {
						break label39;
					}
				}

				var1 = wd.a(0, 261, 190, 0, false, 1, ta.Yb);
				if (!var1) {
					db.F = true;
				}
			}

			if (s.ub && bf.int_d == 1) {
				label28:
				{
					if (~gd.languageId_int_a == -2) {
						wa.f(190);
						if (var2 == 0) {
							break label28;
						}
					}

					db.f(var0 ^ -9235);
				}
			}

			theServerIsBeingUpdated_pleaseWait1MinuteAndTryAgain.b((byte) -7);
		} catch (RuntimeException var3) {
			throw id.a(var3, "ra.A(" + var0 + ')');
		}
	}

	public static void a (byte var0) {
		try {
			f = null;
			pleaseWait1MinuteAndTryAgain = null;
			if (var0 < -41) {
				l_ = null;
				q = null;
				l = null;
				theServerIsBeingUpdated_pleaseWait1MinuteAndTryAgain = null;
				pleaseWait5MinutesBeforeTryingAgain2 = null;
				h = null;
				t = null;
				b = null;
				noReplyFromLoginserver_pleaseWait1MinuteAndTryAgain = null;
				x = null;
				cyanText = null;
				loadingSprites2 = null;
				loadingSprites = null;
				archiveFile8 = null;
				pleaseWait5MinutesBeforeTryingAgain = null;
			}
		} catch (RuntimeException var2) {
			throw id.a(var2, "ra.B(" + var0 + ')');
		}
	}
}
