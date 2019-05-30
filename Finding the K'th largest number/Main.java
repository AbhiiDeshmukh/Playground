import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      
      for(int i=0;i<n;i++){
      	a[i]=in.nextInt();
      }
      int k = in.nextInt();
      
      for(int i=0;i<n-1;i++){
      	int max=a[i];
        for(int j=i+1;j<n;j++){
        	if(max<a[j]){
              	int tem=a[i];
            	a[i]=a[j];
              	max=a[j];
              	a[j]=tem;
            }
        }
      }
      
      /*for(int i=0;i<n;i++){
      	System.out.print(a[i]+" ");
      }*/
      System.out.println(a[k-1]);
    }   
}