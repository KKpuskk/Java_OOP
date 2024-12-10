package ru.ivt5.v2;

public class Ellipse {
    private Point center;
    private int xAxis;
    private int yAxis;

    public Ellipse(Point center, int xAxis, int yAxis) {
        if (xAxis <= 0 || yAxis <= 0) {
            throw new IllegalArgumentException("Размеры осей должны ");
        }
        this.center = center;
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    public Ellipse(int xCenter, int yCenter, int xAxis, int yAxis) {
        this(new Point(xCenter, yCenter), xAxis, yAxis);
    }

    public Ellipse(int xAxis, int yAxis) {
        this(new Point(0, 0), xAxis, yAxis);
    }

    public Ellipse() {
        this(1, 1);
    }

    public Point getCenter() {
        return center;
    }

    public int getXAxis() {
        return xAxis;
    }

    public int getYAxis() {
        return yAxis;
    }

    public void setXAxis(int xAxis) {
        if (xAxis <= 0) {
            throw new IllegalArgumentException("Размер оси х должен +");
        }
        this.xAxis = xAxis;
    }

    public void setYAxis(int yAxis) {
        if (yAxis <= 0) {
            throw new IllegalArgumentException("Размер оси y должен +");
        }
        this.yAxis = yAxis;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void moveTo(int x, int y) {
        center.setX(x);
        center.setY(y);
    }

    public void moveTo(Point point) {
        this.center = point;
    }

    public void moveRel(int dx, int dy) {
        center.setX(center.getX() + dx);
        center.setY(center.getY() + dy);
    }

    public void resize(double ratio) {
        if (ratio <= 0) {
            throw new IllegalArgumentException("Коэффициент должен +");
        }
        this.xAxis = (int) (xAxis * ratio);
        this.yAxis = (int) (yAxis * ratio);
    }

    public void stretch(double xRatio, double yRatio) {
        if (xRatio <= 0 || yRatio <= 0) {
            throw new IllegalArgumentException("Коэффициенты должены +");
        }
        this.xAxis = (int) (xAxis * xRatio);
        this.yAxis = (int) (yAxis * yRatio);
    }

    public double getArea() {
        return Math.PI * (xAxis / 2) * (yAxis / 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * Math.sqrt((Math.pow(xAxis / 2, 2) + Math.pow(yAxis / 2, 2)) / 2);
    }

    public boolean isInside(int x, int y) {
        double dx = x - center.getX();
        double dy = y - center.getY();
        return (Math.pow(dx, 2) / Math.pow(xAxis / 2, 2)) + (Math.pow(dy, 2) / Math.pow(yAxis / 2, 2)) <= 1;
    }

    public boolean isInside(Point point) {
        return isInside(point.getX(), point.getY());
    }
}
