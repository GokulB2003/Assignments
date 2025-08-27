import java.util.*;

public class Automorphic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = sc.nextInt();
        int sqr, t;
        int i = 1;

        while (i < n) {
            int num = i;
            sqr = num * num;

            // Count number of digits
            int count = 0;
            int copy = num;
            while (copy != 0) {
                ++count;
                copy = copy / 10;
            }

            // Match last digits using if-else logic
            if (count == 1) {
                t = sqr % 10;
                if (t == num) {
                    System.out.println(i);
                }
            } else if (count == 2) {
                t = sqr % 100;
                if (t == num) {
                    System.out.println(i);
                }
            } else if (count == 3) {
                t = sqr % 1000;
                if (t == num) {
                    System.out.println(i);
                }
            } else if (count == 4) {
                t = sqr % 10000;
                if (t == num) {
                    System.out.println(i);
                }
            } else if (count == 5) {
                t = sqr % 100000;
                if (t == num) {
                    System.out.println(i);
                }
            }

            t = 0;
            i++;
        }
    }
}
