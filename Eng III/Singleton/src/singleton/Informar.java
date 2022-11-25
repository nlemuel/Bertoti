package singleton;

public class Informar {
	public static void main(String[] args) {
		Singleton meiodia = Singleton.getInstance("Brasil");
		System.out.println(meiodia.horario);
		
		Singleton meianoite = Singleton.getInstance("Japao");
		System.out.println(meianoite.horario);
	}
}
