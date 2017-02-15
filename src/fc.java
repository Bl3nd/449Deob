import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

final class fc implements MouseListener, MouseMotionListener, FocusListener {
	static int int_a;
	static int int_b;
	static int int_c;
	static int int_d;
	static int int_e;
	static int int_f;
	static int int_g;
	static dd dd_h = new dd(128);
	static int int_i;
	static int int_j;
	static int int_k = 0;
	static int int_l;
	static rd badSessionId2;
	static int int_n = 0;
	static oa[] scrollbarData;
	static rd hidden_;
	static byte[][] bytes_q;
	static int int_r = -1;
	static rd scrollbar = md.a((String) "scrollbar", (byte) 115);
	static int int_u = 255;
	static oa oa_v;
	static rd noMatchingObjectsFound_pleaseShortenSearch2;
	static rd y;
	static int z;
	static int A;
	static int[][] B;
	private static rd badSessionId;
	private static rd noMatchingObjectsFound_pleaseShortenSearch = md.a((String) "No matching objects found)1 please shorten search", (byte) 126);

	static {
		noMatchingObjectsFound_pleaseShortenSearch2 = noMatchingObjectsFound_pleaseShortenSearch;
		A = 0;
		y = md.a("Entfernen", (byte) 122);
		badSessionId = md.a("Bad session id)3", (byte) 123);
		B = new int[104][104];
		badSessionId2 = badSessionId;
		hidden_ = md.a("Hidden)2", (byte) 127);
	}

	public static void a (boolean unused) {
		try {
			badSessionId = null;
			noMatchingObjectsFound_pleaseShortenSearch2 = null;
			B = null;
			badSessionId2 = null;
			hidden_ = null;
			y = null;
			dd_h = null;
			oa_v = null;
			scrollbar = null;
			bytes_q = null;
			noMatchingObjectsFound_pleaseShortenSearch = null;
			scrollbarData = null;
		} catch (RuntimeException var2) {
			throw id.a(var2, "fc.A(" + unused + ')');
		}
	}

	static int a (nd class_nd, int unused) {
		try {
			++z;
			ub class_ub = (ub) bd.Qb.a(-1, ((long) class_nd.dc << 32) + ((long) class_nd.Yc));
			return class_ub != null ? class_ub.I : class_nd.jd;
		} catch (RuntimeException var3) {
			throw id.a(var3, "fc.B(" + "{...}" + ',' + unused + ')');
		}
	}

	public final synchronized void mouseEntered (MouseEvent mouseEvent) {
		try {
			if (ja.fc_a != null) {
				ie.o = 0;
				df.mouseX = mouseEvent.getX();
				qc.mouseY = mouseEvent.getY();
			}
			++int_e;
		} catch (RuntimeException var3) {
			throw id.a(var3, "fc.mouseEntered(" + (mouseEvent != null ? "{...}" : "null") + ')');
		}
	}

	public final synchronized void mouseMoved (MouseEvent mouseEvent) {
		try {
			if (ja.fc_a != null) {
				ie.o = 0;
				df.mouseX = mouseEvent.getX();
				qc.mouseY = mouseEvent.getY();
			}

			++int_i;
		} catch (RuntimeException var3) {
			throw id.a(var3, "fc.mouseMoved(" + (mouseEvent != null ? "{...}" : "null") + ')');
		}
	}

	public final synchronized void focusLost (FocusEvent focusEvent) {
		try {
			++int_j;
			if (ja.fc_a != null) {
				b.int_id = 0;
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "fc.focusLost(" + (focusEvent != null ? "{...}" : "null") + ')');
		}
	}

	public final synchronized void mouseExited (MouseEvent mouseEvent) {
		try {
			++int_c;
			if (ja.fc_a != null) {
				ie.o = 0;
				df.mouseX = -1;
				qc.mouseY = -1;
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "fc.mouseExited(" + (mouseEvent != null ? "{...}" : "null") + ')');
		}
	}

	public final synchronized void mouseReleased (MouseEvent mouseEvent) {
		try {
			++int_f;
			if (ja.fc_a != null) {
				ie.o = 0;
				b.int_id = 0;
			}

			if (mouseEvent.isPopupTrigger()) {
				mouseEvent.consume();
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "fc.mouseReleased(" + (mouseEvent != null ? "{...}" : "null") + ')');
		}
	}

	public final void mouseClicked (MouseEvent mouseEvent) {
		try {
			++int_g;
			if (mouseEvent.isPopupTrigger()) {
				mouseEvent.consume();
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "fc.mouseClicked(" + (mouseEvent != null ? "{...}" : "null") + ')');
		}
	}

	public final synchronized void mouseDragged (MouseEvent mouseEvent) {
		try {
			++int_b;
			if (ja.fc_a != null) {
				ie.o = 0;
				df.mouseX = mouseEvent.getX();
				qc.mouseY = mouseEvent.getY();
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "fc.mouseDragged(" + (mouseEvent != null ? "{...}" : "null") + ')');
		}
	}

	public final void focusGained (FocusEvent focusEvent) {
		try {
			++int_l;
		} catch (RuntimeException var3) {
			throw id.a(var3, "fc.focusGained(" + (focusEvent != null ? "{...}" : "null") + ')');
		}
	}

	public final synchronized void mousePressed (MouseEvent mouseEvent) {
		try {
			if (ja.fc_a != null) {
				ie.o = 0;
				td.mousePressedX = mouseEvent.getX();
				df.mousePressedY = mouseEvent.getY();
				nd.long_ec = pa.c(0);
				if (mouseEvent.isMetaDown()) {
					ke.qb = 2;
					b.int_id = 2;
				} else {
					ke.qb = 1;
					b.int_id = 1;
				}
			}

			++int_d;
			if (mouseEvent.isPopupTrigger()) {
				mouseEvent.consume();
			}
		} catch (RuntimeException var3) {
			throw id.a(var3, "fc.mousePressed(" + (mouseEvent != null ? "{...}" : "null") + ')');
		}
	}
}
