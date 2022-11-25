package sistema;

import java.util.ArrayList;
import java.util.List;

public class Planos {
	private List<Celular> opcao = new ArrayList<Celular>();
	
	public void contratar(Celular plano) {
		opcao.add(plano);
	}

	public void cancelar(Celular plano) {
		opcao.remove(plano);
	}
	
	public void popup(Celular pacotes, String informar) {
		for(Celular plano : opcao) {
			if(plano.getClass().equals(pacotes.getClass()))
			plano.status(informar);
		}
	}
}