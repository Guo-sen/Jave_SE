import java.util.Scanner;
//冒泡排序算法(是一种稳定的排序算法)
/*
public class test{
	public static void main(String[] args){
		
		int[] arr={1,2,3,4,5,10,9,8,7,6};   	//待排序的数列
		
		//控制趟数，10个元素一共进行9趟（每趟会把一个元素放在它应该在的位置）
		for(int i = 0;i<arr.length-1;i++){
				//控制每一趟比较多少对（第一趟比较9对，以后每趟-1）
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
				//如果某一趟一个元素的位置都没有改变，说明此时数组就是有序的，不需要往下排了
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


//选择排序
//每一趟从待排序的数据中选出最大或者最小的一个元素，顺序放在已经排好
//的序列的最后，直到全部待排序的数据排完，选择排序是不稳定的排序算法
/*
public class test{
	public static void main(String[] args){
		int[] arr={5,4,3,2,1,10,9,8,7,6};
		int index = 0;//记录最小值下标
		for(int i = 0;i<arr.length-1;i++){
	
			index=i;
			for(int j = i+1;j <arr.length ;j++){
				if(arr[j]<arr[index]){
					index=j;
				}
			}
			//如果下标没有更新，说明此时arr[index]就在应该在的位置，不需要换位置
			//如果下标更新了，那就需要换位置（把下标指示出来的元素换掉已经排好序的元素的后边）
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

//插入排序算法(从后向前找合适的位置后插入)
//
/*
public class test{
	public static void main(String[] args){
		int[] arr={5,4,3,2,1,10,9,8,7,6};
		for(int i = 1;i<arr.length;i++){
			int j = i-1;//这里记录有序序列的最后一个数字的下标，后续有用
			int k = arr[i]; // 这里记录这轮要排序的数字，这个需要保存下来
			
			//如果这轮要排序的数字比它前边的那一个数字(有序序列的最后一个数字)小，那么就需要往前比较了，就需要往后挪数字了
			while(j>=0&&arr[j]>k){ //注意，这里有坑，顺序不能交换，否则当j减为-1的时候，判断arr[j]>k时会报错，下标越界
									//C语言中没有这个问题
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

//二分查找算法
/*
public class test{
	public static void main(String[] args){
		int[] arr={1,2,3,4,5,6,7,8,9,10};
		Scanner input = new Scanner(System.in);
		System.out.print("请输入要查找的数字：");
		int num=input.nextInt();
		int ret=arrSearch(arr,num);
		if(ret!=-1){
			System.out.println("找到了，下标为："+ret);
		}
		else{
			System.out.println("没找到");
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


//Arrays类
//Arrays工具类：用来操作数组（比如搜索和排序）的各种方法
//常用方法
//使用二分法查找
//Arrays.binarySearch(int[] array,int value)  
 
//使数组的内容转换成字符串的形式输出
//Arrays.toString(int[] array);  
  
//数组排序  
//Arrays.sort(int[] arry);         			  

//复制指定的数组
//Arrays.copyOf(int[] arry,int length);
//Arrays.copyOf(int[] arry,int from,int to);
//System.arraycopy(Object src,int srcPos,Object dest,int destPos,int length)

//判断两个数组是否相等
//Arrays.equels();

//使用指定元素填充数组
//Arrays.fill();

import java.util.Arrays;
public class test{
	public static void main(String[] args){
		int[] num={1,2,3,4,5,6,7,8,9,10};
		int[] arr={5,4,3,2,1,5,6,7,8,9};
		int ret=Arrays.binarySearch(num,10);
		System.out.println("找到了，下标为："+ret);  //使用二分法查找
		System.out.println(Arrays.toString(num));    //使数组的内容转换成字符串的形式输出
		Arrays.sort(arr);							//使用了快速排序
		for(int x:arr){
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("************");
		int[] arr1=Arrays.copyOf(arr,20);       //把arr数组复制到一个新的数组里，新数组有20个元素
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










