// 13_StrongNumber.java
import java.util.Scanner;

class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n, sum = 0;

        while (temp > 0) {
            int d = temp % 10;
            int fact = 1;

            for (int i = 1; i <= d; i++)
                fact *= i;

            sum += fact;
            temp /= 10;
        }

        System.out.println(sum == n ? "Strong Number" : "Not Strong");
    }
}