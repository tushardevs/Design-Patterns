package com.devp.designpattern.abstractFactory;

public abstract class AbstractFactory {
    abstract Shape getShape(String shape);
    abstract Color getColor(String color);
}
