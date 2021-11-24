package graph;

public abstract  class AbstractGOFactory {
	public abstract Point createPoint(CompositeShape parent);
	public abstract Line createLine(CompositeShape parent);
	public abstract Circle createCircle(CompositeShape parent);
//	public abstract Triangle createTriangle();

	public abstract TriangleAdapter createTriangle(CompositeShape parent);
	public abstract CompositeShape createRoot();
	public abstract CompositeShape createContainer(CompositeShape parent);
}
