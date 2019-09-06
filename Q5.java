import java.util.Scanner;

class Q5{
    public static void main(String[] args){
        int n, count=0, sum=0;
        char ch;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your numbers: ");
        while(count==0){
           n=in.nextInt();
           sum=sum+n;
           System.out.println("Would you like to go on:[y/n]");
           ch=in.next().charAt(0);
           switch(ch){
               case 'y':
               count=0;
               break;
               case 'n':
               count=1;
               break;
               default:
               System.out.println("Not a valid response");
               break;
           }
        }
        System.out.println("The sum of entered numbers is :"+sum);
        in.close(); 
    }
}