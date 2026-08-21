// 28_CountOccurrence.java
import java.util.Scanner;

class CountOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(sc.nextInt());
        int digit = sc.nextInt();
        int count = 0;

        if (n == 0 && digit == 0)
            count = 1;

        while (n > 0) {
            if (n % 10 == digit)
                count++;
            n /= 10;
        }

        System.out.println(count);
    }
}
