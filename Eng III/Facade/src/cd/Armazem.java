package cd; //CD centro de distribuição

public class Armazem {
	//mercadoria atual + mercadoria recebida
		public int recebido(int atual, int atualizado) {
			return atual + atualizado;
		}
		
		public int avaria(int atual, int atualizado) {
			return atual - atualizado;
		}
		
		public int distribuir(int atual, int atualizado) {
			return atual / atualizado;
		}
}