package com.imooc.flow1;

public class JiechengPlus {
    public static void main(String[] args) {
        int s=1;
        int sum=0;
        for (int i=1;i<=10;i++){
            for(int j=1;j<=i;j++){
                s=s*j;
            }
            sum = sum+s;
            s=1;
        }
        System.out.println("1!+~10!="+sum);
    }
}
