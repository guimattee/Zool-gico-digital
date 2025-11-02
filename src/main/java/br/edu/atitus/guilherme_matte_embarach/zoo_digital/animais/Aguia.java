package br.edu.atitus.guilherme_matte_embarach.zoo_digital.animais;

import br.edu.atitus.guilherme_matte_embarach.zoo_digital.comportamentos.Voador;
import br.edu.atitus.guilherme_matte_embarach.zoo_digital.comportamentos.Predador;

public class Aguia extends Ave implements Voador, Predador {
	
	public Aguia(String nome, int idade, String corPenas) {
		super(nome, idade, "Marrom e branco");
	}
	
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está chilreando");
    }
    
    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando");
    }
	
    @Override
    public void voar() {
        System.out.println(getNome() + " está voando pelos ares");
    }
    
    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo");
    }
}
