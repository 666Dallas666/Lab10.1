package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите номер пункта задания:");
        Scanner scan = new Scanner(System.in);
        int swit = scan.nextInt();
        switch(swit) {
            case 1:
                System.out.println("Введите k и s:");
                Ex1();
                break;
            case 2:
                System.out.println("Введите a и b:");
                Scanner sc = new Scanner(System.in);
                System.out.println(Ex2(sc.nextInt(), sc.nextInt()));
                break;
            case 3:
                System.out.println("Введите N:");
                Scanner scanner = new Scanner(System.in);
                int N = scanner.nextInt();
                Ex3(N);
        }
    }
    public static void Ex1(){
        int k, d;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        d = sc.nextInt();
        int min = (int)Math.pow(10, k - 1);
        int max = (int)Math.pow(10, k);
        int count = 0, sum, num;
        for (int i = min; i < max; i++) {
            sum = 0;
            num = i;
            while (num != 0){
                sum += num%10;
                num /= 10;
            }
            if (sum == d)
                count++;
        }
        System.out.println(count);
    }
    public static int Ex2(int a, int b) {
        if (a > b + 1)
            return 0;
        if (a == 0 || b == 0)
            return 1;
        return Ex2(a, b - 1) + Ex2(a - 1, b - 1);
    }
    public static void Ex3(int num){
        if (num >= 10)
            Ex3(num / 10);
        System.out.print(num % 10 + " ");
    }
}
