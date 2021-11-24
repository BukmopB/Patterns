package graph;

import java.util.ArrayList;
import java.util.List;

public class Scene {

	private GraphObject root ;
	public static final Scene instance = new Scene();
	
	private Scene() {
	}

	public GraphObject getRoot() {
		return root;
	}

	public void setRoot(GraphObject root) {
		this.root = root;
	}

	public void add(CompositeShape p, GraphObject o) {
		if (p == null && root instanceof CompositeShape) {
			p = (CompositeShape) root;
		}
		if (p == null) {
			root = o;
		} else {
			p.getChildren().add(o);
		}
	} 
	
	public void clear() {
		root = null;
	}
	
	public void draw() {
		if (root != null)
			root.draw();
	}

}
