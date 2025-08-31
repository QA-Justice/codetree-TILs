import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();          // 정수 개수 입력
        int[] arr = new int[N];        // 배열 크기를 N으로 설정

        for (int i = 0; i < N; i++) {  // N개 정수 입력받기
            arr[i] = sc.nextInt();
        }
        // 역순 탐색하면서 짝수만 출력
        for (int i = N - 1; i >= 0; i--) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
