package br.edu.atitus.guilherme_matte_embarach.zoo_digital.animais;

import br.edu.atitus.guilherme_matte_embarach.zoo_digital.comportamentos.Predador;
import br.edu.atitus.guilherme_matte_embarach.zoo_digital.comportamentos.Voador;

public class QueroQuero extends Ave implements Predador, Voador {
	
	public QueroQuero(String nome, int idade, String corPenas) {
		super(nome, idade, "Cinza, preto e branco");
	}
	
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está cantando");
    }
    
    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando minhocas");
    }
    
    @Override
    public void voar() {
        System.out.println(getNome() + " está voando para cuidar do ninho");
    }
    
    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo sua caça");
    }

}
