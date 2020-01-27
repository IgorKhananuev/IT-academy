package task26;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ArrayLists {
    public static void main(String[] args) {
        List<Integer> students = new ArrayList<>();
        students.add(0,3);
        students.add(1,1);
        students.add(2,5);
        students.add(3,2);
        students.add(4,7);
        students.add(5,2);
        students.add(6,9);
        students.add(7,2);
        students.add(8,10);
        students.add(9,6);
        for(int i=0; i<students.size();i++){
                students.removeIf(Predicate.isEqual(1));
                students.removeIf(Predicate.isEqual(2));
            }
        System.out.println("List of student\''s marks, after deleting of all negative marks is " + students);
        }
    }

