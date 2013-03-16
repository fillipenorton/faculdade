package Faculdade;


public class Estudante extends Pessoa {
	private int matricula;
	private float mensalidade;
	
	public Estudante(String nome, String endereco, String cpf, int idade, int matricula){
		super(nome, endereco, cpf, idade);
		this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public float getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}

    public String toString()
    {
        String dados = super.toString();
        dados += "Matricula: " + matricula + "\n";
        return dados;
    }
	
}
