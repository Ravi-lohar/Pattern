import java.util.Scanner;

public class Pattern22 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int isp = -1;
        int st = n;
        for(int i = 1;i<=n;i++)
        {

            for(int j = 1;j<=st ;j++){
                System.out.print("*  ");

            }

            for(int j = 1;j<=isp;j++){
                System.out.print("   ");
            }

            for(int j = 1;j<=st;j++){
                if(j<n)
                    System.out.print("*  ");
            }


            isp+=2;
            st--;

            System.out.println();
        }

    }
}
