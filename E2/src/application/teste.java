package application;

import application.Circulo;
import application.Quadrado;
import application.Triangulo;
import java.util.Scanner;
import javax.swing.JFrame;

public class teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o caracter correspondente a forma geométrica que deseja; \n"
				+ "Circulo [C], Quadrado [Q], Triângulo [T] : ");
		
		char car = sc.next().charAt(0);
		
		if (car == 'C') {
			Circulo c = new Circulo();
			c.setVisible(true);
		}
		else if (car == 'Q') {
			Quadrado q = new Quadrado();
			q.setVisible(true);
			
		}
		else if (car == 'T'){
			Triangulo t = new Triangulo();
			t.setVisible(true);
			
		}
		else {
			System.out.println("!!CARACTER INCORRETO!!\n"
					+ "o carater digitado não correponde a nenhuma forma geométrica");
		}
		sc.close();

	}

}