import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      	int val = in.nextInt();
      	int d1=val%10;
      	int d2=0;
      	while(val>0){
        d2=val;
      	val=val/10;
        }
        System.out.println(d1+d2);
	}
}