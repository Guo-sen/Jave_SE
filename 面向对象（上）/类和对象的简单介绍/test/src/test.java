
//面向过程 以步骤为单位，一步一步完成某一个具体的事情
//面向对象 以对象为单位，通过调度组合不同的对象来完成某一个事情，面向对象是一种思考问题的思维方式
//1.先整体，再局部
//2.先抽象，再具体
//3.能做什么，再怎么做

//类和对象
//类：分类、类别
//通过分类，我们可以区分不同的事物种类
//所以类是一组具有相同特性（属性）与行为（方法）的事物的集合
//类表示一个共性的产物，是一个综合的特征
//类由属性和方法构成：
//1.属性：相当于一个 个的特征
//2.方法：就相当于人的一个个的行为，例如，说话、吃饭、睡觉

//对象：是一个个性的产物，是一个个体的特征
//很多很多的对象可以划分为一个类别（一个类别包含很多很多对象）

//java中使用以下的语句定义一个类
//class 类名称{
// 属性名称；
// 返回值类型 方法名称（）{}
// }


//对象的定义：
//一个类要想进行真正的操作，则必须依靠对象，对象的定义格式如下：
//类名称 对象名称=new 类名称()
//按照以上的格式就可以产生对象了

//如果想要访问类中的属性或方法（方法的定义）
//则可以依靠以下的语法形式
//访问类中的属性: 对象.属性；
//掉用类中的方法： 对象.方法（）；

//在Java中对象声明有两种含义
//声明对象：Horse horse=null； //表示声明了一个对象，但是此对象无法使用，horse没有具体的内存指向
//实例化对象：horse=new Horse（）； //表示实例化了对象，可以使用
//通过对象调用方法horse.eat()
//匿名对象调用方法：new Horse().eat();
public class test {
    public static void main(String[] args) {
        /*
        People peo=null; //声明了一个类型变量（除了基本数据类型以外都是引用数据类型，包括数组）
        peo=new People(); //创建一个People类型的对象，实例化对象
        //一个对象在内存中的大小，由该对象所有属性所占内存空间大小的总和（引用类型变量在32位系统占4字节，在64位系统上占8字节）加上额外的对象的隐性数据的大小
        // 有了对象就可以调用对象的属性和方法
        peo.name="小明";
        peo.age=20;
        peo.learning();
        peo.sleep();
        //在下边还可以调用peo这个对象，也可以peo=null；把对象释放掉，以后就不能调用该对象的属性和方法了

        //匿名对象，只能使用一次，使用完后，该对象会被释放
        new People().sleep();
        new People().learning();
        //对象在内存中的结构
        //People peo=null; 会在栈内存（存储变量名和地址）生成一个名字，指向一个空地址
        //peo=new People(); 会在栈内存存储一个变量 horse，变量的内容是一个地址，指向堆内存的一块区域（包含了peo的默认属性）
        //peo.name="小明"； 会在把在堆内存的name改成“小明”

        //对象之间赋值（相同类型的对象才可以赋值）
        //第一种情况
        System.out.println("********************");
        People peo1=null;
        People peo2=null;
        peo1=new People();
        peo1.name="小白";
        peo1.age=20;
        peo2=peo1;// 对象之间赋值，两个对象会分别在栈内存开辟一块空间，但是指向的堆内存空间是同一块地址（对peo2的属性的修改也会改掉peo1的属性）
        peo2.age=10;
        System.out.println(peo1.age);
        //第二种情况
        System.out.println("********************");
        People peo3=new People();
        People peo4=new People();
        //此时peo3和peo4指向不同的堆区的内存空间
        peo3.name="红红";
        peo4.name="火火";
        peo4=peo3;          //虽然peo3和peo4指向不同的堆区的内存空间，但是此时赋值，peo4会丢弃原先指向的空间
                            //peo4会指向peo3的那块空间，和上述赋值方式结果一样
                            //peo4原来指向的火火那块空间，会被认为是垃圾对象（没有被栈中任何引用所指向），会被虚拟机的GC程序回收掉
        peo4.name="黄黄";
        System.out.println(peo3.name);
        //综上，不同的引用指向同一个对象，使用任何一个引用改变对象的值，其它的引用都会反映出来
        //编程时，要注意，在确定不使用对象时，要及早释放对象：引用=null；
        */






        //封装性
        //封装性是面向对象的三大特征之一
        //封装就是隐藏实现细节，金对外提供访问接口。
        //封装有：属性的封装、方法的封装、类的封装、组件的封装、模块化封装、系统级封装....
        //封装的好处
        //1.模块化
        //2.信息隐藏
        //3.代码重用
        //4.插件化易于调试
        //5.具有安全性
        //封装缺点：
        //会影响执行效率
        //用Student演示封装
        /*
        Student stu1=new Student();
        stu1.name="张三";
        stu1.age=20;
        stu1.score=60;
        */
        //当封装完成后就不能直接像上边那样访问了
        /*
        Student stu1=new Student();
        stu1.setName("张三");
        stu1.setAge(20);
        stu1.setScore(60);
        System.out.println(stu1.getName());
        System.out.println(stu1.getAge());
        */






        //成员变量和局部变量
        /*
        1.在类中的位置不同
        成员变量：在类中定义
        局部变量：在方法中定义或方法的参数
        2.在内存中的位置不同
        成员变量：在堆内存(成员变量属于对象，对象进堆内存）
        局部变量：在栈内存（局部变量属于方法，方法进栈内存）
        3.生命周期不同
        成员变量：随着对象的创建而存在，随着对象的销毁而消失
        局部变量：随着方法的调用而存在，随着方法的调用完毕而消失
        4.初始化值不同
        成员变量：有默认初始化值，引用类型默认为null
        局部变量：没有默认初始化值，必须定义，赋值，才能使用

        注意：局部变量和成员变量名称一样，在方法中使用的时候，采用的是就近原则
         */




        /*构造方法（如果不写构造方法，系统会默认写一个构造方法，这个默认的构造方法没有参数，语句也为空，只要自己写了一个构造方法，系统就不会写这个默认的了
                  所以在有其它构造方法时，要保留默认构造方法（自己写一个默认形式的构造方法），否则会有bug））
        1.构造方法就是类构造对象时调用的方法，用于对象的初始化工作
        2.构造方法是实例化一个类的对象时，也就是new的时候最先调用的方法

        构造方法的定义：
        构造方法是在类中定义的，构造方法的定义格式：方法名与类名相同，无返回值类型的声明
        对象的实例化语法：
        Dog dog=new Dog(); //new Dog后面有个（），带（）表示调用了方法，此时调用的方法就是构造方法了

        注意：构造方法也可以执行构造方法；
        构造方法私有化：当我们的需求是为了保证该类只有一个对象。
        此时只能自己new，其它外部类不能new
        什么时候一个类只需要一个对象呢？
        比如工具类（没有属性的类，只有行为），并且该工具对象被频繁使用，权衡只用一个对象与产生多个对象的内存使用，来确定该类是否要定义为只需要一个对象
         */
        /*
        Dog dog=new Dog();
        Dog dog1=new Dog("张三",20);
        System.out.println(dog1.getName());
        //因为方法可以重载，所以参数不同，执行的构造方法也不同
        */



        //this关键字
        //1.调用类中的属性（this可以省略）
        //2.调用类中的方法或构造方法（this可以省略）
        //3.表示当前对象（在方法被调用的过程中，哪个对象调用了方法，方法内的this就表示这个对象）
        //this前面可以写当前的类名（当前类名.this），在后边的内部类会涉及到


    }

}
//定义了一个类
class People{
    String name; //注意，字符串是引用类型变量，不是基本数据类型
    int age;
    public void learning(){
    System.out.println("我是"+name+"\n年龄"+age+"\n我要学习");
    }
    public void sleep(){
        System.out.println("我爱睡觉\n");
    }
}
//没有封装之前
//如果属性没有封装，在本类之外创建对象后，可以直接访问属性
/*
class Student{
    String name;
    int age;
    int score;
}
*/

//属性封装
//私有的属性和方法只能在本类中使用，如果想要外部也能访问私有的属性，需要提供公有的方法来间接访问（可以认为是个接口）
//公有的属性和方法可以被类外的其它外部类访问
//写代码的时候推荐把属性都封装起来，来保证属性的安全性
class Student{
    private String name; //成员变量
    private int age;
    private int score;

    //提供统一的访问接口
    //对外部提供一个为name属性设值的方法
    //getter and setter（一种规范写法）
    public void setName(String name){  //这里的name是一个局部变量
        this.name=name;
        //this.name当前对象的name（谁调用了这个方法谁就是当前对象）
        //name(等号右边)：这个方法的参数name,参数也可以换成其它，但是一般命名习惯这样写
    }
    //对外提供一个获取name属性的方法
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setScore(int score){
        this.score=score;
    }
    public int getScore(){
        return score;
    }
}

class Dog{
    public Dog(){
        System.out.println("构造方法执行了");
    }
    public Dog(String name){
        this.name=name;
        System.out.println("带一个参数的构造方法执行了");
    }
    public Dog(String name,int age){
    //this(name); //构造方法也可以调用其它构造方法,this（name）,表示this（）表示调用自己的构造方法，传了一个name，所以会自动执行带一个参数的构造方法
                  //对其它构造方法的调用，必须是本构造方法的第一条语句，即把this（name）写在后边会报错
                  //在构造方法相互调用时要必须有出口（不能我调用你，你再调用我）
    this.name=name;
    this.age=age;
    System.out.println("带两个参数的构造方法执行了");
    }
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return  name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}