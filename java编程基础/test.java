
import java.util.Scanner;//接收键盘输入的一个工具类
public class test{
	//int a = 20;//成员变量，在类里边定义的变量
	public static void main(String[]args){
		
		//常量
		//1.  "abc" 字符串常量
		//2.  25    整型常量
		//3.  2.5  浮点数常量
		//4.  'a'	字符常量
		//5.   true、false 布尔常量
		//6.  null 空常量
		/*
		System.out.println("abc");
		System.out.println("");
		System.out.println(20);
		System.out.println(3.14);
		System.out.println('a');
		System.out.println(true);
		//System.out.println(null); //空常量不能直接打印输出
		*/
		
		//int num=10;//局部变量，在方法里边定义
		//System.out.println("num="+num);
		//System.out.println(num);  //对比两种输出方式
		
		//8种基本数据类型
		//布尔型    boolean   不定值（占用内存）     true，false    默认false
		//字节型    byte         1                  （-128~127）        0
		//短整型    short        2                                      0
 		//整型      int          4                                      0
		//长整型    long         8                                      0
		//字符型    char         2                                      \u0000
		//单精度浮点型  float    4                                      0.0F
		//双精度浮点型  double   8                                      0.0D
		
		
		//byte short 在计算时会自动转化成int类型进行计算
		/*
		short s=10;
		s=s+1;//错误: 不兼容的类型: 从int转换到short可能会有损失
		System.out.println(s);
		*/
		//强制类型转换(将表示范围大的数字，转换成小的数字，可能会精度丢失，或者溢出)
		/*
		short s=10;
		s=(short)(s+1);
		//s+=1; //不会报错
		System.out.println(s);
		*/
		
		//引用数据类型：字符串，数组，类，接口。Lambda
		
		
		//保留关键字：const 和 goto
		
		//转义字符，和C语言相同
		//System.out.print("hello world\n");
		//System.out.print("hello world\n\r");// \r是回车符，如果进行文件操作(windows环境)需要用\n\r来实现换行
		
		//创建一个键盘输入的工具类（创建一次就行了，以后直接用）
		Scanner input=new Scanner(System.in); //input那个地方那个名字可以改
		/*
		System.out.print("请输入一个数字：");
		int x1=input.nextInt();//从键盘接收一个整数
		System.out.println("x1="+x1);
		System.out.print15("请输入一个字符串：");
		String s=input.next();//从键盘接收一个字符串
		System.out.println(s);
		*/
		
		//逻辑运算符
		/*
		boolean a=true;
		boolean b=false;
		System.out.println(a&b); //与运算
		System.out.println(a|b); //或运算
		System.out.println(a^b); //异或运算 相同为false 不同为true
		System.out.println(!a); //非运算 
		System.out.println(a&&b); //短路与(逻辑与)
		System.out.println(a||b); //短路或（逻辑或）
		*/
		//练习题：
		//1.通过键盘输入圆柱体的高和底面半径，求圆柱体的体积 Π*r^2*h
		/*
		System.out.print("请输入圆柱体的高和底面半径：");
		int h=input.nextInt();
		int r=input.nextInt();
		System.out.println("体积为："+3.14*r*r*h);
		*/
		
		//2.定义一个五位整数，求各个位上的数字的和
		/*
		int num=5432;
		int result=0;
		while(num!=0)
		{
			result=result+num%10;
			num/=10;
		}
		System.out.println("result："+result);
		*/
		
		//3.根据天数计算周数和剩余的天数，天数通过键盘输入
		/*
		int days=0;
		System.out.print("请输入天数：");
		days=input.nextInt();
		System.out.println1("周数："+(days/7));
		System.out.println("剩余的天数："+(days%7));
		*/
		
		//4.&和&&的区别
		//  &:在逻辑运算时分别计算表达式两边的结果，再做&运算。在做位运算时，&表示按位与
		// &&：先计算左边的表达式，如果结果为false，那么就不计算右边的表达式了
		//     如果左边表达式的结果为true，再计算右边的结果，此时，当右边结果为true（false）时，整个表达式的结果为（false）
		// | 和 || 的区别同上。
		
		
		
		//位运算符 
		// 		~  按位取反
		//      &  按位与
		// 		|  按位或
		//		^  按位异或
		
		
		//移位运算符    
		//    <<		左移          a<<b   a的二进制位向左移动b位，最低位空出的b位0
		//    >>      带符号右移      a>>b   a的二进制位向右移动b位，最高位空出的b位补符号位
		//    >>>>    无符号右移      a>>>b  a的二进制位向右移动b位，最高位空出的b位补0
		//
		
		
		// 三目运算符  exp1 ? exp2:exp3
		/*
		//从键盘输入一个成绩，判断是否及格；
		System.out.print("请输入考试分数: ");
		int score=input.nextInt();
		System.out.println(score>=60?"及格":"不及格");
		*/
		
		//if语句 switch语句与c语言相同			
		//循环语句（while、do while（）、for（））与C语言相同
		
		//练习： 1.计算1~100之间所有的整数之和
		/*
		int i=1;
		int sum=0;
		do{
			
			sum=i++ + sum;
		}while(i<=100);
		System.out.println("结果为："+sum);
		*/
		 
		 //2.计算n的阶乘
		 /*
		 System.out.print("请输入n的值：");
		 int n=input.nextInt();
		 int m=1;
		 while(n>0)
		 {
			 m = m * n--;
		 }
		System.out.println("结果为："+m);
		*/
		
		//3.打印100以内所有的奇数，偶数和3的倍数
		/*
		int i=0;
		System.out.print("偶数：");
		for(i=0;i<100;i++)
		{
			if(i%2==0)
			{
				System.out.print(" "+i);
			}
		}
		System.out.print("\n奇数：");
		for(i=0;i<100;i++)
		{
			if(i%2!=0)
			{
			  System.out.print(" "+i);
			}
			
		}
		
		System.out.print("\n3的倍数：");
		for(i=0;i<100;i++)
		{
			if(i%3==0)
			{
			  System.out.print(" "+i);
			}
			
		}
		*/
		
		//4.逆序输出0~10
		/*
		int i=10;
		do{
			System.out.println(i--);
			
		}while(i>=0);
		*/
		
		//计算 1！+2！+3！+...+n!
		//     1   2    6  24  120
		/*
		int n =0;
		int i=1;
		int j=1;
		int sum=0;
		System.out.print("请输入n的值：");
		n=input.nextInt();
		for(i=1;i<=n;i++)
		{
			int tem=1;
			for(j=1;j<=i;j++)
			{
				tem=tem*j;
			}
			sum=sum+tem;
			tem=1;
			
		}
		System.out.println("结果为："+sum);
		*/
		
		//优化
		/*
		int n =0;
		System.out.print("请输入n的值：");
		n=input.nextInt();
		int i=1;
		int tem=1;
		int sum=0;
		for(i=1;i<=n;i++)
		{
			tem=tem*i;
			sum=sum+tem;
		}
		System.out.println("结果为："+sum);
		*/
		
		//输出0~200之间能被7整除但不能被4整除的所有的数字
		/*
		int i=0;
		for(i=0;i<200;i++)
		{
			if(i%7==0&&i%4!=0)
			{
				System.out.print(" "+i);
			}
		}
		*/
		
		//输出10个斐波那契数
		/*
		int a=1;
		int b=1;
		int c=a+b;
		System.out.print(" "+a+" "+b);
		int count=2;
		for(count=3;count<=10;count++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		System.out.println();
		*/
		
		//输出下列图形
		//*
		//* *
		//* * *
		//* * * *
		//* * * * *
		/*
		int i=0;
		for(i=1;i<=5;i++)
		{
			int j=0;
			for(j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		
		//输出乘法口诀表
		/*
		int i=1;
		for(i=1;i<=9;i++)
		{
			int j=0;
			for(j=1;j<=i;j++)
			{
				System.out.print(j+"*"+i+"="+(j*i)+"  ");
			}
			System.out.println();
		}
		*/
		
		//输出下列图形
		/*
	   	    *
	      * *
	    * * *
	  * * * *
	* * * * *
	*/
	/*
		int i=0;
		for(i=1;i<=5;i++)
		{
			int j=0;
			//打印空格
			for(j=1;j<=5-i;j++)
			{
				System.out.print("  ");
			}
			//打印*
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		//以上图形控制台输出格式正确（notepad++格式有误）
	
	
		//输出下列图像
		/*
		
			*
		  * * * 
		* * * * *
	  * * * * * * *
	* * * * * * * * *
	    
		*/
		/*
		int i=0;
		for(i=0;i<5;i++)
		{
			int j=0;
			//输出空格
			for(j=0;j<5-i-1;j++)
			{
				System.out.print("  ");
			}
			//输出*
			for(j=0;j<2*i+1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		//以上图形控制台输出格式正确（notepad++格式有误）
		*/
	}
	
}




/*
public class test{
	
	public static void main(String[]args){
		
			
		
	}
}
*/