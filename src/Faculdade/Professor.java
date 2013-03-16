package Faculdade;

public class Professor extends Pessoa {
	private String departamento;
	
	public Professor(String nome, String endereco, String cpf, int idade, String departamento){
		super(nome, endereco, cpf, idade);
		this.departamento = departamento;
	}

    public String toString()
    {
        String dados = super.toString();
        dados += "Departamento: " + departamento + "\n";
        return dados;
    }	
	
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
}
