/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unirn.exemploInterface.hd;

/**
 *
 * @author romulofc
 */
public class HDSSD implements HD{

    @Override
    public void escreveDados(String dados) {
        System.out.println("[SSD] Escrevendo: "+dados);
    }

    @Override
    public String lerDados() {
        return "[SSD] Lendo dados...";
    }
    
}
