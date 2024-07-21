import java.util.*;
public class input {
    
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the first number: ");

        int a=sc.nextInt();
        System.out.println("Enter the second number: ");
        String b=sc.next();
        System.out.println("Enter the character: ");
        char c=sc.next().charAt(0);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    
}
