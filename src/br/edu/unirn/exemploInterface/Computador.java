/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unirn.exemploInterface;

import br.edu.unirn.exemploInterface.fonte.Fonte;
import br.edu.unirn.exemploInterface.hd.HD;

/**
 *
 * @author romulofc
 */
public class Computador {
    
    private Fonte fonte;
    private HD hd;

    public Computador(Fonte fonte, HD hd) {
        this.fonte = fonte;
        this.hd = hd;
    }
    

    /**
     * @return the fonte
     */
    public Fonte getFonte() {
        return fonte;
    }

    /**
     * @param fonte the fonte to set
     */
    public void setFonte(Fonte fonte) {
        this.fonte = fonte;
    }

    /**
     * @return the hd
     */
    public HD getHd() {
        return hd;
    }

    /**
     * @param hd the hd to set
     */
    public void setHd(HD hd) {
        this.hd = hd;
    }
    
    
}
