import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
    	a[i]=in.nextInt();
    }
    
    int sum[]=new int[n];
    int k=0;
    for(int i=0;i<n-1;i++){
    	if(a[i]<a[i+1]){
        	sum[k]+=a[i];
        }
 
      	if(a[i]>a[i+1]){
          	sum[k]+=a[i];
        	k++;
        }
      	
    }
    //System.out.println(k);
    sum[k]+=a[n-1];
    int max=0;
    for(int i=0;i<n;i++){
      if(max<sum[i])
        max=sum[i];
    }
    System.out.println(max);
    
  }
}