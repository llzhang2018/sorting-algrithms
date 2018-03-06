package sortingAlg;

/**
 * ð������ļ���ʵ��
 * @author DELL
 *
 */
public class BubbleSort {

	/**
	 * �������ð������
	 * λ��iԪ�������������Ԫ�رȽϣ����б���С�ľͽ���
	 * �±��0��ʼ��Ԫ��iҪ�Ƚ�n-1-i��
	 * ʱ�临�Ӷ�Ϊ1+2+...+n-1    O(n^2)
	 * @param arr
	 */
	public static void sort0(int[] arr){
		int i,j;
		for(i=0;i<arr.length-1;i++){
			for(j=i+1;j<arr.length;j++){//iԪ��������ÿһ�����бȽ�
				if(arr[j]<arr[i])swap(arr,i,j);
			}
		}
		System.out.println();
	}

	/**
	 * ��ĩβ��ʼ�������Ƚϣ�С��ֵ��ǰ��
	 * ʱ�临�Ӷȣ�n-1+n-2+...+1  O(n^2)
	 * @param arr
	 */
	public static void sort1(int[] arr){
		int i,j;
		for(i=0;i<arr.length;i++){
			for(j=arr.length-2;j>=i;j--){
				//��ĩβ��ʼ�����Ƚϣ�С����ǰ�ƶ�
				if(arr[j]>arr[j+1]){//����һ��������һ��
					swap(arr, j, j+1);
				}
			}
		}
	}
	
	/**
	 * 
	 * �������Ѿ�����Ͳ����ٱȽ��ˣ����������������Ҫ�䶯��Ԫ�غ���ʱ��Լ����
	 * ����һ����Ǳ��� 
	 * @param arr
	 */
	public static void sort2(int[] arr){
		int i,j;
		boolean flag=true;
		//��flag=falseʱ��ʾ�����Ѿ�����
		for(i=0;i<arr.length && flag;i++){
			flag=false;//ÿһ�˿�ʼʱ����Ϊfalse�������˷������ݽ������Ϊtrue
			for(j=arr.length-2;j>=i;j--){
				if(arr[j]>arr[j+1]){
					swap(arr, j, j+1);
					flag=true;
				}
			}
		}
	}
	
	/**
	 * ����������ij����λ�õ�Ԫ��
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
