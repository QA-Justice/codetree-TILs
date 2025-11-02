import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        // 3*3으로 들어온대서 자리 만듦
        Scanner sc = new Scanner(System.in);
        int rows = 3;
        int cols = 3;
        int[][]firstMatrix = new int[rows][cols];
        int[][]secondMatrix = new int [rows][cols];
        int[][]thirdMatrix = new int [rows][cols];

        //원본 행렬 입력 받기 - 하나 
        for (int i=0; i<rows; i++){
            for(int j = 0; j<cols;j++){
                firstMatrix[i][j]=sc.nextInt();
            }
        }
        //원본 행렬 입력 받기 - 둘 
        for (int k=0; k<rows; k++){
            for(int l = 0; l<cols;l++){
                secondMatrix[k][l]=sc.nextInt();
            }
        }

        for (int m = 0; m <rows; m++){      
            for (int n = 0; n <cols; n++){ 
                thirdMatrix[m][n] = firstMatrix[m][n]*secondMatrix[m][n];  
                System.out.print(thirdMatrix[m][n] + " ");   
                
            }System.out.println();  // 한 행의 모든 열을 출력한 뒤 줄바꿈 (다음 행으로 이동) 
            
        }
    }
}