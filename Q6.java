import java.util.Scanner;

class Q6{
    public static void main(String[] args) {
        char ch;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a Character: ");
        ch=input.next().charAt(0);
        input.close();
        if(ch>='a'&&ch<='z')
        {
            System.out.println("Entered character is a small letter");
        }
        else if(ch>='A'&&ch<='Z'){
            System.out.println("Entered character is a Capital letter");
        }
        else if(ch>='0'&&ch<='9'){
            System.out.println("Entered character is a digit");   
        }
        else{
            System.out.println("Entered character is a special character");
        }
    }
}