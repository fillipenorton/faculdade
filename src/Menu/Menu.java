package Menu;

import Keyboard.*;
import Faculdade.*;
import java.util.ArrayList;

public class Menu {
    public static int Principal() {
        System.out.println("1. Estudante");
        System.out.println("2. Professor");
        System.out.println("3. Funcionario");

        System.out.println("5. Sair");
        return Keyboard.readInt();
    }

    public static int Estudante() {
        System.out.println("1. Adicionar estudante");
        System.out.println("2. Consultar");
        System.out.println("3. Listar");
        System.out.println("4. Remover");
        System.out.println("5. Menu anterior");

        return Keyboard.readInt();
    }

    public static Estudante cadastraEstudante(Faculdade faculdade, int controleMatricula) {
        Estudante estudante;
    	
        System.out.println("Digite o nome do Aluno");
        String nome = Keyboard.readString();
        System.out.println("Digite o endereco");
        String endereco = Keyboard.readString();
        System.out.println("Digite CPF");
        String cpf = Keyboard.readString();
        System.out.println("Digite idade");
        int idade = Keyboard.readInt();
        int matricula = controleMatricula;        
        
        estudante = new Estudante(nome, endereco, cpf, idade, matricula);
        return estudante;
    }
    
    public static int Professor() {
        System.out.println("1. Adicionar professor");
        System.out.println("2. Consultar");
        System.out.println("3. Listar");
        System.out.println("4. Remover");
        System.out.println("5. Menu anterior");

        return Keyboard.readInt();
    }    
    
    public static Professor cadastraProfessor() {
        Professor professor;
    	
        System.out.println("Digite o nome do Professor");
        String nome = Keyboard.readString();
        System.out.println("Digite o endereco");
        String endereco = Keyboard.readString();
        System.out.println("Digite CPF");
        String cpf = Keyboard.readString();
        System.out.println("Digite idade");
        int idade = Keyboard.readInt();
        System.out.println("Digite Departamento");
        String departamento = Keyboard.readString();
       
        
        professor = new Professor(nome, endereco, cpf, idade, departamento);
        return professor;
    }
    public static int Funcionario() {
        System.out.println("1. Adicionar funcionario");
        System.out.println("2. Consultar");
        System.out.println("3. Listar");
        System.out.println("4. Remover");
        System.out.println("5. Menu anterior");

        return Keyboard.readInt();
    }    
    
    public static Funcionario cadastraFuncionario() {
        Funcionario funcionario;
    	
        System.out.println("Digite o nome do Funcionario");
        String nome = Keyboard.readString();
        System.out.println("Digite o endereco");
        String endereco = Keyboard.readString();
        System.out.println("Digite CPF");
        String cpf = Keyboard.readString();
        System.out.println("Digite idade");
        int idade = Keyboard.readInt();
        System.out.println("Digite Setor");
        String setor = Keyboard.readString();
       
        
        funcionario = new Funcionario(nome, endereco, cpf, idade, setor);
        return funcionario;
    }
    
}
