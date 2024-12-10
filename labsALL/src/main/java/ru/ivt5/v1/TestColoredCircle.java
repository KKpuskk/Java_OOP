package ru.ivt5.v1;
//Лабораторная 3
public class TestColoredCircle {
    public static void main(String[] args) {
        System.out.println("Testing ColoredCircle constructors:");

        ColoredCircle circle1 = new ColoredCircle(new Point(3, 4), 5, 120);
        System.out.println("Circle1: Center = " + circle1.getCenter() + ", Radius = " + circle1.getRadius() + ", Color = " + circle1.getColor());

        ColoredCircle circle2 = new ColoredCircle(1, 2, 8, 200);
        System.out.println("Circle2: Center = " + circle2.getCenter() + ", Radius = " + circle2.getRadius() + ", Color = " + circle2.getColor());

        ColoredCircle circle3 = new ColoredCircle(10, 90);
        System.out.println("Circle3: Center = " + circle3.getCenter() + ", Radius = " + circle3.getRadius() + ", Color = " + circle3.getColor());

        ColoredCircle circle4 = new ColoredCircle(150);
        System.out.println("Circle4: Center = " + circle4.getCenter() + ", Radius = " + circle4.getRadius() + ", Color = " + circle4.getColor());

        ColoredCircle circle5 = new ColoredCircle();
        System.out.println("Circle5: Center = " + circle5.getCenter() + ", Radius = " + circle5.getRadius() + ", Color = " + circle5.getColor());

        circle1.setColor(255);
        System.out.println("Circle1 after changing color: " + circle1.getColor());

        System.out.println("Testing color boundary conditions:");
        try {
            circle1.setColor(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected exception: " + e.getMessage());
        }

        try {
            circle1.setColor(256);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected exception: " + e.getMessage());
        }
    }
}