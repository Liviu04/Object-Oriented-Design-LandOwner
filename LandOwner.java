package landowner;

import java.util.List;

public class LandOwner {
	List<Shape> shapes ;

	public LandOwner(List<Shape> shapes) {
		this.shapes = shapes;
	}

	public void addLand(Shape shape) {
		shapes.add(shape);
	}

	public void deleteLand(Shape shape) {
		shapes.remove(shape);
	}

	public float compute_total_area() {
		float total_area = 0;
		for (Shape iterator : shapes) {
			total_area += iterator.computeArea();

		}
		return total_area;
	}

}
