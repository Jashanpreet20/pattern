
import java.util.*;


// hollow diamond

class pattern5 {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }

            for(int j=0; j<2*i +1; j++){
                if(j==0 || j== 2*i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }

            for(int j=0; j<2*n -2*i -1; j++){
                if(j==0 || j== 2*n -2*i-2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    
    }
}
