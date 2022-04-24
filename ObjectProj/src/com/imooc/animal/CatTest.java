package ObjectProj.src.com.imooc.animal;

public class CatTest {
    //单一职责原则，把不同职责放到不同的类中
    public static void main(String[] args) {
        //对象实例化
        Cat one = new Cat("花花",-2,1000,"英短");
        //调用
        one.eat();
        one.run();
        System.out.println(one.getMonth());//成员属性有默认初始值 int类型默认值0
        System.out.println(one.getName());//String类型默认值null
        System.out.println(one.getWeight());//double类型默认值 0.0
        System.out.println(one.getSpecies());

        one.setName("花花");
        one.setMonth(2);
        one.setWeight(1000);
        one.setSpecies("英国短毛猫");
        System.out.println(one.getMonth());
        System.out.println(one.getName());
        System.out.println(one.getWeight());
        System.out.println(one.getSpecies());

        one.run(one.getName());


    }
}
