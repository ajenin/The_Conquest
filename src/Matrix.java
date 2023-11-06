import java.util.Scanner;

public class Matrix {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);
        int s[][] = new int[3][3];
        int t[][] = new int[3][3];
        int u[][] = new int[3][3];
        int i,j;
        System.out.println("Enter the First matrix");
        for (i=0;i<s.length;i++) {
            for (j=0;j<s[i].length;j++) {
                s[i][j] = myObj.nextInt();
            }
        }
        System.out.println("Enter the second matrix");
        for (i=0;i<t.length;i++) {
            for (j=0;j<t[i].length;j++) {
                t[i][j] = myObj.nextInt();
            }
        }
        System.out.println("The Addition is");
        for (i=0;i<u.length;i++) {
            for (j=0;j<u[i].length;j++) {
                u[i][j] = s[i][j] + t[i][j];

                System.out.println(u[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
