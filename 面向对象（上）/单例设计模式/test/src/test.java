
//单例设计模式：保证一个类仅有一个实例，并提供一个访问它的全局访问点
//1.构造方法私有化
//2.声明一个本类对象
//3.给外部对象提供一个静态对象获取方法的实例

//两种实现方式
//饿汉式：对象的生命周期要比懒汉式长一点，占用内存时间长，平常建议懒汉式
//懒汉式

//单例模式的思想在于保证工具类仅有一个实例，以节省工具类在频繁使用时不断创建对象消耗内存的场景
//


public class test {
    public static void main(String[] args) {

        //Singleton1 s=new Singleton1(); //不能直接创建对象了，因为构造方法私有化了
        Singleton1 s=Singleton1.getInstance();
        s.print();
        Singleton2 s2=Singleton2.getInstance();
        s2.print();

        toTest.print1();
    }
}

//饿汉式(上来就创建对象)
class Singleton1{
    private Singleton1(){}
    private static Singleton1 s=new Singleton1(); //创建一个静态的s

    public static Singleton1 getInstance() {
        return s;
    }
    public void print(){
        System.out.println("懒汉式测试方法");
    }
}

//懒汉式（用的时候再创建对象）：还有更高级的版本，这个例子在多线程访问时可能有安全问题
class Singleton2{
    private Singleton2(){}
    private static Singleton2 s;//声明引用，不直接new了
    public static Singleton2 getInstance(){
        if(s==null){
            s=new Singleton2();
        }
        return s;
    }
    public void print(){
        System.out.println("饿汉式测试方法");
    }

}
//通过构造方法私有化+静态方法来实现工具类
class toTest{
    private toTest(){}
    public static void print1(){
        System.out.print("静态方法私有化");
    }
    public static void print2(){
        System.out.println("+静态方法");
    }
}


