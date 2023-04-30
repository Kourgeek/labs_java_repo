package lr2;

public class Dog extends Animal{

    String poroda;
    float price;

    public Dog() {
    }

    public Dog(String name, int age, String roar,String poroda,float price) {
        super(name, age, roar);
        this.poroda = poroda;
        this.price = price;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void printInfo(){
        System.out.printf("Информация об объекте %d \t%s \t%s \t%f",age,name, roar,price);
    }

    public static void main(String[] args) {
        Dog dog = new Dog("bobik",50,"gav-gav","terier",50000);
        dog.printInfo();
    }

}
