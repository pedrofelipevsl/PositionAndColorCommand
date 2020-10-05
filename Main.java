import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Rectangle rectangle = new Rectangle(0, 0, "Preto");
		CommandHistory history = new CommandHistory();

		Scanner scanner = new Scanner(System.in);
		int option;
		Scanner scX = new Scanner(System.in);
		Scanner scY = new Scanner(System.in);
		do {
			System.out.println("");
			history.print();
			System.out.println("\nO retângulo está na posição: (" + rectangle.getX() + ", " + rectangle.getY()
					+ ") e cor " + rectangle.getCor());
			System.out.println("\n1 - Mover o retângulo");
			System.out.println("2 - Alterar a cor do retângulo");
			System.out.println("3 - Undo");
			System.out.println("4 - Redo");
			System.out.println("5 - Sair da apliacação ");
			System.out.print("\nSelecione sua opção: ");
			option = Integer.parseInt(scanner.nextLine());
			
			switch (option) {
			case 1:
				System.out.print("Digite X: ");
				int x = scX.nextInt();
				System.out.print("Digite Y: ");
				int y = scY.nextInt();
				
				history.add(new MoveCommand(rectangle, x, y));
				break;
			case 2:
				System.out.print("Digite a nova cor: ");
				history.add(new ColorChangeCommand(rectangle, scanner.nextLine()));
				break;
			case 3:
				if (!history.moveBackward())
					System.out.println("Cannot undo!");
				break;
			case 4:
				if (!history.moveForward())
					System.out.println("Cannot redo!");
				break;
			}

		} while (option != 5);
	}
}