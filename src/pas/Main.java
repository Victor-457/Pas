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
		 */
		for(int i = 0; i<11; i++) {
			int j= 0,k;
			String h1 = s.horariosDeAula.get(i).getInicio();
			String h2 = turmas.get(j).horaPrimeiraAula.getInicio(); 
			 
			for(j=0;j<15;j++) {
				
				if(h1.equals(h2)) {
					System.out.println("aqui");
					break;
				}
				System.out.println(j);
				h2 = turmas.get(j).horaPrimeiraAula.getInicio();
			}
			System.out.println("segunda aula");
			for( k = 0; k < 15; k++) {
				
				if(h1.equals(h2)) {
					System.out.println("aqui");
					break;
				}
				System.out.println(k);
				h2 = turmas.get(k).horaSegundaAula.getInicio();
			}
			
			System.out.println(j+"\n"+k);
			/*Esses ifs funcionam se forem utilizados somente para primeira aula(comente as linhas com comentarios
			 * e vai dar pra ver), quando coloquei a segunda aula embolou então tem que desenbolar kkkk
			*/
			if(s.horariosDeAula.get(j).disponivel == true && s.horariosDeAula.get(k).disponivel == true) {
				s.horariosDeAula.get(j).reservaSala(turmas.get(i).idTurma,turmas.get(i).demanda);
				/*Comente a linha abaixo e deve funcionar*/
				s.horariosDeAula.get(k).reservaSala(turmas.get(i).idTurma,turmas.get(i).demanda);
				turmas.get(i).setIdSala(s.idSala);
			}
			else if(s1.horariosDeAula.get(j).disponivel == true && s1.horariosDeAula.get(k).disponivel == true){
				s1.horariosDeAula.get(j-1).reservaSala(turmas.get(i).idTurma,turmas.get(i).demanda);
				/*Comente a linha abaixo e deve funcionar*/
				s1.horariosDeAula.get(k).reservaSala(turmas.get(i).idTurma,turmas.get(i).demanda);
				turmas.get(i).setIdSala(s1.idSala);
			}
			else
				System.out.println("Nenhuma sala disponivel" );

		}
		
		for(int i = 0; i<11; i++) {
			System.out.println("\n" + turmas.get(i).mostraTurma() );
		}
		
		System.out.println("\n\n" + s.mostraSala());
		
		System.out.println("\n\n"+ s1.mostraSala());		
	}
}