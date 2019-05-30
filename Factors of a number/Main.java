import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner in = new Scanner(System.in);
      int val = in.nextInt();
      if(val==0)
        System.out.println(val);
      
      for(int i=1;i<=val;i++){
      	if(val%i==0)
          System.out.println(i);
      }
	}
}