import java.util.Arrays;
import java.util.Comparator;

public class StringLength {
    public static void main(String[] args) {
        String s = "I am practicing stream apis";
        String ans = Arrays.stream(s.split(" ")).max(Comparator.comparing(String::length)).get();
        System.out.println("The biggest string: "+ ans);

    }
}
