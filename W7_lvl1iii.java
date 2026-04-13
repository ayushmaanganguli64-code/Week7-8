import java.util.Scanner;
public class W7_lvl1iii{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sides of the Triangular park in meters: ");
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        double p= (a+b+c);
        System.out.println("To complete a 5km run the athlete needs to complete "+ p/5+" rounds of the park");
    }
}