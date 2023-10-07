package org.example.数学.斐波那契;

/**
 * @Author guanpeng.chong
 * @Date 2023/10/7 23:24
 */
public class Fibonacci {

    public static int fib(int n) {
        if (n < 0) {
            throw new RuntimeException("n=" + n);
        }

        if (n == 0 || n == 1) {
            return n;
        }

        return fib(n - 2) + fib(n - 1);
    }

    public static int fib(int n, int a, int b) {
        if (n == 0) {
            return a;
        }
        if (n == 1) {
            System.out.print("n=" + n + ",返回结果b=\t");
            return b;
        }
        {
            int tmp = a;
            a = b;
            b = tmp + b;
        }
        return fib(n - 1, a, b);
    }

    public static int fibPlus(int n, int a, int b) {
        if (n == 0) {
            return a;
        }
        if (n == 1) {
            return b;
        }
        return fibPlus(n - 1, b, a + b);
    }


    public static int fibPlus(int n) {
        int a = 0;
        int b = 1;
        if (n == 0) {
            return a;
        }
        if (n == 1) {
            return b;
        }
        for (int i = n; i > 0; i--) {
            int tmp = a;
            a = b;
            b = tmp + b;
        }
        return a;
    }

    public static void main(String args[]) {
        for (int i = 0; i <= 24; i++) {
//            System.out.print(fib(i) + "\t");
            System.out.print(fib(i, 0, 1) + "\t");
//            System.out.print(fibPlus(i, 0, 1) + "\t");
//            System.out.print(fibPlus(i) + "\t");
            System.out.println();
        }

    }

}
