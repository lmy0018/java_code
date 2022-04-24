package com.imooc.array;

public class ArrayDemo5 {
    public static void main(String[] args) {
        //二维数组的声明
        //三种形式
        int[][] intArray;
        float floatArray[][];
        double[] doubleArray[];
        //创建一个三行三列的int类型数组
        intArray = new int[3][3];
        System.out.println("intArray数组第三行第二列:"+intArray[2][1]);
        intArray[1][2] = 9;
        System.out.println(intArray[1][2]);
        //声明数组同时进行创建
        char[][] ch = new char[3][5];
        //创建时只指定行数
        floatArray = new float[3][];
       // System.out.println(floatArray[0][0]); //空指针异常
        //每行相当于一个一维数组
        floatArray[0] = new float[3];
        floatArray[1] = new float[4];
        floatArray[2] = new float[5];
        System.out.println(floatArray[0][0]);
        //二维数组的初始化
        int[][] num = {{1,1,2},{4,5,6},{7,8,9}};
        System.out.println(num[0][1]);
        System.out.println("行数:"+num.length);
        System.out.println("列数:"+num[0].length);
        int[][] num1 = {{12,34},{4,5,6},{98}};
        System.out.println("num1数组第一行列数:"+ num1[0].length);
        for(int i = 0;i<num1.length;i++){
            for(int j=0;j<num1[i].length;j++){
                System.out.print(num1[i][j]+" ");
            }
        }
    }

}
