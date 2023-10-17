package p1;//обобщение(джинерики)

public class Main {
    public static void main(String[] args) {
        Client<Integer> client = new Client<Integer>(1234, "Ivanov Ivan");
        int clientId = (int)client.getId();
        System.out.println(clientId);

        Client<String> client1 = new Client<String>("cid1234", "Ivanov Ivan");
        System.out.println(client1.getId());

        Client<String> client2 = new Client<String>("1234", "Ivanov Ivan");
        String clId = client2.getId();
        System.out.println(clId);

        Client2 client21 = new Client2(1234, "Ivanov Ivan");

        Integer[] mas =  {1,2,3,4};
        String[] mas1 = {"p1", "p2", "p3"};
        Info info = new Info();
        info.<Integer>printInfo(mas);
        info.<String>printInfo(mas1);

    }
}