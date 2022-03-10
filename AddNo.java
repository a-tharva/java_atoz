import java.util.Scanner;

public class AddNo {
    
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
    
        int a, b, ans;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input numbers");
        a = input.nextInt();
        b = input.nextInt();
        
        ans = add(a, b);
        System.out.println("Addition is " + ans);
    }
}