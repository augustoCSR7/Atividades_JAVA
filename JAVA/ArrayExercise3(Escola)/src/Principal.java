
public class Principal {

	public static void main(String[] args) {
		float [] [] turmas = new float [3][5];
		//NOTAS TURMA 1
		turmas[0][0] = 7;
		turmas[0][1] = 4;
		turmas[0][2] = 9;
		turmas[0][3] = 5;
		turmas[0][4] = 8;
		
		float media1, soma1 = 0;
		for (int linha1 = 0; linha1 < 5; linha1++) {
			soma1 += turmas[0][linha1];
		}
		media1 = soma1 / 5;
		System.out.println("A media da primeira turma eh: " + media1);
		
		//NOTAS TURMA 2
		turmas[1][0] = 9;
		turmas[1][1] = 5;
		turmas[1][2] = 10;
		turmas[1][3] = 7;
		turmas[1][4] = 6;
		
		float media2, soma2 = 0;
		for (int linha2 = 0; linha2 < 5; linha2++) {
			soma2 += turmas[1][linha2];
		}
		media2 = soma2 / 5;
		System.out.println("A media da segunda turma eh: " + media2);
		
		//NOTAS TURMA 3
		turmas[2][0] = 3;
		turmas[2][1] = 8;
		turmas[2][2] = 7;
		turmas[2][3] = 5;
		turmas[2][4] = 10;
		
		float media3, soma3 = 0;
		for (int linha3 = 0; linha3 < 5; linha3++) {
			soma3 += turmas[2][linha3];
		}
		media3 = soma3 / 5;
		System.out.println("A media da terceira turma eh; " + media3);
		
		float mediaEscolar = (media1 + media2 + media3) / 3;
		System.out.printf("A media da escola eh: %.2f", mediaEscolar);
	}

}
