import java.util.Scanner;

public class Convertisseur {

	public static void main(String[] args) {
		System.out.println("                                               ");
		System.out.println("CONVERTISSEUR DEGRÉS CELSIUS ET DEGRÉS FAHRENHEIT");
		System.out.println("-----------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in); // pour lire les char
		
		char reponse = ' ';
		double T_fahrenheit;
		double T_celsius;
		
		do {
			
			System.out.println("Choisissez un convertisseur \n 1-Convertisseur degrés Celsius \n 2-Convertisseur degrés Fahrenheit ");
			int choix = sc.nextInt();
			reponse = 'O';
			if (choix == 1)
					{	
						System.out.println("Température en celsius à convertir : ");
						T_celsius = sc.nextDouble();
						T_fahrenheit = ((9*T_celsius)/5 + 32);
						System.out.println(T_celsius+"°C correspond à "+ T_fahrenheit+ "°F");			 
					}
			else
			{
				if (choix == 2)
				{
					System.out.println("Température en fahrenheit à convertir : ");
					T_fahrenheit = sc.nextDouble();
					T_celsius =(( T_fahrenheit- 32)*5)/9;
					System.out.println( T_fahrenheit+"°F correspond à "+T_celsius + "°C");
					reponse = ' ';
					 
				}
					
			}
		
		do {
			System.out.println("Voulez vous effectuer une autre convertion ? (O/N) ");
			reponse = sc1.nextLine().charAt(0);
		}while (reponse != 'O' && reponse != 'N');
		
		}while( reponse == 'O');
		System.out.println("Au revoir..........");
		
		
	}

}

