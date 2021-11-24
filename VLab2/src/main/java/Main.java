import graph.*;

public class Main {

    public static void main(String[] args) {

        AbstractGOFactory gof = new ColorGOFactory();
        gof.createRoot();
        gof.createPoint(null).setColor("red");
        gof.createPoint(null).setColor("green");

        gof.createLine(null);
        gof.createLine(null).setX(5).setY(7);

        gof.createCircle(null).setColor("blue");

        Scene.instance.add(null,
                new FillDecorator(new Circle(0, 0, 25, "blue"), "aquamarine"));

        Scene.instance.add(/*new CompositeShape()*/null,
                new FillDecorator(new Line(1, 2, "purple"), "magenta"));

        gof.createTriangle(null).setColor("pink");

        Scene.instance.draw();
    }
}
