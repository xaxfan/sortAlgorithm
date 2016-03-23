package insertSort;
//二分插入排序的比较次数与待排序记录的初始状态无关，仅依赖于记录的个数。
//当n较大时，比直接插入排序的最大比较次数少得多。但大于直接插入排序的最小比较次数。
//算法的移动次数与直接插入排序算法的相同，最坏的情况为n2/2，最好的情况为n，平均移动次数为O(n2)。
public class BinarySort {
public static void main(String[] args){
	int[] a={49,38,65,97,176,213,227,49,78,34,12,164,11,18,1};
	System.out.println("排序之前:");
	for(int i=0;i<a.length;i++){
		System.out.print(a[i]+"　");
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
		for(int j=i;j>low;j--){  //插入位置为low或high+1
			a[j]=a[j-1];		
		}
		a[low]=temp;
	}
	System.out.println("");
	System.out.println("排序之后:");
	for(int i=0;i<a.length;i++){
		System.out.print(a[i]+"　");
	}	
}
}
