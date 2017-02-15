abstract class bf {
	static int int_a;
	static int int_b = 2301979;
	static int int_c;
	static int int_d;
	static rd asItWasUsedToBreakOurRules2;
	static rd qa_op_test = md.a((String) "::qa_op_test", (byte) 127);
	static int int_g = 0;
	static boolean boolean_h = false;
	static int int_j = 500;
	static nd[] nds_k;
	static int int_l = 0;
	static int int_m;
	static int int_n;
	private static rd asItWasUsedToBreakOurRules = md.a((String) "as it was used to break our rules)3", (byte) 119);

	static {
		asItWasUsedToBreakOurRules2 = asItWasUsedToBreakOurRules;
		int_m = -1;
	}

	static rd a (int percentage, int unused) {
		try {
			++int_n;
			return ub.a(false, percentage, 10, (byte) -124);
		} catch (RuntimeException var3) {
			throw id.a(var3, "bf.E(" + percentage + ',' + unused + ')');
		}
	}

	public static void a (byte unused) {
		try {
			asItWasUsedToBreakOurRules2 = null;
			nds_k = null;
			asItWasUsedToBreakOurRules = null;
			qa_op_test = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "bf.C(" + unused + ')');
		}
	}

	static nd b (int unused, int fileId) {
		try {
			++int_c;
			int cacheId = fileId >> 16;
			if (ld.c[cacheId] == null || ld.c[cacheId][fileId] == null) {
				boolean flag = a.a(0, cacheId);
				if (!flag) {
					return null;
				}
			}

			return ld.c[cacheId][fileId];
		} catch (RuntimeException var5) {
			throw id.a(var5, "bf.D(" + unused + ',' + fileId + ')');
		}
	}

	@SuppressWarnings("SameParameterValue")
	abstract void put (int unused, byte[] buffer);

	abstract byte[] get (byte unused);
}
