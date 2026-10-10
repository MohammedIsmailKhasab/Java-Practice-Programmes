package SimplePrograms;

//create an array of 5 floats and calculate their sum
public class DemoArray1 {
    public static void main(String[] args) {
//        float [] marks= {44.5f, 55.4f, 88.6f, 99.0f, 55.5f};
//        float sum = 0;
//        for (float mark : marks) {
//            sum = sum + mark;
//        }
//        System.out.println("The sum is: " + sum);
//    }
////
//    }
//to find whether the given integer is present in an array or not
        float[] marks = {44.5f, 55.4f, 88.6f, 99.0f, 55.5f};
        float num = 44.5f;
        boolean isInArray = false;
        for (float element : marks) {
            if (num == element) {
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("the value is present in the array");
        } else {
            System.out.println("the value is not present in the array");
        }
    }
}


