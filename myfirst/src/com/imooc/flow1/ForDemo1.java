package com.imooc.flow1;

public class ForDemo1 {
    public static void main(String[] args) {
        //将10一下整数打印输出
        for(int i = 1;i<=10;i++){
            System.out.print(i+" ");
        }

        //省略
        int i=1;
        for(;;){
            System.out.print(i+"");
            if(i==10)
                break;
            i++;
        }
    }
}
