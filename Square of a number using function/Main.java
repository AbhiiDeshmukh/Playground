import java.util.Scanner;
class Main
{
  	public static int Square(int a){
    	return (a*a);
    }	
  
	public static void main (String[] args)
    {
	 	Scanner in = new Scanner(System.in);
      	int val = in.nextInt();
      	System.out.println(Square(val));
	} 
}