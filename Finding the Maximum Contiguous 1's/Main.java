import java.util.*;
public class Main
{
    public static void main(String args[])
    {
    	Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++){
      	a[i]=in.nextInt();
      }
      int b[]=new int[n];
      int j=0;
      
      for(int i=0;i<n-1;i++){
      	if(a[i]==1 && a[i+1]==1){
        	b[j]+=1;
        }
        if(a[i]==0){
        	j++;
        }
      }
      
      int max=0;
      for(int i=0;i<n;i++){
        if(max<b[i]){
        	max=b[i];
        }
        //System.out.print(b[i]);
      }
      	System.out.print(max+1);
    }
}