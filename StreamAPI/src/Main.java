import java.util.Arrays;
import java.util.List;

public class Main {
    List<Integer> numbers = Arrays.asList(2,5,3,4,7,8,1);

    public static void main(String[] args) {

        System.out.println("Hello world!");

        //List<Integer> numbersm = Arrays.asList(2,5,3,4,7,8,1);


    }

    public void withStream() {
        long count = numbers.stream().filter(num -> num % 2 == 0).count();

    }
}