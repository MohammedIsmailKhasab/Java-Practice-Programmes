package Constructor;

public class StudentDemo
{
    private int rollNo;
    private String Name;
    private String dept;
    private String subjects;

    StudentDemo(int rollNo, String Name, String dept, String subjects)
    {
        this.rollNo = rollNo;
        this.Name = Name;
        this.dept = dept;
        this.subjects = subjects;
    }

    public int getRollNo()
    {
        return rollNo;
    }

    public String getName()
    {
        return Name;
    }

    public String getDept()
    {
        return dept;
    }

    public String getSubjects()
    {
        return subjects;
    }

    public void setdept(String mn)
    {
        dept = mn;
    }
    public void setsubjects(String nn)
    {
        subjects = nn;
    }

    public String toString()
    {
        return "\nRoll no :"+rollNo+"\nName :"+Name+"\nDept :"+dept+"\nSubjects :"+subjects;
    }

    static class SCoop4
    {
        public static void main(String[] args)
        {
            StudentDemo students[] = new StudentDemo[3];
            students[0] = new StudentDemo(12,"Ismail","zoo","bio");
            students[1] = new StudentDemo(14,"Ismail","bot","bio" );
            students[2] = new StudentDemo(15,"Ismail","AnimalHusbandry","bio");

            for(StudentDemo s:students)
            {
                System.out.println(s);
            }
        }

    }
}