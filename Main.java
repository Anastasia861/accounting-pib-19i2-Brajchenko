import program.accounting.Account;

import java.math.BigDecimal;

public final class Main {

    public static void main(String[] args) {
        var comment = "Покупатель приобрел 5 кружек по 90 рублей";
        var balance = new BigDecimal(450);
        var quantity = 5;

        var credit = Account.getInstance(0);
        var debit = Account.getInstance(1);

        Account.MakeTransaction(credit.getID(), quantity, debit.getID(), quantity, balance, comment);
    }
}
