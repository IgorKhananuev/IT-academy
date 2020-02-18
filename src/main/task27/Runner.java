package task27;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Runner {
        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            list.add(5);
            list.add(5);
            list.add(6);
            list.add(6);
            list.add(7);
            list.add(7);
            list.add(8);
            list.add(8);
            list.add(9);
            list.add(9);
            list.add(10);
            list.add(10);
            System.out.println("Collection with duplicate elements  " + list);

            // deleting duplicated elements
            Set<Integer> set = new HashSet<Integer>(list);

            System.out.println("Collection without duplicate elements  " + set);
        }
    }


