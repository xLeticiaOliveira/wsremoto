package br.com.universidadexpto.principal;

import br.com.universidadexpto.modelo.Aluno;
import br.com.universidadexpto.modelo.Curso;
import br.com.universidadexpto.modelo.Pessoa;
import br.com.universidadexpto.modelo.Professor;
import br.com.universidadexpto.modelo.Turma;
import util.Magica;

public class TesteTurma {
	
	public static void main(String[] args) {
		
		Turma turma = new Turma(
				Magica.i("Numero"),
				Magica.s("Período"),
				new Curso(
						Magica.s("Nome curso"),
						Magica.s("Sigla curso"),
						Magica.i("Carga horária")
						),
				new Professor (
						Magica.s("Nome professor"),
						Magica.s("Email professor"),
						Magica.s("Formação"),
						Magica.s("Área"),
						Magica.s("Subarea")
						),
				new Aluno(
						Magica.s("Nome aluno"),
						Magica.s("Email aluno"),
						Magica.i("Registro matrícula"),
						Magica.bool("Bolsista?", "Aluno")
						)
				);
		System.out.println(turma);
	}

}
