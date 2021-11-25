package graph;

import exports.ExportVisitor;

public class Line extends GraphObject {
    private Coords coefficients;

    public Line(int a, int b) {
        this(a,b,DEFAULT_COLOR);
    }
    public Line(int a, int b, String color) {
        super(color);
        coefficients = new Coords(a,b);
    }

    public Line(Line l) {
        this(l.getX(), l.getY(), l.getColor());
    }

    public int getX() {
        return coefficients.getX();
    }

    public Line setX(int a) {
        coefficients.setX(a);
        return this;
    }

    public int getY() {
        return coefficients.getY();
    }

    public Line setY(int b) {
        coefficients.setY(b);
        return this;
    }

    @Override
    public Line clone() {
        return new Line(this);
    }

    @Override
    public void draw() {
        System.out.printf("Line (y = %dx + %d) %s\n", getX(), getY(), getColor());
    }


    @Override
    public void accept(ExportVisitor visitor) {
        visitor.exportLine(this);
    }
}