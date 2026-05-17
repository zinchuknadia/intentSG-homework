package com.intentsg;

import com.intentsg.figure.*;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("blue", 5);
        circle.draw();
        Rectangle rectangle = new Rectangle("red", 5, 2);
        rectangle.draw();
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid("green", 10, 8, 5);
        isoscelesTrapezoid.draw();
        RightTriangle rightTriangle = new RightTriangle("red", 5, 2);
        rightTriangle.draw();
        Square square = new Square("blue", 5);
        square.draw();
    }
}
