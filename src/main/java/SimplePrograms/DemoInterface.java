package SimplePrograms;


    interface Bicycle{
        int a= 45;
        void applyBrake(int decrement);
        void speedUp(int increment);
    }

    class AvonCycle implements Bicycle{
       void blowHorn(){
           System.out.println("pee pee poo poo");
       }

       public void applyBrake(int decrement){
           System.out.println("Applying Brake");
       }

       public void speedUp(int increment){
           System.out.println("Applying Speeding up");
       }
    }
public class DemoInterface
{
    public static void main(String[] args) {
        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.applyBrake(1);
        System.out.println(cycleHarry.a);
    }
}

