import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

final class qc extends jd implements ImageProducer, ImageObserver {
	static volatile int mouseY = -1;
	static int int_w;
	static int x;
	static int y;
	static int z;
	static int A;
	static int B;
	static rd C = md.a((String) "60 Sekunden noch einmal)3)3)3", (byte) 120);
	static int D;
	static int F;
	static int G;
	static int H;
	static int I;
	static dd J = new dd(30);
	static int K;
	static int L;
	static rd walkHere2;
	static rd N;
	static int O;
	static int P;
	static int Q = -1;
	static rd S = md.a((String) "Offline", (byte) 115);
	static rd T;
	static rd redstone3;
	static boolean V = false;
	static int[] W = new int[]{
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			85,
			80,
			84,
			-1,
			91,
			-1,
			-1,
			-1,
			81,
			82,
			86,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			0,
			-1,
			-1,
			-1,
			-1,
			83,
			104,
			105,
			103,
			102,
			96,
			98,
			97,
			99,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			25,
			16,
			17,
			18,
			19,
			20,
			21,
			22,
			23,
			24,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			48,
			68,
			66,
			50,
			34,
			51,
			52,
			53,
			39,
			54,
			55,
			56,
			70,
			69,
			40,
			41,
			32,
			35,
			49,
			36,
			38,
			67,
			33,
			65,
			37,
			64,
			-1,
			-1,
			-1,
			-1,
			-1,
			228,
			231,
			227,
			233,
			224,
			219,
			225,
			230,
			226,
			232,
			89,
			87,
			-1,
			88,
			229,
			90,
			1,
			2,
			3,
			4,
			5,
			6,
			7,
			8,
			9,
			10,
			11,
			12,
			-1,
			-1,
			-1,
			101,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			100,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1,
			-1
	};
	private static rd walkHere = md.a((String) "Walk here", (byte) 115);
	private static rd X = md.a((String) "level)2", (byte) 118);

	static {
		walkHere2 = walkHere;
		T = X;
		O = 0;
		N = md.a("Unerwartete Antwort vom Anmelde)2Server)3", (byte) 118);
		redstone3 = md.a("redstone3", (byte) 114);
	}

	private ImageConsumer imageConsumer;
	private ColorModel colorModel;

	public static void c (byte var0) {
		try {
			N = null;
			walkHere = null;
			S = null;
			walkHere2 = null;
			C = null;
			int var1 = 118 % ((var0 - 30) / 35);
			J = null;
			W = null;
			T = null;
			X = null;
			redstone3 = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "qc.F(" + var0 + ')');
		}
	}

	static va c (int unused) {
		try {
			++H;

			try {
				return (va) Class.forName("oc").newInstance();
			} catch (Throwable throwable) {
				return null;
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "qc.G(" + unused + ')');
		}
	}

	static void a (boolean unused) {
		try {
			h.df_s.int_s = 0;
			ha.boolean_cb = true;
			++x;
			id.F = 0L;
			y = 0;
			o.a = 0;
			id.Gb = 0;
			r.int_p = 0;
			wc.k = 0;
			jc.O = 0;
			client.int_db = 0;
			client.int_bb = 0;
			pd.F = 0;
			wd.u = 0;
			ja.int_i = 0;
			r.J = 0;
			ff.I = 0;
			sd.S = 0;
			db.D = 0;
			rd.Z = 0;
			nc.z = 0;
			h.x = 0;
			e.int_ub = 0;
			rb.c = 0;
			o.j = 0;
			ce.int_h = 0;
			id.S = 0;
			bb.int_s = 0;
			l.E = 0;
			eb.int_u = 0;
			kd.int_l = 0;
			id.sb = 0;
			md.m = 0;
			ie.i = 0;
			qb.int_db = 0;
			pb.int_o = 0;
			le.bb = 0;
			ub.F = 0;
			bd.int_mb = 0;
			tc.F = 0;
			ec.int_b = 0;
			j.qb = 0;
			rd.K = 0;
			pb.W = 0;
			ca.int_n = 0;
			w.v = 0;
			bb.int_u = 0;
			pb.V = 0;
			uc.dc = 0;
			rd.P = 0;
			kb.q = 0;
			fb.int_d = 0;
			id.int_kb = 0;
			fc.int_c = 0;
			tb.Z = 0;
			ld.b = 0;
			ub.M = 0;
			client.int_mb = 0;
			hc.Ob = 0;
			td.Ed = 0;
			jb.E = 0;
			ee.int_i = 0;
			te.Nb = 0;
			fc.int_d = 0;
			ib.c = 0;
			cf.int_e = 0;
			ta.int_vb = 0;
			id.I = 0;
			dd.int_t = 0;
			cf.int_p = 0;
			ja.int_j = 0;
			j.int_wb = 0;
			eb.int_d = 0;
			je.int_c = 0;
			sa.int_db = 0;
			pb.Y = 0;
			rd.k = 0;
			d.y = 0;
			nc.s = 0;
			kd.int_s = 0;
			bd.int_pb = 0;
			ff.int_l = 0;
			bb.A = 0;
			ld.l = 0;
			kd.k = 0;
			ad.int_m = 0;
			i.P = 0;
			id.A = 0;
			dc.int_s = 0;
			id.vb = 0;
			fb.int_f = 0;
			cf.int_t = 0;
			db.K = 0;
			f.int_nc = 0;
			ke.Ab = 0;
			dc.int_p = 0;
			be.int_p = 0;
			i.T = 0;
			nd.Xb = 0;
			bb.int_a = 0;
			bc.d = 0;
			z = 0;
			o.b = 0;
			nd.nb = 0;
			e.int_qb = 0;
			w.b = 0;
			r.int_f = 0;
			id.yb = 0;
			je.int_d = 0;
			dc.int_j = 0;
			ba.int_b = 0;
			ka.rb = 0;
			bb.int_q = 0;
			sa.fb = 0;
			id.Ob = 0;
			rd.int_r = 0;
			le.jb = 0;
			ee.int_b = 0;
			id.Y = 0;
			P = 0;
			md.f = 0;
			w.int_q = 0;
			bd.int_rb = 0;
			d.int_p = 0;
			bc.l = 0;
			ta.Gb = 0;
			se.y = 0;
			B = 0;
			ad.int_j = 0;
			ub.H = 0;
			bd.Ib = 0;
			td.int_ld = 0;
			tb.fb = 0;
			a.int_db = 0;
			hb.int_h = 0;
			id.bb = 0;
			fb.int_l = 0;
			d.int_m = 0;
			wd.l = 0;
			ee.int_p = 0;
			t.j = 0;
			wd.d = 0;
			kb.g = 0;
			md.h = 0;
			ke.db = 0;
			e.Pb = 0;
			hf.qb = 0;
			df.int_l = 0;
			backvmid3.stringPointer = 0;
			qe.r = 0;
			te.Gb = 0;
			l.C = 0;
			uc.mc = 0;
			lc.h = 0;
			j.fb = 0;
			hc.ac = 0;
			pc.int_j = 0;
			p.K = 0;
			od.zb = 0;
			pc.F = 0;
			client.int_eb = 0;
			pb.Z = 0;
			pb.int_a = 0;
			ha.int_kb = 0;
			nd.wb = 0;
			rd.z = 0;
			r.int_a = 0;
			a.int_cb = 0;
			ca.int_h = 0;
			ee.y = 0;
			sa.Ib = 0;
			nb.l = 0;
			ta.int_sb = 0;
			ld.d = 0;
			bf.int_c = 0;
			mb.l = 0;
			sa.int_nb = 0;
			bc.D = 0;
			m.int_i = 0;
			x = 0;
			ie.e = 0;
			ec.int_a = 0;
			dc.int_f = 0;
			r.int_e = 0;
			td.Ad = 0;
			td.hd = 0;
			wd.x = 0;
			bd.int_qb = 0;
			md.q = 0;
			wb.cb = 0;
			eb.int_p = 0;
			se.l = 0;
			r.E = 0;
			pb.N = 0;
			pb.c = 0;
			dd.int_n = 0;
			jb.C = 0;
			gf.int_k = 0;
			db.int_cb = 0;
			o.x = 0;
			ld.i = 0;
			nd.int_ad = 0;
			jc.H = 0;
			hf.nb = 0;
			w.c = 0;
			L = 0;
			qb.gb = 0;
			id.lb = 0;
			ke.Fb = 0;
			ge.D = 0;
			eb.int_t = 0;
			ab.int_b = 0;
			ge.J = 0;
			tb.int_hb = 0;
			pb.x = 0;
			pb.g = 0;
			client.int_rb = 0;
			mb.B = 0;
			u.int_rb = 0;
			f.int_rb = 0;
			id.Qb = 0;
			ke.Lb = 0;
			id.Z = 0;
			ud.A = 0;
			qb.Z = 0;
			bd.int_fb = 0;
			rd.V = 0;
			ee.int_a = 0;
			dd.int_d = 0;
			fb.int_b = 0;
			rd.a = 0;
			id.T = 0;
			t.l = 0;
			ta.Hb = 0;
			qb.eb = 0;
			j.int_tb = 0;
			H = 0;
			hc.lb = 0;
			ge.M = 0;
			t.i = 0;
			id.C = 0;
			od.tb = 0;
			rd.Q = 0;
			uc.rc = 0;
			bb.int_v = 0;
			gf.int_h = 0;
			we.v = 0;
			pd.W = 0;
			d.int_v = 0;
			lc.b = 0;
			pc.q = 0;
			e.Hb = 0;
			id.zb = 0;
			ec.int_h = 0;
			ba.int_i = 0;
			wd.o = 0;
			e.Lb = 0;
			id.E = 0;
			pc.int_v = 0;
			af.int_l = 0;
			d.int_w = 0;
			rd.S = 0;
			client.int_hb = 0;
			b.int_jd = 0;
			lc.e = 0;
			id.Nb = 0;
			pa.k = 0;
			fc.int_e = 0;
			pe.e = 0;
			ld.int_f = 0;
			rd.h = 0;
			pd.int_u = 0;
			rd.j = 0;
			ke.sb = 0;
			rd.G = 0;
			wc.i = 0;
			rd.D = 0;
			db.B = 0;
			id.ab = 0;
			rd.m = 0;
			id.tb = 0;
			jc.E = 0;
			bd.zb = 0;
			n.lb = 0;
			rd.s = 0;
			me.B = 0;
			id.G = 0;
			client.int_pb = 0;
			r.O = 0;
			bd.Kb = 0;
			ff.y = 0;
			se.t = 0;
			r.P = 0;
			ke.lb = 0;
			le.int_kb = 0;
			nc.v = 0;
			cc.int_e = 0;
			va.a = 0;
			rd.M = 0;
			ba.int_t = 0;
			rd.q = 0;
			r.I = 0;
			jb.z = 0;
			jd.int_p = 0;
			b.Yc = 0;
			id.K = 0;
			bf.int_n = 0;
			hc.ub = 0;
			wa.bb = 0;
			h.int_o = 0;
			e.Kb = 0;
			jd.k = 0;
			qb.cb = 0;
			d.int_h = 0;
			gf.int_a = 0;
			ff.E = 0;
			vc.O = 0;
			id.P = 0;
			ca.int_a = 0;
			id.qb = 0;
			rd.c = 0;
			r.int_i = 0;
			rd.L = 0;
			jd.int_a = 0;
			ja.int_c = 0;
			tc.M = 0;
			db.int_gb = 0;
			we.p = 0;
			md.n = 0;
			u.bb = 0;
			ta.int_rb = 0;
			client.int_nb = 0;
			l.int_w = 0;
			be.int_b = 0;
			db.P = 0;
			f.Ub = 0;
			hc.gc = 0;
			je.int_j = 0;
			db.R = 0;
			t.s = 0;
			dd.int_p = 0;
			pd.C = 0;
			s.pb = 0;
			db.y = 0;
			rd.bb = 0;
			kd.int_b = 0;
			nd.mc = 0;
			ff.int_g = 0;
			eb.int_q = 0;
			sb.int_p = 0;
			h.int_t = 0;
			w.int_p = 0;
			sb.int_l = 0;
			df.int_p = 0;
			h.int_b = 0;
			e.int_lb = 0;
			f.Bc = 0;
			hc.pb = 0;
			id.xb = 0;
			rd.O = 0;
			rd.Y = 0;
			a.bb = 0;
			bd.int_cb = 0;
			kb.d = 0;
			af.int_k = 0;
			rd.int_n = 0;
			h.int_k = 0;
			q.I = 0;
			client.int_cb = 0;
			nd.qb = 0;
			wa.int_jb = 0;
			o.k = 0;
			rd.e = 0;
			mb.q = 0;
			sa.sb = 0;
			df.int_k = 0;
			md.int_s = 0;
			ke.Rb = 0;
			vc.D = 0;
			pc.A = 0;
			rd.t = 0;
			td.vd = 0;
			la.r = 0;
			bd.int_ub = 0;
			wb.int_qb = 0;
			pb.F = 0;
			ff.H = 0;
			ie.f = 0;
			ud.B = 0;
			u.lb = 0;
			t.t = 0;
			r.int_g = 0;
			ba.int_s = 0;
			r.int_r = 0;
			id.Ab = 0;
			be.int_a = 0;
			ke.fb = 0;
			p.I = 0;
			pc.int_w = 0;
			w.u = 0;
			q.F = 0;
			hf.hb = 0;
			je.int_o = 0;
			pc.c = 0;
			ja.int_b = 0;
			I = 0;
			eb.int_e = 0;
			rd.y = 0;
			ld.k = 0;
			uc.Zb = 0;
			cf.int_b = 0;
			wd.f = 0;
			id.int_wb = 0;
			d.int_q = 0;
			nc.r = 0;
			ge.A = 0;
			td.ad = 0;
			ke.vb = 0;
			pb.int_b = 0;
			ib.g = 0;
			j.rb = 0;
			ec.int_e = 0;
			h.int_a = 0;
			id.ib = 0;
			e.Ab = 0;
			gd.int_b = 0;
			d.int_u = 0;
			pb.M = 0;
			md.g = 0;
			id.ub = 0;
			rd.E = 0;
			ud.H = 0;
			nd.tc = 0;
			rd.w = 0;
			pb.i = 0;
			dd.int_o = 0;
			nc.d = 0;
			d.int_t = 0;
			bd.Nb = 0;
			qe.g = 0;
			va.b = 0;
			fb.int_k = 0;
			o.c = 0;
			wa.int_db = 0;
			ab.int_n = 0;
			r.C = 0;
			ee.int_e = 0;
			jd.int_d = 0;
			te.xb = 0;
			se.int_s = 0;
			pb.K = 0;
			td.Fd = 0;
			ke.rb = 0;
			df.int_a = 0;
			q.z = 0;
			hb.int_g = 0;
			hf.mb = 0;
			K = 0;
			hc.hb = 0;
			le.Z = 0;
			pe.f = 0;
			md.k = 0;
			tb.Lb = 0;
			lc.o = 0;
			ge.T = 0;
			rd.X = 0;
			ff.int_j = 0;
			sd.eb = 0;
			df.int_h = 0;
			db.U = 0;
			t.m = 0;
			nc.k = 0;
			te.Pb = 0;
			dc.B = 0;
			uc.tc = 0;
			nd.fc = 0;
			kb.l = 0;
			bd.int_ob = 0;
			pb.int_m = 0;
			wa.gb = 0;
			ab.int_m = 0;
			m.int_j = 0;
			kb.a = 0;
			r.int_l = 0;
			uc.xc = 0;
			ce.int_e = 0;
			me.F = 0;
			rd.H = 0;
			q.int_w = 0;
			r.int_w = 0;
			id.ob = 0;
			ke.int_eb = 0;
			bb.int_c = 0;
			nb.f = 0;
			cc.int_c = 0;
			nd.int_lc = 0;
			s.ib = 0;
			jb.H = 0;
			wd.k = 0;
			f.int_ec = 0;
			kd.p = 0;
			nc.o = 0;
			wb.ib = 0;
			id.D = 0;
			va.int_f = 0;
			mb.h = 0;
			int_w = 0;
			be.int_n = 0;
			r.int_m = 0;
			ld.m = 0;
			ee.int_g = 0;
			hf.Db = 0;
			va.c = 0;
			nc.D = 0;
			dc.int_n = 0;
			ba.int_e = 0;
			r.y = 0;
			dd.x = 0;
			bd.int_jb = 0;
			la.m = 0;
			bc.u = 0;
			ha.int_eb = 0;
			se.v = 0;
			wd.z = 0;
			nd.lb = 0;
			be.int_q = 0;
			o.s = 0;
			ge.E = 0;
			id.Hb = 0;
			ld.n = 0;
			s.int_nb = 0;
			w.d = 0;
			i.E = 0;
			bb.int_d = 0;
			pc.int_t = 0;
			bb.int_r = 0;
			q.x = 0;
			sa.ab = 0;
			n.fb = 0;
			ka.Pb = 0;
			ff.int_c = 0;
			e.int_eb = 0;
			dd.y = 0;
			D = 0;
			rb.s = 0;
			bd.Ab = 0;
			id.Bb = 0;
			cc.int_b = 0;
			db.int_eb = 0;
			t.k = 0;
			id.X = 0;
			kd.n = 0;
			o.l = 0;
			nc.c = 0;
			pb.int_u = 0;
			ff.A = 0;
			nd.Zb = 0;
			id.R = 0;
			a.int_eb = 0;
			pd.P = 0;
			qb.qb = 0;
			wa.zb = 0;
			rd.W = 0;
			f.Yb = 0;
			t.v = 0;
			ca.int_m = 0;
			db.O = 0;
			a.Z = 0;
			wa.sb = 0;
			o.t = 0;
			mb.s = 0;
			te.Mb = 0;
			o.p = 0;
			o.n = 0;
			cf.int_a = 0;
			ke.int_ib = 0;
			se.f = 0;
			le.gb = 0;
			id.Cb = 0;
			we.h = 0;
			uc.bc = 0;
			tb.Sb = 0;
			pa.int_o = 0;
			o.m = 0;
			w.o = 0;
			nc.int_i = 0;
			r.int_c = 0;
			qb.int_jb = 0;
			fc.int_b = 0;
			be.int_g = 0;
			qe.k = 0;
			w.n = 0;
			id.B = 0;
			ab.int_f = 0;
			nc.b = 0;
			cf.int_l = 0;
			uc.Yb = 0;
			pc.h = 0;
			ud.E = 0;
			rb.h = 0;
			mb.int_a = 0;
			jd.int_q = 0;
			nc.f = 0;
			q.B = 0;
			ja.int_f = 0;
			pe.c = 0;
			fb.int_q = 0;
			e.Fb = 0;
			ec.int_d = 0;
			rd.u = 0;
			jd.int_o = 0;
			t.o = 0;
			wb.lb = 0;
			id.int_jb = 0;
			n.Z = 0;
			hf.ib = 0;
			j.kb = 0;
			af.int_n = 0;
			client.int_lb = 0;
			pc.D = 0;
			id.Sb = 0;
			hf.int_rb = 0;
			me.T = 0;
			u.xb = 0;
			r.int_b = 0;
			dd.int_s = 0;
			id.J = 0;
			nb.h = 0;
			w.i = 0;
			id.O = 0;
			wd.r = 0;
			id.Eb = 0;
			tb.Rb = 0;
			md.d = 0;
			rd.U = 0;
			ha.int_bb = 0;
			id.Db = 0;
			r.Q = 0;
			r.int_v = 0;
			bc.p = 0;
			pb.int_j = 0;
			pd.G = 0;
			ke.Nb = 0;
			dc.int_u = 0;
			tb.ib = 0;
			te.Kb = 0;
			r.int_q = 0;
			w.g = 0;
			u.nb = 0;
			sa.yb = 0;
			client.int_sb = 0;
			pb.C = 0;
			wa.int_pb = 0;
			ad.z = 0;
			r.int_j = 0;
			r.int_h = 0;
			bf.int_a = 0;
			pb.z = 0;
			rd.o = 0;
			ha.int_hb = 0;
			id.db = 0;
			j.eb = 0;
			ib.k = 0;
			db.V = 0;
			o.e = 0;
			wd.h = 0;
			mb.z = 0;
			wa.hb = 0;
			id.Jb = 0;
			od.wb = 0;
			tb.ab = 0;
			ka.Qb = 0;
			A = 0;
			bd.Ob = 0;
			j.pb = 0;
			uc.ic = 0;
			p.H = 0;
			tb.int_wb = 0;
			rd.l = 0;
			te.Jb = 0;
			id.pb = 0;
			bd.int_nb = 0;
			df.int_c = 0;
			hc.Pb = 0;
			ie.c = 0;
			md.a = 0;
			md.i = 0;
			lc.t = 0;
			me.K = 0;
			w.l = 0;
			id.mb = 0;
			fc.int_l = 0;
			we.k = 0;
			je.int_n = 0;
			nd.Kb = 0;
			tb.ob = 0;
			pa.c = 0;
			nb.d = 0;
			h.int_f = 0;
			wd.q = 0;
			client.int_jb = 0;
			od.Cb = 0;
			sd.M = 0;
			df.int_f = 0;
			F = 0;
			dc.int_l = 0;
			ld.q = 0;
			dc.int_o = 0;
			id.Mb = 0;
			ra.u = 0;
			fc.z = 0;
			hf.int_bb = 0;
			pb.int_t = 0;
			ec.int_c = 0;
			df.int_r = 0;
			cf.int_r = 0;
			qe.C = 0;
			r.A = 0;
			n.jb = 0;
			af.int_d = 0;
			nc.h = 0;
			ka.xb = 0;
			we.w = 0;
			nc.y = 0;
			n.gb = 0;
			hf.jb = 0;
			db.Z = 0;
			ab.int_c = 0;
			s.tb = 0;
			hb.int_f = 0;
			td.int_id = 0;
			r.int_u = 0;
			hc.Db = 0;
			bb.int_w = 0;
			hf.vb = 0;
			rb.int_u = 0;
			fb.int_h = 0;
			cc.int_g = 0;
			pa.i = 0;
			fc.int_f = 0;
			wa.kb = 0;
			ge.N = 0;
			e.Jb = 0;
			la.i = 0;
			G = 0;
			nc.t = 0;
			ra.e = 0;
			od.vb = 0;
			od.Fb = 0;
			pb.T = 0;
			r.K = 0;
			kd.c = 0;
			bd.int_tb = 0;
			dd.int_h = 0;
			pd.M = 0;
			se.m = 0;
			pc.int_a = 0;
			id.Tb = 0;
			kb.o = 0;
			kb.p = 0;
			ub.z = 0;
			ff.G = 0;
			fc.int_g = 0;
			db.int_fb = 0;
			fc.int_j = 0;
			m.int_b = 0;
			uc.ec = 0;
			wd.p = 0;
			pc.z = 0;
			fc.int_a = 0;
			je.int_b = 0;
			df.int_j = 0;
			pb.p = 0;
			ke.Cb = 0;
			p.C = 0;
			gf.int_i = 0;
			kb.n = 0;
			le.int_ib = 0;
			wa.mb = 0;
			db.C = 0;
			wa.ib = 0;
			pc.int_r = 0;
			rd.int_i = 0;
			db.int_v = 0;
			sb.int_c = 0;
			r.D = 0;
			pb.k = 0;
			jd.int_g = 0;
			r.int_o = 0;
			ad.int_w = 0;
			ka.int_fc = 0;
			j.Db = 0;
			bd.int_hc = 0;
			j.mb = 0;
			f.int_ub = 0;
			ad.int_u = 0;
			id.W = 0;
			nd.vc = 0;
			gd.int_j = 0;
			md.j = 0;
			j.vb = 0;
			ca.int_q = 0;
			pb.v = 0;
			ec.int_f = 0;
			kb.m = 0;
			r.G = 0;
			md.l = 0;
			qe.d = 0;
			bc.x = 0;
			ka.bc = 0;
			client.int_gb = 0;
			pc.k = 0;
			pa.int_j = 0;
			fc.int_i = 0;
			bd.int_cc = 0;
			w.k = 0;
			ie.h = 0;
			r.L = 0;
			sb.int_j = 0;
			ta.Jb = 0;
			sd.G = 0;
			qb.bb = 0;
			wb.fb = 0;
			wd.int_b = 0;
			r.int_s = 0;
			we.u = 0;
			bc.z = 0;
			h.int_h = 0;
			df.int_t = 0;
			qb.nb = 0;
			ad.int_r = 0;
			rd.A = 0;
			pb.ab = 0;
			o.v = 0;
			r.x = 0;
			jd.int_n = 0;
			td.int_od = 0;
			l.int_s = 0;
			rd.x = 0;
			e.int_vb = 0;
			tb.Qb = 0;
			gd.int_l = 0;
			d.int_i = 0;
			id.L = 0;
			ab.int_p = 0;
			n.bb = 0;
			nc.B = 0;
			ff.int_o = 0;
			ge.O = 0;
			o.d = 0;
			pe.int_p = 0;
			ad.int_b = 0;
			rd.v = 0;
			db.int_w = 0;
			b.Zc = 0;
			s.sb = 0;
			s.hb = 0;
			sa.Hb = 0;
			dc.int_e = 0;
			r.int_t = 0;
			sa.int_pb = 0;
			r.H = 0;
			od.Eb = 0;
			cf.int_i = 0;
			dd.int_e = 0;
			rd.ab = 0;
			se.d = 0;
			ge.G = 0;
			l.int_j = 0;
			jb.G = 0;
			id.nb = 0;
			ud.K = 0;
			ka.yb = 0;
			o.B = 0;
			cf.int_s = 0;
			ca.int_i = 0;
			hc.Kb = 0;
			nd.vb = 0;
			je.int_l = 0;
			nd.Fb = 0;
			fb.int_e = 0;
			rd.g = 0;
			od.int_ub = 0;
			ha.int_ab = 0;
			ee.int_d = 0;
			q.D = 0;
			dd.int_j = 0;
			pc.int_s = 0;
			pa.b = 0;
			ee.int_s = 0;
			ld.e = 0;
			id.Pb = 0;
			hc.zb = 0;
			p.F = 0;
			we.o = 0;
			f.yc = 0;
			wa.eb = 0;
			je.int_g = 0;
			tb.lb = 0;
			sa.Cb = 0;
			id.Fb = 0;
			sa.xb = 0;
			bc.w = 0;
			be.int_r = 0;
			se.r = true;
			fb.a(20);
			e.int_mb = 0;
			nb.n = 0;
			ie.writeStream.pointer = 0;
			id.rb = 0;
			lc.readStream.pointer = 0;
			ta.Bb = -1;
			le.updateTime = 0;
			s.ub = false;
			sb.int_a = 0;
			db.H = -1;
			jd.currentIncomingPacket = -1;
			vc.I = -1;
			p.a(-108, 0);

			for (int i = 0; i < 100; i++) {
				wd.j[i] = null;
			}

			tc.K = false;
			ka.Kb = -60 + (int) (120.0D * Math.random());
			me.L = 0;
			b.int_hd = 0;
			ab.int_d = -1;
			gd.int_f = -55 + (int) (Math.random() * 110.0D);
			pb.d = 0;
			o.w = 2047 & -10 + (int) (20.0D * Math.random());
			jb.M = 0;
			lc.q = 0;
			nd.qd = -40 + (int) (Math.random() * 80.0D);
			we.f = 0;
			ub.L = (int) (Math.random() * 100.0D) + -50;
			me.lb = 0;
			gf.int_j = (int) (30.0D * Math.random()) + -20;

			for (int i = 0; i < 2048; i++) {
				f.Lc[i] = null;
				sd.X[i] = null;
			}

			for (int i = 0; i < '耀'; i++) {
				ta.Nb[i] = null;
			}

			af.td_p = f.Lc[2047] = new td();
			jc.J.a(74);
			ib.md_a.a(77);
			int height = 0;
			while (height < 4) {
				int mapX = 0;
				while (mapX < 104) {
					int mapY = 0;
					while (mapY < 104) {
						lc.s[height][mapX][mapY] = null;
						++mapY;
					}

					++mapX;
				}

				++height;
			}

			kd.j = new md();
			ke.int_mb = 0;
			u.int_eb = 0;
			int fileRequest = 0;
			if (t.q > fileRequest) {
				while (t.q > fileRequest) {
					n class_n = wa.a(fileRequest, -1);//Decode archive cache file 2
					if (class_n != null && class_n.kb == 0) {
						tc.G[fileRequest] = 0;
						ta.Pb[fileRequest] = 0;
					}

					++fileRequest;
				}
			}

			for (int index = 0; index < le.lb.length; index++) {
				le.lb[index] = -1;
			}

			int var7 = 0;
			if (var7 < ta.Zb.length) {
				do {
					if (ta.Zb[var7] != -1) {
						q.a(ta.Zb[var7], (byte) -90);
						ta.Zb[var7] = -1;
					}

					++var7;
				} while (var7 < ta.Zb.length);
			}

			q.a(b.int_ld, (byte) -90);
			b.int_ld = -1;
			q.a(ta.Sb, (byte) -90);
			ta.Sb = -1;
			q.a(sa.zb, (byte) -90);
			sa.zb = -1;
			q.a(ee.int_h, (byte) -90);
			ee.int_h = -1;
			q.a(i.R, (byte) -90);
			i.R = -1;
			q.a(ta.Yb, (byte) -90);
			ta.Yb = -1;
			q.a(kd.t, (byte) -90);
			fc.int_r = -1;
			s.ub = false;
			pd.g = 3;
			uc.Vb = 0;
			kd.t = -1;
			ce.int_l = -1;
			ad.boolean_v = false;
			id.eb = null;
			wb.int_db = 0;
			s.ob.a(false, -1, (byte) -34, new int[5], null);
			int var8 = 0;
			while (var8 < 5) {
				s.wb[var8] = null;
				tb.Pb[var8] = false;
				++var8;
			}

			sb.a(-1);
			i.z = true;
		} catch (RuntimeException var11) {
			throw id.a(var11, "qc.D(" + unused + ')');
		}
	}

	static rd a (int var0, boolean var1, int var2) {
		try {
			if (var2 != -1) {
				return null;
			} else {
				++L;
				return ub.a(true, var0, 10, (byte) -128);
			}
		} catch (RuntimeException var4) {
			throw id.a(var4, "qc.B(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}

	static boolean a (g class_g, boolean unused, boolean flag) {
		try {
			r.T = 20;
			++y;

			try {
				p.z = (sb) Class.forName("vd").newInstance();
				return true;
			} catch (Throwable var4) {
				hd class_hd = class_g.b(-71);
				if (class_hd != null) {
					p.z = new ea(class_g, class_hd);
					return true;
				} else if (flag) {
					p.z = new db(class_g);
					return true;
				} else {
					return false;
				}
			}
		} catch (RuntimeException var5) {
			throw id.a(var5, "qc.A(" + (class_g != null ? "{...}" : "null") + ',' + unused + ',' + flag + ')');
		}
	}

	public final boolean imageUpdate (Image image, int var2, int var3, int var4, int var5, int var6) {
		try {
			++K;
			return true;
		} catch (RuntimeException var8) {
			throw id.a(var8, "qc.imageUpdate(" + (image != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
		}
	}

	public final void requestTopDownLeftRightResend (ImageConsumer imageConsumer) {
		try {
			++G;
		} catch (RuntimeException var3) {
			throw id.a(var3, "qc.requestTopDownLeftRightResend(" + (imageConsumer != null ? "{...}" : "null") + ')');
		}
	}

	public final synchronized void addConsumer (ImageConsumer imageConsumer) {
		try {
			++B;
			this.imageConsumer = imageConsumer;
			imageConsumer.setDimensions(super.image_w, super.image_h);
			imageConsumer.setProperties(null);
			imageConsumer.setColorModel(this.colorModel);
			imageConsumer.setHints(14);
		} catch (RuntimeException var3) {
			throw id.a(var3, "qc.addConsumer(" + (imageConsumer != null ? "{...}" : "null") + ')');
		}
	}

	public final synchronized boolean isConsumer (ImageConsumer imageConsumer) {
		try {
			++z;
			return this.imageConsumer == imageConsumer;
		} catch (RuntimeException var3) {
			throw id.a(var3, "qc.isConsumer(" + (imageConsumer != null ? "{...}" : "null") + ')');
		}
	}

	private synchronized void b (int var1) {
		try {
			++P;
			if (this.imageConsumer != null) {
				if (var1 != 0) {
					this.startProduction(null);
				}

				this.imageConsumer.setPixels(0, 0, super.image_w, super.image_h, this.colorModel, super.imagePixels, 0, super.image_w);
				this.imageConsumer.imageComplete(2);
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "qc.E(" + var1 + ')');
		}
	}

	final void a (int width, int unused, int height, Component component) {
		try {
			super.image_w = width;
			super.imagePixels = new int[1 + width * height];
			super.image_h = height;
			++A;
			this.colorModel = new DirectColorModel(32, 16711680, '\uff00', 255);
			super.image_j = component.createImage(this);
			this.b(unused);
			component.prepareImage(super.image_j, this);
			this.b(0);
			component.prepareImage(super.image_j, this);
			this.b(unused);
			component.prepareImage(super.image_j, this);
			this.a(-1926);
		} catch (RuntimeException var6) {
			throw id.a(var6, "qc.H(" + width + ',' + unused + ',' + height + ',' + (component != null ? "{...}" : "null") + ')');
		}
	}

	public final synchronized void removeConsumer (ImageConsumer imageConsumer) {
		try {
			if (imageConsumer == this.imageConsumer) {
				this.imageConsumer = null;
			}

			++D;
		} catch (RuntimeException var3) {
			throw id.a(var3, "qc.removeConsumer(" + (imageConsumer != null ? "{...}" : "null") + ')');
		}
	}

	public final void startProduction (ImageConsumer imageConsumer) {
		try {
			this.addConsumer(imageConsumer);
			++F;
		} catch (RuntimeException var3) {
			throw id.a(var3, "qc.startProduction(" + (imageConsumer != null ? "{...}" : "null") + ')');
		}
	}

	final void a (int unused, int x, int y, Graphics graphics) {
		try {
			++int_w;
			this.b(unused);
			graphics.drawImage(super.image_j, x, y, this);
		} catch (RuntimeException var6) {
			throw id.a(var6, "qc.C(" + unused + ',' + x + ',' + y + ',' + (graphics != null ? "{...}" : "null") + ')');
		}
	}
}
