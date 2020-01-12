package strings;

public class Task19 {
    public static void main(String[] args) {
        String string = "    word1  word2 word3     word4,              word5    word6 word7 ";
        //System.out.println(string.trim());
        int wordQuantity = string.trim().split(" +").length;
        System.out.println("Quantity of words in string named \"string\" equals " + wordQuantity);
    }
}
