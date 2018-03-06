package sortingAlg;

/**
 * 冒泡排序的几种实现
 * @author DELL
 *
 */
public class BubbleSort {

	/**
	 * 最基本的冒泡排序
	 * 位置i元素逐个与其后面的元素比较，若有比他小的就交换
	 * 下标从0开始，元素i要比较n-1-i次
	 * 时间复杂度为1+2+...+n-1    O(n^2)
	 * @param arr
	 */
	public static void sort0(int[] arr){
		int i,j;
		for(i=0;i<arr.length-1;i++){
			for(j=i+1;j<arr.length;j++){//i元素与后面的每一个进行比较
				if(arr[j]<arr[i])swap(arr,i,j);
			}
		}
		System.out.println();
	}

	/**
	 * 从末尾开始，两两比较，小的值向前移
	 * 时间复杂度：n-1+n-2+...+1  O(n^2)
	 * @param arr
	 */
	public static void sort1(int[] arr){
		int i,j;
		for(i=0;i<arr.length;i++){
			for(j=arr.length-2;j>=i;j--){
				//从末尾开始两两比较，小的向前移动
				if(arr[j]>arr[j+1]){//若上一个大于下一个
					swap(arr, j, j+1);
				}
			}
		}
	}
	
	/**
	 * 
	 * 若数组已经有序就不用再比较了，当数组基本有序，需要变动的元素很少时节约开销
	 * 设置一个标记标量 
	 * @param arr
	 */
	public static void sort2(int[] arr){
		int i,j;
		boolean flag=true;
		//当flag=false时表示数组已经有序
		for(i=0;i<arr.length && flag;i++){
			flag=false;//每一趟开始时设置为false；若该趟发生数据交换则变为true
			for(j=arr.length-2;j>=i;j--){
				if(arr[j]>arr[j+1]){
					swap(arr, j, j+1);
					flag=true;
				}
			}
		}
	}
	
	/**
	 * 交换数组中ij两个位置的元素
	 * @param arr
	 * @param i
	 * @param j
	 */
	private static void swap(int[] arr,int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	
	public static void main(String[] args) {
		int[] arr={9,3,6,11,2,76,4,32,12,1,56};
		sort1(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
}
