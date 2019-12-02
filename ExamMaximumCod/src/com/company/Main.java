package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(max(23, 45, 0) );
    }
    public static <T extends Comparable<T>> T max(T a, T b, T c)
    {
        T m = a;

        if(b.compareTo(a) > 0)
            m = b;
        return m;
    }
}
