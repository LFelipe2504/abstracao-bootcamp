import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	
	public static void main(String[] args) {
		
		Curso curso1 = new Curso();		
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descri��o curso Java");
		curso1.setCargaHoraria(8);
		
        Curso curso2 = new Curso();		
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("Descri��o curso JS");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria Java");
		mentoria1.setDescricao("Descri��o mentoria Java");
		mentoria1.setData(LocalDate.now());		
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);
	}

}