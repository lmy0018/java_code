package com.imooc;

public class StringDemo {
    public static void main(String[] args) {
        //定义一个空字符串
        String s1 = "";
        System.out.println("s1 = " + s1);
        //定义一个字符串，内容是 hello
        String s2 = "hello";
        System.out.println("s2 = " + s2);
        //定义一个包含unicode字符的字符串
        String s3 = "A\u005d\u005fB";
        System.out.println("s3 = " + s3);
        //定义一个包含空格的字符串
        String s4 = "hello imooc";
        System.out.println("s4 = " + s4);
    }
}
