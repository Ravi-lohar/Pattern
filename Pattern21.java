import java.util.Scanner;

public class Pattern21 {
     public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 2*n-1;
        int isp = m-2;
        int st = 1;
        for(int i = 1;i<=n;i++)
        {

            for(int j = 1;j<=st ;j++){
                System.out.print("*  ");

            }

            for(int j = 1;j<=isp;j++){
                System.out.print("   ");
            }
            if(i==n){
                st--;

            }
            for(int j = 1;j<=st;j++){

                System.out.print("*  ");
            }
            isp-=2;
            st++;

            System.out.println();
        }
    }
}
