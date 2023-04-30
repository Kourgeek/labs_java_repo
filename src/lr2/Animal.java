package lr2;

public class Animal {
    String name;
    int age;
    String roar;

    public Animal(){}
    public Animal(String name,int age,String roar){
        this.age = age;
        this.name = name;
        this.roar = roar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRoar() {
        return roar;
    }

    public void setRoar(String roar) {
        this.roar = roar;
    }
}
