import java.util.*;

public class fancy6 {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0; i<n; i++){
            int start=1;
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }

            for(int j=0; j<2*i+1; j++){
               if(i==0 || i== n-1){
                if(j % 2 ==0){
                    System.out.print(start);
                    start++;
                }else{
                    System.out.print(" ");
                }
               }
               else {
                if(j==0){
                    System.out.print("1");
                }
                else if(j == 2*i+1 -1){
                    System.out.print(i+1);
                }
                else{
                    System.out.print(" ");
                }
               }
            }

            System.out.println();
        }
    }
}
