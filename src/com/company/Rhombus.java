package com.company;

public class Rhombus extends Figure {

    private double angle;

    Rhombus(double verge, double angle) {
        this.angle = angle;
        this.verges = new double[1];
        verges[0] = verge;
    }


    @Override
    double getPerimeter() {
        return 4 * this.verges[0];
    }


    @Override
    double getSquare() {

        return this.verges[0] * this.verges[0] * Math.sin(angle * Math.PI / 180);
    }
}
