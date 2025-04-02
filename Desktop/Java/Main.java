import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter first number:");
		int a = scn.nextInt();
		System.out.println("Enter second number:");
		int b = scn.nextInt();
		int sum = a + b;
		System.out.println("The sum of these numbers is:" +sum);
		scn.close();
		
		
	}
}