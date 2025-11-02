package br.edu.atitus.guilherme_matte_embarach.zoo_digital.animais;

import br.edu.atitus.guilherme_matte_embarach.zoo_digital.comportamentos.Predador;

public class Camaleao extends Reptil implements Predador  {
	Camaleao(String nome, int idade){
		super(nome, idade);
	}
	
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está emitindo cores e sibilando");
    }
	
    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando formigas");
    }
    
    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo suas formigas");
    }
}
