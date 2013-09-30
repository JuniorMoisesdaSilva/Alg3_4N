
public class PrincipalPNMFile {

public static void main(String[] args) {

PNMFile img = new PNMFile(128, 128);

try {
    for (int x = 0; x < 128; x++) {
	
        for (int y = 0; y < 128; y++) {
	    
            img.setPixel(x, y, x + y * 1);
        }
}
    
} catch (Exception e) {
    
}

img.printImage(System.out);

	}
}
