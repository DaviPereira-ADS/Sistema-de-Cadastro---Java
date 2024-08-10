package SistemaCadastro;

import java.util.ArrayList;
import java.util.Scanner;

public class ProdutoCadastro {
	private ArrayList<Produto> produtos;

	public ProdutoCadastro() {
		produtos = new ArrayList<>();
	}

	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
		System.out.println("Produto adicionado com sucesso!");
	}

	public void listarProdutos() {
		if (produtos.isEmpty()) {
			System.out.println("Nenhum produto cadastrado.");
		} else {
			for (Produto produto : produtos) {
				System.out.println(produto);
			}
		}
	}

	public void atualizarProduto(String nome) {
		for (Produto produto : produtos) {
			if (produto.getNome().equalsIgnoreCase(nome)) {
				Scanner sc = new Scanner(System.in);
				System.out.print("Novo nome: ");
				produto.setNome(sc.nextLine());
				System.out.print("Novo preço: ");
				produto.setPreco(sc.nextDouble());
				System.out.print("Nova quantidade: ");
				produto.setQuantidade(sc.nextInt());
				System.out.println("Produto atualizado com sucesso!");
				return;
			}
		}
		System.out.println("Produto não encontrado.");
	}

	public void removerProduto(String nome) {
		for (Produto produto : produtos) {
			if (produto.getNome().equalsIgnoreCase(nome)) {
				produtos.remove(produto);
				System.out.println("Produto removido com sucesso!");
				return;
			}
		}
		System.out.println("Produto não encontrado.");
	}
}
