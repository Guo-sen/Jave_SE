
public class test {
    public static void main(String[] args) {
        //两个对象的一对一关系
        //比如一个英雄对应一个兵器
        //双向一对一和单向一对一
        //其实就是把另一个类型作为我这个类型的属性
        /*
        Hero hero1=new Hero("刘备",15);
        Weapon weapon1=new Weapon("双股剑",15);

        //通过set方法让他们产生关系
        hero1.setWeapon(weapon1);
        weapon1.setHero(hero1);

        //通过英雄来获取信息
        String name= hero1.getName();
        int grade= hero1.getGrade();
        Weapon w=hero1.getWeapon();
        System.out.println(name);
        System.out.println(grade);
        System.out.println(w.getName());
        System.out.println(w.getGrade());
        */





        //static关键字

        //1.使用static修饰一个属性
        //声明为static的变量实质上就是一个全局变量(声明周期变长了)
        /*
        Role bei=new Role("刘备","蜀国");
        Role fei=new Role("张飞","蜀国");
        Role yv =new Role("关羽","蜀国");
        System.out.println(bei.getInfo());
        System.out.println(fei.getInfo());
        System.out.println(yv.getInfo());
        */
        //以上三人都是蜀国，作为3个对象他们的国家都是一样的，存了三份，造成了空间浪费
        //可以在下边的类中用static修饰country，这样就可以节省内存空间
        /*
        Role bei=new Role("刘备");
        Role fei=new Role("张飞");
        Role yv =new Role("关羽");
        System.out.println(bei.getInfo());
        System.out.println(fei.getInfo());
        System.out.println(yv.getInfo());
        */
        //2.static修饰一个方法
        //通常在类中定义一个方法为static，那么该方法属于类，不依赖于对象，所以调用这个方法时，用类名调用，不要用对象调用
        //需要注意的是静态方法只能访问静态的属性和方法（因为静态相当于全局，那些非静态的数据属于对象，静态的不属于对象，属于这个类）
        /*
        System.out.println(Role.country);
        */
        //3.使用static修饰一个类（内部类，以后会讲到）

        //什么时候使用static？
        //所有对象共同的属性或方法，我们可以定义为静态的


        //main方法分析
        //public 公有的，最大访问权限
        //static 静态的，无需创建对象
        //void 表示没有返回值，无需像jvm返回结果
        //main 方法名，固定的方法名
        //String[] args 表示参数为字符串数组，可以在调用方法时传入参数（cmd可以给args传参）




        //代码块
        //1.普通代码块， 普通的写在方法中的可以来限制变量生命周期的{}
        //2.构造块，直接写在类中的{}，在创建对象的时候会被调用，会比构造方法先执行
        //3.静态代码块，在类中使用static声明的代码块称为静态代码块，
        //只在第一次创建对象的时候会被调用，会优于构造块执行，我们在项目开发过程中，通常会使用静态代码块，来初始化
        //只会调用一次的数据
        //4.同步代码块（多线程中会讲到）
        //重点使用的顺序是1、3、4、2


        //单例设计模式



    }

}
//演示两个对象的一对一关系使用
//英雄类
class Hero{
    private String name;
    private int grade;
    private Weapon weapon;    //这样就能通过英雄找到武器
    public void setWeapon(Weapon weapon){
        this.weapon=weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Hero(){};
    public Hero(String name,int grade){
        this.name=name;
        this.grade=grade;

    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }
}
//武器类
class Weapon{
    private String name;
    private int grade;
    private Hero hero; //这样就能通过武器类锁定了英雄

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public Hero getHero() {
        return hero;
    }

    public Weapon(){}
    public Weapon(String name,int grade){
        this.grade=grade;
        this.name=name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }
}


//演示static关键字使用
class Role{
    private String name;
    //private String country;
   // private static String country="蜀国"; //静态变量,存在静态区（全局变量），实际上
                                        //静态变量不属于对象，依赖于类(所以不要使用对象来调用静态变量，用类名调用)
                                        //静态变量只存一份，某一个对象改了这个国家，所有的属于这个类的对象都会受到影响
    public static String country ="蜀国";
    public Role(){}
    /*
    public Role(String name,String country){
        this.name=name;
        this.country=country;
    }*/
    public Role(String name){
        this.name=name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public static void setCountry(String country){
        Role.country=country;
    }


    /*
    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }*/


    public String getInfo(){
        return "name="+name+"country="+country;
    }
}