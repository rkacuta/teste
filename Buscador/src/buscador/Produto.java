/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscador;

/**
 *
 * @author 31604390
 */
public class Produto {
    private int codProd;
    private String nomeProd;
    private double preco;    
    private String desc;

    public Produto(int codProd, String nomeProd, double preco, String desc) {
        this.codProd = codProd;
        this.nomeProd = nomeProd;
        this.preco = preco;
        this.desc = desc;
    }   

    public Produto() {
    }
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getCodProd() {
        return codProd;
    }

    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }
    
}
