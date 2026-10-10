package SimplePrograms;

public class DemoAbstract {

//    abstract class Parent2{
//        public Parent2(){
//            System.out.println("main base2 ka constructor hoon");
//        }
//        public void sayHello(){
//            System.out.println("Hello");
//        }
//        abstract public void greet ();
//        abstract public void greet2 ();
//    }
//
//    class Child2 extends Parent2{
//        @Override
//        public void greet(){
//            System.out.println("good morning");
//        }
//        @Override
//        public void greet2(){
//            System.out.println("good afternoon");
//        }
//    }
//
//    public static void main(String[] args) {
//
//                Child2 c = new Child2();
//    }


    abstract class Car
    {
        public abstract void drive();
        public abstract void fly();

        public void playMusic()
        {
            System.out.println("Play music");
        }
    }

    class WagonR extends Car
    {
        public void fly()
        {
            System.out.println("Wagon fly");

        }
        public void drive()
        {
            System.out.println("Driving");
        }
    }

    class Demo
    {
        public static void main(String[] args) {

////            Car obj = new WagonR();
//            obj.drive();
//            obj.fly();
//            obj.playMusic();
        }
    }
}