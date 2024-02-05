//对象数组与管理
//1.对象数组就是数组里的每个元素都是类的对象，赋值时先定义对象然后将对象直接赋值给数组
//示例：Chicken[] cs=new Chicken[10];
import java.util.Arrays;
public class test {
    public static void main(String[] args) {
        ChickenManager cm=new ChickenManager(5);   //创建一个cm对象，cm对象对象包含了一个数组，每个数组元素是一个小鸡对象
        cm.add(new Chicken(001,"小鸡一号",18));
        cm.add(new Chicken(002,"小鸡二号",17));
        cm.add(new Chicken(003,"小鸡三号",22));
        cm.add(new Chicken(004,"小鸡四号",16));
        cm.add(new Chicken(005,"小鸡五号",60));


        cm.add(new Chicken(006,"小鸡六号",30));
        // System.out.println(cm.len());//验证鸡窝是否扩充成功

        System.out.println("-------printAll--------");
        cm.printAll();
        System.out.println("----------------find---------------");
        Chicken ret=cm.seaSpecial(001);
        ret.print();

        System.out.println("-------modify----------");
        cm.mod(new Chicken(001,"小鸡壹号",88));
        Chicken rets=cm.seaSpecial(001);
        rets.print();

        System.out.println("-----delete-------------");
        cm.dele(003);
        cm.printAll();
    }

}

//管理类
class ChickenManager{
    private Chicken[] cs=null;
    private int count=0; //记录当前数组的元素个数
    public ChickenManager(){}
    public ChickenManager(int size){
        if(size>0){
            cs=new Chicken[size];
        }
        else{
            cs=new Chicken[5];
        }
    }
    public int len(){
        return cs.length;
    }
    public void add(Chicken c){
        if(count<cs.length){
            this.cs[count]=c;
            count++;
        }else{//当前鸡窝满了需要扩充
            //实现动态数组
            //算法1：扩充原来数组的一半 cs.length*3/2+1
            //int newlength=cs.length*3/2+1;
            //cs=Arrays.copyOf(cs,newlength);
            //算法2：扩充原来数组的一倍cs.length*2
            int newlength=cs.length*2;
            cs=Arrays.copyOf(cs,newlength);
            this.cs[count]=c;
            count++;
        }
    }
    public void dele(int id){
        for(int i =0;i<count;i++){
            if(cs[i].getId()==id){
                for(int j =i;j<count-1;j++){
                    cs[j]=cs[j+1];
                }
                cs[count-1]=null;
                count--;
                break;
            }
        }
    }
    public Chicken seaSpecial(int id){
        for(int i = 0;i<count;i++){
            if(cs[i].getId()==id){
                return cs[i];
            }
        }
        return null;
    }
    public void printAll(){
        for(int i=0;i<count;i++){
            cs[i].print();
        }
    }
    public void mod(Chicken c){
        Chicken tmp=seaSpecial(c.getId());
        if(tmp!=null){
            tmp.setName(c.getName());
            tmp.setAge(c.getAge());
        }

    }
}

//小鸡类(数据对象)  value object（VO）、 实体类、传输对象（DTO）、
class Chicken{
    private int id;
    private String name;
    private int age;
    public Chicken(){}
    public Chicken(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void print(){
        System.out.println("id="+id+"  name="+name+"  age="+age);
    }
}
