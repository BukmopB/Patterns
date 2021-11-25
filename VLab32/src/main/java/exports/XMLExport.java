package exports;

import graph.Circle;
import graph.Line;
import graph.Point;
import graph.TriangleAdapter;

public class XMLExport implements Exporter{
	private boolean indent;
	
	public XMLExport(boolean indent) {
		super();
		this.indent = indent;
	}
	
	public XMLExport() { 
		this(false);
	}

	@Override
	public void exportPoint(Point p) {
		System.out.printf("<Point x=\"%d\" y=\"%d\" color=\"%s\" />", 
				p.getX(), p.getY(), p.getColor());
	}

	@Override
	public void exportCircle(Circle c) {
		System.out.printf("<Circle cx=\"%d\" cy=\"%d\" radius=\"%d\" color=\"%s\" />", 
				c.getX(), c.getY(), c.getR(), c.getColor());
	}

	@Override
	public void exportLine(Line l) {
		System.out.printf("<Line y = %dx + %d; color=\"%s\" />",
				l.getX(), l.getY(), l.getColor());
	}

	@Override
	public void exportTriangleAdapter(TriangleAdapter t) {
		System.out.printf("<Triangle: A(%d; %d), B(%d, %d), C(%d, %d); color: \"%s\" />",
				t.getAx(), t.getAy(), t.getBx(), t.getBy(), t.getCx(), t.getCy(), t.getColor());
	}


	@Override
	public void start() {
		System.out.println("<Scene>");
	}

	@Override
	public void end() {
		System.out.println("\n</Scene>");
	}

	@Override
	public void delimiter() {
		if (indent)
			System.out.print("\n\t");
		else
			System.out.println();
	}

}
