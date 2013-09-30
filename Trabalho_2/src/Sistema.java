import java.awt.Graphics;
import java.util.Scanner;

public class Sistema {

    Reta reta = new Reta();
    Retangulo retan = new Retangulo();
    Triangulo trian = new Triangulo();
    Circulo cir = new Circulo();
    
    
    public static void main(String[] args) {
	
    Reta reta = new Reta();
    Retangulo retan = new Retangulo();
    Triangulo trian = new Triangulo();
    Circulo cir = new Circulo();
    
	
	//inicia scanner
	
	Scanner ler = new Scanner (System.in);

	//ler a linha toda
	
	String cmd = ler.nextLine();
	
	//delimita as informacoes
	
	Scanner separar = new Scanner(cmd).useDelimiter(" ");
	
	//captura a string e identifica o nome do desenho para validacao
	
	String nome = separar.next();
	
	if(nome.equals("reta")){
	
	reta.pt0x = separar.nextInt();
	reta.pt0y = separar.nextInt();
	reta.pt1x = separar.nextInt();
	reta.pt1y = separar.nextInt();
	
	}
	
	else if(nome.equals("retangulo")){
	
	retan.pt0x = separar.nextInt();
	retan.pt0y = separar.nextInt();
	retan.pt1x = separar.nextInt();
	retan.pt1y = separar.nextInt();
	
	}
		
	else if(nome.equals("triangulo")){
	
	trian.pt0x = separar.nextInt();
	trian.pt0y = separar.nextInt();
	trian.pt1x = separar.nextInt();
	trian.pt1y = separar.nextInt();
	trian.pt2x = separar.nextInt();
	trian.pt2y = separar.nextInt();
	
	}
		
	else if(nome.equals("circulo")){
	
	cir.ptX = separar.nextInt();
	cir.ptY = separar.nextInt();
	cir.ptR = separar.nextInt();
	
	}
	
    }
	public void draw(Graphics g){

	//drawLine(reta.pt0x, reta.pt1x, reta.pt0y, reta.pt1y);   
	    
	int dx = (reta.pt1x-reta.pt0x);
	int dy = (reta.pt1y-reta.pt0y);    
	 
	int sx, sy;
	
	if(reta.pt0x>reta.pt1x){
	    
	    sx = -1;
	}
	
	else sx = 1;
	
	if(reta.pt0y>reta.pt1y){
	    
	    sy = -1;
	}
	
	else sy = 1;
	
	int err = dx - dy;
	
	while(true){
	    
	//    img.setPixel(reta.pt0x+reta.pt1x);
	    
	    
	}
	
	
	}
}