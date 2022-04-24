package com.imooc;

public class VarDemo {
    public static void main(String[] args) {
        //定义两个整型变量x,y
        //int x = 3,y = 5;
        int x,y;
        x=3;y=5;
        System.out.println("x="+x);
        System.out.println("y="+y);
        //关于换行的问题
        System.out.print(x+" "+y+'\n');
        System.out.println();
        System.out.print(x+","+y);
        System.out.println("\n\'"+x+"\'");
        //定义一个汉字字符
        char ch = '慕';
        System.out.println(ch);
        //不建议中文作为变量名
        char 中文 = '中';
        //用科学计数法表示浮点型数据
        double d = 1.23E5;
        float f = 1.23e5f;
        double d1 = .2;
        System.out.println("d="+d);
        System.out.println("f="+f);
        System.out.println("d1="+d1);
    }
}
