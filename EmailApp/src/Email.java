import java.util.Scanner;

public class Email {
    private final Scanner sc = new Scanner(System.in);
    private final String name;
    private final String email;
    private final String firstName;
    private final String lastName;
    private String departement;
    private String password;
    private final String year = "30rpl";
    private final String defaultSuffix = "smktelkom-mlg.sch.id";
    private int mailboxCapacity = 500;
    private String alternateEmail;

    Email(String name) {
        // set name
        this.name = name;
        String[] splitName = name.split(" ");
        firstName = splitName[0];
        lastName = splitName[splitName.length - 1];

        // show the name
        System.out.println("Your Name : " + name);

        // set Departement
        departement = setDepartement();

        // combine email
        email = firstName.toLowerCase() + "_" + lastName.toLowerCase() + "_" + year + "@" + departement + defaultSuffix;
        showInfo();
        // set password
        int defaultPasswordLength = 8;
        this.password = generatePassword(defaultPasswordLength);
    }

    // set departement
    private String setDepartement() {
        System.out.println("=======================");
        System.out.print("what is your email for : \n1. for student\n2. for teacher \n3. for development \n4. for none\nEnter the departement = ");
        int choice = sc.nextInt();
        if (choice == 1) {
            return "student.";
        } else if (choice == 2) {
            return "teacher.";
        } else if (choice == 3) {
            return "dev.";
        } else if (choice == 4) {
            return "";
        } else {
            throw new IllegalArgumentException("salah masukin");
        }
    }

    // generate password
    private String generatePassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * passwordSet.length());
            password[i] += passwordSet.charAt(random);
        }

        return new String(password);
    }

    // set mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }


    // get password
    public String getPassword() {
        return password;
    }

    // get mailbox
    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    // get alternate email
    public String getAlternateEmail() {
        return alternateEmail;
    }

    // change the password
    private void changePassword(String password) {
        this.password = password;
    }

    // show info
    public void showInfo() {
        System.out.println("\n\n==============");
        System.out.println("YOUR ACCOUNT : ");
        System.out.println("==============");
        System.out.println("Your name = " + name);
        System.out.println("Your email = " + email);
        System.out.println("Your password = " + getPassword());
    }

    public void showDetails() {
        System.out.println("\n\n===================");
        System.out.println("Detail Info : ");
        System.out.println("===================");
        System.out.println("Your name = " + name);
        System.out.println("Your departement = " + departement.replace(".", ""));
        System.out.println("Your email = " + email);
        System.out.println("Your password = " + getPassword());
        System.out.println("Your mailboxcapacity = " + getMailboxCapacity() + "GB");
        System.out.println("Your alternate email = " + getAlternateEmail());
    }

    public void option() {
        char choice = '\0';

        do {
            System.out.print("\n=====================\nWhat do you want todo with the email : \na. show detail\nb. change password\nc. alternate email\nx. exit\nyour option = ");
            choice = sc.next().charAt(0);
            switch (choice) {
                case 'a':
                    showDetails();
                    break;
                case 'b':
                    System.out.println("================");
                    System.out.println("Change Password");
                    System.out.println("================");
                    System.out.print("What is your new password = ");
                    String newPass = sc.next();
                    changePassword(newPass);
                    System.out.println("your password updated");
                    break;
                case 'c':
                    System.out.println("================");
                    System.out.println("Alternate email");
                    System.out.println("================");
                    System.out.print("enter your alternate email = ");
                    String newEmail = sc.next();
                    setAlternateEmail(newEmail);
                    break;
                case 'x':
                    break;
                default:
                    System.out.println("you enter invalid option");
            }
        } while (choice != 'x');
    }
}
