package SistemaCadastro;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ProdutoCadastro cadastro = new ProdutoCadastro();
		Scanner scanner = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("\nSistema de Cadastro de Produtos");
			System.out.println("1. Adicionar Produto");
			System.out.println("2. Listar Produtos");
			System.out.println("3. Atualizar Produto");
			System.out.println("4. Remover Produto");
			System.out.println("5. Sair");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine(); // Consumir nova linha

			switch (opcao) {
			case 1:
				System.out.print("Nome do produto: ");
				String nome = scanner.nextLine();
				System.out.print("Preço do produto: ");
				double preco = scanner.nextDouble();
				System.out.print("Quantidade do produto: ");
				int quantidade = scanner.nextInt();
				Produto produto = new Produto(nome, preco, quantidade);
				cadastro.adicionarProduto(produto);
				break;
			case 2:
				cadastro.listarProdutos();
				break;
			case 3:
				System.out.print("Nome do produto a ser atualizado: ");
				String nomeParaAtualizar = scanner.nextLine();
				cadastro.atualizarProduto(nomeParaAtualizar);
				break;
			case 4:
				System.out.print("Nome do produto a ser removido: ");
				String nomeParaRemover = scanner.nextLine();
				cadastro.removerProduto(nomeParaRemover);
				break;
			case 5:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção inválida! Tente novamente.");
			}
		} while (opcao != 5);

		scanner.close();
	}
}
