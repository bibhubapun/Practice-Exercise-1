import java.util.Scanner;

class Q3{
    public static void main(String[] args) {
        String str;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a word: ");
        str=input.nextLine();
        for(int i=0; i<str.length();i++){
              switch(str.charAt(i)){
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    System.out.println("\nthe character at index "+i+" is not a letter");
                    break;
                    case 'a':
                    case 'A':
                    case 'e':
                    case 'E':
                    case 'i':
                    case 'I':
                    case 'o':
                    case 'O':
                    case 'u':
                    case 'U':
                    System.out.println("\nthe character at index "+i+" is a vowel");
                    break;
                    default:
                    System.out.println("\nthe character at index "+i+" is a consonant");
                    break;
                }
            }
        
        input.close();   
    }
}