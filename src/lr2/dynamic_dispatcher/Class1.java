package lr2.dynamic_dispatcher;

public class Class1 {
    int pole;

    public int getPole() {
        return pole;
    }

    public void setPole(int pole) {
        this.pole = pole;
    }

    public Class1(){

    }
    public Class1(int pole){
        this.pole = pole;
    }

    public void print_info(){
        System.out.printf("%d",pole);
    }
}
