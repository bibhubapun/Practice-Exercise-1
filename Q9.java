import java.util.Scanner;

class Q9{
    public static void main(String[] args) {
        String str,str1;
        int i;
        str1="";
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string: ");
        str=input.nextLine();
        for(i=str.length()-1;i>=0;i--){
           str1=str1+str.charAt(i);            
        }
        System.out.println("Reversed String: "+str1);
        input.close();
    }
}