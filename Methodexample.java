public class Methodexample {

    // no parameter, no return type
    static void display() {
        System.out.println("Hello World");
    }

    // parameter, no return type
    static void greet(String a) {
        System.out.println("Hello " + a);
    }

    // parameter with return type
    static int sum(int a, int b) {
        return a + b;
    }

    // no parameter with return type
    static int display1() {
        return 10;
    }

    public static void main(String[] args) {
        display();
        greet("Kishore");
        System.out.println(sum(10, 20));
        System.out.println(display1());
    }
}
