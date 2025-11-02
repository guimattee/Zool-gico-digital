package br.edu.atitus.guilherme_matte_embarach.zoo_digital.animais;

import br.edu.atitus.guilherme_matte_embarach.zoo_digital.comportamentos.Nadador;

public class Golfinho extends Mamifero implements Nadador{

    public Golfinho(String nome, int idade) {
        super(nome, idade, false);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() +  " está assoviando");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo peixinhos");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando no mar");
    }

    
    
    
}
