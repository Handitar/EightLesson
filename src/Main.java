
public class Main {
    public static void main(String[] args) {
        ShapeTool tool = new ShapeTool();
        Shape[] shapes = {
                new Circle(),
                new Square(),
                new Rectangle(),
                new Triangle(),
        };

        for(Shape s: shapes) tool.printShapeName(s);
    }
}