package com.imooc.method;

public class ArrayMethod {
    //打印输出数组元素的值
    public void printArray(int[] arr){
        for(int n:arr){
            System.out.print(n+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        ArrayMethod arrayMethod = new ArrayMethod();
        arrayMethod.printArray(arr);
    }
}
