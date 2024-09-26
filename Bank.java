// package bank;

class Account {
    public String name;
    protected String email;
    private int balance;

    // Getter
    public int getBalance() {
        return balance;
    }
    // Setter
    public void setBalance(int balance) {
        this.balance = balance;
    }
}

public class Bank {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name = "John";
        a1.email = "johndoe@google.co.in";
        a1.setBalance(1000);
        System.out.println(a1.getBalance());
    }
}
