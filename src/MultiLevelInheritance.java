class Goa{
    int rs = 15000;

    void enjoyment() {
        System.out.println("Vibing with friends");
    }
}
class Tanjore extends Goa{
    int ex = 1000;

    void worship() {
        System.out.println("Lord Shivan");
    }
}
class Losvegas extends Tanjore{
    int doll = 100000;

    void visiting() {
        System.out.println("Exploring city");
    }
}
public class MultiLevelInheritance {
    public static void main(String args[]) {
        Losvegas myObj = new Losvegas();
        System.out.println(myObj.rs);
        System.out.println(myObj.doll);
        System.out.println(myObj.ex);
        myObj.worship();
        myObj.enjoyment();
        myObj.visiting();

        Tanjore myObj2 = new Tanjore();
        System.out.println(myObj2.ex);
        System.out.println(myObj2.rs);
        myObj2.enjoyment();
        myObj2.worship();

        Goa go = new Goa();
        System.out.println(go.rs);
        go.enjoyment();
    }
}
