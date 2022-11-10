import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("start");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    int res = add();
                    System.out.println(res);
                case 5:
                    break;
                    // System.exit(0);
            }
            
        }
    }

    public static int add(){
        Random r = new Random();
        return r.nextInt();
    }


}
