public class Array {
    public static void main(String args[]) {
        int[]myArray= {1,2,3,4,5};
        System.out.println(myArray[3]);
        String[] cars = {"Benz","RR","BMW","Innova"};
        System.out.println(cars[1]);
        String[] cars1 = {"Benz","RR","BMW","Innova"};
        System.out.println(cars1.length);

        for(String j:cars1) {
            System.out.println(j);
        }
    }
}
