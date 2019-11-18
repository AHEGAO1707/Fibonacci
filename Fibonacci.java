import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число для вычисления числа Фибоначчи => ");
        int x = in.nextInt();
        int y = 0;
        int[] arr = new int[x];
        arr[0] = 1;
        arr[1] = 1;
        if (x == 1 || x == 2) {
            System.out.println("Число Фибоначчи равно => 1");
        } else {
            for (int i = 2; i < x; i++){
                arr[i] = arr[i - 1] + arr[i - 2];
                y = arr[i];
            }
            System.out.println("Число Фибоначчи равно => " + y);
        }
    }
}
