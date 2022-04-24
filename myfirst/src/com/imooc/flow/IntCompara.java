package com.imooc.flow;

public class IntCompara {
    public static void main(String[] args) {
        //定义两个整型变量并初始化
        int x = 5,y= 10;
        if(x!=y){
            if(x>y){
                System.out.println(x+"大于"+y);
            }else{
                System.out.println(x+"小于"+y);
            }
        }else {
            System.out.println(x+"和"+y+"相等");
        }
    }
}
