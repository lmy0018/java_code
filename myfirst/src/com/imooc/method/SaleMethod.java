package com.imooc.method;

import java.util.Scanner;

public class SaleMethod {
    //根据商品价格，计算出对应的折扣并输出
    public  void sale(float p){
        if(p<100){
            System.out.println("不打折:"+p);
        }else if(p<200){
            System.out.println("折后商品总价为:"+p*0.95);
        }else{
            System.out.println("折后商品总价为:"+p*0.85);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SaleMethod saleMethod = new SaleMethod();
        System.out.println("请输入商品价格");
        saleMethod.sale(sc.nextFloat());
    }
}
