package com.cwk.dasha;


import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 费用=平方数*120
 * 平方数=长*宽
 */
public class SumOfdasha {




    public static void main(String[] args) {


        SumOfdasha sumOfdasha = new SumOfdasha();

        while (true)

        {
            System.out.println("输入长1");
            Scanner scanner = new Scanner(System.in);
            double a = scanner.nextDouble();

            System.out.println("输入长2");
            Scanner scanner1 = new Scanner(System.in);
            double b = scanner1.nextDouble();

            System.out.println("输入高");
            Scanner scanner2 = new Scanner(System.in);
            double c = scanner.nextDouble();

            int w = 120;


            sumOfdasha.sum(a,b,c);



        }



    }



    public  void sum( double a, double b,double c){
        double sum;

        sum=((a+b)*c)/10000.0;
        System.out.println(sum);
        BigDecimal bg = new BigDecimal(sum);
        double f1 = bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(f1);







    }


}
