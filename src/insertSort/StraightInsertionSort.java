package insertSort;

//�ļ���̬��ͬʱ��ֱ�Ӳ����������ķѵ�ʱ���кܴ���졣
//���ļ���̬Ϊ������ÿ��������ļ�¼ֻ��Ҫ�Ƚ�һ�ξ��ܹ��ҵ����ʵ�λ�ò��룬���㷨��ʱ�临�Ӷ�ΪO(n)����ʱ��õ������
//����̬Ϊ�������i���������¼��Ҫ�Ƚ�i+1�β����ҵ�����λ�ò��룬��ʱ�临�Ӷ�ΪO(n2)

/*public class StraightInsertionSort {
	public static void main(String[] args){
	int[] a={49,38,65,97,76,13,27,49,78,34,12,64,1};
	int temp=0;
	System.out.println("����֮ǰ:");
	for(int i=0;i<a.length;i++){
		System.out.print(a[i]+"��");
	}
	for(int i=1;i<a.length;i++){
		for(int j=i;j>0;j--){
			if(a[j]<a[j-1]){
				temp=a[j];
				a[j]=a[j-1];
				a[j-1]=temp;
			}
		}
	}
	System.out.println("");
	System.out.println("����֮��:");
	for(int i=0;i<a.length;i++){
		System.out.print(a[i]+"��");
	}	

}
}
*/

public class StraightInsertionSort {
	public static void main(String[] args){
	int[] a={49,38,65,97,76,13,27,49,78,34,12,64,1};
	int temp=0;
	System.out.println("����֮ǰ:");
	for(int i=0;i<a.length;i++){
		System.out.print(a[i]+"��");
	}
	for(int i=1;i<a.length;i++){
		temp=a[i];
		for(int j=i-1;j>=0;j--){
			if(a[j]>temp){
				a[j+1]=a[j];	
			}
			else break;
			a[j]=temp;
		}
	}
	System.out.println("");
	System.out.println("����֮��:");
	for(int i=0;i<a.length;i++){
		System.out.print(a[i]+"��");
	}	

}
}
