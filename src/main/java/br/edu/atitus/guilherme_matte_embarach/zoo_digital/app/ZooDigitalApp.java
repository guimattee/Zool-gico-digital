package br.edu.atitus.guilherme_matte_embarach.zoo_digital.app;

import br.edu.atitus.guilherme_matte_embarach.zoo_digital.animais.*;
import br.edu.atitus.guilherme_matte_embarach.zoo_digital.comportamentos.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZooDigitalApp {

    private static List<Animal> animais = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            exibirMenu();
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    cadastrarAnimal();
                    break;
                case "2":
                    listarTodosAnimais();
                    break;
                case "3":
                    listarAnimaisCorredores();
                    break;
                case "4":
                    listarAnimaisNadadores();
                    break;
                case "5":
                    listarAnimaisVoadores();
                    break;
                case "6":
                    listarAnimaisPredadores();
                    break;
                case "7":
                    exibirTotalDeAnimais();
                    break;
                case "0":
                    System.out.println("Saindo do Zoo Digital... Até logo!");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("\n--- BEM-VINDO AO ZOOLÓGICO DIGITAL ---");
        System.out.println("1. Cadastrar Animal");
        System.out.println("2. Listar Todos Animais");
        System.out.println("3. Listar Animais Corredores");
        System.out.println("4. Listar Animais Nadadores");
        System.out.println("5. Listar Animais Voadores");
        System.out.println("6. Listar Animais Predadores");
        System.out.println("7. Exibir Total de Animais");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarAnimal() {
    	String nome;
    	Animal novoAnimal = null;
    	String corPenas;
    	String raca;
    	
        System.out.println("\n--- Cadastrar Animal ---");
        
        do {
        	System.out.print("Digite o nome: ");
        	nome = scanner.nextLine();
        	if (nome.trim().isEmpty()) {
        		System.out.print("\nO NOME NÃO PODE SER VAZIO\n\n");
        	}
        } while (nome.trim().isEmpty());
        
        System.out.print("Digite a idade: ");
        
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Qual animal deseja cadastrar?");
        System.out.println("1. Águia");
        System.out.println("2. Baleia");
        System.out.println("3. Cachorro");
        System.out.println("4. Camaleão");
        System.out.println("5. Cobra");
        System.out.println("6. Exocetideo");
        System.out.println("7. Gato");
        System.out.println("8. Golfinho");
        System.out.println("9. Jacaré");
        System.out.println("10. Lagarto");
        System.out.println("11. Pato");
        System.out.println("12. Peixe-Morcego");
        System.out.println("13. Pinguim");
        System.out.println("14. Quero-Quero");
        System.out.println("15. Salmão");
        System.out.println("16. Traíra");
        System.out.println("17. Tubarão");
        System.out.print("Escolha uma opção: ");
        
        String tipo = scanner.nextLine();

        switch (tipo) {
        case "1":
            System.out.print("Qual a cor das penas? ");
            corPenas = scanner.nextLine();
            novoAnimal = new Aguia(nome, idade, corPenas);
            break;
            
        case "2":
            novoAnimal = new Baleia(nome, idade, false);
            break;
            
        case "3":
            System.out.print("Qual a raça? ");
            raca = scanner.nextLine();
            novoAnimal = new Cachorro(nome, idade, raca);
            break;
            
        case "4":
            novoAnimal = new Camaleao(nome, idade);
            break;
            
        case "5":
            novoAnimal = new Cobra(nome, idade);
            break;
            
        case "6":
            novoAnimal = new Exocetideo(nome, idade);
            break;
            
        case "7":
            System.out.print("Qual a raça? ");
            raca = scanner.nextLine();
            novoAnimal = new Gato(nome, idade, raca);
            break;
            
        case "8":
            novoAnimal = new Jacare(nome, idade);
            break;
            
        case "9":
            novoAnimal = new Lagarto(nome, idade);
            break;
            
        case "10":
            System.out.print("Qual a cor das penas? ");
            corPenas = scanner.nextLine();
            novoAnimal = new Pato(nome, idade, corPenas);
            break;
            
        case "11":
            novoAnimal = new PeixeMorcego(nome, idade);
            break;
            
        case "12":
            novoAnimal = new Pinguim(nome, idade, "Preto e branco");
            break;
            
        case "13":
            System.out.print("Qual a cor das penas? ");
            corPenas = scanner.nextLine();
            novoAnimal = new QueroQuero(nome, idade, corPenas);
            break;
            
        case "14":
            novoAnimal = new Golfinho(nome, idade);
            break;
            
        case "15":
            novoAnimal = new Salmao(nome, idade);
            break;
            
        case "16":
            novoAnimal = new Traira(nome, idade);
            break;
            
        case "17":
            novoAnimal = new Tubarao(nome, idade);
            break;
            
        default:
            System.out.println("Tipo de animal inválido.");
            return;
    }

        animais.add(novoAnimal);
        System.out.println(novoAnimal.getNome() + " cadastrado com sucesso!");
    }

    private static void listarTodosAnimais() {
        System.out.println("\n--- Lista de Todos os Animais ---");
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
            return;
        }
        
        for (Animal animal : animais) {
            System.out.println("--------------------");
            System.out.println("Nome: " + animal.getNome());
            System.out.println("Idade: " + animal.getIdade());
            System.out.println("Espécie: " + animal.getEspecie());
            
            if (animal instanceof Ave) {
                Ave ave = (Ave) animal;
                System.out.println("Cor das Penas: " + ave.getCorPenas());
            } 
            else if (animal instanceof Peixe) {
                Peixe peixe = (Peixe) animal;
                System.out.println("Tipo de Água: " + peixe.getTipoAgua());
            }
            else if (animal instanceof Cachorro) {
                Cachorro c = (Cachorro) animal;
                System.out.println("Raça: " + c.getRaca());
            }
            else if (animal instanceof Gato) {
                Gato g = (Gato) animal;
                System.out.println("Raça: " + g.getRaca());
            }
            animal.emitirSom();
            animal.comer();
        }
}

    private static void listarAnimaisCorredores() {
        System.out.println("\n--- Animais Corredores ---");
        int count = 0;
        for (Animal animal : animais) {
            if (animal instanceof Corredor) {
                System.out.println("\nNome: " + animal.getNome());
                ((Corredor) animal).correr();
                count++;
            }
        }
        if (count == 0) System.out.println("Nenhum corredor encontrado.");
    }

    private static void listarAnimaisNadadores() {
        System.out.println("\n--- Animais Nadadores ---");
        int count = 0;
        for (Animal animal : animais) {
            if (animal instanceof Nadador) {
                System.out.println("\nNome: " + animal.getNome());
                ((Nadador) animal).nadar();
                count++;
            }
        }
        if (count == 0) System.out.println("Nenhum nadador encontrado.");
    }

    private static void listarAnimaisVoadores() {
        System.out.println("\n--- Animais Voadores ---");
        int count = 0;
        for (Animal animal : animais) {
            if (animal instanceof Voador) {
                System.out.println("\nNome: " + animal.getNome());
                ((Voador) animal).voar();
                count++;
            }
        }
        if (count == 0) System.out.println("Nenhum voador encontrado.");
    }

    private static void listarAnimaisPredadores() {
        System.out.println("\n--- Animais Predadores ---");
        int count = 0;
        for (Animal animal : animais) {
            if (animal instanceof Predador) {
                System.out.println("\nNome: " + animal.getNome());
                ((Predador) animal).cacar();
                count++;
            }
        }
        if (count == 0) System.out.println("Nenhum predador encontrado.");
    }

    private static void exibirTotalDeAnimais() {
        System.out.println("\n--- Total de Animais ---");
        System.out.println("O zoológico tem um total de " + Animal.getContador() + " animais.");
    }
}