import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedChar {
    public static void main(String[] args) {
        String s = "Heollo World";

        Map<String,Long> mapChar = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()));
       String ans = mapChar.entrySet().stream()
                        .filter(m->m.getValue()>1)
                                .map(m->m.getKey())
                                        .findFirst().get();

        System.out.println(ans);
    }
}
