package MenuDrivenProgramForAccount;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Scanner;

public class Account implements Serializable
{
     String accno;
     String name;
     double balance;

     Account() {}

     Account(String a, String n, double b)
    {
        accno=a;
        name=n;
        balance=b;
    }

    @Override
    public String toString()
    {
        return "Account No: " + accno + "\nName :" + name + "\nBalance :" + balance + "\n";
    }
}