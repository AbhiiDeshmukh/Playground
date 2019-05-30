import java.util.*;

class Faculty
{
  public int sal;
  public void salary(int sal)
  {
    this.sal=sal;
    System.out.println("Base Salary: "+this.sal);
  }
}
class CSE extends Faculty
{
  public void salary(int sal)
  {
  	int new1=sal+3000;
    System.out.println("CSE Faculty: "+new1);
  }
}
class IT extends Faculty
{
	
  public void salary(int sal)
  {
  int new1=sal+5000;
    System.out.println("IT Faculty: "+new1);
  }
}
class ECE extends Faculty
{
	
  public void salary(int sal)
  {
  int new1=sal+4500;
    System.out.println("ECE Faculty: "+new1);
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int sal=in.nextInt();
    
    Faculty dm = new Faculty();
    dm.salary(sal);
    
    
    CSE obj3 = new CSE();
    obj3.salary(sal);
    
    IT obj2 = new IT();
    obj2.salary(sal);
    
    ECE obj1 = new ECE();
    obj1.salary(sal);
    
  }
}