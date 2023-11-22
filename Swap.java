import java.util.Scanner;

public class Swap {
    public static void main(String args[]) {
        System.out.println("Hello world");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before Swapping");
        System.out.println("The value of 'a' is " + a);
        System.out.println("The value of 'b' is " + b);
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping");
        System.out.println("The value of 'a' is " + a);
        System.out.println("The value of 'b' is " + b);
    }
}