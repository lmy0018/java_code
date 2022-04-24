package com.imooc.flow1;

public class StarDemo1 {
    public static void main(String[] args) {
        int m=1;
        int n=1;
        System.out.println("输出十行十列的星号");
        while (m<=10){
            while(n<=m){
                System.out.print("*");
                n++;
            }
            System.out.println();
            m++;
            n=1;
        }
    }
}
