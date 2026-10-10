package SimplePrograms;

//Demo On Constructors
public class MyMainEmployee {
    private int id;
    private String name;

    public MyMainEmployee() {
        id = 45;
        name = "your-name-here";
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getId(){
        return id;
    }

    public static void main(String[] args) {
        MyMainEmployee harry = new MyMainEmployee();
        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }
}