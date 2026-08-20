// 17_FirstDigit.java
import java.util.Scanner;

class FirstDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(sc.nextInt());

        while (n >= 10)
            n /= 10;

        System.out.println(n);
    }
}