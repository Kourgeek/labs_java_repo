package lr2.dynamic_dispatcher;

public class tipa_main {
    public static void main(String[] args) {
        Class1 variable = new Class2(1,2);
        variable.print_info();
        System.out.printf("\n");
        Class1 variable2 = new Class1(1);
        variable2.print_info();
    }
}
