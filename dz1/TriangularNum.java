// Общая формула для n-го по порядку треугольного числа:
// Tn = 0.5 * n * (n + 1),  где n = 1, 2, 3
// через предыдущее Tn = T(n-1) + n

import java.util.Scanner;
public class TriangularNum {

    public static void main(String[] args) {

        int n = inputNum();
        int T;
        T = (n * (n + 1)) / 2;
        printRez(T);
    }

    public static int inputNum() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите порядковый номер числа");
        int num = iScanner.nextInt();
        iScanner.close();
        return num;
    }

    static void printRez(int T) {
        System.out.println(T);
    }
}