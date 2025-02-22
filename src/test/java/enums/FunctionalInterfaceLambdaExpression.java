package enums;

//@FunctionalInterface
//interface A
//{
//   void show();
//
//}
// class B implements A
//    {
//        public void show()
//        {
//                System.out.println("hii");
//        }
//    }
//public class FunctionalInterfaceLambdaExpression {
//
//    public static void main(String[] args) {
//        A obj= new B();
//        obj.show();
//    }
//}

/*@FunctionalInterface
interface A
{
    void show();

}
*//*class B implements A
{
    public void show()
    {
        System.out.println("hii");
    }
}*//*
public class FunctionalInterfaceLambdaExpression {

    public static void main(String[] args) {
        A obj= new A(){
            public void show()
            {
                System.out.println("Hii");
            }
        };
        obj.show();
    }
}*/

@FunctionalInterface
interface A
{
    void show();
}
public class FunctionalInterfaceLambdaExpression {
    public static void main(String[] args) {
        A obj= ()-> {
            System.out.println("Hii");
            System.out.println("Hii");
            System.out.println("Hii");
        };
        obj.show();
    }
}


