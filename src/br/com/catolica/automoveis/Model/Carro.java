package br.com.catolica.automoveis.Model;

import br.com.catolica.automoveis.Contract.ClassName;

public class Carro extends Automovel implements ClassName {
    private int quantidadeDePortas;

    public Carro(String marcaObj, String modeloObj, int quantidadeDePortas){
        super(marcaObj,modeloObj);
        this.quantidadeDePortas = quantidadeDePortas;
    }


    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }


    @Override
    public void acelerar(int velocidade) {
        if (estaLigado){
            System.out.printf("Você acelerou: %d KM/h\n", velocidade);
        }else{
            System.out.println("Ligue o motor primeiro, para acelerar");
        }

    }

    @Override
    public void frear() {
        if(estaLigado) {
            System.out.println("Você freio");
        }else{
            System.out.println("Ligue o motor primeiro para freiar");
        }
    }
}
