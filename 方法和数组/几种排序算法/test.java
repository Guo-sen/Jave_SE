import java.util.Scanner;
//ð�������㷨(��һ���ȶ��������㷨)
/*
public class test{
	public static void main(String[] args){
		
		int[] arr={1,2,3,4,5,10,9,8,7,6};   	//�����������
		
		//����������10��Ԫ��һ������9�ˣ�ÿ�˻��һ��Ԫ�ط�����Ӧ���ڵ�λ�ã�
		for(int i = 0;i<arr.length-1;i++){
				//����ÿһ�˱Ƚ϶��ٶԣ���һ�˱Ƚ�9�ԣ��Ժ�ÿ��-1��
				boolean flag=true;
				for(int j = 0;j<arr.length-1-i;j++){
					int tmp=0;
					if(arr[j]<arr[j+1]){
						tmp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=tmp;
						flag=false;
					}
					
				}
				//���ĳһ��һ��Ԫ�ص�λ�ö�û�иı䣬˵����ʱ�����������ģ�����Ҫ��������
				if(flag==true){
					break;
				}
		}
			int i=0;
			for(i=0;i<arr.length;i++){
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		
	}	
}
*/


//ѡ������
//ÿһ�˴Ӵ������������ѡ����������С��һ��Ԫ�أ�˳������Ѿ��ź�
//�����е����ֱ��ȫ����������������꣬ѡ�������ǲ��ȶ��������㷨
/*
public class test{
	public static void main(String[] args){
		int[] arr={5,4,3,2,1,10,9,8,7,6};
		int index = 0;//��¼��Сֵ�±�
		for(int i = 0;i<arr.length-1;i++){
	
			index=i;
			for(int j = i+1;j <arr.length ;j++){
				if(arr[j]<arr[index]){
					index=j;
				}
			}
			//����±�û�и��£�˵����ʱarr[index]����Ӧ���ڵ�λ�ã�����Ҫ��λ��
			//����±�����ˣ��Ǿ���Ҫ��λ�ã����±�ָʾ������Ԫ�ػ����Ѿ��ź����Ԫ�صĺ�ߣ�
			if(index!=i){
				arr[index]=arr[i]+arr[index];
				arr[i]=arr[index]-arr[i];
				arr[index]=arr[index]-arr[i];
			}
		}
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}
}
*/

//���������㷨(�Ӻ���ǰ�Һ��ʵ�λ�ú����)
//
/*
public class test{
	public static void main(String[] args){
		int[] arr={5,4,3,2,1,10,9,8,7,6};
		for(int i = 1;i<arr.length;i++){
			int j = i-1;//�����¼�������е����һ�����ֵ��±꣬��������
			int k = arr[i]; // �����¼����Ҫ��������֣������Ҫ��������
			
			//�������Ҫ��������ֱ���ǰ�ߵ���һ������(�������е����һ������)С����ô����Ҫ��ǰ�Ƚ��ˣ�����Ҫ����Ų������
			while(j>=0&&arr[j]>k){ //ע�⣬�����пӣ�˳���ܽ���������j��Ϊ-1��ʱ���ж�arr[j]>kʱ�ᱨ���±�Խ��
									//C������û���������
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=k;
		}
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
*/

//���ֲ����㷨
/*
public class test{
	public static void main(String[] args){
		int[] arr={1,2,3,4,5,6,7,8,9,10};
		Scanner input = new Scanner(System.in);
		System.out.print("������Ҫ���ҵ����֣�");
		int num=input.nextInt();
		int ret=arrSearch(arr,num);
		if(ret!=-1){
			System.out.println("�ҵ��ˣ��±�Ϊ��"+ret);
		}
		else{
			System.out.println("û�ҵ�");
		}
	}
	public static int arrSearch(int[] arr,int num){
		int left=0;
		int right=arr.length-1;
		
		while(left<=right){
			int mid=(left+right)/2;
			if(num==arr[mid]){
				return mid;
			}
			else if(num>arr[mid]){
				left=mid+1;
			}
			else{
				right=mid-1;
			}
		}
		return -1;
	} 
}

*/


//Arrays��
//Arrays�����ࣺ�����������飨�������������򣩵ĸ��ַ���
//���÷���
//ʹ�ö��ַ�����
//Arrays.binarySearch(int[] array,int value)  
 
//ʹ���������ת�����ַ�������ʽ���
//Arrays.toString(int[] array);  
  
//��������  
//Arrays.sort(int[] arry);         			  

//����ָ��������
//Arrays.copyOf(int[] arry,int length);
//Arrays.copyOf(int[] arry,int from,int to);
//System.arraycopy(Object src,int srcPos,Object dest,int destPos,int length)

//�ж����������Ƿ����
//Arrays.equels();

//ʹ��ָ��Ԫ���������
//Arrays.fill();

import java.util.Arrays;
public class test{
	public static void main(String[] args){
		int[] num={1,2,3,4,5,6,7,8,9,10};
		int[] arr={5,4,3,2,1,5,6,7,8,9};
		int ret=Arrays.binarySearch(num,10);
		System.out.println("�ҵ��ˣ��±�Ϊ��"+ret);  //ʹ�ö��ַ�����
		System.out.println(Arrays.toString(num));    //ʹ���������ת�����ַ�������ʽ���
		Arrays.sort(arr);							//ʹ���˿�������
		for(int x:arr){
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("************");
		int[] arr1=Arrays.copyOf(arr,20);       //��arr���鸴�Ƶ�һ���µ��������������20��Ԫ��
		for(int x:arr1){
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("************");
		arr1=Arrays.copyOf(arr,30); 
		for(int x:arr1){
			System.out.print(x+" ");
		}
	}
}










