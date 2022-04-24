package com.imooc.flow1;

import java.util.Scanner;

public class GuessDemo {
    public static void main(String[] args) {
        //设置要猜的数
        int number = (int)(Math.random()*10+1);
        int guess;
        Scanner sc = new Scanner(System.in);
        System.out.println("猜一个介于1到10之间的数");
        do{
            System.out.println("请输入猜测的数");

            guess = sc.nextInt();
            if(guess > number)
                System.out.println("大了！");
            else if(guess < number)
                System.out.println("小了！");

        }while (number != guess);
        System.out.println("猜对了！答案为"+guess);
    }
}
