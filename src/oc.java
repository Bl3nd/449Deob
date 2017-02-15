import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public final class oc extends va implements MouseWheelListener {
	private int wheelRotation = 0;

	public final synchronized void mouseWheelMoved (MouseWheelEvent mouseWheelEvent) {
		this.wheelRotation += mouseWheelEvent.getWheelRotation();
	}

	final synchronized int getWheelRotation (boolean unused) {
		int currentWheelRotation = this.wheelRotation;
		this.wheelRotation = 0;
		return currentWheelRotation;
	}

	final void b (int var1, Component component) {
		component.removeMouseWheelListener(this);
		if (var1 != -1) {
			this.wheelRotation = 125;
		}

	}

	final void addMouseWheelListener (int unused, Component component) {
		component.addMouseWheelListener(this);
	}
}
