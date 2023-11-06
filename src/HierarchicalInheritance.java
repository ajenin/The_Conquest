class Dairymilk{
    int rps = 50;

    void yummy() {
        System.out.println("Silukaaa!!");
    }
}
class Kitkat extends Dairymilk{
    int ca = 40;

    void crack() {
        System.out.println("Crack buddy");
    }
}
class Perk extends Dairymilk{
    int gpay = 5;

    void charge() {
        System.out.println("Charge yourself");
    }
}
public class HierarchicalInheritance {
    public static void main(String args[]) {
        Kitkat myObj = new Kitkat();
        System.out.println(myObj.rps);
        System.out.println(myObj.ca);
        myObj.yummy();
        myObj.crack();

        Perk myObj2 = new Perk();
        System.out.println(myObj2.gpay);
        System.out.println(myObj2.rps);
        myObj2.yummy();
        myObj2.charge();
    }
}
