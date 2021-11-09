import graph.AbstractGOFactory;
import graph.ColorGOFactory;
import graph.Scene;

public class Main {

    public static void main(String[] args) {

        AbstractGOFactory gof = new ColorGOFactory();
        gof.createPoint().setColor("red");
        gof.createPoint().setColor("green");

        gof.createLine();
        gof.createLine().setX(5);
        gof.createCircle().setColor("blue");

        Scene.instance.draw();

    }

}
