package Faculdade;

import java.util.ArrayList;

import Keyboard.*;
import Menu.*;

public class Faculdade {

	public static int controleMatricula = 0;
	
	public static void main(String[] args) {
        ArrayList<Estudante> estudante = new ArrayList<Estudante>();
        ArrayList<Professor> professor = new ArrayList<Professor>();
        ArrayList<Funcionario> funcionario = new ArrayList<Funcionario>();
        

        Faculdade faculdade = new Faculdade();
        
        for(;;){
        	int opcao = Menu.Principal();
        	if(opcao == 5){
        		break;
        	}
        	switch(opcao){
        		case 1:
        			opcao = Menu.Estudante();
        			switch(opcao){
        				case 1:
                            estudante.add(Menu.cadastraEstudante(faculdade, controleMatricula++));
                            break;
        				case 2:
        					System.out.println("Digite o nome do Estudante \n");
        					String nome = Keyboard.readString();
        					boolean achou = false;
        					
        					for(int i = 0; i < estudante.size(); i++){
        						if(estudante.get(i).getNome().equals(nome)){
        							System.out.println(estudante.get(i).toString());
        							achou = true;
        						}
        					}
        					if(!achou){
        						System.out.println("Estudante nao encontrado \n");
        					}
        					break;
        				case 3:
        					int aux = estudante.size();
        					if(aux > 0){
	        					for(int i = 0; i < aux; i++){
	        						System.out.println(estudante.get(i).getNome());
	        					}
        					}else{
        						System.out.println("Nao tem alunos \n");
        					}
        					break;
        				case 4:
        					int aux2 = estudante.size();
        					if(aux2 > 0){
	        					System.out.println("Digite o nome do Estudante \n");
	        					String nome2 = Keyboard.readString();
	        					boolean achou2 = false;
	        					for(int i = 0; i < aux2; i++){
	        						if(estudante.get(i).getNome().equals(nome2)){
	        							estudante.remove(i);
	        							System.out.println("Estudante removido! \n");
	        							achou2 = true;
	        						}
	        					}
	        					if(!achou2)
	        						System.out.println("");
        					}else{
        						System.out.println("Nao ha estudantes cadastrados \n");
        					}	
        					break;
        				case 5:
        					break;
        			}
           		case 2:
        			opcao = Menu.Professor();
        			switch(opcao){
        				case 1:
                            professor.add(Menu.cadastraProfessor());
                            break;
        				case 2:
        					System.out.println("Digite o nome do Professor \n");
        					String nome = Keyboard.readString();
        					boolean achou = false;
        					
        					for(int i = 0; i < professor.size(); i++){
        						if(professor.get(i).getNome().equals(nome)){
        							System.out.println(professor.get(i).toString());
        							achou = true;
        						}
        					}
        					if(!achou){
        						System.out.println("Professor nao encontrado \n");
        					}
        					break;
        				case 3:
        					int aux = professor.size();
        					if(aux > 0){
	        					for(int i = 0; i < aux; i++){
	        						System.out.println(professor.get(i).getNome());
	        					}
        					}else{
        						System.out.println("Nao tem professores \n");
        					}
        					break;
        				case 4:
        					int aux2 = professor.size();
        					if(aux2 > 0){
	        					System.out.println("Digite o nome do Professor \n");
	        					String nome2 = Keyboard.readString();
	        					boolean achou2 = false;
	        					for(int i = 0; i < aux2; i++){
	        						if(professor.get(i).getNome().equals(nome2)){
	        							professor.remove(i);
	        							System.out.println("Professor removido! \n");
	        							achou2 = true;
	        						}
	        					}
	        					if(!achou2)
	        						System.out.println("");
        					}else{
        						System.out.println("Nao ha professores cadastrados \n");
        					}	
        					break;
        				case 5:
        					break;
        			}
           		case 3:
        			opcao = Menu.Funcionario();
        			switch(opcao){
        				case 1:
                            funcionario.add(Menu.cadastraFuncionario());
                            break;
        				case 2:
        					System.out.println("Digite o nome do Funcionario \n");
        					String nome = Keyboard.readString();
        					boolean achou = false;
        					
        					for(int i = 0; i < funcionario.size(); i++){
        						if(funcionario.get(i).getNome().equals(nome)){
        							System.out.println(funcionario.get(i).toString());
        							achou = true;
        						}
        					}
        					if(!achou){
        						System.out.println("Funcionario nao encontrado \n");
        					}
        					break;
        				case 3:
        					int aux = funcionario.size();
        					if(aux > 0){
	        					for(int i = 0; i < aux; i++){
	        						System.out.println(funcionario.get(i).getNome());
	        					}
        					}else{
        						System.out.println("Nao tem Funcionarios \n");
        					}
        					break;
        				case 4:
        					int aux2 = funcionario.size();
        					if(aux2 > 0){
	        					System.out.println("Digite o nome do Funcionario \n");
	        					String nome2 = Keyboard.readString();
	        					boolean achou2 = false;
	        					for(int i = 0; i < aux2; i++){
	        						if(funcionario.get(i).getNome().equals(nome2)){
	        							funcionario.remove(i);
	        							System.out.println("Funcionario removido! \n");
	        							achou2 = true;
	        						}
	        					}
	        					if(!achou2)
	        						System.out.println("");
        					}else{
        						System.out.println("Nao ha Funcionarios cadastrados \n");
        					}	
        					break;
        				case 5:
        					break;
        			}        			
        	}
        }
	}

}
