package br.edu.atitus.guilherme_matte_embarach.zoo_digital.animais;

import br.edu.atitus.guilherme_matte_embarach.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.guilherme_matte_embarach.zoo_digital.comportamentos.Predador;
import br.edu.atitus.guilherme_matte_embarach.zoo_digital.comportamentos.Corredor;

public class Jacare extends Reptil implements Predador, Nadador, Corredor {
	public Jacare(String nome, int idade) {
		super(nome, idade);
	}
	
    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando atrás de presas");
    }
    
    @Override
    public void correr() {
        System.out.println(getNome() + " está correndos atrás de humanos");
    }
    
    @Override
    public void cacar() {
        System.out.println(getNome() + " está calculando sua caça");
    }
    
    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo sua caça");
    }
    
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está grunhindo");
    }
}
