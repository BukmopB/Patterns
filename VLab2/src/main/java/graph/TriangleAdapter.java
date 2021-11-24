package graph;

public class TriangleAdapter extends SimpleShape {
    private Triangle t;

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
    public void setAx(int x) {
        t.getA().setX(x);
    }
    public void setAy(int y) {
        t.getA().setY(y);
    }

    public int getBx() {
        return t.getB().getX();
    }
    public int getBy() {
        return t.getB().getY();
    }
    public void setBx(int x) {
        t.getB().setX(x);
    }
    public void setBy(int y) {
        t.getB().setY(y);
    }

    public int getCx() {
        return t.getC().getX();
    }
    public int getCy() {
        return t.getC().getY();
    }
    public void setCx(int x) {
        t.getC().setX(x);
    }
    public void setCy(int y) {
        t.getC().setY(y);
    }

    @Override
    public void draw() {
        System.out.printf("Triangle (%d, %d) (%d, %d) (%d, %d) %s\n",
                getAx(), getAy(), getBx(), getBy(), getCx(), getCy(), getColor());
    }
}
