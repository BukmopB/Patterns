package graph;

public class Triangle {
    private Coords A;
    private Coords B;
    private Coords C;

    public Triangle(Coords a, Coords b, Coords c) {
        super();
        A = a;
        B = b;
        C = c;
    }

    public Coords getA() {
        return A;
    }

    public void setA(Coords a) {
        A = a;
    }

    public Coords getB() {
        return B;
    }

    public void setB(Coords b) {
        B = b;
    }

    public Coords getC() {
        return C;
    }

    public void setC(Coords c) {
        C = c;
    }
}
