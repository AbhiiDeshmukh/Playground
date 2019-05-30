import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int a=in.nextInt();
    int res=fact(a);
    //System.out.println();
    System.out.println(res);
  }
  
  public static int fact(int n){
  	int val=n;
    if(n==0){
    	return 1;
    }else{
    	val*=fact(n-1);
      //System.out.print(val+" ");
    }
    return val;
  }
}