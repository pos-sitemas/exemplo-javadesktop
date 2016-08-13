/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unirn.exemploInterface.fonte;

/**
 *
 * @author romulofc
 */
public class FonteReal implements Fonte{

    @Override
    public void ligar() {
        System.out.println("[Real] Ligando...");
    }

    @Override
    public boolean desligar() {
        System.out.println("[Real] Desligando...");
        return true;
    }
    
    public String marca(){
        return "Marca X";
    }
    
}
