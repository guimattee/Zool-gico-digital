package br.edu.atitus.guilherme_matte_embarach.zoo_digital.app;

import br.edu.atitus.guilherme_matte_embarach.zoo_digital.animais.*;
import br.edu.atitus.guilherme_matte_embarach.zoo_digital.comportamentos.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZooDigitalApp {

    private static List<Animal> animais = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            System.out.println("\n========= Menu Zoo Digital =========");
            System.out.println("1. Cadastrar Animal");
            System.out.println("2. Listar Todos Animais (Polimorfismo)");
            System.out.println("3. Listar Animais Corredores (instanceof)");
            System.out.println("4. Listar Animais Nadadores (instanceof)");
            System.out.println("5. Listar Animais Voadores (instanceof)");
            System.out.println("6. Listar Animais Predadores (instanceof)");
            System.out.println("7. Exibir Total de Animais (static)");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarAnimal(scanner);
                    break;
                case 2:
                    listarTodos();
                    break;
                case 3:
                    listarCorredores();
                    break;
                case 4:
                    listarNadadores();
                    break;
                case 5:
                    listarVoadores();
                    break;
                case 6:
                    listarPredadores();
                    break;
                case 7:
                    System.out.println("Total de animais cadastrados: " + Animal.getContador());
                    break;
                case 0:
                    executando = false;
                    System.out.println("Obrigado por visitar o Zoo Digital!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }

    private static void cadastrarAnimal(Scanner scanner) {
        System.out.println("Qual tipo de animal deseja cadastrar? (Ex: Leao, Cachorro, Pinguim, Crocodilo, Tubarao...)");
        String tipo = scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Espécie: ");
        String especie = scanner.nextLine();

        Animal novoAnimal = null;

        if (tipo.equalsIgnoreCase("Cachorro")) {
            novoAnimal = new Cachorro(nome, idade, especie);
        } else if (tipo.equalsIgnoreCase("Leao")) {
            novoAnimal = new Leao(nome, idade, especie);
        } else if (tipo.equalsIgnoreCase("Pinguim")) {
            novoAnimal = new Pinguim(nome, idade, especie);
        } else if (tipo.equalsIgnoreCase("Crocodilo")) {
            novoAnimal = new Crocodilo(nome, idade, especie);
        
        else {
            System.out.println("Tipo de animal não reconhecido.");
            return;
        }

        animais.add(novoAnimal);
        System.out.println(tipo + " " + nome + " cadastrado com sucesso!");
    }

    private static void listarTodos() {
        System.out.println("\n--- Lista de Todos os Animais ---");
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
            return;
        }
        for (Animal animal : animais) {
            System.out.println("--------------------------------");
            System.out.println("Nome: " + animal.getNome() + ", Idade: " + animal.getIdade() + ", Espécie: " + animal.getEspecie());
            
            animal.emitirSom();
            animal.comer();
        }
    }

    private static void listarCorredores() {
        System.out.println("\n--- Animais Corredores ---");
        for (Animal animal : animais) {
            if (animal instanceof Corredor) {
                // 2. Downcasting seguro
                Corredor corredor = (Corredor) animal;
                
                System.out.println("--------------------------------");
                System.out.println("Nome: " + animal.getNome());
                corredor.correr();
            }
        }
    }

    private static void listarNadadores() {
        System.out.println("\n--- Animais Nadadores ---");
        for (Animal animal : animais) {
            if (animal instanceof Nadador) {
                System.out.println("--------------------------------");
                System.out.println("Nome: " + animal.getNome());
                ((Nadador) animal).nadar();
            }
        }
    }

    private static void listarVoadores() {
        System.out.println("\n--- Animais Voadores ---");
        for (Animal animal : animais) {
            if (animal instanceof Voador) {
                System.out.println("--------------------------------");
                System.out.println("Nome: " + animal.getNome());
                ((Voador) animal).voar();
            }
        }
    }

    private static void listarPredadores() {
        System.out.println("\n--- Animais Predadores ---");
        for (Animal animal : animais) {
            if (animal instanceof Predador) {
                System.out.println("--------------------------------");
                System.out.println("Nome: " + animal.getNome());
                ((Predador) animal).cacar();
            }
        }
    }
}