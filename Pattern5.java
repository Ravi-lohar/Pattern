import java.util.Scanner;

public class Pattern5 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = 0 ;
        int nst = n ;
        for( int i = 0 ; i<n ; i++){
            for( int j = 0 ; j<nsp ; j++){
                System.out.print(" " +" ");  
            }

            for(int k = 0 ; k<nst  ; k++){
                System.out.print("*" + " ");
            }
            nsp++;
            nst-- ;
            System.out.println();
        }
    } 
}
