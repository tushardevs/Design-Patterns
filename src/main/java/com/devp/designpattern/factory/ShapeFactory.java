package com.devp.designpattern.factory;

public class ShapeFactory {

    public Shape getShape(String shapeName) {
        if (shapeName.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeName.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else if (shapeName.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }
}
