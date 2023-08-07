
import java.util.*;

class fancy3 {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1; i<n; i++){
            for(int j=1; j<i+1; j++){
                if(i==0){
                    System.out.print("*");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
