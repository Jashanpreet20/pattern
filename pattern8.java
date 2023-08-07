import java.util.*;

public class pattern8 {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0; i<n; i++){
            // space
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            // star
            for(int j=0; j<i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

         for(int i=0; i<n; i++){
            // space
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            // star
            for(int j=0; j<n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
