package advance.dev.dao;

import advance.dev.models.Shape;

public class ShapeManager implements IShape {
	private Shape shapes[] = new Shape[5];
	private int index = 0;
	@Override
	public void add(Shape shape) {
		// TODO Auto-generated method stub
		shapes[index] = shape;
		index++;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		for (Shape shape : shapes) {
			System.out.println(shape);
		}
	}

}