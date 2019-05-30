import java.util.Scanner;
class Main {
	public static void main (String[] args){

	Scanner in = new Scanner(System.in);
  	int val=in.nextInt();
  	int sum=0;
  	while(val>0){
     sum+=val%10;
     val=val/10;
    }
	System.out.println(sum);

	}
}