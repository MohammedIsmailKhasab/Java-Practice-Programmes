package Collections;

import java.util.TreeSet;

//Demo On TreeSet
public class Emp
{
    int empId;
    String empName;

    public  Emp(int empId, String empName)
    {
        this.empId=empId;
        this.empName=empName;
    }

    public int getEmpId()
    {
        return empId;
    }
    public void setEmpId(int empId)
    {
        this.empId=empId;
    }
    public String getEmpName()
    {
        return empName;
    }

    public void setEmpName(String empName)
    {
        this.empName=empName;
    }

    public static void main(String[] args)
    {
        TreeSet<Emp> ts =new TreeSet<Emp>();
        ts.add(new Emp(12,"Abdullah"));
        ts.add(new Emp(23,"Rahman"));
        ts.add(new Emp(24,"Shafi"));
        System.out.println(ts);
    }
}