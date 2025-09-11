import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in); 
        
        int count3 = 0; // 3의 배수의 개수
        int count5 = 0; // 5의 배수의 개수 

        for (int i=0; i<10; i++){
            int x = sc.nextInt(); //하나읽음
            if (x % 3 == 0 ) count3++; 
            if (x % 5 == 0 ) count5++;
        }
        System.out.println (count3+" "+count5);
    }
}