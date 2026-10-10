package Interfaces;

//callback method using interfaces
interface Member
{
    void callback();
}

class Store
{
    Member members[]=new Member[10];
    int count=0;

    void register(Member m)
    {
        members[count++]=m;
    }

    void inviteSale()
    {
        for(int i=0;i<count;i++)
        {
            members[i].callback();
        }

    }
}

class Customer implements Member
{
    String name;

    Customer(String n)
    {
        name=n;
    }

    public void callback()
    {
        System.out.println("OK,I Will Visit " +name);
    }
}
public class InterfaceExample4
{
    public static void main(String[] args)
    {
        Store st=new Store();
        Customer c1=new Customer("John");
        Customer c2=new Customer("Sam");

        st.register(c1);
        st.register(c2);

        st.inviteSale();
    }
}