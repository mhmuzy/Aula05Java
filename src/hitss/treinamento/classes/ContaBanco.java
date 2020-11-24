package hitss.treinamento.classes;

public class ContaBanco {
	/// *** Declaração da Classe Conta do Banco
	// Atributos
	public int numConta;
	/// *** Atributo Número da Conta
	protected String tipo;
	/// *** Atributo Tipo da Conta
	private String dono;
	/// *** Atributo Dono da Conta
	private float saldo;
	/// *** Atributo Saldo da Conta
	private boolean  status;
	/// *** Atributo Status da Conta
	
	//Métodos Especiais
	/// *** Método Construtor Conta do Banco
	public ContaBanco() {
		this.saldo = 0;
		/// *** O Atributo Saldo Recebe 0
		 this.status = false;
		 /// *** O Atributo Status recebe False
	}

	public int getNumConta() {
		/// *** Método Número da Conta
		return numConta;
		/// *** Retorna o Número da Conta
	}

	public void setNumConta(int numConta) {
		/// *** Método Número da Conta
		this.numConta = numConta;
		/// *** Número da Conta Recebe o Parâmetro Número da Conta
	}

	public String getTipo() {
		/// *** Método Tipo da Conta
		return tipo;
		/// *** Retorna o Tipo da Conta
	}

	public void setTipo(String tipo) {
		/// *** Método Tipo da Conta
		this.tipo = tipo;
		/// *** Atributo Tipo da Conta Recebe o Parâmetro Tipo da Conta
	}

	public String getDono() {
		/// *** Método Dono da Conta
		return dono;
		/// *** Retorna o Dono da Conta
	}

	public void setDono(String dono) {
		/// *** Método Dono da Conta
		this.dono = dono;
		/// *** Atributo Dono da Conta Recebe o Parâmetro Dono da Conta
	}

	public float getSaldo() {
		/// *** Método Saldo da Conta
		return saldo;
		/// *** Retorna o Saldo da Conta
	}

	public void setSaldo(float saldo) {
		/// *** Atributo Saldo da Conta
		this.saldo = saldo;
		/// *** Atributo Saldo da Conta recebe o parâmetro Saldo da Conta
	}

	public boolean getStatus() {
		/// *** Método Status da Conta
		return status;
		/// *** Retorna o Status da Conta
	}

	public void setStatus(boolean status) {
		/// *** Método Status da Conta
		this.status = status;
		/// *** Atributo Status da Conta recebe o parâmetro Status da Conta
	}
	
	
}
