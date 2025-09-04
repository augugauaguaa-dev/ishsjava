import java.io.PrintStream;
import java.util.Scanner;

public class GugudanGame {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("단을 입력하세요");
        int dan = scanner.nextInt();


        for(int i=1; i<16; i++){
            System.out.println(dan+"*"+ i + "=" + (dan*i));
        }
    }
}
