/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unirn.progress;

import java.util.TimerTask;
import javax.swing.JProgressBar;

/**
 *
 * @author romulofc
 */
public class IncrementaContador extends TimerTask{

    private JProgressBar pbar;
    
    public IncrementaContador(JProgressBar pbar){
        this.pbar = pbar;
    }
    
    @Override
    public void run() {
        pbar.setValue(pbar.getValue()+1);
    }
    
}
