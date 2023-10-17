package p3;

public class Account implements Cloneable{

    private int sum;

    public Account( int sum) {

        this.sum = sum;
    }



    public int getSum() {
        return sum;
    }

    public void setSum (int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Account{" +
                "sum=" + sum +
                '}';
    }

    @Override
    protected Account clone() throws CloneNotSupportedException {
        return(Account) super.clone();
    }
}
