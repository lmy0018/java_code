package com.imooc;

public class CharDemo {
    public static void main(String[] args) {
        //定义一个变量存放字符'a'
        char a = 'a';
        System.out.println("a = " + a);
        //ASCII码 美国标准信息交换代码
        char ch = 65;
        System.out.println("ch = " + ch);
        //如果字面值超出char类型所表示的数据范围，需要进行强制类型转换。
        char ch1 = (char)65536;
        System.out.println("ch1 = " + ch1);
        //定义一个 unicode 编码表示的字符
        char c = '\u005d';
        System.out.println("c + " + c);


    }

}
