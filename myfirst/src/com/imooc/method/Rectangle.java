package com.imooc.method;

public class Rectangle {
    //求长方形面积
    public int area(){
        int length = 10;
        int width = 5;
        int getArea = length * width;
        return getArea;
    }
    public static void main(String[] args) {
        Rectangle rc = new Rectangle();
        System.out.println("长方形面积为:"+rc.area());
    }
}
