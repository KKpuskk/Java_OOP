package ru.ivt5.v1;

public class TestIntArray {
    public static void main(String[] args) {
        IntArray array1 = new IntArray(5);
        IntArray array2 = new IntArray(5);

        for (int i = 0; i < 5; i++) {
            array1.set(i, i + 1);
            array2.set(i, (i + 1) * 2);
        }

        System.out.println("1 массив:");
        array1.printArray();

        System.out.println("2 массив:");
        array2.printArray();

        IntArray sumArray = array1.add(array2);
        System.out.println("Сумма:");
        sumArray.printArray();

        IntArray diffArray = array1.subtract(array2);
        System.out.println("Разность:");
        diffArray.printArray();

        System.out.println("1 массив, * на 3:");
        array1.multiply(3);
        array1.printArray();

        System.out.println("1 массив, / на 3:");
        array1.divide(3);
        array1.printArray();

        array1.printElement(0);
        array1.printElement(4);
    }
}
