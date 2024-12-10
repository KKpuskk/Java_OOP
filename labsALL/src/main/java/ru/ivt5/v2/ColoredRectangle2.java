package ru.ivt5.v2;

import ru.ivt5.v2.iface.Colored;
import ru.ivt5.v2.iface.Movable;
import ru.ivt5.v2.iface.HasArea;

public class ColoredRectangle2 extends Figure implements Colored, Movable, HasArea {
    private Point topLeft;
    private Point bottomRight;
    private int color;

    public ColoredRectangle2(Point topLeft, Point bottomRight, int color) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (bottomRight.getX() - topLeft.getX()) * (bottomRight.getY() - topLeft.getY());
    }

    @Override
    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public int getColor() {
        return color;
    }

    @Override
    public void moveTo(int x, int y) {
        int deltaX = x - topLeft.getX();
        int deltaY = y - topLeft.getY();
        moveRel(deltaX, deltaY);
    }

    @Override
    public void moveRel(int dx, int dy) {
        topLeft = new Point(topLeft.getX() + dx, topLeft.getY() + dy);
        bottomRight = new Point(bottomRight.getX() + dx, bottomRight.getY() + dy);
    }

    @Override
    public void moveTo(Point point) {
        moveTo(point.getX(), point.getY());
    }
}
