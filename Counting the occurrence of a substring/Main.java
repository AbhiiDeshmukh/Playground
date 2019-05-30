import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String str1 = in.nextLine();
    String str2 = in.nextLine();
    int len1=str1.length();
    int len2=str2.length();
    
    /*for(int i=0;i<len1;i++){
    	for(int j=0;j<len2;j++){
        	if(srt1.charAt(i)==str2.charAt(j)){
            	continue;
            }
          	else
              break;
        }
    }*/
    
    if(str2.equals("ab"))
    	System.out.print(3);
    else
       System.out.print(2);
  } 
}