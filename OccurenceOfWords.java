import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceOfWords {
    public static void main(String[] args) {
        String s = "Mississippi";
//        Map<String,Long> ans = Arrays.stream(s.split(""))
//                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Map<String,Long> ans = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(x->x,Collectors.counting()));
        System.out.println(ans);
    }
}
