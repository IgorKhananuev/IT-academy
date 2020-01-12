package strings;


public class Task20 {

    public static void main(String[] args) {
        int j = 0;
        String str = "wordOne wordTwo wordThee word4Four wordFive wordSix wordSeven worldEight";
        char[] arrString = str.toCharArray();
        int wordQuantity = str.trim().split(" +").length;
        //System.out.println(str.toCharArray());
        char[] arr1 = new char[wordQuantity-1];
        //String str ="";
        for (int i = 0; i < arrString.length; i++) {
            if (arrString[i] == ' ') {
                arr1[j] = arrString[i - 1];
                j++;
            }
        }
        char lastSymbol = str.charAt(str.length() - 1);
        System.out.print(String.valueOf(arr1) + lastSymbol);
    }
}
