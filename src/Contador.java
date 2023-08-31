import java.util.Scanner;
import java.util.Locale;

public class Contador {
  public static void main(String[] args) throws Exception {
        //modelo de scanner já utilizado, alterar!!
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Por favor, digite um número inteiro");
    int primeiroNumero = scanner.nextInt();

		System.out.println("Por favor, digite um número inteiro");
		int segundoNumero = scanner.nextInt();
		
		scanner.close();

		try {
			//chamando o método contendo a lógica de contagem
			contar(primeiroNumero, segundoNumero);
		
		}catch (ParametrosInvalidosException e) {
			System.err.println("O segundo número deve ser maior que o primeiro!");
		}
		
	}
	static void contar(int primeiroNumero, int segundoNumero ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(primeiroNumero >= segundoNumero) 
      throw new ParametrosInvalidosException();
      int contagem = segundoNumero - primeiroNumero;
      for (int i = 0; i < contagem; i++){
    		System.out.println("Imprimindo o número " + (i+1));
      };
	}
}
