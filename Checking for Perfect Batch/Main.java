import java.util.Scanner;
class Main
{
  public static int sum_1(int n,int list[]){
  	int sum=0;
    for(int i=0;i<n;i++){
    	if(i<(n/2))
          sum+=list[i];
    }
    return sum;
  }
  public static int sum_2(int n,int list[]){
  	int sum=0;
    for(int i=0;i<n;i++){
    	if(i>(n/2))
          sum+=list[i];
    }
    return sum;
  }
  
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    int list[]=new int[n];
    for(int i=0;i<n;i++){
    	list[i]=in.nextInt();
    }
    if(sum_1(n,list)==sum_2(n,list))
      System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch");
  }
}