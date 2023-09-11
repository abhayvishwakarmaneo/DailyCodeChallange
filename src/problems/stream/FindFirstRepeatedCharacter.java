package problems.stream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindFirstRepeatedCharacter {
    public static void main(String[] args) {
//        String input = "Java Articles are Awesome";
        String input = "being";

//        IntStream chars1 = input.chars();
//        Stream<Character> characterStream = chars1.mapToObj(value -> Character.toLowerCase((char) value));
//        LinkedHashMap<Character, Long> collect = characterStream.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
//        Set<Map.Entry<Character, Long>> entries = collect.entrySet();
//        Stream<Map.Entry<Character, Long>> stream = entries.stream();
//        Stream<Map.Entry<Character, Long>> entryStream = stream.filter(characterLongEntry -> characterLongEntry.getValue() > 1L);
//        Stream<Character> characterStream1 = entryStream.map(characterLongEntry -> characterLongEntry.getKey());
//        Optional<Character> first = characterStream1.findFirst();
//        Character character = first.orElseGet(() -> null);
//        System.out.println(character);

        Character character1 = input.chars()
                .mapToObj(value -> Character.toLowerCase((char) value))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(characterLongEntry -> characterLongEntry.getValue() > 1L)
                .map(characterLongEntry -> characterLongEntry.getKey())
                .findFirst().get();
        System.out.println(character1);
    }
}
