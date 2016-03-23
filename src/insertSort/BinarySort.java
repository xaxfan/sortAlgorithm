package insertSort;
//���ֲ�������ıȽϴ�����������¼�ĳ�ʼ״̬�޹أ��������ڼ�¼�ĸ�����
//��n�ϴ�ʱ����ֱ�Ӳ�����������Ƚϴ����ٵöࡣ������ֱ�Ӳ����������С�Ƚϴ�����
//�㷨���ƶ�������ֱ�Ӳ��������㷨����ͬ��������Ϊn2/2����õ����Ϊn��ƽ���ƶ�����ΪO(n2)��
public class BinarySort {
public static void main(String[] args){
	int[] a={49,38,65,97,176,213,227,49,78,34,12,164,11,18,1};
	System.out.println("����֮ǰ:");
	for(int i=0;i<a.length;i++){
		System.out.print(a[i]+"��");
	}
	for(int i=1;i<a.length;i++){
		int low=0,high=i-1;
		while(low<=high){
			int mid=(low+high)/2;
			if(a[i]<a[mid])
				high=mid-1;
			else
				low=mid+1;
		}
		int temp=a[i];
		for(int j=i;j>low;j--){  //����λ��Ϊlow��high+1
			a[j]=a[j-1];		
		}
		a[low]=temp;
	}
	System.out.println("");
	System.out.println("����֮��:");
	for(int i=0;i<a.length;i++){
		System.out.print(a[i]+"��");
	}	
}
}
