package ru.ivt5.v2;

public class ColoredCircle extends Circle {
    private int color;

    public ColoredCircle(Point center, int radius, int color) {
        super(center, radius);
        setColor(color);
    }

    public ColoredCircle(int xCenter, int yCenter, int radius, int color) {
        super(xCenter, yCenter, radius);
        setColor(color);
    }

    public ColoredCircle(int radius, int color) {
        super(radius);
        setColor(color);
    }

    public ColoredCircle(int color) {
        this(1, color);
    }

    public ColoredCircle() {
        this(1);
    }

    public Point getCenter() {
        return super.getCenter();
    }

    public int getRadius() {
        return super.getRadius();
    }

    public void setCenter(Point center) {
        super.setCenter(center);
    }

    public void setRadius(int radius) {
        super.setRadius(radius);
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        if (color < 0 || color > 255) {
            throw new IllegalArgumentException("Цвет должен быть от 0-255");
        }
        this.color = color;
    }

    public void moveRel(int dx, int dy) {
        super.moveRel(dx, dy);
    }

    public void resize(double ratio) {
        super.resize(ratio);
    }

    public double getArea() {
        return super.getArea();
    }

    public double getPerimeter() {
        return super.getPerimeter();
    }

    public boolean isInside(int x, int y) {
        return super.isInside(x, y);
    }

    public boolean isInside(Point point) {
        return super.isInside(point);
    }
}
