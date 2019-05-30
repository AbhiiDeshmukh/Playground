import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int l = in.nextInt();
    int a[]=new int[l];
    for(int i=0;i<l;i++){
    	a[i]=in.nextInt();
    }
    
    for(int i=0;i<l;i++){
      boolean flag=true;
      int min=0;
    	for(int j=i+1;j<l;j++){
          //min=a[j-1];
          if(a[i]<a[j]){
            if(a[j-1]<a[j])
                  System.out.println(a[i]+","+a[j]);
              //}
            //}
          }
        	/*if(a[i]<a[j]){
            	System.out.println(a[i]+","+a[j]);
            }*/
        }
    }
  }
}