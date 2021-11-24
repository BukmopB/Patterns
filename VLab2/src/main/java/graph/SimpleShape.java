package graph;

public abstract class SimpleShape extends GraphObject {
    public static final String DEFAULT_COLOR = "black";
    private String color;

    public SimpleShape() {
        this(DEFAULT_COLOR);
    }
    public SimpleShape(String color) {
        super();
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
