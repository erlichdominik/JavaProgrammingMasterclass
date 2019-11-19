public class VipCustomer {
    private String name;
    private int creditLimit;
    private String emailAdress;

    public VipCustomer() {
        this("Rak",99999,"rakomakoszpako@kwak.trak");
    }

    public VipCustomer(String name, int creditLimit) {
        this(name,creditLimit,"rak@mak.szpak");
    }

    public VipCustomer(String name, int creditLimit, String emailAdress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAdress = emailAdress;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAdress() {
        return emailAdress;
    }
}
