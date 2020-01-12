package strings;

public class Task21 {
    public static void main(String[] args) {
        // Method 1 -  Concatenation of strings
        long startTime1 = System.currentTimeMillis();
        String  line = "";
        for (int i = 0; i <= 50; i++){
            line += "*";
        }
        long timeSpent1 = System.currentTimeMillis() - startTime1;
        System.out.println("Method 1 -  Concatenation of strings");
        System.out.println(line);
        System.out.println("Program's code runtime is " + timeSpent1 + " millisecond(s)"+"\n"+"----------------------");

        // Method 2 - StringBuilder usage
        long startTime2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i <= 50; i++){
            sb.append("*");
        }
        long timeSpent2 = System.currentTimeMillis() - startTime2;
        System.out.println("Method 2 - StringBuilder usage");
        System.out.println(sb);
        System.out.println("Program's code runtime is " + timeSpent2 + " millisecond(s)");
    }
}
