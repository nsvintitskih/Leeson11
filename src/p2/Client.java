package p2;

import p1.Clientable;

public class Client <T extends Integer, S> {


    private T id;
    private S name;
    private int money;
    

    public Client(T id, S name, int money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public S getName() {
        return name;
    }

    public void setName(S name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
