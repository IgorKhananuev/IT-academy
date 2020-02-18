package task30;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Runner {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/1.txt");
        FileWriter writer = new FileWriter("D:/TextWithMarks.txt", true);
        String text = "«Have no fear of    perfection; you will never reach it». !!!";
        writer.write(text);
        writer.close();

        // count of words
        int n = 0;
        int words = 0;
        for (int i = 1; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                n++;
            } else {
                n = 0;
            }
            if (n == 1) {
                words += 1;
            }
        }
        System.out.println("Quantity of words in text = " + words);

        // count of punctuation marks

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if ((symbol == '!') || (symbol == '.') || (symbol == ',') || (symbol == '?') || (symbol == '-') ||
                    (symbol == ':') || (symbol == ';') || (symbol == '«') || (symbol == '»')) {
                count++;
            }
        }

        System.out.println("Quantity of punctuation marks in text = " + count + ";");
    }
}



