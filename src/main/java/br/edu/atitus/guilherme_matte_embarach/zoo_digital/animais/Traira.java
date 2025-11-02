package br.edu.atitus.guilherme_matte_embarach.zoo_digital.animais;

import br.edu.atitus.guilherme_matte_embarach.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.guilherme_matte_embarach.zoo_digital.comportamentos.Predador;

public class Traira extends Peixe implements Nadador, Predador {
	
	public Traira(String nome, int idade) {
		super(nome, idade, "Água doce");
	}
	
    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando atrás de peixes");
    }
    
    @Override    
    public void cacar() {
        System.out.println(getNome() + " está cacando atrás de peixes");
    }
    
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está borbulhando");
    }
    
    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo peixes");
    }
    
}
