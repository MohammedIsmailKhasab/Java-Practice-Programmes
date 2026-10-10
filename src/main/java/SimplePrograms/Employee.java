package SimplePrograms;

//Demo on Employee with their propereties on OOPs
public class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void  setName(String n) {
        name = n;
    }

    static class CellPhone{
        public void ring(){
            System.out.println("ringing");
        }

        public void vibrate(){
            System.out.println("vibrating");
        }

        public void callFriend(){
            System.out.println("calling Mukul");
        }
    }
    public static void main(String[] args) {

        Employee harry = new Employee();
        harry.setName("CodeWithHarry");
        harry.salary = 100;
        System.out.println(harry.getSalary());
        System.out.println(harry.getName());


        CellPhone asus = new CellPhone();
        asus.callFriend();
        asus.ring();
        asus.vibrate();

    }
}