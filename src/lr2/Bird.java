package lr2;

public class Bird extends Animal{
    boolean is_flying;

    public Bird() {
    }

    public Bird(String name, int age, String roar, boolean is_flying) {
        super(name, age, roar);
        this.is_flying = is_flying;
    }

    public boolean isIs_flying() {
        return is_flying;
    }

    public void setIs_flying(boolean is_flying) {
        this.is_flying = is_flying;
    }

    public void printInfo(){
        System.out.printf("Информация об объекте %d \t%s \t%s \t%B",age,name, roar,is_flying);
    }

    public static void main(String[] args) {
        Bird my_bird = new Bird("dendi",15,"chik-chirik",false);
        my_bird.printInfo();
    }
}
