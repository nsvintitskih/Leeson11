package p2;

public class Main {
    public static void main(String[] args) {
        Client  <Integer, String> client = new  Client<Integer, String>(10, "Ivan", 200000);
        Order<Client> clientOrder = new Order<Client>(client, 100);
        clientOrder.execute();
        System.out.println(client.getMoney());
    }
}
