package Faculdade;

public class Pessoa {
	private String nome;
	private String endereco;
	private String cpf;
	private int idade;
	
	public Pessoa(String nome, String endereco, String cpf, int idade){
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.idade = idade;
	}
   
	public String toString(){
        String dados = "Nome: " + nome + "\n";
        dados += "Idade: " + idade + "\n";
        dados += "CPF: " + cpf + "\n";
        return dados;
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
