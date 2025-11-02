import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        // 3*3으로 들어온대서 자리 만듦
        Scanner sc = new Scanner(System.in);
        int rows = 3;
        int cols = 3;
        int[][]matrix = new int[rows][cols];

        //원본 행렬 입력 받기
        for (int i=0; i<rows; i++){
            for(int j = 0; j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        // 뉴 행렬도 자리 만듦 원본 행렬과 동일하게 
        int [][] newMatrix = new int [rows][cols];


        for (int i = 0; i <rows; i++){      // i: 행(row) 인덱스 반복
            for (int j = 0; j <cols; j++){  // j: 열(column) 인덱스 반복
                newMatrix[i][j] = matrix[i][j]*3;   //뉴 행렬은 기존 원소*3
                System.out.print(newMatrix[i][j] + " ");   // 한 행(row) 안에서 열(column) 값을 공백으로 구분해 출력
                
            }System.out.println();  // 한 행의 모든 열을 출력한 뒤 줄바꿈 (다음 행으로 이동) 
            
        }
    }
}
