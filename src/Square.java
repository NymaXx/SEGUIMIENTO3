import processing.core.PApplet;

public class Square extends Figure{

	
		Square(float x, float y , float radius, PApplet app){
			super(x,y,radius,app);
			
		}
		
		void display() {
			app.stroke(255);
			  app.noFill();
			app.rectMode(CENTER);
			app.rect(this.x, this.y, this.radius, this.radius);
		}

		
		
		
		
		 void paintRecursive(float x, float y, float radius) {
			int radiusLimit=1;
			  app.stroke(255);
			  app.noFill();
			  app.rectMode(CENTER);
			  //display();
			  app.rect(x, y, radius, radius);
			  if(radius > radiusLimit) {
				  radius *= 0.8;
				  paintRecursive(x, y, radius);
			  }
			  
			}
		
		 
		 
		 void zoomIn() {
			 float inc=2;
			 this.radius-=inc; 
		 }
		 
		 public float getX() {
				return x;
			}

			public void setX(float x) {
				this.x = x;
			}

			public float getY() {
				return y;
			}

			public void setY(float y) {
				this.y = y;
			}

			public float getRadius() {
				return radius;
			}

			public void setRadius(float radius) {
				this.radius = radius;
			}
		
		 
}
