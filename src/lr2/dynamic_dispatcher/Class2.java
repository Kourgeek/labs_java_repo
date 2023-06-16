package lr2.dynamic_dispatcher;

public class Class2 extends Class1{
    int pole2;

    public int getPole2() {
        return pole2;
    }

    public void setPole2(int pole2) {
        this.pole2 = pole2;
    }

    public Class2(int pole, int pole2) {
        super(pole);
        this.pole2 = pole2;
    }

    @Override
    public void print_info(){
        System.out.printf("%d \t %d",pole,pole2);
    }
}
