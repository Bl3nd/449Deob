import java.awt.Component;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class rc extends jd {
	private Component component;

	final void a (int unused, int x, int y, Graphics graphics) {
		graphics.drawImage(this.image_j, x, y, this.component);
	}

	final void a (int width, int unused, int height, Component component) {
		if (unused == 0) {
			this.imagePixels = new int[1 + width * height];
			this.image_h = height;
			this.image_w = width;
			DataBufferInt dataBufferInt = new DataBufferInt(this.imagePixels, this.imagePixels.length);
			DirectColorModel directColorModel = new DirectColorModel(32, 16711680, '\uff00', 255);
			WritableRaster writableRaster = Raster
					.createWritableRaster(directColorModel.createCompatibleSampleModel(this.image_w, this.image_h), dataBufferInt, null);
			this.image_j = new BufferedImage(directColorModel, writableRaster, false, new Hashtable());
			this.component = component;
			this.a(-1926);
		}
	}
}
