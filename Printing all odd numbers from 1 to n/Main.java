import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      	int val = in.nextInt();
      	for(int i=1;i<=val;i++){
        	if(i%2==1)
              System.out.println(i);
        }
	}
}