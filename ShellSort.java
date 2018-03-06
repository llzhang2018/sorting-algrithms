package sortingAlg;

import java.util.Arrays;

/**
 * ϣ������
 * @author DELL
 *
 */
public class ShellSort {
	
	/**
	 * �����ĳ�����������ļ�¼����һ�������У�����������н��в������򣬵õ�������Ϊ��������
	 * ʱ�临�Ӷ� ��O(n^(3/2))����O(n^2)
	 * @param arr
	 */
	public static void shellSort(int[] arr){
		
		int i,j;
		int increment=arr.length;
		do{
			increment=increment/3+1;  //��������
			//�Ӿ����һ��Ԫ��increment��λ�ÿ�ʼ
			for(i=increment;i<arr.length;i++){
				//�����ͬ���ǰһ����С���ͽ������ݴ�
				if(arr[i]<arr[i-increment]){
					int temp=arr[i];
					//��j��λ������ǰһ��Ԫ�أ�������Ԫ�ش����ݴ����Сֵ���ͺ���
					for(j=i-increment; j>=0 && temp<arr[j]; j-=increment)
						arr[j+increment]=arr[j];//����
					//�ƶ������󣬸���ĵ�һλ������Сֵ
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
