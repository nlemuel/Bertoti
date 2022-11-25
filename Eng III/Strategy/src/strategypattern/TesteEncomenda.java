package strategypattern;

public class TesteEncomenda {
	
	public static void main(String[] args) {
		
		Transporte eletronico = new Transporte();
		
		eletronico.setEntrega(new FreteComum());
		eletronico.efetuarEntrega();
	
		System.out.println("-------------------------------------");
	
		eletronico.setEntrega(new FreteRapido());
		eletronico.efetuarEntrega();
		
		System.out.println("-------------------------------------");
	
		eletronico.setEntrega(new FreteLoja());
		eletronico.efetuarEntrega();
	}
	
}