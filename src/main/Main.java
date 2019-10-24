package main;

class Filosofo1 {
	
	public static String HashiEsq = "";
	public static String HashiDir = "";
	
	public static String FEsq = "";
	public static String FDir = "";
	
}

class Filosofo2 {
	
	public static String HashiEsq = "";
	public static String HashiDir = "";
	
	public static String FEsq = "";
	public static String FDir = "";
	
}

class Filosofo3 {
	
	public static String HashiEsq = "";
	public static String HashiDir = "";
	
	public static String FEsq = "";
	public static String FDir = "";
	
}

class Filosofo4 {
	
	public static String HashiEsq = "";
	public static String HashiDir = "";
	
	public static String FEsq = "";
	public static String FDir = "";
	
}

public class Main {
	
	public enum Estado {
		FAMINTO, COMENDO, CHEIO
	}
	
	Estado estado1 = Estado.CHEIO;
	Estado estado2 = Estado.CHEIO;
	Estado estado3 = Estado.CHEIO;
	Estado estado4 = Estado.CHEIO;
	
	String hashi1 = "";
	String hashi2 = "";
	String hashi3 = "";
	String hashi4 = "";
	
	Thread f1 = new Thread() {
		
		void Run() {
			
			estado1 = Estado.COMENDO;
			
			Filosofo1.HashiDir = "";
			Filosofo1.HashiEsq = "";
			
			 int i = 0;
			 
			 System.out.println("Filosofo1 está comendo!");
			
			for(i = 10; i > 0; i--) {
				
				
				
				System.out.println("Filosofo1 termina de comer em: " + i);
				
				if(i > 10 || i < 0) {
					
					System.out.println("Filosofo1 causou um DeadLock!");
					System.exit(1);
					
				}
				
			}
			
			i = 0;
			
			estado1 = Estado.CHEIO;
			
		}
		
	};
	
	Thread f2 = new Thread() {
		
		void Run() {
			
			
			
		}
		
	};
	
	Thread f3 = new Thread() {
		
		void Run() {
			
			
			
		}
		
	};
	
	Thread f4 = new Thread() {
		
		void Run() {
			
			
			
		}
		
	};
	

}
