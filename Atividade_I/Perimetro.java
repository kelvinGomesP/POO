package teste2;

import java.util.Scanner;
import java.lang.Math;

public class Perimetro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/* MENU */
        while (true) {
            System.out.println("Escolha uma opcao:");
            System.out.println("1 - Calcular area e perimetro de um circulo");
            System.out.println("2 - Calcular area e perimetro de um quadrado");
            System.out.println("3 - Calcular area e perimetro de um retangulo");
            System.out.println("4 - Calcular area e perimetro de um triangulo");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Digite o raio do circulo: ");
                    double raio = scanner.nextDouble();
                    double areaCirculo = calcularAreaCirculo(raio);
                    double perimetroCirculo = calcularPerimetroCirculo(raio);
                    System.out.println("Area do Circulo: " + areaCirculo);
                    System.out.println("Perimetro do Circulo: " + perimetroCirculo);
                    break;
                case 2:
                    System.out.print("Digite o lado do quadrado: ");
                    double ladoQuadrado = scanner.nextDouble();
                    double areaQuadrado = calcularAreaQuadrado(ladoQuadrado);
                    double perimetroQuadrado = calcularPerimetroQuadrado(ladoQuadrado);
                    System.out.println("Area do Quadrado: " + areaQuadrado);
                    System.out.println("Perimetro do Quadrado: " + perimetroQuadrado);
                    break;
                case 3:
                    System.out.print("Digite o comprimento do retangulo: ");
                    double comprimentoRetangulo = scanner.nextDouble();
                    System.out.print("Digite a largura do retAngulo: ");
                    double larguraRetangulo = scanner.nextDouble();
                    double areaRetangulo = calcularAreaRetangulo(comprimentoRetangulo, larguraRetangulo);
                    double perimetroRetangulo = calcularPerimetroRetangulo(comprimentoRetangulo, larguraRetangulo);
                    System.out.println("Area do RetAngulo: " + areaRetangulo);
                    System.out.println("Perímetro do Retangulo: " + perimetroRetangulo);
                    break;
                case 4:
                    System.out.print("Digite a base do triangulo: ");
                    double baseTriangulo = scanner.nextDouble();
                    System.out.print("Digite a altura do triangulo: ");
                    double alturaTriangulo = scanner.nextDouble();
                    double areaTriangulo = calcularAreaTriangulo(baseTriangulo, alturaTriangulo);
                    double perimetroTriangulo = calcularPerimetroTriangulo(baseTriangulo, alturaTriangulo);
                    System.out.println("Area do Triangulo: " + areaTriangulo);
                    System.out.println("Perimetro do Triangulo: " + perimetroTriangulo);
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opcoo invalida");
                    break;
            }
        }
    }

    /*FUNÇOES*/
    
    public static double calcularAreaCirculo(double raio) {
        return Math.PI * raio * raio;
    }

    public static double calcularPerimetroCirculo(double raio) {
        return 2 * Math.PI * raio;
    }

    public static double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }

    public static double calcularPerimetroQuadrado(double lado) {
        return 4 * lado;
    }

    public static double calcularAreaRetangulo(double comprimento, double largura) {
        return comprimento * largura;
    }

    public static double calcularPerimetroRetangulo(double comprimento, double largura) {
        return 2 * (comprimento + largura);
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return 0.5 * base * altura;
    }

    public static double calcularPerimetroTriangulo(double base, double altura) {
        double lado1 = Math.sqrt(base * base + altura * altura);
        return base + altura + lado1;
    }
}
/*Nao sei pq nao ta aparecendo as contas, ele volta pro menu rapidao e nao da tempo de ver, mesmo com o break */
