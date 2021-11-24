package graph;

public class FillDecorator extends SimpleShape {
    private SimpleShape elementForDecorate;
    private String endColor;

    public FillDecorator(SimpleShape elementForDecorate, String color) {
        super(color);
        this.elementForDecorate = elementForDecorate;
    }

    public FillDecorator(SimpleShape elementForDecorate,
                         String startColor, String endColor) {
        super(startColor);
        this.endColor = endColor;
        this.elementForDecorate = elementForDecorate;
    }

    public String getEndColor() {
        return endColor;
    }

    @Override
    public void draw() {
        this.elementForDecorate.draw();
        if (endColor != null) {
            // gradient fill
            System.out.printf("Gradient fill from %s to %s\n",
                    getColor(), getEndColor());
        } else {
            // solid fill
            System.out.printf("Solid fill %s with %s\n",
                    elementForDecorate.getClass().getName(),
                    getColor());
        }
    }
}
