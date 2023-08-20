import java.util.Scanner;

public class Pattern14 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int nsp = n-1 ;
        int m = (n*2)-1 ;
        for(int i = 1;i<=m;i++)
        { 
            for (int j = 1 ; j<=nsp ; j++){
                System.out.print("   ");
            }
            for(int k = 1;k<=nst;k++)
            { 
                System.out.print("*" + "  ");
            }
            
            if(i<n)
            {
            nst++ ;
            nsp-- ;
            }
            else
            {
            nst--;
            nsp++ ;
            }
            System.out.println();
            

        
        }
    } 
    
}
