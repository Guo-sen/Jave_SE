
/*
	�����ֽк���
	�﷨��
	����Ȩ�����η�[���������η���static] ����ֵ���� �������������б�{
		������
		return ����ֵ; 
	}
*/


import java.util.Scanner;
import java.util.Random; //����α�����
public class test{
	public static void main(String[] args){ 
		//Hello();  //��������
		//System.out.println(Add(5,3));//���üӷ�����
		//System.out.println(Add(3.6,3.2));//��֤��������
		//����Is_Year�ж�����Ƿ�������
		/*
		int i=2024;
		boolean ret=Is_Year(i);
		if(ret==true)
		{
			System.out.println("������");
		}
		else
		{
			System.out.println("��������");
		}
		*/
		
		/*
		//����Ķ���(���ַ�ʽ)
		//1.ʹ��Ĭ�ϵĳ�ʼֵ����ʼ�������е�ÿһ��Ԫ��
		// �����Ԫ������[] ������ = new ����Ԫ������[������Ԫ�صĸ���������ĳ��ȣ�];
		int[] num1 = new int[3];
		
		//2.��������Ȼ���ٸ���Ĭ�ϵĳ�ʼֵ
		// ��������[] ������;
		// ������=new ����Ԫ������[���鳤��]
		int[] num2;
		num2 = new int[5];
		
		//3.��������Ȼ����ʹ��ָ����ֵ���г�ʼ��
		// ����Ԫ������[]������ = new ����Ԫ������[]{Ԫ��1��Ԫ��2....};
		int[] num3 = new int[]{5,6,7,8,9,10};
		
		//4.
		int[] num4={1,2,3,4,5,6};
		
		System.out.println(num4.length);//�κ����鶼�е����ԣ�length��������.lengthֱ���þ��У�
		*/
		
		//����ı�����ͨ���±������������Ԫ��	
		/*
		int[] scores={60,50,70,80,90};
		int len=scores.length;
		//for(int i =0;i<scores.length;i++) Ч�ʵͣ�ÿ�ζ�Ҫȥ����scores.length
		for(int i =0;i<len;i++) //ֱ�ӷ���һ�������ֵ��Ч�ʸ�һ��
		{
			System.out.print(scores[i]+" ");
		}
		System.out.println(scores); //[I@15db9742  һ��������ַ����ı�ʾ��ʽ��������ѧ��
		
		
		//jdk1.5��5.0���Ժ������foreachѭ��(û��for���)
		System.out.println("-------------"); 
		for(int x:scores){
			System.out.println(x);
		}			
		
		//jdk1.5֮�󻹼����˿ɱ����
		//�ɱ����ֻ���ǲ����б�����һ������
		//�ɱ����������Ϊ����ʹ��
		//����һ���·���  public static void Print(int... x)  x������Ϊ����ʹ��
		System.out.println("-------------"); 
		Print(scores);
		*/
		
		//���������ʱ��Ҫע���ָ���쳣������Խ���쳣
		//int[] scores={60,50,70,80,90};
		//test1(null); //���Կ�ָ���쳣
		//Exception in thread "main" java.lang.NullPointerException
		
		//test2(scores); // ���������±�Խ���쳣
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
		
		
		//������ڴ�ṹ
		//������һ���������ͣ�������һ��ѵĿռ�
		//�������ջ������һ��ռ䣬���ռ�����һ����ַ�������ַָ���˶�����һ��ռ䣨�������Ԫ�أ�
		
		
		
		//������
		/*
		int[] num=new int[5];
		Random r=new Random();//����һ����������������ĸ���
		for(int i=0;i<5;i++){
			num[i]=r.nextInt(20);
		}
		Scanner input=new Scanner(System.in);
		System.out.print("��������µ����֣�");
		int user = input.nextInt();
		boolean flag=false;
		for(int i=0;i<num.length;i++){
			if(num[i]==user){
				System.out.print("�ҵ���\n");
				flag=true;
				break;
			}
		}
		if(flag==false){
			System.out.println("�´���\n");
		}
		*/
		
		//��ӡ��������
		//      A
		//    B B B
		//  C C C C C
		//D D D D D D D
		//................
		/*
		System.out.print("��������Ҫ��ӡ��������");
		Scanner input=new Scanner(System.in);
		int num = 0;
		num=input.nextInt();
		//��������
		for(int i=0;i<num;i++){
			//��ӡ�ո�
			for(int j =0;j<num-i;j++){
				System.out.print("  ");
			}
			//��ӡ��ĸ
			for(int j=0;j<2*i+1;j++){
				System.out.print((char)('A'+i)+" ");
			}
			System.out.println();
		}
		*/
		
		//��ά����
		//java��û�������Ķ�ά����
		//������������鵱�е�����
		
		//��3���༶����3��ѧ���μӱ�������¼ÿ��ѧԱ�ĳɼ���������ÿ�����ƽ���ɼ�
		/*
		int[][] score={{78,98,88},{87,96,98},{67,78,82}};
		int classLen=score.length;   //������
		for(int i =0;i<classLen;i++){
			int sum=0;
			int count=score[i].length;  //ÿ�����ѧ��������
			for(int j = 0;j<count;j++){
				sum+=score[i][j];
			}
			int avg=sum/count;
			System.out.println(i+1+"���ƽ���֣�"+avg);
		}
		*/
		
		//�����ֵ����Сֵ���㷨
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
		System.out.println("���ֵ��"+max);
		System.out.println("���ֵ��"+min);
		*/
		
	
	
	
	}
	
	//����һ��������������������ƽ���ķ���
	//public ����Ȩ�����η�
	//static����̬���η��������ķ�������ֱ�ӵ���
	public static void Hello(){
		System.out.println("Hello World!!!");
		System.out.println("Hello World!!!");
		System.out.println("Hello World!!!");
	}

	//�Զ���ļӷ�����        �β�(x,y)
	public static int Add(int x,int y){
		return x+y;
	}
	
	//�жϸ���������Ƿ�������
	public static boolean Is_Year(int year){
		if((year%4==0&&year%100!=0 )||year%400==0)
		{
			return true;
		}
		return false;
	}

	//����������
	//��һ�����п��Դ���������������Ǿ�����ͬ�����֣����Ǿ��в�ͬ�Ĳ����б�Ͷ���
	//����ֵ����Ϊ�������ص����������������������������������ͬ������ֵ��һ��������������ܱ����壩
	/*
	public static void Add(int x,int y){ //��֤����ֵ����Ϊ�������ص�����
		System.out.println("��֤����");
	}
	*/
	//�������ض���ļӷ�����
	public static double Add(double a,double b){
		return a+b;
	}

	//�ɱ������Ϊ����,����������
	public static void Print(int... x){
		int len = x.length;
		for(int i=0;i<len;i++){
			System.out.println(x[i]);
		}
	}

	//������
	public static void test1(int[] arr){
		System.out.println(arr.length);
	}
	
	//�����ã������±�Խ���쳣��
	public static void test2(int[] arr){
		int len=arr.length;
		for(int i=0;i<=len;i++){
			System.out.println(arr[i]);
		}
	}
}