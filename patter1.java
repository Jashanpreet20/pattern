import java.util.*;


class star{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();

        for(int row = 0; row <= n; row++){
            for(int col=0; col<=n; col ++)
            {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}