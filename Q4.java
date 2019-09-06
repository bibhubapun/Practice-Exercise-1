import java.util.Scanner;

class Q4{
    public static void main(String[] args) {
        int n,i,j;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter upto whicn number to print the series: ");
        n=input.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.println(i+" ");
            }
        }
        input.close();
    }
}