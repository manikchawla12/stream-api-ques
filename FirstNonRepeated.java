import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeated {
    public static void main(String[] args) {
        String s = "Hello WorlHd";
//        String ans = Arrays.stream(s.split("")).filter(c->s.indexOf(c)==s.lastIndexOf(c))
//                .findFirst().get();
       char ans = s.chars().mapToObj(c->(char)c).collect(Collectors
                       .groupingBy(Function.identity(),
                               LinkedHashMap::new,
                               Collectors.counting()))
                .entrySet().stream()
               .filter(m->m.getValue()==1)
               .map(m->m.getKey())
               .findFirst().get();
        System.out.println(ans);
    }
}
