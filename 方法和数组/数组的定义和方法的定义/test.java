
/*
	方法又叫函数
	语法：
	访问权限修饰符[其他的修饰符如static] 返回值类型 方法名（参数列表）{
		方法体
		return 返回值; 
	}
*/


import java.util.Scanner;
import java.util.Random; //生成伪随机数
public class test{
	public static void main(String[] args){ 
		//Hello();  //方法调用
		//System.out.println(Add(5,3));//调用加法函数
		//System.out.println(Add(3.6,3.2));//验证方法重载
		//调用Is_Year判断年份是否是闰年
		/*
		int i=2024;
		boolean ret=Is_Year(i);
		if(ret==true)
		{
			System.out.println("是闰年");
		}
		else
		{
			System.out.println("不是闰年");
		}
		*/
		
		/*
		//数组的定义(四种方式)
		//1.使用默认的初始值来初始化数组中的每一个元素
		// 数组的元素类型[] 数组名 = new 数组元素类型[数组中元素的个数（数组的长度）];
		int[] num1 = new int[3];
		
		//2.先声明，然后再赋予默认的初始值
		// 数组类型[] 数组名;
		// 数组名=new 数组元素类型[数组长度]
		int[] num2;
		num2 = new int[5];
		
		//3.先声明，然后再使用指定的值进行初始化
		// 数组元素类型[]数组名 = new 数组元素类型[]{元素1，元素2....};
		int[] num3 = new int[]{5,6,7,8,9,10};
		
		//4.
		int[] num4={1,2,3,4,5,6};
		
		System.out.println(num4.length);//任何数组都有的属性：length（数组名.length直接用就行）
		*/
		
		//数组的遍历：通过下标来访问数组的元素	
		/*
		int[] scores={60,50,70,80,90};
		int len=scores.length;
		//for(int i =0;i<scores.length;i++) 效率低，每次都要去访问scores.length
		for(int i =0;i<len;i++) //直接访问一个具体的值，效率高一点
		{
			System.out.print(scores[i]+" ");
		}
		System.out.println(scores); //[I@15db9742  一个对象的字符串的表示方式，后续会学到
		
		
		//jdk1.5（5.0）以后加入了foreach循环(没有for灵活)
		System.out.println("-------------"); 
		for(int x:scores){
			System.out.println(x);
		}			
		
		//jdk1.5之后还加入了可变参数
		//可变参数只能是参数列表的最后一个参数
		//可变参数可以作为数组使用
		//定义一个新方法  public static void Print(int... x)  x可以作为数组使用
		System.out.println("-------------"); 
		Print(scores);
		*/
		
		//遍历数组的时候要注意空指针异常和数组越界异常
		//int[] scores={60,50,70,80,90};
		//test1(null); //测试空指针异常
		//Exception in thread "main" java.lang.NullPointerException
		
		//test2(scores); // 测试数组下标越界异常
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
		
		
		//数组的内存结构
		//数组是一种引用类型，引用了一块堆的空间
		//数组会在栈区开辟一块空间，这块空间存的是一个地址，这个地址指向了堆区的一块空间（存放数组元素）
		
		
		
		//猜数字
		/*
		int[] num=new int[5];
		Random r=new Random();//创建一个可以生成随机数的根据
		for(int i=0;i<5;i++){
			num[i]=r.nextInt(20);
		}
		Scanner input=new Scanner(System.in);
		System.out.print("请输入你猜的数字：");
		int user = input.nextInt();
		boolean flag=false;
		for(int i=0;i<num.length;i++){
			if(num[i]==user){
				System.out.print("找到啦\n");
				flag=true;
				break;
			}
		}
		if(flag==false){
			System.out.println("猜错了\n");
		}
		*/
		
		//打印正三角形
		//      A
		//    B B B
		//  C C C C C
		//D D D D D D D
		//................
		/*
		System.out.print("请输入你要打印的行数：");
		Scanner input=new Scanner(System.in);
		int num = 0;
		num=input.nextInt();
		//控制行数
		for(int i=0;i<num;i++){
			//打印空格
			for(int j =0;j<num-i;j++){
				System.out.print("  ");
			}
			//打印字母
			for(int j=0;j<2*i+1;j++){
				System.out.print((char)('A'+i)+" ");
			}
			System.out.println();
		}
		*/
		
		//多维数组
		//java中没有真正的多维数组
		//可以想象成数组当中的数组
		
		//有3个班级各有3名学生参加比赛，记录每个学员的成绩，并计算每个班的平均成绩
		/*
		int[][] score={{78,98,88},{87,96,98},{67,78,82}};
		int classLen=score.length;   //三个班
		for(int i =0;i<classLen;i++){
			int sum=0;
			int count=score[i].length;  //每个班的学生的数量
			for(int j = 0;j<count;j++){
				sum+=score[i][j];
			}
			int avg=sum/count;
			System.out.println(i+1+"班的平均分："+avg);
		}
		*/
		
		//求最大值和最小值的算法
		/*
		int[] arr={1,2,3,4,5,6,7,8,9,10};
		int max=arr[0];
		int min=arr[0];
		for(int i = 0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
			else if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println("最大值："+max);
		System.out.println("最大值："+min);
		*/
		
	
	
	
	}
	
	//定义一个和主方法（函数）相平级的方法
	//public 访问权限修饰符
	//static（静态修饰符）描述的方法可以直接调用
	public static void Hello(){
		System.out.println("Hello World!!!");
		System.out.println("Hello World!!!");
		System.out.println("Hello World!!!");
	}

	//自定义的加法函数        形参(x,y)
	public static int Add(int x,int y){
		return x+y;
	}
	
	//判断给定的年份是否是闰年
	public static boolean Is_Year(int year){
		if((year%4==0&&year%100!=0 )||year%400==0)
		{
			return true;
		}
		return false;
	}

	//方法的重载
	//在一个类中可以创建多个方法，它们具有相同的名字，但是具有不同的参数列表和定义
	//返回值不作为方法重载的条件（如果两个函数方法名，参数名相同，返回值不一样，这个方法不能被定义）
	/*
	public static void Add(int x,int y){ //验证返回值不作为方法重载的条件
		System.out.println("验证重载");
	}
	*/
	//方法重载定义的加法函数
	public static double Add(double a,double b){
		return a+b;
	}

	//可变参数作为数组,来遍历数组
	public static void Print(int... x){
		int len = x.length;
		for(int i=0;i<len;i++){
			System.out.println(x[i]);
		}
	}

	//测试用
	public static void test1(int[] arr){
		System.out.println(arr.length);
	}
	
	//测试用（数组下标越界异常）
	public static void test2(int[] arr){
		int len=arr.length;
		for(int i=0;i<=len;i++){
			System.out.println(arr[i]);
		}
	}
}