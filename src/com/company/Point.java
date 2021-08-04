package com.company;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double num) {
        this.x = num;
    }

    public void setY(double num) {
        this.y = num;
    }

    @Override
    public String toString() {
        return "("+this.x+","+this.y+")";
    }

    public boolean equals(Point other) {
        return (this.x == other.x && this.y == other.y);
    }

    public boolean isAbove(Point other) {
        return (this.y > other.y);
    }

    public boolean isUnder(Point other) {
        return (other.isAbove(this));
    }

    public boolean isLeft(Point other) {
        return (this.x < other.x);
    }

    public boolean isRight(Point other) {
        return (other.isLeft(this));
    }

    public int whichQuadrand(Point p) {
        if (x>=0) {
            if (y>=0) {
                return 1;
            } else {
                return 4;
            }
        } else {
            if (y>=0) {
                return 2;
            } else {
                return 3;
            }
        }
    }

    public double distance(Point p) {
        double dx = this.x - p.x;
        double dy = this.y - p.y;
        return Math.sqrt(dx*dx+dy*dy);
    }

    public Point mirrorPoint(Point p) {
        return new Point(-p.x,-p.y);
    }

    public void move(double dx, double dy) {
        this.x = this.x + dx;
        this.y = this.y + dy;
    }
}
