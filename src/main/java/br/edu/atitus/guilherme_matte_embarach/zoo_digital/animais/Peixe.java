package br.edu.atitus.guilherme_matte_embarach.zoo_digital.animais;

public abstract class Peixe extends Animal {
    private String tipoAgua; 

    public Peixe(String nome, int idade, String tipoAgua) {
        super(nome, idade, "Peixe"); 
        this.tipoAgua = tipoAgua;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    } 
}
