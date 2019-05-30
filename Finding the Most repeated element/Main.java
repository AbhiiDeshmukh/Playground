import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    int b[]=new int[2*n];
    for(int i=0;i<n;i++){
    	a[i]=in.nextInt();
      	b[a[i]]+=1;
    }
    
    int max=0,ind=-1;
    for(int i=0;i<2*n;i++){
    	if(max<b[i]){
        	max=b[i];
          	ind=i;
        }
    }
    //System.out.println(max);
    System.out.println(ind+a[0]);
  }
}