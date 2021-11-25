package exports;

import graph.Circle;
import graph.Line;
import graph.Point;
import graph.TriangleAdapter;

public class JSONExport implements Exporter{

	@Override
	public void exportPoint(Point p) {
		System.out.printf("\t{ x: %d, y: %d, color: \"%s\" }",
				p.getX(), p.getY(), p.getColor());
	}

	@Override
	public void exportCircle(Circle c) {
		System.out.printf("\t{ cx: %d, cy: %d, radius: %d, color: \"%s\" }",
				c.getX(), c.getY(), c.getR(), c.getColor());
	}

	@Override
	public void exportLine(Line l) {
		System.out.printf("\t{ a: %d, b: %d, color: \"%s\" }",
				l.getX(), l.getY(), l.getColor());
	}

	@Override
	public void exportTriangleAdapter(TriangleAdapter t) {
		System.out.printf("\t{ A: [%d, %d], B: [%d, %d], C: [%d, %d], color: \"%s\" }",
				t.getAx(), t.getAy(), t.getBx(), t.getBy(), t.getCx(), t.getCy(), t.getColor());
	}


	@Override
	public void start() {
		System.out.print('[');
	}

	@Override
	public void end() {
		System.out.println(']');
	}

	@Override
	public void delimiter() {
		System.out.println(',');
	}
}
