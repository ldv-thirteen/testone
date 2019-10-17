import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        if (a > b && b > c) {
            System.out.print(a);
        } else if (a > c && c > b) {
            System.out.print(a);
        } else if (b > c && c > a) {
            System.out.print( b);
        } else if (b > a && a > c) {
            System.out.print( b);
        } else if (c > b && b > a) {
            System.out.print(c);
        } else if (c > a && a > b) {
            System.out.print(c);
        }
    }
}
