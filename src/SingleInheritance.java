class Parentep{
    int xs = 10;

    void myMethod() {
        System.out.println("Im the base class");
    }
}
class Child extends Parentep {
    int s = 11;
    void myMethod1() {
        System.out.println("Im the child class");
    }
}
public class SingleInheritance {
    public static void main(String args[]) {
        Child myObj = new Child();
        System.out.println(myObj.s);
        System.out.println(myObj.xs);
        myObj.myMethod();
        myObj.myMethod1();
    }
}
