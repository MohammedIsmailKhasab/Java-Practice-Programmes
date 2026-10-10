package Encapsulation;

//Demo On Encapsulation
public class Employee
{
     private int empid;
     public void setEmpid(int emid)
     {
         empid=emid;
     }

     public int getEmpid()
     {
         return empid;
     }

     static class Company
     {
         public static void main(String[] args)
         {
             Employee e = new Employee();
             e.setEmpid(4600397);
             System.out.println(e.getEmpid());
         }
     }
}