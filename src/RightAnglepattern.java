public class RightAnglepattern {
    public static void main(String args[]) {
        int i,j;
        int row =4;
        for ( i=0;i<=row-1;i++) {
            for (j=0;j<=i;j++) {
                System.out.print("$"+" ");
            }
            System.out.println("\n");
        }
        for ( i=row-1;i>=0;i--) {
            for ( j=0;j<=i-1;j++) {
                System.out.print("$"+ " ");
            }
            System.out.println("\n");
        }
    }
}
