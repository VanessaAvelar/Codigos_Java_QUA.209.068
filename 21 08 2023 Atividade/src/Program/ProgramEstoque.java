package Program;

import java.util.Scanner;

import entities.Estoque;

public class ProgramEstoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2)crie um programa de estoque, onde voc� poder� inserir um produto e a
		// quantidade e mostrar o
		// valor total do estoque da loja; use scanner

		Scanner sc = new Scanner(System.in);

		Estoque estoque = new Estoque();

		System.out.print("Digite a quantidade em estoque do produto: ");
		estoque.setQuantidade(sc.nextInt());
		sc.nextLine();

		System.out.print("Digite o nome do produto: ");
		estoque.setNomeProduto(sc.nextLine());

		System.out.print("Digite a quantidade para adicionar o produto: ");
		estoque.adcionarEstoque(sc.nextInt());

		estoque.getProduto();

	}

}
