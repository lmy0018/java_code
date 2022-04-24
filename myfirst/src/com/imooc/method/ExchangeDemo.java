package com.imooc.method;

public class ExchangeDemo {

    public void swap(int a ,int b){
        int temp;
        System.out.println("交换前a:"+a+",b:"+b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("交换后a:"+a+",b:"+b);
    }
    public static void main(String[] args) {
        ExchangeDemo exchangeDemo = new ExchangeDemo();
        int m = 4,n = 5;
        System.out.println("调用方法前m:"+m+",n:"+n);
        exchangeDemo.swap(m,n);
        System.out.println("调用方法后m:"+m+",n:"+n);
    }
}
