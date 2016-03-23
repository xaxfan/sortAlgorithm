package insertSort;

/*不稳定
希尔排序的时间性能优于直接插入排序，原因如下：
（1）当文件初态基本有序时直接插入排序所需的比较和移动次数均较少。
（2）当n值较小时，n和n2的差别也较小，即直接插入排序的最好时间复杂度O(n)和最坏时间复杂度0(n2)差别不大。
（3）在希尔排序开始时增量较大，分组较多，每组的记录数目少，故各组内直接插入较快，后来增量di逐渐缩小，分组数逐渐减少，而各组的记录数目逐渐增多，
但由于已经按di-1作为距离排过序，使文件较接近于有序状态，所以新的一趟排序过程也较快。
因此，希尔排序在效率上较直接插人排序有较大的改进。
希尔排序的平均时间复杂度为O(nlogn)。
*/

public class ShellSort {
  public static void main(String[] args) {
      int[] a={49,38,65,97,76,13,27,49,78,34,12,64,1};
      System.out.println("排序之前：");
      for (int i = 0; i < a.length; i++) {
          System.out.print(a[i]+" ");
      }
      //希尔排序
      int d = a.length;
      while(true){
          d = d / 2;
          for(int i=0;i<d;i++){
              for(int j=i+d;j<a.length;j=j+d){
                  int temp = a[j];
                  int k;
                  for(k=j-d;k>=0&&a[k]>temp;k=k-d){
                      a[k+d] = a[k];
                  }
                  a[k+d] = temp;
              }
          }
          if(d == 1){
              break;
          }
      }
      System.out.println();
      System.out.println("排序之后：");
      for (int i = 0; i < a.length; i++) {
          System.out.print(a[i]+" ");
      }
  }

}
