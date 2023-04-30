package lr2;

public class bank implements Acconting {

    float balance;

    public bank(){
        this.balance = 0;
    }
    public bank(float balance){
        this.balance = balance;
    }
    @Override
    public float get_balance() {
        return balance;
    }

    @Override
    public void deposit(float sum) {
        this.balance = balance + sum;

    }

    @Override
    public void withdraw(float sum) {
        this.balance = balance - sum;
    }

    public static void main(String[] args) {
        bank user = new bank();

        System.out.printf("%f\n",(float)(user.get_balance()));

        user.deposit(100);
        user.deposit(100);


        System.out.printf("%f\n",(float)(user.get_balance()));

        user.withdraw(100);
        user.withdraw(50);


        System.out.printf("%f\n",(float)(user.get_balance()));

    }

}
