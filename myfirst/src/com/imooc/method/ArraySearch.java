package com.imooc.method;

public class ArraySearch {

    public boolean search(int[] arr,int n){
        boolean flag = false;
        for(int i:arr){
            if(i==n){
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] arr = {12,3,4,5,6,7,8,9};
        ArraySearch arraySearch = new ArraySearch();
        System.out.println(arraySearch.search(arr,5));
    }
}
