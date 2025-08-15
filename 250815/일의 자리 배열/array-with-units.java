import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 객체 생성 → 사용자로부터 입력을 받을 준비
        Scanner sc = new Scanner(System.in);

        // 첫 번째 정수 입력받아 n1에 저장
        int n1 = sc.nextInt();
        // 두 번째 정수 입력받아 n2에 저장
        int n2 = sc.nextInt();

        // 길이가 10인 int 배열 생성 (초기값은 모두 0)
        int[] arr = new int[10];
        // 배열 첫 번째 칸(인덱스 0)에 n1 저장
        arr[0] = n1;
        // 배열 두 번째 칸(인덱스 1)에 n2 저장
        arr[1] = n2;

        // 2번째 인덱스부터 9번째 인덱스까지 채우기
        // 규칙: 현재 위치 값 = (두 칸 전 값 + 한 칸 전 값) % 10
        for (int i = 2; i < 10; i++) {
            arr[i] = ((arr[i - 2] + arr[i - 1]) % 10);
        }

        // 배열의 모든 요소를 공백으로 구분해 출력
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
