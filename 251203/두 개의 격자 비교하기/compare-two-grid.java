import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 입력 받기
        int rows = sc.nextInt(); // N
        int cols = sc.nextInt(); // M

        // 2. 배열 선언 
        int[][] firstMatrix = new int[rows][cols];
        int[][] secondMatrix = new int[rows][cols];
        int[][] thirdMatrix = new int[rows][cols];

        // 3. 첫 번째 격자 채우기
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                firstMatrix[i][j] = sc.nextInt();
            }
        }

        // 4. 두 번째 격자 채우기
        for (int i = 0; i < rows; i++) {      
            for (int j = 0; j < cols; j++) {
                secondMatrix[i][j] = sc.nextInt(); 
            }
        }

        // 5. 비교 및 출력
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (firstMatrix[i][j] == secondMatrix[i][j]) {
                    thirdMatrix[i][j] = 0;
                } else {
                    thirdMatrix[i][j] = 1;
                }
                System.out.print(thirdMatrix[i][j] + " ");
            }
            System.out.println(); // 줄바꿈
        }
    }
}