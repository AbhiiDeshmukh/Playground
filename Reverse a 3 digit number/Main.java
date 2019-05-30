import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
      	int val = in.nextInt();
      	int d1 = (val%10)*100;
      	int d2 = ((val/10)%10)*10;
    	int d3 = (val/100)*1;
      	System.out.println(d1+d2+d3);
  }
}