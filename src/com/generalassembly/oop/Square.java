package com.generalassembly.oop;

public class Square extends Rectangle{

    public Square(double side) {
        super(side, side);
    }

    @Override
    public String getName() {
        return "Square";
    }
}
