package com.company;

import java.util.Comparator;

public class StringCompare implements Comparable<String> {

    private String myString;

    public StringCompare(String myString) {
        this.myString = myString;
    }

    @Override
    public int compareTo(String o) {

        for (int i = 0; i < myString.length() - 1; i++) {
            char c = myString.charAt(i);
            char ob = o.charAt(i);
            if (c > ob) {
                return 1;
            }
            if (c < ob) {
                return -1;
            }
        }
        if (o.length() > myString.length()) {
            return 1;
        }

        if (myString.length() > o.length()) {
            return -1;
        }
        return 0;
    }
}
