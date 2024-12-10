package ru.ivt5.v2;

public class Rectangle {
    private Point leftTop;
    private Point rightBottom;
    public Rectangle(Point leftTop, Point rightBottom) {
        this.leftTop = leftTop;
        this.rightBottom = rightBottom;
    }

    public Rectangle(int xLeft, int yTop, int xRight, int yBottom) {
        this.leftTop = new Point(xLeft, yTop);
        this.rightBottom = new Point(xRight, yBottom);
    }

    public Rectangle(int length, int width) {
        this.leftTop = new Point(0, 0);
        this.rightBottom = new Point(length, width);
    }

    public Rectangle(){
        this(1, 1);
    }

    public Point getTopLeft() {
        return leftTop;
    }

    public Point getBottomRight() {
        return rightBottom;
    }

    public void setTopLeft(Point topLeft) {
        this.leftTop = topLeft;
    }

    public void setBottomRight(Point bottomRight) {
        this.rightBottom = bottomRight;
    }

    public int getLenght() {
        return rightBottom.getX() - leftTop.getX();
    }

    public int getWidth() {
        return rightBottom.getY() - leftTop.getY();
    }

    public void moveTo(int x, int y) {
        int width = getWidth();
        int height = getLenght();
        leftTop = new Point(x, y);
        rightBottom = new Point(x + width, y + height);
    }

    public void moveTo(Point point) {
        moveTo(point.getX(), point.getY());
    }

    public void moveRel(int dx, int dy) {
        moveTo(leftTop.getX() + dx, leftTop.getY() + dy);
    }

    public void resize(double ratio) {
        int newLength = (int)(getLenght() * ratio);
        int newWidth = (int)(getWidth() * ratio);
        rightBottom = new Point(leftTop.getX() + newLength, leftTop.getY() + newWidth);
    }

    public void stretch(double xRatio, double yRatio) {
        int newLength = (int)(getLenght() * xRatio);
        int newWidth = (int)(getWidth() * yRatio);
        rightBottom = new Point(leftTop.getX() + newLength, leftTop.getY() + newWidth);
    }

    public double getArea() {
        return getLenght() * getWidth();
    }

    public double getPerimeter() {
        return 2 * (getLenght() + getWidth());
    }

    public boolean isInside(int x, int y) {
        return (x >= leftTop.getX() && x <= rightBottom.getX() &&
                y >= leftTop.getY() && y <= rightBottom.getY());
    }

    public boolean isInside(Point point) {
        return isInside(point.getX(), point.getY());
    }

    public boolean isIntersects(Rectangle rectangle) {
        return (leftTop.getX() <= rectangle.rightBottom.getX() &&
                rightBottom.getX() >= rectangle.leftTop.getX() &&
                leftTop.getY() <= rectangle.rightBottom.getY() &&
                rightBottom.getY() >= rectangle.leftTop.getY());
    }

    public boolean isInside(Rectangle rectangle) {
        return isInside(rectangle.leftTop) && isInside(rectangle.rightBottom);
    }
}


