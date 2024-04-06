package iwanami;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            //1から10まで試す
            for (int i = 1; i <= 10; i++) {
                System.out.println(fibonacci(i));
            }
            int n = sc.nextInt();
            System.out.println(fibonacci(n));
        }
    }
    static int fibonacci(int n){
        int fibo = 0;
        int prev1 = 0;
        int prev2 = 1;

        for (int i = 2; i <= n ; i++) {
            fibo = prev1 + prev2;
            prev1 = prev2;
            prev2 = fibo;
        }
        return fibo;
    }
}
