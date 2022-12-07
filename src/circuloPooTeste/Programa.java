package circuloPooTeste;

import java.util.*;

public class Programa {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int entrada = 0;
		Circulo circ1 = new Circulo();

		System.out.print("Insira a coordenada X do círculo: ");
		circ1.setX(input.nextInt());

		System.out.print("Insira a coordenada Y do círculo: ");
		circ1.setY(input.nextInt());

		System.out.print("Insira o raio do círculo:");
		circ1.setRaio(input.nextDouble());

		while (entrada != 4) {
			System.out.println("\nDeseja realizar qual ação: ");
			System.out.println("1- Mover");
			System.out.println("2- Aumentar");
			System.out.println("3- Imprimir");
			System.out.println("4- Sair");
			entrada = input.nextInt();

			if (entrada == 1) {
				System.out.print("Insira o valor que deseja inserir à coordenada x: ");
				circ1.moveX(input.nextInt());
				System.out.print("Insira o valor que deseja inserir à coordenada y: ");
				circ1.moveY(input.nextInt());
				System.out.println();
			} else if (entrada == 2) {
				System.out.print("Insira quantas vezes deseja deixar o círculo maior: ");
				circ1.aumenta(input.nextInt());
				System.out.println();
			} else if (entrada == 3) {
				circ1.exibe();
				System.out.println();
			} else if (entrada == 4) {
				System.out.println("Sistema encerrado...");
				System.exit(0);
			} else {
				System.out.println("Entrada não reconhecida.");
			}
		}
		
		input.close();
	}
}
