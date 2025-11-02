package br.edu.atitus.guilherme_matte_embarach.zoo_digital.animais;

import br.edu.atitus.guilherme_matte_embarach.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.guilherme_matte_embarach.zoo_digital.comportamentos.Predador;

public class Gato extends Mamifero implements Corredor, Predador {
private String raca;

    public Gato(String nome, int idade, String raca) {    
        super(nome, idade, true); 
        this.raca = raca;
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo");
    }
    
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está miando.");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo atum.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando um rato.");
    }
    
    public String getRaca() {
        return raca;
    }
}
