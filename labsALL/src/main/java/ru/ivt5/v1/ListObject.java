package ru.ivt5.v1;

//Lab 1.5

public class ListObject {
    private int[] array;

    public ListObject(int[] array) {
        this.array = array;
    }

    public ListObject(int N) {
        this.array = new int[N];
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getItemWithCheck(int n) throws IndexOutOfBoundsException {
        if (this.array.length > n) {
            return this.array[n];
        }
        else {
            throw new IndexOutOfBoundsException();
        }
    }

    public ListObject add(ListObject addedList) {
        int[]  array1 = addedList.getArray();
        if (array1.length == this.array.length) {
            int[] array3 = new int[array1.length];
            for (int i = 0; i < array1.length; i++) {
                array3[i] = array[i] + array1[i];
            }
            return new ListObject(array3);
        }
        else {
            return null;
        }
    }

    public ListObject subs(ListObject addedList) {
        int[]  array1 = addedList.getArray();
        if (array1.length == this.array.length) {
            int[] array3 = new int[array1.length];
            for (int i = 0; i < array1.length; i++) {
                array3[i] = array[i] - array1[i];
            }
            return new ListObject(array3);
        }
        else {
            return null;
        }
    }
}
