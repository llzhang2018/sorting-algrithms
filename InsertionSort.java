package sortingAlg;

public class InsertionSort {
	
	public static void main(String[] args) {
		int[] arr=new int[10];
		for(int i=0;i<10;i++){
			arr[i]=(int) (Math.random()*10+0.5);
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n=======after=======");
	//	sort1(arr);
		sort2(arr);
		for(int i=0;i<10;i++){
			System.out.print(arr[i]+" ");
		}
		
	}

	public static void sort1(int[] arr){
		int temp,i,j;
		int L=arr.length;
		//�ٶ���һ��Ԫ�ر��ŵ�����ȷ��λ����
	    //�������������1 - n-1
		for(i=1;i<L;i++){
			j = i;
	        temp = arr[i];
	 
	        while (j > 0 && temp < arr[j - 1])
	        {
	        	//���ڴ���Ԫ�ص��������κ���
	            arr[j] = arr[j - 1];
	            j--;
	        }
	 
	        arr[j] = temp;
		}
	}
	
	public static void sort2(int[] arr){
		int temp,i,j;
		int L=arr.length;
		//�ٶ���һ��Ԫ�ر��ŵ�����ȷ��λ����
	    //�������������1 - n-1
		for(i=1;i<L;i++){
			j = i;
	        temp = arr[i];
	        //�Ż����������Ԫ�ش���arr[i-1],���Ѿ�������������
	        if(temp<arr[i-1]){
		        while (j > 0 && temp < arr[j - 1])
		        {
		        	//���ڴ���Ԫ�ص��������κ���
		            arr[j] = arr[j - 1];
		            j--;
		        }
		 
		        arr[j] = temp;
	        }
		}
		
	}
	
	
}
