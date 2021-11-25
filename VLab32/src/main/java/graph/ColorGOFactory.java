package graph;

public class ColorGOFactory extends AbstractGOFactory {
	public static final Point DEFAULT_POINT = new Point(0,0);
	public static final Line DEFAULT_LINE = new Line(2,3);

	@Override
	public Point createPoint() {
		Point p = DEFAULT_POINT.clone();
		Scene.instance.add(p); // hook
		return p;
	}

	@Override
	public Line createLine() {
		Line l = DEFAULT_LINE.clone();
		Scene.instance.add(l); // hook
		return l;
	}

	@Override
	public Circle createCircle() {
		Circle c = new Circle(0,0,1);
		Scene.instance.add(c);
		return c;
	}

	@Override
	public TriangleAdapter createTriangle() {
		TriangleAdapter t = new TriangleAdapter(0, 0, 0, 1, 1, 0, "green");
		Scene.instance.add(t);
		return t;
	}

}
