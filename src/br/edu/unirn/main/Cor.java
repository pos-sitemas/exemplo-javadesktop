/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unirn.main;

import java.awt.Color;

/**
 *
 * @author romulofc
 */
public class Cor {
    
    private String nome;
    private Color corComponente;

    public Cor(String nome, Color corComponente) {
        this.nome = nome;
        this.corComponente = corComponente;
    }
    
    public Color getCorComponente() {
        return corComponente;
    }

    public String getNome() {
        return nome;
    }

    public void setCorComponente(Color corComponente) {
        this.corComponente = corComponente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String toString(){
        return this.nome;
    }
    
    
}
