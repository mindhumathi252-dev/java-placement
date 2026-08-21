// 29_ContainsZero.java
import java.util.Scanner;

class ContainsZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(sc.nextInt());
        boolean found = false;

        if (n == 0)
            found = true;

        while (n > 0) {
            if (n % 10 == 0) {
                found = true;
                break;
            }
            n /= 10;
        }

        System.out.println(found ? "Contains 0" : "Does not contain 0");
    }
}
