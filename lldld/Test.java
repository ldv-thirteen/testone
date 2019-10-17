import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a > b && a > c) {
            System.out.println(a);
        } else if (a > b && c > a) {
            System.out.println(c);

        } else if (a < b && c > a) {
            System.out.println();
        }
    }



        }


