public class User extends Create_user implements Transaction {

    @Override
    public void deposit(int amt) {
        balance = balance + amt;
        System.out.println("New Balance : " +balance);
    }

    @Override
    public void withdraw(int amt) {
        if (balance >= amt) {
            balance = balance - amt;
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );
        }
    }
    public boolean search(String ac_no) {
        if (accno.equals(ac_no)) {
            return (true);
        }
        return (false);
    }
}
