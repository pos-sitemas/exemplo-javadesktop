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
public class FonteATX implements Fonte{

    @Override
    public void ligar() {
        System.out.println("[ATX] Ligando...");
    }

    @Override
    public boolean desligar() {
        System.out.println("[ATX] Desligando...");
        return true;
    }
    
}