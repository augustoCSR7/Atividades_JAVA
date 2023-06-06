
public class MatrizPrincipal {

	public static void main(String[] args) {
		int x = 2;
		int y = 2;
		int [] [] numeros = new int [x] [y];
		
		numeros[0][0] = 7;
		numeros[1][0] = 4;
		numeros[0][1] = 12;
		numeros[1][1] = 2;
		
		int soma = 0;
		
		for (int coluna=0; coluna < y; coluna++) {
			for (int linha=0; linha < x; linha++) {
				System.out.println(numeros[linha][coluna]);
				soma += numeros[linha][coluna];
			}
		}
		System.out.println("A soma dos elementos é: " + soma);
		
	}

}
