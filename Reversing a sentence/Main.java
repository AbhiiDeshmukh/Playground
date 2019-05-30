import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
      	String str=in.nextLine();
      	int len=str.length();
      	StringBuilder sd = new StringBuilder(str);
      	StringBuilder sd1 = new StringBuilder("");	
      	int end=0;	
      
      	for(int i=len-1;i>=0;i--){
        	sd1.append(sd.charAt(i));
        }
      	
      //System.out.print(sd1);
      int start = 0;
		for(int i=0;i<len;i++){
        	if(sd1.charAt(i)==' '){
              	//System.out.println(start+" "+(i-1));
            	reverse(sd1,start,i-1);
              	start=i+1;
            }
        }
      
      	for(int i=0;i<len;i++){
        	if(sd.charAt(i)==' '){
              for(int j=0;j<i;j++)
            	System.out.print(sd.charAt(j));
              break;
            }
        }
    }
    // Function to reverse a string
    public static void reverse(StringBuilder sb, int start_idx, int end_idx)
    {
        for(int i=end_idx;i>=start_idx;i--){
        	System.out.print(sb.charAt(i));
        }
      System.out.print(" ");
    }
  

}