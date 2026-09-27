package client;

import abstraction.*;
import implementor.*;

public class Client {
    public static void main(String[] args){

        Shape circle = new Circle(new VectorRenderer(), 5);
        Shape square = new Square(new RasterRenderer(), 6);

        circle.draw();
        square.draw();


        circle.setRenderer(new RasterRenderer());
        circle.draw();

        square.setRenderer(new VectorRenderer());
        square.draw();


    }
}
