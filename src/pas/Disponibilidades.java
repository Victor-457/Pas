package pas;

public class Disponibilidades extends HorarioAula {
	Boolean disponivel;
	String idTurma;
	int vagasDisponiveis;

	public Disponibilidades(String inicio, String fim, String turno, Boolean disponivel, String idTurma, int vagasDisponiveis) {
		super(inicio, fim, turno);
		this.disponivel = disponivel;
		this.idTurma = idTurma;
		this.vagasDisponiveis = vagasDisponiveis;
	}

	public String getDisponivel() {
		if(this.disponivel == true) {
			return "sala disponivel";
		}
		else
			return "sala ocupada";
		
	}
	
	
	public String getIdTurma() {
		return idTurma;
	}

	public void reservaSala(String idTurma,int demanda) {
		this.disponivel = false;
		this.idTurma = idTurma;
		this.vagasDisponiveis = this.vagasDisponiveis-demanda;//dps terá de resolver isso pq só vai funcionar pra primeira alocação
	}

	public String mostraDisponivel() {
		
		if(this.disponivel == true) {
			return this.getDisponivel() + " \n" + this.mostraHorarioAula();
		}
		else
			return this.getIdTurma() + " \n" + this.getDisponivel() + " \n" + this.mostraHorarioAula() + " \nvagas disponiveis: " + this.vagasDisponiveis;
		
	}

	

	
}
