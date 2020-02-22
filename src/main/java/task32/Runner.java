package task32;

import java.io.*;


public class Runner {

    public static void main(String[] args) throws IOException {
        DataOutputStream fos = new DataOutputStream (new FileOutputStream ("D:/notes.txt"));
        for (int i = 0; i < 21; i++) {
            fos.writeInt ((int) (Math.random ( ) * 100));
        }
        fos.close ( );

        FileInputStream is = new FileInputStream ("D:/notes.txt");
        BufferedReader d = new BufferedReader (new InputStreamReader (is));

        int sum = 0;
        for (int i = 0; i < 21; i++) {
            int st = d.read ( );
            sum += st;
        }
        System.out.print ("arithmetical mean of twenty random numbers is " + sum / 20);
    }
}



