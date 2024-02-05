
public class test {
    public static void main(String[] args) {
        int x = 10; //在栈内存申请一块空间存的是10
        method(x); //值传递
        System.out.println("x="+x);
        //基本数据类型都是这样（值传递）

        //引用传递
        Dog dog=new Dog();
        System.out.println("Dog age="+ dog.age);
        method(dog); //实际上穿的是个地址
        System.out.println("Dog age="+ dog.age);
        //对象名 是在栈区开辟了一块空间，并且存了一个地址，指向堆区的一块空间（存了对象的数据）

        //String传递
        String name="张三";
        method(name);
        System.out.println(name); //这里输出来的还是张三，因为张三本身就是个对象，不是一个值


        Person p=new Person();
        method(p);     //可以认为传过去的是个地址，把p的地址传过去了
        System.out.println("Person name:"+p.name);//这里输出来是老黄

    }
    public static void method(int mx){ //在栈内存申请一块空间mx
        mx=20;
    }
    public static void method(Dog dog){ //实际上接收的是个地址，指向了一块堆内存
        dog.age=5;
    }
    public static void method(String sname){ //sname指向张三那块堆区空间
        sname="李四";  //字符串本身就是个对象，张三本身就是个对象
                      //李四也是个对象，这句代码的含义是在堆区创建了一个新对象李四，让sname指向这个新对象李四
    }
    public static void method(Person peo){//peo存的是p的地址，指向name（name存的也是一个地址，指向了老王这个对象）
        peo.name="老黄";//新建了一个对象老黄，让name指向这个老黄（更改了name存的内容（原来是老王的地址，现在是老黄的地址））
    }
}
class Dog{
    int age=2;//省略封装
    int high;
}

class Person{
    String name="老王";
}

