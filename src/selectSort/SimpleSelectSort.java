package selectSort;

public class SimpleSelectSort {
public static void main(String[] args){
	int[] a={49,38,65,97,76,13,27,49,78,34,12,64,1,8};
	System.out.println("排序之前：");
	for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
	for(int i=0;i<a.length;i++){
		int temp=a[i];
		int j=0,flag=i;
		for( j=i+1;j<a.length;j++){
			
			if(a[j]<temp){
				temp=a[j];
				flag=j;
			}
				
		}
		a[flag]=a[i];
		a[i]=temp;
	}
	
	System.out.println();
	System.out.println("排序之后：");
	for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
}
}
