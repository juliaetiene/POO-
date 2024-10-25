package br.com.catolica.automoveis.Main;

import br.com.catolica.automoveis.Model.Carro;
import br.com.catolica.automoveis.Model.Moto;

public class Main {
    public static void main(String[] args){
        Moto novoMotoObj = new Moto("BMW", "BMW R", true);
        Carro novoCarroObj = new Carro ("BMW", "BMW R",4 );


        novoCarroObj.acelerar(100);
        novoCarroObj.frear();
        novoMotoObj.acelerar(35);
        novoMotoObj.frear();







    }
}
