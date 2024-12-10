package ru.ivt5.v2;

import ru.ivt5.v2.iface.Colored;
import ru.ivt5.v2.iface.Movable;
import ru.ivt5.v2.iface.HasArea;

public class Triangle extends Figure implements Colored, Movable, HasArea {
    private Point a;
    private Point b;
    private Point c;
    private int color;

    public Triangle(Point a, Point b, Point c, int color) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.abs((a.getX()*(b.getY()-c.getY()) + b.getX()*(c.getY()-a.getY()) + c.getX()*(a.getY()-b.getY())) / 2.0);
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
        // Реализация перемещения
        int deltaX = x - a.getX();
        int deltaY = y - a.getY();
        moveRel(deltaX, deltaY);
    }

    @Override
    public void moveRel(int dx, int dy) {
        a = new Point(a.getX() + dx, a.getY() + dy);
        b = new Point(b.getX() + dx, b.getY() + dy);
        c = new Point(c.getX() + dx, c.getY() + dy);
    }

    @Override
    public void moveTo(Point point) {
        moveTo(point.getX(), point.getY());
    }
}