package implementor;

public class VectorRenderer implements Renderer{

    @Override
    public void renderCircle(double radius) {
        System.out.println("Drawing circle as vector lines, radius: " + radius);
    }

    @Override
    public void renderSquare(double side) {
        System.out.println("Drawing square as vector lines, side: " + side);
    }
}
