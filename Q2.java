import java.util.Scanner;

class OddEven{
     public static void main(String[] args)
     {
         int x;
         Scanner input =new Scanner(System.in);
         System.out.println("Enter a Number: ");
         x=input.nextInt();
         if(x%2==0){
             if(x>=20&&x<=30){
                 System.out.println("\nJerry");
             }
             else{
                 System.out.println("Given Number not between 20 and 30");
             }
         }
         else{
            if(x>=20&&x<=30){
                System.out.println("\nTom");
            }
            else{
                System.out.println("Given Number not between 20 and 30");
            }
         }
         input.close();
     }
 }