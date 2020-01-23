import java.util.*;
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
      ldig=number%10;
      int sum=fdig+ldig;
      System.out.println(sum);
	}
}