package sortingAlg;


/**
 * 直接插入排序
 * @author DELL
 *
 */
public class StraightInsertionSort {

	/**
	 * 
	 * @param arr
	 */
	public static void insertSort(int[] arr){
		int i,j;
		for(i=1;i<arr.length;i++){
			//若当前元素比前一个小
			if(arr[i]<arr[i-1]){
				int temp=arr[i];//将当前元素暂存
				for(j=i-1;j>=0 && arr[j]>temp;j--)
					arr[j+1]=arr[j];//后移
				arr[j+1]=temp;
			}
		}
	}
	
	public static void swap(int[] arr, int i, int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void main(String[] args) {
		int[] arr={4,7,3,2,8,5,34,765,32,65,89,1};
		insertSort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	
}
