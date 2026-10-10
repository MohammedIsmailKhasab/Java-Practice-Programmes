package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMaximumNumber
{
    static void main(String[] args)
    {
        List<Integer> numbers= Arrays.asList(10,5,20,15,30);

        int max = numbers.stream()
                .max(Integer::compareTo)
                .get();

        System.out.println("Maximum number is "+max);


    }
}
