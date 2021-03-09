import java.util.Scanner;

public class Calculadora {
	
	public static double valor1=0;
	public static double valor2=0;

	
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		
		int opcao = 0;
		
		while (opcao!=6) {
			
			funcoes.mostrarMenu();
			
			opcao = leitor.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("\n\nDigite o 1º valor:");
				valor1 = leitor.nextDouble();
				System.out.println("\n\nDigite o 2º valor:");
				valor2 = leitor.nextDouble();
				
				System.out.println("Os valores " + valor1 + " e " + valor2 + " foram armazenados\n\n");
				
				break;
			case 2:
				funcoes.soma(valor1,valor2);
				
				break;
			case 3:
				funcoes.subtracao(valor1,valor2);
				break;
			case 4:
				funcoes.divisao(valor1,valor2);
				break;
			case 5:
				funcoes.multiplicacao(valor1,valor2);
				break;
			case 6:
				System.out.println("Saindo do sistema");
				break;
			}
			
		}
		leitor.close();
		

	}

}
