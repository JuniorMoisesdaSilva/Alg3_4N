
import java.util.Random;

public class Cartas {
    
    public static void main(String[ ]  args){
    
    String [] faces =  {"A","2","3","4","5","6","7","8","9","10","J","Q","K" };
    String [] nipes =  {"E","P","O","C" };
    
    Random r = new Random();
    
    String face = faces[r.nextInt(faces.length)];
    String nipe = nipes[r.nextInt(nipes.length)];
    
    String carta = face+nipe;

    System.out.print(carta);
    
}
}