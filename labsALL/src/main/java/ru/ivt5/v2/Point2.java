package ru.ivt5.v2;

import ru.ivt5.v2.iface.Movable;

public class Point2 implements Movable {
    private int x;
    private int y;

    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveRel(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public void moveTo(Point point) {
        moveTo(point.getX(), point.getY());
    }
}