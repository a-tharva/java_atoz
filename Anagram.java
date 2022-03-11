import java.util.Scanner;
import java.util.Arrays;

public class Anagram{
    
    public static void main(String [] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String a = scan.nextLine();
        System.out.println("Enter another string: ");
        String b = scan.nextLine();
        
        char[] array1 = a.toCharArray();
        char[] array2 = b.toCharArray();
        
        if(array1.length == array2.length) {
            Arrays.sort(array1);
            Arrays.sort(array2);
            Boolean result = Arrays.equals(array1, array2);
            
            if(result) {
                System.out.println("Anagram");
            }
            else{
                System.out.println("Not an anagram");
            }
        }
        else{
            System.out.println("Not an anagram");
        }
    }
}