package br.edu.atitus.guilherme_matte_embarach.zoo_digital.animais;

import br.edu.atitus.guilherme_matte_embarach.zoo_digital.comportamentos.Predador;

public class Cobra extends Reptil implements Predador {
	public Cobra(String nome, int idade){
		super(nome, idade);
	}
	
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está sibilando");
    }
    
    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando animais");
    }
    
    @Override
    public void comer() {
        System.out.println(getNome() + " está c");
    }

}
