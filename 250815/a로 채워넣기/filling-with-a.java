import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String text = sc.next(); //받은 문자열
        String result = ""; //결과 문자열

        for (int i = 0; i < text.length(); i++){
            if (i == 1 || i == text.length()-2) { // 앞에서 두번째 자리거나, 뒤에서 두번째 자리라면.. 
                result = result + 'a'; // a 넣고
            }
            else{
                // 그 외에는 원래 문자 그대로 가져옴
                result = result + text.charAt(i); // charAt : 문자열에서 특정 위치의 문자 하나 꺼냄 
            }
        }
    System.out.println (result);

    }
}