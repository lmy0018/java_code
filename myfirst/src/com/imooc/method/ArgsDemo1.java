package com.imooc.method;

public class ArgsDemo1 {
    //查找
    public void search(int n ,int...a){
        boolean flag = false;
        for(int i : a){
            if(n == i) {
                flag = true;
                break;
            }
        }

        if(flag){
            System.out.println("找到了"+n);
        }else {
            System.out.println("没找到"+n);
        }
    }

    public static void main(String[] args) {
        ArgsDemo1 argsDemo1 = new ArgsDemo1();
        argsDemo1.search(1,12,34,1,5,6,7);
        int[] a = {1,2,3,4,5};
        argsDemo1.search(4,a);
    }
}
