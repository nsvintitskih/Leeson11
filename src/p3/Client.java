package p3;

public class Client implements Cloneable{
   private int id;
    private String name;
    private Account account;


    public Client(int id, String name,int sum) {
        this.id = id;
        this.name = name;
        this.account = new Account(sum);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(int sum) {
        account.setSum(sum);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", account=" + account +
                '}';
    }

    @Override
    public Client  clone() throws CloneNotSupportedException {
        Client client = (Client) super.clone();
        client.account = (Account) account.clone();
        return client;
    }
}
