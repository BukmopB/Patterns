package exports;

import graph.Circle;
import graph.Line;
import graph.Point;
import graph.TriangleAdapter;

public interface ExportVisitor {
	void exportPoint(Point p);
	void exportCircle(Circle c);
	void exportLine(Line p);
	void exportTriangleAdapter(TriangleAdapter c);
}
