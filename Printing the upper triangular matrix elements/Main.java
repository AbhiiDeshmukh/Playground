import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int r=in.nextInt();
    int c=in.nextInt();
    int a[][]=new int[r][c];
      
    for(int i=0;i<r;i++){
    	for(int j=0;j<c;j++){
        	a[i][j]=in.nextInt();
        }
    }
    
    for(int j=0;j<r;j++){
        for(int k=0;k<c-j;k++){
          	System.out.print(a[k][k+j]+" ");
        }
    }
    
  }
}