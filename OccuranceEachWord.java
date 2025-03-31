import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceEachWord {
    public static void main(String[] args) {
        String s = "I am am practicing streams api in java java";
        Map<String,Long> ans = Arrays.stream(s.split(" "))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(ans);
    }
}
