package com.company;

public class Triangle extends Figure {

    Triangle(double a,double b,double c) {
        this.verges = new double[3];
        this.verges[0] = a;
        this.verges[1] = b;
        this.verges[2] = c;
    }

    @Override
    double getPerimeter() {
        double sum = 0;
        for (double verge : this.verges)
            sum += verge;

        return sum;
    }

    @Override
    double getSquare() {
        double p = (this.verges[0] + this.verges[1] + this.verges[2]) / 2;
        return Math.sqrt(p * (p - this.verges[0]) * (p - this.verges[1]) * (p - this.verges[2]));
    }
}
