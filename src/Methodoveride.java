class Parentt{
    void display() {
        System.out.println("Hello World");
    }
}
class Childd extends Parentt{
    void display() {
        super.display();
        System.out.println("Welcome to my world");
    }
}
public class Methodoveride {
    public static void main(String args[]) {

        Childd chs = new Childd();

        chs.display();
    }
}
