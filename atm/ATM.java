package atm;

import org.w3c.dom.ls.LSOutput;

public class ATM {

    private int nominal20;
    private int nominal50;
    private int nominal100;
    private int quantity = 0;

    public ATM() {

    }

    public ATM(int nominal20, int nominal50, int nominal100) {
        this.nominal20 = nominal20;
        this.nominal50 = nominal50;
        this.nominal100 = nominal100;
    }

    int setMoney(int nominal20, int nominal50, int nominal100) {
        System.out.print("Add money into ATM ");
        return this.quantity = nominal20 * 20 + nominal50 * 50 + nominal100 * 100 + quantity;
    }

    int getMoney() {
        System.out.print("Quantity of money into ATM is ");
        return quantity;
    }

    boolean takeMoney(int takeOfMoney) {
        if (takeOfMoney <= quantity) {
            int[] nominal = {20, 50, 100};
            int[] count = new int[nominal.length];
            int i = nominal.length - 1;

            while (i != -1) {
                count[i] = takeOfMoney / nominal[i];
                takeOfMoney %= nominal[i];
                i--;
            }
            System.out.println("Operation successful");
            for (int j = 0; j < count.length; j++) {
                System.out.println("Nominal " + nominal[j] + " = " + count[j] + " banknotes");
            }
            return true;
        }
        System.out.println("There are not enough money into ATM. Request denied");
        return false;
    }
}








