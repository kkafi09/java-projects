import java.util.Scanner;

public class Email {
    private Scanner sc = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private String password;
    private String departement;
    private int mailboxCapacity;
    private String alternateEmail;

    Email(String firstName, String lastName){
        // created email
        this.firstName = firstName;
        this.lastName = lastName;
        // show the name
        System.out.println("Email Created : " + this.firstName + this.lastName);
        // set Departement
        this.departement = setDepartement();
    }

    public String setDepartement(){
        System.out.println("Enter the departement : \n1. for student\n2. for teacher \n3. for development \n4. for none");
        int choice = sc.nextInt();
        
    }

}
