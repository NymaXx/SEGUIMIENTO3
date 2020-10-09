import java.util.ArrayList;
import processing.core.PApplet;

public class MainSeg3 extends PApplet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(MainSeg3.class.getName());
	}

	int screen;
	Square square;
	Circle circle;
	
	//ArrayList <Square> squares;
	
	public void settings() {
		size(500,500);
	}
	
	public void setup() {
		screen=0;
		square= new Square(width/2, height/2,350,this);
		circle= new Circle(width/2, height/2,350,this);
		
		//squares= new ArrayList<Square>();
		//squares.add(new Square(width/2, height/2,350,this));
	}
	
	public void draw() {
		background(0);
		
		
		switch(screen) {
		case 0:
			putButtons();
			break;
			
		case 1: //cuadrado
			putButtons();
			
			/*for (Square s : squares) {
			    s.display();
			  }*/
			//generate(width/2,height/2,350);
			
			square.paintRecursive(width/2,height/2,350);
			
			break;
			
		case 2: // circulo
			putButtons();
			circle.paintRecursive(width/2,height/2,350);
			break;
		}
		
		
		//para saber donde esta el mouse
		/*fill(255);
		textSize(20);
		text("X" + mouseX + "Y"+ mouseY, mouseX, mouseY);*/
	}
	
	
public void mouseWheel() { //intento fallido de zoom, No funciona el getCount() de MouseEvent motivo desconocido
		square.zoomIn();
	
	}


//intento de recursividad para poder agregar rectangulos a un arrayList... no entendi
void generate(float x , float y ,float radius ) {
	int radiusLimit=1;
	  square.display();
	  if(square.getRadius() > radiusLimit) {
		  square.setRadius(radius*= 0.8) ;
		  generate(square.getX(), square.getY(), square.getRadius());
	  }
	}
//fin intento de recursividad para agregar a arrayList





//Para poner los botones de cambios de pantallas
	public void mousePressed() {
		
		
		switch(screen) {
		case 0:
			if(mouseX> 20 && mouseX < 120 && mouseY > 22 && mouseY < 50) {
				screen=1;
			}
			
			if(mouseX> 150 && mouseX < 250 && mouseY > 22 && mouseY < 50) {
				screen=2;
			}
			
			break;
			
		case 1:
			if(mouseX> 20 && mouseX < 120 && mouseY > 22 && mouseY < 50) {
				screen=1;
			}
			
		
			
			if(mouseX> 150 && mouseX < 250 && mouseY > 22 && mouseY < 50) {
				screen=2;
			}
			break;
			
		case 2:
			if(mouseX> 20 && mouseX < 120 && mouseY > 22 && mouseY < 50) {
				screen=1;
			}
			
			if(mouseX> 150 && mouseX < 250 && mouseY > 22 && mouseY < 50) {
				screen=2;
			}
			break;
		}
	}
	
	
	void putButtons() {
		rectMode(CORNER);
		fill(0);
		stroke(255);
		rect(20,22,100,30);
		rect(150,22,100,30);
		textSize(18);
		fill(255);
		text("Cuadrado",25,45);
		text("Circulo",155,45);
	}
}
