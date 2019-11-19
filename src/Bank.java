public class Bank {
    private int accountNumber;
    private int balance;
    private String customerName;
    private String customerEmail;
    private int phoneNumber;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void depositFunds(int funds) {
        this.balance += funds;
        System.out.println("Your balance is now " + this.balance);
    }

    public void withDrawFunds(int funds) {
        if (this.balance - funds < 0) {
            System.out.println("You dont have enough money");
        } else {
            this.balance -= funds;
            System.out.println("Your balance is now " + this.balance);
        }
    }

}