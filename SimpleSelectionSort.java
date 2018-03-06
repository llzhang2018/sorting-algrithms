package sortingAlg;

/**
 * ��ѡ������
 * @author DELL
 *
 */
public class SimpleSelectionSort {

	/**
	 * ����ǰλ������Ϊ��Сֵ���Ӻ�һλ��ʼ��һ��֮�Ƚϣ��ҵ���С�ľͼ�¼���±�
	 * �Ƚ����õ����˵���Сֵ������˿�ʼ���õ�Ĭ����Сֵ����
	 * ʱ�临�Ӷȣ� O(n^2)
	 * @param arr
	 */
	public static void selectSort(int[] arr){
		int i,j,min;
		for(i=0;i<arr.length-1;i++){
			min=i;
			for(j=i+1;j<arr.length;j++){
				if(arr[j]<arr[min])//�ҵ���arr[min]��С����
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


