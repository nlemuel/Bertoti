package sistema;

public class Operadora {
	public Planos torpedo;
	
	public Operadora(){
		torpedo = new Planos();
	}

	public void pct_diario(String informar) {
		torpedo.popup(new Pacote_diario(), informar);
	}
	public void pct_semanal(String informar) {
		torpedo.popup(new Pacote_semanal(), informar);
	}
	public void pct_mensal(String informar) {
		torpedo.popup(new Pacote_mensal(), informar);
	}	
}