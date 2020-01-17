package br.com.alura.java8.application;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;

public class TeseteOrdenaStings {

	public static void main(String[] args) {
		
		ArrayList<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");	
		palavras.sort(Comparator.comparing(String::length));
		palavras.forEach(s->System.out.println(String.format("", s)));
		System.out.println(palavras);
		
		
	}

}

class ImprimeLinha implements Consumer<String>{

	@Override
	public void accept(String t) {
		System.out.println(t);
	}
	
}

class FormataStrings implements Consumer<String>{

	@Override
	public void accept(String t) {
			System.out.println(String.format("QQQQQQ%s!!!!!!!", t));
	}
	
}
