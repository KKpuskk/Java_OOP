package ru.ivt5.v2;

public class ColoredRectangle extends Rectangle {
    private int color;

    public ColoredRectangle(Point leftTop, Point rightBottom, int color) {
        super(leftTop, rightBottom);
        setColor(color);
    }

    public ColoredRectangle(int xLeft, int yTop, int xRight, int yBottom, int color) {
        super(xLeft, yTop, xRight, yBottom);
        setColor(color);
    }

    public ColoredRectangle(int length, int width, int color) {
        super(0, 0, length, width);
        setColor(color);
    }

    public ColoredRectangle(int color) {
        this(1, 1, color);
    }

    public ColoredRectangle() {
        this(1);
    }

    public Point getTopLeft() {
        return super.getTopLeft();
    }

    public Point getBottomRight() {
        return super.getBottomRight();
    }

    public int getColor() {
        return color;
    }

    public void setTopLeft(Point topLeft) {
        super.setTopLeft(topLeft);
    }

    public void setBottomRight(Point bottomRight) {
        super.setBottomRight(bottomRight);
    }

    public void setColor(int color) {
        if (color < 0 || color > 255) {
            throw new IllegalArgumentException("Цвет должен быть от 0-255");
        }
        this.color = color;
    }

    public int getLength() {
        return super.getLenght();
    }

    public int getWidth() {
        return super.getWidth();
    }

    public void moveRel(int dx, int dy) {
        super.moveRel(dx, dy);
    }

    public void resize(double ratio) {
        super.resize(ratio);
    }

    public void stretch(double xRatio, double yRatio) {
        super.stretch(xRatio, yRatio);
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

    public boolean isIntersects(ColoredRectangle rectangle) {
        return super.isIntersects(rectangle);
    }

    public boolean isInside(ColoredRectangle rectangle) {
        return super.isInside(rectangle);
    }
}