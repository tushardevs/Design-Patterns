package com.devp.designpattern.factory;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        System.out.println("CIRCLE");
        shapeFactory.getShape("CIRCLE").draw();

        System.out.println("SQUARE");
        shapeFactory.getShape("Square").draw();

        System.out.println("RECTANGLE");
        shapeFactory.getShape("rectangle").draw();
    }
}
