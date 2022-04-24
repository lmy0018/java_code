package com.imooc.flow1;

public class CharDemo {
    public static void main(String[] args) {
        //输出26个英文字母分两行输出
        char ch = 97;
        while(ch < 123){
            if(ch == 110)
                System.out.println();
            System.out.print(ch+" ");
            ch++;
        }
    }
}
