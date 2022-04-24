package com.imooc.array;

import java.util.Scanner;

public class ArrayDemo6 {
    public static void main(String[] args) {
        //二维数组放三名学生的语文和数学成绩，从键盘输入存储到二维数组，分别求语文和数学的总成绩及平均分并输出
        Scanner sc = new Scanner(System.in);
        int[][] intGrade = new int[3][2];
        int mathSum = 0;
        int chSum = 0;
        for(int i = 0 ;i<intGrade.length;i++){
            for(int j=0;j<intGrade[i].length;j++){
                if(j%2==0){
                    System.out.println("请输入第"+(i+1)+"学生的语文成绩");
                    intGrade[i][j] = sc.nextInt();
                    mathSum += intGrade[i][j];
                }else{
                    System.out.println("请输入第"+(i+1)+"学生的数学成绩");
                    intGrade[i][j] = sc.nextInt();
                    chSum += intGrade[i][j];
                }
            }
        }
        System.out.println("语文总成绩为:"+mathSum);
        System.out.println("语文平均分为:"+mathSum/3);
        System.out.println("数学总成绩为:"+chSum);
        System.out.println("数学平均分为:"+chSum/3);

    }
}
