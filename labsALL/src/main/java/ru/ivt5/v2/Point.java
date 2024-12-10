package ru.ivt5.v2;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        setX(1);
        setY(3);
        getX();
        getY();
//        System.out.println("1. ("+x+";"+y+")");
        moveTo(5, 7);
//        System.out.println("2. ("+x+";"+y+")");
        moveRel(9, 11);
//        System.out.println("3. ("+x+";"+y+")");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void moveTo(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    public void moveRel(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
}