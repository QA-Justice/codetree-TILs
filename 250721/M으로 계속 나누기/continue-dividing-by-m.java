import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        while (N > 0) {
            System.out.println(N);
            N= N/M;
        }
        // Please write your code here.
    }
}
