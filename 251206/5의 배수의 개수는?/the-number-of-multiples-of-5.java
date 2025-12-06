/*
1. 빈 배열 자리를 4*4로 만들어준다. 
2. cnt를 선언한다.
3 Scanner로 하나씩 뜯어서 배열에 넣어준다 .
4. 배열의 값을 순회한 후, 5로 나눴을 때 나머지가 0인 경우에
cnt에 1을 더한다. 
5. cnt를 출력한다. 
*/

import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        //1. 배열을 선언하고 인스턴스화 한다.
        int rows = 4; 
        int cols = 4; 
        int [][]matrix = new int [rows][cols];
        int cnt = 0;

        //2.배열에 값을 할당한다.
        for(int i = 0; i <rows ; i++){
            for(int j = 0; j <cols; j++){
             matrix[i][j] = sc.nextInt();
            }
        }
        for (int i =0; i<rows; i++){
            for(int j = 0; j <cols; j++){
              if(matrix[i][j]%5==0){
                cnt += 1;
              }
            }
        } System.out.println(cnt);

    }
}