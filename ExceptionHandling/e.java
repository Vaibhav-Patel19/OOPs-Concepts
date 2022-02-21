package OOP.ExceptionHandling;

public class e {

    static void fun2() throws ArrayIndexOutOfBoundsException{
        int a = 0;
        if(a == 0){
            throw new ArrayIndexOutOfBoundsException("Exception object is created.");
        }
    }

    public static void main(String[] args){

        try{
            fun2();
        }catch (Exception e){
            System.out.println(e);
        }

//        try {
//            int a = 5 / 0;
//        }
//        catch (ArithmeticException e){
//
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("Finally Block always runs.");
//        }

//        int a = 0;
//        if(a == 0){
//            throw new ArrayIndexOutOfBoundsException("Exception object is created.");
//        }
    }
}
