package com.company;

public class MyArrayList<T> {

    private T[] array;

    public MyArrayList(T[] array) {
        this.array = array;
    }

    public void add(T obj) {
        T[] newArray = (T[]) new Object[array.length + 1];
        // what we're copying, the position in which we're beginning the copy,
        // the destination of the copy, what index to begin copying in, number of elements being copied
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[newArray.length - 1] = obj;
        this.array = newArray;
    }

    public T[] unbox() {
        return array;
    }

    public T getElementAtIndex(int index) {
        return array[index];
    }
}
