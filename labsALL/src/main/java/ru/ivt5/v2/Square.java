package ru.ivt5.v2;

public class Square {
    private Point topLeft;
    private int size;

    public Square(Point leftTop, int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Длина должна +");
        }
        this.topLeft = leftTop;
        this.size = size;
    }

    public Square(int xLeft, int yTop, int size) {
        this(new Point(xLeft, yTop), size);
    }

    public Square(int size) {
        this(new Point(0, 0), size);
    }

    public Square() {
        this(new Point(0, 0), 1);
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public Point getBottomRight() {
        return new Point(topLeft.getX() + size, topLeft.getY() - size);
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public int getLength() {
        return size;
    }

    public void moveTo(int x, int y) {
        this.topLeft = new Point(x, y);
    }

    public void moveTo(Point point) {
        this.topLeft = point;
    }

    public void moveRel(int dx, int dy) {
        this.topLeft.setX(this.topLeft.getX() + dx);
        this.topLeft.setY(this.topLeft.getY() + dy);
    }

    public void resize(double ratio) {
        if (ratio <= 0) {
            throw new IllegalArgumentException("Масштаб должен +");
        }
        this.size = (int) (this.size * ratio);
    }

    public double getArea() {
        return size * size;
    }

    public double getPerimeter() {
        return 4 * size;
    }

    public boolean isInside(int x, int y) {
        return x >= topLeft.getX() && x <= topLeft.getX() + size &&
                y <= topLeft.getY() && y >= topLeft.getY() - size;
    }

    public boolean isInside(Point point) {
        return isInside(point.getX(), point.getY());
    }

    public boolean isIntersects(Square square) {
        return !(getBottomRight().getX() < square.topLeft.getX() ||
                topLeft.getX() > square.getBottomRight().getX() ||
                getBottomRight().getY() > square.topLeft.getY() ||
                topLeft.getY() < square.getBottomRight().getY());
    }

    public boolean isInside(Square square) {
        Point thisBottomRight = getBottomRight();
        Point otherBottomRight = square.getBottomRight();

        return topLeft.getX() >= square.topLeft.getX() &&
                topLeft.getY() <= square.topLeft.getY() &&
                thisBottomRight.getX() <= otherBottomRight.getX() &&
                thisBottomRight.getY() >= otherBottomRight.getY();
    }
}
