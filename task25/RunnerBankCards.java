package task25;

public class RunnerBankCards {
    public static void main(String[] args) {
        SilverCard silverCard = new SilverCard();
        silverCard.setAccountBalance(100);
        System.out.println(silverCard.getAccountBalance());
        System.out.println(silverCard.moneyAfterCash(50));
        silverCard.getBalance();
        silverCard.setAccountBalance(100);
        silverCard.getBalance();
        ////////////
        GoldenCard goldenCard = new GoldenCard();
        goldenCard.setAccountBalance(1000);
        System.out.println(goldenCard.getAccountBalance());
        System.out.println(goldenCard.moneyAfterCash(50));
        goldenCard.getBalance();
        goldenCard.setAccountBalance(1000);
        goldenCard.getBalance();


    }
}
