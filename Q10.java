import java.util.Scanner;

class Q10{
    public static void main(String[] args) {
        String str;
        int n;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a String: ");
        str=input.nextLine();
        System.out.println("Enter a number: ");
        n=input.nextInt();
        for(int i=0; i<n;i++){
            for(int j=str.length()-n;j<str.length();j++){
                System.out.print(str.charAt(j));
            }
        }
        System.out.print("\n");
        input.close();
    }
}