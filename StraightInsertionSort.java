package sortingAlg;


/**
 * ֱ�Ӳ�������
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
			//����ǰԪ�ر�ǰһ��С
			if(arr[i]<arr[i-1]){
				int temp=arr[i];//����ǰԪ���ݴ�
				for(j=i-1;j>=0 && arr[j]>temp;j--)
					arr[j+1]=arr[j];//����
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
