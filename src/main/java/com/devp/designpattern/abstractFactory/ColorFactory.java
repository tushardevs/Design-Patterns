package com.devp.designpattern.abstractFactory;

public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeName) {
        return null;
    }

    @Override
    Color getColor(String colorName) {
        if (colorName == null) {
            return null;
        }
        if (colorName.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (colorName.equalsIgnoreCase("BLUE")) {
            return new Blue();
        } else if (colorName.equalsIgnoreCase("GREEN")) {
            return new Green();
        }
        return null;
    }
}
