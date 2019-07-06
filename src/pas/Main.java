package pas;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Sala s = new Sala("p1-01",60);
		Sala s1 = new Sala("p1-02",60);
		//System.out.println(s.mostraSala());
		
		//s.horariosDeAula.get(0).reservaSala("matematica01",50);
		
		//System.out.println("\n\n\n" + s.mostraSala());
		
		ArrayList<DisciplinaTurma> turmas = new ArrayList<DisciplinaTurma>();
		
		for(int i = 0; i<11; i++) {
			String curso = "matematica";
			String idT = curso+i;
			HorarioAula h1 = new HorarioAula(7+i+":30",8+i+":30",8+i);
			HorarioAula h2 = new HorarioAula(9+i+":30",10+i+":30",10+i);
			
			DisciplinaTurma turmaTemp = new DisciplinaTurma(idT,"",curso,i+1,55,h1,h2);
			turmas.add(turmaTemp);
		}
		/*
		 * esse trecho é uma tentativa de construção inicial, claro que em escala reduzida pra ficar facil de ver erros
		 *tem algum problema na comparação de horarios 
		 
		for(int i = 0; i<11; i++) {
			//int j= 0;
			/*while(s.horariosDeAula.get(j).getInicio() != turmas.get(i).horaPrimeiraAula.getInicio()  && j<15) {
				if(s.horariosDeAula.get(j).getInicio() == turmas.get(i).horaPrimeiraAula.getInicio()) {
					//System.out.println("aqui");
					break;
				}
				
				//System.out.println(s.horariosDeAula.get(j).inicio+ "---" + turmas.get(i).horaPrimeiraAula.inicio+"\n");
				j++;
			}
			
			if(s.horariosDeAula.get(j).disponivel == true) {
				s.horariosDeAula.get(j).reservaSala(turmas.get(i).idTurma,turmas.get(i).demanda);
				turmas.get(i).setIdSala(s.idSala);
			}
			else if(s1.horariosDeAula.get(j).disponivel == true) {
				s1.horariosDeAula.get(j).reservaSala(turmas.get(i).idTurma,turmas.get(i).demanda);
				turmas.get(i).setIdSala(s1.idSala);
			}
			else
				System.out.println("Nenhuma sala disponivel" );//\n i= "+ j + "\n" + s.horariosDeAula.get(j).inicio);// não deve acontecer nesse teste
		
			if(s.horariosDeAula.get(i+1).fim == s.horariosDeAula.get(i).getInicio())
				System.out.println(s.horariosDeAula.get(i).getInicio());
			
			s.horariosDeAula.get(i).reservaSala(turmas.get(i).idTurma,turmas.get(i).demanda);
			turmas.get(i).setIdSala(s.idSala);
			
			//s.horariosDeAula.get(i).reservaSala(turmas.get(i).idTurma,turmas.get(i).demanda);
			//turmas.get(i).setIdSala(s.idSala);
		}
		*/
		//ex de alocação de sala, só aloca a primeira turma na primeira sala sem verificar nada
		s.horariosDeAula.get(0).reservaSala(turmas.get(0).idTurma,turmas.get(0).demanda);
		turmas.get(0).setIdSala(s.idSala);
		
		for(int i = 0; i<11; i++) {
			System.out.println("\n" + turmas.get(i).mostraTurma() );
		}
		
		System.out.println("\n\n" + s.mostraSala());
		
		System.out.println("\n\n"+ s1.mostraSala());		
	}
}