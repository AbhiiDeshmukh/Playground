import java.util.Scanner;
import java.lang.Math;
class Main{
	public static void main (String[] args){
	  Scanner in = new Scanner(System.in);
      int val = in.nextInt();
      int count=0,sum=0;
      int dum=val;
      while(val>0){
      	count++;
        val=val/10;
      }
      //System.out.println(count);
      val=dum;
      while(dum>0){
      	sum+=Math.pow((dum%10),count);
        dum=dum/10;
      }
      if(sum==val)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
      
	}
}