import java.util.Arrays;

public class SpecifiedVowels {
    public static void main(String[] args) {
        String s = "I am practicing streams api in java";
        Arrays.stream(s.split(" ")).
                filter(x->x.replaceAll("[^aeiouAEIOU]", "").length()==2).forEach(System.out::println);
    }
}
