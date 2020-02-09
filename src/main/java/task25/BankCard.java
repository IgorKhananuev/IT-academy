package task25;

abstract class BankCard {

    int accountBalance;
    private int accountNumber;
    private String valid;
    private String cardHolderName;

    public BankCard() {
    }

    public BankCard(int accountBalance, int accountNumber, String valid, String cardHolderName) {
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
        this.valid = valid;
        this.cardHolderName = cardHolderName;
    }

    public BankCard(int accountNumber, String valid, String cardHolderName) {
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public int setAccountBalance(int accountBalance) {
        return this.accountBalance += accountBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }
}














