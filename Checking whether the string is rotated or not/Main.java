import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      String str1 = in.nextLine();
      String str2 = in.nextLine();
      int len=str1.length();
      int flag=0;
      for(int i=1;i<=len;i++){
        StringBuilder sd = new StringBuilder("");
        for(int j=0;j<len;j++){
        	sd.append(str1.charAt((i+j)%len));
        }
        //System.out.println(sd);
        if(sd.toString().equals(str2)){
              System.out.println("Yes");
              flag=1;
              break;
        }
      }
      if(flag==0)
        System.out.println("No");
    }
}