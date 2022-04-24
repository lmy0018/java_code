package com.imooc.flow1;

public class StarDemo2 {
    public static void main(String[] args) {
        int n = 1;
        int m = 1;
        int s = 1;
        while(n<=10){
            while(m<11-n){
                System.out.print(" ");
                m++;
            }
            while(s<=n){
                System.out.print(" *");
                s++;
            }
            System.out.println();
            m=1;
            s=1;
            n++;
        }
    }
}
