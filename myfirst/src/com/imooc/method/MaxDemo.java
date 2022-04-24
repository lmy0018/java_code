package com.imooc.method;

public class MaxDemo {

    public  void  max(float a,float b){
        float max;
        if(a>b){
            max = a;
        }else{
            max = b;
        }
        System.out.println("最大值为:"+max);
    }


    public static void main(String[] args) {
        MaxDemo maxDemo = new MaxDemo();
        maxDemo.max(5,6);
    }
}
