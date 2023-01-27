package com.devp.designpattern.abstractFactory;

import com.devp.designpattern.abstractFactory.Circle;
import com.devp.designpattern.abstractFactory.Rectangle;
import com.devp.designpattern.abstractFactory.Shape;
import com.devp.designpattern.abstractFactory.Square;

public class ShapeFactory extends AbstractFactory{

    @Override
    public Shape getShape(String shapeName) {
        if (shapeName == null) {
            return null;
        }
        if (shapeName.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeName.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else if (shapeName.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}
