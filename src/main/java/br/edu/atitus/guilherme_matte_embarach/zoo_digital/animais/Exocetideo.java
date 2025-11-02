package br.edu.atitus.guilherme_matte_embarach.zoo_digital.animais;

import br.edu.atitus.guilherme_matte_embarach.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.guilherme_matte_embarach.zoo_digital.comportamentos.Voador;

public class Exocetideo extends Peixe implements Voador, Nadador {
	public Exocetideo(String nome, int idade, String tipoAgua) {
		super(nome, idade, "Água salgada");
	}
	
    @Override
    public void voar() {
        System.out.println(getNome() + " está voando dos predadores");
    }
    
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está cantando");
    }
    
    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo plânctons");
    }
    
    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando (por enquando sem voo)");
    }
}
