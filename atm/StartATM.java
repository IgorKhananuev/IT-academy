package atm;

public class StartATM {
    public static void main(String[] args) {
        ATM atm = new ATM();
        System.out.println(atm.setMoney(1,1,1) );
        System.out.println(atm.getMoney());
        atm.setMoney(100,1,10);
        System.out.println(atm.getMoney());
        System.out.println(atm.takeMoney(25000000));
        System.out.println(atm.takeMoney(570));
    }
}
