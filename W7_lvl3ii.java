import java.util.Scanner;

class NumberChecker {

    // Count digits
    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    // Store digits in array
    public static int[] getDigits(int n) {
        int len = countDigits(n);
        int[] digits = new int[len];

        for (int i = len - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    // Duck number check
    public static boolean isDuck(int[] digits) {
        boolean hasZero = false;
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0)
                hasZero = true;
        }
        return hasZero;
    }

    // Armstrong check
    public static boolean isArmstrong(int n, int[] digits) {
        int power = digits.length;
        int sum = 0;

        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        return sum == n;
    }

    // Largest & second largest
    public static void largestTwo(int[] arr) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int x : arr) {
            if (x > max1) {
                max2 = max1;
                max1 = x;
            } else if (x > max2 && x != max1) {
                max2 = x;
            }
        }

        System.out.println("Largest = " + max1);
        System.out.println("Second Largest = " + max2);
    }

    // Smallest & second smallest
    public static void smallestTwo(int[] arr) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int x : arr) {
            if (x < min1) {
                min2 = min1;
                min1 = x;
            } else if (x < min2 && x != min1) {
                min2 = x;
            }
        }

        System.out.println("Smallest = " + min1);
        System.out.println("Second Smallest = " + min2);
    }
}

public class W7_lvl3ii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int[] digits = NumberChecker.getDigits(n);

        System.out.println("Digit Count = " + NumberChecker.countDigits(n));
        System.out.println("Duck Number = " + NumberChecker.isDuck(digits));
        System.out.println("Armstrong = " + NumberChecker.isArmstrong(n, digits));

        NumberChecker.largestTwo(digits);
        NumberChecker.smallestTwo(digits);
    }
}