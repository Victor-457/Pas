package pas;

public class DisciplinaTurma {
	String idTurma;
	String idSala;
	String curso;
	int periodo;
	int demanda;
	HorarioAula horaPrimeiraAula;
	HorarioAula horaSegundaAula;
	
	
	public DisciplinaTurma(String idTurma, String idSala, String curso, int periodo, int demanda,
			HorarioAula horaPrimeiraAula, HorarioAula horaSegundaAula) {
		super();
		this.idTurma = idTurma;
		this.idSala = idSala;
		this.curso = curso;
		this.periodo = periodo;
		this.demanda = demanda;
		this.horaPrimeiraAula = horaPrimeiraAula;
		this.horaSegundaAula = horaSegundaAula;
	}

	public String getIdTurma() {
		return idTurma;
	}

	public String getIdSala() {
		return idSala;
	}

	public void setIdSala(String idSala) {
		this.idSala = idSala;
	}

	public int getDemanda() {
		return demanda;
	}

	public HorarioAula getHoraPrimeiraAula() {
		return horaPrimeiraAula;
	}

	public HorarioAula getHoraSegundaAula() {
		return horaSegundaAula;
	}

	public String mostraTurma() {
		
		return "curso " + this.curso + "\nid turma " + this.idTurma + "\nperiodo " + this.periodo + "\ndemanda " +
				this.demanda + "\nsala " + this.idSala + "\nhora aula 1 " + this.horaPrimeiraAula.mostraHorarioAula() +
				"\nhora aula 2 " + this.horaSegundaAula.mostraHorarioAula();
	}
}
