import java.util.Scanner;
public class Main{
  	public static int gcd(int a,int b){
    	int min=0;	
      	min=(a>b)?b:a;
      	while(min>=1){
        	if(a%min==0 && b%min==0){
            	break;
            }
        	else{
            	min--;
            }
        }
    	return min;
    }
  
	public static void main (String[] args)
	{
	  Scanner in = new Scanner(System.in);
      int val1 = in.nextInt();
      int val2 = in.nextInt();
      int val3 = in.nextInt();
      System.out.println(gcd(gcd(val1,val2),val3));
	}
}