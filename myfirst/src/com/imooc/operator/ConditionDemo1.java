package com.imooc.operator;

public class ConditionDemo1 {
    public static void main(String[] args) {
        //定义两个变量存放两件衣服的价格
        double price1,price2;
        price1 = 80;
        price2 = 55;
        //计算两件衣服的价格
        double sum = price1 + price2;
        System.out.println("原价："+sum);
        if(sum > 100){
            sum -= 20;
        }
        System.out.println("折后价："+sum);
    }
}
