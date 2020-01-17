package br.com.alura.java8.application;

import java.awt.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TesteUsuarioReference {

	public static void main(String[] args) {
		ArrayList<Curso> cursos = new ArrayList<Curso>();
		
		
		
		Curso user = new Curso("william", 123);
		Curso user1 = new Curso("abreu", 1555);
		Curso user2 = new Curso("bartlomeu", 232);
		Curso user3 = new Curso("ze dirceu", 251);
		
		cursos.add(user);
		cursos.add(user1);
		cursos.add(user2);
		cursos.add(user3);
	
		
		cursos.stream()
		.filter(u -> u.getAlunos() > 100)
		.map(Curso::getAlunos)
		.forEach(System.out::println);
		
//		classe oprional
	    cursos.stream().
		filter(c -> c.getAlunos() >50)
		.findFirst()
		.map(Curso::getNome)
		.ifPresent(System.out::println);
		
//	pesquisar sobre a a classe optional e seus métodos
	    
	    
//	    usando collectors para tranformar o resultado dos filtros em lista
//	    pesquisa sobre collectors
//	    da pra usar map tbm
//	    PARALLELSTREAM FAZ TRABALHAR EM ARALELO IMPORTANTE PARA CONJUTOS GRANDES
	    
	    ArrayList<Curso> u = (ArrayList <Curso>) cursos.stream().
		filter(c -> c.getAlunos() >150)
		.collect(Collectors.toList());
	    
	    u.forEach(s -> System.out.println(s.getAlunos()));
	    
	    // assim ele filtra a lista e retorna pra ela mesma
	    cursos = (ArrayList<Curso>) cursos.stream().
	    		filter(c -> c.getAlunos() >150)
	    		.collect(Collectors.toList());
	    	    
	    
	    
	}
	
	
	}


