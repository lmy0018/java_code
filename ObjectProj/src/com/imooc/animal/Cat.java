package ObjectProj.src.com.imooc.animal;

/**
 * 宠物猫类
 */
public class Cat {
    //成员属性:昵称、年龄、体重、品种
    private String name; //限定只能再当前类内使用
    private int month;
    private double weight;
    private String species;

    public void setMonth(int month) {
        if(month < 0){
            System.out.println("年龄不能小于零");
            this.month = 0;
        }else{
            this.month = month;
        }
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getMonth() {
        return month;
    }

    public double getWeight() {
        return weight;
    }

    public String getSpecies() {
        return species;
    }

    public Cat(){
        System.out.println("我是无参构造方法");
    }
    public Cat(String name){
        System.out.println("我是带参构造方法");
    }
    public Cat(String name, int month,double newWeight,String newSpecies){
        this();//构造方法只能在构造方法间调用
        //因为就近原则赋值，所以参数名和成员属性名相同时，要用this(代表的意思是当前对象)，赋值给当前对象.成员属性;谁调用了谁就是this
        this.name = name;
        this.setMonth(month);
        weight = newWeight;
        species = newSpecies;
    }
    //创建 get/set方法
    //在get/set 方法中添加对属性的限定
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return  this.name;
    }
    //不推荐这样写，因为与类同名了
    public void Cat(){
        System.out.println("我是一个普通的无参无返回值的方法");
    }
    //成员方法:跑动、吃东西
    public void run(){
        this.eat();
        System.out.println("小猫会跑");
    }
    public void run(String name){
        System.out.println(name + "快跑");
    }
    public void eat(){
        System.out.println("小猫吃鱼");
    }
}
