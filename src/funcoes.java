
public class funcoes {
	
	
	
	public static void exibirResultado(double resultado) {
		System.out.println("O resultado foi " + resultado + "!\n");
	}
	public static void mostrarMenu() {
		System.out.println("PROGRAMA CALCULADORA");
		System.out.println("Escolha sua opção!");
		System.out.println("1 - Digitar valores");
		System.out.println("2 - Realizar soma");
		System.out.println("3 - Realizar subtração");
		System.out.println("4 - Realizar divisão");
		System.out.println("5 - Realizar multiplicação");
		System.out.println("6 - Sair");
		
	}
	public static void soma(double valorA, double valorB) {
		double soma;
		System.out.println("\n\nRealizando a soma entre " + valor1 + " e " + valor2);
		soma = valorA + valorB;
		exibirResultado(soma);	
	}
	public static void subtracao(double valorA , double valorB) {
		double subtracao;
		System.out.println("\n\nRealizando a subtração entre " + valor1 + " e " + valor2);
		subtracao = valorA - valorB;
		exibirResultado(subtracao);
		
	}
	public static void multiplicacao(double valorA, double valorB) {
		double multiplicacao;
		System.out.println("\n\nRealizando a multiplicação entre " + valor1 + " e " + valor2);
		multiplicacao = valorA * valorB;
		exibirResultado(multiplicacao);		
	}
	public static void divisao(double valorA, double valorB) {
		double divisao;
		System.out.println("\n\nRealizando a divisão entre " + valor1 + " e " + valor2);
		divisao = valorA / valorB;
		exibirResultado(divisao);;
	}

}
