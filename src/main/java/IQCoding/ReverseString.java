package IQCoding;

//Reverse String using your name in java-infosys IQ
public class ReverseString
{
    static void main(String[] args) {
        String str = "Mohammed Ismail Khasab";

        String reverse = " ";

        for(int i = str.length()-1;i>=0;i--)
        {
            reverse = reverse + str.charAt(i);
        }

        System.out.println(reverse);
    }
//        StringBuffer sb = new StringBuffer(str);
//        System.out.println(sb.reverse());
    }
