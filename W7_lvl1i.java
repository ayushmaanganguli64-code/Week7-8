import java.util.Scanner;

public class W7_lvl1i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        int principal = sc.nextInt();

        System.out.print("Enter Rate: ");
        int rate = sc.nextInt();

        System.out.print("Enter Time: ");
        int Time = sc.nextInt();

        double interest = principal * rate * Time / 100.0;

        System.out.println("The Simple Interest is " + interest +
                " for Principal " + principal +
                ", Rate " + rate +
                " and Time " + Time);
    }
}