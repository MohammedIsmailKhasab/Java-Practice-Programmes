package Collections;

import java.util.TreeSet;

class Account1 implements Comparable<Account1>
{
    int accId;
    String accName;
    double balance;

    public Account1(int accId, String accName, double balance) {
        this.accId = accId;
        this.accName = accName;
        this.balance = balance;
    }

    public int compareTo(Account1 a)
    {
        return this.accId - a.accId;
    }

    @Override
    public String toString()
    {
        return accId + " " + accName+" "+balance;
    }

}

public class TreeSetwithAccountType
{
    public static void main(String[] args)
    {
        TreeSet<Account1> ts = new TreeSet<Account1>();
        ts.add(new Account1(1, "A", 100.00));
        ts.add(new Account1(2, "B", 200.00));
        ts.add(new Account1(3, "C", 300.00));

        System.out.println(ts);
    }
}