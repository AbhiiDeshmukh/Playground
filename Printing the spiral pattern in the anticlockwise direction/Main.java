import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      int sz=in.nextInt();
      int a[][]=new int[sz][sz];
      int val=1;
      int r_max=sz-1,c_max=sz-1,r_min=0,c_min=0;
      int row=0,col=sz-1;
      
      while(r_min<=r_max && c_min<=c_max){
      	
        for(int i=c_max;i>=c_min;i--){
        	a[row][i]=val++;
        }
        for(int i=r_min+1;i<=r_max;i++){
        	a[i][row]=val++;
        }
        for(int i=c_min+1;i<=c_max;i++){
        	a[col][i]=val++;
        }
        //System.out.println(r_max+" "+r_min);
        for(int i=r_max-1;i>=r_min+1;i--){
        	a[i][col]=val++;
        }
        c_max--;c_min++;r_max--;r_min++;row++;col--;
      }
      
      for(int i=0;i<sz;i++){
      	for(int j=0;j<sz;j++){
        	System.out.print(a[i][j]+" ");
        }
        System.out.println();
      }
    }
}