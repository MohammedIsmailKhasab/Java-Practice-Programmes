package SimplePrograms;

//while loop example
public class DemoLoops {
    public static void main(String[] args) {
//        int i=1;
//        while(i<=10){
//            System.out.println(i);
//            i++;
//        }
//    }
//}

//dowhile loop example
//        int b = 0;
//        do {
//            System.out.println(b);
//            b++;
//        } while (b < 5);
//    }
//}

//for loop example

//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }
//    }
//}

//for and continue using loops

        for (int i = 0; i < 50; i++) {
            System.out.println(i);
            System.out.println("Java is great");
            if (i == 2) {
                System.out.println("Ending the loop");
                break;
            }
        }
    }
}