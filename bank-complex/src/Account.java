import java.util.ArrayList;

public class Account {
    /**
     * The name of account
     */
    private String name;

    /**
     * the account id number
    */
    private String UUID;

    /**
     * 
    */
    private User holder;

    /**
     * current balance of the account
    */
    private ArrayList<Transaction> transactions;

    /**
     * create new Account
     * @param name -> account's name
     * @param holder -> user that hold this account
     * @param theBank -> the bank that issues this account
     */
    public Account(String name, User holder, Bank theBank) {
        // set the account name and holder
        this.name = name;
        this.holder = holder;

        // get new account uuid
        this.UUID = theBank.getNewAccountUUID();

        // transaction
        this.transactions = new ArrayList<Transaction>();

        // add to holder bank and list
        holder.addAccount(this);
        theBank.addAccount(this);
    }

    /**
     * get the account id
     * @return the uuid
     */
    public String getUUID() {
        return this.UUID;
    }
}
