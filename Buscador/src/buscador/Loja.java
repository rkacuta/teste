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
public class Loja {
    private String nomeLoja;
    private int codLoja;

    public Loja(String nomeLoja, int codLoja) {
        this.nomeLoja = nomeLoja;
        this.codLoja = codLoja;
    }

    public Loja() {
    }   
    

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public int getCodLoja() {
        return codLoja;
    }

    public void setCodLoja(int codLoja) {
        this.codLoja = codLoja;
    }
}
