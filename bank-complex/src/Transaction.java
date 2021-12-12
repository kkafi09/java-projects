import java.util.Date;

public class Transaction {
    /**
     * the amount of the transaction
    */
    private double amount;

    /**
     * the time and date of this transaction
    */
    private Date timestamp;

    /**
    * a memo for this transaction
    */
    private String memo;

    /**
     * the account in which the transaction was performed
    */
    private Account inAccount;

    /**
     * create a new transaction
     * @param amount -> amount of transaction
     * @param inAccount -> the account that transaction belongs to
     */
    public Transaction(double amount, Account inAccount) {
        this.amount = amount;
        this.inAccount = inAccount;
        this.timestamp = new Date();
        this.memo = "";
    }

    /**
     * create a new transaction
     * @param amount -> amount of transaction
     * @param memo -> the memo of the transaction
     * @param inAccount -> the account that transaction belongs to
     */
    public Transaction(double amount, String memo, Account inAccount) {
        // call the arguments' constructor first
        this(amount, inAccount);
        // set the memo
        this.memo = memo;
    }
}
