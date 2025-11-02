package br.edu.atitus.guilherme_matte_embarach.zoo_digital.animais;

public class PeixeMorcego extends Peixe {

	public PeixeMorcego(String nome, int idade) {
		super(nome, idade, "Água doce");
	}
    
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está borbulhando");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo pesquenas algas");
    }
    
    
}
