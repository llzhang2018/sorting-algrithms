package sortingAlg;

/**
 * 简单选择排序
 * @author DELL
 *
 */
public class SimpleSelectionSort {

	/**
	 * 将当前位置设置为最小值，从后一位开始逐一与之比较，找到更小的就记录其下标
	 * 比较完后得到该趟的最小值，与该趟开始设置的默认最小值交换
	 * 时间复杂度： O(n^2)
	 * @param arr
	 */
	public static void selectSort(int[] arr){
		int i,j,min;
		for(i=0;i<arr.length-1;i++){
			min=i;
			for(j=i+1;j<arr.length;j++){
				if(arr[j]<arr[min])//找到比arr[min]更小的数
					min=j;
			}
			if(min!=i)
				swap(arr, i, min);
		}
	}
	
	
	public static void swap(int[] arr, int i, int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void main(String[] args) {
		int[] arr={4,7,3,2,8,5,34,765,32,65,89,1};
		selectSort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
}


