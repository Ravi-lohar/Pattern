import java.util.Scanner;

public class Pattern15 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = 0;
        int st = n;
        int m = (2*n)-1;
        for(int i = 1 ;i<=m;i++)
        {
            for(int j = 1;j<=sp;j++)
            {
                System.out.print("  ");
            }
            for(int j = 0;j<st;j++)
            {
                System.out.print("* ");
            }
            System.out.println() ;
            if(i<n) {
                sp = sp +2 ;
                st--;
            }
            else {
                sp = sp-2;
                st++;
            }
        }
    } 
}
