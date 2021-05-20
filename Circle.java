package landowner;



public class Circle implements Shape {

	
		private double radius;
		private CircleGeometryRole circleGeometry;

		public Circle(double radius, CircleGeometryRole circleGeometry) {
			super();
			this.radius = radius;
			this.circleGeometry = circleGeometry;
		}

		public double computeArea() {
			return circleGeometry.computeArea(radius);
		}
	}
	


