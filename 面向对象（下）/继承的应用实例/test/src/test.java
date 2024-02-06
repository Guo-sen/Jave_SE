/*
    继承的应用实例：实现一个化妆品商城中的化妆品管理
    1.定义一个化妆品类（Cosmetic）
    2.定义一个化妆品管理类（可以实现进货功能，输出所有化妆品信息）
    3.使用继承实现一个可按单价排序输出所有化妆品的功能
    4.使用继承实现一个只输出进口化妆品的功能


 */

import java.util.Arrays;
public class test {
    public static void main(String[] args) {
        Sort so=new Sort();
        so.Add(new Cosmetic("大宝","国产",18));
        so.Add(new Cosmetic("香奈儿","进口",58));
        so.Add(new Cosmetic("欧莱雅","国产",20));
        so.Add(new Cosmetic("哈哈","进口",98));

        so.Add(new Cosmetic("嘿嘿","进口",88));
        so.printAll();
        System.out.println("--------------------------------------");
        so.sort();
        System.out.println("--------------------------------------");
        specialType st=new specialType();
        st.Add(new Cosmetic("大宝","国产",18));
        st.Add(new Cosmetic("香奈儿","进口",58));
        st.Add(new Cosmetic("欧莱雅","国产",20));
        st.Add(new Cosmetic("哈哈","进口",98));

        st.Add(new Cosmetic("嘿嘿","进口",88));
        st.printSpecial();




    }
}
//只输出进口化妆品的类
class specialType extends CosmeticManager{

    public void printSpecial(){
        for(int i = 0;i<count;i++){
            //比较两个字符串的值是否相等不能使用==
            //使用equals 把确定的字符串放在前面
            if("进口".equals(cs[i].getType())){
                System.out.println(cs[i].getInfo());
            }
        }
    }

}

//可按单价排序的化妆品管理类
class Sort extends CosmeticManager{

    public void sort(){
        Cosmetic[] tmp=Arrays.copyOf(cs,count);
        //System.out.println(tmp.length);
        Cosmetic mid=null;
        for(int i =0;i< tmp.length-1;i++){
            for(int j = 0;j< tmp.length-i-1;j++){
                if((tmp[j].getPrice())<(tmp[j+1].getPrice())){
                    mid=tmp[j];
                    tmp[j]=tmp[j+1];
                    tmp[j+1]=mid;
                }
            }
        }
        for(Cosmetic cosmetic:tmp){
            System.out.println(cosmetic.getInfo());
        }
    }
}
class CosmeticManager{ //管理类
    protected Cosmetic[] cs=new Cosmetic[4];
    protected int count=0;
    public void Add(Cosmetic c){//进货
        if(count>=cs.length){
            int newLen= cs.length*2;
            cs=Arrays.copyOf(cs,newLen);
        }
        cs[count]=c;
        count++;
    }
    //输出所有产品
    public void printAll(){
        for(int i =0;i<count;i++){
            System.out.println(cs[i].getInfo());
        }
    }
}

class Cosmetic{
    private String name;
    private String type;
    private int price;
    public Cosmetic(){}
    public Cosmetic(String name,String type,int price){
        this.name=name;
        this.type=type;
        this.price=price;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    public String getInfo(){
        return ("name="+name+" type="+type+" price="+price);
    }
}