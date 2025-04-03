import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NumberRange {
    public static void main(String[] args) {
        int[] arr = {2,3,11,11,1,12,14,20,24,30,34,40,44,50,54};
       List<Integer> integerList = Arrays.stream(arr).boxed().toList();
       Map<Integer,List<Integer>> ans = integerList.stream()
               .collect(Collectors.groupingBy(x->(x/10)*10,
                       LinkedHashMap::new,
                       Collectors.collectingAndThen(
                               Collectors.toList(),list->list.stream().sorted().collect(Collectors.toList())
                       )));

        System.out.println(ans);
    }
}
