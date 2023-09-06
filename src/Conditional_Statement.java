import javax.swing.*;

public class Conditional_Statement {
    public static void main(String[] args) {
        char attendance= 'M';

        if (attendance == 'P')
        {
            System.out.println("Attended classes");
        }
        else if (attendance =='O')
        {
            System.out.println("on-duty");
        }
        else if (attendance =='M')
        {
            System.out.println("medical leave");
        }
        else
        {
            System.out.println("not attended the class");
        }
        System.out.println("Program ends");
    }
}
