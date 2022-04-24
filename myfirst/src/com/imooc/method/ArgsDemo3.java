package com.imooc.method;

public class ArgsDemo3 {
    public int plus(int a,int b){
        System.out.println("不带可变参数的方法被调用!");
        return a+b;
    }

    public int plus(int...a){
        int sum = 0;
        for(int i :a){
            sum += i;
        }
        System.out.println("带可变参数的方法被调用!");
        return sum;
    }

    public static void main(String[] args) {
        ArgsDemo3 argsDemo3 = new ArgsDemo3();
        System.out.println("和为:"+argsDemo3.plus(1,2));
        //可变参数列表所在的方法是最后被访问的
        /*多行注释*/
        /**
         * 文档注释
         * javadoc
         * javadoc -d doc ArgsDemo3.java
         * 生成帮助文档
         *
         *
         *
         *
         *
         *
         */
    }
}
