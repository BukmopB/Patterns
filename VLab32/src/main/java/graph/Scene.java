package graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import exports.ExportVisitor;
import exports.Exportable;
import exports.Exporter;
import exports.JSONExport;
import exports.XMLExport;

public class Scene {
	private List<GraphObject> objects ;
	public static final Scene instance = new Scene();
	
	private Scene() {
		objects = new ArrayList<GraphObject>();
	}
	
	public void add(GraphObject o) {
		objects.add(o);
	} 
	
	public void clear() {
		objects.clear();
	}
	
	public void draw() {
		for(GraphObject g : objects)
			g.draw();
	}
	
	public void export(Exporter visitor) {
		Iterator<GraphObject> iter = objects.iterator();
		visitor.start();
		while (iter.hasNext()) {
			GraphObject g = iter.next();
			if (g instanceof Exportable) {
				((Exportable)g).accept(visitor);
				if (iter.hasNext()) visitor.delimiter();
			}
		}
		visitor.end();
	}
}
