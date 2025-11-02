package br.edu.atitus.guilherme_matte_embarach.zoo_digital.animais;

import br.edu.atitus.guilherme_matte_embarach.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.guilherme_matte_embarach.zoo_digital.comportamentos.Predador;

public class Tubarao extends Peixe implements Predador, Nadador {
	
	public Tubarao(String nome, int idade) {
		super(nome, idade, "Água salgada");
	}
	
    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo peixes");
    }
    
    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando em busca de comida");
    }
    
    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando peixes");
    }
    
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está tentando fazer barulho");
    }

}
