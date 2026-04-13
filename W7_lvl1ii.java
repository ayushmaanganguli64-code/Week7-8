import java.util.Scanner;
public class W7_lvl1ii{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Number of students in class: ");
        int s = sc.nextInt();
        int h= (s * (s-1))/2;
        System.out.println("Total number of handshakes possible: "+h);
    }
}