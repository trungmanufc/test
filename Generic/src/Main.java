import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<Integer> test = new ArrayList<>();
        test.add(3);
        test.add(6);

        Consumer<Integer> method = (n) -> {System.out.println(n);
                                        System.out.println("There is " + n + " in the collection");};
        test.forEach(method);

        StringFunction med = (s) -> (s) + "???";
        StringFunction test2 = (s) -> (s) + "!!!!";

        System.out.println(test2.run("vfsfydgfds"));
    }

    @FunctionalInterface
    interface StringFunction {
        String run(String str);
    }
}