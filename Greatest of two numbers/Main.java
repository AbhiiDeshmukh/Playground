import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	
    Scanner in = new Scanner(System.in);
     int val1 = in.nextInt();
     int val2 = in.nextInt();
     if(val1>val2){
     	System.out.println("num1 is the greatest number");
     }else{
     	System.out.println("num2 is the greatest number");
     }
      
	}
}