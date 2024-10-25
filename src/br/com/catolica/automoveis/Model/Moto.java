package br.com.catolica.automoveis.Model;

import br.com.catolica.automoveis.Contract.ClassName;

public class Moto extends Automovel implements ClassName {
    private boolean motoLigar;

    public Moto(String marcaObj, String modeloObj, boolean motoLigar){
        super(marcaObj, modeloObj);
        this.motoLigar = motoLigar;
    }

    @Override
    public void acelerar(int velocidade) {
        if (motoLigar){
            System.out.printf("\nVocê acelerou: %d KM/h", velocidade);
        }else{
            System.out.println("\nLigue o motor primeiro, para acelerar");
        }

    }

    @Override
    public void frear() {
        if(motoLigar) {
            System.out.println("\nVocê freio");
        }else{
            System.out.println("\nLigue o motor primeiro, para freiar");
        }
    }
}
