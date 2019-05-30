import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String str=in.nextLine();
    int len=str.length();
    double val=0,temp=0;
    double val2=0.0;
    for(int i=0;i<len;i++){
      if(str.charAt(i)=='.'){
        temp++;
      }else if(temp==0){
    	val=(val*10)+(double)(str.charAt(i)-48);
      }else if(temp>0){
      	val2=(val2*10)+(double)(str.charAt(i)-48);
      }
    }
    int count=1;
    double tem=val2;
    //System.out.println(val2);
    
    /*while(tem>0){
      	count*=10;
    	tem=tem/10;
    }*/
    val2=val2/100;
    //System.out.println(count);
    System.out.println(val+val2);
  }
}