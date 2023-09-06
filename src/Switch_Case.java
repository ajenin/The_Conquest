public class Switch_Case {
    public static void main(String[] args) {
        char attendance='O';
        switch (attendance)
        {
            case'O':
                System.out.println("on-duty");
                break;
            case'P':
                System.out.println("present");
                break;
            case'A':
                System.out.println("absent");
                break;
            case'M':
                System.out.println("medical leave");

            default:
                System.out.println("invalid");
        }

    }
}
