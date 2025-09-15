/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1 ; i <= N; i++) {
            for (int j = 1; j <=N; j++){
                if (j != N) {System.out.print(i +" * "+ j +" = "+ (i*j)+", ");}
                if(j == N) {System.out.print(i +" * "+ j +" = "+ (i*j));}
            } System.out.println();
        }
    }
}
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j < N; j++) { // 마지막 전까지만
                System.out.print(i + " * " + j + " = " + (i * j) + ", ");
            }
            // 마지막은 콤마 없이
            System.out.println(i + " * " + N + " = " + (i * N));
        }
    }
}
