package ual.hmis.sesion05.ejercicio02;

public class Ejercicio2 {
	
	public boolean login (String username, String password){   
		// comprobar que sean distintos de vacio  
		if (username.equals(""))
			return false;
		if(password.equals(""))
			return false;
		// comprobar que la longitud sea < 30    
		if(username.length()<30 && password.length()<30){
		// llamar al método de la bbdd   
		return compruebaLoginEnBD(username, password); 
		}
		else 
			return false;
	}    
	public boolean compruebaLoginEnBD (String username, String password){   
		// método mock (simulado)   
		if (username.equals("user") && password.equals("pass"))    
			return true;    
		else     
			return false;  
		} 
	}


