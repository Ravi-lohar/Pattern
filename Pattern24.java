import java.util.Scanner;

public class Pattern24 {
   public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int nsp = n;
        int number = 1;
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<nsp;j++)
            {
                System.out.print("   ");
            }
            for(int j = 1;j<=nst;j++)
            {
                System.out.print(number+"  ");
            }
            System.out.println();
            nst+=2;
            nsp--;
            number++;
        }
    } 
}
