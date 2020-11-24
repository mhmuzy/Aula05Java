package hitss.treinamento.apresentacao;

import hitss.treinamento.classes.ContaBanco;
import hitss.treinamento.repositorio.ContaBancoRepositorio;

public class aula05 {
	
	public static void main(String[] args) {
		/// *** Classe Pessoa 1
		ContaBanco p1 = new ContaBanco();
		p1.setNumConta(1111);
		p1.setDono("Jubileu");
		
		/// *** Classe Pessoa 2
		ContaBanco p2 = new ContaBanco();
		p2.setNumConta(2222);
		p2.setDono("Creuza");
		
		/// *** Repositório Pessoa 1
		ContaBancoRepositorio pr1 = new ContaBancoRepositorio();
		pr1.abrirConta("CC", p1);
		pr1.depositar(p1, 300);
		pr1.sacar(p1, 350);
		pr1.fecharConta(p1);
		pr1.estadoAtual(p1);
		
		/// *** Repositório Pessoa 2
		ContaBancoRepositorio pr2 = new ContaBancoRepositorio();
		pr2.abrirConta("CP", p2);
		pr2.depositar(p2, 500);
		pr2.sacar(p2, 100);
		pr2.estadoAtual(p2);
		
	}
}
