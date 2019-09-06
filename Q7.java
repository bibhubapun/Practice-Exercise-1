import java.util.Arrays;
import java.util.Scanner;
class Q7{
public static void main(String[] args) {
    int num, rem, i=0,sum=0,temp,n=0;   
    Scanner input=new Scanner(System.in);
    System.out.println("Enter a number: ");
    num=input.nextInt();
    temp=num;
    while(temp!=0){
        temp=temp/10;
        n++;
    }
    int[] x=new int[n];
    while(num!=0){
        rem=num%10;
        x[i]=rem;
        if(rem%2==0){
            sum=sum+rem;
        }
        num=num/10;
        i++;
        temp++;
    }
    Arrays.sort(x);
    System.out.println("Sorted number in non-decreasing order: ");
    for(i=temp-1;i>=0;i--){
      System.out.println(x[i]);
    }
    System.out.println("\nSum of even digits: "+sum);
    if(sum>15){
        System.out.println("\nTrue");   
    }
    else{
        System.out.println("\nFalse");
    }
    input.close();
}
}