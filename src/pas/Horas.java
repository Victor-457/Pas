package pas;

public class Horas {
	
	String inicio;
	String fim;
	
	public Horas(String inicio, String fim) {
		super();
		this.inicio = inicio;
		this.fim = fim;
	}

	public String getHoras() {
		return this.inicio+"-"+this.fim;
	}
	
	public String getInicio() {
		return inicio;
	}

}
