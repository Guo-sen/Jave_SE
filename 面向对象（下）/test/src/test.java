
//继承是从已有的类创建新类的过程
//继承是面向对象的三大特性之一
//被继承的类称为父类（超类），继承父类的类称为子类（派生类）
//继承是一个对象直接使用另一个对象的属性和方法
//通过继承可以实现代码重用


//         动物
//  猫  狗    鸡     猪
//        家鸡 野鸡

//语法
//访问权限 class 子类名 extends 父类名{
//  类体定义；
// }
//继承只能继承非私有的数据（属性和方法）
//proteed 受保护的访问权限修饰符，用于修饰属性和方法，用protected修饰的属性和方法可以被子类继承

/*
public class test {
    public static void main(String[] args) {

        HomeDog hd =new HomeDog();
        hd.setName("小黑");
        System.out.println(hd.getName());
    }
}
class Dog{
    protected String name;
    protected String sex;
    protected int age;
    public void eat(){
        System.out.println("吃饭");
    }
}
class HomeDog extends Dog{
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void     print(){
        System.out.println("家狗");
    }
}
class HuskyDog extends Dog{
    public void show(){
        System.out.println("哈士奇");
    }
}
*/

//继承的限制
//Java只能实现单继承，也就是一个类只能有一个父类
//允许多层继承：一个子类可以有一个父类，一个父类还可以有其它的父类
//继承只能继承非私有的属性和方法
//构造方法不能被继承
//创建子类对象时，父类的构造方法也会被调用，为什么？
//因为子类要用到父类的数据，那么就要通过父类的构造方法来初始化数据

//创建对象会调用构造方法，调用构造方法不一定就是创建对象
//实例化子类对象，会先调用父类的构造方法，如果父类中没有默认的构造方法，那么子类必须显示的通过super（...）来调用父类的带参构造方法
//super也只能子在类构造方法的第一句

/*
public class test {
    public static void main(String[] args) {

        HomeDog hd =new HomeDog("小黑");
        System.out.println(hd.getName());
    }
}
class Dog{
    protected String name;
    protected String sex;
    protected int age;
    public Dog(String name,String sex){
        this.name=name;
        this.sex=sex;
    }
    public void eat(){
        System.out.println("吃饭");
    }
}
class HomeDog extends Dog{

     public HomeDog(String name){
        super(name,"公");
     }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void     print(){
        System.out.println("家狗");
    }
}

//继承的缺点 增强了类和类之间的耦合性

*/



//方法的重写
//在Java中，子类可以继承父类中的方法，而不需要重新编写相同的方法。但有时候子类并不想原封不动的继承父类的方法，而是想做一定的修改
//这就需要采用方法的重写，方法的重写又称方法的覆盖
//在子类和父类中，重写方法后，在调用时，以创建的对象为准，会调用谁的方法

//关于方法重写的一些特性
//1.发生在子父类中，方法重写的两个方法 返回值、方法名、参数列表必须完全一致（子类重写父类的方法）
//2.子类抛出的异常不能超过父类相应方法抛出的异常（子类异常不能大于父类异常）//后续会讲到异常
//3.子类方法的访问级别不能低于父类相应方法的访问级别
//4.父类中的方法若使用private static final任意修饰符修饰，那么不能被子类重写
/*
public class test {
    public static void main(String[] args) {

        HomeDog hd =new HomeDog("小黑");
        System.out.println(hd.getName());
        hd.eat();
    }
}
class Dog{
    protected String name;
    protected String sex;
    protected int age;
    public Dog(String name,String sex){
        this.name=name;
        this.sex=sex;
        System.out.println("我是Dog的构造方法");
    }
    public void eat(){
        System.out.println("吃饭");
    }
}
class HomeDog extends Dog{
    public HomeDog(String name){
        super(name,"公");
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void     print(){
        System.out.println("家狗");
    }

    @Override
    //方法重写
    public void eat() {
        System.out.println("家狗吃饭");
    }
}
class HuskyDog extends Dog{
    public HuskyDog(String name){
        super(name,"母");
    }
    public void show(){
        System.out.println("哈士奇");
    }
}

//方法重载：方法名相同，参数列表不同，返回值无关，发生在同一个类中
//方法重写：方法名相同，参数列表相同，返回值相同，发生在子父类中，子类的访问修饰符不小于父类的访问修饰符
//        子类的异常声明不大于父类的异常声明，如果方法被private static final修饰，这个方法不能被重写
 */





//super关键字
//1.使用super调用父类的属性，可以从父类实例处获得信息
//即 在子类中调用父类属性可以写成：super.父类属性 //super可以省略（因为父类的属性已经继承过来了，已经是自己的了）
//2.使用super调用父类的方法，可以委托父类对象帮助完成某件事
//即：如果重写某个父类方法，如果想在重写的方法中调用父类方法，在重写的方法内部，使用：super.父类方法
//3.使用super调用父类的构造方法（super（实参）形式），必须在子类构造方法的第一句，调用父类中相应的构造方法，若不显示的写出来，默认调用
//父类中无参的构造方法，比如：super（）；


//继承的应用实例



//final关键字
//1.使用final关键字声明一个常量
//修饰属性或者修饰局部变量（最终变量），也称为常量
//2.使用final关键字声明一个方法
//该方法为最终方法，且只能被子类继承，但是不能被子类重写
//3.使用final关键字声明一个类
//该类就成了最终类，没有子类的类，即final修饰的类无法被继承
//4.在方法参数中使用final，在该方法的内部不能修改参数的值（在内部类中详解）

/*
public class    test {
    static final int PERSON_NUM = 10; // 常量的命名建议大写。常量一般就一个，没有必要生成对象去调用，所以一般用static修饰
                                        //  static前还可以加public或者private
                                    //private static public 都是访问权限修饰符，写代码时他们三者的顺序没有规定
    public static void main(String[] args) {

       // PERSON_NUM=20; 不能被修改
        System.out.println(test.PERSON_NUM);
    }
}
//当一个常量在好几个类中都要使用的话，可以考虑定义一个常量类

class Constant{
     public static final int DAY_HOURS=24; // 常量在定义的时候必须初始化
}
*/



//抽象类
//很多具有相同特征和行为的 对象 可以抽象为一个类 ；很多具有相同特征和行为的 类 可以抽象为一个抽象类
//使用abstract关键字声明的类为抽象类
//    人
//男人   女人
/*
public class test {
    public static void main(String[] args) {
        Man man=new Man();
        man.eat();
        man.move();
        Women women = new Women();
        women.eat();
        women.move();
    }
}
//定义一个抽象类
abstract class Animal{
    public abstract void move(); //抽象方法只有声明没有实现
}
abstract class Person extends Animal{
    private String name;
    //...
    public abstract void eat(); // 抽象方法
}

//具体类（继承抽象类的具体类必须实现所有的抽象方法）
class Man extends Person{
    @Override
    public void eat() {
        System.out.println("我是男人，我爱吃肉");
    }

    @Override
    public void move() {
        System.out.println("我爱跑步");
    }
}

class Women extends Person{
    @Override
    public void eat() {
        System.out.println("我是女人，我不喜欢吃肉");
    }

    @Override
    public void move() {
        System.out.println("我喜欢逛街");
    }
}
*/
//1.抽象类可以没有抽象方法，有抽象方法的类必须是抽象类
//2.非抽象类继承抽象类必须实现所有的抽象方法
//3.抽象类可以继承抽象类，可以不实现父类的抽象方法
//4.抽象类可以有方法实现和属性
//5.抽象类不能被实例化
//6.抽象类不能声明为final
//7.抽象类可以有构造方法（构造方法不一定是用来创建对象的，也可以用来初始化属性）


//接口（相当于一个规范，需要具体的一个类去实现,接口不能实例化）
//接口的定义格式
//interface 接口名称{
//  全局常量；
//  抽象方法；
// }
/*
public class test {
    public static void main(String[] args) {
        Person peo=new Person("张三");
        peo.run();
        peo.eat();
        peo.print();
    }
}

interface IEat{
    //public abstract void eat(); //接口中只能定义抽象方法，没有实现（JDK1.8可以有一个带实现的默认方法）
    //  接口不能有构造方法
    void eat();//在接口中定义的方法没有默认修饰符，默认为public static
    //public static final int NUM=10;//在接口中定义的常量
    int NUM = 10;//简写，接口会默认为这是一个常量（因为接口里只能定义常量）
    public default void print(){
        System.out.println("默认方法（接口）");
    }
}
interface IRun{
    void run();
}
//接口与接口之间是可以相互继承的,并且可以多继承(类不能)
interface ISleep extends IEat,IRun{
    void sleep();
}
//实现接口的类(使用关键字implements)必须实现所有的方法
class Person implements IRun,IEat{

    private String name;
    public Person(){}
    public Person(String name){
        this.name=name;
    }
    @Override
    public void eat() {
        System.out.println("我爱吃肉");
    }

    @Override
    public void run() {
        System.out.println("我是"+name+"我爱跑步");
    }
}

//面向对象设计原则：1.对修改关闭，对扩展开放  2.面向接口编程
 */




//多态性
//面向对象三大特性之一
//什么是多态性？ 对象在运行过程中的多种形态
//多态性我们大概可以分为两类：
//1.方法的重载与重写
//2.对象的多态性

//例如：用父类的引用指向子类对象（用大的类型去接收小的类型，向上转型、自动转换）
/*
import java.util.concurrent.Callable;

public class test {
    public static void main(String[] args) {
        HomeChicken hc=new HomeChicken("小家鸡");
        hc.eat();
        YeChicken yc=new YeChicken("小野鸡");
        yc.eat();
        //以上写法没有体现出来父类鸡的作用

        //用父类的引用指向子类对象（用大的类型去接收小的类型，向上转型、自动转换）
       Chicken hc1=new HomeChicken("小家家鸡");
        hc1.eat();
        eat(hc1);
        hc1=yc;
        eat(hc1);
        hc1.eat();
        //以上叫做多态，hc1可以表示家鸡也可以表示野鸡，这就表示出来这个对象具有两种形态

        Chicken jjj=new ScChicken("尖椒鸡");
        eat(jjj);
    }

    //这样写方法就叫抽象的写法（粒度），面向抽象编程，好处是即使未来出现了新的鸡的种类，那这个方法还是可以运行的
    public static void eat(Chicken c){
        System.out.println("鸡吃饭");
        c.eat();
       //强制类型转换,向下转型
        System.out.println("-----------------");

        //父类里边没有song方法，所以调用之前需要把这个父类引用强制类型转换
        //instanceof是用于检查对象是否为指定的类型，通常在把父类引用强制转换为子类时使用，
        //以避免发生类型转换异常（ClassCastException）
        if(c instanceof ScChicken){//对象本身的类和对象的父类型都可以通过检查
            ScChicken tmp=(ScChicken) c; //大的类型转换成小的类型，强制类型转换
            tmp.song();
        }

    }

}
//鸡类

abstract class Chicken{
    private String name;
    public Chicken(){}
    public Chicken(String name){
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract void eat();
}

//家鸡
class HomeChicken extends Chicken{
    public HomeChicken(String name){
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("我是"+this.getName()+"我爱吃米");
    }
}

//野鸡
class YeChicken extends Chicken{
    public YeChicken(String name){
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("我是"+this.getName()+"我爱吃虫子");
    }
}

//尖椒鸡
class ScChicken extends Chicken{
    public ScChicken(String name){
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("我是"+this.getName()+" 不吃饭");
    }
    public void song(){
        System.out.println("唧唧复唧唧，我是尖椒鸡");
    }
}
*/
/*
//结论：在编程时针对抽象类型的编写代码，称为面向抽象编程（或面向接口编程）
//父类通常都定义为抽象类、接口

//对象的多态性：对象的多态性是从继承关系中的多个类而来，
//向上转型：将子类实例转为父类引用
//格式： 父类 父类对象=子类实例；//自动转换
//以基本数据类型操作为例：int i = 'a';因为char的容量小所以可以自动完成转换

//向下转换：将父类实例转化为子类实例
//格式： 子类 子类对象 = （子类）父类实例;//强制转换
//以基本数据类型为例：char c = （char）97;
//因为4个字节比char的2个字节要大，所以需要强制完成

//1.方法的重载和重写就是方法的多态性表现
//2.多个子类就是父类中的多种形态
//3.父类引用可以指向子类对象，自动转换
//4.子类对象指向父类引用需要强制转换
//5.实际开发过程中尽量使用父类引用（有利于扩展）

 */

//instanceof关键字(上边有例子)
//instanceof是用于检查对象是否为指定的类型，通常在把父类引用强制转换为子类时使用，以避免发生类型转换异常（ClassCastException）
//语法格式如下
//对象 instanceof 类型   //会返回boolean类型
//示例
/*
if(homeChicken instanceof Chicken){
    //.....
    //.....
        }

 */
//该语句一般用于判断一个对象是否是某个类的实例，是则返回true，否则返回false


//父类的设计法则：通过instanceof关键字，我们可以很方便的检查对象的类型，但是一个父类的子类过多，这样的判断
//还是显得很繁琐，那么如何去设计一个父类呢？
//1.父类通常情况下都优先设计成接口类或抽象类，其中优先考虑接口，如接口不能满足才考虑抽象类
//2.一个具体的类尽可能不去继承另一个类，这样的好处是无需检查对象是否为父类的对象



//抽象类的应用——模板方法模式（Templete Method）
//模板方法模式：定义一个操作中的算法的骨架，而将一些可变部分的实现延迟到子类中。模板方法模式使得子类可以不改变一个
//算法的结构即可重新定义该算法的某些特定的步骤

/*
public class test {
    public static void main(String[] args) {
        shopManager user=new shopManager();
        user.action("user","add");
        System.out.println("---------------------------");
        shopManager manager=new shopManager();
        manager.action("admin","add");

        //对于shopManager来说不需要关系用户有没有权限，只需要专注于自己的事情就好了（添加，删除）
        //对于验证操作，移到baseManager了
        //excute没有在父类中实现，延迟在子类中实现了
    }
}
abstract class baseManager{
    public void action(String name,String method){
        if("admin".equals(name)){

            excute(method);
        }else{
            System.out.println("你没有权限操作");
        }
    }
    public abstract void excute(String method);

}
class shopManager extends baseManager{

    public void excute(String method){


        //执行添加或者删除操作时需要验证是否登录了（是否有权限）,当类很多时，每次都要验证，所以直接写一个baseManager，让它来继承
        if("add".equals(method)){
            System.out.println("执行了添加操作");
        } else if ("del".equals(method)) {
            System.out.println("执行了删除操作");

        }

    }

}


*/


//接口的应用--策略模式（Strategy Pattern），定义了一系列的算法，将每一种算法封装起来并且可以相互替换使用
//策略模式让算法独立于使用它的客户应用而独立变化

//OO设计原则：
//1.面向接口编程（面向抽象编程）
//2.封装变化
//3.多用组合，少用继承
//一个接口有多个实现，不同的实现独立封装，可以按运行时需求相互替换，可维护性就强了
//新增接口实现也不会影响其他实现类
/*
public class test {
    public static void main(String[] args) {
        BaseService user=new UserService();
        //user.setISave(new FileSave());
        user.setISave(new NetSave());
        //把可变的行为抽象出来，这样写的好处是这些行为可以在真正使用时相互替换
        user.add("hello world");
    }
}


interface ISave{
    public void save(String data);
}
//把可变的行为抽象出来，定义一系列的算法
class FileSave implements ISave{
    @Override
    public void save(String data) {
        System.out.println("正在把数据保存到文件中..."+data);
    }
}
class NetSave implements ISave{
    @Override
    public void save(String data) {
        System.out.println("把数据保存在网络上..."+data);
    }
}

abstract class BaseService{
    private ISave iSave; //把这个接口作为这个类的属性
    public void setISave(ISave iSave){ //然后给这个类提供一个构造方法或者set方法
        this.iSave=iSave;               //在使用的时候，把那个对象和这个接口绑定起来
    }
    public void add(String data){
        System.out.println("检查数据合法性");
        iSave.save(data);
        System.out.println("数据保存完毕");
    }
}

class UserService extends BaseService{

}
 */





//Object类
//Obeject类是类层次结构的根类
//每个类都使用Object作为超类，所有对象（包括数组）都实现这个类的方法
//所有类都是Object的子类
//所以所有类天生就有toString（），hashCode（），equals（）等这些从Object类中继承下来的方法

/*
public class test {
    public static void main(String[] args) {
        //通常，toString方法会返回一个“以文本表示此对象的字符串(类似于Student@73035e27)”。结果应该是一个简明且易于读懂的信息表达式
        //建议所有子类都重写此方法
        Student s=new Student("张三",18,22);
        System.out.println(s.toString());
        //System.out.println(s);//直接打印对象的名字也会自动调用toString方法

        //public boolean equals(Object obj)
        //指其它某个对象是否与此对象”相等“，equals方法在非空对象引用上实现相等关系：
        //自反性 对于任何非空引用值x，x.equals（x）都要返回true
        //对称性 对于任何非空引用值x和y，当且仅当y.equals（x）返回true时，x.equals（y）才返回true
        //传递性 对于任何非空引用值x、y和z，如果x.equals（y）返回true，并且y.equals（z）返回true，那么x.equals（z）应返回true
        //一致性 对于任何非空引用值x和y，多次调用x.equals（y）始终返回true或者始终返回false，前提是对象上equals比较中所用的信息没有被修改
        //对于任何非空引用值x，x.equals（null）都应该返回false。
        //Object类的equals方法实现对象上差别可能性最大的相等关系；即对于任何非空引用值x和y，当且仅当x和y引用同一个对象时候此方法才返回true（x==y具有值true）
        //注意当此方法被重写时，通常有必要重写hashCode方法的常规协定，该协定声明相等的对象必须具有相等的哈希码

        Student s1 = new Student("张三",18,22);
        System.out.println(s1.equals(s));
        Student s2=s1;
        System.out.println(s2.equals(s1));
        //s1和s虽然属性相同但是还是两个对象，实际输出false，当实际业务中需要把s1和s看成1个对象，需要重写equals方法


        //protected void finalize()throws Throwable
        //当垃圾回收器确定不存在对该对象的更多引用时，由对象的垃圾回收器调用此方法。子类重写finalize方法，以配置系统资源或执行其它清除

        //public final Class<?>getClass()
        //返回此Object的运行时类
        System.out.println(s1.getClass()==s.getClass());
    }
}

class Student{
    private String name;
    private int sid;
    private int age;
    public Student(){}
    public Student(String name,int sid,int age){
        this.name=name;
        this.age=age;
        this.sid=sid;
    }
    //重写Object中继承下来的toString方法
    public String toString(){
        return " sid="+sid+" name="+name+" age="+age;
    }
    //重写equals方法，来实现两个对象的比较
    public boolean equals(Object obj){
        if(this==obj){
            return  true;
        }
        if(obj instanceof Student){
            Student s = (Student)obj;
            if(!this.name.equals(s.name)){
                return false;
            }
            if (this.age!=s.age) {
                return false;
            }
            if (this.sid==s.sid) {
                return true;
            }
        }
        return false;
    }
}

*/





//简单工厂模式
//简单工厂模式是由一个工厂对象决定创建出哪一种产品的实例。简单工厂模式是工厂模式家族中最简单实用的模式

//假设没有简单工厂模式
/*
public class test {
    public static void main(String[] args) {
        Product pro=new Phone();  //test是测试类，Phone和Computer是被使用的类
                                 //这种写法test类和Phone类相互依赖，如果某一天这个Phone没有了，这种写法会报错
                                //使用者和被使用者，两者之间，耦合，产生了依赖
        pro.work();

    }
}
interface Product{
    public void work();//开始工作
}

class Phone implements Product{
    @Override
    public void work() {
        System.out.println("手机开始工作...");
    }
}

class Computer implements Product{
    @Override
    public void work() {
        System.out.println("电脑开始工作...");
    }
}
*/


//使用工厂模式降低耦合
/*
public class test {
    public static void main(String[] args) {
       Product phone=ProductFactory.getProduct("Phone");
       if(phone!=null){
           phone.work();
       }
    }
}

class ProductFactory{
    public static Product getProduct(String name){
        if("Phone".equals(name)){
            return new Phone();
        }else if("Computer".equals(name)){
            return new Computer();
        }
        return null;
    }
}
interface Product{
    public void work();//开始工作
}

class Phone implements Product{
    @Override
    public void work() {
        System.out.println("手机开始工作...");
    }
}

class Computer implements Product{
    @Override
    public void work() {
        System.out.println("电脑开始工作...");
    }
}
*/




//静态代理模式
//代理模式（Proxy）：为其它对象提供一种代理以控制对这个对象的访问
//代理模式说白了就是“真是对象的代表”，在访问对象时，引入一定程度的间接性，因为这种间接性可以附加多种用途。
//代理模式就是通过代理对象来达到控制访问对象的目的









/*
public class test {
    public static void main(String[] args) {

    }
}
 */