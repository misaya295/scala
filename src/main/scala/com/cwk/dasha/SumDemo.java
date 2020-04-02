package com.cwk.dasha;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SumDemo {


    //4.39 9.24 3.84 2.97 4.36 5.23 3.35 0.76 0.76 0.71 0.73 1.85 2.03 2.03 1.08 0.45 3.4 2.15 1.51 1.94 1.71 2.08 0.71 2.08 0.71
    // 0.73 0.76 2.07 4.35 5.23 3.38 3.85 3.97 5.25 3.68 4.95 3.87 4 5.27 4.93 3.64 4.36 5.24 3.38 0.77 0.74 0.75 1.71 1.92 2.1
    public static void main(String[] args) {

        SumDemo sumDemo = new SumDemo();
        sumDemo.sum1();

    }

    public void sum1(){
        List<Double> da = new ArrayList<Double>();
//        boolean a = true;
        while (true) {

            System.out.println("输入数字");
            Scanner scanner = new Scanner(System.in);
            double b = scanner.nextDouble();
            da.add(b);
            if (b == 0) {

                break;
            }
        }



        //...
        double sum = 0;
        for(Iterator iterator = da.iterator(); iterator.hasNext();){
            double i = (Double) iterator.next();
            sum += i;
            System.out.print(" "+i+" ");

        }
        System.out.println(" ----------------");
        System.out.println(sum);

    }
}



