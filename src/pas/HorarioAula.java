package pas;

public class HorarioAula extends Horas{
	String turno;

	public HorarioAula(String inicio, String fim, String turno) {
		super(inicio, fim);
		this.turno = turno;
	}
	
	public HorarioAula(String inicio, String fim,int i) {
		super(inicio, fim);
		if(i<12)
			this.turno = "manha";
		else if(i<18)
			this.turno = "tarde";
		else
			this.turno = "noite";
	}
	
	public String getTurno() {
		return this.turno;
	}

	

	public String mostraHorarioAula() {
		return this.turno + ": " + this.getHoras();
	}

	
}
