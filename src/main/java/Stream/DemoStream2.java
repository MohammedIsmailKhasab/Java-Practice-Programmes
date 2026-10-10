package Stream;

// Write stream logic to excract count of  consonenet  from the given input string
//String  	input="  Java is a programming language";
//output:  Count Of a = 6
//Count Of e = 0
//Count Of i = 2
//Count Of o = 0
//Count Of u = 0
public class DemoStream2
{
    static void main(String[] args)
    {
        String input = "Java is a programming language";

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for(char v : vowels)
        {
            long count = input.toLowerCase()
                              .chars()
                              .filter(ch -> ch == v)
                              .count();

            System.out.println("Count of " + v + " is " + count);
        }
    }
}