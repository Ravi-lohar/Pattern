import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n-1 ;
        int nst = 1 ;
        for( int i = 0 ; i<n ; i++){
            for( int j = 0 ; j<nsp ; j++){
                System.out.print(" " +" ");  
            }

            for(int k = 0 ; k<nst  ; k++){
                System.out.print("*" + " ");
            }
            nsp--;
            nst++ ;
            System.out.println();
        }
    }
    
}
