package ru.ivt5.v1;

import org.w3c.dom.ls.LSOutput;

public class IntArray {
    private int[] array;

    public IntArray(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("Размер массива должен быть неотриц.");
        }
        this.array = new int[size];
    }

    public int get(int index) {
        checkIndex(index);
        return array[index];
    }

    public void set(int index, int value) {
        checkIndex(index);
        array[index] = value;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Вне границ массива");
        }
    }

    public IntArray add(IntArray other) {
        if (this.array.length != other.array.length) {
            throw new IllegalArgumentException("Массивы должны быть одного размера");
        }
        IntArray result = new IntArray(this.array.length);
        for (int i = 0; i < this.array.length; i++) {
            result.set(i, this.get(i) + other.get(i));
        }
        return result;
    }

    public IntArray subtract(IntArray other) {
        if (this.array.length != other.array.length) {
            throw new IllegalArgumentException("Массивы должны быть одного размера");
        }
        IntArray result = new IntArray(this.array.length);
        for (int i = 0; i < this.array.length; i++) {
            result.set(i, this.get(i) - other.get(i));
        }
        return result;
    }

    public void multiply(int scalar) {
        for (int i = 0; i < this.array.length; i++) {
            this.array[i] *= scalar;
        }
    }

    public void divide(int scalar) {
        if (scalar == 0) {
            throw new IllegalArgumentException("Деление на ноль - смерть");
        }
        for (int i = 0; i < this.array.length; i++) {
            this.array[i] /= scalar;
        }
    }

    public void printElement(int index) {
        System.out.println("Элемент массива по индексу " + index + ": " + get(index));
    }

    public void printArray() {
        System.out.print("Массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}