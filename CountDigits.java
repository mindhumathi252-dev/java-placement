// 18_CountDigits.java
import java.util.Scanner;

class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(sc.nextInt());
        int count = 0;

        if (n == 0)
            count = 1;
        else {
            while (n > 0) {
                count++;
                n /= 10;
            }
        }

        System.out.println(count);
    }
}