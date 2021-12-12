import java.util.ArrayList;
import java.util.Random;

public class Bank {
    /**
     *
     */
    private String name;

    /**
     *
     */
    private ArrayList<User> users;

    /**
     *
     */
    private ArrayList<Account> accounts;

    /**
     * generate a UUID for an user
     * @return this uuid
     */
    public String getNewUserUUID() {
        String uuid;
        Random random = new Random();
        int len = 6;
        boolean isUnique;

        // do looping until we get unique id
        do {
            uuid = "";
            for (int i = 0; i < len; i++) {
                uuid += ((Integer) random.nextInt(10)).toString();
            }

            // check to get a UUID
            isUnique = false;
            for (User u : this.users) {
                if (uuid.compareTo(u.getUUID()) == 0) {
                    isUnique = true;
                    break;
                }
            }

            // check the uuid isUnique
        } while (isUnique);

        return uuid;
    }

    /**
     * generate a UUID for account
     * @return the uuid
     */
    public String getNewAccountUUID() {
        String uuid;
        Random random = new Random();
        int len = 10;
        boolean isUnique;

        // do looping until we get unique id
        do {
            uuid = "";
            for (int i = 0; i < len; i++) {
                uuid += ((Integer) random.nextInt(10)).toString();
            }

            // check to get a UUID
            isUnique = false;
            for (Account account : this.accounts) {
                if (uuid.compareTo(account.getUUID()) == 0) {
                    isUnique = true;
                    break;
                }
            }

            // check the uuid isUnique
        } while (isUnique);

        return uuid;
    }

    /**
     * add an account to the bank
     * @param account -> add account
     */
    public void addAccount(Account account) {
        this.accounts.add(account);
    }
}
