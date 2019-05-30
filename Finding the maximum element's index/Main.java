import java.util.Scanner;
class Main
{
  public static int find_index(int n,int list[]){
  	int max=0,ind=0;;
    for(int i=0;i<n;i++){
      	//System.out.print(list[i]);
    	if(max<list[i]){
          max=list[i];
          ind=i;
          
        }
    }
    //System.out.println(max+" "+ind);
    return ind;
  }
  
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    int list[]=new int[n];
    for(int i=0;i<n;i++){
    	list[i]=in.nextInt();
    }
    System.out.println(find_index(n,list));
  }
}