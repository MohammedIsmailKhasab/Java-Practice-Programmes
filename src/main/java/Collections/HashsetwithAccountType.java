package Collections;

import java.util.HashSet;

class Account
{
    int accId;
    String accName;
    double balance;

    public Account(int accId, String accName, double balance)
    {
        this.accId = accId;
        this.accName = accName;
        this.balance = balance;
    }

    @Override
    public String toString()
    {
        return accId+" "+accName+" "+balance;
    }
}

public class HashsetwithAccountType
{
    static void main(String[] args)
    {
        HashSet<Account> set = new HashSet<Account>();

        set.add(new Account(1,"A",100));
        set.add(new Account(2,"B",200));

        for(Account a:set)
        {
            System.out.println(a);
        }
    }
}