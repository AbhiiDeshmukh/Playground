import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    Scanner in=new Scanner(System.in);
    int row=in.nextInt();
    int col=in.nextInt();
    
    int matrix1[][] = new int[row][col];
    int matrix2[][] = new int[row][col];
    
    for(int i = 0 ; i <= row-1; i++){
    	for(int j=0;j<col;j++){
        	matrix1[i][j] = in.nextInt();
        }
    }
    
    for(int i = 0 ; i <= row-1; i++){
    	for(int j=0;j<col;j++){
        	matrix2[i][j] = in.nextInt();
        }
    }
    
    for(int i = 0 ; i <= row-1; i++){
    	for(int j=0;j<col;j++){
        	System.out.print(matrix1[i][j]-matrix2[i][j] + " ");
        }
      System.out.println();
    }
    
  }
}