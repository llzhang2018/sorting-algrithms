package sortingAlg;

import java.util.Arrays;

/**
 * 希尔排序
 * @author DELL
 *
 */
public class ShellSort {
	
	/**
	 * 将相距某个“增量”的记录构成一个子序列，对这个子序列进行插入排序，得到的序列为基本有序
	 * 时间复杂度 ：O(n^(3/2))好于O(n^2)
	 * @param arr
	 */
	public static void shellSort(int[] arr){
		
		int i,j;
		int increment=arr.length;
		do{
			increment=increment/3+1;  //计算增量
			//从距离第一个元素increment的位置开始
			for(i=increment;i<arr.length;i++){
				//如果比同组的前一个数小，就将该数暂存
				if(arr[i]<arr[i-increment]){
					int temp=arr[i];
					//将j定位到该组前一个元素，如果这个元素大于暂存的最小值，就后移
					for(j=i-increment; j>=0 && temp<arr[j]; j-=increment)
						arr[j+increment]=arr[j];//后移
					//移动结束后，该组的第一位存入最小值
					arr[j+increment]=temp;
				}
			}
		}while(increment>1);
	}

	
	public static void main(String[] args) {
		 int[] arr = new int[] { 26, 53, 67, 49, 57, 13, 48, 32, 60, 50 };
	    // shellSortSmallToBig(data);
		 shellSort(arr);
		 for(int i=0;i<arr.length;i++)
			 System.out.print(arr[i]+" ");
	     System.out.println();
	}
	

}
