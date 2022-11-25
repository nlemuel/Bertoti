package sistema;

public class mensagem {

	public static void main(String[] args) {
		Operadora MeuCelular = new Operadora();
		
		MeuCelular.torpedo.contratar(new Pacote_diario());
		MeuCelular.torpedo.contratar(new Pacote_semanal());
		MeuCelular.torpedo.cancelar(new Pacote_semanal());
		MeuCelular.torpedo.contratar(new Pacote_mensal());
		MeuCelular.torpedo.cancelar(new Pacote_mensal());
		MeuCelular.torpedo.contratar(new Pacote_diario());
		
		MeuCelular.pct_diario("Promocao Bonus Diario");
		MeuCelular.pct_semanal("Bonus de SMS");
		MeuCelular.pct_mensal("Descontos todos os meses");
	}
}
