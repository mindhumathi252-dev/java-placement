// 27_SmallestDigit.java
import java.util.Scanner;

class SmallestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(sc.nextInt());
        int min = 9;

        if (n == 0)
            min = 0;

        while (n > 0) {
            min = Math.min(min, n % 10);
            n /= 10;
        }

        System.out.println(min);
    }
}