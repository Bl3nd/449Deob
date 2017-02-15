import java.applet.Applet;

import netscape.javascript.JSObject;

final class lb {
	static Object a (Applet applet, String javaScriptExpression, boolean var2) throws Throwable {
		return JSObject.getWindow(applet).eval(javaScriptExpression);
	}
}
