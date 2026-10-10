package enumdemo;

enum Dept
{
    CS,IT,CIVIL,ECE,
}
public class EnumDemo
{
    static void main(String[] args)
    {
        Dept d = Dept.CS;

        Dept list[]=Dept.values();
//        System.out.println(d.ordinal());
//        System.out.println(Dept.valueOf("IT"));

        for(Dept x : list)
            System.out.println(x);
    }
}