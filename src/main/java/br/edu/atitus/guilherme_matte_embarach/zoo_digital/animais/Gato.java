package br.edu.atitus.guilherme_matte_embarach.zoo_digital.animais;

import br.edu.atitus.guilherme_matte_embarach.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.guilherme_matte_embarach.zoo_digital.comportamentos.Predador;

public class Gato extends Mamifero implements  Corredor, Predador{
	
	public Gato(String nome, int idade, boolean temPelo) {
		super(nome, idade, temPelo);
	}
	
    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo");
    }
	
    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando ratos");
    }
    
    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo sua caça");
    }
	
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está miando");
    }
}
