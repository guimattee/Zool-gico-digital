package br.edu.atitus.guilherme_matte_embarach.zoo_digital.animais;

import br.edu.atitus.guilherme_matte_embarach.zoo_digital.comportamentos.Nadador;

public class Pinguim extends Ave implements Nadador {

    public Pinguim(String nome, int idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está grasnando");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo peixes");
    }
    

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando atrás de peixes");
    }
    
    public void cacar() {
    	System.out.println(getNome() + " está caçando peixes");
    }
}
