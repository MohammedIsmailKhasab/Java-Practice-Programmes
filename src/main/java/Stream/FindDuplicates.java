package Stream;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Arrays;

public class FindDuplicates
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(1,2,3,2,4,5,3,6);

        Set<Integer> duplicates = new HashSet<>();

        numbers.stream()
                .filter(n -> !duplicates.add(n))
                .forEach(System.out::println);
    }
}