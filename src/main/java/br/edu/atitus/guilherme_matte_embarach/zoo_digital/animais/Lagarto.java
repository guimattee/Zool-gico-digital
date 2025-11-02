package br.edu.atitus.guilherme_matte_embarach.zoo_digital.animais;

import br.edu.atitus.guilherme_matte_embarach.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.guilherme_matte_embarach.zoo_digital.comportamentos.Predador;

public class Lagarto extends Reptil implements Corredor, Predador {
	public Lagarto(String nome, int idade){
		super(nome, idade);
	}

	
    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo atrás dos humanos");
    }
    
    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando cobras");
    }
    
    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo cobras");
    }
    
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está sibilando");
    }
}
