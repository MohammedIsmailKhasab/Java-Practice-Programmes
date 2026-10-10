package ValidParanthesis;

//{ [ ( ) ] }
import java.util.Stack;

public class ParenthesisDemo
{
    public static String validParanthasis(String str)
    {
        Stack<Character> pk=new Stack<>();

        for(Character ch: str.toCharArray()){
            if(ch=='{'){
                pk.push('}');
            }

            else if(ch=='['){
                pk.push(']');
            }

            else if(ch=='('){
                pk.push(')');
            }
            else if(pk.isEmpty() || pk.pop() != ch){
                return "false";
            }
        }
        return pk.isEmpty() ? "true":"false";
    }

    static void main(String[] args)
    {
        ParenthesisDemo pd=new ParenthesisDemo();
        System.out.println(pd.validParanthasis(""));
    }
}