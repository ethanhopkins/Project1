import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a, b;
		double res = 0;
		char choice = 0, ch;
		Scanner scan = new Scanner(System.in);
		
		do {
		//Prepare the menu for the user

			System.out.println("\n\nMain Menu: \nq. Quit\n1. Addition\n2. Subtraction"
					+ "\n3. Multiplication\n4. Division"
					+ "\n5. Modulus\n6. Power"
					+ "\n7. Square Root\n8. Pi"
					+ "\n9. Sine\nc. Cosine"
					+ "\nd. Tangent\ne. Cosecant"
					+ "\nf. Secant\ng. Cotangent"
					+ "\nh. E\ni. Log"
					+ "\nj. Log Base 10\nk. Ceiling"
					+ "\nl. Floor\nm. Absolute Value");
			
			choice = scan.next().charAt(0);
				switch(choice) {
				case '1':
					System.out.println("Enter two numbers: ");
					a = scan.nextFloat();
					b = scan.nextFloat();
					
					res = a + b;
					System.out.println("Result: " + res);
					break;
					
				case '2':
					System.out.println("Enter two numbers: ");
					a = scan.nextFloat();
					b = scan.nextFloat();
					
					res = a - b;
					System.out.println("Result: " + res);
					break;
					
				case '3':
					System.out.println("Enter two numbers: ");
					a = scan.nextFloat();
					b = scan.nextFloat();
					
					res = a * b;
					System.out.println("Result: " + res);
					break;
					
				case '4':
					System.out.println("Enter two numbers: ");
					a = scan.nextFloat();
					b = scan.nextFloat();
					
					res = a / b;
					System.out.println("Result: " + res);
					break;
					
				case '5':
					System.out.println("Enter two numbers: ");
					a = scan.nextFloat();
					b = scan.nextFloat();
					
					res = a % b;
					System.out.println("Result: " + res);
					break;
					
				case '6':
					System.out.println("Enter a number and its power value: ");
					a = scan.nextFloat();
					b = scan.nextFloat();
					
					res = Math.pow(a, b);
					System.out.println("Result: " + res);
					break;
					
				case '7':
					System.out.println("Enter a number: ");
					a = scan.nextFloat();
					
					res = Math.sqrt(a);
					System.out.println("Result: " + res);
					break;
					
				case '8':
					System.out.println("Enter a value: ");
					a = scan.nextFloat();
					
					res = a * Math.PI;
					System.out.println("Result: " + res);
					break;
					
				case '9':
					System.out.println("Enter a number: ");
					a = scan.nextFloat();
					
					res = Math.sin(a);
					System.out.println("Result: " + res);
					break;
					
				case 'c':
					System.out.println("Enter a number: ");
					a = scan.nextFloat();
					
					res = Math.cos(a);
					System.out.println("Result: " + res);
					break;
					
				case 'd':
					System.out.println("Enter a number: ");
					a = scan.nextFloat();
					
					res = Math.tan(a);
					System.out.println("Result: " + res);
					break;
					
				case 'e':
					System.out.println("Enter a number: ");
					a = scan.nextFloat();
					
					res = Math.pow(Math.sin(a), -1);
					System.out.println("Result: " + res);
					break;
					
				case 'f':
					System.out.println("Enter a number: ");
					a = scan.nextFloat();
					
					res = Math.pow(Math.cos(a), -1);
					System.out.println("Result: " + res);
					break;
					
				case 'g':
					System.out.println("Enter a number: ");
					a = scan.nextFloat();
					
					res = Math.pow(Math.tan(a), -1);
					System.out.println("Result: " + res);
					break;
					
				case 'h':
					System.out.println("The value of E is: ");
					
					res = Math.E;
					System.out.println("Result: " + res);
					break;
					
				case 'i':
					System.out.println("Enter a number: ");
					a = scan.nextFloat();
					
					res = Math.log(a);
					System.out.println("Result: " + res);
					break;
					
				case 'j':
					System.out.println("Enter a number: ");
					a = scan.nextFloat();
					
					res = Math.log10(a);
					System.out.println("Result: " + res);
					break;
					
				case 'k':
					System.out.println("Enter a point value: ");
					a = scan.nextFloat();
					
					res = Math.ceil(a);
					System.out.println("Result: " + res);
					break;
					
				case 'l':
					System.out.println("Enter a point value: ");
					a = scan.nextFloat();
					
					res = Math.floor(a);
					System.out.println("Result: " + res);
					break;
					
				case 'm':
					System.out.println("Enter a number: ");
					a = scan.nextFloat();
					
					res = Math.abs(a);
					System.out.println("Result: " + res);
					break;
					
				case 'q':
					System.exit(0);
					break;
					
				default:
					System.out.println("Invalid choice");
					break;
				}
		}
		while (choice != 'q');
	}
}