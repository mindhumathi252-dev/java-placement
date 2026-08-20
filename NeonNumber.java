// 15_NeonNumber.java
import java.util.Scanner;

class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int square = n * n;
        int sum = 0;

        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }

        System.out.println(sum == n ? "Neon Number" : "Not Neon");
    }
}

