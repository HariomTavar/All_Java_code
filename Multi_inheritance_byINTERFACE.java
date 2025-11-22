
interface A {
    void show();
}
interface B {
    void display();
}
class C implements A, B {
    public void show() { System.out.println("Show from A"); }
    public void display() { System.out.println("Display from B"); }
}

public class Multi_inheritance_byINTERFACE {
    public static void main(String[]args){
  A s = new C();

   s.show();
   B m = new C();
   m.display();
  
    }
}
