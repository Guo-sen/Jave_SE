/*
	玩法说明：
	双色球投注区分为红球号码区和蓝球号码区，红球号码范围为01~33，蓝球号码范围为01~16。
	双色球每期从33个红球中开出6个号码，从16个蓝球中开出一个号码作为中将码。
	双色球玩法即是竞猜开奖号码的6个红球号码和1个蓝球号码，顺序不限
	
	案例分析：
	1.如何产生蓝球和红球
	2.如何接收用户选号
	3.如何验证是否中奖
	4.公布本期中奖号码
	
	实现步骤
	1.用户选择是机选还是手选
	2.接收用户选号（6红1蓝）
	3.生成系统号码（6红1蓝）
	4.比较系统号码和用户号码，记录个数
	5.验证是否中奖
	6.系统号码排序
	7.公布结果
*/
import java.util.Random;
import java.util.Scanner;
public class test{
	public static void main(String[] args){
		Random r = new Random(); 
		int[] user_red=new int[6];//用户选的红球
		int user_blue = 0;  //用户选择的蓝球号码
		int[] sys_red=new int[6]; //系统生成的红球号码
		int sys_blue=0;	//系统生成的蓝球号码
		int count_red=0;//记录用户选择正确的红球数量
		int count_blue=0; // 记录用户选择正确的蓝球的数量
		
		int[] red_num=new int[33];	//用于存储1~33的红球号码
		//填红球号码
		for(int i=0;i<red_num.length;i++){
			red_num[i]=i+1;
		}
		System.out.println();
		//游戏开始
		System.out.println("游戏开始 good luck！！！\n 1.机选号码  2.手选号码");
		System.out.print("请选择你要选择的方式：");
		Scanner input=new Scanner(System.in);
		boolean flag=true;
		while(flag){
			int select=input.nextInt();
			switch(select){
				case 1:
					ran_num(user_red,red_num);//机选红球
					user_blue=r.nextInt(16)+1;//机选蓝球
					System.out.println("机选结果：\n红球：");
					sort(user_red);
					for(int x:user_red){
						System.out.print(x+" ");
					}
					System.out.println("\n蓝球："+user_blue);
					flag=false;
					break;
				case 2:
					System.out.print("请选择6个红球号码（1~33）：");
					for(int i=0;i<user_red.length;i++){
						user_red[i]=input.nextInt();
					}
					System.out.println();
					System.out.print("请选择1个蓝球号码（1~16）：");
					user_blue=input.nextInt();
					flag=false;
					break;
				default:
					System.out.println("输入错误，请重新选择");
					break;
			}
		}
	
	//系统随机生成中奖号码
	//红球
	
	ran_num(sys_red,red_num);
	sys_blue=r.nextInt(16)+1;

	
	//统计结果
	for(int i =0;i<user_red.length;i++){
		for(int j=0;j<sys_red.length-count_red;j++){
			if(user_red[i]==sys_red[j]){
				int tmp=sys_red[sys_red.length-1-count_red];
				sys_red[sys_red.length-1-count_red]=sys_red[j];
				sys_red[j]=tmp;
				count_red++;
				break;
			}
		}
	}
	if(user_blue==sys_blue){
		count_blue++;
	}
		//打印开奖结果：
	sort(sys_red);
	System.out.println("本次开奖号码：\n红球号码");
	for(int x:sys_red){
		System.out.print(x+" ");
	}
	System.out.println("\n蓝球号码："+sys_blue);
	
	System.out.println("你猜中了"+count_red+"个红球和"+count_blue+"个蓝球");
	
	//验证是否中奖
	if(count_blue==0&&count_red<=3){
		System.out.println("没中奖，请继续努力");
	}
	else if(count_blue==1&&count_red<3){
		System.out.println("中了六等奖，奖励五元");
	}
	else if((count_blue==1&&count_red==3)||(count_blue==0&&count_red==4)){
		System.out.println("中了五等奖，奖励10元");
	}
	else if((count_blue==1&&count_red==4)||(count_blue==0&&count_red==5)){
		System.out.println("中了四等奖，奖励200元");
	}
	else if(count_blue==1&&count_red==5){
		System.out.println("中了三等奖，奖励3000元");
	}
	else if(count_blue==0&&count_red==6){
		System.out.println("中了二等奖，奖励1500000元");
	}
	else if(count_blue==1&&count_red==6){
		System.out.println("中了一等奖，奖励5000000元");
	}
	
	
	}

	

	
	
	
	public static void sort(int[] arr){
		for(int i = 0;i<arr.length-1;i++ ){
			
			for(int j = 0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					arr[j]=arr[j]+arr[j+1];
					arr[j+1]=arr[j]-arr[j+1];
					arr[j]=arr[j]-arr[j+1];
					}
			}
		}
	}
	//在red数组中生成来源于red_num的随机数列
	public static void ran_num(int[] red,int[] red_num){
		Random r=new Random();
		int index=-1;
		for(int i =0;i<red.length;i++){
			index=r.nextInt(red_num.length-i);//生成规定范围内的随机下标
			red[i]=red_num[index];		//red_num（下标来源）中的随机下标数字放在red数组中
			
			//把red_num中上面填进去的数字移动到最后，下次随机数就不生成最后下标
			//避免填进去red中的数列重复
			int tmp=0;
			tmp=red_num[red.length-i-1];
			red_num[red.length-i-1]=red_num[index];
			red_num[index]=tmp;
		}
	}
}











