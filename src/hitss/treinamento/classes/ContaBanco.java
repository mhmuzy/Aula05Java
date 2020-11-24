package hitss.treinamento.classes;

public class ContaBanco {
	/// *** Declara��o da Classe Conta do Banco
	// Atributos
	public int numConta;
	/// *** Atributo N�mero da Conta
	protected String tipo;
	/// *** Atributo Tipo da Conta
	private String dono;
	/// *** Atributo Dono da Conta
	private float saldo;
	/// *** Atributo Saldo da Conta
	private boolean  status;
	/// *** Atributo Status da Conta
	
	//M�todos Especiais
	/// *** M�todo Construtor Conta do Banco
	public ContaBanco() {
		this.saldo = 0;
		/// *** O Atributo Saldo Recebe 0
		 this.status = false;
		 /// *** O Atributo Status recebe False
	}

	public int getNumConta() {
		/// *** M�todo N�mero da Conta
		return numConta;
		/// *** Retorna o N�mero da Conta
	}

	public void setNumConta(int numConta) {
		/// *** M�todo N�mero da Conta
		this.numConta = numConta;
		/// *** N�mero da Conta Recebe o Par�metro N�mero da Conta
	}

	public String getTipo() {
		/// *** M�todo Tipo da Conta
		return tipo;
		/// *** Retorna o Tipo da Conta
	}

	public void setTipo(String tipo) {
		/// *** M�todo Tipo da Conta
		this.tipo = tipo;
		/// *** Atributo Tipo da Conta Recebe o Par�metro Tipo da Conta
	}

	public String getDono() {
		/// *** M�todo Dono da Conta
		return dono;
		/// *** Retorna o Dono da Conta
	}

	public void setDono(String dono) {
		/// *** M�todo Dono da Conta
		this.dono = dono;
		/// *** Atributo Dono da Conta Recebe o Par�metro Dono da Conta
	}

	public float getSaldo() {
		/// *** M�todo Saldo da Conta
		return saldo;
		/// *** Retorna o Saldo da Conta
	}

	public void setSaldo(float saldo) {
		/// *** Atributo Saldo da Conta
		this.saldo = saldo;
		/// *** Atributo Saldo da Conta recebe o par�metro Saldo da Conta
	}

	public boolean getStatus() {
		/// *** M�todo Status da Conta
		return status;
		/// *** Retorna o Status da Conta
	}

	public void setStatus(boolean status) {
		/// *** M�todo Status da Conta
		this.status = status;
		/// *** Atributo Status da Conta recebe o par�metro Status da Conta
	}
	
	
}
