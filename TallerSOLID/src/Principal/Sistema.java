/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import Adicionales.Aderezo;
import Adicionales.Crema;
import Adicionales.Frutilla;
import Postres.*;
import Procesos.*;
import Leche.*;
import java.util.ArrayList;
/**
 *
 * @author djurado
 */
public class Sistema {
    public static void main(String [ ] args){
        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        // y cambiar el tipo de leche por Leche Descremada
        // Finalmente mostrar el precio final de cada uno
        LecheEntera leche = new LecheDeslactosada();
        ManejadorDeLeche mnj_leche = new ManejadorDeLeche();
        ManejadorDePrecio mnj_precio = new ManejadorDePrecio();
        
        // Producir Helado
        Helado helado_vainilla = new Helado("Vainilla");
        Crema c=new Crema();
        c.setNombre("crema");
        Helado.anadirAderezo(helado_vainilla, c);
        Frutilla f=new Frutilla();
        f.setNombre("frutilla");
        Helado.anadirAderezo(helado_vainilla, f);
        System.out.println(helado_vainilla);
        mnj_leche.cambiarTipoLeche(leche, helado_vainilla);
        System.out.println(mnj_precio.showPrecioFinal(helado_vainilla));
        
        // Producir Pastel
        Pastel pastel_chocolate = new Pastel("Chocolate");
        Pastel.quitarAderezo(pastel_chocolate, c);
        Pastel.anadirAderezo(pastel_chocolate, f);
        System.out.println(pastel_chocolate);
        mnj_leche.cambiarTipoLeche(leche, pastel_chocolate);
        System.out.println(mnj_precio.showPrecioFinal(pastel_chocolate));
        
        
    }
    
   

}
