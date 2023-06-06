
public class IMC {
	float imc;
	String msg;
	
	
	float calularIMC(float peso, float altura){
		imc = peso/(altura*altura);
		return imc;
	}
	
	
	String exibirIMC(float imc)
	   {
	     
	      if (imc <= 19)
	    	  msg = "Abaixo do Peso";
	      else
	         if (imc <= 25)
	        	 msg = "Peso ideal";
	         else
	            if (imc <= 30)
	            	msg = "Acima do Peso";
	            else
	               if (imc <= 35)
	            	   msg = "Obesidade Leve";
	               else
	            	   msg = "Obesidade"; 
	      
	      return msg;
	   }
	
}
