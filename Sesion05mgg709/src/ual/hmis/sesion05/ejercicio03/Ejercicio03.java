package ual.hmis.sesion05.ejercicio03;

public class Ejercicio03 {

	public String contrasenia(String password) {
		String retorno;
		if (password.length()<5) {
			retorno = "Password demasiado corto";
			return retorno;
		}
		else if (password.length()>=5 && password.length()<=8) {
			retorno = "********";
			return retorno;
		}
		else if (password.length()>=12 && password.length()<=40){
			retorno = "************";
			return retorno;
		}
		else if (password.length()>40)  {
			retorno = "Password demasiado largo";
			return retorno;
		}
		else 
			return "Error 404";
		
	}
}
