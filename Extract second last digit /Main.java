import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int number=in.nextInt();
      int sldig=(number/10)%10;
      
      System.out.println(sldig);
	}
}