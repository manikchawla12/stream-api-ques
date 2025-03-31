import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestLengthCount {
    public static void main(String[] args) {
        String s = "I am practicing streams api in java";
       int ans =  Arrays.stream(s.split(" ")).map(x->x.length())
               .sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(ans);
    }
}
