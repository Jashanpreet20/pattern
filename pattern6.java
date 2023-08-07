

// solid diamond

import java.util.*;


class pattern6 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0; i<n; i++)
        {
            //space
            for(int j=n-1; j>=i; j--){
                System.out.print(" ");
            }
            //star
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0; i<n; i++)
        {
            //space
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            //star
            for(int j=n-1; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }    
}
