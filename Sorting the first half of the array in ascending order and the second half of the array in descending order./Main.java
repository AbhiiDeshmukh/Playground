import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in= new Scanner(System.in);
    int len=in.nextInt();
    int a[]=new int[len];
    for(int i=0;i<len;i++){
    	a[i]=in.nextInt();
    }
    
    for(int i=0;i<len/2;i++){
    	for(int j=0;j<(len/2)-i-1;j++){
        	if(a[j]>a[j+1]){
            	int temp=a[j+1];
              	a[j+1]=a[j];
              	a[j]=temp;
            }
        }
    }
    for(int i=len/2;i<len;i++){
      //System.out.print(a[i]+" ");
      	for(int j=(len/2);j<len-1;j++){
          //System.out.print(a[j]+" ");
        	if(a[j]<a[j+1]){
            	int temp=a[j+1];
              	a[j+1]=a[j];
              	a[j]=temp;
            }
        }
    }
    
    for(int i=0;i<len;i++){
    	System.out.print(a[i]+" ");
    }
    
  }
}