import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int val[] = new int[size];
      for(int i=0;i<size;i++){
      	val[i]=in.nextInt();
      }
      int max=0;
      for(int i=0;i<size;i++){
      	if(val[i]>max){
        	max=val[i];
        }
      }
      System.out.println(max);
    }
}