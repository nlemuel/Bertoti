package singleton;

public class Singleton {
	private static Singleton singleton;
	private Singleton(String global) {
		horario = global;
		
	}
	public String horario;
	public static Singleton getInstance(String global) {
		if (singleton == null) {
			singleton = new Singleton(global);
		}
		return singleton;
	}

}
