import java.util.Scanner;
class Odd_Even1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x%2 == 0) System.out.println(" The number "+ x+ " is EVEN");
        else System.out.println(" The number "+ x+ " is ODD");
    }
}