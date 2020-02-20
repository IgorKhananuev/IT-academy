package task28;

import java.util.*;

public class Runner {

    public static void main(String[] args) {
        List < Integer > pupilesMarks = new ArrayList <> ( );
        pupilesMarks.add (7);
        pupilesMarks.add (7);
        pupilesMarks.add (9);
        pupilesMarks.add (9);
        pupilesMarks.add (8);
        pupilesMarks.add (3);
        pupilesMarks.add (5);
        pupilesMarks.add (4);
        pupilesMarks.add (8);

        int max = pupilesMarks.get (0);
        int i = 0;

        for (Iterator < Integer > itr = pupilesMarks.iterator ( ); itr.hasNext ( ); ) {
            itr.next ( );
            if (pupilesMarks.get (i + 1) > max) {
                max = pupilesMarks.get (i + 1);
            }
            i++;
            if (i == pupilesMarks.size ( ) - 1) {
                break;
            }
        }
        System.out.println ("Maximal mark in list is = " + max);
    }
}
