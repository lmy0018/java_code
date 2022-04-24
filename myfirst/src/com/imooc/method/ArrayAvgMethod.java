package com.imooc.method;

public class ArrayAvgMethod {
    public float arrayAvg(float[] arr){
        float sum = 0;
        for(float n:arr){
            sum += n;
        }
        return sum/arr.length;
    }
    public static void main(String[] args) {
        ArrayAvgMethod arrayAvgMethod = new ArrayAvgMethod();
        float[] arr = {78.5f,98.5f,65.5f,32.5f,75.5f};
        System.out.println(arrayAvgMethod.arrayAvg(arr));
    }
}
