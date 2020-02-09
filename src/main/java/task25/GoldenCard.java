package task25;

public class GoldenCard extends SilverCard {
    String cardLabel;

    public GoldenCard() {

    }

    public GoldenCard(int accountBalance, int accountNumber, String valid, String cardHolderName) {
        super(accountBalance, accountNumber, valid, cardHolderName);
        this.cardLabel = cardLabel;
    }
}



