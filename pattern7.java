
import java.util.*;


// flipped solid diamond

class pattern7 {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0; i<n; i++){

            // star
            for(int j=n-1; j>=i; j--){
                System.out.print("*");
            }

            // space 
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int j=n-1; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

         for(int i=0; i<n; i++){

            // star
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }

            // space 
            for(int j=n-1; j>i; j--){
                System.out.print(" ");
            }
            // space
            for(int j=n-1; j>i; j--){
                System.out.print(" ");
            }
            // star
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


// import java.util.*;

// class demo{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);

//         int n=sc.nextInt();

//        for(int i=0; i<n; i++){
        
//         for(int j=0; j<n-i; j++){
//             // star 
//             System.out.print("*");
//         }

//         for(int j=0; j<2*i+1; j++){
//             System.out.print(" ");
//         }
//          for(int j=0; j<n-i; j++){
//             // star 
//             System.out.print("*");
//         }

//         System.out.println();
//        }

//        // inverted

//        for(int i=0; i<n; i++){
//         // star
//         for(int j=0; j<i+1; j++){
//             System.out.print("*");
//         }

//         // space
//         for(int j=0; j<2*n-2*i-1; j++){
//             System.out.print(" ");
//         }
//          for(int j=0; j<i+1; j++){
//             System.out.print("*");
//         }
//         System.out.println();
//        }
       
//     }
// }