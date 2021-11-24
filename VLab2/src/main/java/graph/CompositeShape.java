package graph;

import java.util.ArrayList;
import java.util.List;

public class CompositeShape extends GraphObject {
    private List<GraphObject> children;

    public List<GraphObject> getChildren() {
        if (children == null) {
            children = new ArrayList<GraphObject>();
        }
        return children;
    }

    @Override
    public void draw() {
        for (GraphObject graphObject: getChildren()) {
            graphObject.draw();
        }
    }

}
