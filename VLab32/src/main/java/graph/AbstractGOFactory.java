package graph;

public abstract  class AbstractGOFactory {
	public abstract Point createPoint();
	public abstract Line createLine();
	public abstract Circle createCircle();
	public abstract TriangleAdapter createTriangle();

}
