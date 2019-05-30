import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int val=in.nextInt();
      int exp=in.nextInt();
      int res=1;
     
      while( exp-- > 0 ){
      	res*=val;
      }
      System.out.println(res);
    }
}