package myfirst.src.com.imooc.list;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List arrList = new java.util.ArrayList();
        arrList.add("语文");
        arrList.add("数学");
        arrList.add("英语");
        arrList.add("化学");
        arrList.add("物理");
        arrList.add("生物");
        System.out.println("列表中元素的个数为：" + arrList.size());
        for(int i = 0;i < arrList.size();i++){
            System.out.println("第" + (i+1) + "个为" + arrList.get(i));
        }
    }


}
