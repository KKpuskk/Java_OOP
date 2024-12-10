package ru.ivt5.v1;

public class Circle {
    private Point center;
    private int radius;

    public Circle(Point center, int radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Радиус должен +");
        }
        this.center = center;
        this.radius = radius;
    }

    public Circle(int xCenter, int yCenter, int radius) {
        this(new Point(xCenter, yCenter), radius);
    }

    public Circle(int radius) {
        this(new Point(0, 0), radius);
    }

    public Circle() {
        this(new Point(0, 0), 1);
    }

    public Point getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(int radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Радиус должен +");
        }
        this.radius = radius;
    }

    public void moveTo(int x, int y) {
        center.setX(x);
        center.setY(y);
    }

    public void moveTo(Point point) {
        this.moveTo(point.getX(), point.getY());
    }

    public void moveRel(int dx, int dy) {
        center.setX(center.getX() + dx);
        center.setY(center.getY() + dy);
    }

    public void resize(double ratio) {
        if (ratio > 0) {
            this.radius = (int) (this.radius * ratio);
        } else {
            throw new IllegalArgumentException("Коэффициент измен. должен +");
        }
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean isInside(int x, int y) {
        int dx = x - center.getX();
        int dy = y - center.getY();
        return (dx * dx + dy * dy) <= (radius * radius);
    }

    public boolean isInside(Point point) {
        return isInside(point.getX(), point.getY());
    }
}