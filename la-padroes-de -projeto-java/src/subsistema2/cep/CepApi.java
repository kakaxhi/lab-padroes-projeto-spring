package subsistema2.cep;

import one.digitalinnovation.gof.singleton.SinlgetonEager;

public class CepApi {
private static CepApi instancia = new CepApi();
	
	private CepApi () {
		super();
	}
	
	public static CepApi getInstancia() {
		return instancia;	
	}
	
	public String recuperaCidade(String cep) {
		return "Araraquara";
		
	}
	
	public String recuperEstado(String cep) {
		return "SP";
		
	}
}
	


