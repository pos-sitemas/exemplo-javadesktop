/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unirn.exemploInterface;

import br.edu.unirn.exemploInterface.fonte.Fonte;
import br.edu.unirn.exemploInterface.fonte.FonteAT;
import br.edu.unirn.exemploInterface.fonte.FonteATX;
import br.edu.unirn.exemploInterface.fonte.FonteReal;
import br.edu.unirn.exemploInterface.hd.HD;
import br.edu.unirn.exemploInterface.hd.HDSSD;
import java.util.ArrayList;

/**
 *
 * @author romulofc
 */
public class VamosLigarTudo {
    public static void main(String[] args){
        Fonte fonte1 = new FonteATX();
        HD hd1 = new HDSSD();
       
        Computador c1 = new Computador(fonte1, hd1);
        c1.getFonte().ligar();
        c1.getHd().escreveDados("Hello Wold");
        System.out.println(c1.getHd().lerDados());
        c1.getFonte().desligar();
    }
}
