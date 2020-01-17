package br.com.alura.java8.application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;

public class TesteUsuarioReference {

	public static void main(String[] args) {
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		
		
		
		Usuario user = new Usuario("william", 23);
		Usuario user1 = new Usuario("abreu", 22);
		Usuario user2 = new Usuario("bartlomeu", 22);
		Usuario user3 = new Usuario("ze dirceu", 21);
		
		usuarios.add(user);
		usuarios.add(user1);
		usuarios.add(user2);
		usuarios.add(user3);
		
		usuarios.sort(Comparator.comparing(Usuario::getNome));
		usuarios.forEach(u ->System.out.println(u.getIdade()+" "+u.getNome()));
		usuarios.forEach(System.out::println);// tem que alerar o tostring pra isso funcionar
		
		usuarios.stream()
		.filter(u -> u.getIdade() > 20)
		.map(Usuario::getIdade)
		.forEach(System.out::println);;
		
	}
	
	
	}


