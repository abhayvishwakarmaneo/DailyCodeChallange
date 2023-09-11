package problems.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountElementOccurance {
    public static void main(String[] args) {
        List<String> arr = Arrays.asList("java", "ruby", "python", "angular", "java", "HTML", "angular", "java");

//        HashMap<String, Integer> map = new HashMap<>();
//        arr.forEach(a -> map.put(a, map.getOrDefault(a, 0) + 1));
//        map.forEach((k, v) -> System.out.println(k + ", "+v));

        arr.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting())).forEach((s, count) -> System.out.println(s+","+count));
    }
}