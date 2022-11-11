public class Main {
    public static void main(String[] args) {
        // Create Greeting object with Lambda expression:
        Greeting obj = (String name) -> {
            return "Hi " + name;
        };

        Thread t = new Thread(Main::print);
        t.start();
        System.out.println(obj.greeting("Tran"));
        System.out.println(obj.hello("Tran"));
    }

    public static void print() {
        System.out.println("Hello World");
    }
}