package insertSort;

//文件初态不同时，直接插入排序所耗费的时间有很大差异。
//若文件初态为正序，则每个待插入的记录只需要比较一次就能够找到合适的位置插入，故算法的时间复杂度为O(n)，这时最好的情况。
//若初态为反序，则第i个待插入记录需要比较i+1次才能找到合适位置插入，故时间复杂度为O(n2)

/*public class StraightInsertionSort {
	public static void main(String[] args){
	int[] a={49,38,65,97,76,13,27,49,78,34,12,64,1};
	int temp=0;
	System.out.println("排序之前:");
	for(int i=0;i<a.length;i++){
		System.out.print(a[i]+"　");
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
	System.out.println("排序之后:");
	for(int i=0;i<a.length;i++){
		System.out.print(a[i]+"　");
	}	

}
}
*/

public class StraightInsertionSort {
	public static void main(String[] args){
	int[] a={49,38,65,97,76,13,27,49,78,34,12,64,1};
	int temp=0;
	System.out.println("排序之前:");
	for(int i=0;i<a.length;i++){
		System.out.print(a[i]+"　");
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
	System.out.println("排序之后:");
	for(int i=0;i<a.length;i++){
		System.out.print(a[i]+"　");
	}	

}
}
