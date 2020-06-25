/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leche;

import Postres.Pastel;
import Postres.Postre;

/**
 *
 * @author Pedro Mendoza
 */
public class LecheDeslactosada extends LecheEntera {

    @Override
    public void usar(Postre postre) {
        if(postre.getClass()==Pastel.class){
            System.out.println("En los pasteles no se puede utilizar la leche deslactosada porque se daña la mezcla");
            System.out.println("Usando leche entera");
        }
        else{
            System.out.println("Usando leche deslactosada");
        }
       
    }
    
    
        
}
