
public class Funcionario extends Pessoa{
	private String setor;
	
	public Funcionario(String nome, String endereco, String cpf, int idade, String setor){
		super(nome, endereco, cpf, idade);
		this.setor = setor;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
}
