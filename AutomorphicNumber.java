// 14_AutomorphicNumber.java
import java.util.Scanner;

class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int square = n * n;

        System.out.println(String.valueOf(square).endsWith(String.valueOf(n))
                ? "Automorphic Number"
                : "Not Automorphic");
    }
}