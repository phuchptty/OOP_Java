package com.danghoangphuc.th_oop;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        System.out.println("(" + x + " , " + y + ")");
        return null;
    }

    public double distance(double a, double b) {
        return Math.sqrt(Math.pow(x - a, 2) + Math.pow(y - b, 2));
    }

    public double distance(MyPoint point1) {
        return Math.sqrt(Math.pow(x - point1.x, 2) + Math.pow(y - point1.y, 2));
    }
}
