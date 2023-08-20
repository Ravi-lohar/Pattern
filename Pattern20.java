import java.util.Scanner;

public class Pattern20 {
   public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n/2;
        int isp = -1;

        for(int i  = 1;i<=n;i++)
        {
          
            for(int j = 1;j<=nsp;j++)
            {
                System.out.print("   ");
            }
            System.out.print("*  ");
            for(int j =1;j<=isp;j++)
            {
                System.out.print("   ");
            }
            if(i>1&&i<n)
            {
                System.out.print("*  ");
            }

            if(i<(n/2)+1)
            {
                nsp--;
                isp+=2;
            }
            else
            {
                nsp++;
                isp-=2;
            }
            System.out.println();
        }
    } 
}
