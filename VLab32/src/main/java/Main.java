import exports.JSONExport;
import exports.XMLExport;
import graph.AbstractGOFactory;
import graph.Circle;
import graph.ColorGOFactory;
import graph.Scene;

public class Main {

    public static void main(String[] args) {

        AbstractGOFactory gof = new ColorGOFactory();
        gof.createPoint();
        gof.createPoint().setColor("green");

        gof.createLine();
        gof.createLine().setX(5).setY(7).setColor("purple");

        gof.createCircle();
        gof.createCircle().setColor("blue");

        gof.createTriangle().setAx(-1).setAy(0).setBx(-1).setBy(1).setCx(0).setCy(1).setColor("pink");
        gof.createTriangle();

        Scene.instance.draw();
        Scene.instance.export(new JSONExport());
        Scene.instance.export(new XMLExport(true));

    }
}
