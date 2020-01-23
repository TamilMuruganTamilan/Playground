import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in =new Scanner(System.in);
    int n=in.nextInt();
    int fdig=n/100;
    int sdig=(n/10)%10;
    int ldig =n%10;
    int rev=(ldig*100)+(sdig*10)+fdig;
    System.out.println(rev);
  }
}