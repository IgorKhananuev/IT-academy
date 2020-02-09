package task25;

import task25.interfaces.CardOperations;

public class SilverCard extends BankCard implements CardOperations {

    SilverCard() {
    }

    public SilverCard(int accountBalance, int accountNumber, String valid, String cardHolderName) {
        super(accountBalance, accountNumber, valid, cardHolderName);
    }

    @Override
    public void getBalance() {
        System.out.println(getAccountBalance());
    }

    @Override
    public int moneyAfterCash(int needMoney) {
        return accountBalance = (getAccountBalance() - needMoney);
    }
}

