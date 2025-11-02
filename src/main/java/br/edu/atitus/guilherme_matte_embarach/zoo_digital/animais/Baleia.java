package br.edu.atitus.guilherme_matte_embarach.zoo_digital.animais;

import br.edu.atitus.guilherme_matte_embarach.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.guilherme_matte_embarach.zoo_digital.comportamentos.Predador;

public class Baleia extends Mamifero implements Nadador, Predador {
	
	public Baleia(String nome, int idade, boolean temPelo) {
		super(nome, idade, temPelo);
	}
	
    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando");
    }
    
    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando krills");
    }
    
    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo krills");
    }
	
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está cantando");
    }
}
