package ru.ivt5.v1;
//Лабораторная 3
public class TestColoredRectangle {
    public static void main(String[] args) {
        System.out.println("Testing ColoredRectangle constructors:");

        ColoredRectangle rect1 = new ColoredRectangle(new Point(0, 0), new Point(4, 3), 100);
        System.out.println("Rect1: TopLeft = " + rect1.getTopLeft() + ", BottomRight = " + rect1.getBottomRight() + ", Color = " + rect1.getColor());

        ColoredRectangle rect2 = new ColoredRectangle(2, 2, 6, 5, 150);
        System.out.println("Rect2: TopLeft = " + rect2.getTopLeft() + ", BottomRight = " + rect2.getBottomRight() + ", Color = " + rect2.getColor());

        ColoredRectangle rect3 = new ColoredRectangle(7, 5, 200);
        System.out.println("Rect3: TopLeft = " + rect3.getTopLeft() + ", BottomRight = " + rect3.getBottomRight() + ", Color = " + rect3.getColor());

        ColoredRectangle rect4 = new ColoredRectangle(255);
        System.out.println("Rect4: TopLeft = " + rect4.getTopLeft() + ", BottomRight = " + rect4.getBottomRight() + ", Color = " + rect4.getColor());

        ColoredRectangle rect5 = new ColoredRectangle();
        System.out.println("Rect5: TopLeft = " + rect5.getTopLeft() + ", BottomRight = " + rect5.getBottomRight() + ", Color = " + rect5.getColor());

        System.out.println("\nTesting methods:");

        rect1.setColor(220);
        System.out.println("Rect1 new color: " + rect1.getColor());

        System.out.println("Rect1 area: " + rect1.getArea());
        System.out.println("Rect1 perimeter: " + rect1.getPerimeter());

        rect1.moveRel(2, 1);
        System.out.println("Rect1 after moving: TopLeft = " + rect1.getTopLeft() + ", BottomRight = " + rect1.getBottomRight());

        System.out.println("Rect1 intersects Rect2: " + rect1.isIntersects(rect2));

        System.out.println("Rect2 is inside Rect1: " + rect1.isInside(rect2));
    }
}