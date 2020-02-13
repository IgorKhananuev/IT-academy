package serialization;

import java.io.*;

public class Serialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Cat cat = new Cat(4, 1, "green");
        System.out.println(cat.toString());

        FileOutputStream fos = new FileOutputStream("cat.dat");
        ObjectOutputStream ois = new ObjectOutputStream(fos);
        ois.writeObject(cat);
        fos.close();
        ois.close();

        FileInputStream fis = new FileInputStream("cat.dat");
        ObjectInputStream obis = new ObjectInputStream(fis);
        Object object = obis.readObject();
        fis.close();
        obis.close();

        Cat cat1  = (Cat) object;
        System.out.println(cat1.toString());
        System.out.println();
    }
}

