import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "dabcadefg";
        //s.chars().distinct().mapToObj(x->(char)x).forEach(System.out::print);
        //Arrays.stream(s.split("")).distinct().forEach(System.out::print);
        String a = Arrays.stream(s.split("")).distinct().collect(Collectors.joining());
        System.out.println(a);
    }
}
