package br.edu.atitus.guilherme_matte_embarach.zoo_digital.animais;

import br.edu.atitus.guilherme_matte_embarach.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.guilherme_matte_embarach.zoo_digital.comportamentos.Predador;

public class Salmao extends Peixe implements Nadador, Predador   {
	
	public Salmao(String nome, int idade) {
		super(nome, idade, "Água doce e salgada");
	}
	
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está cantando");
    }
    
    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando em alto mar");
    }
    
    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo vários peixes");
    }
    
    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando camarões");
    }
}
