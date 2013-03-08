
public class Pessoa {
	private String nome;
	private String endereco;
	private String cpf;
	private String naturalidade;
	private int idade;
	
	public Pessoa(String nome, String endereco, String cpf, String naturalidade, int idade){
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.naturalidade = naturalidade;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
