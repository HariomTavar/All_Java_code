   abstract class Payment {
    abstract void make();
   }   
    class DoPayment extends Payment{
        void make(){
            System.out.println(" Jai shree ram");

        }
    }       
             
             
             public class Abstracttion {
    public static void main(String[]args){
        Payment obj = new DoPayment();
        obj.make();
    }
}
