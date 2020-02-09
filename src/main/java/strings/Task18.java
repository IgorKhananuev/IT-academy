package strings;

public class Task18 {
    public static void main(String[] args) {
        // first method
        String string = "! . , ? - : ; 9 9 7 ";
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char symbol = string.charAt(i);
            if ((symbol == '!') || (symbol == '.') || (symbol == ',') || (symbol == '?') || (symbol == '-') ||
                    (symbol == ':') || (symbol == ';')) {
                count++;
            }
        }
        System.out.println("Quantity of punctuation marks in string named \"string\" equals " + count + ";");

        // second method
        String string1 = "! . , ? - : ;";
        int count1 = 0;
        for (int i = 0; i < string1.length(); i++) {
            char[] symbol = string1.toCharArray();
            if ((symbol[i] == '!') || (symbol[i] == '.') || (symbol[i] == ',') || (symbol[i] == '?') ||
                    (symbol[i] == '-') || (symbol[i] == ':') || (symbol[i] == ';')) {
                count1++;
            }
        }
        System.out.println("Quantity of punctuation marks in string named \"string\" equals " + count1 + ";");
    }
}


