package implementor;

public class RasterRenderer implements Renderer{

    @Override
    public void renderCircle(double radius) {
        System.out.println("Drawing circle as raster pixels, radius: " + radius);
    }

    @Override
    public void renderSquare(double side) {
        System.out.println("Drawing square as raster pixels, side: " + side);
    }
}
