import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    int tem=n,count=0,tem1=n;
    
    StringBuilder sb = new StringBuilder("");
    StringBuilder sb1 = new StringBuilder("-");
    
    while(n>0){
    	count++;
      	n=n/10;
    }
    char a[]=new char[count];
    
    
    for(int i=count-1;i>=0;i--){
    	a[i]=(char)(tem%10+'0');
      	tem/=10;
    }
    sb=sb.append(a);
    System.out.println(tem1);
    
    
  }
}