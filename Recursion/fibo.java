import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.print(fibonacci(i) + ", ");
        }

    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);

    }
}
