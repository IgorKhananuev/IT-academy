package Task27;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collections {
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
            System.out.println("Collection with dublicate elements  " + list);

            Set<Integer> set = new HashSet<Integer>(list);

            System.out.println("Collection without dublicate elements  " + set);
        }
    }


