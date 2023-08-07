import java.util.*;

public class fancy5 {
    

    //  numeric fully pyramid
    
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0; i<n; i++){
            // space
            int start=i;
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");

            }
            // number 

            for(int j=0; j<i+1;j++){
                System.out.print(i+j+1);
            }

            // inverted
            for(int j=0; j<i; j++){
                System.out.print(start);
                start--;
            }
            
            System.out.println();
        }
        }
}
