package com.imooc.method;

public class ArrayDemo {
    //定义一个用于修改某个数组元素值的方法
    public void updateArray(int[] arr){
        arr[3] = 15;
        System.out.println("数组a的元素为:");
        for(int n : arr)
            System.out.print(n+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayDemo arrayDemo = new ArrayDemo();
        int a[] = {1,2,3,4,5};
        System.out.println("方法调用前数组元素:");
        for (int n : a)
            System.out.print(n+" ");
        System.out.println();
        arrayDemo.updateArray(a);
        System.out.println("方法调用后数组元素:");
        for(int n : a)
            System.out.print(n+" ");
        //与基本数据类型不同，引用数据类型在调用方法后值会变化，因为在调用方法时是将方法中的变量指向了数组所在的空间，从而改变的就是原数组中的值
    }
}
