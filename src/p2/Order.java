package p2;

public class Order <T extends  Client /*& Clientable*/>{
    private T account;
    private int sum;

    public Order(T account, int sum) {
        this.account = account;
        this.sum = sum;
    }

    public void execute(){
        if(account.getMoney() - sum>0){
            account.setMoney(account.getMoney() - sum);
            System.out.println("Order is done");
        }else{
            System.out.println("Money not enough");
        }
    }
}
