package org.example.LineComparison;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        ;
        Line AB = new Line(4,5,8,7 );
        Line CD = new Line (3,4,5,5 );
        boolean equals = AB.equals(CD);
        boolean length = AB.length() == CD.length();

        System.out.println("The lines are equal " +equals);
        System.out.println(("The lengths are " +length));


    }
}
