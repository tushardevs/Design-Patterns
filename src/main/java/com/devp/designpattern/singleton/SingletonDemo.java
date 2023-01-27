package com.devp.designpattern.singleton;

public class SingletonDemo {

    public static void main(String[] args) {
        SingletonObject singletonObject = SingletonObject.getInstance();
        singletonObject.showMessage();
    }
}
