package com.company;

public class Main {

    public static void main(String[] args) {

        Integer[] myArray = new Integer[]{5, 4};

        MyArrayList<Integer> myArrayList = new MyArrayList<>(myArray);

        System.out.println(myArrayList.getElementAtIndex(0));
        System.out.println(myArrayList.getElementAtIndex(1));

        myArrayList.add(69);

        System.out.println(myArrayList.getElementAtIndex(2));
        StringCompare comparing = new StringCompare("bee");

        System.out.println(comparing.compareTo("beez"));
    }

}