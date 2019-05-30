import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      	int val = in.nextInt();
      	int count=0;
      	for(int i=1;i<=2*val;i++){
        	if(count<=val && i%2==1){
              System.out.println(i);
              count++;
            }
        }
	}
}