package com.imooc.method;

public class MethodDemo {

    //打印输出星号的方法
    public void printStar(){
        System.out.println("******************************************");
    }

    public static void main(String[] args) {
        System.out.println("******************************************");
        System.out.println("欢迎来到JAVA的世界");
        System.out.println("******************************************");
        //创建类的对象
        MethodDemo myMethodDemo = new MethodDemo();
        //使用对象名.方法名()调用方法
        myMethodDemo.printStar();
        System.out.println("欢迎来到JAVA的世界！");
        myMethodDemo.printStar();

    }

}
