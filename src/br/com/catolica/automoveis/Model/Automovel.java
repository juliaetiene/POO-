package br.com.catolica.automoveis.Model;

public abstract class Automovel {
    private String marca;
    private String modelo;
    protected boolean estaLigado;



    public Automovel(String marcaObj, String modeloObj){
        this.marca = marcaObj;
        this.modelo = modeloObj;
        this.estaLigado = false;
    }


    //getters

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    //seters


    public void setEstaLigado(boolean estaLigado) {
        if(estaLigado){
            System.out.println("O motor está ligado");
            this.estaLigado = estaLigado;
        }else {
            System.out.println("O motor está desligado");
            this.estaLigado = estaLigado;
        }

    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

     public void setModelo(String modelo){
        this.modelo = modelo;
     }


    @Override
    public String toString() {
        return String.format("<Modelo = %s, Marca = %s>");
    }
}
