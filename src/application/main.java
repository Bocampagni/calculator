package application;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		while(true) {
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			int y = sc.nextInt();
			contador cont = new contador();
			
			
			System.out.println("Escolha a opera��o: ");
			System.out.println("1 - Soma\n2 - Subtra��o\n3 - Produto\n4 - divis�o");
			int escolha = sc.nextInt();
			
			
			
			if(escolha == 1) {
				double resultado = cont.soma(x, y);
				System.out.println(resultado);
			}
			else if(escolha == 2) {
				double resultado = cont.sub(x, y);
				System.out.println(resultado);
			}
			else if(escolha == 3) {
				double resultado = cont.produto(x, y);
				System.out.println(resultado);
			}
			else if(escolha == 4) {
				try {
					cont.div(x, y);
				}
				catch(ArithmeticException e) {
					System.out.println("Divis�o por zero");				
				}
			}
			else {
				System.out.println("Op��o inv�lida");
			}
			
		}
	}
}
