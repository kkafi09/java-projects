import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.security.MessageDigest;

public class User {
	/**
	 * The first name of the user
	 */
	private String firstName;

	/**
	 * The last name of the user 
	 */
	private String lastName;

	/**
	 * The ID number of the user
	 */
	private String uuid;

	/**
	 * the MD5 Hash of the user's pin number
	 */
	private byte pinHash[];

	/**
	 * the list accounts for this user
	 */
	private ArrayList<Account> accounts;


	/**
	 * create new user
 	 * @param firstName -> user's firstname
	 * @param lastName -> user's lastname
	 * @param pin -> user's pin
	 * @param theBank -> user's bank
	 */
	public User(String firstName, String lastName, String pin, Bank theBank){
		// set user's name
		this.firstName = firstName;
		this.lastName = lastName;

		// store the pin's MD5, rather than original value, for security
		try{
			MessageDigest md = MessageDigest.getInstance("MD5");
			this.pinHash = md.digest(pin.getBytes());
		} catch(NoSuchAlgorithmException e){
			System.err.println("algorithm password error");
			e.printStackTrace();
			System.exit(1);
		}

		// get uuid for user
		this.uuid = theBank.getNewUserUUID();

		// create empty list of account
		this.accounts = new ArrayList<Account>();

		// print log message
		System.out.printf("New user %s, %s with ID %s create\n", lastName, firstName, this.uuid);
	}

	/**
	 * add an account for the user
	 * @param account
	 */
	public void addAccount(Account account){
		this.accounts.add(account);
	}

	/**
	 * get the user id
	 * @return the uuid
	 */
	public String getUUID(){
		return this.uuid;
	}
}
