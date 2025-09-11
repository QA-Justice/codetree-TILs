import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner (System.in);
        String [] A = {"apple", "banana", "grape", "blueberry", "orange"}; // 문자열 5개 저장
        char a = sc.next().charAt(0); //문자열 하나 
        int cnt = 0; //개수 셀 거 

        for (int i = 0; i < 5; i++ ){ 
           if( A[i].charAt(2) == a) {
            System.out.println (A[i]);
            cnt++;
           }
           if( A[i].charAt(3) == a){
            System.out.println (A[i]);
            cnt++;
           }
        }
        System.out.println (cnt);
    }
}