public class Main {
    public static void main(String[] args) {
        Account account = new Account("Jan Kowalski", 500, "1234567890");

        try {
            account.transfer(1000);
        } catch (NotEnoughMoneyException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Another exception: " + e.getMessage());
        } finally {
            System.out.println("\n" +
                    "Current account balance: " + account.getBalance());
        }
    }
}