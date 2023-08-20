import java.util.Scanner;

public class Pattern13 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int m = (n*2)-1 ;
        for(int i = 1;i<=m;i++)
        { 
            for(int j = 1;j<=nst;j++)
            { 
                System.out.print("*" + "  ");
            }
            
            if(i<n)
            nst++ ;
            else
            nst--;
            System.out.println();
            

        
        }
    } 
}
