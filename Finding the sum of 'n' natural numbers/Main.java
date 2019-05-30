import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		Scanner in = new Scanner(System.in);
      	int n=in.nextInt();
      	
      	int res=sum(n);
      	System.out.println(res);
    }
  	
  	public static int sum(int a){
    	int s=a;	
      if(a==1)
          return 1;
      	else
          s+=sum(a-1);
      
      return s;
          
    }
}