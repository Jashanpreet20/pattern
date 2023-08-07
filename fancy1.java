import java.util.*;


class fancy1 {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(i+1);
                if(j != i) System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(n-i);
                if(j != n-i-1) System.out.print("*");
            }
            System.out.println();
        }

    }
    

}
