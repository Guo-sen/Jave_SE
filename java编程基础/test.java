
import java.util.Scanner;//���ռ��������һ��������
public class test{
	//int a = 20;//��Ա������������߶���ı���
	public static void main(String[]args){
		
		//int num=10;//�ֲ��������ڷ�����߶���
		//System.out.println("num="+num);
		//System.out.println(num);  //�Ա����������ʽ
		//8�ֻ�����������
		//������    boolean   ����ֵ��ռ���ڴ棩     true��false    Ĭ��false
		//�ֽ���    byte         1                  ��-128~127��        0
		//������    short        2                                      0
 		//����      int          4                                      0
		//������    long         8                                      0
		//�ַ���    char         2                                      \u0000
		//�����ȸ�����  float    4                                      0.0F
		//˫���ȸ�����  double   8                                      0.0D
		
		
		//byte short �ڼ���ʱ���Զ�ת����int���ͽ��м���
		/*
		short s=10;
		s=s+1;//����: �����ݵ�����: ��intת����short���ܻ�����ʧ
		System.out.println(s);
		*/
		//ǿ������ת��(����ʾ��Χ������֣�ת����С�����֣����ܻᾫ�ȶ�ʧ���������)
		/*
		short s=10;
		s=(short)(s+1);
		//s+=1; //���ᱨ��
		System.out.println(s);
		*/
		
		//�����ؼ��֣�const �� goto
		
		//ת���ַ�����C������ͬ
		//System.out.print("hello world\n");
		//System.out.print("hello world\n\r");// \r�ǻس�������������ļ�����(windows����)��Ҫ��\n\r��ʵ�ֻ���
		
		//����һ����������Ĺ����ࣨ����һ�ξ����ˣ��Ժ�ֱ���ã�
		Scanner input=new Scanner(System.in); //input�Ǹ��ط��Ǹ����ֿ��Ը�
		/*
		System.out.print("������һ�����֣�");
		int x1=input.nextInt();//�Ӽ��̽���һ������
		System.out.println("x1="+x1);
		System.out.print15("������һ���ַ�����");
		String s=input.next();//�Ӽ��̽���һ���ַ���
		System.out.println(s);
		*/
		
		//�߼������
		/*
		boolean a=true;
		boolean b=false;
		System.out.println(a&b); //������
		System.out.println(a|b); //������
		System.out.println(a^b); //������� ��ͬΪfalse ��ͬΪtrue
		System.out.println(!a); //������ 
		System.out.println(a&&b); //��·��(�߼���)
		System.out.println(a||b); //��·���߼���
		*/
		//��ϰ�⣺
		//1.ͨ����������Բ����ĸߺ͵���뾶����Բ�������� ��*r^2*h
		/*
		System.out.print("������Բ����ĸߺ͵���뾶��");
		int h=input.nextInt();
		int r=input.nextInt();
		System.out.println("���Ϊ��"+3.14*r*r*h);
		*/
		
		//2.����һ����λ�����������λ�ϵ����ֵĺ�
		/*
		int num=5432;
		int result=0;
		while(num!=0)
		{
			result=result+num%10;
			num/=10;
		}
		System.out.println("result��"+result);
		*/
		
		//3.������������������ʣ�������������ͨ����������
		/*
		int days=0;
		System.out.print("������������");
		days=input.nextInt();
		System.out.println1("������"+(days/7));
		System.out.println("ʣ���������"+(days%7));
		*/
		
		//4.&��&&������
		//  &:���߼�����ʱ�ֱ������ʽ���ߵĽ��������&���㡣����λ����ʱ��&��ʾ��λ��
		// &&���ȼ�����ߵı��ʽ��������Ϊfalse����ô�Ͳ������ұߵı��ʽ��
		//     �����߱��ʽ�Ľ��Ϊtrue���ټ����ұߵĽ������ʱ�����ұ߽��Ϊtrue��false��ʱ���������ʽ�Ľ��Ϊ��false��
		// | �� || ������ͬ�ϡ�
		
		
		
		//λ����� 
		// 		~  ��λȡ��
		//      &  ��λ��
		// 		|  ��λ��
		//		^  ��λ���
		
		
		//��λ�����    
		//    <<		����          a<<b   a�Ķ�����λ�����ƶ�bλ�����λ�ճ���bλ0
		//    >>      ����������      a>>b   a�Ķ�����λ�����ƶ�bλ�����λ�ճ���bλ������λ
		//    >>>>    �޷�������      a>>>b  a�Ķ�����λ�����ƶ�bλ�����λ�ճ���bλ��0
		//
		
		
		// ��Ŀ�����  exp1 ? exp2:exp3
		/*
		//�Ӽ�������һ���ɼ����ж��Ƿ񼰸�
		System.out.print("�����뿼�Է���: ");
		int score=input.nextInt();
		System.out.println(score>=60?"����":"������");
		*/
		
		//if��� switch�����c������ͬ			
		//ѭ����䣨while��do while������for��������C������ͬ
		
		//��ϰ�� 1.����1~100֮�����е�����֮��
		/*
		int i=1;
		int sum=0;
		do{
			
			sum=i++ + sum;
		}while(i<=100);
		System.out.println("���Ϊ��"+sum);
		*/
		 
		 //2.����n�Ľ׳�
		 /*
		 System.out.print("������n��ֵ��");
		 int n=input.nextInt();
		 int m=1;
		 while(n>0)
		 {
			 m = m * n--;
		 }
		System.out.println("���Ϊ��"+m);
		*/
		
		//3.��ӡ100�������е�������ż����3�ı���
		/*
		int i=0;
		System.out.print("ż����");
		for(i=0;i<100;i++)
		{
			if(i%2==0)
			{
				System.out.print(" "+i);
			}
		}
		System.out.print("\n������");
		for(i=0;i<100;i++)
		{
			if(i%2!=0)
			{
			  System.out.print(" "+i);
			}
			
		}
		
		System.out.print("\n3�ı�����");
		for(i=0;i<100;i++)
		{
			if(i%3==0)
			{
			  System.out.print(" "+i);
			}
			
		}
		*/
		
		//4.�������0~10
		/*
		int i=10;
		do{
			System.out.println(i--);
			
		}while(i>=0);
		*/
		
		//���� 1��+2��+3��+...+n!
		//     1   2    6  24  120
		/*
		int n =0;
		int i=1;
		int j=1;
		int sum=0;
		System.out.print("������n��ֵ��");
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
		System.out.println("���Ϊ��"+sum);
		*/
		
		//�Ż�
		/*
		int n =0;
		System.out.print("������n��ֵ��");
		n=input.nextInt();
		int i=1;
		int tem=1;
		int sum=0;
		for(i=1;i<=n;i++)
		{
			tem=tem*i;
			sum=sum+tem;
		}
		System.out.println("���Ϊ��"+sum);
		*/
		
		//���0~200֮���ܱ�7���������ܱ�4���������е�����
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
		
		//���10��쳲�������
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
		
		//�������ͼ��
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
		
		//����˷��ھ���
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
		
		//�������ͼ��
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
			//��ӡ�ո�
			for(j=1;j<=5-i;j++)
			{
				System.out.print("  ");
			}
			//��ӡ*
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		//����ͼ�ο���̨�����ʽ��ȷ��notepad++��ʽ����
	
	
		//�������ͼ��
		/*
		
			*
		  * * * 
		* * * * *
	  * * * * * * *
	* * * * * * * * *
	    
		*/
		
		int i=0;
		for(i=0;i<5;i++)
		{
			int j=0;
			//����ո�
			for(j=0;j<5-i-1;j++)
			{
				System.out.print("  ");
			}
			//���*
			for(j=0;j<2*i+1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		//����ͼ�ο���̨�����ʽ��ȷ��notepad++��ʽ����
		
	}
}




/*
public class test{
	
	public static void main(String[]args){
		
			
		
	}
}
*/