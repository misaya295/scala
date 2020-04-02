package com.cwk.dasha;

import java.math.BigDecimal;
import java.util.Scanner;

public class SumDemo03 {

    public static void main(String[] args) {
        SumDemo03 sumDemo03 = new SumDemo03();
        sumDemo03.sum02();

    }

    public void sum02() {



        while (true) {
            double sum = 0;
            System.out.println("输入a");
            Scanner scanner = new Scanner(System.in);
            double a = scanner.nextDouble();

            System.out.println("输入b");
            Scanner scanner1 = new Scanner(System.in);
            double b = scanner1.nextDouble();

            System.out.println("输入c");
            Scanner scanner2 = new Scanner(System.in);
            double c = scanner2.nextDouble();

            sum = a * b * c;

            System.out.println(sum);
            BigDecimal bg = new BigDecimal(sum);
            double f1 = bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
            System.out.println(f1);

        }
    }
}
