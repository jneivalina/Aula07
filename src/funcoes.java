
public class funcoes {
	
	
	
	public static void exibirResultado(double resultado) {
		System.out.println("O resultado foi " + resultado + "!\n");
	}
	public static void mostrarMenu() {
		System.out.println("PROGRAMA CALCULADORA");
		System.out.println("Escolha sua op��o!");
		System.out.println("1 - Digitar valores");
		System.out.println("2 - Realizar soma");
		System.out.println("3 - Realizar subtra��o");
		System.out.println("4 - Realizar divis�o");
		System.out.println("5 - Realizar multiplica��o");
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
		System.out.println("\n\nRealizando a subtra��o entre " + valor1 + " e " + valor2);
		subtracao = valorA - valorB;
		exibirResultado(subtracao);
		
	}
	public static void multiplicacao(double valorA, double valorB) {
		double multiplicacao;
		System.out.println("\n\nRealizando a multiplica��o entre " + valor1 + " e " + valor2);
		multiplicacao = valorA * valorB;
		exibirResultado(multiplicacao);		
	}
	public static void divisao(double valorA, double valorB) {
		double divisao;
		System.out.println("\n\nRealizando a divis�o entre " + valor1 + " e " + valor2);
		divisao = valorA / valorB;
		exibirResultado(divisao);;
	}

}
