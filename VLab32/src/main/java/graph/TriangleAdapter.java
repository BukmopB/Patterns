package graph;

import exports.ExportVisitor;

public class TriangleAdapter extends GraphObject {
    private Triangle t;

    public TriangleAdapter(int Ax, int Ay, int Bx, int By, int Cx, int Cy) {
        this(Ax,Ay,Bx,By,Cx,Cy,DEFAULT_COLOR);
    }
    public TriangleAdapter(int Ax, int Ay, int Bx, int By, int Cx, int Cy, String color) {
        super(color);
        this.t = new Triangle(new Coords(Ax, Ay), new Coords(Bx, By), new Coords(Cx, Cy));
    }

    public int getAx() {
        return t.getA().getX();
    }
    public int getAy() {
        return t.getA().getY();
    }
    public TriangleAdapter setAx(int x) {
        t.getA().setX(x);
        return this;
    }
    public TriangleAdapter setAy(int y) {
        t.getA().setY(y);
        return this;
    }

    public int getBx() {
        return t.getB().getX();
    }
    public int getBy() {
        return t.getB().getY();
    }
    public TriangleAdapter setBx(int x) {
        t.getB().setX(x);
        return this;
    }
    public TriangleAdapter setBy(int y) {
        t.getB().setY(y);
        return this;
    }

    public int getCx() {
        return t.getC().getX();
    }
    public int getCy() {
        return t.getC().getY();
    }
    public TriangleAdapter setCx(int x) {
        t.getC().setX(x);
        return this;
    }
    public TriangleAdapter setCy(int y) {
        t.getC().setY(y);
        return this;
    }

    @Override
    public void draw() {
        System.out.printf("Triangle A(%d; %d) B(%d; %d) C(%d; %d) \"%s\"\n",
                getAx(), getAy(), getBx(), getBy(), getCx(), getCy(), getColor());
    }

    @Override
    public void accept(ExportVisitor visitor) {
        visitor.exportTriangleAdapter(this);
    }
}
