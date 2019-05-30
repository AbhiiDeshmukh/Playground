import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner in = new Scanner(System.in);
      int val = in.nextInt();
      int temp=0,sum=0;
      int dum=val;
      while(val>0){
      	temp=val%10;
        int fact=1;
        for(int i=1;i<=temp;i++){
      		fact*=i;
      	}
        sum+=fact;
        val=val/10;
      }
      
      if(sum==dum)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}