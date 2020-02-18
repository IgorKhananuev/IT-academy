package task31;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Runner {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/1.txt");
        FileWriter writer = new FileWriter("D:/TextWithNumbers.txt", true);
        String text = "kfbvnk15 dffg5dv4g94drf4g  fg12 2494g 9 r4v94  9z1b4f94 434z6gbnf461kl201 50 - 7 nvdklnmf";
        writer.write(text);
        writer.close();

        // count of numbers

        int count = 0;
        ArrayList<Character> characters = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if ((symbol == '0') || (symbol == '1') || (symbol == '2') || (symbol == '3') || (symbol == '4') ||
                    (symbol == '5') || (symbol == '6') || (symbol == '7') || (symbol == '8') || (symbol == '9')) {
                characters.add(symbol);
                count++;
            }
        }

        System.out.println("Numbers founded in text are " + characters);
        System.out.println("Quantity of numders in text = " + count + ";");

        // deleting duplicated numbers
        Set<Character> set = new HashSet<>(characters);
        System.out.println("Numbers without dublicates " + set);
    }
}
