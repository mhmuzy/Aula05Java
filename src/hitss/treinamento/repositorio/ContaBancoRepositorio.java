package hitss.treinamento.repositorio;

import hitss.treinamento.classes.*;

public class ContaBancoRepositorio {

		//Métodos Personalizados
		public void estadoAtual(ContaBanco contaBanco) {
			System.out.println("------------------------------------------");
			System.out.println("Conta: " + contaBanco.getNumConta());
			System.out.println("Tipo: " + contaBanco.getTipo());
			System.out.println("Dono: " + contaBanco.getDono());
			System.out.println("Saldo: " + contaBanco.getSaldo());
			System.out.println("Status: " + contaBanco.getStatus());
			System.out.println("------------------------------------------");
		}
	
		public void abrirConta(String t, ContaBanco contaBanco) {
			contaBanco.setTipo(t);
			contaBanco.setStatus(true);

			if (t == "CC") {
				contaBanco.setSaldo(50);
			} else if (t == "CP"){
				contaBanco.setSaldo(150);
			}
			System.out.println("Conta aberta.");
		}
		public void fecharConta(ContaBanco contaBanco) {
			
			if (contaBanco.getSaldo() > 0) {
				System.out.println("Conta não pode ser fechada porque ainda tem dinheiro.");
			} else if (contaBanco.getSaldo() < 0) {
				System.out.println("Conta não pode ser fechada, pois tem debito.");
			} else {
				contaBanco.setStatus(false);
				System.out.println("Conta fechada com sucesso.");
			}
			
		}
		public void depositar(ContaBanco contaBanco, float v) {
			if (contaBanco.getStatus()) {
				contaBanco.setSaldo(contaBanco.getSaldo() + v);
				System.out.println("Depósito realizado na conta de: " + contaBanco.getDono());
			} else {
				System.out.println("Impossível depositar em uma conta fechada!");
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
				System.out.println("Impossível sacar de uma conta fechada.");
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
				System.out.println("Impossível pagar uma conta fechada.");
			}
		}
}
