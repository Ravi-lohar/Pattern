import java.util.Scanner;

public class Pattern33 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int nsp = n;
        int zeroP = 1;
        int num = n;
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<nsp;j++)
            {
                System.out.print("   ");
            }
            int numPrint = num;
            for(int j = 1;j<=nst;j++)
            {
                if(j==zeroP)
                {
                    System.out.print("0  ");
                }
                else {
                    System.out.print(numPrint+"  ");
                }
                if(j<=nst/2)
                {
                    numPrint++;
                }
                else
                {
                    numPrint--;
                }
            }
            System.out.println();
            nst+=2;
            nsp--;
            zeroP++;
            num--;
        }
    } 
}
