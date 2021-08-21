//Kuldeep Rajput2:06 PM
//https://codeshare.io/wnnnOj
	
class A
{
 public void m1()
 {
  System.out.println("In m1 A");
 }
}
class B extends A
{
 public void m1()
 {
  System.out.println("In m1 B");
 }
public void m2()
 {
  System.out.println("In m2 B");
 }
}
class Test {
  public static void main(String[] args) {
     A a=new B();
     a.m2();
   }
}

