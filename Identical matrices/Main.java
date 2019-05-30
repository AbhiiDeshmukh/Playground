import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int r=in.nextInt();
    int c=in.nextInt();
    int a[][]=new int[r][c];
    int b[][]=new int[r][c];
      
    for(int i=0;i<r;i++){
    	for(int j=0;j<c;j++){
        	a[i][j]=in.nextInt();
        }
    }
    
    for(int i=0;i<r;i++){
    	for(int j=0;j<c;j++){
        	b[i][j]=in.nextInt();
        }
    }
    boolean flag=false;
    
    for(int i=0;i<r;i++){
    	for(int j=0;j<c;j++){
        	if(a[i][j]==b[i][j]){
            	flag=true;
              continue;
            }else{
            	flag=false;
              	break;
            }
        }
    }
    
    if(flag==true)
      System.out.println("Yes");
    else
      System.out.println("No");
    
  }
}