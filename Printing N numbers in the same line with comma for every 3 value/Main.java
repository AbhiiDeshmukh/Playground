import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int val = in.nextInt();
    for(int i=1;i<=val;i++){
   		System.out.print(i);
      	if(i%3==0 && i!=val)
          System.out.print(",");
    }
    	
  }
}