import java.util.Scanner;

public class Taschenrechner {

	public static void main(String[] args) {

		int ende;
		ende = 0;
		System.out.println("____Taschenrechner____ \n");
		Scanner scanner = new Scanner(System.in);

		while (ende == 0) {
			char eingabe;
			double eins = 0;
			double zwei = 0;

			System.out.println("Bitte, geben Sie einen Operator ein. (E für Ende) \n");

			eingabe = scanner.next().charAt(0);
			if (eingabe == 'E') {
				ende = 1;
				System.out.println("Adios \n");
			} else {
				System.out.println("Zahl 1 wäre? \n");
				eins = scanner.nextDouble();
				System.out.println("Zahl 1 eingetragen: " + eins);
				System.out.println();
				System.out.println("Zahl 2 wäre? \n");

				zwei = scanner.nextDouble();
				System.out.println("Zahl 2 eingetragen: " + zwei);
				System.out.println();

			}
			switch (eingabe) {
			case '+':
				System.out.println(eins + " + " + zwei + " = " + addieren(eins, zwei));
				System.out.println();
				break;
			case '-':
				System.out.println(eins + " - " + zwei + " = " + subtrahieren(eins, zwei));
				System.out.println();
				break;
			case '*':
				System.out.println(eins + " * " + zwei + " = " + multiplizieren(eins, zwei));
				System.out.println();
				break;
			case '/':
				System.out.println(eins + " / " + zwei + " = " + dividieren(eins, zwei));
				System.out.println();
				break;
			case 'E':
				ende = 1;
				break;
			default:
				System.out.println("falsche Eingabe!");
				break;
			}
		}
		System.out.println("\n\n");

	}

	public static double addieren(double x, double y) {
		return x + y;
	}

	public static double subtrahieren(double x, double y) {
		return x - y;
	}

	public static double multiplizieren(double x, double y) {
		return x * y;
	}

	public static double dividieren(double x, double y) {
		return x / y;
	}

}
