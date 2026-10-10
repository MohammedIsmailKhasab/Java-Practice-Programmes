//package SingletonClass;
//
//public class Singleton1
//{
//        private static volatile Singleton intsance;
//
//        private void Singleton1()
//        {
//
//        }
//
//        public static Singleton getIntsance()
//        {
//            if(instance == null) {
//                synchronized (Singleton.class)
//                {
//                    if (intsance == null)
//                    {
//                        intsance = new Singleton();
//                    }
//                }
//            }
//            return intsance;
//        }
//
//        static void main(String[] args)
//        {
//            Singleton obj1 = getIntsance();
//            Singleton obj2 = getIntsance();
//
//            System.out.println(obj1 == obj2);
//
//        }
//    }