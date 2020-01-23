import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	Scanner in=new Scanner(System.in);
		int number=in.nextInt();
      int fdig=number;
      int ldig;
      while(fdig>=10)
      {
      fdig=fdig/10;
      }
      System.out.println(fdig);
	}
}