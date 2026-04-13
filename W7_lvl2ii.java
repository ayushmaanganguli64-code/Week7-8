import java.util.Scanner;

public class W7_lvl2ii {

    // Recursive method
    public static int recursiveSum(int n) {
        if (n == 1)
            return 1;
        return n + recursiveSum(n - 1);
    }

    // Formula method
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }

        int rSum = recursiveSum(n);
        int fSum = formulaSum(n);

        System.out.println("Recursive Sum = " + rSum);
        System.out.println("Formula Sum = " + fSum);

        if (rSum == fSum) {
            System.out.println("Both results match ✅");
        } else {
            System.out.println("Results do NOT match ❌");
        }
    }
}