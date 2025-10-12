/*
1.  a, b 입력받기 
2. 첫번째 반복문 → for (int n = a; n <= b; n++)
3. 내부 반복문 → for (int i = 1; i <= n; i++) (또는 i <= n)
4. if (n % i == 0) 이면
5. 약수 개수 세서, 3개인 경우 카운트
6. 그 개수를 출력


*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int countThreeDivisors = 0;
        
        for(int i = a; i < b+1; i++ ){
            int divisorCount = 0; 
            for(int j = 1; j < i+1; j++){
                if( i % j == 0) divisorCount++;
            }
            if (divisorCount == 3) countThreeDivisors++;
        }
        System.out.println(countThreeDivisors);
    }
}
