import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double avg = (a+b)/2 ;

        System.out.printf("%.0f %.1f", (a+b), avg);

    }
}