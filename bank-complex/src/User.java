import java.util.ArrayList;

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
}
