import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int median;

        if ((a > b && a < c) || (a > c && a < b)) {
            median = a;
        }
        else if ((a > b && c < b) || (b > a && b < c)){
            median = b;
        }
        else {
            median = c;
        }
        System.out.println(median);

    }
}