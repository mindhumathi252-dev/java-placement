// 26_LargestDigit.java
import java.util.Scanner;

class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(sc.nextInt());
        int max = 0;

        while (n > 0) {
            max = Math.max(max, n % 10);
            n /= 10;
        }

        System.out.println(max);
    }
}