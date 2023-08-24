package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import entities.Pessoa;

public class ProgramPessoa {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa("Vanessa", 33);
		Pessoa pessoa2 = new Pessoa("Maria", 33);
		Pessoa pessoa3 = new Pessoa("Cinthia", 83);

		ArrayList<Pessoa> pessoas = new ArrayList<>();

		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);

		System.out.println(pessoas);

		Collections.sort(pessoas);

		System.out.println(pessoas);

		Collections.sort(pessoas, Comparator.comparing(Pessoa::getIdade));

	}

}
