/*
	�淨˵����
	˫ɫ��Ͷע����Ϊ����������������������������뷶ΧΪ01~33��������뷶ΧΪ01~16��
	˫ɫ��ÿ�ڴ�33�������п���6�����룬��16�������п���һ��������Ϊ�н��롣
	˫ɫ���淨���Ǿ��¿��������6����������1��������룬˳����
	
	����������
	1.��β�������ͺ���
	2.��ν����û�ѡ��
	3.�����֤�Ƿ��н�
	4.���������н�����
	
	ʵ�ֲ���
	1.�û�ѡ���ǻ�ѡ������ѡ
	2.�����û�ѡ�ţ�6��1����
	3.����ϵͳ���루6��1����
	4.�Ƚ�ϵͳ������û����룬��¼����
	5.��֤�Ƿ��н�
	6.ϵͳ��������
	7.�������
*/
import java.util.Random;
import java.util.Scanner;
public class test{
	public static void main(String[] args){
		Random r = new Random(); 
		int[] user_red=new int[6];//�û�ѡ�ĺ���
		int user_blue = 0;  //�û�ѡ����������
		int[] sys_red=new int[6]; //ϵͳ���ɵĺ������
		int sys_blue=0;	//ϵͳ���ɵ��������
		int count_red=0;//��¼�û�ѡ����ȷ�ĺ�������
		int count_blue=0; // ��¼�û�ѡ����ȷ�����������
		
		int[] red_num=new int[33];	//���ڴ洢1~33�ĺ������
		//��������
		for(int i=0;i<red_num.length;i++){
			red_num[i]=i+1;
		}
		System.out.println();
		//��Ϸ��ʼ
		System.out.println("��Ϸ��ʼ good luck������\n 1.��ѡ����  2.��ѡ����");
		System.out.print("��ѡ����Ҫѡ��ķ�ʽ��");
		Scanner input=new Scanner(System.in);
		boolean flag=true;
		while(flag){
			int select=input.nextInt();
			switch(select){
				case 1:
					ran_num(user_red,red_num);//��ѡ����
					user_blue=r.nextInt(16)+1;//��ѡ����
					System.out.println("��ѡ�����\n����");
					sort(user_red);
					for(int x:user_red){
						System.out.print(x+" ");
					}
					System.out.println("\n����"+user_blue);
					flag=false;
					break;
				case 2:
					System.out.print("��ѡ��6��������루1~33����");
					for(int i=0;i<user_red.length;i++){
						user_red[i]=input.nextInt();
					}
					System.out.println();
					System.out.print("��ѡ��1��������루1~16����");
					user_blue=input.nextInt();
					flag=false;
					break;
				default:
					System.out.println("�������������ѡ��");
					break;
			}
		}
	
	//ϵͳ��������н�����
	//����
	
	ran_num(sys_red,red_num);
	sys_blue=r.nextInt(16)+1;

	
	//ͳ�ƽ��
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
		//��ӡ���������
	sort(sys_red);
	System.out.println("���ο������룺\n�������");
	for(int x:sys_red){
		System.out.print(x+" ");
	}
	System.out.println("\n������룺"+sys_blue);
	
	System.out.println("�������"+count_red+"�������"+count_blue+"������");
	
	//��֤�Ƿ��н�
	if(count_blue==0&&count_red<=3){
		System.out.println("û�н��������Ŭ��");
	}
	else if(count_blue==1&&count_red<3){
		System.out.println("�������Ƚ���������Ԫ");
	}
	else if((count_blue==1&&count_red==3)||(count_blue==0&&count_red==4)){
		System.out.println("������Ƚ�������10Ԫ");
	}
	else if((count_blue==1&&count_red==4)||(count_blue==0&&count_red==5)){
		System.out.println("�����ĵȽ�������200Ԫ");
	}
	else if(count_blue==1&&count_red==5){
		System.out.println("�������Ƚ�������3000Ԫ");
	}
	else if(count_blue==0&&count_red==6){
		System.out.println("���˶��Ƚ�������1500000Ԫ");
	}
	else if(count_blue==1&&count_red==6){
		System.out.println("����һ�Ƚ�������5000000Ԫ");
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
	//��red������������Դ��red_num���������
	public static void ran_num(int[] red,int[] red_num){
		Random r=new Random();
		int index=-1;
		for(int i =0;i<red.length;i++){
			index=r.nextInt(red_num.length-i);//���ɹ涨��Χ�ڵ�����±�
			red[i]=red_num[index];		//red_num���±���Դ���е�����±����ַ���red������
			
			//��red_num���������ȥ�������ƶ�������´�������Ͳ���������±�
			//�������ȥred�е������ظ�
			int tmp=0;
			tmp=red_num[red.length-i-1];
			red_num[red.length-i-1]=red_num[index];
			red_num[index]=tmp;
		}
	}
}











