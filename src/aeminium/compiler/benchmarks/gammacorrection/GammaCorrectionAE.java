package aeminium.compiler.benchmarks.gammacorrection;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * Gamma correction algorithm
 * 
 * Author: Bostjan Cigan (http://zerocool.is-a-geek.net)
 * 
 */

public class GammaCorrectionAE {

	public static void main(String[] args) throws IOException {

		double startime = System.nanoTime();

		BufferedImage original, gamma_corrected;

		File original_f = new File("img3.jpg");
		original = ImageIO.read(original_f);
		double corValue = Double.parseDouble("10");
		String output_f = "img3_gc_" + corValue;
		gamma_corrected = gammaCorrection(original, corValue);
		writeImage(output_f, gamma_corrected);

		double endTime = (System.nanoTime() - startime) / 1000000000;

		System.out.println("Time= " + endTime);
	}

	public static void writeImage(String output, BufferedImage gamma_corrected)
			throws IOException {
		File file = new File(output + ".jpg");
		ImageIO.write(gamma_corrected, "jpg", file);
	}

	public static BufferedImage gammaCorrection(BufferedImage original,
			double gamma) {

		int alpha, red, green, blue;
		int newPixel;

		double gamma_new = 1 / gamma;
		int[] gamma_LUT = gamma_LUT(gamma_new);

		BufferedImage gamma_cor = new BufferedImage(original.getWidth(),
				original.getHeight(), original.getType());

		int i = 0;
		while (i < original.getWidth()) {
			int j = 0;
			while (j < original.getHeight()) {

				// Get pixels by R, G, B
				alpha = new Color(original.getRGB(i, j)).getAlpha();
				red = new Color(original.getRGB(i, j)).getRed();
				green = new Color(original.getRGB(i, j)).getGreen();
				blue = new Color(original.getRGB(i, j)).getBlue();

				red = gamma_LUT[red];
				green = gamma_LUT[green];
				blue = gamma_LUT[blue];

				// Return back to original format
				newPixel = colorToRGB(alpha, red, green, blue);

				// Write pixels into image
				gamma_cor.setRGB(i, j, newPixel);
				j++;
			}
			i++;

		}

		return gamma_cor;

	}

	// Create the gamma correction lookup table
	public static int[] gamma_LUT(double gamma_new) {
		int[] gamma_LUT = new int[256];

		int i = 0;
		while (i < (gamma_LUT).length) {
			gamma_LUT[i] = (int) (255 * (Math.pow((double) i / (double) 255,
					gamma_new)));
			i++;
		}

		return gamma_LUT;
	}

	// Convert R, G, B, Alpha to standard 8 bit
	public static int colorToRGB(int alpha, int red, int green, int blue) {

		int newPixel = 0;
		newPixel += alpha;
		newPixel = newPixel << 8;
		newPixel += red;
		newPixel = newPixel << 8;
		newPixel += green;
		newPixel = newPixel << 8;
		newPixel += blue;

		return newPixel;

	}

}
