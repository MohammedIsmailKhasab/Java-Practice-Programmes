package Constructor;

public class Rectangle1 {
    int length;
    int breadth;
    int x = 10;

    Rectangle1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    static class Cuboid extends Rectangle1 {
        int height;
        int x = 20;

        Cuboid(int l, int b, int h) {
            super(l, b);
            height = h;
        }


        void display() {
            System.out.println(super.x);
            System.out.println(x);
        }

    }

    static class ThisSuper
    {
        public static void main(String[] args)
        {
            Cuboid c = new Cuboid(10, 5, 15);
            c.display();
        }
    }
}