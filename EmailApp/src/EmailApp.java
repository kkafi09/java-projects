public class EmailApp {
    public static void main(String[] args) {
        Email email = new Email("Muhammad Kafanal Kafi");
        email.setMailboxCapacity(200);
        email.showInfo();
        email.option();
    }
}
