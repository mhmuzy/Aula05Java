package hitss.treinamento.repositorio;

import hitss.treinamento.classes.*; /// *** Import

public class ContaBancoRepositorio {
	/// *** Classe Reposit�rio da Conta do Banco
		//M�todos Personalizados
		public void estadoAtual(ContaBanco contaBanco) {
			/// *** M�todo Estado Atual
			System.out.println("------------------------------------------");
			/// *** Conceito de Perfumaria
			System.out.println("Conta: " + contaBanco.getNumConta());
			/// *** Atributo N�mero da Conta
			System.out.println("Tipo: " + contaBanco.getTipo());
			/// *** Atributo Tipo da Conta
			System.out.println("Dono: " + contaBanco.getDono());
			/// *** Atributp Dono da Conta
			System.out.println("Saldo: " + contaBanco.getSaldo());
			/// *** Atributo Saldo da Conta
			System.out.println("Status: " + contaBanco.getStatus());
			/// *** Atrributo Status da Conta
			System.out.println("------------------------------------------");
			/// *** Conceito de Perfumaria
		}
	
		public void abrirConta(String t, ContaBanco contaBanco) {
			/// *** M�todo Abrir a Conta
			contaBanco.setTipo(t);
			/// *** Atribuir o Tipo da Conta se � Conta Poupan�a ou Conta Corrente
			contaBanco.setStatus(true);
			/// *** O Status da Conta Recebe Ativo, isto �, que a conta est� ativa
			if (t == "CC") {
				/// *** Se For Conta Corrente
				contaBanco.setSaldo(50);
				/// *** O Saldo da Conta Recebe 50 reais
			} else if (t == "CP"){
				/// *** Se a Conta For Conta Poupan�a
				contaBanco.setSaldo(150);
				/// *** O Saldo da Conta Recebe 150 reais
			}
			System.out.println("Conta aberta com sucesso.");
			/// *** Imprima Conta Aberta com sucesso
		}
		public void fecharConta(ContaBanco contaBanco) {
			/// *** M�todo Fechar Conta
			if (contaBanco.getSaldo() > 0) {
				/// *** Se o Saldo da Conta For Positivo
				System.out.println("Conta n�o pode ser fechada porque ainda tem dinheiro.");
				/// *** O programa informa que a conta n�o pode ser fechada porque ainda tem dinheiro
			} else if (contaBanco.getSaldo() < 0) {
				/// *** Se a conta for negativa
				System.out.println("Conta n�o pode ser fechada, pois tem debito.");
				/// *** O programa informa que a conta n�o pode ser fechada, pois tem debito
			} else {
				/// *** Se a conta n�o estiver positiva e nem negativa, estiver no neutro
				contaBanco.setStatus(false);
				/// *** A Conta � inativada
				System.out.println("Conta fechada com sucesso.");
				/// *** O Programa informa que a conta foi fechada com sucesso
			}
			
		}
		public void depositar(ContaBanco contaBanco, float v) {
			/// *** M�todo Depositar
			if (contaBanco.getStatus()) {
				/// *** Se a Conta estiver ativa
				contaBanco.setSaldo(contaBanco.getSaldo() + v);
				/// *** Vai sre feito o dep�sito
				System.out.println("Dep�sito realizado na conta de: " + contaBanco.getDono());
				/// *** O programa informa que o dep�sito foi realizado na conta de e informa o dono da conta
			} else {
				System.out.println("Imposs�vel depositar em uma conta fechada!");
			}
		}
		public void sacar(ContaBanco contaBanco, float v) {
			if (contaBanco.getStatus()) {
				if (contaBanco.getSaldo() >= v) {
					contaBanco.setSaldo(contaBanco.getSaldo() - v);
					System.out.println("Saque realizado na conta de " + contaBanco.getDono());
				} else {
					System.out.println("Saldp insuficiente para saque.");
				}
			} else {
				System.out.println("Imposs�vel sacar de uma conta fechada.");
			}
		}
		public void pagarMensal(ContaBanco contaBanco) {
			int v = 0;
			if (contaBanco.getTipo() == "CC") {
				v = 12;
			} else if (contaBanco.getTipo() == "CP") {
				v = 20;
			}
			if (contaBanco.getStatus()) {
				contaBanco.setSaldo(contaBanco.getSaldo() - v);
				System.out.println("Mensalidade paga com sucesso por " + contaBanco.getDono());
			} else {
				System.out.println("Imposs�vel pagar uma conta fechada.");
			}
		}
}
