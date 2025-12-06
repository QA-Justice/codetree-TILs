/*

1. 이차원 배열을 선언한다. 4*4가 들어가도록
2. 이차원 배열에 scanner로 값 하나씩 떼서 넣어준다. 
3. 바깥 for문에 합계를 출력할 빈 변수를 선언한다. 
4. 요소 하나씩 순회하면서 sum의 값에 더한다.
5. 안쪽 for문이 돌고 나면 sum을 출력한다. 
6. 다시 바깥 for문을 시작한다.

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = 4;
        int cols = 4;
   
        // 2. 배열 선언 
        int[][] firstMatrix = new int[rows][cols];

        // 3.배열  채우기 
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                firstMatrix[i][j] = sc.nextInt();
            }
        }

        // 4. 줄마다 값 더하고 출력하기 
        for (int i = 0; i < rows; i++) {   
            int sum = 0;   
            for (int j = 0; j < cols; j++) {
               sum = sum+firstMatrix[i][j];
            } System.out.println(sum);
        }
    }
}