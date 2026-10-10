package enumdemo;

//Demo on enum using parameterized constructor and non parameterized constructor
enum Dept2
{
    CS("Mallu","Block A"),IT("Smith","Block B"),CIVIL("Bassu","Block C"),ECE("Byy","Block D");

    String head;
    String Location;

    private Dept2(String head, String Loc)
    {
        this.head = head;
        this.Location = Loc;
    }

    public String getHeadName()
    {
        return head;
    }
    public String getLocation()
    {
        return Location;
    }

    public void display()
    {
        System.out.println(this.name()+" " +this.ordinal());
    }
}

public class EnumDemo2
{
    public static void main(String[] args)
    {
        Dept2 d = Dept2.ECE;

        System.out.println(d.head);
        System.out.println(d.Location);

//        switch(d)
//        {
//            case CS:
//                System.out.println("Head:Mallikarjun \nBlock: A ");
//                break;
//            case IT:
//                System.out.println("Head:Bassu \nBlock: B ");
//                break;
//            case CIVIL:
//                System.out.println("Head:Vishnu \nBlock: C ");
//                break;
//            case ECE:
//                System.out.println("Head:A \nBlock: D ");
//                break;
//        }
    }
}