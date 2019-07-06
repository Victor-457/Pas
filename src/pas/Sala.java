package pas;

import java.util.ArrayList;

public class Sala {
	String idSala;
	int capacidade;
	ArrayList<Disponibilidades> horariosDeAula;
	
	public Sala(String idSala, int capacidade) {
		super();
		this.idSala = idSala;
		this.capacidade = capacidade;
		
		this.horariosDeAula = new ArrayList<Disponibilidades>();
		
		Disponibilidades horaAula;
		for(int i = 0; i<16; i++ ) {
			int hInicial = 7+i;
			int hFinal = 8+i;
			String horaInicial = hInicial + ":30";
			String horaFinal = hFinal + ":30";
			
			if(i<5) {
				String turno = "manha";
				horaAula = new Disponibilidades(horaInicial,horaFinal,turno,true,"",this.capacidade);
				this.horariosDeAula.add(horaAula);
			}
			else if(i<11) {
				String turno = "tarde";
				horaAula = new Disponibilidades(horaInicial,horaFinal,turno,true,"",this.capacidade);
				this.horariosDeAula.add(horaAula);
			}
			else{
				String turno = "noite";
				horaAula = new Disponibilidades(horaInicial,horaFinal,turno,true,"",this.capacidade);
				this.horariosDeAula.add(horaAula);
			}
		}
	}
	
	public String mostraSala() {
		String horarios = "";
		for(int i = 0; i<16; i++ ) {
			horarios = horarios + "\n" + this.horariosDeAula.get(i).mostraDisponivel() + "\n" ;
		}
		return this.idSala + "\n" + this.capacidade + "\n" + horarios;
	}
}
