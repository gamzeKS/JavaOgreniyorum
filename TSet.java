import java.util.TreeSet;

public class TSet {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(1022);
        numbers.add(1);
        numbers.add(-10);
        numbers.add(22);

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }}