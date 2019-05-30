import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner in = new Scanner (System.in);
  	int r=in.nextInt();
    int c=in.nextInt();
    
    int matrix[][]=new int[r][c];
    int trs[][]=new int[c][r];
    
    for(int i=0;i<r;i++){
    	for(int j=0;j<c;j++){
        	matrix[i][j]= in.nextInt();
        }
    }
    
    for(int i=0;i<c;i++){
    	for(int j=0;j<r;j++){
        	trs[i][j]=matrix[j][i];
        }
    }
    for(int i=0;i<c;i++){
    	for(int j=0;j<r;j++){
        	System.out.print(trs[i][j]+" ");
        }
      System.out.println();
    }
    
  }
}