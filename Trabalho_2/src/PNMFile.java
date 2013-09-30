import java.io.PrintStream;

public class PNMFile {

	private int width;
	private int height;
	private int[][] image;

	public PNMFile(int width, int height) {
		this.width = width;
		this.height = height;
		this.image = new int[width][height];
	}

	public void setPixel(int x, int y, int gray) throws Exception {
		if (x < 0 || x >= width)
			throw new Exception("x out of range");

		if (y < 0 || y >= height)
			throw new Exception("y out of range");

		if (gray < 0)
			gray = 0;
		if (gray > 255)
			gray = 255;

		this.image[x][y] = gray;
	}

	public int getPixel(int x, int y) {
		if (x < 0 || x >= width)
			return 0;

		if (y < 0 || y >= height)
			return 0;

		return this.image[x][y];
	}

	public void printImage(PrintStream out) {
            
		out.println(String.format("P2\n%d %d\n255\n", width, height));

		for (int x = 0; x < this.width; x++) {
			for (int y = 0; y < this.height; y++) {
				out.print(getPixel(x, y));
				out.print(" ");
			}
		}
	}
}