package nshekov.lesson2;

import java.util.Scanner;

public class less1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи первое число:");
        int a = sc.nextInt();
        System.out.println("Введи второе число");
        int b = sc.nextInt();
        int sum, razn, proizv, chast, ost;
        sum = a + b;
        razn = a - b;
        proizv = a * b;
        chast = a / b;
        ost = a % b;
        System.out.println(sum + " " + razn + " " + proizv + " " + chast + " " + ost);
        double dd = 1;
        System.out.println(sum*dd + " " + razn*dd + " " + proizv*dd + " " + chast*dd + " " + ost*dd);
    }
}
