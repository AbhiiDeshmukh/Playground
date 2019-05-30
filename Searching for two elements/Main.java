import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int val[] = new int[size];
      for(int i=0;i<size;i++){
      	val[i]=in.nextInt();
      }
      int search1 = in.nextInt(),res1=-1;
      int search2 = in.nextInt(),res2=-1;
      for(int i=0;i<size;i++){
      	if(val[i]==search1){
        	res1=i;
        }
        if(val[i]==search2){
        	res2=i;
        }
        
      }
      if(res1>=0 || res2>=0){
        	System.out.println(res1);
          	System.out.println(res2);
        }
    }
}