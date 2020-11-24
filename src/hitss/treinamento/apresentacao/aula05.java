package hitss.treinamento.apresentacao;

import hitss.treinamento.classes.ContaBanco; /// *** Import
import hitss.treinamento.repositorio.ContaBancoRepositorio; /// *** Import

public class aula05 {
	
	public static void main(String[] args) {
		/// *** Classe Pessoa 1
		ContaBanco p1 = new ContaBanco();
		/// *** Inst�ncia da Classe Conta da Pessoa 1
		p1.setNumConta(1111);
		/// *** Atributo N�mero da Conta Recebe: 1111
		p1.setDono("Jubileu");
		/// *** Atributo Dono da Conta Recebe: Jubileu
		
		/// *** Classe Pessoa 2
		ContaBanco p2 = new ContaBanco();
		/// *** Inst�ncia da Classe Conda da Pessoa 2
		p2.setNumConta(2222);
		/// *** Atributo N�mero da Conta Recebe: 2222
		p2.setDono("Creuza");
		/// *** Atributo Dono da Conta Recebe: Creuza
		
		/// *** Reposit�rio Pessoa 1
		ContaBancoRepositorio pr1 = new ContaBancoRepositorio();
		/// *** Inst�ncia do Reposit�rio para a Conta da Pessoa 1
		pr1.abrirConta("CC", p1);
		/// *** M�todo para abrir a conta da Pessoa 1 para Conta Corrente
		pr1.depositar(p1, 300);
		/// *** Efetuar Dep�sito de 300 reais para a conta da Pessoa 1 
		pr1.sacar(p1, 350);
		/// *** Efetuar o Saque de 350 reais para a conta da Pessoa 1
		pr1.fecharConta(p1);
		/// *** Fechar a Conta da Pessoa 1
		pr1.estadoAtual(p1);
		/// *** Verificar o Estado Atual da Conta da Pessoa 1
		
		/// *** Reposit�rio Pessoa 2
		ContaBancoRepositorio pr2 = new ContaBancoRepositorio();
		/// *** Instanciar o Reposit�rio para a Conta da Pessoa 2
		pr2.abrirConta("CP", p2);
		/// *** Abrir Conta para a Conta da Pessoa 2
		pr2.depositar(p2, 500);
		/// *** Efetuar o Dep�sito de 500 reais para a Conta da Pessoa 2
		pr2.sacar(p2, 100);
		/// *** Efetuar o Saque de 100 reais para a Conta da Pessoa 2
		pr2.estadoAtual(p2);
		/// *** Informar o Estado Atual da Conta da Pessoa 2
	}
}
