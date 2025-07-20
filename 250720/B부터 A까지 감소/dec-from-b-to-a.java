import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (1 <= a && a <= b && b <= 100) {
            for (int i = b; i >= a; i--) {
                System.out.print(i + " ");
            }
        }
    }
}
