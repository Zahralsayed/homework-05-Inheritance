package com.generalassembly.oop;

public class Rectangle extends Shape {

    private double length;
    private double height;

    public Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return length * height;
    }

    @Override
    public double getCircumference() {
        return 2*(length + height);
    }
}
