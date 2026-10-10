package Stream;

import java.util.Arrays;
import java.util.stream.Collectors;

//Reverse each order (order stays same)
//Input - hello world java
//o/p - olleh dlrow avaj
public class ReverseEachWord
{
    public static void main(String[] args)
    {
        String input = "Hello World java";

        String output = Arrays.stream(input.split(" "))
                              .map(word -> new StringBuffer(word).reverse().toString())
                              .collect(Collectors.joining(" "));

        System.out.println("Input : " + input);
        System.out.println("Output : " + output);
    }
}