import java.util.*;

class demo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

       for(int i=0; i<n; i++){

        int start=i+1;
        for(int j=0; j<i+1; j++){
            System.out.print(start);
            start++;
        }
        System.out.println();
       }
        
    }
}