package p3;

public class Main {
    public static void main(String[] args) {
        try {
            Client client = new Client(1, "Ivan",1000);
            System.out.println(client.toString());
            Client client1 = client.clone();

            client1.setName("Pavel");
            client1.setAccount(4000);
            System.out.println(client.toString());
            System.out.println(client1.toString());

        } catch (CloneNotSupportedException exception) {
            System.out.println("Clonable not supported");
        }

    }
}