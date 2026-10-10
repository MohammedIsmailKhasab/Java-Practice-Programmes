package AbtractDemo;

abstract class KFC
{
     public KFC()
     {
         System.out.println("should have KFC Advertisement more");
         System.out.println("should use proper delivery on time");
     }

     public void makeitem()
     {
         System.out.println("should use proper ingredients");
         System.out.println("should maintain good taste as provided");
         System.out.println("should add proper masala while making chicken");
     }

     abstract void billing();
     abstract void offer();
     abstract void festiveoffer();
}

class MYKFC extends KFC
{
    public MYKFC()
     {
         System.out.println("should display my name on store MYKFC");
     }

     public void offer()
     {
         System.out.println("should provide good offer");
     }

     public void billing()
     {
         System.out.println("should provide good billing system");
     }

     public void festiveoffer()
     {
         System.out.println("should provide good festive offer");
     }

}
public class AbstractExample3
{
    public static void main(String[] args)
    {
        KFC kf = new MYKFC();
        kf.billing();
        kf.offer();
        kf.festiveoffer();
    }
}