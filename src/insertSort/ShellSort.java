package insertSort;

/*���ȶ�
ϣ�������ʱ����������ֱ�Ӳ�������ԭ�����£�
��1�����ļ���̬��������ʱֱ�Ӳ�����������ıȽϺ��ƶ����������١�
��2����nֵ��Сʱ��n��n2�Ĳ��Ҳ��С����ֱ�Ӳ�����������ʱ�临�Ӷ�O(n)���ʱ�临�Ӷ�0(n2)��𲻴�
��3����ϣ������ʼʱ�����ϴ󣬷���϶࣬ÿ��ļ�¼��Ŀ�٣��ʸ�����ֱ�Ӳ���Ͽ죬��������di����С���������𽥼��٣�������ļ�¼��Ŀ�����࣬
�������Ѿ���di-1��Ϊ�����Ź���ʹ�ļ��Ͻӽ�������״̬�������µ�һ���������Ҳ�Ͽ졣
��ˣ�ϣ��������Ч���Ͻ�ֱ�Ӳ��������нϴ�ĸĽ���
ϣ�������ƽ��ʱ�临�Ӷ�ΪO(nlogn)��
*/

public class ShellSort {
  public static void main(String[] args) {
      int[] a={49,38,65,97,76,13,27,49,78,34,12,64,1};
      System.out.println("����֮ǰ��");
      for (int i = 0; i < a.length; i++) {
          System.out.print(a[i]+" ");
      }
      //ϣ������
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
      System.out.println("����֮��");
      for (int i = 0; i < a.length; i++) {
          System.out.print(a[i]+" ");
      }
  }

}
