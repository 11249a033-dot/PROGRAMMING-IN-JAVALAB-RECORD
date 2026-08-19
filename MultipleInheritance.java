interface A {
    void displayA();
}
interface B {
    void displayB();
}
class c implements A,B {
    public void displayA() {
        System.out.println("This is Interface A");
    }
    public void displayB(){
        System.out.println("This is Interface B");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        c obj = new c();
        obj.displayA();
        obj.displayB();
    }
}