import java.util.Scanner;

class Q8{
    public static void main(String[] args) {
        int t=37,n,c=0;
        char ch;
        Scanner input=new Scanner(System.in);
        System.out.println("Guess a number in between 1 to 50:");
        while(c==0){
          n=input.nextInt();
          if(n<t){
              System.out.println("The guessed number is less than target, guess again: ");
          }
          else if(n>t){
            System.out.println("The guessed number is greater than target, guess again: ");
          }
          else{
              System.out.println("Congrats! you got the target!");
              break;
          }
        }
        input.close();
    }
}