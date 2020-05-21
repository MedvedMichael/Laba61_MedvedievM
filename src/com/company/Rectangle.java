package com.company;

public class Rectangle extends Figure {

    Rectangle(double a, double b) {
        this.verges = new double[2];
        this.verges[0] = a;
        this.verges[1] = b;
    }

    @Override
    double getPerimeter() {
        return 2 * (this.verges[0] + this.verges[1]);
    }

    @Override
    double getSquare() {
        return this.verges[0]*this.verges[1];
    }
}

