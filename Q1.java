 import java.util.Scanner;
 class Q1{
     public static void main(String[] args) {
         int num, rev=0,temp,rem, sum=0;
         Scanner input=new Scanner(System.in);
         System.out.println("Enter an intergral number: ");
         num=input.nextInt();
         temp=num;
         while(temp!=0){
             rem=(temp%10);
             rev=(rev*10)+rem;             
             if(rem%2==0){
                sum=sum+rem;
             }
             temp=temp/10;
         }
         if(rev==num){
             if(sum>25){
             System.out.println(num+" is a Pallindrome and the sum is greater than 25");
             }
             else{
                System.out.println(num+" is a Pallindrome and the sum is less than 25");
             }
         }
         else{
             System.out.println(num+" is not a pallindrome");
         }
         input.close();
     }
 }