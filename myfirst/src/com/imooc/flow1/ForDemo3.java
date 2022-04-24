package com.imooc.flow1;

public class ForDemo3 {
    public static void main(String[] args) {
        //编写一个程序，求出200到300之间的数，且满足条件：它们三个数字之积为42，三个数字之和为12。
        int g,s,b;
        for(int n=200;n<=300;n++){
            b=n/100;
            s=n/10%10;
            g=n%10%10;
            if((b*s*g==42)&&(b+s+g==12))
                System.out.println(n);
        }
    }
}
