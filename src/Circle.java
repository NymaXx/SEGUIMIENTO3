import processing.core.PApplet;

public class Circle extends Figure {

	Circle(float x, float y, float radius,PApplet app){
		super( x,y,radius,app);
	}
	
	public void paintRecursive(float x, float y, float radius) {
		int radiusLimit=1;
		  app.stroke(255);
		  app.noFill();
		  app.ellipse(x, y, radius, radius);
		  if(radius > radiusLimit) {
			  radius *= 0.8;
			  paintRecursive(x, y, radius);
		  }
		}
	
	
}
