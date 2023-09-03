package teste;

import java.util.Scanner;
import java.lang.Math;

public class Area {
	public static void main(String[] args) {
	 
	Scanner scanner = new Scanner(System.in);
	
	/* Menu */
	 while(true) {
			System.out.println("Escolha uma opcao");
			System.out.println("Selecione 1- para calcular a area do Circulo");
			System.out.println("Selecione 2- para calcular a area do Quadrado");
			System.out.println("Selecione 3- para calcular a area do Reângulo");
			System.out.println("Selecione 4- para calcular a area do Triângulo");
			System.out.println("Selecione 0- para sair\"");
			
	int escolha = scanner.nextInt();
			
	switch(escolha) {
		case 1:
			System.out.println("Digite o raio do circulo");
			double raio = scanner.nextDouble();
			double areaCirculo = calcularAreaCirculo(raio);
			System.out.println("Area do circulo: " +areaCirculo);
			break;
		
		case 2:
			System.out.println("Digite o lado do quadrado");
			double ladoQuadrado = scanner.nextDouble();
            double areaQuadrado = calcularAreaQuadrado(ladoQuadrado);
            System.out.println("Area do Quadrado: " + areaQuadrado);
            break;
            
		case 3:
			System.out.print("Digite o comprimento do retangulo: ");
            double comprimentoRetangulo = scanner.nextDouble();
            System.out.print("Digite a largura do retangulo: ");
            double larguraRetangulo = scanner.nextDouble();
            double areaRetangulo = calcularAreaRetangulo(comprimentoRetangulo, larguraRetangulo);
            System.out.println("Área do Retângulo: " + areaRetangulo);
            break;
         
		case 4:
			System.out.println("Digite a base do triangulo");
            double baseTriangulo = scanner.nextDouble();
            System.out.println("Digite a Altura do triangulo");
            double alturaTriangulo = scanner.nextDouble();
            double areaTriangulo = calcularAreaTriangulo(baseTriangulo, alturaTriangulo);
            System.out.println("Area do triangulo" + areaTriangulo);
            break;
            

		case 0:
			System.out.println("Encerrando o programa.");
			scanner.close();
			System.exit(0);
			break;
	}
	 }
		}
	
	/* Funções */
	
	public static double calcularAreaCirculo(double raio) {
        return Math.PI * raio * raio;}
	
	public static double calcularAreaQuadrado(double lado) {
		return lado*lado;	}
	
	public static double calcularAreaRetangulo(double comprimento, double largura) {
		return comprimento * largura; }
	
	public static double calcularAreaTriangulo(double base, double altura) {
		return 0.5 * base * altura;}
		
	}
		