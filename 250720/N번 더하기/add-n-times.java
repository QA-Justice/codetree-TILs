import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt(); 
        if (a >=1 && b <=10 ){
            int temp = a;
        for (int i = 0; i < b ; i++ ){
            temp = temp+b;
            System.out.println(temp);
            }   
        }
    }
}