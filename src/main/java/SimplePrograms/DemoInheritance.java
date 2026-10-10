package SimplePrograms;

public class DemoInheritance {

    static class Base{
        int x;

        public  int getX() {
            return x;
        }

        public void setX(int x) {
            System.out.println("I am in base setting x now");
            this.x = x;
        }

        public void printMe(){
            System.out.println("I am a constructor");
        }
    }

    static class Derived extends Base {
        int y;

        public  int getY() {
            return y;
        }

        public void setY(int y) {
            System.out.println("I am a derived constructor");
            this.y = y;
        }
    }

    public static void main(String[] args) {
//        Base b = new Base();
//        b.setX(5);
//        System.out.println(b.getX());
//        b.getX();

        Derived d = new Derived();
        d.setX(43);
        System.out.println(d.getX());
    }
}