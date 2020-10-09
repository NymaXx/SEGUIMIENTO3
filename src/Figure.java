import processing.core.PApplet;

abstract class Figure extends PApplet{
		float x, y, radius;
		PApplet app;
		Figure(float x, float y, float radius, PApplet app){
			this.x=x;
			this.y=y;
			this.radius=radius;
			this.app=app;
		}
		
		void paintRecursive(){
			
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
