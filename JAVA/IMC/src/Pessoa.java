public class Pessoa {
	
	private String nome;
	private int idade;
	private float altura;
	private float peso;
	private float imc;
	private String msg;
	
	public Pessoa() {}

	public void calularIMC(){
		imc = peso/(altura*altura);
	}
	
	/**
	 * @return the imc
	 */
	public String getImc() {
		return String.format("%.2f", imc);
	}
	
	public String exibirMSG()
	   {
	        
		if (imc <= 19)
	    	  msg = "Abaixo do Peso, se alimente melhor";
	      else
	         if (imc <= 25)
	        	 msg = "Peso ideal, parabéns! Continue assim.";
	         else
	            if (imc <= 30)
	            	msg = "Acima do Peso, faça uma dieta";
	            else
	               if (imc <= 35)
	            	   msg = "Obesidade Leve, faça atividade física";
	               else
	            	   msg = "Obesidade, cuidado! Procure um nutricionista"; 
	      
	      return msg;
	   }
	
	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the idade
	 */
	public int getIdade() {
		return idade;
	}

	/**
	 * @param idade the idade to set
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}

	/**
	 * @return the altura
	 */
	public float getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(float altura) {
		this.altura = altura;
	}

	/**
	 * @return the peso
	 */
	public float getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(float peso) {
		this.peso = peso;
	}

	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}	
	
	public String toString() {
		return "Nome:"+getNome()+"\n"+
				"Idade:"+getIdade()+"\n"+
				"Altura:"+getAltura()+"\n"+
				"Peso:"+getPeso()+"\n"+
				"IMC:"+getImc()+"\n";
	}
	 
}
